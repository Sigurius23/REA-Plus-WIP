package ni0;

import ad3.AbstractC0757c;
import ag2.C0864a;
import al0.C0972g;
import al0.C0973h;
import android.content.SharedPreferences;
import ar0.C1926a;
import bh1.C3249a;
import bh1.C3250b;
import c41.C4014e1;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.archv2.feature.domain.C5999g;
import com.whoop.archv2.feature.domain.C6002j;
import com.whoop.archv2.feature.domain.C6003k;
import com.whoop.archv2.feature.domain.C6004l;
import com.whoop.archv2.feature.domain.C6012r;
import com.whoop.archv2.feature.domain.GenericLoadMoreInteractor;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.navigation.CachePolicyModel;
import dp0.InterfaceC12251g;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j02.C21132b0;
import j02.InterfaceC21156n;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.C21535a;
import jb1.InterfaceC21538d;
import l02.C23050a;
import l83.C23454a0;
import m32.C25010f;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import nd1.InterfaceC26584j;
import nf0.C26658a;
import nm0.InterfaceC26834e;
import oi0.C27948a;
import om0.C28026c;
import org.koin.core.error.DefinitionParameterException;
import p114eb.AbstractC12939a0;
import p236j.AbstractC21065d;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25310s;
import p739ui0.C35010l;
import pf.AbstractC29125c;
import pj1.C29298b;
import qf3.C30330b;
import qi0.C30406a;
import qi0.C30407b;
import qi0.C30409d;
import qi0.C30410e;
import qw2.C30695c;
import rf3.C31362a;
import rf3.C31365d;
import ri0.C31444c;
import si0.AbstractC32540f;
import si0.C32537c;
import si0.C32539e;
import si0.C32541g;
import si0.C32542h;
import si0.C32544j;
import si0.C32545k;
import tf3.C33768a;
import u02.C34387c;
import u82.InterfaceC34640a;
import uf3.C34911a;
import v02.C35513b;
import v53.C35709c;
import vf3.C35953c;
import wf3.C37247a;
import wi0.C37311c;
import wm0.C37378a;
import xf3.C38266c;

