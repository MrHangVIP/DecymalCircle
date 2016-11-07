package com.szh.decymalcircle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by moram on 2016/11/7.
 */
public class DycmalCircleView extends ImageView{

    /**
     * 前面颜色
     */
    private int frontColor;

    /**
     * 后面颜色
     */
    private int backColor;

    private Paint mPaint=new Paint();

    /**
     * 当前是前面还是后面
     */
    private boolean isback=false;

    /**
     * 变化率 0到100
     */
    private int changeRate=2;

    /** 默认的控件的宽度*/
    private int defaultWidth=0;
    private int defaultHeight=0;

    /**
     * 变化的x的长度
     */
    private int x=0;

    /**
     * 增加还是减少标志位
     */
    private boolean add=true;

    public DycmalCircleView(Context context) {
        super(context);
    }

    public DycmalCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomAttributes(context,attrs);
    }

    public DycmalCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setCustomAttributes(context,attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {

        if (defaultWidth == 0) {
            //获取控件的宽度
            defaultWidth = getWidth();

        }
        if (defaultHeight == 0) {
            //获取控件的高度 可用作计算半径
            defaultHeight = getHeight();
        }
        int radius = 0;
        //取最小为半径
        radius = (defaultWidth < defaultHeight ? defaultWidth
                : defaultHeight) / 2;

//        canvas.drawRect(60, 90, 160, 100, new Paint());// 长方形

        //椭圆所在矩形 Y坐标固定，X左边变化
        RectF rectF = new RectF(x, 0, 2*radius - x, 2*radius);
        mPaint.setStyle(Paint.Style.FILL);//填充
        canvas.drawOval(rectF, mPaint);// 椭圆
        if (add && x <= radius) {// X变大即椭圆变小
            x = x + changeRate*radius/100;
        } else if (x > 0) {// X变小即椭圆变大
            if(!isback&& add){ //刚开始变大 则变换颜色并且通过标记位判断颜色
                isback=true;
                mPaint.setColor(backColor);
            }else if(isback && add){
                isback=false;
                mPaint.setColor(frontColor);
            }
            x = x -  changeRate*radius/100;
            add = false;
        } else {
            add = true;
        }
        invalidate();//重新绘制
        super.onDraw(canvas);

    }


    private void setCustomAttributes(Context context,AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.dycmalCircle);
        changeRate = a.getInt(
                R.styleable.dycmalCircle_changerate, 2);
        frontColor = a
                .getColor(R.styleable.dycmalCircle_frontcolor,
                        0);
        backColor = a.getColor(
                R.styleable.dycmalCircle_backcolor, 0);
        mPaint.setColor(frontColor);
    }
}
