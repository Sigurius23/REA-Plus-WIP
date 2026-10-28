package am2;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bj1.C3330a;
import bj1.C3332c;
import bm2.C3439f0;
import bs1.AbstractC3583c0;
import c31.EnumC3919c;
import c41.C4092p2;
import c42.C4180q;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import cj1.InterfaceC4751g;
import cm2.AbstractC4813a0;
import cm2.C4824l;
import com.whoop.bot.settings.CoachSettingsScreenKt;
import com.whoop.bot.settings.CoachSettingsViewState;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.membership.management.navigation.AbstractC9126a;
import com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetContentKt;
import cp1.EnumC11017d;
import d30.C11530f0;
import d42.AbstractC11700p;
import dc3.C11923h;
import ds1.C12341k;
import e60.C12756a;
import ej1.AbstractC13257t;
import f41.AbstractC14078p;
import f60.C14137b;
import f60.InterfaceC14136a;
import gv1.AbstractC16233g;
import gv1.EnumC16238l;
import h60.AbstractC16979h;
import hp1.C17544d;
import i93.C18284j;
import ih0.AbstractC18502l;
import io0.EnumC20735v;
import java.io.File;
import java.util.List;
import java.util.Map;
import jd0.C21608a;
import jd0.C21610c;
import jp1.AbstractC21855g;
import jp2.AbstractC21873d;
import jp2.AbstractC21883n;
import jp2.C21874e;
import jp2.C21884o;
import jx1.AbstractC22009c0;
import jx1.AbstractC22025o;
import kd0.C22383c;
import kd0.InterfaceC22381a;
import kf0.AbstractC22431f;
import kf0.AbstractC22433h;
import l83.C23454a0;
import l83.InterfaceC23462h;
import ld1.AbstractC23864c;
import lo0.C24605s0;
import lv2.C24763a;
import no0.AbstractC26958l0;
import no0.AbstractC26979w;
import nx1.AbstractC27223e;
import nx1.AbstractC27226h;
import o71.AbstractC27633c;
import o71.C27638h;
import o72.AbstractC27647h;
import ov2.AbstractC28400d;
import p005a3.AbstractC0201g;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2395j3;
import p078d1.C11449b;
import p078d1.C11458k;
import p078d1.C11462o;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p132f0.C13821r1;
import p163g1.C15199y3;
import p164g2.InterfaceC15250v;
import p179h.C16351i;
import p180h0.AbstractC16472w1;
import p180h0.C16372c3;
import p180h0.C16477x1;
import p292l1.AbstractC23092f1;
import p292l1.C23187v0;
import p316m1.C24920r;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p412q3.C29878l;
import p412q3.C29891y;
import p705ea2.AbstractC42783n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22669g0;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import ql0.InterfaceC30468c;
import s90.C32290f;
import uu2.C35247e;

