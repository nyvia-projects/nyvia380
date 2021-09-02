function watch(){
	var time = new Date();
	var hours = time.getHours();
	var minutes = time.getMinutes();
	var seconds = time.getSeconds();
	if(minutes < 10) minutes = "0" + minutes;
	if(seconds < 10) seconds = "0" + seconds;
	if(hours < 10 || hours == 11){
		if(hours < 10){
			hours = "0" + hours;
		}
		document.getElementById("clock").innerHTML = hours + ":" + minutes + ":" + seconds + " AM";
	}
	if(hours > 12 && hours <=23){
		hours -= 12;
		if(hours < 10) hours = "0" + hours;
	document.getElementById("clock").innerHTML = hours + ":" + minutes + ":" + seconds + " PM";
	}
	setTimeout("watch()",1000);
}
watch();
