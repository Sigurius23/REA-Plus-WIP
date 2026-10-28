package j92;

import ae3.C0801i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.User;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import l83.C23454a0;
import od1.C27858u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: j92.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lj92/l;", "Lud3/g0;", "Lod1/u;", "userContext", "Lz92/a;", "userInfoAccessor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lod1/u;Lz92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", QueryParams.URL, "method", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lod1/u;", "x", "Lz92/a;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "z", "Ltr2/n;", "logger", "E", "Ljava/lang/String;", "encodedToken", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21444l implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private String encodedToken;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: j92.l$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.PathTokenReplacer$replacementToken$userId$1", m100430f = "PathTokenReplacer.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82334w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21444l.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82334w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC40205a interfaceC40205a = C21444l.this.userInfoAccessor;
                this.f82334w = 1;
                obj = interfaceC40205a.mo129089c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            User user = (User) obj;
            if (user != null) {
                return new Integer(user.getId());
            }
            return null;
        }
    }

    public C21444l(C27858u userContext, InterfaceC40205a userInfoAccessor, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.userContext = userContext;
        this.userInfoAccessor = userInfoAccessor;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("PathTokenReplacer");
        try {
            this.encodedToken = URLEncoder.encode("{userId}", "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            this.logger.mo85230v("failed to encode token {userId}", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: b */
    private final String m60357b(String url, String method) {
        User user;
        String strValueOf;
        Integer numValueOf = null;
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE)) {
            numValueOf = (Integer) AbstractC3006f0.m8699E(C30064k.f122676w, new a(null));
        } else {
            Session sessionM84057h = this.userContext.m84057h();
            if (sessionM84057h != null && (user = sessionM84057h.getUser()) != null) {
                numValueOf = Integer.valueOf(user.getId());
            }
        }
        if (numValueOf == null || (strValueOf = String.valueOf(numValueOf.intValue())) == null) {
            throw new NullPointerException(AbstractC31061c.m95640p("No logged in user; cannot substitute user id for ", method, " ", url));
        }
        return strValueOf;
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        String str = c34832o0.f146712a.f146570i;
        String str2 = this.encodedToken;
        if (str2 != null && AbstractC39414r.m125876U(str, str2, false)) {
            C34830n0 c34830n0M109907b = c34832o0.m109907b();
            c34830n0M109907b.m109905f(AbstractC39421y.m125926K(str, str2, m60357b(str, c34832o0.f146713b), false));
            return c0801i.m1939b(new C34832o0(c34830n0M109907b));
        }
        return c0801i.m1939b(c34832o0);
    }
}
