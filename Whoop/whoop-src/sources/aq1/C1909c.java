package aq1;

import android.app.DatePickerDialog;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1601k1;
import bb2.AbstractC2926b;
import bc3.InterfaceC2994c0;
import bd2.C3108a;
import bv1.C3671a;
import bv1.C3673c;
import by0.C3691a;
import by0.C3693c;
import by1.AbstractC3697d;
import c42.C4167d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.bot.settings.CoachSettingsViewState;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cy0.InterfaceC11182a;
import d42.AbstractC11694j;
import dp0.InterfaceC12251g;
import e60.C12756a;
import ec3.InterfaceC13087t1;
import ef1.C13147c;
import eq2.C13563a;
import ev1.AbstractC13689h;
import ey0.AbstractC13742i;
import f60.C14137b;
import fi0.InterfaceC14515a;
import g11.AbstractC15219c;
import g80.C15565f;
import gf1.AbstractC15788g;
import gr1.C16096c;
import h20.C16629b1;
import h40.C16839e;
import h40.C16845k;
import h60.AbstractC16979h;
import hd2.C17202d;
import hv2.AbstractC17687i;
import hv2.C17679a;
import i21.AbstractC18004n;
import id2.AbstractC18435t;
import j22.AbstractC21256e;
import java.time.LocalDate;
import java.util.List;
import jr1.AbstractC21897e;
import jr1.AbstractC21898f;
import k22.C22164d;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lr2.C24702c;
import n40.AbstractC26268h;
import nl0.C26809k;
import nl0.EnumC26811m;
import no0.AbstractC26958l0;
import nv1.AbstractC27169c;
import ny0.C27256h;
import ox2.AbstractC28459e;
import p078d1.C11457j;
import p114eb.C12991u0;
import p162g0.AbstractC14929f;
import p162g0.C14926c;
import p291l0.C22976l1;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23200x1;
import p292l1.C23132m;
import p292l1.C23154p3;
import p292l1.C23209y4;
import p292l1.InterfaceC23165r2;
import p31.C28801l;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import p547v8.AbstractC35785b;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p717lq2.AbstractC24686r;
import p745y81.EnumC39333f;
import px2.AbstractC29599b;
import px2.InterfaceC29603f;
import q12.AbstractC29803d;
import q90.AbstractC30068a;
import rs2.AbstractC31797c;
import y11.C39065r;
import yp1.AbstractC39703b;
import zu1.C41153f;

