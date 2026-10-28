package com.whoop.whooplive.selfie.camera;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import lh3.C24082e;
import xg3.C38280g;

/* JADX INFO: loaded from: classes11.dex */
public class TextureViewPreview extends TextureView implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: w */
    private C24082e f33597w;

    public TextureViewPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33597w = C24082e.m71000Y();
        m28916a();
    }

    /* JADX INFO: renamed from: a */
    private void m28916a() {
        setSurfaceTextureListener(this);
    }

    /* JADX INFO: renamed from: c */
    private void m28917c() {
        this.f33597w.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public C38280g<Boolean> m28918b() {
        return this.f33597w;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        m28917c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
        m28917c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
    }
}
