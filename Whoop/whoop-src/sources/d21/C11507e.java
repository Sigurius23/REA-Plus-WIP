package d21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gz0.AbstractC16306j;
import gz0.EnumC16302h;
import p355o2.C27430e;
import p715kotlin.jvm.functions.Function1;
import q01.AbstractC29745a;
import q01.C29746b;
import s41.AbstractC32195c;
import s41.C32196d;

/* JADX INFO: renamed from: d21.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11507e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f37018E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f37019F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f37020G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f37021H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f37022I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37023w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f37024x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f37025y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f37026z;

    public /* synthetic */ C11507e(Object obj, Function1 function1, Modifier modifier, float f13, C2886a c2886a, boolean z4, int i13, int i14, int i15) {
        this.f37023w = i15;
        this.f37019F = obj;
        this.f37020G = function1;
        this.f37021H = modifier;
        this.f37024x = f13;
        this.f37022I = c2886a;
        this.f37025y = z4;
        this.f37026z = i13;
        this.f37018E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37023w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC11508f.m30957i((C11509g) this.f37019F, (Function1) this.f37020G, (Modifier) this.f37021H, this.f37024x, (C2886a) this.f37022I, this.f37025y, this.f37026z, this.f37018E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16306j.m46257I((C27430e) this.f37019F, this.f37024x, (EnumC16302h) this.f37020G, this.f37025y, (String) this.f37021H, (InterfaceC4339a) this.f37022I, this.f37026z, this.f37018E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC29745a.m91192g((C29746b) this.f37019F, (Function1) this.f37020G, (Modifier) this.f37021H, this.f37024x, (C2886a) this.f37022I, this.f37025y, this.f37026z, this.f37018E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC32195c.m100136g((C32196d) this.f37019F, (Function1) this.f37020G, (Modifier) this.f37021H, this.f37024x, (C2886a) this.f37022I, this.f37025y, this.f37026z, this.f37018E, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C11507e(C27430e c27430e, float f13, EnumC16302h enumC16302h, boolean z4, String str, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f37023w = 1;
        this.f37019F = c27430e;
        this.f37024x = f13;
        this.f37020G = enumC16302h;
        this.f37025y = z4;
        this.f37021H = str;
        this.f37022I = interfaceC4339a;
        this.f37026z = i13;
        this.f37018E = i14;
    }
}
