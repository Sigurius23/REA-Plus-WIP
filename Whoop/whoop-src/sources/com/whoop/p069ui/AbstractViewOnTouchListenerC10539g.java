package com.whoop.p069ui;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.ui.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/ui/g;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Ll83/a0;", "c", "()V", "b", "d", "a", "Landroid/view/GestureDetector;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/view/GestureDetector;", "gestureDetector", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractViewOnTouchListenerC10539g implements View.OnTouchListener {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final GestureDetector gestureDetector;

    /* JADX INFO: renamed from: com.whoop.ui.g$a */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/ui/g$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lcom/whoop/ui/g;)V", "Landroid/view/MotionEvent;", "motionEvent", "", "onDown", "(Landroid/view/MotionEvent;)Z", "motionEvent1", "motionEvent2", "", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            AbstractC22676k.m65750j(motionEvent, "motionEvent");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent1, MotionEvent motionEvent2, float velocityX, float velocityY) {
            AbstractC22676k.m65750j(motionEvent2, "motionEvent2");
            if (motionEvent1 == null) {
                return false;
            }
            try {
                float y13 = motionEvent2.getY() - motionEvent1.getY();
                float x3 = motionEvent2.getX() - motionEvent1.getX();
                if (Math.abs(x3) > Math.abs(y13)) {
                    if (Math.abs(x3) > 100.0f && Math.abs(velocityX) > 100.0f) {
                        if (x3 > 0.0f) {
                            AbstractViewOnTouchListenerC10539g.this.mo19081c();
                        } else {
                            AbstractViewOnTouchListenerC10539g.this.mo19080b();
                        }
                        return true;
                    }
                } else if (Math.abs(y13) > 100.0f && Math.abs(velocityY) > 100.0f) {
                    if (y13 > 0.0f) {
                        AbstractViewOnTouchListenerC10539g.this.mo25737a();
                    } else {
                        AbstractViewOnTouchListenerC10539g.this.m27191d();
                    }
                    return true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return false;
        }
    }

    public AbstractViewOnTouchListenerC10539g(Context context) {
        this.gestureDetector = new GestureDetector(context, new a());
    }

    /* JADX INFO: renamed from: a */
    public void mo25737a() {
    }

    /* JADX INFO: renamed from: b */
    public void mo19080b() {
    }

    /* JADX INFO: renamed from: c */
    public void mo19081c() {
    }

    /* JADX INFO: renamed from: d */
    public void m27191d() {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (view != null) {
            view.performClick();
        }
        return this.gestureDetector.onTouchEvent(event);
    }
}
