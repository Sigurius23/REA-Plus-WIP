package no;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p484s9.C32284i;
import p484s9.InterfaceC32278c;

/* JADX INFO: renamed from: no.n */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC26881n extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC26870c, InterfaceC32278c {

    /* JADX INFO: renamed from: E */
    public final GestureDetector f107292E;

    /* JADX INFO: renamed from: G */
    public final Object f107294G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107295w = 0;

    /* JADX INFO: renamed from: x */
    public final PointF f107296x = new PointF();

    /* JADX INFO: renamed from: y */
    public final PointF f107297y = new PointF();

    /* JADX INFO: renamed from: z */
    public final float f107298z = 25.0f;

    /* JADX INFO: renamed from: F */
    public volatile float f107293F = 3.1415927f;

    public ViewOnTouchListenerC26881n(Context context, C26879l c26879l) {
        this.f107294G = c26879l;
        this.f107292E = new GestureDetector(context, this);
    }

    @Override // no.InterfaceC26870c, p484s9.InterfaceC32278c
    /* JADX INFO: renamed from: a */
    public final void mo80223a(float[] fArr, float f13) {
        switch (this.f107295w) {
            case 0:
                this.f107293F = -f13;
                break;
            default:
                this.f107293F = -f13;
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.f107295w) {
            case 0:
                this.f107296x.set(motionEvent.getX(), motionEvent.getY());
                break;
            default:
                this.f107296x.set(motionEvent.getX(), motionEvent.getY());
                break;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        switch (this.f107295w) {
            case 0:
                float x3 = (motionEvent2.getX() - this.f107296x.x) / this.f107298z;
                float y13 = motionEvent2.getY();
                PointF pointF = this.f107296x;
                float f15 = (y13 - pointF.y) / this.f107298z;
                pointF.set(motionEvent2.getX(), motionEvent2.getY());
                double d3 = this.f107293F;
                float fCos = (float) Math.cos(d3);
                float fSin = (float) Math.sin(d3);
                PointF pointF2 = this.f107297y;
                pointF2.x -= (fCos * x3) - (fSin * f15);
                float f16 = (fCos * f15) + (fSin * x3) + pointF2.y;
                pointF2.y = f16;
                pointF2.y = Math.max(-45.0f, Math.min(45.0f, f16));
                C26879l c26879l = (C26879l) this.f107294G;
                PointF pointF3 = this.f107297y;
                synchronized (c26879l) {
                    float f17 = pointF3.y;
                    c26879l.f107271G = f17;
                    Matrix.setRotateM(c26879l.f107269E, 0, -f17, (float) Math.cos(c26879l.f107272H), (float) Math.sin(c26879l.f107272H), 0.0f);
                    Matrix.setRotateM(c26879l.f107270F, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
                }
                return true;
            default:
                float x5 = (motionEvent2.getX() - this.f107296x.x) / this.f107298z;
                float y14 = motionEvent2.getY();
                PointF pointF4 = this.f107296x;
                float f18 = (y14 - pointF4.y) / this.f107298z;
                pointF4.set(motionEvent2.getX(), motionEvent2.getY());
                double d14 = this.f107293F;
                float fCos2 = (float) Math.cos(d14);
                float fSin2 = (float) Math.sin(d14);
                PointF pointF5 = this.f107297y;
                pointF5.x -= (fCos2 * x5) - (fSin2 * f18);
                float f19 = (fCos2 * f18) + (fSin2 * x5) + pointF5.y;
                pointF5.y = f19;
                pointF5.y = Math.max(-45.0f, Math.min(45.0f, f19));
                C26879l c26879l2 = (C26879l) this.f107294G;
                PointF pointF6 = this.f107297y;
                synchronized (c26879l2) {
                    float f24 = pointF6.y;
                    c26879l2.f107271G = f24;
                    Matrix.setRotateM(c26879l2.f107269E, 0, -f24, (float) Math.cos(c26879l2.f107272H), (float) Math.sin(c26879l2.f107272H), 0.0f);
                    Matrix.setRotateM(c26879l2.f107270F, 0, -pointF6.x, 0.0f, 1.0f, 0.0f);
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.f107295w) {
            case 0:
                return ((C26880m) ((C26879l) this.f107294G).f107276L).performClick();
            default:
                return ((C32284i) ((C26879l) this.f107294G).f107276L).performClick();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f107295w) {
            case 0:
                break;
        }
        return this.f107292E.onTouchEvent(motionEvent);
    }

    public ViewOnTouchListenerC26881n(Context context, C26879l c26879l, byte b) {
        this.f107294G = c26879l;
        this.f107292E = new GestureDetector(context, this);
    }
}
