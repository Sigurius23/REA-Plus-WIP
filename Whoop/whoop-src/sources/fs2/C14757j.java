package fs2;

import android.content.Context;
import b23.EnumC2341g;
import b43.C2721b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.videocall.api.VideoCallSessionResponse;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.video.android.model.User;
import io.getstream.video.android.model.UserType;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33403i3;
import t23.C33413k3;
import t23.C33450s0;
import t23.InterfaceC33408j3;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: fs2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001\u0019B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001f\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0$8\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b!\u0010&R%\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0$8\u0006¢\u0006\u0012\n\u0004\b\u0017\u0010%\u0012\u0004\b)\u0010\u0018\u001a\u0004\b\u001e\u0010&¨\u0006,"}, m65681d2 = {"Lfs2/j;", "", "Landroid/content/Context;", "context", "", "streamVideoCallApiKey", "Ljs0/c;", "configurationRepository", "Lbc3/c0;", "scope", "Lt23/c0;", "callOverride", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljs0/c;Lbc3/c0;Lt23/c0;)V", "Lcom/whoop/videocall/api/VideoCallSessionResponse;", "session", "Ll83/a0;", "f", "(Lcom/whoop/videocall/api/VideoCallSessionResponse;)V", "callType", "callId", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "g", "()V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "Ljs0/c;", "d", "Lbc3/c0;", "Lec3/p1;", "e", "Lec3/p1;", "_currentCall", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "currentCall", "Lt23/q2;", "getConnectionStateFlow$annotations", "connectionStateFlow", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "video-call_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14757j {

    /* JADX INFO: renamed from: i */
    public static final int f54652i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String streamVideoCallApiKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13075p1 _currentCall;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13037f2 currentCall;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13037f2 connectionStateFlow;

    /* JADX INFO: renamed from: fs2.j$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoClientService$leaveAndDestroy$1", m100430f = "StreamVideoClientService.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f54662w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14757j.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0050  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objM125868N0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54662w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC21909c abstractC21909c = C14757j.this.configurationRepository;
                Companion.C41608a c41608a = Companion.C41608a.f54660a;
                C21908b configurations = abstractC21909c.getConfigurations();
                String name = c41608a.getName();
                Object defaultValue = c41608a.getDefaultValue();
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                    String str = (String) configurations.get(name);
                    if (str != null) {
                        objM125868N0 = AbstractC39421y.m125932Q(str);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                    String str2 = (String) configurations.get(name);
                    if (str2 != null) {
                        objM125868N0 = AbstractC39421y.m125933R(str2);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                    String str3 = (String) configurations.get(name);
                    if (str3 != null) {
                        objM125868N0 = AbstractC39420x.m125915y(str3);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                    String str4 = (String) configurations.get(name);
                    if (str4 != null) {
                        objM125868N0 = AbstractC39420x.m125914x(str4);
                    } else {
                        objM125868N0 = null;
                    }
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                    String str5 = (String) configurations.get(name);
                    if (str5 != null) {
                        objM125868N0 = AbstractC39414r.m125868N0(str5);
                    } else {
                        objM125868N0 = null;
                    }
                } else {
                    objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
                }
                if (objM125868N0 != null) {
                    defaultValue = objM125868N0;
                }
                if (defaultValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                long jLongValue = ((Long) defaultValue).longValue();
                this.f54662w = 1;
                if (AbstractC3034m0.m8782b(jLongValue, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C33403i3 c33403i3 = InterfaceC33408j3.f139483t;
            c33403i3.getClass();
            if (C33403i3.f139477b != null) {
                c33403i3.m105854c();
            }
            ((C13045h2) C14757j.this._currentCall).m36570j(null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fs2.j$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.videocall.manager.StreamVideoClientService$special$$inlined$flatMapLatest$1", m100430f = "StreamVideoClientService.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f54664w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f54665x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f54666y;

        public c(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C33368c0 c33368c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f54665x = interfaceC13062m;
            cVar.f54666y = c33368c0;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C33450s0 c33450s0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54664w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f54665x;
                C33368c0 c33368c0 = (C33368c0) this.f54666y;
                if (c33368c0 == null || (c33450s0 = c33368c0.f139302p) == null || (c0456u = c33450s0.f139652h) == null) {
                    c0456u = new C0456u(null, 1);
                }
                this.f54665x = null;
                this.f54666y = null;
                this.f54664w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C33368c0) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C14757j(Context context, String streamVideoCallApiKey, AbstractC21909c configurationRepository, InterfaceC2994c0 scope, C33368c0 c33368c0) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(streamVideoCallApiKey, "streamVideoCallApiKey");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(scope, "scope");
        this.context = context;
        this.streamVideoCallApiKey = streamVideoCallApiKey;
        this.configurationRepository = configurationRepository;
        this.scope = scope;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c33368c0);
        this._currentCall = c13045h2M36593c;
        this.currentCall = AbstractC13091v.m36598h(c13045h2M36593c);
        this.connectionStateFlow = AbstractC13091v.m36587M(AbstractC13091v.m36590P(c13045h2M36593c, new c(null)), scope, C13105z1.f45288a, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m42325c(String callType, String callId) {
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(callId, "callId");
        InterfaceC13075p1 interfaceC13075p1 = this._currentCall;
        InterfaceC33408j3.f139483t.getClass();
        C33368c0 c33368c0M105796n = ((C33366b4) C33403i3.m105852a()).m105796n(callType, callId);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, c33368c0M105796n);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13037f2 getConnectionStateFlow() {
        return this.connectionStateFlow;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC13037f2 getCurrentCall() {
        return this.currentCall;
    }

    /* JADX INFO: renamed from: f */
    public final void m42328f(VideoCallSessionResponse session) throws IOException {
        AbstractC22676k.m65750j(session, "session");
        C33403i3 c33403i3 = InterfaceC33408j3.f139483t;
        c33403i3.getClass();
        if (C33403i3.m105853b() != null) {
            c33403i3.m105854c();
            ((C13045h2) this._currentCall).m36570j(null);
        }
        Context context = this.context;
        String str = this.streamVideoCallApiKey;
        User user = new User(session.getUserId(), (String) null, (UserType) null, (String) null, (String) null, (List) null, (Map) null, (C21682i) null, (C21682i) null, (C21682i) null, 1022, (DefaultConstructorMarker) null);
        String jwt = session.getJwt();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        new C33413k3(context, str, user, jwt, new C2721b(6)).m105856a();
    }

    /* JADX INFO: renamed from: g */
    public final void m42329g() {
        C33368c0 c33368c0 = (C33368c0) ((C13045h2) this._currentCall).getValue();
        if (c33368c0 != null) {
            C33368c0.m105808q(c33368c0);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new b(null), 3);
    }

    public C14757j(Context context, String str, AbstractC21909c abstractC21909c, InterfaceC2994c0 interfaceC2994c0, C33368c0 c33368c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, abstractC21909c, (i13 & 8) != 0 ? AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC3050q0.f12077a)) : interfaceC2994c0, (i13 & 16) != 0 ? null : c33368c0);
    }
}
