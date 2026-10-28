package cw2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import i21.AbstractC18004n;
import java.util.List;
import k03.AbstractC22109n;
import p294l3.C23254g;
import p294l3.C23285v0;
import p335n6.InterfaceC26398o;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32637l2;
import qq2.AbstractC30553b;
import sk1.AbstractC32572a;
import sk1.C32573b;

/* JADX INFO: renamed from: cw2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11162c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f35724E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f35725F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f35726G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35727w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f35728x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f35729y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f35730z;

    public /* synthetic */ C11162c(Modifier modifier, C23254g c23254g, C23285v0 c23285v0, long j7, int i13, int i14) {
        this.f35727w = 5;
        this.f35726G = modifier;
        this.f35724E = c23254g;
        this.f35725F = c23285v0;
        this.f35728x = j7;
        this.f35729y = i13;
        this.f35730z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35727w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC11163d.m30260l((String) this.f35724E, (String) this.f35725F, this.f35728x, (Modifier) this.f35726G, this.f35729y, this.f35730z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18004n.m51682r((TextResource) this.f35724E, this.f35728x, (TextResource) this.f35725F, (List) this.f35726G, this.f35729y, this.f35730z, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC22109n.m63271H((InterfaceC26398o) this.f35726G, this.f35729y, this.f35728x, (String) this.f35724E, (String) this.f35725F, this.f35730z, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC30553b.m93703p((String) this.f35724E, this.f35728x, (Function1) this.f35725F, (InterfaceC4339a) this.f35726G, this.f35729y, this.f35730z, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC32572a.m101628c((C32573b) this.f35724E, (Modifier) this.f35726G, (C2886a) this.f35725F, this.f35728x, this.f35729y, this.f35730z, (Composer) obj, iIntValue5);
            default:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC32637l2.m101949Y((Modifier) this.f35726G, (C23254g) this.f35724E, (C23285v0) this.f35725F, this.f35728x, this.f35729y, this.f35730z, (Composer) obj, iIntValue6);
        }
    }

    public /* synthetic */ C11162c(Object obj, long j7, Object obj2, Object obj3, int i13, int i14, int i15) {
        this.f35727w = i15;
        this.f35724E = obj;
        this.f35728x = j7;
        this.f35725F = obj2;
        this.f35726G = obj3;
        this.f35729y = i13;
        this.f35730z = i14;
    }

    public /* synthetic */ C11162c(String str, String str2, long j7, Modifier modifier, int i13, int i14) {
        this.f35727w = 0;
        this.f35724E = str;
        this.f35725F = str2;
        this.f35728x = j7;
        this.f35726G = modifier;
        this.f35729y = i13;
        this.f35730z = i14;
    }

    public /* synthetic */ C11162c(InterfaceC26398o interfaceC26398o, int i13, long j7, String str, String str2, int i14) {
        this.f35727w = 2;
        this.f35726G = interfaceC26398o;
        this.f35729y = i13;
        this.f35728x = j7;
        this.f35724E = str;
        this.f35725F = str2;
        this.f35730z = i14;
    }

    public /* synthetic */ C11162c(C32573b c32573b, Modifier modifier, C2886a c2886a, long j7, int i13, int i14) {
        this.f35727w = 4;
        this.f35724E = c32573b;
        this.f35726G = modifier;
        this.f35725F = c2886a;
        this.f35728x = j7;
        this.f35729y = i13;
        this.f35730z = i14;
    }
}
