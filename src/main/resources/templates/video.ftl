<!doctype html>
<html>
	<head>
	<meta charset="utf-8">
	<title>Video.js 6.2.8</title>
        <script src="${ctx!}/css/video-js.css"></script>
	<link href="${ctx!}/css/video-js.css" rel="stylesheet">
	<style>
body {
	background-color: #191919
}
.m {
	width: 740px;
	height: 400px;
	margin-left: auto;
	margin-right: auto;
	margin-top: 100px;
}
</style>
	</head>
	<body>
    <div class="m">
      <video id="my-video" class="video-js" controls preload="auto" width="740" height="400"
		  poster="m.png" data-setup="{}">
        <source src="http://jq22com.qiniudn.com/jq22-sp.mp4" type="video/mp4">
        <p class="vjs-no-js"> To view this video please enable JavaScript, and consider upgrading to a web browser that <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a> </p>
      </video>
      <script src="js/video.min.js"></script> 
      <script src="http://vjs.zencdn.net/5.19/lang/zh-CN.js"></script>
      <script type="text/javascript">
			var myPlayer = videojs('my-video');
			videojs("my-video").ready(function(){
				var myPlayer = this;
				myPlayer.play();
			});
		</script> 
    </div>
</body>
</html>
