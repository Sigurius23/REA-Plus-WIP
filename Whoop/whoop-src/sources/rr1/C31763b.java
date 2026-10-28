package rr1;

import ad3.AbstractC0757c;
import bc3.InterfaceC2994c0;
import com.google.gson.Gson;
import com.whoop.data.interactor.JournalNewQuestionsInteractor;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.JournalRepository;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.journal.api.JournalApi;
import com.whoop.journal.interactors.p062v2.calendar.JournalCalendarApi;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerApi;
import com.whoop.journal.model.CurrentCycle;
import cs1.C11101a;
import cs1.C11102b;
import ds1.C12342l;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import on2.C28049b;
import or2.C28205u0;
import org.koin.core.error.DefinitionParameterException;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p292l1.C23121k0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pg3.C29222x0;
import q80.C30036h;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import rm0.C31583a;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tr2.InterfaceC34116n;
import tw0.C34215a;
import u82.C34643d;
import u82.C34644e;
import ud3.C34826l0;
import uf3.C34911a;
import ur1.C35186c;
import ur1.C35189f;
import ur1.C35191h;
import ur1.C35193j;
import ur1.C35196m;
import v82.C35799a;
import vf3.C35953c;
import vr1.C36306d;
import wf3.C37247a;
import wr1.C37571e;
import xf3.C38266c;
import yr1.C39730a;
import yr1.C39734e;
import yr1.C39735f;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: rr1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lrr1/b;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "Lv82/a;", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31763b implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C35799a> dependencies = AbstractC2875y.m8308u();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C34911a m98585A(C38266c c38266c) {
        return AbstractC15751g.m44431K(AbstractC29125c.m88532i(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C39730a m98586B(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39730a((InterfaceC14515a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final JournalApi m98587C(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-journal"));
        C29222x0 c29222x0 = new C29222x0();
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")));
        return (JournalApi) c29222x0.m88730d().m88733b(JournalApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C39735f m98588D(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39735f((C39734e) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39734e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C35191h m98589E(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Long.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Long.class, new StringBuilder("No value found for type '"), '\''));
        }
        long jLongValue = ((Number) objM110111b).longValue();
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C35191h((C35196m) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35196m.class), null), (C35193j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35193j.class), null), (C35189f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35189f.class), null), (C36306d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36306d.class), null), (C35186c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35186c.class), null), (JournalNewQuestionsInteractor) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalNewQuestionsInteractor.class), null), (C37571e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37571e.class), null), (String) objM110111b2, jLongValue, null, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C36306d m98590F(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36306d((JournalCalendarApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalCalendarApi.class), null), InterfaceC34116n.INSTANCE.m107848a("JournalCalendarInteractor"), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), null, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C35186c m98591G(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35186c((C39730a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39730a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C37571e m98592H(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37571e((JournalDatePickerApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalDatePickerApi.class), null), InterfaceC34116n.INSTANCE.m107848a("JournalDatePickerInteractor"), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final JournalCalendarApi m98593I(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-journal"));
        C29222x0 c29222x0 = new C29222x0();
        return (JournalCalendarApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), JournalCalendarApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final JournalDatePickerApi m98594J(C38266c c38266c, C34911a c34911a) {
        Gson gsonCreate = AbstractC6730d.m20388f(AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it"), null, null, 3, null).create();
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, null, null, null, null, null, 31, null);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C34644e c34644e = (C34644e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34644e.class), null);
        AbstractC22676k.m65747g(gsonCreate);
        C34643d c34643dM109481a = c34644e.m109481a(gsonCreate, abstractC0757cM20380e, AbstractC12350b.m34570S("kt-serialization-journal"));
        C29222x0 c29222x0 = new C29222x0();
        return (JournalDatePickerApi) AbstractC2875y.m8293f(c29222x0, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC2875y.m8312y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0, c34643dM109481a, "defaultOkHttpClient")), JournalDatePickerApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C35196m m98595K(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35196m((JournalRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalRepository.class), null), (C39730a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39730a.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, (JournalApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(JournalApi.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), 8, null);
    }

    /* JADX INFO: renamed from: s */
    private static final C23454a0 m98614s(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C31583a c31583a = new C31583a(21);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C11101a.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass, null, c31583a, 2)), false);
        C31762a c31762a = new C31762a(2);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(C39734e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c31762a, 2)), false);
        C31762a c31762a2 = new C31762a(3);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C39735f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c31762a2, 2)), false);
        C31762a c31762a3 = new C31762a(4);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C35191h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c31762a3, 2)), false);
        C31762a c31762a4 = new C31762a(5);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C36306d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c31762a4, 2)), false);
        C31583a c31583a2 = new C31583a(22);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C35186c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c31583a2, 2)), false);
        C31583a c31583a3 = new C31583a(23);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C37571e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, c31583a3, 2)), false);
        C31583a c31583a4 = new C31583a(24);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(JournalCalendarApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c31583a4, 1)), false);
        C31583a c31583a5 = new C31583a(25);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(JournalDatePickerApi.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c31583a5, 2)), false);
        C31583a c31583a6 = new C31583a(26);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C35196m.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c31583a6, 2)), false);
        C31583a c31583a7 = new C31583a(27);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C35193j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c31583a7, 2)), false);
        C31583a c31583a8 = new C31583a(28);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C35189f.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c31583a8, 2)), false);
        C31583a c31583a9 = new C31583a(29);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C12342l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c31583a9, 2)), false);
        C31762a c31762a5 = new C31762a(0);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C39730a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass14, null, c31762a5, 1)), false);
        C31762a c31762a6 = new C31762a(1);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(JournalApi.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass15, null, c31762a6, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C11101a m98615t(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        ArrayList arrayList = params.f147011a;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Long.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Long.class, new StringBuilder("No value found for type '"), '\''));
        }
        long jLongValue = ((Number) objM110111b).longValue();
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(CurrentCycle.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, CurrentCycle.class, new StringBuilder("No value found for type '"), '\''));
        }
        CurrentCycle currentCycle = (CurrentCycle) objM110111b2;
        Object objM110111b3 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b3 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        String str = (String) objM110111b3;
        Object objM110111b4 = params.m110111b(c22673i0.getOrCreateKotlinClass(Boolean.class));
        if (objM110111b4 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Boolean.class, new StringBuilder("No value found for type '"), '\''));
        }
        boolean zBooleanValue = ((Boolean) objM110111b4).booleanValue();
        String str2 = (String) arrayList.get(4);
        String str3 = (String) arrayList.get(5);
        return new C11101a((AbstractC32943y) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (C35191h) viewModel.m122602a(new C23121k0(jLongValue, str), c22673i0.getOrCreateKotlinClass(C35191h.class), null), (C12342l) viewModel.m122602a(new C30036h(currentCycle, 18), c22673i0.getOrCreateKotlinClass(C12342l.class), null), (C39735f) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C39735f.class), null), new C11102b(jLongValue, str, zBooleanValue, str2, str3), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C34911a m98616u(CurrentCycle currentCycle) {
        return AbstractC15751g.m44431K(currentCycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C34911a m98617v(long j7, String str) {
        return AbstractC15751g.m44431K(Long.valueOf(j7), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C39734e m98618w(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C39734e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C35193j m98619x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35193j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C35189f m98620y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35189f((JournalRepository) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(JournalRepository.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C12342l m98621z(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        CurrentCycle currentCycle = (CurrentCycle) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(CurrentCycle.class));
        return new C12342l((C28205u0) factory.m122602a(new C28049b(factory, 14), c22673i0.getOrCreateKotlinClass(C28205u0.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), currentCycle.getPreviousCycleEndTime(), currentCycle.getPreviousCycleStartTime(), InterfaceC34116n.INSTANCE.m107848a("JournalViewStateReducer"), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), currentCycle, (C34215a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34215a.class), null), null, 256, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m98614s(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<C35799a> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
