package dq0;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.AuthMaterial;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.CDNRequest;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.C25272z;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y92.C39352a;

/* JADX INFO: renamed from: dq0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Ldq0/e;", "Lio/getstream/chat/android/client/cdn/CDN;", "Ly92/a;", "authManager", "<init>", "(Ly92/a;)V", "", "", "b", "(Lq83/d;)Ljava/lang/Object;", QueryParams.URL, "Lio/getstream/chat/android/client/cdn/CDNRequest;", "imageRequest", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "fileRequest", "a", "Ly92/a;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12287e implements CDN {

    /* JADX INFO: renamed from: b */
    private static final a f41137b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f41138c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: dq0.e$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Ldq0/e$a;", "", "<init>", "()V", "", "AUTHORIZATION_HEADER", "Ljava/lang/String;", "AUTH_BEARER_PREFIX", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: dq0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.stream.WhoopStreamCdn", m100430f = "WhoopStreamCdn.kt", m100431l = {26}, m100432m = "authHeaders", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f41140w;

        /* JADX INFO: renamed from: y */
        int f41142y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41140w = obj;
            this.f41142y |= Integer.MIN_VALUE;
            return C12287e.this.m34201b(this);
        }
    }

    /* JADX INFO: renamed from: dq0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.stream.WhoopStreamCdn$fileRequest$2", m100430f = "WhoopStreamCdn.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/cdn/CDNRequest;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/cdn/CDNRequest;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f41143w;

        /* JADX INFO: renamed from: x */
        int f41144x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f41145y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12287e f41146z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C12287e c12287e, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41145y = str;
            this.f41146z = c12287e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f41145y, this.f41146z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41144x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str2 = this.f41145y;
                C12287e c12287e = this.f41146z;
                this.f41143w = str2;
                this.f41144x = 1;
                Object objM34201b = c12287e.m34201b(this);
                if (objM34201b == enumC31071a) {
                    return enumC31071a;
                }
                str = str2;
                obj = objM34201b;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f41143w;
                AbstractC34132o.m107864I(obj);
            }
            return new CDNRequest(str, (Map) obj);
        }
    }

    /* JADX INFO: renamed from: dq0.e$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.stream.WhoopStreamCdn$imageRequest$2", m100430f = "WhoopStreamCdn.kt", m100431l = {C1533u.AVG_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/cdn/CDNRequest;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/cdn/CDNRequest;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f41147w;

        /* JADX INFO: renamed from: x */
        int f41148x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f41149y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12287e f41150z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C12287e c12287e, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41149y = str;
            this.f41150z = c12287e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f41149y, this.f41150z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41148x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String str2 = this.f41149y;
                C12287e c12287e = this.f41150z;
                this.f41147w = str2;
                this.f41148x = 1;
                Object objM34201b = c12287e.m34201b(this);
                if (objM34201b == enumC31071a) {
                    return enumC31071a;
                }
                str = str2;
                obj = objM34201b;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f41147w;
                AbstractC34132o.m107864I(obj);
            }
            return new CDNRequest(str, (Map) obj);
        }
    }

    public C12287e(C39352a authManager) {
        AbstractC22676k.m65750j(authManager, "authManager");
        this.authManager = authManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m34201b(InterfaceC30057d<? super Map<String, String>> interfaceC30057d) {
        b bVar;
        String accessToken;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f41142y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f41142y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM125478a = bVar.f41140w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f41142y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            C39352a c39352a = this.authManager;
            bVar.f41142y = 1;
            objM125478a = c39352a.m125478a(bVar);
            if (objM125478a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM125478a);
        }
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        return (authMaterial == null || (accessToken = authMaterial.getAccessToken()) == null) ? C25272z.f99163w : AbstractC31061c.m95645u(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(accessToken));
    }

    @Override // io.getstream.chat.android.client.cdn.CDN
    public Object fileRequest(String str, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new c(str, this, null), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.cdn.CDN
    public Object imageRequest(String str, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new d(str, this, null), interfaceC30057d);
    }
}
