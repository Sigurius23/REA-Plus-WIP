package p580wd;

import p319m4.AbstractC25012a;
import p470rv.AbstractC31834n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C37150c extends AbstractC31834n {

    /* JADX INFO: renamed from: b */
    public final String f158900b;

    public C37150c(String str) {
        this.f158900b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37150c) && AbstractC22676k.m65745e(this.f158900b, ((C37150c) obj).f158900b);
    }

    public final int hashCode() {
        return this.f158900b.hashCode();
    }

    /* JADX INFO: renamed from: m */
    public final String m119069m() {
        return this.f158900b;
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("LoginSession(loginSessionName="), this.f158900b, ')');
    }
}
