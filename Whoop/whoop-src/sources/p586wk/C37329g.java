package p586wk;

import android.text.TextUtils;
import p249jc.C21565a;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: wk.g */
/* JADX INFO: loaded from: classes.dex */
public final class C37329g {

    /* JADX INFO: renamed from: e */
    public static final C21565a f159590e = new C21565a(28);

    /* JADX INFO: renamed from: a */
    public final Object f159591a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC37328f f159592b;

    /* JADX INFO: renamed from: c */
    public final String f159593c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f159594d;

    public C37329g(String str, Object obj, InterfaceC37328f interfaceC37328f) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f159593c = str;
        this.f159591a = obj;
        this.f159592b = interfaceC37328f;
    }

    /* JADX INFO: renamed from: a */
    public static C37329g m119568a(Object obj, String str) {
        return new C37329g(str, obj, f159590e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C37329g) {
            return this.f159593c.equals(((C37329g) obj).f159593c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f159593c.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f159593c, "'}", new StringBuilder("Option{key='"));
    }
}
