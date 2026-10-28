package p132f0;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import p095dp.AbstractC12240d;

/* JADX INFO: renamed from: f0.x */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13835x {

    /* JADX INFO: renamed from: a */
    public static final long f49360a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public static final boolean m39192a(AbstractC13789h abstractC13789h) {
        ViewParent parent = AbstractC12240d.m34057W(abstractC13789h).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
