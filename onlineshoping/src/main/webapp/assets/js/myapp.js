/**
 * 
 */

$(function(){
	switch (menu) {
	
	case 'About Us':
		alert(menu);
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		alert(menu);
		$('#contact').addClass('active');
		break;

	default:
		$('#home').addClass('active');
		break;
	}
	
});