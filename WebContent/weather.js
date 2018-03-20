$(document).ready(function() {
	$('#weatherbtn').click(function(){
		var city = $('#weather').val();
		console.log(city);
		if(city != ''){

			$.ajax({
				/*url:'http://api.openweathermap.org/data/2.5/weather?q='+city+"&units=matric&APPID=35e3e1ecbe93eceadfbceb273f4157e7",*/
				url:'http://api.openweathermap.org/data/2.5/forecast?q='+city+'&units=metric&mode=json&APPID=35e3e1ecbe93eceadfbceb273f4157e7',
				type:"get",
				dataType:"jsonp",
				success: function(data){
					console.log(data);									
					$('#table').html(createTable(data));
					conditions1 = data.list[5].weather[0].description,
	                humidity1 = data.list[5].main.humidity,
	                temperature1 = data.list[5].main.temp,
	                pressure1 = data.list[5].main.pressure,
	                sealevel1 = data.list[5].main.sea_level,
	                windspeed1 = data.list[5].wind.speed,
	                datetime1 = data.list[5].dt_txt
	                sendData(data);
	                console.log(conditions1);
				}
			});
			console.log("called 1");
		} 
		else{
			alert("Enter some value");
		}
	});
	
	function sendData(data) {
		console.log(conditions1);
		$.ajax({
			url:"Servletweather",
			type:"GET",
			data:{
                conditions: data.list[1].weather[0].description,
                humidity: data.list[1].main.humidity,
                temperature: data.list[1].main.temp,
                pressure: pressure1 = data.list[1].main.pressure,
                sealevel: data.list[1].main.sea_level,
                windspeed: data.list[1].wind.speed,
                datetime: data.list[1].dt_txt,
                city: data.city.name
                },
			success: function(data){
				alert('data sent')
			},
			 error:function(){
	              alert('error');
	            }
                
		});
	}
	
	function createTable(data){
		var table = "<small>**Units in Matric**</small><br><table id='customers' class='responsive'><thread><tr><th>Weather</th><th>Humidity</th><th>Temperature</th><th>Pressure</th><th>Sea Level</th><th>Wind Speed</th><th>Date</th><th>Name</th></tr>";
		for(i = 0; i<37 ; i++){
			table = table + "<tr>"+
								"<td>&nbsp;"+data.list[i].weather[0].description+"&nbsp;</td>"+
								"<td>&nbsp;"+data.list[i].main.humidity+"&nbsp;</td>"+
								"<td>&nbsp;"+data.list[i].main.temp+"&nbsp;</td>"+
								"<td>&nbsp;"+data.list[i].main.pressure+"&nbsp;</td>"+
								"<td>&nbsp;"+data.list[i].main.sea_level+"&nbsp;</td>"+
								"<td>&nbsp;"+data.list[i].wind.speed+"&nbsp;</td>"+
								"<td>&nbsp;"+data.list[i].dt_txt+"&nbsp;</td>"+
								"<td>&nbsp;"+data.city.name+"&nbsp;</td>"+
								"</tr>"
		}
		table = table + "</thread></table>";
		return table;
	}
});