package n50;

import bh1.C3250b;
import com.whoop.access.careupdateentrypointtile.models.CareUpdateEntrypointTileModel;
import com.whoop.access.circumference.models.CircumferenceModel;
import com.whoop.access.labsummary.models.LabSummaryModel;
import com.whoop.access.measurementprogress.models.MeasurementProgressModel;
import com.whoop.access.programgoaltile.models.ProgramGoalTileModel;
import com.whoop.labfileupload.domain.LabFileUploadApi;
import d60.C11730d;
import e12.C12585a;
import f60.C14137b;
import fi0.InterfaceC14515a;
import g12.C15227e;
import g50.C15490c;
import g60.C15527a;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mq2.C25888a;
import ms1.C25929a;
import mu2.C25960e;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import ps1.C29503a;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import u50.C34539c;
import u50.C34540d;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import x50.C37987b;
import xf3.C38266c;
import y50.C39232a;

/* JADX INFO: renamed from: n50.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Ln50/d;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26293d implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f104512c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C25929a(), new C12585a(), new C35799a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m77997A(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C15527a m77998B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15527a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C14137b m77999C(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14137b((C11730d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C11730d.class), null), (C15527a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15527a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C34539c m78000D(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "access-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34539c((InterfaceC26834e) c38266c.m122602a(new C3250b((Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), (InterfaceC34640a) c38266c.m122602a(new C25888a(22), c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("KotlinxDeserializer")), 5), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m78001E() {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{new C35953c("access-mapping")}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m78002F(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C39232a m78003G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39232a();
    }

    /* JADX INFO: renamed from: q */
    private static final C23454a0 m78020q(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "access-mapping");
        C25960e c25960e = new C25960e(20);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c25960e, 2)), false);
        C25960e c25960e2 = new C25960e(23);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C26292c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass2, null, c25960e2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C25960e c25960e3 = new C25960e(24);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C26291b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass3, null, c25960e3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C25960e c25960e4 = new C25960e(25);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C26290a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass4, null, c25960e4, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        C25960e c25960e5 = new C25960e(14);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C15490c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c25960e5, 2)), false);
        C25960e c25960e6 = new C25960e(15);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C11730d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c25960e6, 2)), false);
        C25960e c25960e7 = new C25960e(16);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C15527a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c25960e7, 2)), false);
        C25960e c25960e8 = new C25960e(17);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C14137b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c25960e8, 2)), false);
        C25960e c25960e9 = new C25960e(18);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C34539c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c25960e9, 2)), false);
        C25960e c25960e10 = new C25960e(19);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C39232a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c25960e10, 2)), false);
        C25960e c25960e11 = new C25960e(21);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C34540d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass11, null, c25960e11, 1)), false);
        C25960e c25960e12 = new C25960e(22);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C37987b.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass12, null, c25960e12, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Map m78021r(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("CARE_UPDATE_ENTRYPOINT_TILE", c22673i0.getOrCreateKotlinClass(CareUpdateEntrypointTileModel.class)), new C23465k("CIRCUMFERENCE", c22673i0.getOrCreateKotlinClass(CircumferenceModel.class)), new C23465k("LAB_SUMMARY", c22673i0.getOrCreateKotlinClass(LabSummaryModel.class)), new C23465k("MEASUREMENT_PROGRESS", c22673i0.getOrCreateKotlinClass(MeasurementProgressModel.class)), new C23465k("PROGRAM_GOAL_TILE", c22673i0.getOrCreateKotlinClass(ProgramGoalTileModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C26292c m78022s(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26292c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("access-mapping")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C34540d m78023t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C15227e c15227e = (C15227e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15227e.class), null);
        return new C34540d(c15227e, c15227e.getResult(), (C15490c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15490c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C37987b m78024u(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37987b((C34539c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C34539c.class), null), (C39232a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39232a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C26291b m78025v(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26291b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C26290a m78026w(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26290a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C15490c m78027x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C15490c((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C11730d m78028y(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "access-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11730d((InterfaceC26834e) c38266c.m122602a(new C3250b((Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), (InterfaceC34640a) c38266c.m122602a(new C25888a(23), c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("KotlinxDeserializer")), 6), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (LabFileUploadApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(LabFileUploadApi.class), null), (C29503a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C29503a.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C34911a m78029z() {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{new C35953c("access-mapping")}));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m78020q(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
