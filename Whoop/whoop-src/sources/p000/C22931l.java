package p000;

import a11.AbstractC0139q;
import a42.C0378a;
import a80.AbstractC0548l;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bn0.C3497e;
import bo0.C3505c;
import bu2.AbstractC3652m;
import bu2.AbstractC3663x;
import bu2.C3653n;
import bu2.C3656q;
import c11.AbstractC3841h;
import c11.C3835b;
import c11.C3842i;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c42.C4180q;
import c42.C4181r;
import com.whoop.design.util.TextResource;
import com.whoop.pregnancy.view.PregnancySettingsFragment;
import com.whoop.profile.presentation.ProfileViewState;
import com.whoop.profile.view.ProfileScreenContentKt;
import com.whoop.stealthmode.view.StealthModeFragment;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cv1.C11146c;
import cy0.C11184c;
import d42.AbstractC11700p;
import dc3.C11923h;
import dn0.AbstractC12216p;
import eo2.AbstractC13393m;
import eo2.C13387g;
import ep1.AbstractC13413h;
import ep2.C13431c;
import eu2.AbstractC13658o;
import eu2.C13659p;
import ev1.AbstractC13687f;
import ey0.AbstractC13742i;
import f41.AbstractC14078p;
import f41.C14067e;
import f60.C14138c;
import g51.C15493c;
import gp2.AbstractC16069d;
import gp2.AbstractC16070e;
import h02.AbstractC16575h0;
import h02.C16577i0;
import h60.AbstractC16978g;
import hh2.C17296g;
import l83.C23454a0;
import o11.AbstractC27407m;
import p040c0.InterfaceC3747i0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p163g1.C15077m1;
import p180h0.AbstractC16387f1;
import p180h0.C16382e1;
import p180h0.C16401i0;
import p181h2.C16617b;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC22997s1;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.C28621h1;
import p390p1.C28655q;
import p390p1.InterfaceC28670t2;
import p512u2.C34472r;
import p541v2.C35560c;
import p668z1.C39967p;
import p698au1.AbstractC2072q;
import p700bd1.C3095m;
import p700bd1.C3096n;
import p706eo0.AbstractC13376g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import pv0.C29577d;
import q83.AbstractC30060g;
import sb3.AbstractC32350a;
import y70.C39267c;
import zt1.C41127b;
import zt1.InterfaceC41128c;

