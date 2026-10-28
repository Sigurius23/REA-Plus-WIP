package jx0;

import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: jx0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22000c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85241w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22002e f85242x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C21998a f85243y;

    public /* synthetic */ C22000c(C22002e c22002e, C21998a c21998a, int i13) {
        this.f85241w = i13;
        this.f85242x = c22002e;
        this.f85243y = c21998a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f85241w) {
            case 0:
                return this.f85242x.m62871l(this.f85243y, (InterfaceC33687a) obj);
            case 1:
                return this.f85242x.m62875p(this.f85243y, (InterfaceC33687a) obj);
            default:
                return this.f85242x.m62874o(this.f85243y, (InterfaceC33687a) obj);
        }
    }
}
