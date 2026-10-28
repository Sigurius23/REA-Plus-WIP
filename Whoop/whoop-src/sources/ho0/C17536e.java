package ho0;

import ad3.AbstractC0757c;
import al0.C0972g;
import bh1.C3249a;
import bh1.C3250b;
import com.whoop.clinicianintheloop.api.VideoSchedulingFormApi;
import com.whoop.clinicianintheloop.api.VideoSchedulingIntakeApi;
import com.whoop.clinicianintheloop.domain.models.AppointmentButtonModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentConfirmationCardModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentSummaryFieldModel;
import com.whoop.clinicianintheloop.domain.models.AppointmentTimeInfoModel;
import com.whoop.clinicianintheloop.domain.models.ClinicianHeaderModel;
import com.whoop.clinicianintheloop.domain.models.ExpandableClinicianNoteModel;
import com.whoop.clinicianintheloop.domain.models.SchedulingOverviewCardModel;
import com.whoop.clinicianintheloop.domain.models.VisitDetailItemModel;
import com.whoop.design.json.AbstractC6728b;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hf2.C17237a;
import io0.C20713a;
import io0.C20720g;
import io0.C20727n;
import io0.C20729p;
import io0.C20732s;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import ko0.C22644b;
import ko0.C22645c;
import ko0.C22646d;
import ko0.C22647e;
import l83.C23454a0;
import l83.C23465k;
import lo0.C24569a0;
import lo0.C24592m;
import lo0.C24613x;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import mo0.AbstractC25739b;
import mo0.C25740c;
import mo0.C25741d;
import mo0.C25742e;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.InterfaceC26834e;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.AbstractC34645f;
import u82.InterfaceC34640a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import xf3.C38266c;

