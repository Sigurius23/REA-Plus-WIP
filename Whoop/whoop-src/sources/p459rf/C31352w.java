package p459rf;

import p091dg.C12002a;
import p423qf.C30318b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: rf.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C31352w {

    /* JADX INFO: renamed from: a */
    public final C12002a f128995a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30063j f128996b;

    /* JADX INFO: renamed from: c */
    public final C30318b f128997c;

    public C31352w(C12002a execContext, InterfaceC30063j callContext, C30318b metrics) {
        AbstractC22676k.m65750j(execContext, "execContext");
        AbstractC22676k.m65750j(callContext, "callContext");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.f128995a = execContext;
        this.f128996b = callContext;
        this.f128997c = metrics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31352w)) {
            return false;
        }
        C31352w c31352w = (C31352w) obj;
        return AbstractC22676k.m65745e(this.f128995a, c31352w.f128995a) && AbstractC22676k.m65745e(this.f128996b, c31352w.f128996b) && AbstractC22676k.m65745e(this.f128997c, c31352w.f128997c);
    }

    public final int hashCode() {
        return this.f128997c.hashCode() + ((this.f128996b.hashCode() + (this.f128995a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SdkRequestTag(execContext=" + this.f128995a + ", callContext=" + this.f128996b + ", metrics=" + this.f128997c + ')';
    }
}
