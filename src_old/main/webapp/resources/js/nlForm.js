/**
 * 
 */
$(function() {
  addEventListeners();
});

function addEventListeners() {
  $(".step-controls .number-total").html($(".nl-form .steps > li").length);
  var currentStep = $(".nl-form > ol > li.current").index();
  var width = currentStep * (100 / $(".nl-form .steps > li").length);
  $("#step-progress").css("width", width + '%');
  $(".step-controls .number-current").html(currentStep + 1);
  
  $(".nl-form .form-field").each(function() {
    var mainDiv = this;
    
    var toggle = $(this).find(".form-field-toggle");
    $(toggle).click(function() {
      $(mainDiv).addClass("form-field-open");
      $("#form-field-overlay").addClass("open");
    });
    
    $(mainDiv).find($("ul > li")).each(function() {
      $(this).click(function() {
        updateSelected(mainDiv, $(this));
        var val = $(this).data("value");
        var hidden = $(mainDiv).find(".hidden");
        hidden.val(val);
        hidden.change();
        toggle.html($(this).html());
        toggle.change();
        $(mainDiv).removeClass("form-field-open");
        $("#form-field-overlay").removeClass("open");
      });
    });
  
  
    $("#form-field-overlay").click(function() {
      $(mainDiv).removeClass("form-field-open");
      $(this).removeClass("open");
    });
  });
}

function updateSelected(mainDiv, toSelect) {
  $(mainDiv).find($("ul > li")).each(function() {
    if($(this).get(0) !== toSelect.get(0)) {
      $(this).removeClass("dd-selected");
    } else {
      $(this).addClass("dd-selected");
    }
  });
}