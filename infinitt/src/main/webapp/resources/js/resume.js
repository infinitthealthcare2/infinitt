$(document).ready(function(){
	
	$( function() {
        var dateFormat = "yy/mm",
          from = $( "#from" )
            .datepicker({
              defaultDate: "+1w",
              changeMonth: true,
              numberOfMonths: 1
            })
            .on( "change", function() {
              to.datepicker( "option", "minDate", getDate( this ) );
            }),
          to = $( "#to" ).datepicker({
            defaultDate: "+1w",
            changeMonth: true,
            numberOfMonths: 1
          })
          .on( "change", function() {
            from.datepicker( "option", "maxDate", getDate( this ) );
          });
     
        function getDate( element ) {
          var date;
          try {
            date = $.datepicker.parseDate( dateFormat, element.value );
          } catch( error ) {
            date = null;
          }
     
          return date;
        }
      } );

	
	
      $( function() {
        var dateFormat = "yy/mm",
          from = $( "#from2" )
            .datepicker({
              defaultDate: "+1w",
              changeMonth: true,
              numberOfMonths: 1
            })
            .on( "change", function() {
              to.datepicker( "option", "minDate", getDate( this ) );
            }),
          to = $( "#to2" ).datepicker({
            defaultDate: "+1w",
            changeMonth: true,
            numberOfMonths: 1
          })
          .on( "change", function() {
            from.datepicker( "option", "maxDate", getDate( this ) );
          });
     
        function getDate( element ) {
          var date;
          try {
            date = $.datepicker.parseDate( dateFormat, element.value );
          } catch( error ) {
            date = null;
          }
     
          return date;
        }
      } );
      
      
	

	
	
	
	$(".section_license").on("click",".addTable", function(){
		
		let str="";
		
		str+="<tr>"
		str+="<td class='lineup_center'><p>"
		str+="<label for='from2' ></label>"
		str+="<input type='text' id='from2' name='acquisition_date_start' style='width : 100px;' class='hasDatepicker'>"
		str+="<label for='to2'> ~ </label>"
		str+="<input type='text' id='to2' name='acquisition_date_end' style='width : 100px;' class='hasDatepicker'>"
		str+="</p> </td>"
		str+="<td class='lineup_center'>"
		str+="<select name='lisence_type' id='lisence_type'>"
		str+="<option value='자격증/면허증'>자격증/면허증</option>"
		str+="<option value='어학'>어학</option>"
		str+="<option value='수상내역'>수상내역</option>"
		str+="</select>"
		str+="</td>"
		str+="<td><input type='text' name='awards_name'></td>"
		str+="<td><input type='text' name='agency'></td>"
		str+="<td class='lineup_center'>"
		str+="<select name='pass' id='pass'>"
		str+="<option value='1차 합격'>1차 합격</option>"
		str+="<option value='2차 합격'>2차 합격</option>"
		str+="<option value='최종 합격'>최종 합격</option>"
		str+="</select>"
		str+="</td><td class='delete_lisence'>X</td></tr>"
		$(".section_license tbody").append(str);

		
	})
	
	$(".inpart_view").on("click",".delete_lisence", function(){

		$(this).parent("tr").remove();
	
		
	})
	
	
		



}