/* JADX INFO: renamed from: l */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C22931l implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90504w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f90505x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f90506y;

    public /* synthetic */ C22931l(int i13, Object obj, Object obj2) {
        this.f90504w = i13;
        this.f90505x = obj;
        this.f90506y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f90504w) {
            case 0:
                C29577d c29577d = (C29577d) this.f90505x;
                Function1 function1 = (Function1) this.f90506y;
                InterfaceC1103a item = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC22676k.m65750j(item, "$this$item");
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    TextResource errorText = c29577d.getErrorText();
                    TextResource retryButtonText = c29577d.getRetryButtonText();
                    TextResource searchQuery = c29577d.getSearchQuery();
                    int i13 = TextResource.$stable;
                    AbstractC37785x.m121282c(errorText, retryButtonText, searchQuery, function1, c28655q, (i13 << 3) | i13 | (i13 << 6));
                } else {
                    c28655q.m87138X();
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC0139q.m336x((TextResource) this.f90505x, (C15077m1) this.f90506y, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return AbstractC0548l.m1350l((C39267c.a) this.f90505x, (Function1) this.f90506y, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return AbstractC2072q.m6515A((C41127b) this.f90505x, (Function1) this.f90506y, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return AbstractC2072q.m6516B((Function1) this.f90506y, (InterfaceC41128c.c) this.f90505x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return C3095m.m8874e((C3096n) this.f90505x, (C3095m) this.f90506y, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return AbstractC3652m.m11273g((C3653n) this.f90505x, (Function1) this.f90506y, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                return AbstractC3663x.m11311o((C3656q) this.f90505x, (Function1) this.f90506y, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 8:
                return AbstractC3841h.m11724b0((C3842i) this.f90505x, (C3835b) this.f90506y, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 9:
                return AbstractC3841h.m11702H((C3842i) this.f90505x, (Function1) this.f90506y, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 10:
                return AbstractC4106r2.m12650i((C4092p2) this.f90505x, (C25306o) this.f90506y, (InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                return PregnancySettingsFragment.m23318x0((C4181r) this.f90505x, (C0378a) this.f90506y, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 12:
                return ProfileScreenContentKt.ProfileContentArea$lambda$4$0$1((ProfileViewState.ScreenContent) this.f90505x, (Function1) this.f90506y, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 13:
                return AbstractC10757a.m28143G((C12991u0) this.f90505x, (InterfaceC28670t2) this.f90506y, (StrengthTrainerDestination.C10746i.a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 14:
                return AbstractC10757a.m28151O((Function3) this.f90505x, (StrengthTrainerDestination) this.f90506y, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 15:
                return AbstractC11700p.m31248W((C4180q) this.f90505x, (Function1) this.f90506y, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 16:
                return AbstractC12216p.m33894U((C3497e) this.f90505x, (C28621h1) this.f90506y, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13376g.m37687I((C3505c) this.f90505x, (Function1) this.f90506y, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13393m.m37811p((C13387g) this.f90505x, (Function1) this.f90506y, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13413h.m37952u((C15493c) this.f90505x, (C39967p) this.f90506y, ((Integer) obj).intValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 20:
                return AbstractC13658o.m38519i((C13659p) this.f90505x, (Modifier) this.f90506y, (AbstractC27407m.b) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 21:
                return AbstractC13687f.m38626d(null, (C11146c) this.f90505x, (Function1) this.f90506y, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13742i.m39074p((C11184c) this.f90505x, (Function1) this.f90506y, (InterfaceC23013y) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC14078p.m40079b0((Function1) this.f90506y, (C14067e) this.f90505x, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue());
            case 24:
                return AbstractC16069d.m45379d(null, (C13431c) this.f90505x, (Function1) this.f90506y, ((Boolean) obj).booleanValue(), (Composer) obj2, ((Integer) obj3).intValue());
            case 25:
                return AbstractC16070e.m45393m((C13431c.a) this.f90505x, (Function1) this.f90506y, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 26:
                AbstractC16387f1 abstractC16387f1 = (AbstractC16387f1) this.f90505x;
                C35560c c35560c = (C35560c) this.f90506y;
                C34472r c34472r = (C34472r) obj;
                C34472r c34472r2 = (C34472r) obj2;
                C16617b c16617b = (C16617b) obj3;
                abstractC16387f1.f63013X = 0L;
                if (((Boolean) abstractC16387f1.f63007R.invoke(c34472r)).booleanValue()) {
                    if (!abstractC16387f1.f63012W) {
                        if (abstractC16387f1.f63010U == null) {
                            abstractC16387f1.f63010U = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
                        }
                        abstractC16387f1.f63012W = true;
                        AbstractC3006f0.m8732z(abstractC16387f1.m7158L0(), null, null, new C16382e1(abstractC16387f1, null), 3);
                    }
                    AbstractC32350a.m100694a(c35560c, c34472r, 0L);
                    long jM47191g = C16617b.m47191g(c34472r2.f144817c, c16617b.f63937a);
                    C11923h c11923h = abstractC16387f1.f63010U;
                    if (c11923h != null) {
                        c11923h.mo32218s(new C16401i0(jM47191g));
                    }
                }
                return C23454a0.f92919a;
            case 27:
                return AbstractC16575h0.m46987w((C16577i0) this.f90505x, (Function1) this.f90506y, (InterfaceC22996s0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 28:
                return AbstractC16978g.m47779r((C14138c.c) this.f90505x, (Function1) this.f90506y, (InterfaceC23004v) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return StealthModeFragment.m26099M((C17296g) this.f90505x, (StealthModeFragment) this.f90506y, (C12982q) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ C22931l(Function1 function1, Object obj, int i13) {
        this.f90504w = i13;
        this.f90506y = function1;
        this.f90505x = obj;
    }
}
