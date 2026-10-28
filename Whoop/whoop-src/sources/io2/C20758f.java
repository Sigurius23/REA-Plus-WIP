package io2;

import p270k2.InterfaceC22131e;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import us1.C35219b;

/* JADX INFO: renamed from: io2.f */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20758f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77967w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f77968x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f77969y;

    public /* synthetic */ C20758f(int i13, long j7, boolean z4) {
        this.f77967w = i13;
        this.f77968x = z4;
        this.f77969y = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f77967w) {
            case 0:
                return AbstractC20760g.m57165g(this.f77968x, this.f77969y, (InterfaceC22131e) obj);
            default:
                return C35219b.m111584w(this.f77968x, this.f77969y, (InterfaceC33687a) obj);
        }
    }
}
