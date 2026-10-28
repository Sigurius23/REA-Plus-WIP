package qd1;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.remote.NewWhoopLoginInterceptor;
import com.whoop.data.repositories.C6656c;
import com.whoop.domain.converters.MfaChallengeException;
import com.whoop.domain.converters.PasswordAttemptsExceededException;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.Login;
import com.whoop.domain.model.Logout;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.UserSwitchEvent;
import com.whoop.service.network.model.LoginResult;
import dj0.C12066b;
import dj0.C12078n;
import dj0.C12079o;
import dj0.C12080p;
import dj0.InterfaceC12081q;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.io.IOException;
import l83.C23454a0;
import l83.InterfaceC23457c;
import lh3.C24082e;
import lh3.C24087j;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.C27847j;
import od1.C27853p;
import od1.InterfaceC27837a0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pd1.C29104a;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qc1.C30217a;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import ud3.C34818h0;
import ud3.C34854z0;
import we1.C37223g;
import xg3.C38280g;
import y92.C39352a;
import yb3.C39412p;

/* JADX INFO: renamed from: qd1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010'J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0017¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020-0)H\u0017¢\u0006\u0004\b.\u0010,J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0)H\u0017¢\u0006\u0004\b0\u0010,J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J,\u00106\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b6\u0010 J\u0018\u00108\u001a\u00020#2\u0006\u00107\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020#2\u0006\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020#2\u0006\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020#H\u0082@¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010KR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020*0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010Z\u001a\b\u0012\u0004\u0012\u00020*0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bC\u0010YR \u0010\\\u001a\b\u0012\u0004\u0012\u00020/0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\bI\u0010YR \u0010^\u001a\b\u0012\u0004\u0012\u00020-0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b@\u0010YR\u0014\u0010b\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001c\u0010g\u001a\u0004\u0018\u00010c8VX\u0097\u0004¢\u0006\f\u0012\u0004\bf\u0010'\u001a\u0004\bd\u0010e¨\u0006h"}, m65681d2 = {"Lqd1/a;", "Lod1/a0;", "Lod1/p;", "sessionManager", "Lbc3/c0;", "scope", "Lod1/j;", "pendingUserSessionRepository", "Lcom/whoop/data/remote/NewWhoopLoginInterceptor;", "newWhoopLoginInterceptor", "Ly92/a;", "authManager", "Lcom/whoop/data/remote/AppConfigurationRepository;", "appConfigurationRepository", "Lwe1/g;", "entitlementsRepository", "Lpd1/a;", "bootstrapUserSignIn", "Liy1/c;", "metricWriter", "Ldj0/b;", "cognitoAuthApi", "Ltr2/n;", "logger", "<init>", "(Lod1/p;Lbc3/c0;Lod1/j;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Ly92/a;Lcom/whoop/data/remote/AppConfigurationRepository;Lwe1/g;Lpd1/a;Liy1/c;Ldj0/b;Ltr2/n;)V", "", NotificationCompat.CATEGORY_EMAIL, "password", "seonFingerprint", "Lcom/whoop/service/network/model/LoginResult;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lfj0/a;", "cognitoAuthMaterial", "Ll83/a0;", "f", "(Lfj0/a;Lq83/d;)Ljava/lang/Object;", "a", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lxg3/g;", "Lcom/whoop/domain/model/UserSwitchEvent;", "g", "()Lxg3/g;", "Lcom/whoop/domain/model/Logout;", "j", "Lcom/whoop/domain/model/Login;", "e", "Ldj0/q;", "cognitoResult", "Lcom/whoop/domain/model/AuthMaterial;", "z", "(Ldj0/q;)Lcom/whoop/domain/model/AuthMaterial;", "E", "loginResult", "x", "(Lcom/whoop/service/network/model/LoginResult;Lq83/d;)Ljava/lang/Object;", "y", "(Lcom/whoop/service/network/model/LoginResult;)V", "F", "G", "(Lq83/d;)Ljava/lang/Object;", "Lod1/p;", "b", "Lbc3/c0;", "Lod1/j;", "d", "Lcom/whoop/data/remote/NewWhoopLoginInterceptor;", "Ly92/a;", "Lcom/whoop/data/remote/AppConfigurationRepository;", "Lwe1/g;", "Lpd1/a;", "i", "Liy1/c;", "Ldj0/b;", "k", "Ltr2/n;", "Llh3/j;", "l", "Llh3/j;", "userSwitchEvents", "Lec3/o1;", "m", "Lec3/o1;", "internalUserSwitchFlow", "Lec3/t1;", "n", "Lec3/t1;", "()Lec3/t1;", "userSwitchFlow", "o", "loginFlow", "p", "logoutFlow", "", "getUserId", "()I", "userId", "Lcom/whoop/domain/model/Session;", "q", "()Lcom/whoop/domain/model/Session;", "getSession$annotations", "session", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30294a implements InterfaceC27837a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27853p sessionManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final NewWhoopLoginInterceptor newWhoopLoginInterceptor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AppConfigurationRepository appConfigurationRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37223g entitlementsRepository;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C29104a bootstrapUserSignIn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C24087j userSwitchEvents;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC13072o1 internalUserSwitchFlow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC13087t1 userSwitchFlow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC13087t1 loginFlow;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC13087t1 logoutFlow;

    /* JADX INFO: renamed from: qd1.a$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl", m100430f = "UserSessionManagerImpl.kt", m100431l = {134, 136}, m100432m = "handleExistingUserLogin", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f123916E;

        /* JADX INFO: renamed from: w */
        Object f123917w;

        /* JADX INFO: renamed from: x */
        Object f123918x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f123919y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f123919y = obj;
            this.f123916E |= Integer.MIN_VALUE;
            return C30294a.this.m92566x(null, this);
        }
    }

    /* JADX INFO: renamed from: qd1.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl", m100430f = "UserSessionManagerImpl.kt", m100431l = {68, 70}, m100432m = "login", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f123921E;

        /* JADX INFO: renamed from: G */
        int f123923G;

        /* JADX INFO: renamed from: w */
        Object f123924w;

        /* JADX INFO: renamed from: x */
        Object f123925x;

        /* JADX INFO: renamed from: y */
        Object f123926y;

        /* JADX INFO: renamed from: z */
        Object f123927z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f123921E = obj;
            this.f123923G |= Integer.MIN_VALUE;
            return C30294a.this.mo83913c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: qd1.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$logout$1", m100430f = "UserSessionManagerImpl.kt", m100431l = {163}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f123928w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30294a.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f123928w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C30294a c30294a = C30294a.this;
                this.f123928w = 1;
                if (c30294a.m92553G(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qd1.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$logout$2", m100430f = "UserSessionManagerImpl.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f123930w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Logout f123932y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Logout logout, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f123932y = logout;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30294a.this.new d(this.f123932y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f123930w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C30294a.this.internalUserSwitchFlow;
                Logout logout = this.f123932y;
                this.f123930w = 1;
                if (interfaceC13072o1.emit(logout, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qd1.a$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$logout$3", m100430f = "UserSessionManagerImpl.kt", m100431l = {175, 177}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f123933w;

        /* JADX INFO: renamed from: x */
        int f123934x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30294a.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            if (r12.m125481d(r11) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        
            if (r0.mo58700a(r3, r11) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            return r1;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r83.a r1 = r83.EnumC31071a.f128113w
                int r0 = r11.f123934x
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1c
                if (r0 != r2) goto L14
                java.lang.Object r0 = r11.f123933w
                java.lang.Exception r0 = (java.lang.Exception) r0
                p505ts.AbstractC34132o.m107864I(r12)
                goto L67
            L14:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1c:
                p505ts.AbstractC34132o.m107864I(r12)     // Catch: java.lang.Exception -> L20
                goto L67
            L20:
                r0 = move-exception
                r12 = r0
                goto L35
            L23:
                p505ts.AbstractC34132o.m107864I(r12)
                qd1.a r12 = qd1.C30294a.this     // Catch: java.lang.Exception -> L20
                y92.a r12 = qd1.C30294a.m92559p(r12)     // Catch: java.lang.Exception -> L20
                r11.f123934x = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r12 = r12.m125481d(r11)     // Catch: java.lang.Exception -> L20
                if (r12 != r1) goto L67
                goto L66
            L35:
                qd1.a r0 = qd1.C30294a.this
                iy1.c r0 = qd1.C30294a.m92562t(r0)
                jy1.a r3 = new jy1.a
                boolean r12 = r12 instanceof java.io.IOException
                if (r12 == 0) goto L49
                java.lang.String r12 = "io_exception"
                java.util.List r12 = wb3.AbstractC37056f.m118958J(r12)
            L47:
                r7 = r12
                goto L50
            L49:
                java.lang.String r12 = "unknown_exception"
                java.util.List r12 = wb3.AbstractC37056f.m118958J(r12)
                goto L47
            L50:
                r9 = 21
                r10 = 0
                r4 = 0
                java.lang.String r5 = "android_auth_manager.sign_out_exception"
                r6 = 0
                r8 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r12 = 0
                r11.f123933w = r12
                r11.f123934x = r2
                java.lang.Object r12 = r0.mo58700a(r3, r11)
                if (r12 != r1) goto L67
            L66:
                return r1
            L67:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: qd1.C30294a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: qd1.a$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$logout$4", m100430f = "UserSessionManagerImpl.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f123936w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30294a.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f123936w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AppConfigurationRepository appConfigurationRepository = C30294a.this.appConfigurationRepository;
                this.f123936w = 1;
                if (appConfigurationRepository.clear(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qd1.a$g */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$logout$5", m100430f = "UserSessionManagerImpl.kt", m100431l = {192}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f123938w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30294a.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f123938w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37223g c37223g = C30294a.this.entitlementsRepository;
                this.f123938w = 1;
                if (c37223g.m119306q(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qd1.a$h */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$onPostLoginFailure$1", m100430f = "UserSessionManagerImpl.kt", m100431l = {205}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f123940w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30294a.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f123940w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C30294a c30294a = C30294a.this;
                this.f123940w = 1;
                if (c30294a.m92553G(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qd1.a$i */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl", m100430f = "UserSessionManagerImpl.kt", m100431l = {122, 123, 127}, m100432m = "performLogin", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f123942E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f123943F;

        /* JADX INFO: renamed from: H */
        int f123945H;

        /* JADX INFO: renamed from: w */
        Object f123946w;

        /* JADX INFO: renamed from: x */
        Object f123947x;

        /* JADX INFO: renamed from: y */
        Object f123948y;

        /* JADX INFO: renamed from: z */
        Object f123949z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f123943F = obj;
            this.f123945H |= Integer.MIN_VALUE;
            return C30294a.this.m92551E(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: qd1.a$j */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl", m100430f = "UserSessionManagerImpl.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 81, 84}, m100432m = "postLoginMissionCriticalFetches", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f123950E;

        /* JADX INFO: renamed from: w */
        Object f123951w;

        /* JADX INFO: renamed from: x */
        Object f123952x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f123953y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f123953y = obj;
            this.f123950E |= Integer.MIN_VALUE;
            return C30294a.this.mo83916f(null, this);
        }
    }

    /* JADX INFO: renamed from: qd1.a$k */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl", m100430f = "UserSessionManagerImpl.kt", m100431l = {210, 215}, m100432m = "signOut", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f123955w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f123956x;

        /* JADX INFO: renamed from: z */
        int f123958z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f123956x = obj;
            this.f123958z |= Integer.MIN_VALUE;
            return C30294a.this.m92553G(this);
        }
    }

    /* JADX INFO: renamed from: qd1.a$l */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f123959w;

        /* JADX INFO: renamed from: qd1.a$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f123960w;

            /* JADX INFO: renamed from: qd1.a$l$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes8.dex */
            @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$special$$inlined$filterIsInstance$1$2", m100430f = "UserSessionManagerImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42218a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f123962F;

                /* JADX INFO: renamed from: G */
                Object f123963G;

                /* JADX INFO: renamed from: H */
                int f123964H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f123965w;

                /* JADX INFO: renamed from: x */
                int f123966x;

                /* JADX INFO: renamed from: y */
                Object f123967y;

                /* JADX INFO: renamed from: z */
                Object f123968z;

                public C42218a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f123965w = obj;
                    this.f123966x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f123960w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42218a c42218a;
                if (interfaceC30057d instanceof C42218a) {
                    c42218a = (C42218a) interfaceC30057d;
                    int i13 = c42218a.f123966x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42218a.f123966x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42218a = new C42218a(interfaceC30057d);
                    }
                } else {
                    c42218a = new C42218a(interfaceC30057d);
                }
                Object obj2 = c42218a.f123965w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42218a.f123966x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f123960w;
                    if (obj instanceof Login) {
                        c42218a.f123967y = null;
                        c42218a.f123968z = null;
                        c42218a.f123962F = null;
                        c42218a.f123963G = null;
                        c42218a.f123964H = 0;
                        c42218a.f123966x = 1;
                        if (interfaceC13062m.emit(obj, c42218a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public l(InterfaceC13058l interfaceC13058l) {
            this.f123959w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f123959w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qd1.a$m */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f123969w;

        /* JADX INFO: renamed from: qd1.a$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f123970w;

            /* JADX INFO: renamed from: qd1.a$m$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes8.dex */
            @InterfaceC32271e(m100429c = "com.whoop.domain.converters.UserSessionManagerImpl$special$$inlined$filterIsInstance$2$2", m100430f = "UserSessionManagerImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42219a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f123972F;

                /* JADX INFO: renamed from: G */
                Object f123973G;

                /* JADX INFO: renamed from: H */
                int f123974H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f123975w;

                /* JADX INFO: renamed from: x */
                int f123976x;

                /* JADX INFO: renamed from: y */
                Object f123977y;

                /* JADX INFO: renamed from: z */
                Object f123978z;

                public C42219a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f123975w = obj;
                    this.f123976x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f123970w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42219a c42219a;
                if (interfaceC30057d instanceof C42219a) {
                    c42219a = (C42219a) interfaceC30057d;
                    int i13 = c42219a.f123976x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42219a.f123976x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42219a = new C42219a(interfaceC30057d);
                    }
                } else {
                    c42219a = new C42219a(interfaceC30057d);
                }
                Object obj2 = c42219a.f123975w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42219a.f123976x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f123970w;
                    if (obj instanceof Logout) {
                        c42219a.f123977y = null;
                        c42219a.f123978z = null;
                        c42219a.f123972F = null;
                        c42219a.f123973G = null;
                        c42219a.f123974H = 0;
                        c42219a.f123976x = 1;
                        if (interfaceC13062m.emit(obj, c42219a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public m(InterfaceC13058l interfaceC13058l) {
            this.f123969w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f123969w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C30294a(C27853p sessionManager, InterfaceC2994c0 scope, C27847j pendingUserSessionRepository, NewWhoopLoginInterceptor newWhoopLoginInterceptor, C39352a authManager, AppConfigurationRepository appConfigurationRepository, C37223g entitlementsRepository, C29104a bootstrapUserSignIn, InterfaceC21030c metricWriter, C12066b cognitoAuthApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sessionManager, "sessionManager");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(newWhoopLoginInterceptor, "newWhoopLoginInterceptor");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(entitlementsRepository, "entitlementsRepository");
        AbstractC22676k.m65750j(bootstrapUserSignIn, "bootstrapUserSignIn");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.sessionManager = sessionManager;
        this.scope = scope;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.newWhoopLoginInterceptor = newWhoopLoginInterceptor;
        this.authManager = authManager;
        this.appConfigurationRepository = appConfigurationRepository;
        this.entitlementsRepository = entitlementsRepository;
        this.bootstrapUserSignIn = bootstrapUserSignIn;
        this.metricWriter = metricWriter;
        this.cognitoAuthApi = cognitoAuthApi;
        this.logger = logger;
        this.userSwitchEvents = new C24087j(C24082e.m71000Y());
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.internalUserSwitchFlow = c13096w1M36592b;
        this.userSwitchFlow = c13096w1M36592b;
        l lVar = new l(getUserSwitchFlow());
        C13021b2 c13021b2 = C13105z1.f45289b;
        this.loginFlow = AbstractC13091v.m36586L(lVar, scope, c13021b2, 0);
        this.logoutFlow = AbstractC13091v.m36586L(new m(getUserSwitchFlow()), scope, c13021b2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Boolean m92547A(UserSwitchEvent userSwitchEvent) {
        return Boolean.valueOf(userSwitchEvent instanceof Login);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Boolean m92548B(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Boolean m92549C(UserSwitchEvent userSwitchEvent) {
        return Boolean.valueOf(userSwitchEvent instanceof Logout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Boolean m92550D(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: E */
    public final Object m92551E(String str, String str2, String str3, InterfaceC30057d<? super LoginResult> interfaceC30057d) throws PasswordAttemptsExceededException, IOException, MfaChallengeException {
        i iVar;
        C30294a c30294a;
        LoginResult loginResult;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f123945H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f123945H = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM33303H = iVar.f123943F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f123945H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM33303H);
            C12066b c12066b = this.cognitoAuthApi;
            iVar.f123946w = null;
            iVar.f123947x = null;
            iVar.f123948y = null;
            iVar.f123949z = this;
            iVar.f123945H = 1;
            objM33303H = c12066b.m33303H(str, str2, str3, iVar);
            if (objM33303H != enumC31071a) {
                c30294a = this;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c30294a = (C30294a) iVar.f123949z;
            AbstractC34132o.m107864I(objM33303H);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LoginResult loginResult2 = (LoginResult) iVar.f123942E;
                AbstractC34132o.m107864I(objM33303H);
                return loginResult2;
            }
            AbstractC34132o.m107864I(objM33303H);
        }
        loginResult = (LoginResult) objM33303H;
        if (loginResult.getNeedsProfileCompletion()) {
            m92567y(loginResult);
            return loginResult;
        }
        iVar.f123946w = null;
        iVar.f123947x = null;
        iVar.f123948y = null;
        iVar.f123949z = null;
        iVar.f123942E = loginResult;
        iVar.f123945H = 3;
        if (m92566x(loginResult, iVar) != enumC31071a) {
            return enumC31071a;
        }
        return loginResult;
        AuthMaterial authMaterialM92568z = c30294a.m92568z((InterfaceC12081q) objM33303H);
        C29104a c29104a = this.bootstrapUserSignIn;
        iVar.f123946w = null;
        iVar.f123947x = null;
        iVar.f123948y = null;
        iVar.f123949z = null;
        iVar.f123945H = 2;
        objM33303H = c29104a.m88435j(authMaterialM92568z, iVar);
        if (objM33303H != enumC31071a) {
            loginResult = (LoginResult) objM33303H;
            if (loginResult.getNeedsProfileCompletion()) {
                m92567y(loginResult);
                return loginResult;
            }
            iVar.f123946w = null;
            iVar.f123947x = null;
            iVar.f123948y = null;
            iVar.f123949z = null;
            iVar.f123942E = loginResult;
            iVar.f123945H = 3;
            if (m92566x(loginResult, iVar) != enumC31071a) {
                return loginResult;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: F */
    private final void m92552F(LoginResult loginResult) {
        this.logger.mo85219j("setting pending user credentials", new AbstractC30556a.a[0]);
        int id4 = loginResult.getSession().getUser().getId();
        String accessToken = loginResult.getSession().getAuthToken().getAccessToken();
        this.pendingUserSessionRepository.m83958g(id4);
        this.pendingUserSessionRepository.m83956e(accessToken);
        this.pendingUserSessionRepository.m83957f(loginResult.getSession().getAuthToken().toAuthMaterial());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m92553G(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        k kVar;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f123958z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f123958z = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object objM125478a = kVar.f123956x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar.f123958z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            C39352a c39352a = this.authManager;
            kVar.f123958z = 1;
            objM125478a = c39352a.m125478a(kVar);
            if (objM125478a != enumC31071a) {
            }
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM125478a);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM125478a);
        }
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        String refreshToken = authMaterial != null ? authMaterial.getRefreshToken() : null;
        if (refreshToken == null) {
            this.logger.mo85222m("No refresh token to perform sign out API call. Signing out the user anyway.", new AbstractC30556a.a[0]);
            return c23454a0;
        }
        C12066b c12066b = this.cognitoAuthApi;
        kVar.f123955w = null;
        kVar.f123958z = 2;
        return c12066b.m33304K(refreshToken, kVar) == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r0.interceptSuspend(r1, r4, r17, false, r5) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        return r6;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m92566x(com.whoop.service.network.model.LoginResult r18, q83.InterfaceC30057d<? super l83.C23454a0> r19) {
        /*
            r17 = this;
            r3 = r17
            r0 = r19
            boolean r1 = r0 instanceof qd1.C30294a.a
            if (r1 == 0) goto L18
            r1 = r0
            qd1.a$a r1 = (qd1.C30294a.a) r1
            int r2 = r1.f123916E
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L18
            int r2 = r2 - r4
            r1.f123916E = r2
        L16:
            r5 = r1
            goto L1e
        L18:
            qd1.a$a r1 = new qd1.a$a
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r5.f123919y
            r83.a r6 = r83.EnumC31071a.f128113w
            int r1 = r5.f123916E
            r7 = 0
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L4c
            if (r1 == r2) goto L41
            if (r1 == r8) goto L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L35:
            java.lang.Object r1 = r5.f123918x
            com.whoop.ui.login.MissingImportantAppInfoException r1 = (com.whoop.p069ui.login.MissingImportantAppInfoException) r1
            java.lang.Object r2 = r5.f123917w
            com.whoop.service.network.model.LoginResult r2 = (com.whoop.service.network.model.LoginResult) r2
            p505ts.AbstractC34132o.m107864I(r0)
            goto L8e
        L41:
            java.lang.Object r1 = r5.f123917w
            com.whoop.service.network.model.LoginResult r1 = (com.whoop.service.network.model.LoginResult) r1
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            goto L64
        L49:
            r0 = move-exception
            r1 = r0
            goto L67
        L4c:
            p505ts.AbstractC34132o.m107864I(r0)
            com.whoop.data.remote.NewWhoopLoginInterceptor r0 = r3.newWhoopLoginInterceptor     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            com.whoop.domain.model.Session r1 = r18.getSession()     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            od1.p r4 = r3.sessionManager     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            r5.f123917w = r7     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            r5.f123916E = r2     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            r2 = r4
            r4 = 0
            java.lang.Object r0 = r0.interceptSuspend(r1, r2, r3, r4, r5)     // Catch: com.whoop.p069ui.login.MissingImportantAppInfoException -> L49
            if (r0 != r6) goto L64
            goto L8d
        L64:
            l83.a0 r0 = l83.C23454a0.f92919a
            return r0
        L67:
            iy1.c r0 = r3.metricWriter
            jy1.a r9 = new jy1.a
            java.lang.String r2 = r1.getMetricValue()
            java.lang.String r4 = "missing_info:"
            java.util.List r13 = r80.AbstractC31061c.m95644t(r4, r2)
            r15 = 21
            r16 = 0
            r10 = 0
            java.lang.String r11 = "login.missing_required_info"
            r12 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f123917w = r7
            r5.f123918x = r1
            r5.f123916E = r8
            java.lang.Object r0 = r0.mo58700a(r9, r5)
            if (r0 != r6) goto L8e
        L8d:
            return r6
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qd1.C30294a.m92566x(com.whoop.service.network.model.LoginResult, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: y */
    private final void m92567y(LoginResult loginResult) {
        m92552F(loginResult);
    }

    /* JADX INFO: renamed from: z */
    private final AuthMaterial m92568z(InterfaceC12081q cognitoResult) throws PasswordAttemptsExceededException, IOException, MfaChallengeException {
        if (cognitoResult instanceof C12078n) {
            C12078n c12078n = (C12078n) cognitoResult;
            int iM33332b = c12078n.getStatusCode();
            C34854z0 c34854z0 = AbstractC34799a1.f146522x;
            String strM33331a = c12078n.getMessage();
            C39412p c39412p = C34818h0.f146589e;
            throw new HttpException(C29218v0.m88723a(iM33332b, AbstractC12350b.m34590k(strM33331a, AbstractC1772c1.m5403u("text/plain; charset=UTF8"))));
        }
        if (cognitoResult instanceof C12079o) {
            throw new IOException("Network error during Cognito login", ((C12079o) cognitoResult).getException());
        }
        if (AbstractC22676k.m65745e(cognitoResult, C12080p.f40225a)) {
            throw new PasswordAttemptsExceededException();
        }
        if (cognitoResult instanceof InterfaceC12081q.b) {
            InterfaceC12081q.b bVar = (InterfaceC12081q.b) cognitoResult;
            return new AuthMaterial(bVar.getMaterial().getAccessToken(), bVar.getMaterial().getRefreshToken(), bVar.getMaterial().getExpiresIn(), 0);
        }
        if (cognitoResult instanceof InterfaceC12081q.a) {
            throw new MfaChallengeException();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: a */
    public void mo83911a() {
        Session sessionMo83921q = mo83921q();
        if (sessionMo83921q == null) {
            return;
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new c(null), 3);
        Logout logout = new Logout(sessionMo83921q);
        this.sessionManager.m84002g(sessionMo83921q);
        this.userSwitchEvents.onNext(logout);
        AbstractC3006f0.m8732z(this.scope, null, null, new d(logout, null), 3);
        AbstractC3006f0.m8732z(this.scope, null, null, new e(null), 3);
        AbstractC3006f0.m8732z(this.scope, null, null, new f(null), 3);
        AbstractC3006f0.m8732z(this.scope, null, null, new g(null), 3);
    }

    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13087t1 getLogoutFlow() {
        return this.logoutFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: c */
    public Object mo83913c(String str, String str2, String str3, InterfaceC30057d<? super LoginResult> interfaceC30057d) throws PasswordAttemptsExceededException, IOException, MfaChallengeException {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f123923G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f123923G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM92551E = bVar.f123921E;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f123923G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM92551E);
            bVar.f123924w = null;
            bVar.f123925x = null;
            bVar.f123926y = null;
            bVar.f123923G = 1;
            objM92551E = m92551E(str, str2, str3, bVar);
            if (objM92551E != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LoginResult loginResult = (LoginResult) bVar.f123927z;
            AbstractC34132o.m107864I(objM92551E);
            return loginResult;
        }
        AbstractC34132o.m107864I(objM92551E);
        LoginResult loginResult2 = (LoginResult) objM92551E;
        this.userSwitchEvents.onNext(new Login(loginResult2.getSession()));
        InterfaceC13072o1 interfaceC13072o1 = this.internalUserSwitchFlow;
        Login login = new Login(loginResult2.getSession());
        bVar.f123924w = null;
        bVar.f123925x = null;
        bVar.f123926y = null;
        bVar.f123927z = loginResult2;
        bVar.f123923G = 2;
        return interfaceC13072o1.emit(login, bVar) == obj ? obj : loginResult2;
    }

    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC13087t1 getUserSwitchFlow() {
        return this.userSwitchFlow;
    }

    @Override // od1.InterfaceC27837a0
    @InterfaceC23457c
    /* JADX INFO: renamed from: e */
    public C38280g<Login> mo83915e() {
        C38280g<Login> c38280gM122675d = this.userSwitchEvents.m122678n(new C6656c(new C30217a(2), 22)).m122675d(Login.class);
        AbstractC22676k.m65749i(c38280gM122675d, "cast(...)");
        return c38280gM122675d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r12.emit(r2, r0) == r1) goto L28;
     */
    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo83916f(fj0.C14527a r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof qd1.C30294a.j
            if (r0 == 0) goto L13
            r0 = r12
            qd1.a$j r0 = (qd1.C30294a.j) r0
            int r1 = r0.f123950E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123950E = r1
            goto L18
        L13:
            qd1.a$j r0 = new qd1.a$j
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f123953y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f123950E
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r11 = r0.f123952x
            com.whoop.service.network.model.LoginResult r11 = (com.whoop.service.network.model.LoginResult) r11
            java.lang.Object r11 = r0.f123951w
            fj0.a r11 = (fj0.C14527a) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto Lb1
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            java.lang.Object r11 = r0.f123952x
            com.whoop.service.network.model.LoginResult r11 = (com.whoop.service.network.model.LoginResult) r11
            java.lang.Object r2 = r0.f123951w
            fj0.a r2 = (fj0.C14527a) r2
            p505ts.AbstractC34132o.m107864I(r12)
            goto L8b
        L4b:
            java.lang.Object r11 = r0.f123951w
            fj0.a r11 = (fj0.C14527a) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L75
        L53:
            p505ts.AbstractC34132o.m107864I(r12)
            pd1.a r12 = r10.bootstrapUserSignIn
            com.whoop.domain.model.AuthMaterial r2 = new com.whoop.domain.model.AuthMaterial
            java.lang.String r7 = r11.getAccessToken()
            java.lang.String r8 = r11.getRefreshToken()
            int r11 = r11.getExpiresIn()
            r9 = 0
            r2.<init>(r7, r8, r11, r9)
            r0.f123951w = r6
            r0.f123950E = r5
            java.lang.Object r12 = r12.m88435j(r2, r0)
            if (r12 != r1) goto L75
            goto Lb0
        L75:
            r11 = r12
            com.whoop.service.network.model.LoginResult r11 = (com.whoop.service.network.model.LoginResult) r11
            boolean r12 = r11.getNeedsProfileCompletion()
            if (r12 != 0) goto Lb4
            r0.f123951w = r6
            r0.f123952x = r11
            r0.f123950E = r4
            java.lang.Object r12 = r10.m92566x(r11, r0)
            if (r12 != r1) goto L8b
            goto Lb0
        L8b:
            lh3.j r12 = r10.userSwitchEvents
            com.whoop.domain.model.Login r2 = new com.whoop.domain.model.Login
            com.whoop.domain.model.Session r4 = r11.getSession()
            r2.<init>(r4)
            r12.onNext(r2)
            ec3.o1 r12 = r10.internalUserSwitchFlow
            com.whoop.domain.model.Login r2 = new com.whoop.domain.model.Login
            com.whoop.domain.model.Session r11 = r11.getSession()
            r2.<init>(r11)
            r0.f123951w = r6
            r0.f123952x = r6
            r0.f123950E = r3
            java.lang.Object r11 = r12.emit(r2, r0)
            if (r11 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            l83.a0 r11 = l83.C23454a0.f92919a
            return r11
        Lb4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not implemented. MFA can only be set up on an existing account"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: qd1.C30294a.mo83916f(fj0.a, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27837a0
    @InterfaceC23457c
    /* JADX INFO: renamed from: g */
    public C38280g<UserSwitchEvent> mo83917g() {
        return this.userSwitchEvents;
    }

    @Override // od1.InterfaceC27837a0
    public int getUserId() {
        return this.sessionManager.m84001d().m84056g();
    }

    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: h */
    public void mo83918h() {
        AbstractC3006f0.m8732z(this.scope, null, null, new h(null), 3);
    }

    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: i, reason: from getter */
    public InterfaceC13087t1 getLoginFlow() {
        return this.loginFlow;
    }

    @Override // od1.InterfaceC27837a0
    @InterfaceC23457c
    /* JADX INFO: renamed from: j */
    public C38280g<Logout> mo83920j() {
        C38280g<Logout> c38280gM122675d = this.userSwitchEvents.m122678n(new C6656c(new C30217a(3), 23)).m122675d(Logout.class);
        AbstractC22676k.m65749i(c38280gM122675d, "cast(...)");
        return c38280gM122675d;
    }

    @Override // od1.InterfaceC27837a0
    /* JADX INFO: renamed from: q */
    public Session mo83921q() {
        return this.sessionManager.m84001d().m84057h();
    }

    public /* synthetic */ C30294a(C27853p c27853p, InterfaceC2994c0 interfaceC2994c0, C27847j c27847j, NewWhoopLoginInterceptor newWhoopLoginInterceptor, C39352a c39352a, AppConfigurationRepository appConfigurationRepository, C37223g c37223g, C29104a c29104a, InterfaceC21030c interfaceC21030c, C12066b c12066b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27853p, interfaceC2994c0, c27847j, newWhoopLoginInterceptor, c39352a, appConfigurationRepository, c37223g, c29104a, interfaceC21030c, c12066b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UserSessionManagerImpl") : interfaceC34116n);
    }
}
