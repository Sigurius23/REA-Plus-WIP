package p524ui;

import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ui.x */
/* JADX INFO: loaded from: classes.dex */
public final class C34996x implements InterfaceC34997y {

    /* JADX INFO: renamed from: a */
    public final String f148053a;

    public /* synthetic */ C34996x(String str) {
        this.f148053a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34996x) {
            return AbstractC22676k.m65745e(this.f148053a, ((C34996x) obj).f148053a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f148053a.hashCode();
    }

    public final String toString() {
        return AbstractC31061c.m95633i(')', "Url(url=", this.f148053a);
    }
}