/* JADX INFO: renamed from: ni0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lni0/c;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26732c implements InterfaceC26584j {
    /* JADX INFO: renamed from: M */
    private static final C23454a0 m79535M(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C26658a c26658a = new C26658a(1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(C25307p.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c26658a, 1)), false);
        C26658a c26658a2 = new C26658a(3);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(GenericLoadMoreInteractor.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass2, null, c26658a2, 2)), false);
        C26658a c26658a3 = new C26658a(7);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(C5999g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass3, null, c26658a3, 2)), false);
        C26658a c26658a4 = new C26658a(8);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C6002j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, c26658a4, 2)), false);
        C26658a c26658a5 = new C26658a(9);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C6004l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, c26658a5, 2)), false);
        C26658a c26658a6 = new C26658a(10);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C6003k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, c26658a6, 2)), false);
        C26658a c26658a7 = new C26658a(11);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C21535a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass7, null, c26658a7, 1)), false);
        C26658a c26658a8 = new C26658a(13);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C26733d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass8, null, c26658a8, 1)), false);
        C26658a c26658a9 = new C26658a(14);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(InterfaceC21156n.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, c26658a9, 2)), false);
        C26658a c26658a10 = new C26658a(15);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C32542h.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, c26658a10, 2)), false);
        C26658a c26658a11 = new C26658a(12);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C32544j.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, c26658a11, 2)), false);
        C26658a c26658a12 = new C26658a(16);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C32545k.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass12, null, c26658a12, 2)), false);
        C26658a c26658a13 = new C26658a(17);
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C32537c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass13, null, c26658a13, 2)), false);
        C26658a c26658a14 = new C26658a(18);
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C32539e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass14, null, c26658a14, 2)), false);
        C26658a c26658a15 = new C26658a(19);
        InterfaceC21461d orCreateKotlinClass15 = c22673i0.getOrCreateKotlinClass(C32541g.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass15, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass15, null, c26658a15, 2)), false);
        C26658a c26658a16 = new C26658a(20);
        InterfaceC21461d orCreateKotlinClass16 = c22673i0.getOrCreateKotlinClass(C30409d.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass16, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass16, null, c26658a16, 2)), false);
        C26658a c26658a17 = new C26658a(21);
        InterfaceC21461d orCreateKotlinClass17 = c22673i0.getOrCreateKotlinClass(C27948a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass17, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass17, null, c26658a17, 2)), false);
        C26658a c26658a18 = new C26658a(22);
        InterfaceC21461d orCreateKotlinClass18 = c22673i0.getOrCreateKotlinClass(C30406a.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass18, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass18, null, c26658a18, 2)), false);
        C26658a c26658a19 = new C26658a(23);
        InterfaceC21461d orCreateKotlinClass19 = c22673i0.getOrCreateKotlinClass(C30407b.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass19, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass19, null, c26658a19, 2)), false);
        C26658a c26658a20 = new C26658a(2);
        InterfaceC21461d orCreateKotlinClass20 = c22673i0.getOrCreateKotlinClass(C35010l.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass20, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass20, null, c26658a20, 2)), false);
        C26658a c26658a21 = new C26658a(4);
        InterfaceC21461d orCreateKotlinClass21 = c22673i0.getOrCreateKotlinClass(C31444c.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass21, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass21, null, c26658a21, 2)), false);
        C26658a c26658a22 = new C26658a(5);
        InterfaceC21461d orCreateKotlinClass22 = c22673i0.getOrCreateKotlinClass(C30410e.class);
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass22, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass22, null, c26658a22, 2)), false);
        C26658a c26658a23 = new C26658a(6);
        InterfaceC21461d orCreateKotlinClass23 = c22673i0.getOrCreateKotlinClass(C37311c.class);
        AbstractC25012a.m73393z(new C30330b(c35953c, orCreateKotlinClass23, null, c26658a23, 2), module, AbstractC21598x.m60669Y(orCreateKotlinClass23, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C25307p m79536N(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return Function1.m74306g(new C4014e1(single.m122603b(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25310s.class)), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m79537O(List list, C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC25310s) it.next()).mo1797a(designItemViewFactory);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static final GenericLoadMoreInteractor m79538P(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "generic-models-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null);
        return new GenericLoadMoreInteractor((C34387c) c38266c.m122602a(new C0973h((C35709c) c38266c.m122602a(new C26731b(abstractC0757cM20380e, 0), c22673i0.getOrCreateKotlinClass(C35709c.class), new C35953c("serialization_configurable_ktor_client")), 1), c22673i0.getOrCreateKotlinClass(C34387c.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public static final C34911a m79539Q(AbstractC0757c abstractC0757c) {
        return AbstractC15751g.m44431K(new C35513b(null, abstractC0757c, 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C34911a m79540R(C35709c c35709c) {
        return AbstractC15751g.m44431K(c35709c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C32544j m79541S(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32544j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C32545k m79542T(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32545k((C21535a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21535a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C32537c m79543U(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32537c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C32539e m79544V(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32539e((C32542h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32542h.class), null), (C32544j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32544j.class), null), (C32545k) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32545k.class), null), (C32537c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32537c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C32541g m79545W(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C32539e c32539e = (C32539e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32539e.class), null);
        C32542h c32542h = (C32542h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32542h.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(ScreenAnalyticEventModel.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, ScreenAnalyticEventModel.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C32541g(c32539e, c32542h, (ScreenAnalyticEventModel) objM110111b, AbstractC6728b.m20380e(factory, (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c("generic-models-mapping")), null, null, null, null, 30, null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C21535a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21535a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C30409d m79546X(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C0972g c0972g = new C0972g(params, 24);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c0972g, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C30409d(interfaceC21159o0, (AbstractC12939a0) objM110111b, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C34911a m79547Y(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C27948a m79548Z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C27948a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C30406a m79550a0(C38266c c38266c, C34911a c34911a) throws DefinitionParameterException {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "params", "generic-models-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Map map = (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t);
        C27948a c27948a = (C27948a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C27948a.class), null);
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(ScreenAnalyticEventModel.class));
        if (objM110111b != null) {
            return new C30406a(c27948a, (ScreenAnalyticEventModel) objM110111b, AbstractC6728b.m20380e(c38266c, map, null, null, null, null, 30, null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, ScreenAnalyticEventModel.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C30407b m79552b0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30407b((C23050a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C23050a.class), null), (C21132b0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21132b0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C35010l m79554c0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC21065d.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC21065d.class, new StringBuilder("No value found for type '"), '\''));
        }
        AbstractC21065d abstractC21065d = (AbstractC21065d) objM110111b;
        InterfaceC25005a interfaceC25005a = (InterfaceC25005a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25005a.class), null);
        C25010f c25010f = (C25010f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25010f.class), null);
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(InterfaceC25007c.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, InterfaceC25007c.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C35010l(abstractC21065d, interfaceC25005a, c25010f, (InterfaceC25007c) objM110111b2, (C29298b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29298b.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C5999g m79556d0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(CachePolicyModel.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, CachePolicyModel.class, new StringBuilder("No value found for type '"), '\''));
        }
        CachePolicyModel cachePolicyModel = (CachePolicyModel) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C5999g((C6003k) factory.m122602a(new C26730a(cachePolicyModel, (String) objM110111b2, 2), c22673i0.getOrCreateKotlinClass(C6003k.class), null), (C30695c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30695c.class), null), (C28026c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28026c.class), null), (GenericLoadMoreInteractor) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(GenericLoadMoreInteractor.class), null), (C27948a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27948a.class), null), AbstractC6728b.m20380e(factory, (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c("generic-models-mapping")), null, null, null, null, 30, null), (C37378a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), cachePolicyModel.getCacheKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C34911a m79558e0(CachePolicyModel cachePolicyModel, String str) {
        return AbstractC15751g.m44431K(cachePolicyModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C31444c m79560f0(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(ScreenAnalyticEventModel.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, ScreenAnalyticEventModel.class, new StringBuilder("No value found for type '"), '\''));
        }
        ScreenAnalyticEventModel screenAnalyticEventModel = (ScreenAnalyticEventModel) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        String str = (String) objM110111b2;
        Object objM110111b3 = params.m110111b(c22673i0.getOrCreateKotlinClass(CachePolicyModel.class));
        if (objM110111b3 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, CachePolicyModel.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C31444c((C5999g) viewModel.m122602a(new C26730a((CachePolicyModel) objM110111b3, str, 1), c22673i0.getOrCreateKotlinClass(C5999g.class), null), (C32541g) viewModel.m122602a(new C0864a(screenAnalyticEventModel, 1), c22673i0.getOrCreateKotlinClass(C32541g.class), null), (InterfaceC12251g) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null), (FeatureFlagChecker) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C34911a m79562g0(CachePolicyModel cachePolicyModel, String str) {
        return AbstractC15751g.m44431K(cachePolicyModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C34911a m79564h0(ScreenAnalyticEventModel screenAnalyticEventModel) {
        return AbstractC15751g.m44431K(screenAnalyticEventModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static final C30410e m79566i0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30410e(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C37311c m79568j0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        SharedPreferences sharedPreferences = AbstractC29125c.m88532i(factory).getSharedPreferences("prefs-arch-v2-playground", 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        return new C37311c(sharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C6002j m79570k0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(CachePolicyModel.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, CachePolicyModel.class, new StringBuilder("No value found for type '"), '\''));
        }
        CachePolicyModel cachePolicyModel = (CachePolicyModel) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        Map map = (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c("generic-models-mapping"));
        return new C6002j((InterfaceC26834e) factory.m122602a(new C3250b(map, (InterfaceC34640a) factory.m122602a(new C3249a(map, 5), c22673i0.getOrCreateKotlinClass(InterfaceC34640a.class), new C35953c("KotlinxDeserializer")), 10), c22673i0.getOrCreateKotlinClass(InterfaceC26834e.class), null), cachePolicyModel, (String) objM110111b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C34911a m79572l0(Map map) {
        return AbstractC15751g.m44431K(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C34911a m79574m0(Map map, InterfaceC34640a interfaceC34640a) {
        return AbstractC15751g.m44431K(map, interfaceC34640a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C6004l m79576n0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        String str = (String) objM110111b;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(factory, (Map) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), new C35953c("generic-models-mapping")), null, null, null, null, 30, null);
        return new C6004l((C34387c) factory.m122602a(new C0973h((C35709c) factory.m122602a(new C26731b(abstractC0757cM20380e, 1), c22673i0.getOrCreateKotlinClass(C35709c.class), new C35953c("serialization_configurable_ktor_client")), 2), c22673i0.getOrCreateKotlinClass(C34387c.class), null), str, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static final C34911a m79578o0(AbstractC0757c abstractC0757c) {
        return AbstractC15751g.m44431K(new C35513b(null, abstractC0757c, 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C34911a m79580p0(C35709c c35709c) {
        return AbstractC15751g.m44431K(c35709c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C6003k m79582q0(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(CachePolicyModel.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, CachePolicyModel.class, new StringBuilder("No value found for type '"), '\''));
        }
        CachePolicyModel cachePolicyModel = (CachePolicyModel) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        String str = (String) objM110111b2;
        return new C6003k((C6002j) factory.m122602a(new C26730a(cachePolicyModel, str, 0), c22673i0.getOrCreateKotlinClass(C6002j.class), null), (C6004l) factory.m122602a(new C1926a(str, 5), c22673i0.getOrCreateKotlinClass(C6004l.class), null), cachePolicyModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C34911a m79584r0(CachePolicyModel cachePolicyModel, String str) {
        return AbstractC15751g.m44431K(cachePolicyModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C34911a m79586s0(String str) {
        return AbstractC15751g.m44431K(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C21535a m79588t0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC32540f.m101561b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C26733d m79590u0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C26733d(single.m122603b(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21538d.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final InterfaceC21156n m79592v0(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "generic-models-mapping");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractC0757c abstractC0757cM20380e = AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Map.class), c35953cM73387t), null, null, null, null, 30, null);
        return new C6012r((C34387c) c38266c.m122602a(new C0973h((C35709c) c38266c.m122602a(new C26731b(abstractC0757cM20380e, 2), c22673i0.getOrCreateKotlinClass(C35709c.class), new C35953c("serialization_configurable_ktor_client")), 3), c22673i0.getOrCreateKotlinClass(C34387c.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public static final C34911a m79594w0(AbstractC0757c abstractC0757c) {
        return AbstractC15751g.m44431K(new C35513b(null, abstractC0757c, 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C34911a m79596x0(C35709c c35709c) {
        return AbstractC15751g.m44431K(c35709c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C32542h m79598y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32542h((C21535a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21535a.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m79535M(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
