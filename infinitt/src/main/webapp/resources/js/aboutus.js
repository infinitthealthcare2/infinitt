$(document).ready(function(){




	/*setInterval(() => {

	    //window.scrollTo(0, -document.body.scrollHeight, "smooth")
	    //window.scrollTop();
	    window.scrollTo(0, document.body.scrollHeight, "smooth");
	    
	  },32);*/
	
	


})

	myY = 0; //초기 포커싱위치를 0으로 설정해주도록한다
	function myScr() {
	    window.scroll(1000000,myY); //스크롤바의 위치 설정
	    myY = myY + 2; //y의 값을 점점 내리도록한다
	    if(myY ==70000) myY = 0; //만약 y축의 값이 300이 되면 초기화를 하도록설정
	    setTimeout("myScr()",8); //0.1초마다 이 함수를 반복하도록설정
	}

	myScr();