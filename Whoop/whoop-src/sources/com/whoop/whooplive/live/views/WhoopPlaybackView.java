package com.whoop.whooplive.live.views;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.IOException;
import pz2.AbstractC29652e;
import pz2.AbstractC29653f;

/* JADX INFO: loaded from: classes11.dex */
public class WhoopPlaybackView extends ConstraintLayout implements MediaPlayer.OnPreparedListener, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: E */
    private boolean f33396E;

    /* JADX INFO: renamed from: F */
    private AudioAttributes f33397F;

    /* JADX INFO: renamed from: w */
    private Uri f33398w;

    /* JADX INFO: renamed from: x */
    private MediaPlayer f33399x;

    /* JADX INFO: renamed from: y */
    private Surface f33400y;

    /* JADX INFO: renamed from: z */
    private boolean f33401z;

    public WhoopPlaybackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33396E = true;
        m28652j();
    }

    /* JADX INFO: renamed from: j */
    private void m28652j() {
        View.inflate(getContext(), AbstractC29653f.f121184d, this);
        setBackgroundColor(-16777216);
        ((TextureView) findViewById(AbstractC29652e.f121154m0)).setSurfaceTextureListener(this);
        this.f33397F = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
    }

    /* JADX INFO: renamed from: m */
    private void m28653m(Uri uri) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f33399x = mediaPlayer;
            mediaPlayer.setOnPreparedListener(this);
            this.f33399x.setDataSource(getContext(), uri);
            this.f33399x.setSurface(this.f33400y);
            this.f33399x.setAudioAttributes(this.f33397F);
            this.f33399x.setLooping(true);
            this.f33399x.prepare();
        } catch (IOException | IllegalStateException e5) {
            Log.e("WhoopPlaybackView", "prepareMediaPlayer: ", e5);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m28654f() {
        Uri uri = this.f33398w;
        if (uri != null && uri.getPath() != null) {
            File file = new File(this.f33398w.getPath());
            if (file.exists()) {
                file.delete();
            }
            this.f33398w = null;
        }
        this.f33399x.reset();
        this.f33399x.release();
        this.f33399x = null;
    }

    /* JADX INFO: renamed from: k */
    public void m28655k(Uri uri) {
        this.f33401z = true;
        setFilePath(uri);
        setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    public void m28656l() {
        this.f33396E = true;
        MediaPlayer mediaPlayer = this.f33399x;
        if (mediaPlayer != null && this.f33401z && mediaPlayer.isPlaying()) {
            this.f33399x.pause();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m28657n() {
        MediaPlayer mediaPlayer;
        this.f33396E = false;
        if (!this.f33401z || (mediaPlayer = this.f33399x) == null) {
            return;
        }
        mediaPlayer.start();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        if (this.f33396E) {
            return;
        }
        this.f33399x.start();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i13, int i14) {
        this.f33400y = new Surface(surfaceTexture);
        Uri uri = this.f33398w;
        if (uri != null) {
            m28653m(uri);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f33400y = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i13, int i14) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setFilePath(Uri uri) {
        this.f33398w = uri;
        if (this.f33400y != null) {
            m28653m(uri);
        }
    }
}
