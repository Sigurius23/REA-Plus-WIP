package jz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import s21.AbstractC32084g;
import s21.EnumC32086i;

/* JADX INFO: renamed from: jz0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22068a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f85579E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f85580F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f85581G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f85582H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85583w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f85584x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f85585y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f85586z;

    public /* synthetic */ C22068a(int i13, int i14, Modifier modifier, long j7, long j13, int i15, int i16) {
        this.f85584x = i13;
        this.f85585y = i14;
        this.f85582H = modifier;
        this.f85586z = j7;
        this.f85579E = j13;
        this.f85580F = i15;
        this.f85581G = i16;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f85583w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22070c.m63139e(this.f85584x, this.f85585y, (Modifier) this.f85582H, this.f85586z, this.f85579E, this.f85580F, this.f85581G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32084g.m99808p((EnumC32086i) this.f85582H, this.f85584x, this.f85585y, this.f85586z, this.f85579E, this.f85580F, this.f85581G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C22068a(EnumC32086i enumC32086i, int i13, int i14, long j7, long j13, int i15, int i16) {
        this.f85582H = enumC32086i;
        this.f85584x = i13;
        this.f85585y = i14;
        this.f85586z = j7;
        this.f85579E = j13;
        this.f85580F = i15;
        this.f85581G = i16;
    }
}
