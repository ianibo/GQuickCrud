package gquickcrud

class CqCreateController {

  def create() { 
    render(view: "viewName", model: [book: theShining])
  }
}
