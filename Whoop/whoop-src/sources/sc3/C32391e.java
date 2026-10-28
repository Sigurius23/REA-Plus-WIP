package sc3;

import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29718h0;

/* JADX INFO: renamed from: sc3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C32391e implements InterfaceC32403q {

    /* JADX INFO: renamed from: a */
    public final Object f134134a;

    /* JADX INFO: renamed from: b */
    public final C29718h0 f134135b;

    public C32391e(Object obj, C29718h0 c29718h0) {
        this.f134134a = obj;
        this.f134135b = c29718h0;
    }

    @Override // sc3.InterfaceC32403q
    public final boolean test(Object obj) {
        return AbstractC22676k.m65745e(this.f134135b.invoke(obj), this.f134134a);
    }
}
