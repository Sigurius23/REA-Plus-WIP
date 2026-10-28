package p521ue;

import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ue.b */
/* JADX INFO: loaded from: classes.dex */
public final class C34856b {

    /* JADX INFO: renamed from: a */
    public final String f146802a;

    /* JADX INFO: renamed from: a */
    public static String m109935a(String str) {
        return AbstractC31061c.m95633i(')', "AuthSchemeId(id=", str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34856b) {
            return AbstractC22676k.m65745e(this.f146802a, ((C34856b) obj).f146802a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f146802a.hashCode();
    }

    public final String toString() {
        return m109935a(this.f146802a);
    }
}
