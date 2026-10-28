package a81;

import a01.C0088h;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import ay1.AbstractC2154b;
import az1.AbstractC2173n;
import bf0.AbstractC3194f;
import bj1.C3330a;
import bj1.C3332c;
import bk2.AbstractC3360g;
import bm2.AbstractC3442g0;
import bu2.EnumC3642c0;
import c51.AbstractC4226c;
import c51.C4242s;
import c51.InterfaceC4245v;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ce0.AbstractC4489d;
import cj1.InterfaceC4751g;
import ck1.AbstractC4787j;
import ck1.AbstractC4788k;
import cm2.C4820h;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.ModalAnalyticEventModel;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import com.whoop.profile.view.edit.EditProfileAvatarSectionKt;
import cy0.C11184c;
import d11.AbstractC11471f;
import d11.C11474i;
import do0.AbstractC12230d;
import e02.C12511g;
import e81.AbstractC12836k;
import ej1.AbstractC13257t;
import ek2.AbstractC13304a;
import eu2.AbstractC13653j;
import eu2.C13645b;
import ey0.AbstractC13740g;
import ey0.AbstractC13742i;
import f02.AbstractC13916b;
import f51.AbstractC14093d;
import f51.C14094e;
import fe0.AbstractC14415e;
import fi0.InterfaceC14515a;
import fz2.AbstractC14892a;
import h91.C17027b;
import hz2.InterfaceC17819d;
import j02.InterfaceC21153l0;
import java.util.List;
import kotlin.AbstractC2005g0;
import kotlin.AbstractC2016m;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p163g1.C15093n7;
import p163g1.C15199y3;
import p291l0.InterfaceC23013y;
import p698au1.AbstractC2072q;
import p699b70.C2779e;
import p704dk2.AbstractC12123j;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25307p;
import p745y81.EnumC39333f;
import ys2.AbstractC39758e;
import yx1.C39845f;
import ze0.AbstractC40584c;
import zn0.C40905c;
import zt1.InterfaceC41128c;

