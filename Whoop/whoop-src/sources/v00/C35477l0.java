package v00;

import b30.C2570m;
import com.stripe.android.uicore.elements.IdentifierSpec;
import g40.EnumC15434v1;
import g40.InterfaceC15452z;
import h20.C16671i1;
import h20.C16760x0;
import h20.C16765y;
import i20.AbstractC17960l1;
import i20.C17928b;
import j00.AbstractC21106i0;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p029b5.C2725d;
import p530up.AbstractC35148d;
import p599wz.C37734l1;
import p695zx.C41193o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import w30.InterfaceC36786c;
import y00.AbstractC38833g;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.EnumC38910o;

/* JADX INFO: renamed from: v00.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35477l0 {

    /* JADX INFO: renamed from: a */
    public final C41193o f151018a;

    /* JADX INFO: renamed from: b */
    public final C37734l1 f151019b;

    /* JADX INFO: renamed from: c */
    public final C16765y f151020c;

    /* JADX INFO: renamed from: d */
    public final Function1 f151021d;

    /* JADX INFO: renamed from: e */
    public final C38809d5 f151022e;

    /* JADX INFO: renamed from: f */
    public final AbstractC38970u5 f151023f;

    /* JADX INFO: renamed from: g */
    public final AbstractC38869j5 f151024g;

    /* JADX INFO: renamed from: h */
    public final AbstractC21106i0 f151025h;

    /* JADX INFO: renamed from: i */
    public final boolean f151026i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC15452z f151027j;

    /* JADX INFO: renamed from: k */
    public final boolean f151028k;

    /* JADX INFO: renamed from: l */
    public final Boolean f151029l;

    /* JADX INFO: renamed from: m */
    public final C2725d f151030m;

    /* JADX INFO: renamed from: n */
    public final C2570m f151031n;

    public C35477l0(C41193o cardAccountRangeRepositoryFactory, C37734l1 c37734l1, C16765y c16765y, Function1 function1, C38809d5 c38809d5, AbstractC38970u5 abstractC38970u5, AbstractC38869j5 abstractC38869j5, AbstractC21106i0 abstractC21106i0, boolean z4, InterfaceC15452z interfaceC15452z, boolean z13, Boolean bool, C2725d c2725d, C2570m c2570m) {
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        this.f151018a = cardAccountRangeRepositoryFactory;
        this.f151019b = c37734l1;
        this.f151020c = c16765y;
        this.f151021d = function1;
        this.f151022e = c38809d5;
        this.f151023f = abstractC38970u5;
        this.f151024g = abstractC38869j5;
        this.f151025h = abstractC21106i0;
        this.f151026i = z4;
        this.f151027j = interfaceC15452z;
        this.f151028k = z13;
        this.f151029l = bool;
        this.f151030m = c2725d;
        this.f151031n = c2570m;
    }

    /* JADX INFO: renamed from: a */
    public final C35479m0 m112546a(C35459c0 c35459c0, boolean z4) {
        Map map;
        EnumC38910o enumC38910oM124348d;
        C16760x0 c16760x0;
        C16760x0 c16760x1;
        C16760x0 c16760x2;
        C16760x0 c16760x3;
        C16760x0 c16760x4;
        C16760x0 c16760x5;
        String str = c35459c0.f150966I;
        InterfaceC36786c interfaceC36786c = c35459c0.f150965H;
        C16671i1 c16671i1 = c35459c0.f150968K;
        C38809d5 c38809d5 = this.f151022e;
        Map map2 = C25272z.f99163w;
        if (c38809d5 != null) {
            Map mapMo124325c0 = c38809d5.mo124325c0();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC35148d.m111181l(mapMo124325c0, "", linkedHashMap);
            map = linkedHashMap;
        } else {
            map = map2;
        }
        AbstractC38869j5 abstractC38869j5 = this.f151024g;
        if (abstractC38869j5 != null) {
            Map mapMo124325c1 = abstractC38869j5.mo124325c0();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            AbstractC35148d.m111181l(mapMo124325c1, "", linkedHashMap2);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(IdentifierSpec.copy$default((IdentifierSpec) entry.getKey(), null, false, EnumC15434v1.f58016w, 3, null), entry.getValue());
            }
            map2 = linkedHashMap3;
        }
        IdentifierSpec.Companion.getClass();
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k(IdentifierSpec.Name, c16671i1 != null ? c16671i1.f64116y : null), new C23465k(IdentifierSpec.Email, c16671i1 != null ? c16671i1.f64115x : null), new C23465k(IdentifierSpec.Phone, c16671i1 != null ? c16671i1.f64117z : null), new C23465k(IdentifierSpec.Line1, (c16671i1 == null || (c16760x5 = c16671i1.f64114w) == null) ? null : c16760x5.f64400y), new C23465k(IdentifierSpec.Line2, (c16671i1 == null || (c16760x4 = c16671i1.f64114w) == null) ? null : c16760x4.f64401z), new C23465k(IdentifierSpec.City, (c16671i1 == null || (c16760x3 = c16671i1.f64114w) == null) ? null : c16760x3.f64398w), new C23465k(IdentifierSpec.State, (c16671i1 == null || (c16760x2 = c16671i1.f64114w) == null) ? null : c16760x2.f64397F), new C23465k(IdentifierSpec.Country, (c16671i1 == null || (c16760x1 = c16671i1.f64114w) == null) ? null : c16760x1.f64399x), new C23465k(IdentifierSpec.PostalCode, (c16671i1 == null || (c16760x0 = c16671i1.f64114w) == null) ? null : c16760x0.f64396E)), map), map2);
        C17928b c17928b = c35459c0.f150969L;
        Map mapM51589p = c17928b != null ? AbstractC17960l1.m51589p(c17928b, c16671i1) : null;
        boolean z13 = false;
        AbstractC38970u5 abstractC38970u5 = this.f151023f;
        if (abstractC38970u5 != null && (enumC38910oM124348d = AbstractC38833g.m124348d(abstractC38970u5)) != null && enumC38910oM124348d != EnumC38910o.Blank) {
            z13 = true;
        }
        return new C35479m0(this.f151018a, this.f151019b, linkedHashMapM73995d0, this.f151025h, mapM51589p, z13, str, interfaceC36786c, c35459c0.f150997x, z4, this.f151021d, c35459c0.f150981X, c35459c0.f150982Y, this.f151026i, this.f151027j, this.f151020c, this.f151028k, this.f151029l, this.f151030m, this.f151031n);
    }
}
