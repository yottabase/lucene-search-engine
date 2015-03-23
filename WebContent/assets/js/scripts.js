jQuery( document ).ready(function( $ ) {

	
	
	var hasResults = false;
	
	$('#search-input').on('propertychange change keyup input paste', function(){
		console.log($(this).val());
		
		if(! hasResults){
			hasResults = true;
			
			$('#search-form').animate({
				  marginTop: 20,
			});
			
			$('#brand').animate({
				  marginBottom: 20,
			});
			
			//alert('ciao');
		}
		
		
	});
	
});