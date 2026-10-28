package g12;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.api.QueryParams;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: g12.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lg12/b;", "", "Lbc3/c0;", "scope", "<init>", "(Lbc3/c0;)V", "", QueryParams.URL, "Ll83/a0;", "c", "(Ljava/lang/String;)V", "a", "Lbc3/c0;", "Lec3/o1;", "b", "Lec3/o1;", "_callbacks", "Lec3/t1;", "Lec3/t1;", "()Lec3/t1;", "callbacks", "oauth-integration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15224b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13072o1 _callbacks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13087t1 callbacks;

    /* JADX INFO: renamed from: g12.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.oauthintegration.performer.OAuthCallbackBus$post$1", m100430f = "OAuthCallbackBus.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f57168w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f57170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f57170y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15224b.this.new a(this.f57170y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f57168w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C15224b.this._callbacks;
                String str = this.f57170y;
                this.f57168w = 1;
                if (interfaceC13072o1.emit(str, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C15224b(InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this._callbacks = c13096w1M36592b;
        this.callbacks = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13087t1 getCallbacks() {
        return this.callbacks;
    }

    /* JADX INFO: renamed from: c */
    public final void m43290c(String url) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(url, null), 3);
    }

    public /* synthetic */ C15224b(InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