/* JADX INFO: renamed from: aq1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C1909c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f7544E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f7545F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f7546G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7547w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7548x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f7549y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f7550z;

    public /* synthetic */ C1909c(TextResource textResource, TextResource textResource2, String str, Function1 function1, Function1 function2, int i13) {
        this.f7547w = 3;
        this.f7550z = textResource;
        this.f7546G = textResource2;
        this.f7548x = str;
        this.f7544E = function1;
        this.f7545F = function2;
        this.f7549y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7547w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC1912f.m5870z((AbstractC39703b.c) this.f7550z, (String) this.f7548x, (Function1) this.f7544E, (Function1) this.f7545F, (Function1) this.f7546G, this.f7549y, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC34870c0.m109997g((String) this.f7548x, (String) this.f7550z, (String) this.f7544E, (String) this.f7545F, (Modifier) this.f7546G, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC2926b.m8537g((AbstractC22403o) this.f7550z, (TextResource) this.f7548x, (TextResource) this.f7544E, (TextResource) this.f7545F, (InterfaceC4339a) this.f7546G, this.f7549y, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC3697d.m11506g((TextResource) this.f7550z, (TextResource) this.f7546G, (String) this.f7548x, (Function1) this.f7544E, (Function1) this.f7545F, this.f7549y, (Composer) obj, iIntValue3);
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$1((CoachSettingsViewState.Success) this.f7550z, (Function1) this.f7544E, (InterfaceC4339a) this.f7548x, (InterfaceC4339a) this.f7545F, (C12991u0) this.f7546G, this.f7549y, (Composer) obj, iIntValue4);
            case 5:
                ((Integer) obj2).getClass();
                AbstractC22674j.m65729o((C22976l1) this.f7550z, (Function3) this.f7548x, (Modifier) this.f7544E, (C37816b) this.f7545F, (C37816b) this.f7546G, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC22674j.m65724j((C22976l1) this.f7550z, (Function3) this.f7548x, (Modifier) this.f7544E, (C16629b1) this.f7545F, (C37816b) this.f7546G, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case 7:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC11694j.m31205s((Modifier) this.f7550z, (C4167d) this.f7544E, (InterfaceC4339a) this.f7545F, (DatePickerDialog) this.f7546G, (String) this.f7548x, this.f7549y, (Composer) obj, iIntValue5);
            case 8:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC13689h.m38655j((C3673c) this.f7550z, (C3671a) this.f7544E, (C41153f) this.f7545F, (String) this.f7548x, (String) this.f7546G, this.f7549y, (Composer) obj, iIntValue6);
            case 9:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC13742i.m39054B((String) this.f7548x, (String) this.f7550z, (C3693c) this.f7544E, (C3691a) this.f7545F, (InterfaceC11182a.i) this.f7546G, this.f7549y, (Composer) obj, iIntValue7);
            case 10:
                ((Integer) obj2).getClass();
                AbstractC14929f.m43025c((String) this.f7548x, (C14926c) this.f7550z, (Modifier) this.f7544E, (Function3) this.f7545F, (InterfaceC4339a) this.f7546G, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case 11:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC15219c.m43274x((LocalDate) this.f7550z, (LocalDate) this.f7548x, (LocalDate) this.f7545F, (Function1) this.f7544E, (InterfaceC4339a) this.f7546G, this.f7549y, (Composer) obj, iIntValue8);
            case 12:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC15788g.m44502H((C13147c.b) this.f7550z, (C13147c.c) this.f7545F, (Integer) this.f7546G, (String) this.f7548x, (Function1) this.f7544E, this.f7549y, (Composer) obj, iIntValue9);
            case 13:
                ((Integer) obj2).getClass();
                AbstractC35785b.m113411f((C16845k) this.f7550z, (C16839e) this.f7548x, (Modifier) this.f7544E, (InterfaceC4339a) this.f7545F, (C37816b) this.f7546G, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case 14:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC16979h.m47795i((C12756a) this.f7550z, (C14137b) this.f7544E, (String) this.f7548x, (InterfaceC4339a) this.f7545F, (InterfaceC4339a) this.f7546G, this.f7549y, (Composer) obj, iIntValue10);
            case 15:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC17687i.m50475R((StrengthTrainerDestination.C10739b.a) this.f7550z, (C1601k1) this.f7544E, (String) this.f7548x, (C17679a) this.f7545F, (InterfaceC14515a) this.f7546G, this.f7549y, (Composer) obj, iIntValue11);
            case 16:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC18004n.m51680p((C39065r) this.f7550z, (TextResource) this.f7548x, (EnumC39333f) this.f7544E, (TextResource) this.f7545F, (EnumC39333f) this.f7546G, this.f7549y, (Composer) obj, iIntValue12);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue13 = ((Integer) obj2).intValue();
                return AbstractC18435t.m53087L((C17202d) this.f7550z, (InterfaceC4339a) this.f7548x, (C3108a) this.f7545F, (Function1) this.f7544E, (InterfaceC4351m) this.f7546G, this.f7549y, (Composer) obj, iIntValue13);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue14 = ((Integer) obj2).intValue();
                return AbstractC21256e.m59641i0((String) this.f7548x, (C12991u0) this.f7550z, (C22164d) this.f7546G, (Function1) this.f7544E, (Function1) this.f7545F, this.f7549y, (Composer) obj, iIntValue14);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue15 = ((Integer) obj2).intValue();
                return AbstractC21897e.m62242n((C16096c) this.f7550z, (Function1) this.f7544E, (Function1) this.f7545F, (InterfaceC4339a) this.f7548x, (Function1) this.f7546G, this.f7549y, (Composer) obj, iIntValue15);
            case 20:
                int iIntValue16 = ((Integer) obj2).intValue();
                return AbstractC21898f.m62266k((AbstractC22403o) this.f7550z, (TextResource) this.f7548x, (TextResource) this.f7545F, (List) this.f7546G, (Function1) this.f7544E, this.f7549y, (Composer) obj, iIntValue16);
            case 21:
                ((Integer) obj2).getClass();
                AbstractC23200x1.m67157a((C23132m) this.f7550z, (InterfaceC23165r2) this.f7548x, (C23154p3) this.f7544E, (C23209y4) this.f7545F, (C37816b) this.f7546G, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue17 = ((Integer) obj2).intValue();
                return AbstractC24686r.m72195R((C24702c) this.f7550z, (C13563a) this.f7548x, (InterfaceC4339a) this.f7544E, (InterfaceC4339a) this.f7545F, (InterfaceC4339a) this.f7546G, this.f7549y, (Composer) obj, iIntValue17);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                AbstractC26268h.m77945a((InterfaceC13087t1) this.f7550z, (C12991u0) this.f7548x, (C11457j) this.f7546G, (Function1) this.f7544E, (Function1) this.f7545F, (Composer) obj, AbstractC28683x.m87244L(this.f7549y | 1));
                return C23454a0.f92919a;
            case 24:
                int iIntValue18 = ((Integer) obj2).intValue();
                return AbstractC26958l0.m80609O((C27256h) this.f7550z, (C27256h) this.f7545F, (String) this.f7548x, (InterfaceC4339a) this.f7546G, (Function1) this.f7544E, this.f7549y, (Composer) obj, iIntValue18);
            case 25:
                int iIntValue19 = ((Integer) obj2).intValue();
                return AbstractC27169c.m81707t((MemberDataExportModel) this.f7550z, (InterfaceC4339a) this.f7548x, (Function1) this.f7544E, (Function1) this.f7545F, (Function3) this.f7546G, this.f7549y, (Composer) obj, iIntValue19);
            case 26:
                int iIntValue20 = ((Integer) obj2).intValue();
                return AbstractC28459e.m86289N((AbstractC29599b) this.f7550z, (InterfaceC29603f.a) this.f7548x, (Function1) this.f7544E, (Function1) this.f7545F, (Function1) this.f7546G, this.f7549y, (Composer) obj, iIntValue20);
            case 27:
                int iIntValue21 = ((Integer) obj2).intValue();
                return AbstractC29803d.m91309k((InterfaceC23013y) this.f7550z, (EnumC26811m) this.f7548x, (C26809k) this.f7544E, (InterfaceC4339a) this.f7545F, (Function3) this.f7546G, this.f7549y, (Composer) obj, iIntValue21);
            case 28:
                int iIntValue22 = ((Integer) obj2).intValue();
                return AbstractC30068a.m92151g((C15565f) this.f7550z, (Function1) this.f7544E, (Function1) this.f7545F, (Function1) this.f7546G, (InterfaceC4356r) this.f7548x, this.f7549y, (Composer) obj, iIntValue22);
            default:
                int iIntValue23 = ((Integer) obj2).intValue();
                return AbstractC31797c.m98764F((C28801l) this.f7550z, (List) this.f7548x, (InterfaceC2994c0) this.f7544E, (InterfaceC12251g) this.f7545F, (InterfaceC4351m) this.f7546G, this.f7549y, (Composer) obj, iIntValue23);
        }
    }

    public /* synthetic */ C1909c(InterfaceC13087t1 interfaceC13087t1, C12991u0 c12991u0, C11457j c11457j, Function1 function1, Function1 function2, int i13) {
        this.f7547w = 23;
        this.f7550z = interfaceC13087t1;
        this.f7548x = c12991u0;
        this.f7546G = c11457j;
        this.f7544E = function1;
        this.f7545F = function2;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(C13147c.b bVar, C13147c.c cVar, Integer num, String str, Function1 function1, int i13) {
        this.f7547w = 12;
        this.f7550z = bVar;
        this.f7545F = cVar;
        this.f7546G = num;
        this.f7548x = str;
        this.f7544E = function1;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14) {
        this.f7547w = i14;
        this.f7550z = obj;
        this.f7548x = obj2;
        this.f7544E = obj3;
        this.f7545F = obj4;
        this.f7546G = obj5;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14, byte b) {
        this.f7547w = i14;
        this.f7550z = obj;
        this.f7544E = obj2;
        this.f7545F = obj3;
        this.f7548x = obj4;
        this.f7546G = obj5;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14, boolean z4) {
        this.f7547w = i14;
        this.f7550z = obj;
        this.f7544E = obj2;
        this.f7548x = obj3;
        this.f7545F = obj4;
        this.f7546G = obj5;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(Object obj, Object obj2, Object obj3, Function1 function1, InterfaceC23459e interfaceC23459e, int i13, int i14) {
        this.f7547w = i14;
        this.f7550z = obj;
        this.f7548x = obj2;
        this.f7545F = obj3;
        this.f7544E = function1;
        this.f7546G = interfaceC23459e;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(Object obj, Object obj2, InterfaceC23459e interfaceC23459e, Object obj3, Object obj4, int i13, int i14) {
        this.f7547w = i14;
        this.f7550z = obj;
        this.f7544E = obj2;
        this.f7545F = interfaceC23459e;
        this.f7546G = obj3;
        this.f7548x = obj4;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(String str, C12991u0 c12991u0, C22164d c22164d, Function1 function1, Function1 function2, int i13) {
        this.f7547w = 18;
        this.f7548x = str;
        this.f7550z = c12991u0;
        this.f7546G = c22164d;
        this.f7544E = function1;
        this.f7545F = function2;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(String str, Object obj, Object obj2, Object obj3, Object obj4, int i13, int i14) {
        this.f7547w = i14;
        this.f7548x = str;
        this.f7550z = obj;
        this.f7544E = obj2;
        this.f7545F = obj3;
        this.f7546G = obj4;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(AbstractC22403o abstractC22403o, TextResource textResource, TextResource textResource2, List list, Function1 function1, int i13) {
        this.f7547w = 20;
        this.f7550z = abstractC22403o;
        this.f7548x = textResource;
        this.f7545F = textResource2;
        this.f7546G = list;
        this.f7544E = function1;
        this.f7549y = i13;
    }

    public /* synthetic */ C1909c(C27256h c27256h, C27256h c27256h2, String str, InterfaceC4339a interfaceC4339a, Function1 function1, int i13) {
        this.f7547w = 24;
        this.f7550z = c27256h;
        this.f7545F = c27256h2;
        this.f7548x = str;
        this.f7546G = interfaceC4339a;
        this.f7544E = function1;
        this.f7549y = i13;
    }
}