/* JADX INFO: renamed from: am2.r */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1040r implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f4007E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f4008F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4009w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f4010x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f4011y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f4012z;

    public /* synthetic */ C1040r(InterfaceC2994c0 interfaceC2994c0, Function1 function1, Object obj, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f4009w = i13;
        this.f4012z = interfaceC2994c0;
        this.f4010x = function1;
        this.f4007E = obj;
        this.f4008F = c15199y3;
        this.f4011y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f4009w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f4010x;
        Object obj3 = this.f4008F;
        Object obj4 = this.f4007E;
        Object obj5 = this.f4011y;
        Object obj6 = this.f4012z;
        switch (i13) {
            case 0:
                return AbstractC1046w.m3006R((C4824l) obj6, (Function1) obj2, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, (InterfaceC26064q) obj);
            case 1:
                return AbstractC1046w.m3013Y((InterfaceC2994c0) obj6, (Function1) obj2, (String) obj4, (C15199y3) obj3, (InterfaceC28601c1) obj5, (C3439f0) obj);
            case 2:
                return AbstractC1035o0.m2846S0((InterfaceC2994c0) obj6, (Function1) obj2, (AbstractC4813a0) obj4, (C15199y3) obj3, (InterfaceC28601c1) obj5, (C3439f0) obj);
            case 3:
                return AbstractC3583c0.m10816a2((Function1) obj2, (C13821r1) obj6, (C12341k) obj5, (InterfaceC4352n) obj4, (Function1) obj3, obj);
            case 4:
                return CoachSettingsScreenKt.CoachSettingsNavHost$lambda$0$0((CoachSettingsViewState.Success) obj6, (Function1) obj2, (InterfaceC4339a) obj5, (InterfaceC4339a) obj4, (C12991u0) obj3, (C12987s0) obj);
            case 5:
                return AvatarEditBottomSheetContentKt.AvatarEditBottomSheetContent$lambda$10$0((Context) obj6, (File) obj2, (C16351i) obj3, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, ((Boolean) obj).booleanValue());
            case 6:
                C11462o c11462o = (C11462o) obj;
                C11458k c11458k = ((C11449b) obj5).f36726a;
                c11462o.f36785h = (C29891y) obj6;
                c11462o.f36786i = (C29878l) obj4;
                c11462o.f36780c = (C32290f) obj3;
                c11462o.f36781d = (Function1) obj2;
                c11462o.f36782e = c11458k != null ? c11458k.f36756P : null;
                c11462o.f36783f = c11458k != null ? c11458k.f36757Q : null;
                c11462o.f36784g = c11458k != null ? (InterfaceC2395j3) AbstractC0201g.m506f(c11458k, AbstractC2453v1.f9580s) : null;
                return c23454a0;
            case 7:
                return AbstractC11700p.m31242Q((C4180q) obj6, (Function1) obj2, (Function1) obj5, (Function1) obj4, (Function1) obj3, (InterfaceC26064q) obj);
            case 8:
                return AbstractC42783n.m36351o((InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC4351m) obj6, (InterfaceC4339a) obj2, (Context) obj3, (InterfaceC26064q) obj);
            case 9:
                return AbstractC13257t.m37277l((C3330a) obj6, (C3332c) obj5, (Function1) obj2, (InterfaceC28670t2) obj4, (InterfaceC23462h) obj3, (InterfaceC4751g) obj);
            case 10:
                return AbstractC14078p.m40105z((Map) obj6, (InterfaceC4351m) obj2, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, ((Integer) obj).intValue());
            case 11:
                return AbstractC16233g.m45950G((Function1) obj2, (InterfaceC4339a) obj6, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, (EnumC16238l) obj);
            case 12:
                C11530f0 c11530f0 = (C11530f0) obj6;
                C22669g0 c22669g0 = (C22669g0) obj2;
                C22663d0 c22663d0 = (C22663d0) obj5;
                C16372c3 c16372c3 = (C16372c3) obj4;
                C22659b0 c22659b0 = (C22659b0) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                C16477x1 c16477x1M30979k = C11530f0.m30979k((C11923h) c11530f0.f37154g);
                if (c16477x1M30979k != null) {
                    c11530f0.m30988l(c16477x1M30979k);
                    C16477x1 c16477x1M46651a = ((C16477x1) c22669g0.f89336w).m46651a(c16477x1M30979k);
                    c22669g0.f89336w = c16477x1M46651a;
                    float fM46574g = c16372c3.m46574g(c16372c3.m46572e(c16477x1M46651a.f63318a));
                    c22663d0.f89331w = fM46574g;
                    c22659b0.f89329w = !AbstractC16472w1.m46644a(fM46574g - fFloatValue);
                }
                return Boolean.valueOf(c16477x1M30979k != null);
            case 13:
                return AbstractC16979h.m47794h((C14137b) obj6, (String) obj2, (C12756a) obj5, (InterfaceC4339a) obj4, (InterfaceC4339a) obj3, (InterfaceC14136a) obj);
            case 14:
                return AbstractC18502l.m53554A((InterfaceC2994c0) obj6, (InterfaceC30468c) obj2, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, ((Boolean) obj).booleanValue());
            case 15:
                return AbstractC9126a.m22805m((InterfaceC1585g0) obj6, (Function1) obj2, (InterfaceC28670t2) obj5, (Function1) obj4, (Function1) obj3, (C12987s0) obj);
            case 16:
                return AbstractC21855g.m61880s((C17544d) obj6, (InterfaceC28601c1) obj5, (EnumC11017d) obj2, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, (InterfaceC26064q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC21873d.m62021k((Function1) obj2, (C21874e) obj6, (String) obj4, (String) obj3, (InterfaceC28601c1) obj5, (InterfaceC15250v) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC21883n.m62054B((Function1) obj2, (C21884o) obj6, (String) obj3, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC15250v) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22431f.m64632G((C22383c.g) obj6, (Function1) obj2, (InterfaceC25312u) obj3, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, obj);
            case 20:
                return AbstractC22433h.m64704q((C21608a) obj6, (C21610c) obj2, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC23462h) obj3, (InterfaceC22381a) obj);
            case 21:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj5;
                int iIntValue = ((Integer) obj).intValue();
                float f13 = AbstractC23092f1.f91167a;
                interfaceC28601c1.setValue(Boolean.valueOf(!((Boolean) interfaceC28601c1.getValue()).booleanValue()));
                AbstractC3006f0.m8732z((InterfaceC2994c0) obj6, null, null, new C23187v0((C26068u) obj2, iIntValue, (C18284j) obj4, (C24920r) obj3, (InterfaceC30057d) null), 3);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC26979w.m80849Q((String) obj6, (Function1) obj2, (String) obj5, (String) obj4, (String) obj3, (EnumC3919c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26979w.m80853U((C4092p2) obj6, (List) obj5, (List) obj4, (C24605s0) obj3, (Function1) obj2, (InterfaceC26064q) obj);
            case 24:
                return AbstractC26958l0.m80660n0((Function1) obj2, (EnumC20735v) obj6, (InterfaceC28601c1) obj5, (InterfaceC28601c1) obj4, (InterfaceC28601c1) obj3, (InterfaceC15250v) obj);
            case 25:
                return AbstractC27223e.m81999s((AbstractC22025o.c) obj6, (FeatureFlagChecker) obj5, (Function1) obj2, (Function1) obj4, (Function1) obj3, (InterfaceC26064q) obj);
            case 26:
                return AbstractC27226h.m82031v((AbstractC22009c0.c) obj6, (Function1) obj2, (FeatureFlagChecker) obj5, (Function1) obj4, (Function1) obj3, (InterfaceC26064q) obj);
            case 27:
                return AbstractC27633c.m83422l((C27638h) obj6, (InterfaceC28601c1) obj5, (Function1) obj2, (InterfaceC28593a1) obj4, (InterfaceC28593a1) obj3, ((Integer) obj).intValue());
            case 28:
                return AbstractC27647h.m83500K((Function1) obj2, (Function1) obj6, (Function1) obj5, (Function1) obj4, (String) obj3, obj);
            default:
                return AbstractC28400d.m86111n((C24763a) obj6, (C35247e) obj5, (AbstractC23864c) obj4, (String) obj3, (Function1) obj2, obj);
        }
    }

    public /* synthetic */ C1040r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f4009w = i13;
        this.f4012z = obj;
        this.f4010x = obj2;
        this.f4011y = obj3;
        this.f4007E = obj4;
        this.f4008F = obj5;
    }

    public /* synthetic */ C1040r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, boolean z4) {
        this.f4009w = i13;
        this.f4012z = obj;
        this.f4011y = obj2;
        this.f4010x = obj3;
        this.f4007E = obj4;
        this.f4008F = obj5;
    }

    public /* synthetic */ C1040r(Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, int i13) {
        this.f4009w = i13;
        this.f4012z = obj;
        this.f4011y = obj2;
        this.f4007E = obj3;
        this.f4008F = obj4;
        this.f4010x = function1;
    }

    public /* synthetic */ C1040r(Object obj, Object obj2, Object obj3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, int i13) {
        this.f4009w = i13;
        this.f4012z = obj;
        this.f4010x = obj2;
        this.f4008F = obj3;
        this.f4011y = interfaceC28601c1;
        this.f4007E = interfaceC28601c2;
    }

    public /* synthetic */ C1040r(Function1 function1, Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f4009w = i13;
        this.f4010x = function1;
        this.f4012z = obj;
        this.f4011y = obj2;
        this.f4007E = obj3;
        this.f4008F = obj4;
    }

    public /* synthetic */ C1040r(Function1 function1, C21874e c21874e, String str, String str2, InterfaceC28601c1 interfaceC28601c1) {
        this.f4009w = 17;
        this.f4010x = function1;
        this.f4012z = c21874e;
        this.f4007E = str;
        this.f4008F = str2;
        this.f4011y = interfaceC28601c1;
    }

    public /* synthetic */ C1040r(Function1 function1, C21884o c21884o, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        this.f4009w = 18;
        this.f4010x = function1;
        this.f4012z = c21884o;
        this.f4008F = str;
        this.f4011y = interfaceC28601c1;
        this.f4007E = interfaceC28601c2;
    }

    public /* synthetic */ C1040r(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Context context) {
        this.f4009w = 8;
        this.f4011y = interfaceC28601c1;
        this.f4007E = interfaceC28601c2;
        this.f4012z = interfaceC4351m;
        this.f4010x = interfaceC4339a;
        this.f4008F = context;
    }
}