/* JADX INFO: renamed from: ho0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lho0/e;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17536e implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f67816c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    /* JADX INFO: renamed from: C */
    private static final C23454a0 m49780C(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "citl-video-scheduling-intake-mapping");
        C17237a c17237a = new C17237a(14);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c17237a, 2)), false);
        C17237a c17237a2 = new C17237a(16);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C17534c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass2, null, c17237a2, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C17237a c17237a3 = new C17237a(18);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C17533b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass3, null, c17237a3, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C17237a c17237a4 = new C17237a(19);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C17532a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass4, null, c17237a4, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        C17237a c17237a5 = new C17237a(20);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C20732s.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c17237a5, 2)), false);
        C17237a c17237a6 = new C17237a(21);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C20713a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c17237a6, 1)), false);
        C17237a c17237a7 = new C17237a(22);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C20729p.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c17237a7, 2)), false);
        C17237a c17237a8 = new C17237a(23);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(VideoSchedulingFormApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c17237a8, 2)), false);
        C17237a c17237a9 = new C17237a(24);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(VideoSchedulingIntakeApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c17237a9, 2)), false);
        C17237a c17237a10 = new C17237a(26);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C20727n.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c17237a10, 2)), false);
        C17237a c17237a11 = new C17237a(25);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C25742e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c17237a11, 2)), false);
        C17237a c17237a12 = new C17237a(27);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C25741d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c17237a12, 2)), false);
        C17237a c17237a13 = new C17237a(28);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C22645c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c17237a13, 2)), false);
        C17237a c17237a14 = new C17237a(29);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C22647e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c17237a14, 2)), false);
        C17535d c17535d = new C17535d(0);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C22646d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c17535d, 2)), false);
        C17535d c17535d2 = new C17535d(1);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C24569a0.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c17535d2, 2)), false);
        C17535d c17535d3 = new C17535d(2);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C24613x.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c17535d3, 2)), false);
        C17535d c17535d4 = new C17535d(3);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C20720g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c17535d4, 2)), false);
        C17535d c17535d5 = new C17535d(4);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C25740c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c17535d5, 2)), false);
        C17237a c17237a15 = new C17237a(15);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C22644b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c17237a15, 2)), false);
        C17237a c17237a16 = new C17237a(17);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C24592m.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass21, null, c17237a16, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Map m49781D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("CLINICIAN_HEADER", c22673i0.getOrCreateKotlinClass(ClinicianHeaderModel.class)), new C23465k("APPOINTMENT_BUTTON", c22673i0.getOrCreateKotlinClass(AppointmentButtonModel.class)), new C23465k("APPOINTMENT_TIME_INFO", c22673i0.getOrCreateKotlinClass(AppointmentTimeInfoModel.class)), new C23465k("APPOINTMENT_SUMMARY_FIELD", c22673i0.getOrCreateKotlinClass(AppointmentSummaryFieldModel.class)), new C23465k("APPOINTMENT_CONFIRMATION_CARD", c22673i0.getOrCreateKotlinClass(AppointmentConfirmationCardModel.class)), new C23465k("SCHEDULING_OVERVIEW_CARD", c22673i0.getOrCreateKotlinClass(SchedulingOverviewCardModel.class)), new C23465k("EXPANDABLE_CLINICIAN_NOTE", c22673i0.getOrCreateKotlinClass(ExpandableClinicianNoteModel.class)), new C23465k("VISIT_DETAIL_ITEM", c22673i0.getOrCreateKotlinClass(VisitDetailItemModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C17534c m49782E(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17534c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("citl-video-scheduling-intake-mapping")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C25742e m49783F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25742e(AbstractC25739b.m75910x(), (C20732s) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C20732s.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C25741d m49784G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25741d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C22645c m49785H(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 19);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C22645c(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m49786I(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C22647e m49787J(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 18);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C22647e(interfaceC21159o0, (AbstractC12939a0) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C34911a m49788K(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C22646d m49789L(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C22646d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C24569a0 m49790M(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24569a0((C20729p) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20729p.class), null), (C25742e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25742e.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C24613x m49791N(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24613x((C20727n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20727n.class), null), (C25741d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25741d.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C20720g m49792O(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "citl-video-scheduling-intake-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        return new C20720g((InterfaceC26834e) c38266c.m122602a(new C3250b(map, (InterfaceC34640a) c38266c.m122602a(new C3249a(map, 4), c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("KotlinxDeserializer")), 4), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C34911a m49793P(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C34911a m49794Q(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C25740c m49795R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25740c(AbstractC25739b.m75910x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C22644b m49796S(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 17);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b != null) {
            return new C22644b(interfaceC21159o0, (AbstractC12939a0) objM110111b, AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C34911a m49797T(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C17533b m49798U(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17533b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C24592m m49799V(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24592m((C20720g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C20720g.class), null), (C25740c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25740c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C17532a m49800W(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17532a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static final C20732s m49801X(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20732s(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final C20713a m49802Y(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C20713a((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C20729p m49803Z(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "citl-video-scheduling-intake-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        return new C20729p((InterfaceC26834e) c38266c.m122602a(new C3250b(map, (InterfaceC34640a) c38266c.m122602a(new C3249a(map, 3), c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("KotlinxDeserializer")), 3), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (VideoSchedulingIntakeApi) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(VideoSchedulingIntakeApi.class), null), (C20713a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C20713a.class), null), (C20732s) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C20732s.class), null), null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C34911a m49805a0(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C34911a m49807b0(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final VideoSchedulingFormApi m49809c0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null);
        C29222x0 c29222x0 = new C29222x0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0.m88729c(((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757cM20380e));
        return (VideoSchedulingFormApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), VideoSchedulingFormApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final VideoSchedulingIntakeApi m49811d0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(factory, null, null, null, null, null, 31, null);
        C29222x0 c29222x0 = new C29222x0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0.m88729c(((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757cM20380e));
        return (VideoSchedulingIntakeApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), VideoSchedulingIntakeApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public static final C20727n m49813e0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20727n((VideoSchedulingFormApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(VideoSchedulingFormApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m49780C(c33768a);
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
