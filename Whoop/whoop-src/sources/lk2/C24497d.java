package lk2;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.UserRepository;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.trackactivity.domain.SessionTargetsFetcher;
import com.whoop.trackactivity.domain.models.TrackSessionMiniArchModel;
import e93.AbstractC12889b;
import ei1.InterfaceC13220a;
import fi1.C14520a;
import ge3.AbstractC15751g;
import ia0.C18292a;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.C24405c;
import lj1.C24474b;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import mk2.C25651r;
import mk2.InterfaceC25654u;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nm0.C26830a;
import nm0.InterfaceC26834e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27837a0;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25310s;
import pk2.C29337b;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rk2.C31503g;
import rk2.C31504h;
import rk2.C31505i;
import rk2.InterfaceC31499c;
import rk2.InterfaceC31502f;
import rm0.C31585c;
import sk2.C32574a;
import tf3.C33768a;
import tk2.C33894l;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.AbstractC34650k;
import u82.C34648i;
import uf3.C34911a;
import uk2.C35053c;
import vf3.C35953c;
import vk2.C36089a;
import vk2.C36092d;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wk2.AbstractC37344e;
import wk2.C37340a;
import wk2.C37346g;
import wk2.C37348i;
import wk2.C37349j;
import wk2.InterfaceC37342c;
import x90.InterfaceC38100f;
import xf3.C38266c;
import xh1.C38309a;
import y90.C39351a;
import yg2.C39530e;
import z92.InterfaceC40205a;
import zh1.InterfaceC40639a;

/* JADX INFO: renamed from: lk2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Llk2/d;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24497d implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f95552c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C39351a(), new C38309a(), new C31585c());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final C37348i m71288A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37348i(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC31502f m71289B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31503g((InterfaceC31499c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31499c.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C31504h m71290C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("workManagerInstance");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31504h((AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), c35953c), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C32574a m71291D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("workManagerInstance");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32574a((AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), c35953c), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C26830a m71292E(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26830a((C34387c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34387c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C31505i m71293F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31505i((InterfaceC31502f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31502f.class), null), (C31504h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31504h.class), null), (InterfaceC38100f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC38100f.class), null), (InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final SessionTargetsFetcher m71294G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new SessionTargetsFetcher((InterfaceC26834e) factory.m122602a(new C24474b(8), AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26834e.class), null), null, 0, 0L, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m71295H() {
        return AbstractC15751g.m44431K(new C34648i(AbstractC34650k.m109496c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C25651r m71296I(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25651r((InterfaceC38100f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC38100f.class), null), (InterfaceC25654u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25654u.class), null), (ActivitiesApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), (C18292a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null), (InterfaceC31502f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31502f.class), null), (C31504h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31504h.class), null), (C39530e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39530e.class), null), (InterfaceC40639a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40639a.class), null), (InterfaceC13220a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC13220a.class), null), (C14520a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14520a.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (SessionTargetsFetcher) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SessionTargetsFetcher.class), null), null, null, null, 28672, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static final C29337b m71297J(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29337b(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C35053c m71298K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35053c((C29337b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29337b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C33894l m71299L(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33894l((C25651r) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C25651r.class), null), (C35053c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C35053c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C37349j m71300M(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37349j(null, (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (UserRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(UserRepository.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C24496c m71301N(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C24496c((Map) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), new C35953c("TRACK_ACTIVITY_MAPPING")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C24495b m71302O(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C24495b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C24494a m71303P(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C24494a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C37340a m71304Q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37340a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public static final C37346g m71305R(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37346g(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Clock m71306S(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return clockSystemDefaultZone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC37342c m71307T(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC37344e.m119584c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C36092d m71308U(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36092d((C37348i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37348i.class), null), (C37349j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37349j.class), null), (C37340a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37340a.class), null), (C37346g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37346g.class), null), (InterfaceC13220a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC13220a.class), null), (InterfaceC38100f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC38100f.class), null), (InterfaceC37342c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37342c.class), null), (Clock) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Clock.class), null), (C39530e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39530e.class), null), AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a)), null, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final InterfaceC25654u m71309V(C38266c c38266c, C34911a c34911a) {
        return (InterfaceC25654u) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25654u.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "PROCESS_SCOPED_TRACK_SESSION_SERVICE_CONNECTOR"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final InterfaceC25654u m71310W(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36089a((Context) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (C36092d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36092d.class), null), null, null, 12, null);
    }

    /* JADX INFO: renamed from: y */
    private static final C23454a0 m71335y(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "TRACK_ACTIVITY_MAPPING");
        C24405c c24405c = new C24405c(1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, c24405c, 2)), false);
        C24405c c24405c2 = new C24405c(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C37348i.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c24405c2, 2)), false);
        C24405c c24405c3 = new C24405c(7);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C37349j.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c24405c3, 2)), false);
        C24405c c24405c4 = new C24405c(8);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C37340a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c24405c4, 2)), false);
        C24405c c24405c5 = new C24405c(9);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C37346g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c24405c5, 2)), false);
        C24405c c24405c6 = new C24405c(10);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(Clock.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass6, null, c24405c6, 1)), false);
        C24405c c24405c7 = new C24405c(11);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(InterfaceC37342c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c24405c7, 1)), false);
        C24405c c24405c8 = new C24405c(13);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C36092d.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c24405c8, 1)), false);
        C24405c c24405c9 = new C24405c(14);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC25654u.class);
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass9, null, c24405c9, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), false, "PROCESS_SCOPED_TRACK_SESSION_SERVICE_CONNECTOR");
        C24405c c24405c10 = new C24405c(15);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(InterfaceC25654u.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, c35953cM73385r, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass10, c35953cM73385r, c24405c10, 1)), false);
        C24405c c24405c11 = new C24405c(12);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(InterfaceC31502f.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c24405c11, 2)), false);
        C24405c c24405c12 = new C24405c(16);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C31504h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c24405c12, 2)), false);
        C24405c c24405c13 = new C24405c(17);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C32574a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c24405c13, 2)), false);
        C24405c c24405c14 = new C24405c(18);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C26830a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c24405c14, 2)), false);
        C24405c c24405c15 = new C24405c(19);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C31505i.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c24405c15, 2)), false);
        C24405c c24405c16 = new C24405c(20);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(SessionTargetsFetcher.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c24405c16, 2)), false);
        C24405c c24405c17 = new C24405c(21);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C25651r.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c24405c17, 2)), false);
        C24405c c24405c18 = new C24405c(22);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C29337b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c24405c18, 2)), false);
        C24405c c24405c19 = new C24405c(23);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C35053c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c24405c19, 2)), false);
        C24405c c24405c20 = new C24405c(2);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C33894l.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c24405c20, 2)), false);
        C24405c c24405c21 = new C24405c(4);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C24496c.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass21, null, c24405c21, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        C24405c c24405c22 = new C24405c(5);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C24495b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass22, null, c24405c22, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        C24405c c24405c23 = new C24405c(6);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C24494a.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass23, null, c24405c23, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final Map m71336z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25247g0.m73989X(new C23465k("TRACK_SESSION_MINI_ARCH", AbstractC22671h0.f89337a.getOrCreateKotlinClass(TrackSessionMiniArchModel.class)));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m71335y(c33768a);
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
