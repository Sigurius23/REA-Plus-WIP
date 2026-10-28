package b81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.InterfaceC23459e;
import p238j0.InterfaceC21083i;
import p490t0.C33252i;
import p715kotlin.jvm.functions.Function1;
import y71.AbstractC39270c;
import y71.C39271d;

/* JADX INFO: renamed from: b81.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C2801h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10986E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23459e f10987F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10988w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f10989x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f10990y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10991z;

    public /* synthetic */ C2801h(C33252i c33252i, long j7, C2803j c2803j, InterfaceC4339a interfaceC4339a, long j13) {
        this.f10991z = c33252i;
        this.f10989x = j7;
        this.f10986E = c2803j;
        this.f10987F = interfaceC4339a;
        this.f10990y = j13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10988w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2802i.m7981d((C33252i) this.f10991z, this.f10989x, (C2803j) this.f10986E, (InterfaceC4339a) this.f10987F, this.f10990y, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39270c.m125115h((C39271d) this.f10991z, (InterfaceC21083i) this.f10986E, (Function1) this.f10987F, this.f10989x, this.f10990y, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C2801h(C39271d c39271d, InterfaceC21083i interfaceC21083i, Function1 function1, long j7, long j13) {
        this.f10991z = c39271d;
        this.f10986E = interfaceC21083i;
        this.f10987F = function1;
        this.f10989x = j7;
        this.f10990y = j13;
    }
}
