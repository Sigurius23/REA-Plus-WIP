package dn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p745y81.InterfaceC39332e;
import qy0.AbstractC30773f;
import xo1.AbstractC38493b;
import zq0.AbstractC40972m;

/* JADX INFO: renamed from: dn0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12201a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f40759E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f40760F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f40761G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40762w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f40763x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f40764y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f40765z;

    public /* synthetic */ C12201a(List list, List list2, float f13, float f14, Function1 function1, int i13) {
        this.f40762w = 3;
        this.f40763x = list;
        this.f40764y = list2;
        this.f40759E = f13;
        this.f40760F = f14;
        this.f40765z = function1;
        this.f40761G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f40762w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12208h.m33824G((InterfaceC39332e) this.f40763x, (InterfaceC39332e) this.f40764y, (InterfaceC39332e) this.f40765z, this.f40759E, this.f40760F, this.f40761G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30773f.m94547u((InterfaceC39332e) this.f40763x, (InterfaceC39332e) this.f40764y, (InterfaceC39332e) this.f40765z, this.f40759E, this.f40760F, this.f40761G, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38493b.m123337G((InterfaceC39332e) this.f40763x, (InterfaceC39332e) this.f40764y, (InterfaceC39332e) this.f40765z, this.f40759E, this.f40760F, this.f40761G, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC40972m.m133025l((List) this.f40763x, (List) this.f40764y, this.f40759E, this.f40760F, (Function1) this.f40765z, this.f40761G, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C12201a(InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, float f13, float f14, int i13, int i14) {
        this.f40762w = i14;
        this.f40763x = interfaceC39332e;
        this.f40764y = interfaceC39332e2;
        this.f40765z = interfaceC39332e3;
        this.f40759E = f13;
        this.f40760F = f14;
        this.f40761G = i13;
    }
}
