package com.iterable.iterableapi;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.whoop.android.R;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: com.iterable.iterableapi.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC5373t0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21830w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C5379v0 f21831x;

    public /* synthetic */ RunnableC5373t0(C5379v0 c5379v0, int i13) {
        this.f21830w = i13;
        this.f21831x = c5379v0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13;
        switch (this.f21830w) {
            case 0:
                C5379v0 c5379v0 = this.f21831x;
                if (c5379v0.getContext() != null && c5379v0.getDialog() != null && c5379v0.getDialog().getWindow() != null) {
                    c5379v0.m16536z(new ColorDrawable(0), c5379v0.m16532B());
                    c5379v0.f21871w.setAlpha(1.0f);
                    c5379v0.f21871w.setVisibility(0);
                    if (c5379v0.f21868K) {
                        int iM35485e = AbstractC12682p.m35485e(C5379v0.m16529C(c5379v0.f21867J));
                        if (iM35485e == 0) {
                            i13 = R.anim.slide_down_custom;
                        } else if (iM35485e != 1) {
                            i13 = R.anim.fade_in_custom;
                            if (iM35485e != 2) {
                            }
                        } else {
                            i13 = R.anim.slide_up_custom;
                        }
                        try {
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(c5379v0.getContext(), i13);
                            animationLoadAnimation.setDuration(500L);
                            c5379v0.f21871w.startAnimation(animationLoadAnimation);
                        } catch (Exception unused) {
                            AbstractC12350b.m34595p("IterableInAppFragmentHTMLNotification", "Failed to show inapp with animation");
                            return;
                        }
                    }
                    break;
                }
                break;
            case 1:
                C5379v0 c5379v1 = this.f21831x;
                if (c5379v1.getContext() != null && c5379v1.getDialog() != null && c5379v1.getDialog().getWindow() != null) {
                    c5379v1.dismissAllowingStateLoss();
                    break;
                }
                break;
            default:
                C5379v0 c5379v2 = this.f21831x;
                C5332h2 c5332h2 = c5379v2.f21871w;
                if (c5332h2 == null) {
                    AbstractC12350b.m34579a0("IterableInAppFragmentHTMLNotification", "WebView is null, skipping resize");
                    break;
                } else {
                    float contentHeight = c5332h2.getContentHeight();
                    if (contentHeight <= 0.0f) {
                        AbstractC12350b.m34579a0("IterableInAppFragmentHTMLNotification", "Invalid content height: " + contentHeight + "dp, skipping resize");
                        break;
                    } else if (Math.abs(contentHeight - c5379v2.f21866I) < 1.0f) {
                        AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "Content height unchanged (" + contentHeight + "dp), skipping resize");
                        break;
                    } else {
                        c5379v2.f21866I = contentHeight;
                        AbstractC12350b.m34593n("IterableInAppFragmentHTMLNotification", "💚 Resizing in-app to height: " + contentHeight + "dp");
                        AbstractActivityC1340r0 activity = c5379v2.getActivity();
                        if (activity != null) {
                            activity.runOnUiThread(new RunnableC5376u0(c5379v2, activity, contentHeight));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
