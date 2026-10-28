package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.model.FeatureEducationParagraph;
import com.whoop.design.util.TextResource;
import fg2.AbstractC14465g;
import io.sentry.config.AbstractC20301a;
import iw0.AbstractC20962c0;
import iw0.C20994z;
import l83.C23454a0;
import nq2.AbstractC27062e;
import nq2.C27058a;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p748zc1.AbstractC40358i5;
import q21.AbstractC29844c;
import re1.AbstractC31323j;
import tp1.C34071k;
import vp1.AbstractC36272h;
import z01.AbstractC39942c;
import z01.C39943d;

/* JADX INFO: renamed from: b30.k4 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2559k4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f9938E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f9939F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f9940G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9941w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9942x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f9943y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f9944z;

    public /* synthetic */ C2559k4(Modifier modifier, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f9941w = 1;
        this.f9942x = modifier;
        this.f9943y = z4;
        this.f9944z = z13;
        this.f9940G = interfaceC4339a;
        this.f9938E = i13;
        this.f9939F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9941w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC20301a.m56343k((String) this.f9940G, (Modifier) this.f9942x, this.f9943y, this.f9944z, (Composer) obj, AbstractC28683x.m87244L(this.f9938E | 1), this.f9939F);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14465g.m41242m((Modifier) this.f9942x, this.f9943y, this.f9944z, (InterfaceC4339a) this.f9940G, this.f9938E, this.f9939F, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC20962c0.m58254k((C20994z) this.f9940G, (Function1) this.f9942x, this.f9943y, this.f9944z, this.f9938E, this.f9939F, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC27062e.m81314L((Modifier) this.f9942x, (C27058a) this.f9940G, this.f9943y, this.f9944z, this.f9938E, this.f9939F, (Composer) obj, iIntValue3);
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC29844c.m91348l((InterfaceC22997s1) this.f9940G, (TextResource) this.f9942x, this.f9943y, this.f9944z, this.f9938E, this.f9939F, (Composer) obj, iIntValue4);
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC29844c.m91356t((InterfaceC22997s1) this.f9942x, (String) this.f9940G, this.f9943y, this.f9944z, this.f9938E, this.f9939F, (Composer) obj, iIntValue5);
            case 6:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC31323j.m96335I((FeatureEducationParagraph) this.f9940G, (Function1) this.f9942x, this.f9943y, this.f9944z, this.f9938E, this.f9939F, (Composer) obj, iIntValue6);
            case 7:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC36272h.m115888w0((C34071k) this.f9940G, this.f9943y, this.f9944z, (Function1) this.f9942x, this.f9938E, this.f9939F, (Composer) obj, iIntValue7);
            case 8:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC39942c.m128110e((C39943d.a) this.f9940G, this.f9943y, this.f9944z, (Modifier) this.f9942x, this.f9938E, this.f9939F, (Composer) obj, iIntValue8);
            default:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC40358i5.m129946H((String) this.f9940G, this.f9943y, this.f9944z, (Function1) this.f9942x, this.f9938E, this.f9939F, (Composer) obj, iIntValue9);
        }
    }

    public /* synthetic */ C2559k4(Object obj, Object obj2, boolean z4, boolean z13, int i13, int i14, int i15) {
        this.f9941w = i15;
        this.f9940G = obj;
        this.f9942x = obj2;
        this.f9943y = z4;
        this.f9944z = z13;
        this.f9938E = i13;
        this.f9939F = i14;
    }

    public /* synthetic */ C2559k4(Object obj, Object obj2, boolean z4, boolean z13, int i13, int i14, int i15, boolean z14) {
        this.f9941w = i15;
        this.f9942x = obj;
        this.f9940G = obj2;
        this.f9943y = z4;
        this.f9944z = z13;
        this.f9938E = i13;
        this.f9939F = i14;
    }

    public /* synthetic */ C2559k4(Object obj, boolean z4, boolean z13, Object obj2, int i13, int i14, int i15) {
        this.f9941w = i15;
        this.f9940G = obj;
        this.f9943y = z4;
        this.f9944z = z13;
        this.f9942x = obj2;
        this.f9938E = i13;
        this.f9939F = i14;
    }
}
