<!DOCTYPE html>
<!-- saved from url=(0035)http://write.blog.csdn.net/mdeditor -->
<html manifest="cache.manifest" style="overflow: hidden;"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CSDN-markdown编辑器</title>
    <meta name="viewport" content="user-scalable=no, width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="msvalidate.01" content="5E47EE6F67B069C17E3CDD418351A612">   
  
    <script src="./CSDN-markdown编辑器_files/jquery.min.js.下载"></script>
    <script type="text/javascript" src="./CSDN-markdown编辑器_files/check.js.下载"></script>
       
         
    <style type="text/css">
        body {
            margin: 0;
        }

        .csdn-toolbar {
            position: absolute !important;
            top: 0;
            left: 0;
            z-index: 1005;
            width: 100% !important;
            padding: 0 35px !important;
            transition: all .5s;
            box-sizing: border-box;
        }

            .csdn-toolbar .container {
                width: 100% !important;
            }

        #ie8 {
            display: none;
            display: block \9;
            width: 500px;
            padding: 50px 0;
            border: 1px solid #ddd;
            background: #eee;
            text-align: center;
            font-size: 24px;
            margin: 200px 0 0 -250px;
            position: absolute;
            left: 50%;
            z-index: -1;
        }
    </style>
    <script type="text/javascript">

        // Use ?debug to serve original JavaScript files instead of minified
               
            window.baseDir = 'http://static.blog.csdn.net/public/res'

            if (!/(\?|&)debug($|&)/.test(location.search)) {
                window.baseDir += '-min';
            }
            window.require = {
                baseUrl: window.baseDir,
                deps: ['main'],
                urlArgs: 'v=1024'
            };
           document.domain = "csdn.net";
        
        
        //document.domain = "csdn.net";

        //var addPushCheckInterval = setInterval(function () {
        //    var modal = $(".modal-content:visible");
        //    var modaltitle = modal.find(".modal-title");
        //    if (modaltitle != undefined && modal.length > 0 && $(modaltitle).html() == "文章设置") {
        //        $("#csdn-at-blog-checkbox").hide();
        //        $(".modal-footer #csdn-at-blog-checkbox").parent().find("span").hide();
        //        $("#bole_help_bt").hide();
        //        clearInterval(addPushCheckInterval);
        //    }
        //}, 500);
        setTimeout(function () {
            $("#csdnEditor").keyup(function () {
                writedisplay(500);
            });
        }, 500);
        
        writedisplay(3000);
        writedisplay(5000);
        writedisplay(8000);
        function writedisplay(time)
        {
            setTimeout(function () {
                $(".math[role='math']").each(function (index, value) { $(this).find("span").last().css("color", "#f9f9f9"); });
            }, time);
        }

    </script>   
             

    <!--<script src="../public/res-min/require.js"></script>-->
      
    
    
    

    <link href="./CSDN-markdown编辑器_files/index.css" media="screen" rel="stylesheet" type="text/css">
