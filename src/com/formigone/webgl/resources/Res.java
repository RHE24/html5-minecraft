package com.formigone.webgl.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ExternalTextResource;
import com.google.gwt.resources.client.ImageResource;

public interface Res extends ClientBundle {
	public static final Res R = GWT.create(Res.class);
	
	@Source("com/formigone/webgl/resources/img/tree-3d.jpg")
	ImageResource tree();

	@Source("com/formigone/webgl/resources/shaders/simple-frag.glsl")
	ExternalTextResource simpleFragShader();
	
	@Source("com/formigone/webgl/resources/shaders/simple-vert.glsl")
	ExternalTextResource simpleVertShader();
}
