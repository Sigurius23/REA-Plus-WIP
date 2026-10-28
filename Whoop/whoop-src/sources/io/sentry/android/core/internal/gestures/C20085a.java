package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.C20381c;
import io.sentry.internal.gestures.EnumC20380b;
import io.sentry.internal.gestures.InterfaceC20379a;
import io.sentry.util.C20584f;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20085a implements InterfaceC20379a {

    /* JADX INFO: renamed from: a */
    public final C20584f f75448a;

    public C20085a(C20584f c20584f) {
        this.f75448a = c20584f;
    }

    @Override // io.sentry.internal.gestures.InterfaceC20379a
    /* JADX INFO: renamed from: a */
    public final C20381c mo55964a(View view, float f13, float f14, EnumC20380b enumC20380b) {
        if (view != null) {
            if (enumC20380b == EnumC20380b.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new C20381c(view, AbstractC34132o.m107893v(view), AbstractC20093i.m55972b(view), null, "old_view_system");
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (enumC20380b == EnumC20380b.SCROLLABLE) {
                boolean z4 = false;
                if (((!((Boolean) this.f75448a.m56714a()).booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
                    z4 = true;
                }
                if (z4) {
                    try {
                        return new C20381c(view, AbstractC34132o.m107893v(view), AbstractC20093i.m55972b(view), null, "old_view_system");
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
            }
        }
        return null;
    }
}
