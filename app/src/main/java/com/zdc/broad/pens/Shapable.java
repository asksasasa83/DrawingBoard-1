package com.zdc.broad.pens;

import android.graphics.Path;

public interface Shapable {
	public Path getPath();

	public FirstCurrentPosition getFirstLastPoint();

	void setShap(ShapesInterface shape);
}
