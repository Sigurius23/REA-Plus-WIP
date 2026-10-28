package rn2;

import ad3.AbstractC0757c;
import ao2.C1876a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.universalcheckout.features.buynow.domain.BuyNowApi;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowCheckoutInfoModel;
import com.whoop.universalcheckout.features.buynow.domain.models.items.BuyNowItemModel;
import com.whoop.universalcheckout.features.checkout.domain.models.items.CheckoutFooterModel;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jb1.InterfaceC21538d;
import jb1.InterfaceC21539e;
import jo2.C21838a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import nd1.C26583i;
import nd1.InterfaceC26584j;
import on2.C28050c;
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
import qn2.C30522a;
import r80.AbstractC31061c;
import rf3.C31362a;
import rf3.C31365d;
import rr2.InterfaceC31766c;
import s82.C32266a;
import sn2.C32777c;
import sn2.C32779e;
import sn2.C32781g;
import sn2.C32782h;
import sr2.AbstractC32943y;
import tf3.C33768a;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import vn2.C36216a;
import vn2.C36217b;
import wb3.AbstractC37056f;
import wf3.C37247a;
import wn2.C37430h;
import wn2.C37432j;
import xf3.C38266c;

/* JADX INFO: renamed from: rn2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lrn2/f;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31615f implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f130632c = 8;

    /* JADX INFO: renamed from: d */
    private static final Map<String, InterfaceC21461d> f130633d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26583i(), new C35799a());

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f130633d = AbstractC25247g0.m73990Y(new C23465k("BUY_NOW_ITEM", c22673i0.getOrCreateKotlinClass(BuyNowItemModel.class)), new C23465k("BUY_NOW_CHECKOUT_INFO", c22673i0.getOrCreateKotlinClass(BuyNowCheckoutInfoModel.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final C37432j m97648A(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37432j(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C36216a m97649B(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36216a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C30522a m97650C(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C30522a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C36217b m97651D(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C28050c c28050c = new C28050c(params, 11);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21159o0 interfaceC21159o0 = (InterfaceC21159o0) factory.m122602a(c28050c, c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(AbstractC12939a0.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, AbstractC12939a0.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C36217b(interfaceC21159o0, (AbstractC12939a0) objM110111b, (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m97652E(C34911a c34911a) throws DefinitionParameterException {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = c34911a.m110111b(c22673i0.getOrCreateKotlinClass(Object.class));
        if (objM110111b != null) {
            return AbstractC15751g.m44431K(objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Object.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: renamed from: p */
    private static final C23454a0 m97668p(C33768a c33768a) {
        C35953c c35953cM73386s = AbstractC25012a.m73386s(c33768a, "$this$module", "buy-now-model-mapping");
        final int i13 = 0;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Map.class);
        C35953c c35953c = C37247a.f159360e;
        C35953c c35953cM73385r = AbstractC25012a.m73385r(new C30330b(c35953c, orCreateKotlinClass, c35953cM73386s, interfaceC4351m, 2), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass, c35953cM73386s, c35953c), false, "buy-now-json");
        final int i14 = 9;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(AbstractC0757c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass2, c35953cM73385r, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass2, c35953cM73385r, interfaceC4351m2, 1)), false);
        final int i15 = 10;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(BuyNowApi.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass3, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass3, null, interfaceC4351m3, 1)), false);
        final int i16 = 11;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(C32779e.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass4, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass4, null, interfaceC4351m4, 2)), false);
        final int i17 = 12;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(C32781g.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass5, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass5, null, interfaceC4351m5, 2)), false);
        final int i18 = 13;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(C32777c.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass6, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass6, null, interfaceC4351m6, 2)), false);
        final int i19 = 1;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(C37432j.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass7, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass7, null, interfaceC4351m7, 2)), false);
        final int i24 = 2;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(C36216a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass8, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass8, null, interfaceC4351m8, 2)), false);
        final int i25 = 3;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(C30522a.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass9, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass9, null, interfaceC4351m9, 2)), false);
        final int i26 = 4;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(C36217b.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass10, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass10, null, interfaceC4351m10, 2)), false);
        final int i27 = 5;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(C37430h.class);
        c33768a.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass11, null, c35953c), new C31362a(new C30330b(c35953c, orCreateKotlinClass11, null, interfaceC4351m11, 2)), false);
        final int i28 = 6;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(C31613d.class);
        C31365d c31365dM73383p = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass12, null, interfaceC4351m12, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass12, null, c35953c), false);
        InterfaceC21461d clazz = c22673i0.getOrCreateKotlinClass(InterfaceC21539e.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b = c31365dM73383p.f129023a;
        c30330b.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz, c30330b.f124472c, c30330b.f124470a), c31365dM73383p, true);
        final int i29 = 7;
        InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass13 = c22673i0.getOrCreateKotlinClass(C31611b.class);
        C31365d c31365dM73383p2 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass13, null, interfaceC4351m13, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass13, null, c35953c), false);
        InterfaceC21461d clazz2 = c22673i0.getOrCreateKotlinClass(InterfaceC21538d.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b2 = c31365dM73383p2.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b2.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b2.f124472c, c30330b2.f124470a), c31365dM73383p2, true);
        final int i34 = 8;
        InterfaceC4351m interfaceC4351m14 = new InterfaceC4351m() { // from class: rn2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C31615f.m97669q(c38266c, c34911a);
                    case 1:
                        return C31615f.m97648A(c38266c, c34911a);
                    case 2:
                        return C31615f.m97649B(c38266c, c34911a);
                    case 3:
                        return C31615f.m97650C(c38266c, c34911a);
                    case 4:
                        return C31615f.m97651D(c38266c, c34911a);
                    case 5:
                        return C31615f.m97671s(c38266c, c34911a);
                    case 6:
                        return C31615f.m97672t(c38266c, c34911a);
                    case 7:
                        return C31615f.m97673u(c38266c, c34911a);
                    case 8:
                        return C31615f.m97674v(c38266c, c34911a);
                    case 9:
                        return C31615f.m97670r(c38266c, c34911a);
                    case 10:
                        return C31615f.m97675w(c38266c, c34911a);
                    case 11:
                        return C31615f.m97676x(c38266c, c34911a);
                    case 12:
                        return C31615f.m97677y(c38266c, c34911a);
                    default:
                        return C31615f.m97678z(c38266c, c34911a);
                }
            }
        };
        InterfaceC21461d orCreateKotlinClass14 = c22673i0.getOrCreateKotlinClass(C31612c.class);
        C31365d c31365dM73383p3 = AbstractC25012a.m73383p(new C30330b(c35953c, orCreateKotlinClass14, null, interfaceC4351m14, 1), c33768a, AbstractC21598x.m60669Y(orCreateKotlinClass14, null, c35953c), false);
        InterfaceC21461d clazz3 = c22673i0.getOrCreateKotlinClass(InterfaceC25310s.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b3 = c31365dM73383p3.f129023a;
        c30330b3.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b3.f124475f);
        c33768a.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b3.f124472c, c30330b3.f124470a), c31365dM73383p3, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Map m97669q(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k("CHECKOUT_FOOTER", AbstractC22671h0.f89337a.getOrCreateKotlinClass(CheckoutFooterModel.class))), f130633d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AbstractC0757c m97670r(C38266c c38266c, C34911a c34911a) {
        return AbstractC6728b.m20380e(c38266c, (Map) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "buy-now-model-mapping")), null, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C37430h m97671s(C38266c viewModel, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(viewModel, "$this$viewModel");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C32777c c32777c = (C32777c) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C32777c.class), null);
        C37432j c37432j = (C37432j) viewModel.m122602a(null, c22673i0.getOrCreateKotlinClass(C37432j.class), null);
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(C32782h.class));
        if (objM110111b == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, C32782h.class, new StringBuilder("No value found for type '"), '\''));
        }
        C32782h c32782h = (C32782h) objM110111b;
        Object objM110111b2 = params.m110111b(c22673i0.getOrCreateKotlinClass(String.class));
        if (objM110111b2 == null) {
            throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, String.class, new StringBuilder("No value found for type '"), '\''));
        }
        return new C37430h(c32777c, c37432j, c32782h, (String) objM110111b2, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C31613d m97672t(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31613d(f130633d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C31611b m97673u(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31611b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C31612c m97674v(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31612c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final BuyNowApi m97675w(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return (BuyNowApi) AbstractC2875y.m8293f(c29222x0M73382o, (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73384q((AbstractC0757c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC0757c.class), AbstractC31061c.m95649y((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), c29222x0M73382o, "buy-now-json")), c29222x0M73382o, "defaultOkHttpClient")), BuyNowApi.class, "create(...)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final C32779e m97676x(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32779e(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C32781g m97677y(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32781g((AbstractC0757c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC0757c.class), new C35953c("buy-now-json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C32777c m97678z(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32777c((BuyNowApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BuyNowApi.class), null), (C32779e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32779e.class), null), (C32781g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32781g.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (C32266a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32266a.class), null), (C1876a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C1876a.class), null), (C21838a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21838a.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), null, 256, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m97668p(c33768a);
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