/* JADX INFO: renamed from: a81.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0555f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f1915E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f1916F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f1917G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1918w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1919x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1920y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1921z;

    public /* synthetic */ C0555f(Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14, int i15) {
        this.f1918w = i15;
        this.f1917G = obj;
        this.f1919x = obj2;
        this.f1920y = obj3;
        this.f1921z = obj4;
        this.f1915E = i13;
        this.f1916F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1918w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC0564o.m1393O((DialogModel) this.f1917G, (Function1) this.f1919x, (ModalAnalyticEventModel) this.f1920y, (InterfaceC14515a) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC0567r.m1451l((ToastModal) this.f1917G, (Function1) this.f1919x, (ModalAnalyticEventModel) this.f1920y, (InterfaceC14515a) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC2016m.m6259j0((AbstractC39758e) this.f1917G, (C12991u0) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC2016m.m6279t0((AbstractC39758e) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (InterfaceC4339a) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC2005g0.m6170F((AbstractC39758e.k) this.f1917G, (EnumC3642c0) this.f1920y, (EnumC39333f) this.f1921z, (Function1) this.f1919x, this.f1915E, this.f1916F, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC2072q.m6524J((InterfaceC41128c) this.f1917G, (InterfaceC4339a) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC2072q.m6519E((InterfaceC23013y) this.f1917G, (InterfaceC41128c.c) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC2154b.m6708g((C39845f) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC2173n.m6797C((String) this.f1917G, (InterfaceC21153l0) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return p699b70.Function1.m7867x((C2779e) this.f1917G, (Modifier) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC3194f.m9197k((AbstractC40584c.e.b) this.f1917G, (InterfaceC4339a) this.f1920y, (InterfaceC4339a) this.f1921z, (Function1) this.f1919x, this.f1915E, this.f1916F, (Composer) obj, iIntValue11);
            case 11:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC3442g0.m10058n((C4820h) this.f1917G, (InterfaceC4339a) this.f1919x, (InterfaceC4339a) this.f1920y, (C15093n7) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue12);
            case 12:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC4226c.m13114x((C4242s) this.f1917G, (Modifier) this.f1919x, (Modifier) this.f1920y, (InterfaceC4245v) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue13);
            case 13:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC4787j.m15119m((AbstractC4788k) this.f1917G, (InterfaceC4339a) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue14);
            case 14:
                int iIntValue15 = ((Integer) obj2).intValue();
                return EditProfileAvatarSectionKt.EditProfileAvatarSection$lambda$3((EditProfileViewState.EditProfileData) this.f1917G, (Function1) this.f1919x, (InterfaceC4339a) this.f1920y, (Modifier) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue15);
            case 15:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC11471f.m30793r((C11474i) this.f1917G, (Modifier) this.f1919x, (InterfaceC4339a) this.f1920y, (InterfaceC4339a) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue16);
            case 16:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC12123j.m33535I((AbstractC3360g.c) this.f1917G, (InterfaceC4339a) this.f1920y, (Function1) this.f1919x, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue17);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC12230d.m34007n((C40905c) this.f1917G, (Function1) this.f1919x, (InterfaceC4339a) this.f1920y, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue18);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC12836k.m35978K((List) this.f1917G, (C0088h) this.f1920y, (Modifier) this.f1921z, (Function1) this.f1919x, this.f1915E, this.f1916F, (Composer) obj, iIntValue19);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC13257t.m37278m((InterfaceC4751g.k) this.f1917G, (C3332c) this.f1920y, (C3330a) this.f1921z, (Function1) this.f1919x, this.f1915E, this.f1916F, (Composer) obj, iIntValue20);
            case 20:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC13304a.m37376o((C17027b) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (InterfaceC4339a) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue21);
            case 21:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC13653j.m38494f((Modifier) this.f1917G, (C13645b) this.f1920y, (C13645b) this.f1921z, (Function1) this.f1919x, this.f1915E, this.f1916F, (Composer) obj, iIntValue22);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC13740g.m39046t((C11184c.d) this.f1917G, (Function1) this.f1919x, (String) this.f1920y, (C13821r1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue23);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                int iIntValue24 = ((Integer) obj2).intValue();
                return AbstractC13742i.m39076r((C11184c) this.f1917G, (Function1) this.f1919x, (C15199y3) this.f1920y, (String) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue24);
            case 24:
                int iIntValue25 = ((Integer) obj2).intValue();
                return AbstractC13916b.m39655l((C12511g) this.f1917G, (String) this.f1920y, (Function1) this.f1919x, (Modifier) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue25);
            case 25:
                int iIntValue26 = ((Integer) obj2).intValue();
                return AbstractC14093d.m40143o((Modifier) this.f1917G, (C14094e) this.f1920y, (C25307p) this.f1921z, (Function1) this.f1919x, this.f1915E, this.f1916F, (Composer) obj, iIntValue26);
            case 26:
                int iIntValue27 = ((Integer) obj2).intValue();
                return AbstractC14415e.m41076Q((AbstractC4489d.c) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue27);
            case 27:
                int iIntValue28 = ((Integer) obj2).intValue();
                return AbstractC14415e.m41083X((AbstractC4489d) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (Function1) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue28);
            case 28:
                int iIntValue29 = ((Integer) obj2).intValue();
                return AbstractC14892a.m42987j((InterfaceC17819d) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (Modifier) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue29);
            default:
                int iIntValue30 = ((Integer) obj2).intValue();
                return AbstractC14892a.m42993p((InterfaceC17819d.b) this.f1917G, (Function1) this.f1919x, (Function1) this.f1920y, (Modifier) this.f1921z, this.f1915E, this.f1916F, (Composer) obj, iIntValue30);
        }
    }

    public /* synthetic */ C0555f(Object obj, Object obj2, Object obj3, Function1 function1, int i13, int i14, int i15) {
        this.f1918w = i15;
        this.f1917G = obj;
        this.f1920y = obj2;
        this.f1921z = obj3;
        this.f1919x = function1;
        this.f1915E = i13;
        this.f1916F = i14;
    }

    public /* synthetic */ C0555f(Object obj, Object obj2, Function1 function1, Object obj3, int i13, int i14, int i15) {
        this.f1918w = i15;
        this.f1917G = obj;
        this.f1920y = obj2;
        this.f1919x = function1;
        this.f1921z = obj3;
        this.f1915E = i13;
        this.f1916F = i14;
    }
}
