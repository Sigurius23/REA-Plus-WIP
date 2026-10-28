package j02;

import android.os.Bundle;
import or2.AbstractC28152c1;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p715kotlin.Metadata;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: j02.n0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m65681d2 = {"", "", "a", "(Ljava/lang/String;)Z", "c", "(Ljava/lang/String;)Ljava/lang/String;", "launchSingleTop", "Leb/x0;", "e", "(Ljava/lang/String;Z)Leb/x0;", "Landroid/os/Bundle;", "b", "(Landroid/os/Bundle;)Ljava/lang/String;", "d", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21157n0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m59385a(String str) {
        return AbstractC39421y.m125921F(str, "PRESENT", true);
    }

    /* JADX INFO: renamed from: b */
    public static final String m59386b(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("navigationStyle");
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final String m59387c(String str) {
        if (str == null) {
            return "PRESENT";
        }
        if (AbstractC39414r.m125890i0(str)) {
            str = null;
        }
        return str == null ? "PRESENT" : str;
    }

    /* JADX INFO: renamed from: d */
    public static final String m59388d(Bundle bundle) {
        if (bundle != null) {
            return bundle.getString("settingsSource");
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final C12997x0 m59389e(String str, boolean z4) {
        C12995w0 c12995w0 = new C12995w0();
        if (m59385a(str)) {
            AbstractC28152c1.m85186d(c12995w0);
        } else {
            AbstractC28152c1.m85188f(c12995w0);
        }
        c12995w0.f44891a = z4;
        return c12995w0.m36508a();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C12997x0 m59390f(String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return m59389e(str, z4);
    }
}
