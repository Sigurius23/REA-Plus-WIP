package ph1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.models.ChatHeaderMetadata;
import nh1.C26722c;
import p291l0.InterfaceC23001u;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32673s3;
import q11.AbstractC29798h;
import q11.C29799i;
import y12.AbstractC39070c;
import zk2.AbstractC40854o;
import zz0.AbstractC41246g;
import zz0.C41248i;

/* JADX INFO: renamed from: ph1.h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29244h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f118331E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f118332F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118333w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f118334x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f118335y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f118336z;

    public /* synthetic */ C29244h(int i13, int i14, int i15, InterfaceC4339a interfaceC4339a, String str) {
        this.f118333w = 4;
        this.f118334x = i13;
        this.f118336z = i14;
        this.f118332F = str;
        this.f118335y = interfaceC4339a;
        this.f118331E = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f118333w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC29245i.m88773A((C26722c.e) this.f118332F, this.f118334x, (Function1) this.f118335y, this.f118336z, this.f118331E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC29798h.m91283r((C29799i) this.f118332F, this.f118334x, (Function1) this.f118335y, this.f118336z, this.f118331E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC32673s3.m102319s((InterfaceC23001u) this.f118332F, this.f118334x, this.f118336z, (InterfaceC4339a) this.f118335y, this.f118331E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC39070c.m124602k((ChatHeaderMetadata) this.f118332F, this.f118334x, (Modifier) this.f118335y, this.f118336z, this.f118331E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC40854o.m132399g(this.f118334x, this.f118336z, (String) this.f118332F, (InterfaceC4339a) this.f118335y, this.f118331E, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC41246g.m133968E((Modifier) this.f118332F, (C41248i) this.f118335y, this.f118334x, this.f118336z, this.f118331E, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ C29244h(Modifier modifier, C41248i c41248i, int i13, int i14, int i15) {
        this.f118333w = 5;
        this.f118332F = modifier;
        this.f118335y = c41248i;
        this.f118334x = i13;
        this.f118336z = i14;
        this.f118331E = i15;
    }

    public /* synthetic */ C29244h(Object obj, int i13, Object obj2, int i14, int i15, int i16) {
        this.f118333w = i16;
        this.f118332F = obj;
        this.f118334x = i13;
        this.f118335y = obj2;
        this.f118336z = i14;
        this.f118331E = i15;
    }

    public /* synthetic */ C29244h(InterfaceC23001u interfaceC23001u, int i13, int i14, InterfaceC4339a interfaceC4339a, int i15) {
        this.f118333w = 2;
        this.f118332F = interfaceC23001u;
        this.f118334x = i13;
        this.f118336z = i14;
        this.f118335y = interfaceC4339a;
        this.f118331E = i15;
    }
}
