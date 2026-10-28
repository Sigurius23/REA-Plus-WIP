package al0;

import ad3.AbstractC0757c;
import ah0.C0887h;
import ah0.C0889j;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import b83.C2807c;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bh0.C3248a;
import c93.InterfaceC4351m;
import cl0.C4795a;
import cl0.C4796b;
import cl0.C4797c;
import com.whoop.bot.api.AiConversationApi;
import com.whoop.bot.api.CommitJournalEntryApi;
import com.whoop.bot.api.CommitSelectionApi;
import com.whoop.bot.api.StartTurnApi;
import com.whoop.bot.api.SubmitFormApi;
import com.whoop.bot.api.WhoopCoachSettingsApi;
import com.whoop.bot.settings.CoachSettingsInteractor;
import com.whoop.bot.settings.CoachSettingsViewModel;
import com.whoop.bot.settings.CoachSettingsViewStateReducer;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.domain.formwidget.C5938f;
import dl0.C12165d;
import el0.C13313a;
import fh0.C14479a;
import fh0.C14485g;
import fi0.InterfaceC14515a;
import fl0.C14557b;
import fl0.C14559d;
import fl0.C14563h;
import fl0.InterfaceC14562g;
import fv1.InterfaceC14815c;
import ge3.AbstractC15751g;
import gl0.C15962a;
import hl0.C17393b;
import hl0.C17396e;
import hl0.C17397f;
import ih0.AbstractC18489d0;
import il0.C18619b;
import iy1.InterfaceC21030c;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l21.C23239c;
import l83.C23454a0;
import m32.C25008d;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import m83.AbstractC25265s;
import m83.C25271y;
import mh0.C25549a;
import mh0.C25555g;
import ml0.C25671c;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import nl0.C26803e;
import nm0.InterfaceC26834e;
import o02.InterfaceC27353d;
import od1.C27858u;
import ol0.C28012b;
import ol0.C28014d;
import or2.C28180m;
import or2.InterfaceC28215x1;
import org.koin.core.error.DefinitionParameterException;
import p003a1.C0111j;
import p004a2.C0155d;
import p007a6.C0431j;
import p114eb.AbstractC12939a0;
import p236j.AbstractC21071j;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23596b1;
import p720m91.InterfaceC25310s;
import p734sl0.C32645n0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import pl0.AbstractC29345c;
import pl0.C29346d;
import qf3.C30330b;
import r31.C30911f;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import rg0.C31381b;
import rg0.C31383d;
import rg0.C31384e;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.AbstractC34645f;
import u82.C34648i;
import u92.C34660d;
import ud3.C34824k0;
import ud3.C34826l0;
import uf3.C34911a;
import ug0.C34933b;
import ug0.C34934c;
import v02.C35512a;
import v02.C35513b;
import v53.C35709c;
import v82.C35799a;
import va3.AbstractC35846d;
import vf3.AbstractC35952b;
import vf3.C35953c;
import vg0.C35975a0;
import vg0.C35977b;
import vg0.C35978b0;
import vg0.C35979b1;
import vg0.C35982d;
import vg0.C35985e0;
import vg0.C35990h;
import vg0.C35991h0;
import vg0.C35993i0;
import vg0.C35994j;
import vg0.C35999l0;
import vg0.C36000m;
import vg0.C36006p;
import vg0.C36009q0;
import vg0.C36012s;
import vg0.C36015t0;
import vg0.C36018v;
import vg0.C36021w0;
import vg0.C36024y;
import vg0.C36027z0;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wg0.C37256f;
import wm0.C37378a;
import xf3.C38266c;
import xk0.C38423a;
import yg0.C39522a;
import yk0.C39598a;
import yl0.AbstractC39631n;
import yl0.C39625h;
import yl0.C39627j;
import yl0.C39629l;
import zg0.AbstractC40624g;
import zg0.C40625h;
import zl0.C40871c;
import zl0.C40872d;
import zl0.C40873e;
import zl0.C40875g;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: al0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lal0/j;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0975j implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f3591c = 8;

    /* JADX INFO: renamed from: d */
    private static final C33768a f3592d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35512a(), new C35799a());

    static {
        C33768a c33768a = new C33768a();
        m2564a1(c33768a);
        f3592d = c33768a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final C14563h m2460A1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14563h((InterfaceC14562g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14562g.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final C4797c m2461A2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4797c((C4796b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4796b.class), null), (C38423a) factory.m122602a(new C0155d(24), c22673i0.getOrCreateKotlinClass(C38423a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final Map m2464B1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC0976k.m2667a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final C34911a m2465B2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final CommitSelectionApi m2468C1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"))).m109897a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c34824k0M109897a.m109895e(2L, timeUnit);
        c34824k0M109897a.m109892b(2L, timeUnit);
        c34824k0M109897a.m109896f(2L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        return (CommitSelectionApi) c29222x0.m88730d().m88733b(CommitSelectionApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final C4796b m2469C2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4796b((C4795a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4795a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final CommitJournalEntryApi m2472D1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"))).m109897a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c34824k0M109897a.m109895e(2L, timeUnit);
        c34824k0M109897a.m109892b(2L, timeUnit);
        c34824k0M109897a.m109896f(2L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        return (CommitJournalEntryApi) c29222x0.m88730d().m88733b(CommitJournalEntryApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D2 */
    public static final C4795a m2473D2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C35513b c35513b = new C35513b(null, (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t), 1, 0 == true ? 1 : 0);
        C34387c c34387c = (C34387c) c38266c.m122602a(new C0973h((C35709c) c38266c.m122602a(new C0111j(c35513b, 4), c22673i0.getOrCreateKotlinClass(C35709c.class), new C35953c("serialization_configurable_ktor_client")), 0), c22673i0.getOrCreateKotlinClass(C34387c.class), null);
        C38423a c38423a = (C38423a) c38266c.m122602a(new C0155d(25), c22673i0.getOrCreateKotlinClass(C38423a.class), null);
        InterfaceC28215x1 interfaceC28215x1 = (InterfaceC28215x1) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28215x1.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C4795a(c34387c, c38423a, interfaceC28215x1, ExecutorC22364d.f87316w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final SubmitFormApi m2476E1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "defaultOkHttpClient");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953cM73387t)).m109897a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c34824k0M109897a.m109895e(2L, timeUnit);
        c34824k0M109897a.m109892b(2L, timeUnit);
        c34824k0M109897a.m109896f(2L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null)));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        return (SubmitFormApi) c29222x0.m88730d().m88733b(SubmitFormApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final C34911a m2477E2(C35513b c35513b) {
        return AbstractC15751g.m44431K(c35513b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final StartTurnApi m2480F1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"))).m109897a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c34824k0M109897a.m109895e(2L, timeUnit);
        c34824k0M109897a.m109892b(2L, timeUnit);
        c34824k0M109897a.m109896f(2L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        return (StartTurnApi) c29222x0.m88730d().m88733b(StartTurnApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final C34911a m2481F2(C35709c c35709c) {
        return AbstractC15751g.m44431K(c35709c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C12165d m2484G1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C12165d((InterfaceC26834e) factory.m122602a(new C0967b(new C34648i((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c)), 0), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), InterfaceC34116n.INSTANCE.m107848a("ChatMiniArchWidgetInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final C34911a m2485G2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final C34911a m2488H1(C34648i c34648i) {
        return AbstractC15751g.m44431K(c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final C18619b m2489H2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18619b((AiConversationApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiConversationApi.class), null), InterfaceC34116n.INSTANCE.m107848a("AiConversationHistoryInteractor"), (C38423a) factory.m122602a(new C0155d(22), c22673i0.getOrCreateKotlinClass(C38423a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public static final C28014d m2492I1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28014d(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final C34911a m2493I2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C28012b m2496J1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28012b((C12165d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C12165d.class), null), (C28014d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C28014d.class), null), (C31383d) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31383d.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final CoachSettingsViewModel m2497J2(C38266c viewModel, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof InterfaceC2994c0)) {
                next = null;
            }
        } while (next == null);
        InterfaceC2994c0 c28180m = (InterfaceC2994c0) next;
        if (c28180m == null) {
            c28180m = new C28180m(null, 1, null);
        }
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new CoachSettingsViewModel(c28180m, (CoachSettingsInteractor) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(CoachSettingsInteractor.class), null), (CoachSettingsViewStateReducer) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(CoachSettingsViewStateReducer.class), null), (C38423a) viewModel.m122602a(new C0155d(27), c22673i0.getOrCreateKotlinClass(C38423a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C5938f m2500K1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C5938f((InterfaceC26834e) factory.m122602a(new C0967b(new C34648i((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c)), 2), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (SubmitFormApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SubmitFormApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), InterfaceC34116n.INSTANCE.m107848a("FormWidgetInteractor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C34911a m2501K2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final C34911a m2504L1(C34648i c34648i) {
        return AbstractC15751g.m44431K(c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final CoachSettingsInteractor m2505L2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new CoachSettingsInteractor((InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final C0889j m2508M1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0889j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final CoachSettingsViewStateReducer m2509M2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new CoachSettingsViewStateReducer((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final C0887h m2512N1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0887h((C5938f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C5938f.class), null), (C0889j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C0889j.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C38423a m2513N2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        String str = (String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class));
        String str2 = (String) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(String.class));
        String str3 = (String) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(String.class));
        String str4 = (String) c34911a.m110110a(3, c22673i0.getOrCreateKotlinClass(String.class));
        String str5 = (String) c34911a.m110110a(4, c22673i0.getOrCreateKotlinClass(String.class));
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        if (str == null) {
            str = "";
        }
        String str6 = str2 == null ? "" : str2;
        String str7 = str3 == null ? "" : str3;
        String str8 = str4 == null ? "" : str4;
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C38423a(interfaceC14515a, str, str6, str7, str8, clockSystemDefaultZone, (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), str5 == null ? "" : str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final AbstractC0757c m2516O1(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-feature-models")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final C31383d m2517O2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31383d((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final C40873e m2520P1(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40873e(new C40872d((CommitSelectionApi) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(CommitSelectionApi.class), null), InterfaceC34116n.INSTANCE.m107848a("SelectionWidgetInteractor"), new C40871c(null, (List) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(List.class)), null, null, (String) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(String.class)), 13, null)), new C40875g((C30911f) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(C30911f.class))), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final C31384e m2521P2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31384e((InterfaceC14515a) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final C39627j m2524Q1(C38266c viewModel, C34911a c34911a) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        String str = (String) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(String.class));
        C23239c c23239c = (C23239c) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(C23239c.class));
        return new C39627j(new C39625h((CommitJournalEntryApi) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(CommitJournalEntryApi.class), null), InterfaceC34116n.INSTANCE.m107848a("JournalEntryWidgetInteractor"), AbstractC39631n.m126684q(c23239c, str)), new C39629l(c23239c), (C31384e) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C31384e.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final C14557b m2525Q2(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        for (Object obj : params.f147011a) {
            if (!(obj instanceof C32645n0)) {
                obj = null;
            }
            if (obj != null) {
                C35953c c35953c = new C35953c("ai-conversation-json");
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                return new C14557b((AiConversationApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiConversationApi.class), null), (InterfaceC28215x1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28215x1.class), null), ((C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"))).m84056g(), null, (C4797c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C4797c.class), null), (InterfaceC26834e) factory.m122602a(new C0967b(new C34648i((AbstractC0757c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953c)), 1), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C34387c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34387c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C38423a) factory.m122602a(new C0970e((C32645n0) obj, 5), c22673i0.getOrCreateKotlinClass(C38423a.class), null), (InterfaceC14815c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14815c.class), null), (C14563h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14563h.class), null), 8, null);
            }
        }
        obj = null;
        C35953c c35953c2 = new C35953c("ai-conversation-json");
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        return new C14557b((AiConversationApi) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(AiConversationApi.class), null), (InterfaceC28215x1) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(InterfaceC28215x1.class), null), ((C27858u) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"))).m84056g(), null, (C4797c) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(C4797c.class), null), (InterfaceC26834e) factory.m122602a(new C0967b(new C34648i((AbstractC0757c) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(AbstractC0757c.class), c35953c2)), 1), c22673i1.getOrCreateKotlinClass(InterfaceC26834e.class), null), (C34387c) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(C34387c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C38423a) factory.m122602a(new C0970e((C32645n0) obj, 5), c22673i1.getOrCreateKotlinClass(C38423a.class), null), (InterfaceC14815c) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(InterfaceC14815c.class), null), (C14563h) factory.m122602a(null, c22673i1.getOrCreateKotlinClass(C14563h.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R1 */
    public static final C14479a m2528R1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14479a((C34387c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34387c.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C34911a m2529R2(C34648i c34648i) {
        return AbstractC15751g.m44431K(c34648i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S1 */
    public static final C14485g m2532S1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C14485g((C14479a) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14479a.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final C34911a m2533S2(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0 != null ? c32645n0.getSourcePillar() : null, c32645n0 != null ? c32645n0.getSourceType() : null, c32645n0 != null ? c32645n0.getPresetQuestion() : null, c32645n0 != null ? c32645n0.getSourceId() : null, c32645n0 != null ? c32645n0.getSource() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T1 */
    public static final C25549a m2536T1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C25549a((StartTurnApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(StartTurnApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final C31381b m2537T2(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        C31383d c31383d = (C31383d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31383d.class), null);
        ArrayList arrayList = params.f147011a;
        Object objM74102I0 = AbstractC25265s.m74102I0(0, arrayList);
        String str = objM74102I0 instanceof String ? (String) objM74102I0 : null;
        if (str == null) {
            str = "";
        }
        Object objM74102I1 = AbstractC25265s.m74102I0(1, arrayList);
        String str2 = objM74102I1 instanceof String ? (String) objM74102I1 : null;
        if (str2 == null) {
            str2 = "";
        }
        Object objM74102I2 = AbstractC25265s.m74102I0(2, arrayList);
        String str3 = objM74102I2 instanceof String ? (String) objM74102I2 : null;
        if (str3 == null) {
            str3 = "";
        }
        Object objM74102I3 = AbstractC25265s.m74102I0(3, arrayList);
        String str4 = objM74102I3 instanceof String ? (String) objM74102I3 : null;
        if (str4 == null) {
            str4 = "";
        }
        Object objM74102I4 = AbstractC25265s.m74102I0(4, arrayList);
        String str5 = objM74102I4 instanceof String ? (String) objM74102I4 : null;
        if (str5 == null) {
            str5 = "";
        }
        Object objM74102I5 = AbstractC25265s.m74102I0(5, arrayList);
        String str6 = objM74102I5 instanceof String ? (String) objM74102I5 : null;
        return new C31381b(interfaceC14515a, interfaceC21030c, c31383d, str, str2, str3, str4, str5, str6 == null ? "" : str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U1 */
    public static final C25555g m2540U1(C38266c viewModel, C34911a it) {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(it, "it");
        return new C25555g((C25549a) viewModel.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25549a.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final C39598a m2541U2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39598a((WhoopCoachSettingsApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopCoachSettingsApi.class), null), (C38423a) factory.m122602a(new C0155d(26), c22673i0.getOrCreateKotlinClass(C38423a.class), null), InterfaceC34116n.INSTANCE.m107848a("WhoopCoachRepository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final C17393b m2544V1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C17393b((AiConversationApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiConversationApi.class), null), (C38423a) factory.m122602a(new C0974i(0), c22673i0.getOrCreateKotlinClass(C38423a.class), null), (C17396e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17396e.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final C34911a m2545V2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C34911a m2548W1() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final WhoopCoachSettingsApi m2549W2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")));
        return (WhoopCoachSettingsApi) c29222x0.m88730d().m88733b(WhoopCoachSettingsApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C17397f m2552X1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17397f(0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final C15962a m2553X2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC26834e interfaceC26834e = (InterfaceC26834e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null);
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("EducationHubInteractor");
        C34660d c34660d = (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs"));
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C15962a(interfaceC26834e, c34660d, ExecutorC22364d.f87316w, interfaceC34116nM107848a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C17396e m2556Y1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17396e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final InterfaceC25007c m2557Y2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25008d(InterfaceC34116n.INSTANCE.m107848a("LocationPermissionsHelper"), (AbstractC21071j) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractC21071j.class)), (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null), (List) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(List.class)), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (String) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(String.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C29346d m2560Z1(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C29346d(featureFlagChecker, abstractC21909c, null, (String) objM110111b, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z2 */
    public static final C36000m m2561Z2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36000m((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a1 */
    private static final C23454a0 m2564a1(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C23596b1.f93677a.m68523b(AbstractC29345c.m89364V());
        C0431j c0431j = new C0431j(1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C0978m.class);
        C35953c c35953c = C37247a.f159360e;
        C30330b c30330b = new C30330b(c35953c, orCreateKotlinClass, null, c0431j, 1);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(c30330b, module, AbstractC21598x.m60669Y(c30330b.f124471b, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31365dM73383p.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p, true);
        C30330b c30330b3 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C0977l.class), null, new C0431j(3), 1);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(c30330b3, module, AbstractC21598x.m60669Y(c30330b3.f124471b, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b4 = c31365dM73383p2.f129023a;
        c30330b4.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b4.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b4.f124472c, c30330b4.f124470a), c31365dM73383p2, true);
        C30330b c30330b5 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C0979n.class), null, new C0431j(15), 1);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(c30330b5, module, AbstractC21598x.m60669Y(c30330b5.f124471b, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b6 = c31365dM73383p3.f129023a;
        c30330b6.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b6.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b6.f124472c, c30330b6.f124470a), c31365dM73383p3, true);
        C35953c c35953c2 = new C35953c("ai-feature-models");
        C30330b c30330b7 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(Map.class), c35953c2, new C0431j(27), 1);
        C35953c c35953cM53379t = AbstractC18489d0.m53379t(c30330b7, module, AbstractC21598x.m60669Y(c30330b7.f124471b, c35953c2, c35953c), false, "ai-conversation-json");
        final int i13 = 9;
        C30330b c30330b8 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM53379t, new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.f124471b, c35953cM53379t, c35953c), new C31365d(c30330b8), false);
        final int i14 = 21;
        C30330b c30330b9 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AiConversationApi.class), null, new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b9.f124471b, null, c35953c), new C31365d(c30330b9), false);
        C30330b c30330b10 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(AiChatApi.class), null, new C0969d(3), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b10.f124471b, null, c35953c), new C31365d(c30330b10), false);
        C30330b c30330b11 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C14557b.class), null, new C0969d(10), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b11.f124471b, null, c35953c), new C31362a(c30330b11), false);
        C30330b c30330b12 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36000m.class), null, new C0969d(11), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.f124471b, null, c35953c), new C31362a(c30330b12), false);
        C30330b c30330b13 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36009q0.class), null, new C0969d(12), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.f124471b, null, c35953c), new C31362a(c30330b13), false);
        C30330b c30330b14 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36024y.class), null, new C0431j(12), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.f124471b, null, c35953c), new C31362a(c30330b14), false);
        C30330b c30330b15 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36018v.class), null, new C0431j(23), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.f124471b, null, c35953c), new C31362a(c30330b15), false);
        final int i15 = 4;
        C30330b c30330b16 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C36012s.class), null, new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.f124471b, null, c35953c), new C31362a(c30330b16), false);
        final int i16 = 15;
        C30330b c30330b17 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35991h0.class), null, new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.f124471b, null, c35953c), new C31362a(c30330b17), false);
        final int i17 = 26;
        C30330b c30330b18 = new C30330b(c35953c, c22673i0.getOrCreateKotlinClass(C35999l0.class), null, new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        }, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.f124471b, null, c35953c), new C31362a(c30330b18), false);
        C30330b c30330b19 = new C30330b(c35953c, AbstractC22671h0.m65688a(C35985e0.class), null, new C0969d(7), 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.m92688a(), null, c35953c), new C31362a(c30330b19), false);
        C0969d c0969d = new C0969d(13);
        C35953c c35953cM113782g = AbstractC35846d.m113782g();
        C30330b c30330b20 = new C30330b(c35953cM113782g, AbstractC22671h0.m65688a(C35993i0.class), null, c0969d, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b20.m92688a(), null, c35953cM113782g), new C31362a(c30330b20), false);
        C0969d c0969d2 = new C0969d(14);
        C35953c c35953cM113782g2 = AbstractC35846d.m113782g();
        C30330b c30330b21 = new C30330b(c35953cM113782g2, AbstractC22671h0.m65688a(C36021w0.class), null, c0969d2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b21.m92688a(), null, c35953cM113782g2), new C31362a(c30330b21), false);
        C0969d c0969d3 = new C0969d(15);
        C35953c c35953cM113782g3 = AbstractC35846d.m113782g();
        C30330b c30330b22 = new C30330b(c35953cM113782g3, AbstractC22671h0.m65688a(C36015t0.class), null, c0969d3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.m92688a(), null, c35953cM113782g3), new C31362a(c30330b22), false);
        C0431j c0431j2 = new C0431j(2);
        C35953c c35953cM113782g4 = AbstractC35846d.m113782g();
        C30330b c30330b23 = new C30330b(c35953cM113782g4, AbstractC22671h0.m65688a(C35979b1.class), null, c0431j2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b23.m92688a(), null, c35953cM113782g4), new C31362a(c30330b23), false);
        C0431j c0431j3 = new C0431j(4);
        C35953c c35953cM113782g5 = AbstractC35846d.m113782g();
        C30330b c30330b24 = new C30330b(c35953cM113782g5, AbstractC22671h0.m65688a(C37256f.class), null, c0431j3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.m92688a(), null, c35953cM113782g5), new C31362a(c30330b24), false);
        C0431j c0431j4 = new C0431j(5);
        C35953c c35953cM113782g6 = AbstractC35846d.m113782g();
        C30330b c30330b25 = new C30330b(c35953cM113782g6, AbstractC22671h0.m65688a(C35990h.class), null, c0431j4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.m92688a(), null, c35953cM113782g6), new C31362a(c30330b25), false);
        C0431j c0431j5 = new C0431j(6);
        C35953c c35953cM113782g7 = AbstractC35846d.m113782g();
        C30330b c30330b26 = new C30330b(c35953cM113782g7, AbstractC22671h0.m65688a(C35977b.class), null, c0431j5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b26.m92688a(), null, c35953cM113782g7), new C31362a(c30330b26), false);
        C0431j c0431j6 = new C0431j(7);
        C35953c c35953cM113782g8 = AbstractC35846d.m113782g();
        C30330b c30330b27 = new C30330b(c35953cM113782g8, AbstractC22671h0.m65688a(C36027z0.class), null, c0431j6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b27.m92688a(), null, c35953cM113782g8), new C31362a(c30330b27), false);
        C0431j c0431j7 = new C0431j(8);
        C35953c c35953cM113782g9 = AbstractC35846d.m113782g();
        C30330b c30330b28 = new C30330b(c35953cM113782g9, AbstractC22671h0.m65688a(C36006p.class), null, c0431j7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b28.m92688a(), null, c35953cM113782g9), new C31362a(c30330b28), false);
        C0431j c0431j8 = new C0431j(9);
        C35953c c35953cM113782g10 = AbstractC35846d.m113782g();
        C30330b c30330b29 = new C30330b(c35953cM113782g10, AbstractC22671h0.m65688a(C35994j.class), null, c0431j8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b29.m92688a(), null, c35953cM113782g10), new C31362a(c30330b29), false);
        C0431j c0431j9 = new C0431j(10);
        C35953c c35953cM113782g11 = AbstractC35846d.m113782g();
        C30330b c30330b30 = new C30330b(c35953cM113782g11, AbstractC22671h0.m65688a(C34933b.class), null, c0431j9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b30.m92688a(), null, c35953cM113782g11), new C31362a(c30330b30), false);
        C0431j c0431j10 = new C0431j(11);
        C35953c c35953cM113782g12 = AbstractC35846d.m113782g();
        C30330b c30330b31 = new C30330b(c35953cM113782g12, AbstractC22671h0.m65688a(C35975a0.class), null, c0431j10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.m92688a(), null, c35953cM113782g12), new C31362a(c30330b31), false);
        C0431j c0431j11 = new C0431j(13);
        C35953c c35953cM113782g13 = AbstractC35846d.m113782g();
        C30330b c30330b32 = new C30330b(c35953cM113782g13, AbstractC22671h0.m65688a(InterfaceC14562g.class), null, c0431j11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.m92688a(), null, c35953cM113782g13), new C31362a(c30330b32), false);
        C0431j c0431j12 = new C0431j(14);
        C35953c c35953cM113782g14 = AbstractC35846d.m113782g();
        C30330b c30330b33 = new C30330b(c35953cM113782g14, AbstractC22671h0.m65688a(C14563h.class), null, c0431j12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b33.m92688a(), null, c35953cM113782g14), new C31362a(c30330b33), false);
        C30330b c30330b34 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(CommitSelectionApi.class), null, new C0431j(16), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b34), false);
        C30330b c30330b35 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(CommitJournalEntryApi.class), null, new C0431j(17), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b35), false);
        C30330b c30330b36 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(SubmitFormApi.class), null, new C0431j(18), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b36.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b36), false);
        C30330b c30330b37 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(StartTurnApi.class), null, new C0431j(19), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b37.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b37), false);
        C0431j c0431j13 = new C0431j(20);
        C35953c c35953cM113782g15 = AbstractC35846d.m113782g();
        C30330b c30330b38 = new C30330b(c35953cM113782g15, AbstractC22671h0.m65688a(C12165d.class), null, c0431j13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b38.m92688a(), null, c35953cM113782g15), new C31362a(c30330b38), false);
        C0431j c0431j14 = new C0431j(21);
        C35953c c35953cM113782g16 = AbstractC35846d.m113782g();
        C30330b c30330b39 = new C30330b(c35953cM113782g16, AbstractC22671h0.m65688a(C28014d.class), null, c0431j14, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b39.m92688a(), null, c35953cM113782g16), new C31362a(c30330b39), false);
        C0431j c0431j15 = new C0431j(22);
        C35953c c35953cM113782g17 = AbstractC35846d.m113782g();
        C30330b c30330b40 = new C30330b(c35953cM113782g17, AbstractC22671h0.m65688a(C28012b.class), null, c0431j15, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b40.m92688a(), null, c35953cM113782g17), new C31362a(c30330b40), false);
        C0431j c0431j16 = new C0431j(24);
        C35953c c35953cM113782g18 = AbstractC35846d.m113782g();
        C30330b c30330b41 = new C30330b(c35953cM113782g18, AbstractC22671h0.m65688a(C5938f.class), null, c0431j16, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b41.m92688a(), null, c35953cM113782g18), new C31362a(c30330b41), false);
        C0431j c0431j17 = new C0431j(25);
        C35953c c35953cM113782g19 = AbstractC35846d.m113782g();
        C30330b c30330b42 = new C30330b(c35953cM113782g19, AbstractC22671h0.m65688a(C0889j.class), null, c0431j17, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b42.m92688a(), null, c35953cM113782g19), new C31362a(c30330b42), false);
        C0431j c0431j18 = new C0431j(26);
        C35953c c35953cM113782g20 = AbstractC35846d.m113782g();
        C30330b c30330b43 = new C30330b(c35953cM113782g20, AbstractC22671h0.m65688a(C0887h.class), null, c0431j18, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b43.m92688a(), null, c35953cM113782g20), new C31362a(c30330b43), false);
        C0431j c0431j19 = new C0431j(28);
        C35953c c35953cM113782g21 = AbstractC35846d.m113782g();
        C30330b c30330b44 = new C30330b(c35953cM113782g21, AbstractC22671h0.m65688a(C40873e.class), null, c0431j19, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b44.m92688a(), null, c35953cM113782g21), new C31362a(c30330b44), false);
        C0431j c0431j20 = new C0431j(29);
        C35953c c35953cM113782g22 = AbstractC35846d.m113782g();
        C30330b c30330b45 = new C30330b(c35953cM113782g22, AbstractC22671h0.m65688a(C39627j.class), null, c0431j20, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b45.m92688a(), null, c35953cM113782g22), new C31362a(c30330b45), false);
        final int i18 = 0;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g23 = AbstractC35846d.m113782g();
        C30330b c30330b46 = new C30330b(c35953cM113782g23, AbstractC22671h0.m65688a(C14479a.class), null, interfaceC4351m, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b46.m92688a(), null, c35953cM113782g23), new C31362a(c30330b46), false);
        final int i19 = 1;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g24 = AbstractC35846d.m113782g();
        C30330b c30330b47 = new C30330b(c35953cM113782g24, AbstractC22671h0.m65688a(C14485g.class), null, interfaceC4351m2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b47.m92688a(), null, c35953cM113782g24), new C31362a(c30330b47), false);
        final int i24 = 2;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g25 = AbstractC35846d.m113782g();
        C30330b c30330b48 = new C30330b(c35953cM113782g25, AbstractC22671h0.m65688a(C25549a.class), null, interfaceC4351m3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b48.m92688a(), null, c35953cM113782g25), new C31362a(c30330b48), false);
        final int i25 = 3;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g26 = AbstractC35846d.m113782g();
        C30330b c30330b49 = new C30330b(c35953cM113782g26, AbstractC22671h0.m65688a(C25555g.class), null, interfaceC4351m4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b49.m92688a(), null, c35953cM113782g26), new C31362a(c30330b49), false);
        final int i26 = 5;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g27 = AbstractC35846d.m113782g();
        C30330b c30330b50 = new C30330b(c35953cM113782g27, AbstractC22671h0.m65688a(C17393b.class), null, interfaceC4351m5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b50.m92688a(), null, c35953cM113782g27), new C31362a(c30330b50), false);
        final int i27 = 6;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g28 = AbstractC35846d.m113782g();
        C30330b c30330b51 = new C30330b(c35953cM113782g28, AbstractC22671h0.m65688a(C17397f.class), null, interfaceC4351m6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b51.m92688a(), null, c35953cM113782g28), new C31362a(c30330b51), false);
        final int i28 = 7;
        C30330b c30330b52 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C17396e.class), null, new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b52.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b52), false);
        final int i29 = 8;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g29 = AbstractC35846d.m113782g();
        C30330b c30330b53 = new C30330b(c35953cM113782g29, AbstractC22671h0.m65688a(C29346d.class), null, interfaceC4351m7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b53.m92688a(), null, c35953cM113782g29), new C31362a(c30330b53), false);
        final int i34 = 10;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g30 = AbstractC35846d.m113782g();
        C30330b c30330b54 = new C30330b(c35953cM113782g30, AbstractC22671h0.m65688a(C3248a.class), null, interfaceC4351m8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b54.m92688a(), null, c35953cM113782g30), new C31362a(c30330b54), false);
        final int i35 = 11;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g31 = AbstractC35846d.m113782g();
        C30330b c30330b55 = new C30330b(c35953cM113782g31, AbstractC22671h0.m65688a(C35978b0.class), null, interfaceC4351m9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b55.m92688a(), null, c35953cM113782g31), new C31362a(c30330b55), false);
        final int i36 = 12;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g32 = AbstractC35846d.m113782g();
        C30330b c30330b56 = new C30330b(c35953cM113782g32, AbstractC22671h0.m65688a(C26803e.class), null, interfaceC4351m10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b56.m92688a(), null, c35953cM113782g32), new C31362a(c30330b56), false);
        final int i37 = 13;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g33 = AbstractC35846d.m113782g();
        C30330b c30330b57 = new C30330b(c35953cM113782g33, AbstractC22671h0.m65688a(C40625h.class), null, interfaceC4351m11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b57.m92688a(), null, c35953cM113782g33), new C31362a(c30330b57), false);
        final int i38 = 14;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g34 = AbstractC35846d.m113782g();
        C30330b c30330b58 = new C30330b(c35953cM113782g34, AbstractC22671h0.m65688a(C13313a.class), null, interfaceC4351m12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b58.m92688a(), null, c35953cM113782g34), new C31362a(c30330b58), false);
        final int i39 = 16;
        InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g35 = AbstractC35846d.m113782g();
        C30330b c30330b59 = new C30330b(c35953cM113782g35, AbstractC22671h0.m65688a(C35982d.class), null, interfaceC4351m13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b59.m92688a(), null, c35953cM113782g35), new C31362a(c30330b59), false);
        final int i44 = 17;
        InterfaceC4351m interfaceC4351m14 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g36 = AbstractC35846d.m113782g();
        C30330b c30330b60 = new C30330b(c35953cM113782g36, AbstractC22671h0.m65688a(C34934c.class), null, interfaceC4351m14, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b60.m92688a(), null, c35953cM113782g36), new C31362a(c30330b60), false);
        final int i45 = 18;
        InterfaceC4351m interfaceC4351m15 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g37 = AbstractC35846d.m113782g();
        C30330b c30330b61 = new C30330b(c35953cM113782g37, AbstractC22671h0.m65688a(C25671c.class), null, interfaceC4351m15, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b61.m92688a(), null, c35953cM113782g37), new C31362a(c30330b61), false);
        C35953c c35953cM114198f = AbstractC35952b.m114198f("COACH_WRAPPER_NAVIGATION_ROUTER");
        final int i46 = 19;
        InterfaceC4351m interfaceC4351m16 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g38 = AbstractC35846d.m113782g();
        C30330b c30330b62 = new C30330b(c35953cM113782g38, AbstractC22671h0.m65688a(C25671c.class), c35953cM114198f, interfaceC4351m16, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b62.m92688a(), c35953cM114198f, c35953cM113782g38), new C31362a(c30330b62), false);
        C35953c c35953cM114198f2 = AbstractC35952b.m114198f("AI_CHAT_NAVIGATION_ROUTER");
        final int i47 = 20;
        InterfaceC4351m interfaceC4351m17 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g39 = AbstractC35846d.m113782g();
        C30330b c30330b63 = new C30330b(c35953cM113782g39, AbstractC22671h0.m65688a(C39522a.class), c35953cM114198f2, interfaceC4351m17, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b63.m92688a(), c35953cM114198f2, c35953cM113782g39), new C31362a(c30330b63), false);
        final int i48 = 22;
        InterfaceC4351m interfaceC4351m18 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g40 = AbstractC35846d.m113782g();
        C30330b c30330b64 = new C30330b(c35953cM113782g40, AbstractC22671h0.m65688a(C4797c.class), null, interfaceC4351m18, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b64.m92688a(), null, c35953cM113782g40), new C31362a(c30330b64), false);
        final int i49 = 23;
        InterfaceC4351m interfaceC4351m19 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g41 = AbstractC35846d.m113782g();
        C30330b c30330b65 = new C30330b(c35953cM113782g41, AbstractC22671h0.m65688a(C4796b.class), null, interfaceC4351m19, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b65.m92688a(), null, c35953cM113782g41), new C31362a(c30330b65), false);
        final int i54 = 24;
        InterfaceC4351m interfaceC4351m20 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g42 = AbstractC35846d.m113782g();
        C30330b c30330b66 = new C30330b(c35953cM113782g42, AbstractC22671h0.m65688a(C4795a.class), null, interfaceC4351m20, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b66.m92688a(), null, c35953cM113782g42), new C31362a(c30330b66), false);
        final int i55 = 25;
        InterfaceC4351m interfaceC4351m21 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g43 = AbstractC35846d.m113782g();
        C30330b c30330b67 = new C30330b(c35953cM113782g43, AbstractC22671h0.m65688a(C18619b.class), null, interfaceC4351m21, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b67.m92688a(), null, c35953cM113782g43), new C31362a(c30330b67), false);
        final int i56 = 27;
        InterfaceC4351m interfaceC4351m22 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g44 = AbstractC35846d.m113782g();
        C30330b c30330b68 = new C30330b(c35953cM113782g44, AbstractC22671h0.m65688a(CoachSettingsViewModel.class), null, interfaceC4351m22, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b68.m92688a(), null, c35953cM113782g44), new C31362a(c30330b68), false);
        final int i57 = 28;
        InterfaceC4351m interfaceC4351m23 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g45 = AbstractC35846d.m113782g();
        C30330b c30330b69 = new C30330b(c35953cM113782g45, AbstractC22671h0.m65688a(CoachSettingsInteractor.class), null, interfaceC4351m23, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b69.m92688a(), null, c35953cM113782g45), new C31362a(c30330b69), false);
        final int i58 = 29;
        InterfaceC4351m interfaceC4351m24 = new InterfaceC4351m() { // from class: al0.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C0975j.m2528R1(c38266c, c34911a);
                    case 1:
                        return C0975j.m2532S1(c38266c, c34911a);
                    case 2:
                        return C0975j.m2536T1(c38266c, c34911a);
                    case 3:
                        return C0975j.m2540U1(c38266c, c34911a);
                    case 4:
                        return C0975j.m2585f1(c38266c, c34911a);
                    case 5:
                        return C0975j.m2544V1(c38266c, c34911a);
                    case 6:
                        return C0975j.m2552X1(c38266c, c34911a);
                    case 7:
                        return C0975j.m2556Y1(c38266c, c34911a);
                    case 8:
                        return C0975j.m2560Z1(c38266c, c34911a);
                    case 9:
                        return C0975j.m2516O1(c38266c, c34911a);
                    case 10:
                        return C0975j.m2570b2(c38266c, c34911a);
                    case 11:
                        return C0975j.m2574c2(c38266c, c34911a);
                    case 12:
                        return C0975j.m2578d2(c38266c, c34911a);
                    case 13:
                        return C0975j.m2594h2(c38266c, c34911a);
                    case 14:
                        return C0975j.m2610l2(c38266c, c34911a);
                    case 15:
                        return C0975j.m2589g1(c38266c, c34911a);
                    case 16:
                        return C0975j.m2618n2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C0975j.m2626p2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C0975j.m2634r2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C0975j.m2646u2(c38266c, c34911a);
                    case 20:
                        return C0975j.m2658x2(c38266c, c34911a);
                    case 21:
                        return C0975j.m2565a2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C0975j.m2461A2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C0975j.m2469C2(c38266c, c34911a);
                    case 24:
                        return C0975j.m2473D2(c38266c, c34911a);
                    case 25:
                        return C0975j.m2489H2(c38266c, c34911a);
                    case 26:
                        return C0975j.m2593h1(c38266c, c34911a);
                    case 27:
                        return C0975j.m2497J2(c38266c, c34911a);
                    case 28:
                        return C0975j.m2505L2(c38266c, c34911a);
                    default:
                        return C0975j.m2509M2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g46 = AbstractC35846d.m113782g();
        C30330b c30330b70 = new C30330b(c35953cM113782g46, AbstractC22671h0.m65688a(CoachSettingsViewStateReducer.class), null, interfaceC4351m24, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b70.m92688a(), null, c35953cM113782g46), new C31362a(c30330b70), false);
        C0969d c0969d4 = new C0969d(0);
        C35953c c35953cM113782g47 = AbstractC35846d.m113782g();
        C30330b c30330b71 = new C30330b(c35953cM113782g47, AbstractC22671h0.m65688a(C38423a.class), null, c0969d4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b71.m92688a(), null, c35953cM113782g47), new C31362a(c30330b71), false);
        C30330b c30330b72 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31383d.class), null, new C0969d(1), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b72.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b72), false);
        C30330b c30330b73 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31384e.class), null, new C0969d(2), 1);
        C35953c c35953cM95648x = AbstractC31061c.m95648x(c30330b73, module, AbstractC21598x.m60669Y(c30330b73.m92688a(), null, AbstractC35846d.m113782g()), "AI_CHAT_ANALYTICS_HELPER");
        C0969d c0969d5 = new C0969d(4);
        C35953c c35953cM113782g48 = AbstractC35846d.m113782g();
        C30330b c30330b74 = new C30330b(c35953cM113782g48, AbstractC22671h0.m65688a(C31381b.class), c35953cM95648x, c0969d5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b74.m92688a(), c35953cM95648x, c35953cM113782g48), new C31362a(c30330b74), false);
        C0969d c0969d6 = new C0969d(5);
        C35953c c35953cM113782g49 = AbstractC35846d.m113782g();
        C30330b c30330b75 = new C30330b(c35953cM113782g49, AbstractC22671h0.m65688a(C39598a.class), null, c0969d6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b75.m92688a(), null, c35953cM113782g49), new C31362a(c30330b75), false);
        C30330b c30330b76 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(WhoopCoachSettingsApi.class), null, new C0969d(6), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b76.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b76), false);
        C0969d c0969d7 = new C0969d(8);
        C35953c c35953cM113782g50 = AbstractC35846d.m113782g();
        C30330b c30330b77 = new C30330b(c35953cM113782g50, AbstractC22671h0.m65688a(C15962a.class), null, c0969d7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b77.m92688a(), null, c35953cM113782g50), new C31362a(c30330b77), false);
        C35953c c35953cM114198f3 = AbstractC35952b.m114198f("location-permission-helper");
        C0969d c0969d8 = new C0969d(9);
        C35953c c35953cM113782g51 = AbstractC35846d.m113782g();
        C30330b c30330b78 = new C30330b(c35953cM113782g51, AbstractC22671h0.m65688a(InterfaceC25007c.class), c35953cM114198f3, c0969d8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b78.m92688a(), c35953cM114198f3, c35953cM113782g51), new C31362a(c30330b78), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final AiConversationApi m2565a2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"))).m109897a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c34824k0M109897a.m109895e(2L, timeUnit);
        c34824k0M109897a.m109892b(2L, timeUnit);
        c34824k0M109897a.m109896f(2L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        return (AiConversationApi) c29222x0.m88730d().m88733b(AiConversationApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a3 */
    public static final C36009q0 m2566a3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36009q0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C0978m m2569b1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C0978m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final C3248a m2570b2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C3248a(featureFlagChecker, abstractC21909c, null, (String) objM110111b, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final C0977l m2573c1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C0977l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C35978b0 m2574c2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35978b0((AbstractC21909c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public static final C36024y m2577d1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36024y((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C26803e m2578d2(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C32645n0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C32645n0.class, new StringBuilder("No value found for type '"), '\''));
        }
        C32645n0 c32645n0 = (C32645n0) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, InterfaceC2994c0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C26803e((InterfaceC2994c0) objM110111b2, (C38423a) viewModel.m122602a(new C0970e(c32645n0, 4), c22673i0.getOrCreateKotlinClass(C38423a.class), null), (C13313a) viewModel.m122602a(new C0970e(c32645n0, 2), c22673i0.getOrCreateKotlinClass(C13313a.class), null), (C29346d) viewModel.m122602a(new C0970e(c32645n0, 3), c22673i0.getOrCreateKotlinClass(C29346d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public static final C36018v m2581e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36018v((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C34911a m2582e2(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    public static final C36012s m2585f1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36012s((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C34911a m2586f2(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0.getHint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public static final C35991h0 m2589g1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35991h0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final C34911a m2590g2(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0.getSourcePillar(), c32645n0.getSourceType(), c32645n0.getPresetQuestion(), c32645n0.getSourceId(), c32645n0.getSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h1 */
    public static final C35999l0 m2593h1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35999l0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final C40625h m2594h2(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        Object next;
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C32645n0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C32645n0.class, new StringBuilder("No value found for type '"), '\''));
        }
        C32645n0 c32645n0 = (C32645n0) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(C35993i0.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C35993i0.class, new StringBuilder("No value found for type '"), '\''));
        }
        C35993i0 c35993i0 = (C35993i0) objM110111b2;
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof C28180m)) {
                next = null;
            }
        } while (next == null);
        C28180m c28180m = (C28180m) next;
        if (c28180m == null) {
            c28180m = new C28180m(null, 1, null);
        }
        C28180m c28180m2 = c28180m;
        C0966a c0966a = new C0966a(c32645n0, c35993i0, 1);
        C22673i0 c22673i1 = AbstractC22671h0.f89337a;
        return new C40625h(c28180m2, (C31381b) viewModel.m122602a(new C0970e(c32645n0, 1), c22673i1.getOrCreateKotlinClass(C31381b.class), new C35953c("AI_CHAT_ANALYTICS_HELPER")), (C34934c) viewModel.m122602a(c0966a, c22673i1.getOrCreateKotlinClass(C34934c.class), null), (C3248a) viewModel.m122602a(new C0970e(c32645n0, 0), c22673i1.getOrCreateKotlinClass(C3248a.class), null), c32645n0.m102033r() ? AbstractC37056f.m118958J(AbstractC40624g.g.f175109a) : C25271y.f99162w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i1 */
    public static final C35985e0 m2597i1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35985e0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final C34911a m2598i2(C32645n0 c32645n0, C35993i0 c35993i0) {
        return AbstractC15751g.m44431K(c32645n0, c35993i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C35993i0 m2601j1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35991h0 c35991h0 = (C35991h0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35991h0.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C35993i0(c35991h0, clockSystemDefaultZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final C34911a m2602j2(C32645n0 c32645n0) {
        return AbstractC15751g.m44431K(c32645n0.getHint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k1 */
    public static final C36021w0 m2605k1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36021w0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final C34911a m2606k2(C32645n0 c32645n0) {
        String strM102028m = c32645n0.getSourcePillar();
        String strM102029n = c32645n0.getSourceType();
        String strM102024i = c32645n0.getPresetQuestion();
        String strM102027l = c32645n0.getSourceId();
        String strM102026k = c32645n0.getSource();
        ChatEntrypointExperience chatEntrypointExperienceM102020e = c32645n0.getEntrypointExperience();
        return AbstractC15751g.m44431K(strM102028m, strM102029n, strM102024i, strM102027l, strM102026k, chatEntrypointExperienceM102020e != null ? chatEntrypointExperienceM102020e.name() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public static final C36015t0 m2609l1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36015t0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C13313a m2610l2(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C13313a((C14557b) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(C14557b.class), null), (C17393b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17393b.class), null), (C17397f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17397f.class), null), (C18619b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18619b.class), null), (C15962a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C15962a.class), null), (OnboardingStatusDao) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusDao.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), InterfaceC34116n.INSTANCE.m107848a("AiDomainCombiner"), null, null, null, null, 7680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C35979b1 m2613m1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35979b1((AiChatApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiChatApi.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final C34911a m2614m2(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C0979n m2617n1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C0979n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final C35982d m2618n2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35982d((AiChatApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiChatApi.class), null), InterfaceC34116n.INSTANCE.m107848a("AiChatHistoryInteractor"), (C31381b) factory.m122602a(new C0155d(21), c22673i0.getOrCreateKotlinClass(C31381b.class), new C35953c("AI_CHAT_ANALYTICS_HELPER")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C37256f m2621o1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37256f((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C34911a m2622o2() {
        return AbstractC15751g.m44431K(null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C35990h m2625p1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35990h((AiChatApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiChatApi.class), null), (C14563h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14563h.class), null), (C31381b) factory.m122602a(new C0155d(23), c22673i0.getOrCreateKotlinClass(C31381b.class), new C35953c("AI_CHAT_ANALYTICS_HELPER")), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C34934c m2626p2(C38266c factory, C34911a params) throws DefinitionParameterException {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof C32645n0)) {
                next = null;
            }
        } while (next == null);
        C32645n0 c32645n0 = (C32645n0) next;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C35993i0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C35993i0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C34934c((C34933b) factory.m122602a(new C0966a(c32645n0, (C35993i0) objM110111b, 0), c22673i0.getOrCreateKotlinClass(C34933b.class), null), (C35982d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35982d.class), null), (C35978b0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35978b0.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C34911a m2629q1() {
        return AbstractC15751g.m44431K(null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final C34911a m2630q2(C32645n0 c32645n0, C35993i0 c35993i0) {
        return AbstractC15751g.m44431K(c32645n0, c35993i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C35977b m2633r1(C38266c factory, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35977b((AiChatApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AiChatApi.class), null), AbstractC29125c.m88532i(factory), (C31381b) factory.m122602a(new C0155d(28), c22673i0.getOrCreateKotlinClass(C31381b.class), new C35953c("AI_CHAT_ANALYTICS_HELPER")), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final C25671c m2634r2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(new C0972g(params, 2), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C25671c(featureFlagChecker, interfaceC21159o0, (AbstractC12939a0) objM110111b, (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C38423a) factory.m122602a(new C0974i(1), c22673i0.getOrCreateKotlinClass(C38423a.class), null), (LanguageRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), false, (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C34911a m2637s1() {
        return AbstractC15751g.m44431K(null, null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C34911a m2638s2(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    public static final C36027z0 m2641t1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36027z0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final C34911a m2642t2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public static final C36006p m2645u1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36006p((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final C25671c m2646u2(C38266c factory, C34911a params) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25671c((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC21159o0) factory.m122602a(new C0972g(params, 1), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), null, (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C38423a) factory.m122602a(new C0155d(29), c22673i0.getOrCreateKotlinClass(C38423a.class), null), (LanguageRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), true, (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v1 */
    public static final C35994j m2649v1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35994j((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final C34911a m2650v2(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final C34933b m2653w1(C38266c factory, C34911a params) throws DefinitionParameterException {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof C32645n0)) {
                next = null;
            }
        } while (next == null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C36000m c36000m = (C36000m) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36000m.class), null);
        C36009q0 c36009q0 = (C36009q0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36009q0.class), null);
        C36024y c36024y = (C36024y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36024y.class), null);
        C36018v c36018v = (C36018v) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36018v.class), null);
        C36012s c36012s = (C36012s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36012s.class), null);
        C35990h c35990h = (C35990h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35990h.class), null);
        C35977b c35977b = (C35977b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35977b.class), null);
        C36021w0 c36021w0 = (C36021w0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36021w0.class), null);
        C36015t0 c36015t0 = (C36015t0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36015t0.class), null);
        C36027z0 c36027z0 = (C36027z0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36027z0.class), null);
        C36006p c36006p = (C36006p) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36006p.class), null);
        C35979b1 c35979b1 = (C35979b1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35979b1.class), null);
        C37256f c37256f = (C37256f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37256f.class), null);
        C35975a0 c35975a0 = (C35975a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35975a0.class), null);
        C35994j c35994j = (C35994j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35994j.class), null);
        C31381b c31381b = (C31381b) factory.m122602a(new C0970e((C32645n0) next, 6), c22673i0.getOrCreateKotlinClass(C31381b.class), new C35953c("AI_CHAT_ANALYTICS_HELPER"));
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C35993i0.class));
        if (objM110111b != null) {
            return new C34933b(c36000m, c36009q0, c36024y, c36018v, c36012s, c35990h, c35977b, c36021w0, c36015t0, c36027z0, c36006p, c35979b1, c37256f, c35975a0, c35994j, c31381b, (C35993i0) objM110111b, (C35999l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35999l0.class), null), (C35985e0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35985e0.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C35993i0.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final C34911a m2654w2() {
        return AbstractC15751g.m44431K(null, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final C34911a m2657x1(C32645n0 c32645n0) {
        ChatEntrypointExperience chatEntrypointExperienceM102020e;
        String strName = null;
        String strM102028m = c32645n0 != null ? c32645n0.getSourcePillar() : null;
        String strM102029n = c32645n0 != null ? c32645n0.getSourceType() : null;
        String strM102024i = c32645n0 != null ? c32645n0.getPresetQuestion() : null;
        String strM102027l = c32645n0 != null ? c32645n0.getSourceId() : null;
        String strM102026k = c32645n0 != null ? c32645n0.getSource() : null;
        if (c32645n0 != null && (chatEntrypointExperienceM102020e = c32645n0.getEntrypointExperience()) != null) {
            strName = chatEntrypointExperienceM102020e.name();
        }
        return AbstractC15751g.m44431K(strM102028m, strM102029n, strM102024i, strM102027l, strM102026k, strName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final C39522a m2658x2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Context.class));
        if (objM110111b != null) {
            return new C39522a((InterfaceC21159o0) factory.m122602a(new C0971f((Context) objM110111b, 0), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Context.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y1 */
    public static final C35975a0 m2661y1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35975a0((AiChatApi) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AiChatApi.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final C34911a m2662y2(Context context) {
        return AbstractC15751g.m44431K(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z1 */
    public static final InterfaceC14562g m2665z1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14559d(AbstractC29125c.m88532i(factory), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final AiChatApi m2666z2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "ai-conversation-json");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757c = (AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), c35953cM73387t);
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"))).m109897a();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c34824k0M109897a.m109895e(2L, timeUnit);
        c34824k0M109897a.m109892b(2L, timeUnit);
        c34824k0M109897a.m109896f(2L, timeUnit);
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        c29222x0.f118281a = new C34826l0(c34824k0M109897a);
        return (AiChatApi) c29222x0.m88730d().m88733b(AiChatApi.class);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        return f3592d;
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
