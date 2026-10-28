package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.google.crypto.tink.internal.C5099k0;

/* JADX INFO: renamed from: s.p */
/* JADX INFO: loaded from: classes.dex */
public final class C31992p {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f132796b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C31992p f132797c;

    /* JADX INFO: renamed from: a */
    public C31943c2 f132798a;

    /* JADX INFO: renamed from: a */
    public static synchronized C31992p m99505a() {
        try {
            if (f132797c == null) {
                m99507d();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f132797c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m99506c(int i13, PorterDuff.Mode mode) {
        return C31943c2.m99423e(i13, mode);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m99507d() {
        if (f132797c == null) {
            C31992p c31992p = new C31992p();
            f132797c = c31992p;
            c31992p.f132798a = C31943c2.m99422b();
            C31943c2 c31943c2 = f132797c.f132798a;
            C5099k0 c5099k0 = new C5099k0(6);
            synchronized (c31943c2) {
                c31943c2.f132652e = c5099k0;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m99508e(Drawable drawable, C31975k2 c31975k2, int[] iArr) {
        PorterDuff.Mode mode = C31943c2.f132645f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = c31975k2.f132746d;
        if (!z4 && !c31975k2.f132745c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterM99423e = null;
        ColorStateList colorStateList = z4 ? c31975k2.f132743a : null;
        PorterDuff.Mode mode2 = c31975k2.f132745c ? c31975k2.f132744b : C31943c2.f132645f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterM99423e = C31943c2.m99423e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterM99423e);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m99509b(Context context, int i13) {
        return this.f132798a.m99425c(context, i13);
    }
}
