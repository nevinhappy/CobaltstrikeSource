package org.w3c.dom.svg;

import org.w3c.dom.DOMException;

public interface SVGPathSegLinetoRel extends SVGPathSeg {
   float getX();

   void setX(float var1) throws DOMException;

   float getY();

   void setY(float var1) throws DOMException;
}
