package cz0;

import e61.AbstractC12770m;
import j61.C21369c;
import java.util.List;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: cz0.m */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11252m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f36098E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36099w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f36100x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f36101y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f36102z;

    public /* synthetic */ C11252m(long j7, C21369c c21369c, float f13, float f14) {
        this.f36100x = j7;
        this.f36098E = c21369c;
        this.f36101y = f13;
        this.f36102z = f14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36099w) {
            case 0:
                return AbstractC11254o.m30385q((List) this.f36098E, this.f36100x, this.f36101y, this.f36102z, (InterfaceC22131e) obj);
            default:
                return AbstractC12770m.m35799l(this.f36100x, (C21369c) this.f36098E, this.f36101y, this.f36102z, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C11252m(List list, long j7, float f13, float f14) {
        this.f36098E = list;
        this.f36100x = j7;
        this.f36101y = f13;
        this.f36102z = f14;
    }
}
