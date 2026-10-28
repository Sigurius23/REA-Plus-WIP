package ig2;

import ad3.AbstractC0757c;
import ao1.C1873h;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.startactivity.dropdown.DropdownModel;
import com.whoop.startactivity.goals.CollapsibleToggleContainerModel;
import com.whoop.startactivity.goals.StartActivityTargetsMiniArch;
import com.whoop.startactivity.goals.targetcard.TargetCardModel;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivitiesRowModel;
import com.whoop.startactivity.presession.domain.model.PreSessionRecentActivityIconModel;
import com.whoop.startactivity.presession.domain.model.PreSessionWidgetModel;
import com.whoop.startactivity.selectactivity.SelectActivityPickerModel;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import fv1.InterfaceC14815c;
import gi1.C15892b;
import ia0.C18292a;
import ia2.C18293a;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.C21535a;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import lm0.C24506a;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mg2.C25531a;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import ng2.C26682a;
import ng2.C26683b;
import ng2.C26687f;
import nm0.InterfaceC26834e;
import od1.C27851n;
import p007a6.InterfaceC0422g;
import p138f6.C14131c;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23596b1;
import p720m91.InterfaceC25310s;
import pf.AbstractC29125c;
import pg2.C29169d;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rg2.C31406r;
import tf3.C33768a;
import tg2.C33794h;
import tg2.C33798l;
import u82.C34648i;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vg2.C36031c;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wg2.AbstractC37267c;
import wg2.C37268d;
import wm0.C37378a;
import xf3.C38266c;
import xg2.C38273a;
import xh1.C38309a;
import yg2.C39530e;

/* JADX INFO: renamed from: ig2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lig2/d;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18474d implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f71924c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a(), new C38309a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C33798l m53274A(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33798l((C27851n) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C27851n.class), null), (C18292a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null), (C33794h) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C33794h.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C36031c m53275B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C1873h c1873h = new C1873h(factory, 16);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36031c((InterfaceC26834e) factory.m122602a(c1873h, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m53276C(C38266c c38266c) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("start-activity-bff-cache-deserializer"))}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C38273a m53277D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38273a(new C21535a(C23596b1.f93677a.m68522a(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final AbstractC37267c m53278E(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37268d((C36031c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C36031c.class), null), (C38273a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C38273a.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C18473c m53279F(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18473c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("StartActivity-mapping")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C18472b m53280G(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18472b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C18471a m53281H(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18471a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC34640a m53282I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34648i((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("start-activity-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC0422g m53283J(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22365e c22365e = AbstractC3050q0.f12077a;
        return C14131c.m40232d(null, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d())), new C1873h(single, 15), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final File m53284K(C38266c c38266c) {
        return AbstractC21598x.m60684i0(AbstractC29125c.m88531h(c38266c), "pre_session_gps_fine_location_permission_prefs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C26682a m53285L(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26682a((InterfaceC0422g) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), new C35953c("pre-session-gps-fine-location-permission-data-store")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C29169d m53286M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29169d((C18292a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null), (C15892b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15892b.class), null), (C26682a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26682a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C26683b m53287N(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26683b((InterfaceC14815c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14815c.class), null), (C15892b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15892b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C31406r m53288O(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31406r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static final C25531a m53289P(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25531a((C31406r) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31406r.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C26687f m53290Q(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26687f((C29169d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C29169d.class), null), (C25531a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25531a.class), null), (C39530e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39530e.class), null), (C26683b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C26683b.class), null), (C15892b) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C15892b.class), null), (C24506a) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C24506a.class), null), null, 64, null);
    }

    /* JADX INFO: renamed from: v */
    private static final C23454a0 m53312v(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "StartActivity-mapping");
        C18293a c18293a = new C18293a(6);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c18293a, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "start-activity-json");
        C18293a c18293a2 = new C18293a(7);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        C35953c c35953cM73385r2 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, c18293a2, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), false, "start-activity-bff-cache-deserializer");
        C18293a c18293a3 = new C18293a(8);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class);
        C35953c c35953cM73385r3 = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass3, c35953cM73385r2, c18293a3, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass3, c35953cM73385r2, c35953c), false, "pre-session-gps-fine-location-permission-data-store");
        C18293a c18293a4 = new C18293a(9);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, c35953cM73385r3, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass4, c35953cM73385r3, c18293a4, 1)), false);
        C18293a c18293a5 = new C18293a(10);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C26682a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass5, null, c18293a5, 1)), false);
        C18293a c18293a6 = new C18293a(11);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C29169d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c18293a6, 2)), false);
        C18293a c18293a7 = new C18293a(12);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C26683b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c18293a7, 2)), false);
        C18293a c18293a8 = new C18293a(13);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C31406r.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, c18293a8, 2)), false);
        C18293a c18293a9 = new C18293a(14);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C25531a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c18293a9, 2)), false);
        C18293a c18293a10 = new C18293a(15);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C26687f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c18293a10, 2)), false);
        C18293a c18293a11 = new C18293a(16);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C27851n.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c18293a11, 2)), false);
        C18293a c18293a12 = new C18293a(17);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C33794h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c18293a12, 2)), false);
        C18293a c18293a13 = new C18293a(18);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C33798l.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c18293a13, 2)), false);
        C18293a c18293a14 = new C18293a(19);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C36031c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c18293a14, 2)), false);
        C18293a c18293a15 = new C18293a(20);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C38273a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c18293a15, 2)), false);
        C18293a c18293a16 = new C18293a(21);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(AbstractC37267c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c18293a16, 2)), false);
        C18293a c18293a17 = new C18293a(22);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C18473c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass17, null, c18293a17, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C18293a c18293a18 = new C18293a(23);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C18472b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass18, null, c18293a18, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C18293a c18293a19 = new C18293a(24);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C18471a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass19, null, c18293a19, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Map m53313w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC25247g0.m73990Y(new C23465k("COLLAPSIBLE_TOGGLE_CONTAINER", c22673i0.getOrCreateKotlinClass(CollapsibleToggleContainerModel.class)), new C23465k(ShippingAddressField.DROPDOWN_FIELD_TYPE, c22673i0.getOrCreateKotlinClass(DropdownModel.class)), new C23465k("START_ACTIVITY_TARGETS_MINI_ARCH", c22673i0.getOrCreateKotlinClass(StartActivityTargetsMiniArch.class)), new C23465k("TARGET_CARD", c22673i0.getOrCreateKotlinClass(TargetCardModel.class)), new C23465k("PRE_SESSION_RECENT_ACTIVITIES_ROW", c22673i0.getOrCreateKotlinClass(PreSessionRecentActivitiesRowModel.class)), new C23465k("PRE_SESSION_RECENT_ACTIVITY_ICON", c22673i0.getOrCreateKotlinClass(PreSessionRecentActivityIconModel.class)), new C23465k("PRE_SESSION_WIDGET", c22673i0.getOrCreateKotlinClass(PreSessionWidgetModel.class)), new C23465k("SELECT_ACTIVITY_PICKER", c22673i0.getOrCreateKotlinClass(SelectActivityPickerModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final AbstractC0757c m53314x(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "StartActivity-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C27851n m53315y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27851n((C18292a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C33794h m53316z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33794h();
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m53312v(c33768a);
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
