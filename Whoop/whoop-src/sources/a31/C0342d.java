package a31;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import fo2.AbstractC14665c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: a31.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0342d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f1201E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f1202F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f1203G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f1204H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f1205I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1206w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f1207x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f1208y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f1209z;

    public /* synthetic */ C0342d(int i13, int i14, int i15, boolean z4, String str, String str2, Function1 function1, int i16) {
        this.f1207x = i13;
        this.f1208y = i14;
        this.f1209z = i15;
        this.f1201E = z4;
        this.f1204H = str;
        this.f1205I = str2;
        this.f1202F = function1;
        this.f1203G = i16;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1206w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC0344f.m882k(this.f1207x, this.f1208y, (Integer) this.f1204H, this.f1201E, this.f1202F, (InterfaceC4339a) this.f1205I, this.f1209z, this.f1203G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC14665c.m41899m(this.f1207x, this.f1208y, this.f1209z, this.f1201E, (String) this.f1204H, (String) this.f1205I, this.f1202F, this.f1203G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C0342d(int i13, int i14, Integer num, boolean z4, Function1 function1, InterfaceC4339a interfaceC4339a, int i15, int i16) {
        this.f1207x = i13;
        this.f1208y = i14;
        this.f1204H = num;
        this.f1201E = z4;
        this.f1202F = function1;
        this.f1205I = interfaceC4339a;
        this.f1209z = i15;
        this.f1203G = i16;
    }
}
