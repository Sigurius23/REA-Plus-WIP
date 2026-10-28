package ao2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.UniversalCartScreenModel;
import com.whoop.universalcheckout.features.cart.domain.CartApi;
import com.whoop.universalcheckout.features.cart.domain.models.CartIndicatorResponse;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import or2.C28180m;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: ao2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020$0(8\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010.¨\u00060"}, m65681d2 = {"Lao2/a;", "", "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;", "api", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/CartApi;Lbc3/c0;Ltr2/n;Lrr2/c;)V", "Lcom/whoop/navigation/e;", "", "g", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "", "count", "destination", "Ll83/a0;", "j", "(ILcom/whoop/navigation/e;)V", "f", "()V", "cartId", "i", "(Ljava/lang/String;)V", "a", "Lcom/whoop/universalcheckout/features/cart/domain/CartApi;", "b", "Lbc3/c0;", "c", "Ltr2/n;", "d", "Lrr2/c;", "Lec3/p1;", "Lao2/b;", "e", "Lec3/p1;", "_state", "Lec3/f2;", "Lec3/f2;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lec3/f2;", "state", "Lbc3/k1;", "Lbc3/k1;", "refreshJob", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1876a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CartApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13075p1 _state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13037f2 state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC3027k1 refreshJob;

    /* JADX INFO: renamed from: ao2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartIndicatorRepository$refresh$1", m100430f = "CartIndicatorRepository.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7406w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f7408y;

        /* JADX INFO: renamed from: ao2.a$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.domain.CartIndicatorRepository$refresh$1$response$1", m100430f = "CartIndicatorRepository.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/universalcheckout/features/cart/domain/models/CartIndicatorResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41284a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f7409w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C1876a f7410x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f7411y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41284a(C1876a c1876a, String str, InterfaceC30057d<? super C41284a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f7410x = c1876a;
                this.f7411y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41284a(this.f7410x, this.f7411y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7409w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                CartApi cartApi = this.f7410x.api;
                String str = this.f7411y;
                this.f7409w = 1;
                Object cartIndicator = cartApi.getCartIndicator(str, this);
                return cartIndicator == enumC31071a ? enumC31071a : cartIndicator;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super CartIndicatorResponse> interfaceC30057d) {
                return ((C41284a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7408y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C1876a.this.new a(this.f7408y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            a aVar;
            C13045h2 c13045h2;
            Object value;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7406w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C1876a.this.logger;
                InterfaceC31766c interfaceC31766c = C1876a.this.crashReporter;
                String strM31996o = AbstractC11895b.m31996o("cart indicator refresh failed (cartId=", this.f7408y, ")");
                C41284a c41284a = new C41284a(C1876a.this, this.f7408y, null);
                this.f7406w = 1;
                aVar = this;
                obj = companion.m108730a(interfaceC34116n, interfaceC31766c, strM31996o, c41284a, aVar);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                aVar = this;
            }
            CartIndicatorResponse cartIndicatorResponse = (CartIndicatorResponse) AbstractC34386b.m108737b((InterfaceC34385a) obj);
            if (cartIndicatorResponse != null) {
                InterfaceC13075p1 interfaceC13075p1 = C1876a.this._state;
                C1876a c1876a = C1876a.this;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, new C1877b(cartIndicatorResponse.getCartIndicatorQuantity(), cartIndicatorResponse.getDestination(), c1876a.m5650g(cartIndicatorResponse.getDestination()))));
            }
            return C23454a0.f92919a;
        }
    }

    public C1876a(CartApi api, InterfaceC2994c0 scope, InterfaceC34116n logger, InterfaceC31766c interfaceC31766c) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.scope = scope;
        this.logger = logger;
        this.crashReporter = interfaceC31766c;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C1877b(0, null, null, 7, null));
        this._state = c13045h2M36593c;
        this.state = c13045h2M36593c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final String m5650g(C9598e c9598e) {
        NavigationScreenModel parameters = c9598e != null ? c9598e.getParameters() : null;
        UniversalCartScreenModel universalCartScreenModel = parameters instanceof UniversalCartScreenModel ? (UniversalCartScreenModel) parameters : null;
        if (universalCartScreenModel != null) {
            return universalCartScreenModel.getCartId();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m5651f() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC3027k1 interfaceC3027k1 = this.refreshJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, new C1877b(0, null, null, 7, null)));
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: i */
    public final void m5653i(String cartId) {
        if (cartId == null) {
            return;
        }
        InterfaceC3027k1 interfaceC3027k1 = this.refreshJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.refreshJob = AbstractC3006f0.m8732z(this.scope, null, null, new a(cartId, null), 3);
    }

    /* JADX INFO: renamed from: j */
    public final void m5654j(int count, C9598e destination) {
        C13045h2 c13045h2;
        Object value;
        String strM5650g = m5650g(destination);
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, new C1877b(count, destination, strM5650g)));
        if (strM5650g != null) {
            m5653i(strM5650g);
        }
    }

    public /* synthetic */ C1876a(CartApi cartApi, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cartApi, (i13 & 2) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CartIndicatorRepository") : interfaceC34116n, (i13 & 8) != 0 ? null : interfaceC31766c);
    }
}