<script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="main" src="./CSDN-markdown编辑器_files/main.js.下载"></script><link rel="stylesheet" type="text/css" href="./CSDN-markdown编辑器_files/style.css"><link type="text/css" rel="stylesheet" href="./CSDN-markdown编辑器_files/default.css"><script type="text/x-mathjax-config;executed=true">MathJax.Hub.Config({
	skipStartupTypeset: true,
    "HTML-CSS": {
        preferredFont: "TeX",
        availableFonts: [
            "STIX",
            "TeX"
        ],
        linebreaks: {
            automatic: true
        },
        EqnChunk: 10,
        imageFont: null
    },
    tex2jax: { inlineMath: [["$","$"],["\\\\(","\\\\)"]], displayMath: [["$$","$$"],["\\[","\\]"]], processEscapes: true },
    TeX: $.extend({
        noUndefined: {
            attributes: {
                mathcolor: "red",
                mathbackground: "#FFEEEE",
                mathsize: "90%"
            }
        },
        Safe: {
            allow: {
                URLs: "safe",
                classes: "safe",
                cssIDs: "safe",
                styles: "safe",
                fontsize: "all"
            }
        }
    }, undefined),
    messageStyle: "none"
});
</script><script type="text/javascript" charset="utf-8" async="" data-requirecontext="_" data-requiremodule="mathjax" src="./CSDN-markdown编辑器_files/MathJax.js.下载"></script><style type="text/css">@media (min-width: 0px) {
#wmd-input {
   font-size: 16px;
}
#preview-contents {
   font-size: 16px;
}
}@media (min-width: 600px) {
#wmd-input {
   font-size: 17px;
}
#preview-contents {
   font-size: 17px;
}
}@media (min-width: 1200px) {
#wmd-input {
   font-size: 18px;
}
#preview-contents {
   font-size: 18px;
}
}</style><style type="text/css">@keyframes working-indicator-bar0 {
    0% { opacity:0.25; }
    0.01% { opacity:0.25; }
    0.02% { opacity:1; }
    50.01% { opacity:0.25; }
    100% { opacity:0.25; }
}@-webkit-keyframes working-indicator-bar0 {
    0% { opacity:0.25; }
    0.01% { opacity:0.25; }
    0.02% { opacity:1; }
    50.01% { opacity:0.25; }
    100% { opacity:0.25; }
}@keyframes working-indicator-bar1 {
    0% { opacity:0.25; }
    20.01% { opacity:0.25; }
    20.02% { opacity:1; }
    70.01% { opacity:0.25; }
    100% { opacity:0.25; }
}@-webkit-keyframes working-indicator-bar1 {
    0% { opacity:0.25; }
    20.01% { opacity:0.25; }
    20.02% { opacity:1; }
    70.01% { opacity:0.25; }
    100% { opacity:0.25; }
}@keyframes working-indicator-bar2 {
    0% { opacity:0.25; }
    40.01% { opacity:0.25; }
    40.02% { opacity:1; }
    90.01% { opacity:0.25; }
    100% { opacity:0.25; }
}@-webkit-keyframes working-indicator-bar2 {
    0% { opacity:0.25; }
    40.01% { opacity:0.25; }
    40.02% { opacity:1; }
    90.01% { opacity:0.25; }
    100% { opacity:0.25; }
}</style><style type="text/css">.MathJax_Hover_Frame {border-radius: .25em; -webkit-border-radius: .25em; -moz-border-radius: .25em; -khtml-border-radius: .25em; box-shadow: 0px 0px 15px #83A; -webkit-box-shadow: 0px 0px 15px #83A; -moz-box-shadow: 0px 0px 15px #83A; -khtml-box-shadow: 0px 0px 15px #83A; border: 1px solid #A6D ! important; display: inline-block; position: absolute}
.MathJax_Hover_Arrow {position: absolute; width: 15px; height: 11px; cursor: pointer}
</style><style type="text/css">#MathJax_About {position: fixed; left: 50%; width: auto; text-align: center; border: 3px outset; padding: 1em 2em; background-color: #DDDDDD; color: black; cursor: default; font-family: message-box; font-size: 120%; font-style: normal; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; z-index: 201; border-radius: 15px; -webkit-border-radius: 15px; -moz-border-radius: 15px; -khtml-border-radius: 15px; box-shadow: 0px 10px 20px #808080; -webkit-box-shadow: 0px 10px 20px #808080; -moz-box-shadow: 0px 10px 20px #808080; -khtml-box-shadow: 0px 10px 20px #808080; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
.MathJax_Menu {position: absolute; background-color: white; color: black; width: auto; padding: 2px; border: 1px solid #CCCCCC; margin: 0; cursor: default; font: menu; text-align: left; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; z-index: 201; box-shadow: 0px 10px 20px #808080; -webkit-box-shadow: 0px 10px 20px #808080; -moz-box-shadow: 0px 10px 20px #808080; -khtml-box-shadow: 0px 10px 20px #808080; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
.MathJax_MenuItem {padding: 2px 2em; background: transparent}
.MathJax_MenuArrow {position: absolute; right: .5em; color: #666666}
.MathJax_MenuActive .MathJax_MenuArrow {color: white}
.MathJax_MenuArrow.RTL {left: .5em; right: auto}
.MathJax_MenuCheck {position: absolute; left: .7em}
.MathJax_MenuCheck.RTL {right: .7em; left: auto}
.MathJax_MenuRadioCheck {position: absolute; left: 1em}
.MathJax_MenuRadioCheck.RTL {right: 1em; left: auto}
.MathJax_MenuLabel {padding: 2px 2em 4px 1.33em; font-style: italic}
.MathJax_MenuRule {border-top: 1px solid #CCCCCC; margin: 4px 1px 0px}
.MathJax_MenuDisabled {color: GrayText}
.MathJax_MenuActive {background-color: Highlight; color: HighlightText}
.MathJax_Menu_Close {position: absolute; width: 31px; height: 31px; top: -15px; left: -15px}
</style><style type="text/css">#MathJax_Zoom {position: absolute; background-color: #F0F0F0; overflow: auto; display: block; z-index: 301; padding: .5em; border: 1px solid black; margin: 0; font-weight: normal; font-style: normal; text-align: left; text-indent: 0; text-transform: none; line-height: normal; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; box-shadow: 5px 5px 15px #AAAAAA; -webkit-box-shadow: 5px 5px 15px #AAAAAA; -moz-box-shadow: 5px 5px 15px #AAAAAA; -khtml-box-shadow: 5px 5px 15px #AAAAAA; filter: progid:DXImageTransform.Microsoft.dropshadow(OffX=2, OffY=2, Color='gray', Positive='true')}
#MathJax_ZoomOverlay {position: absolute; left: 0; top: 0; z-index: 300; display: inline-block; width: 100%; height: 100%; border: 0; padding: 0; margin: 0; background-color: white; opacity: 0; filter: alpha(opacity=0)}
#MathJax_ZoomFrame {position: relative; display: inline-block; height: 0; width: 0}
#MathJax_ZoomEventTrap {position: absolute; left: 0; top: 0; z-index: 302; display: inline-block; border: 0; padding: 0; margin: 0; background-color: white; opacity: 0; filter: alpha(opacity=0)}
</style><style type="text/css">.MathJax_Preview {color: #888}
#MathJax_Message {position: fixed; left: 1em; bottom: 1.5em; background-color: #E6E6E6; border: 1px solid #959595; margin: 0px; padding: 2px 8px; z-index: 102; color: black; font-size: 80%; width: auto; white-space: nowrap}
#MathJax_MSIE_Frame {position: absolute; top: 0; left: 0; width: 0px; z-index: 101; border: 0px; margin: 0px; padding: 0px}
.MathJax_Error {color: #CC0000; font-style: italic}
</style></head>

<body class=""><div id="MathJax_Message" style="display: none;"></div>    
    <script type="text/javascript">      
        var ua = window.navigator.userAgent;
        if (ua.indexOf("MSIE") >= 1) {
            {
                location.replace("/mdeditor/tip");
            }
        }
    </script>

        <script src="./CSDN-markdown编辑器_files/require.js.下载"></script>

    <script fixed="true" id="toolbar-tpl-scriptId" prod="blog" skin="black" src="./CSDN-markdown编辑器_files/html.js.下载" type="text/javascript"></script><div class="csdn-toolbar csdn-toolbar-skin-black ">        <div class="container row center-block ">          <div class="col-md-3 pull-left logo clearfix"><a href="http://www.csdn.net/?ref=toolbar" title="CSDN首页" target="_blank" class="icon"></a><a title="频道首页" href="http://write.blog.csdn.net/?ref=toolbar_logo" class="img blog-icon"></a></div>          <div class="pull-right login-wrap ">            <ul class="btns">              <li class="loginlink"><a href="https://passport.csdn.net/account/login?ref=toolbar" target="_top">登录&nbsp;</a>|<a target="_top" href="http://passport.csdn.net/account/mobileregister?ref=toolbar&amp;action=mobileRegister">&nbsp;注册</a></li>              <li class="search">                <div class="icon on-search-icon">                  <div class="wrap">                    <div class="curr-icon-wrap">                      <div class="curr-icon"></div>                    </div>                    <form action="http://so.csdn.net/search" method="get" target="_blank">                      <input type="hidden" value="toolbar" name="ref" accesskey="2">                      <div class="border">                        <input placeholder="搜索" type="text" value="" name="q" accesskey="2"><span class="icon-enter-sm"></span>                      </div>                    </form>                  </div>                </div>              </li>              <li class="favor">                <div class="icon on-favor-icon">                  <div class="wrap">                    <div class="curr-icon-wrap">                      <div class="curr-icon"></div>                    </div>                    <div style="display:none;" class="favor-success"><span class="msg">收藏成功</span>                      <div class="btns"><span class="btn btn-primary ok">确定</span></div>                    </div>                    <div style="display:none;" class="favor-failed"><span class="icon-danger-lg"></span><span class="msg">收藏失败，请重新收藏</span>                      <div class="btns"><span class="btn btn-primary ok">确定</span></div>                    </div>                    <form role="form" class="form-horizontal favor-form">                      <div class="form-group">                        <div class="clearfix">                          <label for="input-title" class="col-sm-2 control-label">标题</label>                          <div class="col-sm-10">                            <input id="inputTitle" type="text" placeholder="" class="title form-control">                          </div>                        </div>                        <div class="alert alert-danger"><strong></strong>标题不能为空</div>                      </div>                      <div class="form-group">                        <label for="input-url" class="col-sm-2 control-label">网址</label>                        <div class="col-sm-10">                          <input id="input-url" type="text" placeholder="" class="url form-control">                        </div>                      </div>                      <div class="form-group">                        <label for="input-tag" class="col-sm-2 tag control-label">标签</label>                        <div class="col-sm-10">                          <input id="input-tag" type="text" class="form-control tag">                        </div>                      </div>                      <div class="form-group">                        <label for="input-description" class="description col-sm-2 control-label">摘要</label>                        <div class="col-sm-10">                          <textarea id="input-description" class="form-control description"></textarea>                        </div>                      </div>                      <div class="form-group">                        <div class="col-sm-offset-2 col-sm-10 ft">                          <div class="col-sm-4 pull-left">                            <div class="checkbox">                              <label>                                <input type="checkbox" name="share" checked="checked" class="share">公开                              </label>                            </div>                          </div>                          <div class="col-sm-8 pull-right favor-btns">                            <button type="button" class="cancel btn btn-default">取消</button>                            <button type="submit" class="submit btn btn-primary">收藏</button>                          </div>                        </div>                      </div>                    </form>                  </div>                </div>              </li>              <li class="notify">                <div style="display:none" class="number"></div>                <div style="display:none" class="icon-hasnotes-sm"></div>                <div id="header_notice_num"></div>                <div class="icon on-notify-icon">                  <div class="wrap">                    <div class="curr-icon-wrap">                      <div class="curr-icon"></div>                    </div>                    <div id="note1" class="csdn_note">                      <div class="box"></div>                    </div>                  </div>                </div>              </li>              <li class="ugc">                <div class="icon on-ugc-icon">                  <div class="wrap clearfix">                    <div class="curr-icon-wrap">                      <div class="curr-icon"></div>                    </div>                    <dl>                      <dt><a href="http://geek.csdn.net/news/expert?ref=toolbar" target="_blank" class="p-news clearfix" style="display:none;"><em class="icon"></em><span>分享资讯</span></a></dt>                      <dt style="border: none;"><a href="http://u.download.csdn.net/upload?ref=toolbar" target="_blank" class="p-doc clearfix"><em class="icon"></em><span>传PPT/文档</span></a></dt>                      <dt><a href="http://bbs.csdn.net/topics/new?ref=toolbar" target="_blank" class="p-ask clearfix"><em class="icon"></em><span>提问题</span></a></dt>                      <dt><a href="http://write.blog.csdn.net/postedit?ref=toolbar" target="_blank" class="p-blog clearfix"><em class="icon"></em><span>写博客</span></a></dt>                      <dt><a href="http://u.download.csdn.net/upload?ref=toolbar" target="_blank" class="p-src clearfix"><em class="icon"></em><span>传资源</span></a></dt>                      <dt><a href="https://code.csdn.net/projects/new?ref=toolbar" target="_blank" class="c-obj clearfix"><em class="icon"></em><span>创建项目</span></a></dt>                      <dt><a href="https://code.csdn.net/snippets/new?ref=toolbar" target="_blank" class="c-code clearfix"><em class="icon"></em><span>创建代码片</span></a></dt>                    </dl>                  </div>                </div>              </li>              <li class="profile">                <div class="icon on-profile-icon"><img src="./CSDN-markdown编辑器_files/2_qq_35522272.jpg" class="curr-icon-img">                  <div class="wrap clearfix">                    <div class="curr-icon-wrap">                      <div class="curr-icon"></div>                    </div>                    <div class="bd">                      <dl class="clearfix">                        <dt class="pull-left img"><a target="_blank" href="http://my.csdn.net/?ref=toolbar" class="avatar"><img src="./CSDN-markdown编辑器_files/2_qq_35522272.jpg"></a></dt>                        <dd class="info" style="border: none;"><a target="_blank" href="http://my.csdn.net/?ref=toolbar" class="nickname">向大牛前行</a><span class="dec">作为程序猿的我，有着一颗迈向大牛的心。祝愿大家都能成功！翱翔在知识的海洋！</span></dd>                      </dl>                    </div>                    <div class="ft clearfix"><a target="_blank" href="http://my.csdn.net/my/account/changepwd?ref=toolbar" class="pull-left"><span class="icon-cog"></span>帐号设置</a><a href="https://passport.csdn.net/account/logout?ref=toolbar" target="_top" class="pull-left" style="margin-left:132px; width:18px; height:27px; white-space:nowrap; overflow:hidden;"><span class="icon-signout"></span><span class="out">退出</span></a></div>                  </div>                </div>              </li>              <li class="apps">                <div id="chasnew123" class="hasnew" style="display: none;"></div>                <div id="cappsarea123" class="icon on-apps-icon">                  <div class="wrap clearfix">                    <div class="curr-icon-wrap">                      <div class="curr-icon"></div>                    </div>                  <div class="detail">                    <dl>                      <dt>                        <h5>社区</h5>                      </dt>                      <dd> <a href="http://blog.csdn.net/?ref=toolbar" target="_blank">博客</a></dd>                      <dd> <a href="http://bbs.csdn.net/?ref=toolbar" target="_blank">论坛</a></dd>                      <dd> <a href="http://download.csdn.net/?ref=toolbar" target="_blank">下载</a></dd>                      <dd> <a href="http://lib.csdn.net/?ref=toolbar" target="_blank">知识库</a></dd>                      <dd><a href="http://ask.csdn.net/?ref=toolbar" target="_blank">技术问答</a></dd>                      <dd><a href="http://geek.csdn.net/?ref=toolbar" target="_blank">极客头条</a></dd>                      <dd style="display:none"> <a href="http://hero.csdn.net/?ref=toolbar" target="_blank">英雄会</a></dd>                    </dl>                  </div>                  <div class="detail">                    <dl>                      <dt>                        <h5>服务</h5>                      </dt>                      <dd style="display:none"> <a href="http://job.csdn.net/?ref=toolbar" target="_blank">JOB<img src="./CSDN-markdown编辑器_files/new.gif" style="display: none; margin-top: -26px; width: 23px;"></a></dd>                      <dd> <a href="http://edu.csdn.net/?ref=toolbar" target="_blank">学院<img src="./CSDN-markdown编辑器_files/new.gif" style="display: none; margin-top: -26px; width: 23px;"></a></dd>                      <dd> <a href="https://code.csdn.net/?ref=toolbar" target="_blank">CODE</a></dd>                      <dd> <a href="http://huiyi.csdn.net/?ref=toolbar" target="_blank">活动</a></dd>                      <dd> <a href="http://www.csto.com/?ref=toolbar" target="_blank">CSTO</a></dd>                      <dd> <a href="http://mall.csdn.net/?ref=toolbar" target="_blank">C币兑换<img src="./CSDN-markdown编辑器_files/new.gif" style="display: none; margin-top: -26px; width: 23px;"></a></dd>                    </dl>                  </div>                  <div class="detail last">                    <dl>                      <dt>                        <h5>俱乐部</h5>                      </dt>                      <dd> <a href="http://cto.csdn.net/?ref=toolbar" target="_blank">CTO俱乐部</a></dd>                      <dd> <a href="http://student.csdn.net/?ref=toolbar" target="_blank">高校俱乐部</a></dd>                    </dl>                  </div>                </div>              </div>            </li>            </ul>          </div>        </div>    </div>    

    <div class="working-indicator"><div class="hide"><div class="bar" style="animation: working-indicator-bar0 0.7s linear infinite;"></div><div class="bar" style="animation: working-indicator-bar1 0.7s linear infinite;"></div><div class="bar" style="animation: working-indicator-bar2 0.7s linear infinite;"></div></div></div>
    <div id="csdnEditor" class=" ltr" style="position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; overflow: hidden;"><div class="layout-wrapper-l1" style="transform: translate(0px, 0px); width: 2400px; height: 1182px;">
	<div class="layout-wrapper-l2" style="left: 0px; width: 2400px; height: 1182px;">
		<div class="navbar navbar-default">
			<div class="navbar-inner">
				<div class="buttons-dropdown dropdown hide">
					<div class="nav">
						<button class="btn btn-success" data-toggle="dropdown" title="" data-original-title="Show buttons">
							<i class="icon-th-large"></i>
						</button>
						<div class="dropdown-menu">
						</div>
					</div>
				</div>
				
				
				<a class="btn btn-danger btn-lg btn-blog-publish" data-original-title="" title="">发表博客</a>
				<!--<a class="btn btn-danger btn-lg btn-blog-publish" data-original-title="" title="">发表博客

           <span class="send_bt_arrow" style="	border-top: 6px solid #fff;
 border-left: 6px solid transparent;
 border-right: 6px solid transparent;
 border-bottom: 0;
 vertical-align: -17px;
 margin-left: 0px;"></span>
					<ul class="send_bt_list" style="width: 120px;height: 78px;position: absolute;left: 0; bottom: -80px;padding: 0;margin: 0;background: #fff;color: #333333;
 font-size: 14px;
 font-weight: normal;z-index: 9999;list-style: none;display: none;">
						<li class="send_bt_list_first" style="cursor: pointer;height: 35px;line-height: 50px;">普通发表</li>
						<li class="send_bt_list_second" style="cursor: pointer;;height: 35px;line-height: 35px;">
							发表并@博乐
						</li>
					</ul>


				</a>-->
				<script>
					//				alert(1);
					//					$(".btn-blog-publish").hover(
					//
					//						function () {
					//							$(this).find("send_bt_list")[0].style.display="block";
					//						},
					//						function () {
					//							$(this).find("send_bt_list")[0].style.display="none";
					//						}
					//					);

				</script>
				
				
				<ul class="nav pull-right right-buttons">
					<li class="offline-status hide">
						<div class="text-danger">
							<i class="icon-attention-circled"></i>离线
						</div>
					</li>
					<li class="extension-buttons" style="display:none"><div class="btn-group"><a class="btn btn-success button-publish" title="" data-original-title="Update document publication"><i class="icon-upload"></i></a></div></li>
					<li>
						<a class="btn btn-success" href="javascript:void(0);" style="display:none" id="csdn-lock-editor-button" title="" data-original-title="锁定MarkDown编辑器">
							<i class="icon-lock-open"></i>
						</a>
					</li>
					<li>
						<div class="dropdown">
                            <span class="btn btn-success" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" data-original-title="" title="">
                                博客管理
                                <i class="icon-arrow-down"></i>
                            </span>
							<ul class="dropdown-menu pull-right" role="menu">
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/postedit?type=edit">切换到HTML编辑器</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/postlist">文章管理</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/category">类别管理</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/feedback">评论管理</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/configure">博客配置</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/configure/column">博客栏目</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/postlist/0/all/draft">草稿箱</a>
								</li>
								<li>
									<a target="_blank" href="http://write.blog.csdn.net/postlist/0/all/deleted">回收站</a>
								</li>                               
							</ul>
						</div>
					</li>
				</ul>
				<ul class="nav left-buttons">
					<li class="wmd-button-group1 btn-group"><li class="wmd-button btn btn-success" id="wmd-bold-button" title="" style="left: 0px;" data-original-title="加粗 &lt;strong&gt; Ctrl/Cmd+B"><span style="background-position: 0px 0px; display: none;"></span><i class="icon-bold"></i></li><li class="wmd-button btn btn-success" id="wmd-italic-button" title="" style="left: 0px;" data-original-title="斜体 &lt;em&gt; Ctrl/Cmd+I"><span style="background-position: -20px 0px; display: none;"></span><i class="icon-italic"></i></li><li class="wmd-button btn btn-success" id="wmd-link-button" title="" style="left: 0px;" data-original-title="Hyperlink &lt;a&gt; Ctrl/Cmd+L"><span style="background-position: -40px 0px; display: none;"></span><i class="icon-link"></i></li><li class="wmd-button btn btn-success" id="wmd-quote-button" title="" style="left: 0px;" data-original-title="引用 &lt;blockquote&gt; Ctrl/Cmd+Q"><span style="background-position: -60px 0px; display: none;"></span><i class="icon-quote"></i></li><li class="wmd-button btn btn-success" id="wmd-code-button" title="" style="left: 0px;" data-original-title="代码片 &lt;pre&gt;&lt;code&gt; Ctrl/Cmd+K"><span style="background-position: -80px 0px; display: none;"></span><i class="icon-code"></i></li><li class="wmd-button btn btn-success" id="wmd-image-button" title="" style="left: 0px;" data-original-title="图片 &lt;img&gt; Ctrl/Cmd+G"><span style="background-position: -100px 0px; display: none;"></span><i class="icon-picture"></i></li><li class="wmd-button btn btn-success" id="wmd-olist-button" title="" style="left: 0px;" data-original-title="有序列表 &lt;ol&gt; Ctrl/Cmd+O"><span style="background-position: -120px 0px; display: none;"></span><i class="icon-list-ordered"></i></li><li class="wmd-button btn btn-success" id="wmd-ulist-button" title="" style="left: 0px;" data-original-title="无序列表 &lt;ul&gt; Ctrl/Cmd+U"><span style="background-position: -140px 0px; display: none;"></span><i class="icon-list-unordered"></i></li><li class="wmd-button btn btn-success" id="wmd-heading-button" title="" style="left: 0px;" data-original-title="标题 &lt;h1&gt;/&lt;h2&gt; Ctrl/Cmd+H"><span style="background-position: -160px 0px; display: none;"></span><i class="icon-heading"></i></li><li class="wmd-button btn btn-success" id="wmd-hr-button" title="" style="left: 0px;" data-original-title="横线 &lt;hr&gt; Ctrl/Cmd+R"><span style="background-position: -180px 0px; display: none;"></span><i class="icon-line"></i></li><li class="wmd-button btn btn-success" id="wmd-undo-button" title="" style="left: 0px;" data-original-title="撤销 - Ctrl/Cmd+Z"><span style="background-position: -200px 0px; display: none;"></span><i class="icon-undo"></i></li><li class="wmd-button btn btn-success disabled" id="wmd-redo-button" title="" style="left: 0px;" data-original-title="重做 - Ctrl/Cmd+Y"><span style="background-position: -220px -20px; display: none;"></span><i class="icon-redo"></i></li></li>
				</ul><ul class="nav left-buttons">
					<li class="wmd-button-group2 btn-group">
						<a class="btn btn-success btn-blog-new" title="" data-original-title="写新文章"><i class="icon-pencil"></i></a>
						<a class="btn btn-success btn-blog-save changed" title="" data-original-title="保存到线上草稿箱"><i class="icon-disk"></i></a>
						<a class="btn btn-success btn-blog-abstract" title="" data-original-title="生成摘要"><i class="icon-abstract"></i></a>
						<a class="btn btn-success btn-blog-setting" title="" data-original-title="文章设置"><i class="icon-doc-setting"></i></a>
					</li>
				</ul><ul class="nav left-buttons">
					<li class="wmd-button-group3 btn-group">
						<a data-toggle="modal" data-target=".modal-import-url" class="btn btn-success btn-import-online" title="" data-original-title="从线上导入">
							<i class="icon-earth"></i>
						</a>
						<a data-toggle="modal" data-target=".modal-import-harddrive-markdown" class="btn btn-success btn-import" title="" data-original-title="从本机导入">
							<i class="icon-hdd"></i>
						</a>
						<a data-toggle="modal" data-target=".modal-export-doc" class="btn btn-success btn-export" title="" data-original-title="导出到本地">
							<i class="icon-upload"></i>
						</a>
					</li>
				</ul><ul class="nav left-buttons">
					<li class="wmd-button-group5 btn-group">
						<a class="btn btn-success btn-modal-helps" title="" data-original-title="Markdown语法帮助">
							<i class="icon-help"></i>
						</a>
					</li>
				</ul><ul class="nav pull-right title-container">
					<li><a class="btn btn-success file-title-navbar" title="" data-placement="bottom" style="width: 2160px;" data-original-title="点击修改标题">3D 圆形旋转动态实现</a></li>
					<li>
						<div class="input-file-title-container"><input type="text" maxlength="100" class="col-sm-4 form-control input-file-title hide" placeholder="文章标题" style="width: 2160px;"></div>
					</li>
				</ul>
			</div>
		</div>
		<div class="layout-wrapper-l3" style="top: 170px; width: 2400px; height: 1012px;">
			<pre id="wmd-input" class="form-control font-rich" style="width: 1184px; height: 1012px;"><div class="editor-content" contenteditable="true" style="padding-left: 142px; padding-right: 142px; padding-bottom: 952px;"><span id="wmd-input-section-1298" class="wmd-input-section"><span class="token p">最近挺闲的。对于android的画图机制想了深入了解。发现java的2维画图机制其实也挺强大的。能做出很多我们很炫的效果。此篇文章就讲述了通过cavans 的api 实现三维效果的动态旋转图。</span><span class="token lf">
</span><span class="token lf">
</span><span class="token p">先上效果图：</span><span class="token lf">
</span><span class="token p"><span class="token img"><span class="token md md-bang">!</span><span class="token md md-bracket-start">[</span><span class="token md md-alt">这里写图片描述</span><span class="token md md-bracket-end">]</span><span class="token md img-parens"><span class="token md md-paren-start">(</span><span class="token md md-src">http://img.blog.csdn.net/20161107154842753</span><span class="token md md-paren-end">)</span></span></span></span><span class="token lf">
</span><span class="token lf">
</span><span class="token p">android中自带的roate旋转使用的是平面旋转。这里我们想要实现立体的旋转圆形。此间我们需要的核心只是就是：</span><span class="token lf">
</span><span class="token p">1.画矩形的内切椭圆 2.动态改变矩形半径，并且连续画椭圆。达到圆形旋转的效果 3.判断状态实现圆形旋转前面和背面颜色的切换。</span><span class="token lf">
</span><span class="token lf">
</span><span class="token p">第一步自定义imageview 重写ondraw方法：注释很详细不写了</span><span class="token lf">
</span><span class="token lf">
</span></span><span id="wmd-input-section-1435" class="wmd-input-section"><span class="token pre gfm"><span class="token md md-pre">```</span><span class="token lf">
</span>import android.content.Context;<span class="token lf">
</span>import android.content.res.TypedArray;<span class="token lf">
</span>import android.graphics.Canvas;<span class="token lf">
</span>import android.graphics.Paint;<span class="token lf">
</span>import android.graphics.RectF;<span class="token lf">
</span>import android.util.AttributeSet;<span class="token lf">
</span>import android.widget.ImageView;<span class="token lf">
</span><span class="token lf">
</span>/**<span class="token lf">
</span> * Created by moram on 2016/11/7.<span class="token lf">
</span> */<span class="token lf">
</span>public class DycmalCircleView extends ImageView{<span class="token lf">
</span><span class="token lf">
</span>    /**<span class="token lf">
</span>     * 前面颜色<span class="token lf">
</span>     */<span class="token lf">
</span>    private int frontColor;<span class="token lf">
</span><span class="token lf">
</span>    /**<span class="token lf">
</span>     * 后面颜色<span class="token lf">
</span>     */<span class="token lf">
</span>    private int backColor;<span class="token lf">
</span><span class="token lf">
</span>    private Paint mPaint=new Paint();<span class="token lf">
</span><span class="token lf">
</span>    /**<span class="token lf">
</span>     * 当前是前面还是后面<span class="token lf">
</span>     */<span class="token lf">
</span>    private boolean isback=false;<span class="token lf">
</span><span class="token lf">
</span>    /**<span class="token lf">
</span>     * 变化率 0到100<span class="token lf">
</span>     */<span class="token lf">
</span>    private int changeRate=2;<span class="token lf">
</span><span class="token lf">
</span>    /** 默认的控件的宽度*/<span class="token lf">
</span>    private int defaultWidth=0;<span class="token lf">
</span>    private int defaultHeight=0;<span class="token lf">
</span><span class="token lf">
</span>    /**<span class="token lf">
</span>     * 变化的x的长度<span class="token lf">
</span>     */<span class="token lf">
</span>    private int x=0;<span class="token lf">
</span><span class="token lf">
</span>    /**<span class="token lf">
</span>     * 增加还是减少标志位<span class="token lf">
</span>     */<span class="token lf">
</span>    private boolean add=true;<span class="token lf">
</span><span class="token lf">
</span>    public DycmalCircleView(Context context) {<span class="token lf">
</span>        super(context);<span class="token lf">
</span>    }<span class="token lf">
</span><span class="token lf">
</span>    public DycmalCircleView(Context context, AttributeSet attrs) {<span class="token lf">
</span>        super(context, attrs);<span class="token lf">
</span>        setCustomAttributes(context,attrs);<span class="token lf">
</span>    }<span class="token lf">
</span><span class="token lf">
</span>    public DycmalCircleView(Context context, AttributeSet attrs, int defStyleAttr) {<span class="token lf">
</span>        super(context, attrs, defStyleAttr);<span class="token lf">
</span>        setCustomAttributes(context,attrs);<span class="token lf">
</span>    }<span class="token lf">
</span><span class="token lf">
</span><span class="token lf">
</span>    @Override<span class="token lf">
</span>    protected void onDraw(Canvas canvas) {<span class="token lf">
</span><span class="token lf">
</span>        if (defaultWidth == 0) {<span class="token lf">
</span>            //获取控件的宽度<span class="token lf">
</span>            defaultWidth = getWidth();<span class="token lf">
</span><span class="token lf">
</span>        }<span class="token lf">
</span>        if (defaultHeight == 0) {<span class="token lf">
</span>            //获取控件的高度 可用作计算半径<span class="token lf">
</span>            defaultHeight = getHeight();<span class="token lf">
</span>        }<span class="token lf">
</span>        int radius = 0;<span class="token lf">
</span>        //取最小为半径<span class="token lf">
</span>        radius = (defaultWidth &lt; defaultHeight ? defaultWidth<span class="token lf">
</span>                : defaultHeight) / 2;<span class="token lf">
</span><span class="token lf">
</span>//        canvas.drawRect(60, 90, 160, 100, new Paint());// 长方形<span class="token lf">
</span><span class="token lf">
</span>        //椭圆所在矩形 Y坐标固定，X左边变化<span class="token lf">
</span>        RectF rectF = new RectF(x, 0, 2*radius - x, 2*radius);<span class="token lf">
</span>        mPaint.setStyle(Paint.Style.FILL);//填充<span class="token lf">
</span>        canvas.drawOval(rectF, mPaint);// 椭圆<span class="token lf">
</span>        if (add &amp;&amp; x &lt;= radius) {// X变大即椭圆变小<span class="token lf">
</span>            x = x + changeRate*radius/100;<span class="token lf">
</span>        } else if (x &gt; 0) {// X变小即椭圆变大<span class="token lf">
</span>            if(!isback&amp;&amp; add){ //刚开始变大 则变换颜色并且通过标记位判断颜色<span class="token lf">
</span>                isback=true;<span class="token lf">
</span>                mPaint.setColor(backColor);<span class="token lf">
</span>            }else if(isback &amp;&amp; add){<span class="token lf">
</span>                isback=false;<span class="token lf">
</span>                mPaint.setColor(frontColor);<span class="token lf">
</span>            }<span class="token lf">
</span>            x = x -  changeRate*radius/100;<span class="token lf">
</span>            add = false;<span class="token lf">
</span>        } else {<span class="token lf">
</span>            add = true;<span class="token lf">
</span>        }<span class="token lf">
</span>        invalidate();//重新绘制<span class="token lf">
</span>        super.onDraw(canvas);<span class="token lf">
</span><span class="token lf">
</span>    }<span class="token lf">
</span><span class="token lf">
</span><span class="token lf">
</span>    private void setCustomAttributes(Context context,AttributeSet attrs) {<span class="token lf">
</span>        TypedArray a = context.obtainStyledAttributes(attrs,<span class="token lf">
</span>                R.styleable.dycmalCircle);<span class="token lf">
</span>        changeRate = a.getInt(<span class="token lf">
</span>                R.styleable.dycmalCircle_changerate, 2);<span class="token lf">
</span>        frontColor = a<span class="token lf">
</span>                .getColor(R.styleable.dycmalCircle_frontcolor,<span class="token lf">
</span>                        0);<span class="token lf">
</span>        backColor = a.getColor(<span class="token lf">
</span>                R.styleable.dycmalCircle_backcolor, 0);<span class="token lf">
</span>        mPaint.setColor(frontColor);<span class="token lf">
</span>    }<span class="token lf">
</span>}<span class="token lf">
</span><span class="token lf">
</span><span class="token md md-pre">```</span></span><span class="token lf">
</span><span class="token p">接下来自定义的style文件：写在attrs中：</span><span class="token lf">
</span><span class="token lf">
</span></span><span id="wmd-input-section-1865" class="wmd-input-section"><span class="token pre gfm"><span class="token md md-pre">```</span><span class="token lf">
</span>&lt;?xml version="1.0" encoding="utf-8"?&gt;<span class="token lf">
</span>&lt;resources&gt;<span class="token lf">
</span><span class="token lf">
</span>	&lt;declare-styleable name="dycmalCircle"&gt;<span class="token lf">
</span><span class="token lf">
</span>		&lt;attr name="changerate" format="integer"/&gt;<span class="token lf">
</span>		&lt;attr name="frontcolor" format="color"/&gt;<span class="token lf">
</span>		&lt;attr name="backcolor" format="color"/&gt;<span class="token lf">
</span><span class="token lf">
</span>	&lt;/declare-styleable&gt;<span class="token lf">
</span>    <span class="token lf">
</span>&lt;/resources&gt;<span class="token lf">
</span><span class="token lf">
</span><span class="token md md-pre">```</span></span><span class="token lf">
</span><span class="token p">接下来在布局中使用就行了：</span><span class="token lf">
</span><span class="token lf">
</span></span><span id="wmd-input-section-1978" class="wmd-input-section"><span class="token pre gfm"><span class="token md md-pre">```</span><span class="token lf">
</span>&lt;com.szh.decymalcircle.DycmalCircleView<span class="token lf">
</span>        android:layout_width="200dp"<span class="token lf">
</span>        android:layout_height="200dp"<span class="token lf">
</span>        dycmalCircle:changerate="2"<span class="token lf">
</span>        dycmalCircle:frontcolor="#00a"<span class="token lf">
</span>        dycmalCircle:backcolor="#0f0"/&gt;<span class="token lf">
</span>不要忘了加上 xmlns:dycmalCircle="http://schemas.android.com/apk/res-auto"<span class="token lf">
</span><span class="token md md-pre">```</span></span><span class="token lf">
</span><span class="token lf">
</span><span class="token lf">
</span></span><span class="token lf">
</span></div><div class="editor-margin" style="width: 142px;"></div></pre>
			<div class="preview-panel" style="transform: translate(1184px, 0px); width: 1216px; height: 1012px;">
				<div class="layout-resizer layout-resizer-preview open" style="-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); touch-action: pan-y; height: 1012px;"></div>
				<div class="layout-toggler layout-toggler-navbar btn btn-info open" title="头部收起/展开" style="height: 60px;"><i class="icon-th"></i>
				</div>
				<div class="layout-toggler layout-toggler-preview btn btn-info open" title="预览区显示/隐藏（可拖拽）" style="transform: translate(0px, 476px); height: 60px;"><i class="icon-none"></i></div>
				<div class="preview-container" style="left: 32px; width: 1184px; height: 1012px;">
					<div id="preview-contents" style="padding-left: 142px; padding-right: 142px; padding-bottom: 952px;">
						<div id="wmd-preview" class="preview-content"></div>
					<div id="wmd-preview-section-1296" class="wmd-preview-section preview-content">

<p>最近挺闲的。对于android的画图机制想了深入了解。发现java的2维画图机制其实也挺强大的。能做出很多我们很炫的效果。此篇文章就讲述了通过cavans 的api 实现三维效果的动态旋转图。</p>

<p>先上效果图： <br>
<img src="./CSDN-markdown编辑器_files/20161107154842753" alt="这里写图片描述" title=""></p>

<p>android中自带的roate旋转使用的是平面旋转。这里我们想要实现立体的旋转圆形。此间我们需要的核心只是就是： <br>
1.画矩形的内切椭圆 2.动态改变矩形半径，并且连续画椭圆。达到圆形旋转的效果 3.判断状态实现圆形旋转前面和背面颜色的切换。</p>

<p>第一步自定义imageview 重写ondraw方法：注释很详细不写了</p></div><div id="wmd-preview-section-1435" class="wmd-preview-section preview-content">

<pre class="prettyprint"><code class=" hljs java"><span class="hljs-keyword">import</span> android.content.Context;
<span class="hljs-keyword">import</span> android.content.res.TypedArray;
<span class="hljs-keyword">import</span> android.graphics.Canvas;
<span class="hljs-keyword">import</span> android.graphics.Paint;
<span class="hljs-keyword">import</span> android.graphics.RectF;
<span class="hljs-keyword">import</span> android.util.AttributeSet;
<span class="hljs-keyword">import</span> android.widget.ImageView;

<span class="hljs-javadoc">/**
 * Created by moram on 2016/11/7.
 */</span>
<span class="hljs-keyword">public</span> <span class="hljs-class"><span class="hljs-keyword">class</span> <span class="hljs-title">DycmalCircleView</span> <span class="hljs-keyword">extends</span> <span class="hljs-title">ImageView</span>{</span>

    <span class="hljs-javadoc">/**
     * 前面颜色
     */</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">int</span> frontColor;

    <span class="hljs-javadoc">/**
     * 后面颜色
     */</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">int</span> backColor;

    <span class="hljs-keyword">private</span> Paint mPaint=<span class="hljs-keyword">new</span> Paint();

    <span class="hljs-javadoc">/**
     * 当前是前面还是后面
     */</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">boolean</span> isback=<span class="hljs-keyword">false</span>;

    <span class="hljs-javadoc">/**
     * 变化率 0到100
     */</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">int</span> changeRate=<span class="hljs-number">2</span>;

    <span class="hljs-javadoc">/** 默认的控件的宽度*/</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">int</span> defaultWidth=<span class="hljs-number">0</span>;
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">int</span> defaultHeight=<span class="hljs-number">0</span>;

    <span class="hljs-javadoc">/**
     * 变化的x的长度
     */</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">int</span> x=<span class="hljs-number">0</span>;

    <span class="hljs-javadoc">/**
     * 增加还是减少标志位
     */</span>
    <span class="hljs-keyword">private</span> <span class="hljs-keyword">boolean</span> add=<span class="hljs-keyword">true</span>;

    <span class="hljs-keyword">public</span> <span class="hljs-title">DycmalCircleView</span>(Context context) {
        <span class="hljs-keyword">super</span>(context);
    }

    <span class="hljs-keyword">public</span> <span class="hljs-title">DycmalCircleView</span>(Context context, AttributeSet attrs) {
        <span class="hljs-keyword">super</span>(context, attrs);
        setCustomAttributes(context,attrs);
    }

    <span class="hljs-keyword">public</span> <span class="hljs-title">DycmalCircleView</span>(Context context, AttributeSet attrs, <span class="hljs-keyword">int</span> defStyleAttr) {
        <span class="hljs-keyword">super</span>(context, attrs, defStyleAttr);
        setCustomAttributes(context,attrs);
    }


    <span class="hljs-annotation">@Override</span>
    <span class="hljs-keyword">protected</span> <span class="hljs-keyword">void</span> <span class="hljs-title">onDraw</span>(Canvas canvas) {

        <span class="hljs-keyword">if</span> (defaultWidth == <span class="hljs-number">0</span>) {
            <span class="hljs-comment">//获取控件的宽度</span>
            defaultWidth = getWidth();

        }
        <span class="hljs-keyword">if</span> (defaultHeight == <span class="hljs-number">0</span>) {
            <span class="hljs-comment">//获取控件的高度 可用作计算半径</span>
            defaultHeight = getHeight();
        }
        <span class="hljs-keyword">int</span> radius = <span class="hljs-number">0</span>;
        <span class="hljs-comment">//取最小为半径</span>
        radius = (defaultWidth &lt; defaultHeight ? defaultWidth
                : defaultHeight) / <span class="hljs-number">2</span>;

<span class="hljs-comment">//        canvas.drawRect(60, 90, 160, 100, new Paint());// 长方形</span>

        <span class="hljs-comment">//椭圆所在矩形 Y坐标固定，X左边变化</span>
        RectF rectF = <span class="hljs-keyword">new</span> RectF(x, <span class="hljs-number">0</span>, <span class="hljs-number">2</span>*radius - x, <span class="hljs-number">2</span>*radius);
        mPaint.setStyle(Paint.Style.FILL);<span class="hljs-comment">//填充</span>
        canvas.drawOval(rectF, mPaint);<span class="hljs-comment">// 椭圆</span>
        <span class="hljs-keyword">if</span> (add &amp;&amp; x &lt;= radius) {<span class="hljs-comment">// X变大即椭圆变小</span>
            x = x + changeRate*radius/<span class="hljs-number">100</span>;
        } <span class="hljs-keyword">else</span> <span class="hljs-keyword">if</span> (x &gt; <span class="hljs-number">0</span>) {<span class="hljs-comment">// X变小即椭圆变大</span>
            <span class="hljs-keyword">if</span>(!isback&amp;&amp; add){ <span class="hljs-comment">//刚开始变大 则变换颜色并且通过标记位判断颜色</span>
                isback=<span class="hljs-keyword">true</span>;
                mPaint.setColor(backColor);
            }<span class="hljs-keyword">else</span> <span class="hljs-keyword">if</span>(isback &amp;&amp; add){
                isback=<span class="hljs-keyword">false</span>;
                mPaint.setColor(frontColor);
            }
            x = x -  changeRate*radius/<span class="hljs-number">100</span>;
            add = <span class="hljs-keyword">false</span>;
        } <span class="hljs-keyword">else</span> {
            add = <span class="hljs-keyword">true</span>;
        }
        invalidate();<span class="hljs-comment">//重新绘制</span>
        <span class="hljs-keyword">super</span>.onDraw(canvas);

    }


    <span class="hljs-keyword">private</span> <span class="hljs-keyword">void</span> <span class="hljs-title">setCustomAttributes</span>(Context context,AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs,
                R.styleable.dycmalCircle);
        changeRate = a.getInt(
                R.styleable.dycmalCircle_changerate, <span class="hljs-number">2</span>);
        frontColor = a
                .getColor(R.styleable.dycmalCircle_frontcolor,
                        <span class="hljs-number">0</span>);
        backColor = a.getColor(
                R.styleable.dycmalCircle_backcolor, <span class="hljs-number">0</span>);
        mPaint.setColor(frontColor);
    }
}
</code></pre>

<p>接下来自定义的style文件：写在attrs中：</p>

</div><div id="wmd-preview-section-1865" class="wmd-preview-section preview-content">

<pre class="prettyprint"><code class=" hljs xml"><span class="hljs-pi">&lt;?xml version="1.0" encoding="utf-8"?&gt;</span>
<span class="hljs-tag">&lt;<span class="hljs-title">resources</span>&gt;</span>

    <span class="hljs-tag">&lt;<span class="hljs-title">declare-styleable</span> <span class="hljs-attribute">name</span>=<span class="hljs-value">"dycmalCircle"</span>&gt;</span>

        <span class="hljs-tag">&lt;<span class="hljs-title">attr</span> <span class="hljs-attribute">name</span>=<span class="hljs-value">"changerate"</span> <span class="hljs-attribute">format</span>=<span class="hljs-value">"integer"</span>/&gt;</span>
        <span class="hljs-tag">&lt;<span class="hljs-title">attr</span> <span class="hljs-attribute">name</span>=<span class="hljs-value">"frontcolor"</span> <span class="hljs-attribute">format</span>=<span class="hljs-value">"color"</span>/&gt;</span>
        <span class="hljs-tag">&lt;<span class="hljs-title">attr</span> <span class="hljs-attribute">name</span>=<span class="hljs-value">"backcolor"</span> <span class="hljs-attribute">format</span>=<span class="hljs-value">"color"</span>/&gt;</span>

    <span class="hljs-tag">&lt;/<span class="hljs-title">declare-styleable</span>&gt;</span>

<span class="hljs-tag">&lt;/<span class="hljs-title">resources</span>&gt;</span>
</code></pre>

<p>接下来在布局中使用就行了：</p>

</div><div id="wmd-preview-section-1978" class="wmd-preview-section preview-content">

<pre class="prettyprint"><code class=" hljs avrasm">&lt;<span class="hljs-keyword">com</span><span class="hljs-preprocessor">.szh</span><span class="hljs-preprocessor">.decymalcircle</span><span class="hljs-preprocessor">.DycmalCircleView</span>
        android:layout_width=<span class="hljs-string">"200dp"</span>
        android:layout_height=<span class="hljs-string">"200dp"</span>
        dycmalCircle:changerate=<span class="hljs-string">"2"</span>
        dycmalCircle:frontcolor=<span class="hljs-string">"#00a"</span>
        dycmalCircle:backcolor=<span class="hljs-string">"#0f0"</span>/&gt;
不要忘了加上 xmlns:dycmalCircle=<span class="hljs-string">"http://schemas.android.com/apk/res-auto"</span></code></pre></div><div id="wmd-preview-section-footnotes" class="preview-content"></div></div>
				</div>
			</div>
		</div>
		<div class="extension-preview-buttons closed animate" style="-webkit-user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0); touch-action: pan-y; transform: translate(101px, -6px);">
			<div class="btn-group drag-me dropup" title="这里可以拖拽">
				<i class="icon-ellipsis-vert"></i>
			</div>
		<div class="btn-group dropup"></div><div class="btn-group dropup"><button class="btn btn-success dropdown-toggle" title="标题列表" data-toggle="dropdown">
    <i class="icon-list"></i>
</button>
<div class="dropdown-menu pull-right">
    <h4>标题列表</h4>
    <hr>
    <div class="table-of-contents"><div class="toc">
<ul>
</ul>
</div>
</div>
    <hr>
</div>
</div><div class="btn-group dropup"><button class="btn btn-success dropdown-toggle stat-button" title="统计信息" data-toggle="dropdown">
	<i class="icon-chart-bar"></i>
	<span class="value">2769</span>
</button>
<div class="dropdown-menu pull-right stat-button-dropdown">
	<h4>统计信息</h4>
    <hr>
	<div class="stat">
		<div>
			字数: <span class="value1">2769</span>
		</div>
		<!--<div>-->
			<!--词（单词）: <span class="value2"></span>-->
		<!--</div>-->
		<div>
			段落: <span class="value3">122</span>
		</div>
	</div>
</div>
</div></div>
	<div class="find-replace" style="display: none;"><button type="button" class="close button-find-replace-dismiss">×</button>
<div class="form-inline">
    <div class="form-group">
        <label for="input-find-replace-search-for">搜索</label>
        <input class="form-control" id="input-find-replace-search-for" placeholder="关键词">
    </div>
    <div class="form-group">
        <label for="input-find-replace-replace-with">替换为</label>
        <input class="form-control" id="input-find-replace-replace-with" placeholder="替换文本">
    </div>
</div>
<div class="pull-right">
    <div class="help-block text-right">
        <span class="found-counter">0</span> 处
    </div>
    <div>
        <button type="button" class="btn btn-sm btn-primary search-button">查找</button>
        <button type="button" class="btn btn-sm btn-warning replace-button">替换</button>
        <button type="button" class="btn btn-sm btn-danger replace-all-button">全部替换</button>
    </div>
</div>
<div class="pull-left">
    <div class="checkbox">
        <label>
            <input type="checkbox" class="checkbox-case-sensitive"> 区分大小写
        </label>
    </div>
    <div class="checkbox">
        <label>
            <input type="checkbox" class="checkbox-regexp"> 正则表达式
        </label>
    </div>
</div>
</div></div>
	<div id="wmd-button-bar" class="hide"><ul id="wmd-button-row" class="wmd-button-row"><li class="wmd-spacer wmd-spacer1 btn btn-success" id="wmd-spacer1" style="left: 0px;"></li><li class="wmd-spacer wmd-spacer2 btn btn-success" id="wmd-spacer2" style="left: 0px;"></li><li class="wmd-spacer wmd-spacer3 btn btn-success" id="wmd-spacer3" style="left: 0px;"></li></ul></div>


	<div class="document-panel">

		<div class="panel-content">
			<div class="list-group document-list"><ul class="nav"><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file active" data-file-index="file.mHdStQwFE2ebbqDDfcvsZGm2">   <i class="icon-provider-csdnblog"></i>3D 圆形旋转动态实现</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.1TiqQV9MzAsaGueFBkbrFVsU">   <i class="icon-provider-csdnblog"></i>android 6.0 运行时详解</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.7MH0Zt27U7p1n0fECJkKcg2N">   <i class="icon-provider-csdnblog"></i>android api各个版本特性简单描述到6.0</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.DFxvyESlwZfYs3F4s47FxV5G">   <i class="icon-provider-csdnblog"></i>Android Api版本升级的各个特性详解到3.0</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.82ruCFPRO1hjcJaCLxpvYTvM">   <i class="icon-provider-csdnblog"></i>android webView 加载webapp 一些问题与技巧</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.cXhmmavzRRGvWgwejKcObO39">   <i class="icon-provider-csdnblog"></i>android 开发中全面的框架集合</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.POKJYo1alSTLT1v1m7PTPVOH">   <i class="icon-provider-csdnblog"></i>Map快速转换JSon 格式方法和完整的jar</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.z76oywwmeqLYGXJQMWc7rQLJ">   <i class="icon-provider-csdnblog"></i>Realm跨平台 数据库框架，完全摒弃sqlite</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.C4iMBL9gZTKp767uOzwkhqLm">   <i class="icon-provider-csdnblog"></i>RXJAVA的最详细教程</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.RCuLHWzIIGigTY3PYTLrvFzJ">   <i class="icon-provider-csdnblog"></i>文章标题</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.7vDPBh0m3KCTWZNOLEsjAT0O">   <i class="icon-provider-csdnblog"></i>文章标题</a></li></ul></div>
			<div class="list-group document-list-filtered hide"><ul class="nav"><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file active" data-file-index="file.mHdStQwFE2ebbqDDfcvsZGm2">   <i class="icon-provider-csdnblog"></i>3D 圆形旋转动态实现</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.1TiqQV9MzAsaGueFBkbrFVsU">   <i class="icon-provider-csdnblog"></i>android 6.0 运行时详解</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.7MH0Zt27U7p1n0fECJkKcg2N">   <i class="icon-provider-csdnblog"></i>android api各个版本特性简单描述到6.0</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.DFxvyESlwZfYs3F4s47FxV5G">   <i class="icon-provider-csdnblog"></i>Android Api版本升级的各个特性详解到3.0</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.82ruCFPRO1hjcJaCLxpvYTvM">   <i class="icon-provider-csdnblog"></i>android webView 加载webapp 一些问题与技巧</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.cXhmmavzRRGvWgwejKcObO39">   <i class="icon-provider-csdnblog"></i>android 开发中全面的框架集合</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.POKJYo1alSTLT1v1m7PTPVOH">   <i class="icon-provider-csdnblog"></i>Map快速转换JSon 格式方法和完整的jar</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.z76oywwmeqLYGXJQMWc7rQLJ">   <i class="icon-provider-csdnblog"></i>Realm跨平台 数据库框架，完全摒弃sqlite</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.C4iMBL9gZTKp767uOzwkhqLm">   <i class="icon-provider-csdnblog"></i>RXJAVA的最详细教程</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.7vDPBh0m3KCTWZNOLEsjAT0O">   <i class="icon-provider-csdnblog"></i>文章标题</a></li><li><a href="http://write.blog.csdn.net/mdeditor#" class="list-group-item file" data-file-index="file.RCuLHWzIIGigTY3PYTLrvFzJ">   <i class="icon-provider-csdnblog"></i>文章标题</a></li></ul></div>
		</div>
	</div>
</div>

<div class="modal fade modal-document-manager">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">文档管理</h4>
			</div>
			<div class="modal-body">
				<div></div>
				<ul class="nav nav-pills document-list">
					<li class="pull-right dropdown"><a data-toggle="dropdown"><i class="icon-check"></i> 选择操作 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a class="action-select-all"><i class="icon-check"></i> 选择全部</a></li>
							<li><a class="action-unselect-all"><i class="icon-check-empty"></i> 取消选择</a></li>
							<li class="divider"></li>
							<li><a class="action-move-items"><i class="icon-forward"></i> 移到指定文件夹</a></li>
							<li><a class="action-delete-items"><i class="icon-trash"></i> 删除</a></li>
						</ul>
					</li>
					<li class="pull-right"><a class="action-create-folder"> <i class="icon-folder"></i> 新建文件夹</a></li>
					<li class="disabled"><a><i class="icon-file"></i> <span class="document-count"></span></a></li>
					<li class="disabled"><a><i class="icon-folder"></i> <span class="folder-count"></span></a></li>
				</ul>
				<div class="list-group document-list"></div>
				<p class="confirm-delete hide">下列文档将从你本地存储中删除：</p>

				<p class="choose-folder hide">请选择一个目标文件夹：</p>

				<div class="list-group selected-document-list hide"></div>
				<div class="list-group select-folder-list hide"></div>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default confirm-delete choose-folder action-cancel hide">取消</a>
				<a class="btn btn-danger confirm-delete action-delete-items-confirm hide">确定</a>
				<a class="btn btn-danger document-list" data-dismiss="modal">关闭</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-insert-link">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">添加链接</h4>
			</div>
			<div class="modal-body">
				<p>链接书写格式为：链接地址 + 空格 + "链接提示"。</p>

				<div class="input-group">
					<span class="input-group-addon">
                        <i class="icon-link"></i>
                    </span>
					<input id="input-insert-link" type="text" class="col-sm-5 form-control" placeholder="http://example.com/ &quot;optional title&quot;">
				</div>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-insert-link" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-insert-image" aria-hidden="true" style="display: none;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">插入图片</h4>
			</div>
			<div class="modal-body">
				<ul class="nav nav-tabs" role="tablist">
					<li role="presentation" class=""><a href="http://write.blog.csdn.net/mdeditor#img_online" role="tab" data-toggle="tab">在线图片</a>
					</li>
					<li role="presentation" class="active"><a href="http://write.blog.csdn.net/mdeditor#img_upload" role="tab" data-toggle="tab">上传图片</a></li>
				</ul>

				<div class="tab-content">
					<div role="tabpanel" class="tab-pane" id="img_online">
						<p>图片书写格式为：图片地址 + 空格 + "图片提示"。</p>

						<div class="input-group">
							<span class="input-group-addon"><i class="icon-picture"></i></span>
							<input id="input-insert-image" type="text" class="col-sm-5 form-control" placeholder="http://example.com/image.jpg &quot;optional title&quot;">
						</div>
					</div>
					<div role="tabpanel" class="tab-pane active" id="img_upload">
						<!--<iframe src="http://ask.csdn.net/upload.html"></iframe>-->
						<iframe name="up_img" src="./CSDN-markdown编辑器_files/UploadImgMarkdown.html"></iframe>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a> <a class="btn btn-danger action-insert-image" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>

<div class="modal fade modal-start-abstract modal-bg">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">摘要 标签</h4>
			</div>
			<div class="modal-body">
				<div id="alert-nll" class="alert alert-danger fade"><i class="icon-warning"></i> 摘要内容不能为空！</div>
				<div class="form-group">
					<textarea class="form-control" rows="10" maxlength="210" id="input-blog-description" required="required"> </textarea>
				</div>
				<div class="form-group">
					<div id="blog_tagRecomm">正在获取推荐标签<i class="icon-spinner icon-spin"></i></div>
					<div class="div_tags clearfix">
						<div id="tags-con-blog" class="tags_con">
							<span class="tags_label"></span>
							<input type="text" maxlength="10">
						</div>
						<input type="hidden" id="tags-val-blog" class="form-control" value="">
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger" id="csdn-tags-blog-button">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-doc-setting modal-bg">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">文章设置</h4>
			</div>
			<div class="modal-body">
				<div class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label">文章类型</label>

						<div class="col-sm-5">
							<select class="form-control" id="input-blog-type">
								<option value="0" selected="selected">请选择</option>
								<option value="original">原创</option>
								<option value="repost">转载</option>
								<option value="translated">翻译</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">个人分类</label>

						<div class="col-sm-10">
							<div id="tags-con-categories" class="tags_con">
								<span class="tags_label"></span>
								<input type="text" maxlength="10">
							</div>
							<input type="hidden" class="form-control" id="tags-val-categories" value="">

							<div id="blog-categories-loadding"></div>
							<div id="blog-categories-box"></div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">文章分类</label>

						<div class="col-sm-5">
							<select class="form-control" name="radChl" id="input-blog-channel">
								<option value="0" selected="selected">请选择</option>
								<option value="1">移动开发</option>
								<option value="14">Web前端</option>
								<option value="15">架构设计</option>
								<option value="16">编程语言</option>
								<option value="17">互联网</option>
								<option value="6">数据库</option>
								<option value="12">系统运维</option>
								<option value="2">云计算</option>
								<option value="3">研发管理</option>
								<option value="7">综合</option>
							</select>
						</div>
						<div class="col-sm-3"><p class="form-control-static">分类到首页</p></div>
					</div>

                    <div class="form-group">
						<label class="col-sm-2 control-label" title="添加关联的文章url">更多文章</label>
						<div class="col-sm-10">
							<div class="tags_con">
                                  <input id="inputArticleMore" type="text" style="width:446px;" maxlength="100">                                  
							</div>	
                            	
                             <input type="button" id="submitMoreArticle" value="添加">   					
						</div>
                        <div class="col-smtags_con10">
                            <div id="articlePanle" style="margin-left:113px"></div>       
                        </div>
					</div>

                  <!-- <div class="form-group" id="panelCopyright" style="display:none" >
						<label class="col-sm-2 control-label">版权声明</label>
						<div class="col-sm-10">
							<div class="tags_con">							
								 <input type="text" maxlength="100" id="inputCopyright"  value="本文为博主原创文章，未经博主允许不得转载。"  style="width:446px" >
							</div>							
						</div>
					</div>-->

					<div class="form-group" style="display:none">
						<div class="col-sm-5 col-sm-offset-2">
							<label class="checkbox-inline">
								<input type="checkbox" id="input-blog-level">发布到CSDN博客首页
							</label>
						</div>
						<div class="col-sm-5"><p class="form-control-static">需积分&gt;100且文章类型非转载</p></div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
                <a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger" id="csdn-channel-blog-button" data-dismiss="modal">确定</a>
				<a class="btn btn-danger" id="csdn-post-blog-button" data-dismiss="modal">发布</a>
			</div>
		</div>
	</div>
</div>

<div class="modal fade modal-export-doc">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">导出文档</h4>
			</div>
			<div class="modal-body">
				<ul class="nav">
					<li><a class="action-download-md"><i class="icon-file-markdown"></i>

						<p>Markdown</p></a></li>
					<li><a class="action-download-html"><i class="icon-file-html"></i>

						<p>仅内容HTML</p></a></li>
					<li><a class="action-download-template"><i class="icon-file-html-t"></i>

						<p>带模板HTML</p></a></li>
					<!--<li><a class="action-download-pdf"><i class="icon-file-pdf"></i> <p>PDF文档</p></a></li>-->
				</ul>
			</div>
		</div>
	</div>
</div>
<div class="modal-helps hide">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" onclick="$(&#39;.modal-helps&#39;).addClass(&#39;hide&#39;)">×</button>
				<h4 class="modal-title">Markdown语法帮助</h4>
			</div>
			<div class="modal-body">
				<ol class="help-menu">
					<li class=""><a>标题</a>

						<div>
							<h4>在文字写书写不同数量的#可以完成不同的标题，如下：</h4>

							<p># 一级标题<br>
								## 二级标题<br>
								### 三级标题<br>
								#### 四级标题<br>
								##### 五级标题<br>
								###### 六级标题</p>
							<h4>等号及减号也可以进行标题的书写，不过只能书写二级标题，并且需要写在文字的下面，减号及等号的数量不会影响标题的基数，如下：</h4>

							<p>二级标题<br>
								=========</p>

							<p>二级标题<br>
								---------</p>
						</div>
					</li>
					<li class=""><a>列表</a>

						<div>
							<h4>无序列表的使用，在符号“-”后加空格使用。如下：</h4>

							<p> - 无序列表1<br>
								- 无序列表2<br>
								- 无序列表3</p>
							<h4>如果要控制列表的层级，则需要在符号“-”前使用空格。如下：</h4>

							<p> - 无序列表1<br>
								- 无序列表2<br>
								&nbsp;&nbsp;- 无序列表2.1<br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 列表内容<br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- 列表内容</p>

							<p>&nbsp;</p>
							<h4>有序列表的使用，在数字及符号“.”后加空格几个，如下：</h4>

							<p> 1. 有序列表1<br>
								2. 有序列表2<br>
								3. 有序列表3<br>
							</p>
							<h4>有序列表如果要区分层级，也可以在数字前加空格。</h4>
						</div>
					</li>
					<li class=""><a>引用</a>

						<div>
							<h4>引用的格式是使用符号“&gt;”后面书写文字，及可以使用引用。如下：</h4>

							<p> &gt;这个是引用<br> &gt; 是不是和电子邮件中的<br>
								&gt; 引用格式很像</p>
						</div>
					</li>
					<li class=""><a>粗体与斜体</a>

						<div>
							<h4>
								粗体的使用是在需要加粗的文字前后各加两个“*”，而斜体的使用则是在需要斜体的文字前后各加一个“*”，如果要使用粗体和斜体，那么就是在需要操作的文字前后各加三个“*”。如下：</h4>

							<p> **这个是粗体**<br>
								*这个是斜体*<br>
								***这个是粗体加斜体***</p>
						</div>
					</li>
					<li class=""><a>链接与图片</a>

						<div>
							<h4>在文中直接加链接，中括号中是需要添加链接的文字，圆括号中是需要添加的链接，如下：</h4>

							<p> [link text](http://example.com/ "optional title")</p>
							<h4>在引用中加链接，第一个中括号添加需要添加的文字，第二个中括号中是引用链接的id，之后在引用中，使用id加链接：如下：</h4>

							<p> [link text][id]<br>
								[id]: http://example.com/ "optional title here"</p>
							<h4>在文中直接引用链接，直接使用尖括号，把链接加入到尖括号中就可以实现，如下：</h4>

							<p>&lt;http://example.com/&gt; or &lt;address@example.com&gt;<br>
							</p>
							<h4>插入互联网上图片，格式如下：</h4>

							<p>![这里写图片描述](http://img3.douban.com/mpic/s1108264.jpg)<br>
								![这里写图片描述][jane-eyre-douban]<br>
								[jane-eyre-douban]: http://img3.douban.com/mpic/s1108264.jpg</p>
						</div>
					</li>
					<li class=""><a>代码块</a>

						<div>
							<h4>用TAB键起始的段落，会被认为是代码块，如下：</h4>

							<p> &nbsp;&nbsp;&nbsp;&nbsp;&lt;php&gt;<br>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;echo “hello world";<br>
								&nbsp;&nbsp;&nbsp;&nbsp;&lt;/php&gt;</p>
							<h4>如果在一个行内需要引用代码，只要用反引号`引起来就好，如下：</h4>

							<p> Use the <code>`printf()` </code>function.</p>
						</div>
					</li>
					<li class="active"><a>分割线与删除线</a>

						<div>
							<h4>可以在一行中用三个以上的星号、减号、底线来建立一个分隔线，同时需要在分隔线的上面空一行。如下：</h4>

							<p> ---<br>
								****<br>
								___</p>
							<h4>删除线的使用，在需要删除的文字前后各使用两个符合“~”，如下</h4>

							<p> ~~Mistaken text.~~</p>
						</div>
					</li>
					<li class=""><a>代码块与语法高亮</a>

						<div>
							<h4>在需要高亮的代码块的前一行及后一行使用三个反引号“`”，同时第一行反引号后面表面代码块所使用的语言，如下：</h4>

							<p>```ruby<br>
								require 'redcarpet'<br>
								markdown = Redcarpet.new("Hello World!")<br>
								puts markdown.to_html<br>
								```</p>
						</div>
					</li>
					<li class=""><a>表格</a>

						<div>
							<h4>可以使用冒号来定义表格的对齐方式，如下：</h4>

							<p> | Tables | Are | Cool |<br>
								| ------------- |:-------------:| -----:|<br>
								| col 3 is | right-aligned | $1600 |<br>
								| col 2 is | centered | $12 |<br>
								| zebra stripes | are neat | $1 |<br>
							</p>
						</div>
					</li>
					<li class=""><a>LaTex数学公式</a>

						<div>
							<h4>使用MathJax渲染*LaTex* 数学公式，详见[<a href="http://math.stackexchange.com/" target="_blank">math.stackexchange.com</a>]
							</h4>
							<h4>行内公式，数学公式为：</h4>

							<p>$\Gamma(n) = (n-1)!\quad\forall n\in\mathbb N$<br>
							</p>
							<h4>块级公式：</h4>

							<p>$$ x = \dfrac{-b \pm \sqrt{b^2 - 4ac}}{2a} $$</p>

							<p>更多LaTex语法请参考 [<a href="http://meta.math.stackexchange.com/questions/5020/mathjax-basic-tutorial-and-quick-reference" target="_blank">这儿</a>]。</p>

						</div>
					</li>
					<li class=""><a>UML 图</a>

						<div>
							<h4>可以渲染序列图：</h4>

							<p>```sequence<br>
								张三-&gt;李四: 嘿，小四儿, 写博客了没?<br>
								Note right of 李四: 李四愣了一下，说：<br>
								李四--&gt;张三: 忙得吐血，哪有时间写。<br>
								```</p>
							<h4>或者流程图：</h4>

							<p>```flow<br>
								st=&gt;start: 开始<br>
								e=&gt;end: 结束<br>
								op=&gt;operation: 我的操作<br>
								cond=&gt;condition: 确认？</p>

							<p>st-&gt;op-&gt;cond<br>
								cond(yes)-&gt;e<br>
								cond(no)-&gt;op<br>
								```</p>

							<p>- 关于 **序列图** 语法，参考 [<a href="http://bramp.github.io/js-sequence-diagrams/" target="_blank">这儿</a>]<br>
								- 关于 **流程图** 语法，参考 [<a href="http://adrai.github.io/flowchart.js/" target="_blank">这儿</a>]<br>
							</p>
						</div>
					</li>
				</ol>

			</div>
		</div>
	</div>
</div>

<div class="modal fade modal-alert">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<!--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>-->
			</div>
			<div class="modal-body">
			</div>
			<div class="modal-footer text-center">
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-import-image">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h2 class="modal-title">Google+ image import</h2>
			</div>
			<div class="modal-body">
				<div class="form-horizontal">
					<div class="form-group">
						<div class="col-sm-7">
							<img>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label" for="input-import-image-title">Title (optional)</label>

						<div class="col-sm-7">
							<input type="text" id="input-import-image-title" placeholder="Image title" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-4 control-label" for="input-import-image-size">Size limit (optional)</label>

						<div class="col-sm-7 form-inline">
							<input type="text" id="input-import-image-size" placeholder="0" class="col-sm-3 form-control"> px
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-import-image" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-remove-file-confirm">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h2 class="modal-title">Delete</h2>
			</div>
			<div class="modal-body">
				<p>
					Are you sure you want to delete "<span class="file-title">3D 圆形旋转动态实现</span>"?
				</p>
				<blockquote>
					<p><b>Note:</b> It won't delete the file on synchronized locations.</p>
				</blockquote>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-remove-file" data-dismiss="modal">Delete</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-import-url">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">从线上导入</h4>
			</div>
			<div class="modal-body">
				<div class="alert alert-danger">
					<p><i class="icon-warning"></i> 注意：当前操作只要成功导入在线.md地址就会冲掉当前的文章，请确定是否保存或者发表后再进行导入操作。</p>

					<p>PS：IE11以下版本不支持导入功能。</p>
				</div>
				<p>请输入在线的markdown文件地址：</p>

				<div class="form-horizontal">
					<div class="form-group">
						<label class="col-sm-2 control-label" for="input-import-url">URL</label>

						<div class="col-sm-9">
							<input type="text" id="input-import-url" placeholder="http://code.csdn.net/test.md" class="form-control">
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a data-dismiss="modal" class="btn btn-danger action-import-url">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-import-harddrive-markdown">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title">从本机导入</h4>
			</div>
			<div class="modal-body">
				<div class="alert alert-danger">
					<p><i class="icon-warning"></i> 注意：当前操作只要成功选择或者拖入.md文件就会冲掉当前的文章，请确定是否保存或者发表后再进行导入操作。</p>

					<p>PS：IE11以下版本不支持导入功能。</p>
				</div>
				<p>请选择你要导入的.md文档</p>

				<p>
					<input type="file" id="input-file-import-harddrive-markdown" multiple="" class="form-control">
				</p>

				<p>或者将.md文档拖到这里</p>

				<p id="dropzone-import-harddrive-markdown" class="drop-zone">拖拽文件到这里</p>
			</div>
			<div class="modal-footer">
				<a class="btn btn-danger" data-dismiss="modal">关闭</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-import-harddrive-html">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h2 class="modal-title">Convert HTML to Markdown</h2>
			</div>
			<div class="modal-body">
				<p>Please select your HTML files here:</p>

				<p>
					<input type="file" id="input-file-import-harddrive-html" multiple="" class="form-control">
				</p>

				<p>Or drag and drop your HTML files here:</p>

				<p id="dropzone-import-harddrive-html" class="drop-zone">Drop files here</p>

				<p>Or insert your HTML code here:</p>
				<textarea id="input-convert-html" class="form-control"></textarea>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-convert-html" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>

<div class="modal fade modal-publish">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h2 class="modal-title">
					Publish on <span class="publish-provider-name"></span>
				</h2>
			</div>
			<div class="modal-body">
				<div class="form-horizontal">
					<div class="form-group modal-publish-ssh">
						<label class="col-sm-4 control-label" for="input-publish-ssh-host">Host</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-ssh-host" placeholder="hostname.or.ip" class="form-control"> <span class="help-block"> Host must be accessible publicly, unless you're hosting your own StackEdit instance.
							</span>
						</div>
					</div>
					<div class="form-group modal-publish-ssh">
						<label class="col-sm-4 control-label" for="input-publish-ssh-port">Port
							(optional)</label>

						<div class="col-sm-2">
							<input type="text" id="input-publish-ssh-port" placeholder="22" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-ssh">
						<label class="col-sm-4 control-label" for="input-publish-ssh-username">Username</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-ssh-username" placeholder="username" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-ssh">
						<label class="col-sm-4 control-label" for="input-publish-ssh-password">Password</label>

						<div class="col-sm-7">
							<input type="password" id="input-publish-ssh-password" placeholder="password" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-github">
						<label class="col-sm-4 control-label" for="input-publish-github-repo">Repository</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-github-repo" placeholder="Repository name or URL" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-github">
						<label class="col-sm-4 control-label" for="input-publish-github-branch">Branch</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-github-branch" placeholder="branch-name" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-ssh modal-publish-github">
						<label class="col-sm-4 control-label" for="input-publish-file-path">File path</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-file-path" placeholder="path/to/file.md" class="form-control">
							<span class="help-block"> File path is composed of both
								folder and filename. </span>
						</div>
					</div>
					<div class="form-group modal-publish-gist">
						<label class="col-sm-4 control-label" for="input-publish-filename">Filename</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-filename" placeholder="filename" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-gist">
						<label class="col-sm-4 control-label" for="input-publish-gist-id">Existing
							ID (optional)</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-gist-id" placeholder="GistID" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-gist">
						<label class="col-sm-4 control-label" for="input-publish-gist-public">Public</label>

						<div class="col-sm-7">
							<div class="checkbox">
								<input type="checkbox" id="input-publish-gist-public" checked="checked">
							</div>
						</div>
					</div>
					<div class="form-group modal-publish-blogger modal-publish-bloggerpage">
						<label class="col-sm-4 control-label" for="input-publish-blogger-url">Blog URL</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-blogger-url" placeholder="http://exemple.blogger.com/" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-tumblr">
						<label class="col-sm-4 control-label" for="input-publish-tumblr-hostname">Blog hostname</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-tumblr-hostname" placeholder="exemple.tumblr.com" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-wordpress">
						<label class="col-sm-4 control-label" for="input-publish-tumblr-hostname">WordPress site</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-wordpress-site" placeholder="exemple.wordpress.com" class="form-control">
							<span class="help-block"> <a target="_blank" href="http://jetpack.me/">Jetpack plugin</a> is required for
								self-hosted sites.
							</span>
						</div>
					</div>
					<div class="form-group modal-publish-blogger modal-publish-tumblr modal-publish-wordpress">
						<label class="col-sm-4 control-label" for="input-publish-postid">Update
							existing post ID (optional)</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-postid" placeholder="PostID" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-bloggerpage">
						<label class="col-sm-4 control-label" for="input-publish-pageid">Update
							existing page ID (optional)</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-pageid" placeholder="PageID" class="form-control">
						</div>
					</div>
					<div class="form-group modal-publish-dropbox">
						<label class="col-sm-4 control-label" for="input-publish-dropbox-path">File path</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-dropbox-path" placeholder="/path/to/My Document.html" class="form-control">
							<span class="help-block"> File path is composed of both
								folder and filename. </span>
						</div>
					</div>
					<div class="form-group modal-publish-gdrive">
						<label class="col-sm-4 control-label" for="input-publish-gdrive-fileid">File ID (optional)</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-gdrive-fileid" placeholder="FileID" class="form-control"> <span class="help-block">If no file ID is supplied, a new file
								will be created in your Google Drive root folder. You can move
								the file afterwards within Google Drive.</span>
						</div>
					</div>
					<div class="form-group modal-publish-gdrive">
						<label class="col-sm-4 control-label" for="input-publish-gdrive-filename">Force filename
							(optional)</label>

						<div class="col-sm-7">
							<input type="text" id="input-publish-gdrive-filename" placeholder="Filename" class="form-control"> <span class="help-block">If no file name is supplied, the
								document title will be used.</span>
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-4 control-label">Format</label>

						<div class="col-sm-7">
							<div class="radio">
								<label> <input type="radio" name="radio-publish-format" value="markdown"> Markdown
								</label>
							</div>
							<div class="radio">
								<label> <input type="radio" name="radio-publish-format" value="html"> HTML
								</label>
							</div>
							<div class="radio">
								<label> <input type="radio" name="radio-publish-format" value="template"> Template
								</label>
							</div>
						</div>
					</div>
					<div class="collapse publish-custom-template-collapse">
						<div class="form-group">
							<div class="col-sm-4"></div>
							<div class="col-sm-7">
								<div class="checkbox">
									<label> <input type="checkbox" id="checkbox-publish-custom-template"> Custom template
									</label> <a class="tooltip-template">(?)</a>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-4"></div>
							<div class="col-sm-7">
								<textarea class="form-control" id="textarea-publish-custom-template" disabled=""></textarea>
							</div>
						</div>
					</div>
				</div>
				<blockquote class="front-matter-info modal-publish-blogger modal-publish-tumblr modal-publish-wordpress">
					<p><b>Tip:</b> You can use a
						<a href="http://jekyllrb.com/docs/frontmatter/" target="_blank">YAML front matter</a> to specify the title and the tags/labels of your
						publication.</p>

					<p><b>Interpreted variables:</b> <code>title</code>, <code>tags</code>, <code>published</code>,
						<code>date</code>.</p>
				</blockquote>
				<blockquote class="front-matter-info modal-publish-bloggerpage">
					<p><b>Tip:</b> You can use a
						<a href="http://jekyllrb.com/docs/frontmatter/" target="_blank">YAML front matter</a> to specify the title of your page.</p>

					<p><b>Interpreted variables:</b> <code>title</code>.</p>
				</blockquote>
				<blockquote class="url-info modal-publish-bloggerpage">
					<p><b>About URL:</b> For newly created page , Blogger API will append a generated number to the url
						like <code>about-me-1234.html</code>, if you deeply care about your URL naming, you should first
						create the page on Blogger and then update them with StackEdit specifying the pageId when
						publishing.
					</p>

					<p><b>About page visibility:</b> Blogger API does not respect published status for pages.When
						publishing the page to Blogger, the page will be <strong>live</strong> but not added to the page
						listing. You should arrange the page listing from Blogger dashboard.
					</p>
				</blockquote>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a data-dismiss="modal" class="btn btn-danger action-process-publish">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-manage-publish">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h2 class="modal-title">Publication</h2>
			</div>
			<div class="modal-body">
				<p>
					"<span class="file-title">3D 圆形旋转动态实现</span>" is published on the following
					location(s):
				</p>

				<div class="publish-list"><div class="entry">
    <div class="input-group">
	<span class="input-group-addon" title="CsdnBlog">
		<i class="icon-provider-csdnblog"></i>
	</span> <input class="form-control" type="text" value="id:, htmlContent:, markdowndirectory:, type:0, channel:0, categories:, description:, tags:, level:0, status:0, articleedittype:1, articlemore:, format:markdown" disabled="">
    </div>
    <div class="text-right">
        <a class="btn btn-link btn-sm open-location" target="_blank" href="https://blog.csdn.net/">
            <i class="icon-link-ext-alt"></i> Open in CsdnBlog
        </a>
        <a class="btn btn-link btn-sm remove-button" data-publish-index="publish.lFxNFKraIryx57pqLeuPbrG5"><i class="icon-trash"></i> Remove location</a>
    </div>
</div>
</div>
				<blockquote>
					<p><b>Note:</b> Removing a publish location will not delete the actual publication.</p>
				</blockquote>
			</div>
			<div class="modal-footer">
				<a class="btn btn-danger" data-dismiss="modal">Close</a>
			</div>
		</div>
	</div>
</div>

<div class="modal fade modal-non-unique">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">不好意思...</h4>
			</div>
			<div class="modal-body">
				<p>Markdown编辑器已经停止，因为另一个实例中相同的浏览器中运行。</p>
				<blockquote>
					<p>如果你想重新打开Markdown编辑器，请点击 “重新加载”</p>
				</blockquote>
			</div>
			<div class="modal-footer">
				<a href="javascript:window.location.reload();" class="btn btn-danger">重新加载</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-redirect-confirm">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<h2 class="modal-title">Redirection</h2>
			</div>
			<div class="modal-body">
				<p class="redirect-msg"></p>
				<blockquote>
					<p>Please click <b>确定</b> to proceed.</p>
				</blockquote>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-redirect-confirm" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-app-reset">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<h2 class="modal-title">Reset application</h2>
			</div>
			<div class="modal-body">
				<p>This will delete all your local documents.</p>
				<blockquote><b>Are you sure?</b></blockquote>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-app-reset" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>


<div class="modal fade modal-import-docs-settings">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<h2 class="modal-title">Import documents and settings</h2>
			</div>
			<div class="modal-body">
				<p>This will delete all existing local documents.</p>
				<blockquote><b>Are you sure?</b></blockquote>
			</div>
			<div class="modal-footer">
				<a class="btn btn-default" data-dismiss="modal">取消</a>
				<a class="btn btn-danger action-import-docs-settings-confirm" data-dismiss="modal">确定</a>
			</div>
		</div>
	</div>
</div>


</div>
       
    <div id="loginform" style="display: none"></div>    
                <style type="text/css">
                        /*第一次加载的时候的弹出选择使用哪个编辑器*/

                    .mod_pop_edit_choose{position: absolute;width: 600px;height: 400px;color: #fff;font-size: 14px;background: url("http://static.blog.csdn.net/images/edit_choose_bg_makrdown.png");z-index: 999}
                    .mod_pop_edit_choose .mod_pop_edit_choose_title{height: 50px;line-height: 50px;font-size: 18px;}
                    .mod_pop_edit_choose .mod_pop_edit_choose_title span {background: url("http://static.blog.csdn.net/images/bole_help_close.png");background-size:contain;display: inline-block;width:16px;height: 16px ;float: right;margin-top: 10px;margin-right: 20px}
                    .mod_pop_edit_choose .mod_pop_edit_choose_content {text-align: center}
                    .mod_pop_edit_choose .mod_pop_edit_choose_content a {text-align: center;
                        display: inline-block;
                        width: 116px;
                        height: 35px;
                        padding: 0;
                        line-height: 35px;
                        font-size: 18px;
                        color: #fff;
                        margin-top: 250px;
                        border: 1px solid #fff;
                        border-radius: 10px;
                        text-decoration: none;
                    }
                    .mod_pop_edit_choose .mod_pop_edit_choose_footer	{height: 50px;line-height: 50px;font-size: 18px;}
                    .mod_pop_edit_choose .mod_pop_edit_choose_footer input 	{height: 16px;width: 16px;vertical-align: middle;margin: 0;padding: 0;margin-left: 30px;margin-right: 5px}
                    .mod_pop_edit_choose .mod_pop_edit_choose_footer em 	{font-style: normal;vertical-align: middle}
                    .mod_pop_edit_choose .mod_pop_edit_choose_footer span{display: inline-block;width: 80px;height: 28px;line-height:28px;color: #fff;text-align: center;float: right;font-size: 14px;background: #BE0000;margin-right: 20px;margin-top: 12px;cursor: pointer}

                </style>
    <!--编辑器load引导页面start-->
    <div class="mod_pop_edit_choose" style="display: none; top: 417px; left: 900px;">
        <div class="mod_pop_edit_choose_title"><span class="close"></span></div>
        <div class="mod_pop_edit_choose_content">
            <a id="start_md" class="start_btn" href="javascript:void(0);" style="margin-right: 50px;">马上试用</a>
            <a id="start_conf" class="start_btn" href="http://write.blog.csdn.net/configure">重新设置</a>
        </div>
        <div class="mod_pop_edit_choose_footer"><input id="no_tishi" type="checkbox" name="" value="" class="checkbox" style="display: inline-block"><em>不再提示</em></div>
    </div>
    <!--引入弹窗组件-->
    <script type="text/javascript">
        $(function () {
            var edu_component = {};
            edu_component.comon_popup = function (option_conf) {
                var default_conf = {
                    $btn: null,
                    $popup: null,
                    top_value: 0
                }
                var popup_conf = $.extend(default_conf, option_conf);
                this.$btn = popup_conf.$btn;
                this.$popup = popup_conf.$popup;
                this.top_value = popup_conf.top_value;
                this.mark = null;
            }
            edu_component.comon_popup.prototype = {
                init: function () {
                    this.mark = this.createMaskFactory();
                    this.open();
                    this.close();
                },
                open: function () {
                    var that = this;
                    //位置
                    var w = $(document).width();
                    var h = $(document).height();
                    var top = $(window).height() / 2 - this.$popup.height() / 2 + $(window).scrollTop();
                    var top_defined = that.top_value;
                    this.$popup.css({
                        //top:(top_defined+'px')|| (top + 'px'),
                        top: (top + 'px'),
                        left: w / 2 - this.$popup.width() / 2 + 'px'
                    });
                    if (this.$btn) {
                        this.$btn.click(function () {
                            setTimeout(function () {
                                that.$popup.show();
                                that.$popup.css({
                                    opacity: 1
                                });
                            }, 200);
                            //加入mask
                            //让这个单例的mask对象显示出来
                            that.mark.showMask();

                        })
                    }
                        //如果没有点击按钮就是onload
                    else {
                        this.mark.showMask();
                    }

                },
                close: function () {
                    var that = this;
                    this.$popup.find(" .close").add(".close_know").click(function () {
                        that.mark.hideMask();
                        that.$popup.css({ opacity: 0 });
                        setTimeout(function () {
                            that.$popup.hide();
                        }, 200);
                        //把那个单例的mask隐藏。

                    })

                },
                //遮罩的创建和加入遮罩是不是要分开
                createMaskFactory: function () {
                    var w = $(document).width();
                    var h = $(document).height();
                    var mask = {};
                    mask.showMask = function () {
                        this.contentElemnt.show()

                    }
                    mask.hideMask = function () {
                        this.contentElemnt.hide()

                    }
                    var $marker = $('<div class="marker"></div>');
                    $marker.css({
                        opacity: 0.5,
                        width: w + 'px',
                        height: h + 'px'
                    });

                    if (!this.mark) {
                        $('body #wrap').append($marker);
                        mask.contentElemnt = $marker;
                    }
                    return mask

                }

            }


            /**
             * Created by yangwei1 on 15-4-14.
             */
            //$btn默认为空表示是加载就显示，这个表示点击的那个btn
            //$pop表示弹出那个框
            //top_value 到顶部的距离是可设置的，现在取消，是视窗的中间
            //开始调用，这个为博客帮助的弹出
            //打开就加载的弹窗

            var popup_conf_onload = {
                $btn: null,
                $popup: $(".mod_pop_edit_choose")
            }
            var comon_popup_object_onload = new edu_component.comon_popup(popup_conf_onload);
            comon_popup_object_onload.init();

            $.get("/mdeditor/GetIsTip", function (data) {
                if (data == "true") {
                    $(".mod_pop_edit_choose").show();
                    $("#start_md,.start_conf").click(function () {
                        $(".close").click();
                    });

                    $(".close").click(function () {
                        if ($("#no_tishi").is(":checked")) {
                            $.get("/MdEditor/SetDefaultTip?BlogId=0"+"&r="+Math.random(), function () {
                        //alert("更改完成");
                    });
                }
            });
                }
                else {
                    $(".mod_pop_edit_choose").hide();
                }
            });

           
        });
    </script>
    <!--编辑器load引导页面end-->







<div id="tag-suggest-pop">
  <div class="relative">
    <div class="close"></div>
    <div class="content"></div>
  </div>
</div><ul class="complete_list"></ul><ul class="complete_list" style="display: none;"></ul></body><input style="width:1px;height:1px;border:none;margin:0;padding:0;" tabindex="-1"></html>