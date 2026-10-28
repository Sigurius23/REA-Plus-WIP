package t23;

import a00.C0071f;
import a13.C0150h;
import a30.C0332w0;
import a33.C0351c;
import a33.C0352d;
import android.app.Notification;
import android.content.Context;
import androidx.lifecycle.AbstractC1638x;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import b43.C2721b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.AbstractC3050q0;
import bc3.C2986a0;
import bc3.C2990b0;
import bc3.C3004e2;
import bc3.C3022j0;
import bc3.C3023j1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bi.C3278p;
import c43.C4186b;
import c43.C4187c;
import c43.C4197m;
import c43.C4205u;
import c53.C4256b;
import d33.C11585c;
import d33.C11602h1;
import d33.EnumC11579a;
import e43.InterfaceC12716h;
import e53.C12745d;
import e53.InterfaceC12744c;
import e93.AbstractC12889b;
import ec3.C13045h2;
import f53.C14122j;
import f53.C14123k;
import h43.C16853b;
import ih0.AbstractC18489d0;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.android.video.generated.models.CallAcceptedEvent;
import io.getstream.android.video.generated.models.CallCreatedEvent;
import io.getstream.android.video.generated.models.CallRequest;
import io.getstream.android.video.generated.models.CallResponse;
import io.getstream.android.video.generated.models.CallRingEvent;
import io.getstream.android.video.generated.models.CallSettingsRequest;
import io.getstream.android.video.generated.models.CallStateResponseFields;
import io.getstream.android.video.generated.models.ConnectedEvent;
import io.getstream.android.video.generated.models.JoinCallRequest;
import io.getstream.android.video.generated.models.MemberResponse;
import io.getstream.android.video.generated.models.QueryCallsRequest;
import io.getstream.android.video.generated.models.QueryCallsResponse;
import io.getstream.android.video.generated.models.SortParamRequest;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.android.video.generated.models.WSCallEvent;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.video.android.model.StreamCallId;
import io.getstream.video.android.model.User;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import k53.C22214b;
import k53.C22215c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l43.C23336b;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25267u;
import m83.C25272z;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import n43.C26288d;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p002a0.C0005a0;
import p003a1.C0109h;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p499t9.C33647p;
import p499t9.C33652u;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p550vd.AbstractC35902e;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rb3.AbstractC31199g;
import s83.AbstractC32269c;
import v33.AbstractC35638w;
import x43.C37970b;
import x43.C37972d;
import y33.C39200c;
import yb3.AbstractC39414r;
import z23.C40033c;

/* JADX INFO: renamed from: t23.b4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33366b4 implements InterfaceC33408j3, InterfaceC12716h {

    /* JADX INFO: renamed from: E */
    public final C39200c f139232E;

    /* JADX INFO: renamed from: F */
    public final C12745d f139233F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC12744c f139234G;

    /* JADX INFO: renamed from: H */
    public final C16853b f139235H;

    /* JADX INFO: renamed from: I */
    public final C11585c f139236I;

    /* JADX INFO: renamed from: J */
    public final boolean f139237J;

    /* JADX INFO: renamed from: K */
    public final C3278p f139238K;

    /* JADX INFO: renamed from: L */
    public final C22215c f139239L;

    /* JADX INFO: renamed from: M */
    public final C22214b f139240M;

    /* JADX INFO: renamed from: N */
    public final C33647p f139241N;

    /* JADX INFO: renamed from: O */
    public final C2721b f139242O;

    /* JADX INFO: renamed from: P */
    public final long f139243P;

    /* JADX INFO: renamed from: Q */
    public final boolean f139244Q;

    /* JADX INFO: renamed from: R */
    public final boolean f139245R;

    /* JADX INFO: renamed from: S */
    public final C33652u f139246S;

    /* JADX INFO: renamed from: T */
    public C3022j0 f139247T;

    /* JADX INFO: renamed from: U */
    public final C33391g1 f139248U;

    /* JADX INFO: renamed from: V */
    public final C11585c f139249V;

    /* JADX INFO: renamed from: W */
    public C3022j0 f139250W;

    /* JADX INFO: renamed from: X */
    public final C23470p f139251X;

    /* JADX INFO: renamed from: Y */
    public final LinkedHashSet f139252Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashMap f139253Z;

    /* JADX INFO: renamed from: a0 */
    public final C0005a0 f139254a0;

    /* JADX INFO: renamed from: b0 */
    public final C0332w0 f139255b0;

    /* JADX INFO: renamed from: c0 */
    public final C0352d f139256c0;

    /* JADX INFO: renamed from: d0 */
    public final C14123k f139257d0;

    /* JADX INFO: renamed from: e0 */
    public String f139258e0;

    /* JADX INFO: renamed from: w */
    public final Context f139259w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC2994c0 f139260x;

    /* JADX INFO: renamed from: y */
    public final String f139261y;

    /* JADX INFO: renamed from: z */
    public String f139262z;

    public C33366b4(Context context, InterfaceC2994c0 scope, User initialUser, String apiKey, String token, AbstractC1638x lifecycle, C39200c c39200c, C12745d tokenRepository, InterfaceC12744c tokenProvider, C16853b streamNotificationManager, C11585c c11585c, boolean z4, C3278p c3278p, C22215c sounds, C22214b vibrationConfig, C33647p permissionCheck, C2721b loggingLevel, long j7, boolean z13, boolean z14) {
        ProductvideoApi productvideoApiM124884a = c39200c.m124884a();
        AbstractC22676k.m65750j(scope, "scope");
        C29205p c29205p = new C29205p(14);
        int i13 = 3;
        C3004e2 c3004e2 = new C3004e2((InterfaceC3027k1) AbstractC35148d.m111177h(null, null, 3).f17297x.f65971w.get(C3023j1.f12041w));
        C22365e c22365e = AbstractC3050q0.f12077a;
        C40033c c40033c = new C40033c(new C0352d(productvideoApiM124884a, AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2, ExecutorC22364d.f87316w).plus(new C4256b(C2986a0.f11990w, i13)))), c29205p);
        C33652u c33652u = new C33652u(c40033c, new C2570m(scope, c40033c, c29205p));
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(initialUser, "initialUser");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        AbstractC22676k.m65750j(streamNotificationManager, "streamNotificationManager");
        AbstractC22676k.m65750j(sounds, "sounds");
        AbstractC22676k.m65750j(vibrationConfig, "vibrationConfig");
        AbstractC22676k.m65750j(permissionCheck, "permissionCheck");
        AbstractC22676k.m65750j(loggingLevel, "loggingLevel");
        this.f139259w = context;
        this.f139260x = scope;
        this.f139261y = apiKey;
        this.f139262z = token;
        this.f139232E = c39200c;
        this.f139233F = tokenRepository;
        this.f139234G = tokenProvider;
        this.f139235H = streamNotificationManager;
        this.f139236I = c11585c;
        this.f139237J = z4;
        this.f139238K = c3278p;
        this.f139239L = sounds;
        this.f139240M = vibrationConfig;
        this.f139241N = permissionCheck;
        this.f139242O = loggingLevel;
        this.f139243P = j7;
        this.f139244Q = z13;
        this.f139245R = z14;
        this.f139246S = c33652u;
        C33391g1 c33391g1 = new C33391g1(this);
        this.f139248U = c33391g1;
        this.f139249V = new C11585c(c33391g1.f139405h, c33391g1.f139404g);
        this.f139251X = AbstractC1772c1.m5382S(this, "Call:StreamVideo");
        this.f139252Y = new LinkedHashSet();
        this.f139253Z = new LinkedHashMap();
        this.f139254a0 = new C0005a0(100);
        this.f139255b0 = new C0332w0(context, 9);
        this.f139256c0 = new C0352d(6);
        this.f139257d0 = c39200c.f168482j;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(scope, new C2990b0("init#coordinatorSocket.events.collect"), null, new C23336b(this, interfaceC30057d, 1), 2);
        AbstractC3006f0.m8732z(scope, null, null, new C23336b(this, interfaceC30057d, 2), 3);
        AbstractC3006f0.m8732z(scope, null, null, new C0150h(this, interfaceC30057d, 19), 3);
        AbstractC3006f0.m8732z(scope, new C2990b0("init#coordinatorSocket.errors.collect"), null, new C23336b(this, interfaceC30057d, i13), 2);
        AbstractC3006f0.m8732z(scope, new C2990b0("init#coordinatorSocket.connectionState.collect"), null, new C23336b(this, interfaceC30057d, 4), 2);
        AbstractC3006f0.m8732z(scope, null, null, new C23336b(this, interfaceC30057d, 5), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public static final Object m105793k(C33366b4 c33366b4, AbstractC32269c abstractC32269c) {
        C33473w3 c33473w3;
        AbstractC31199g c37972d;
        C33366b4 c33366b5 = c33366b4;
        if (abstractC32269c instanceof C33473w3) {
            c33473w3 = (C33473w3) abstractC32269c;
            int i13 = c33473w3.f139750z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33473w3.f139750z = i13 - Integer.MIN_VALUE;
            } else {
                c33473w3 = new C33473w3(c33366b5, abstractC32269c);
            }
        } else {
            c33473w3 = new C33473w3(c33366b5, abstractC32269c);
        }
        Object objMo31821e = c33473w3.f139748x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33473w3.f139750z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo31821e);
            InterfaceC12744c interfaceC12744c = c33366b5.f139234G;
            if (interfaceC12744c != null) {
                c33473w3.f139747w = c33366b5;
                c33473w3.f139750z = 1;
                objMo31821e = interfaceC12744c.mo31821e(c33473w3);
                if (objMo31821e != enumC31071a) {
                }
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo31821e);
            return c23454a0;
        }
        c33366b5 = c33473w3.f139747w;
        AbstractC34132o.m107864I(objMo31821e);
        String str = (String) objMo31821e;
        c33366b5.f139232E.m124885b(str);
        C2345k c2345kM105799q = c33366b5.m105799q();
        InterfaceC2339e interfaceC2339e = c2345kM105799q.f9275c;
        String str2 = c2345kM105799q.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM105799q.f9274b.log(enumC2341g, str2, "[refreshToken] Token has been refreshed with: ".concat(str), null);
        }
        C14123k c14123k = c33366b5.f139257d0;
        User userM31011a = c33366b5.f139236I.m31011a();
        c33473w3.f139747w = null;
        c33473w3.f139750z = 2;
        C14122j c14122j = c14123k.f50771i;
        User.Companion.getClass();
        AbstractC22676k.m65750j(userM31011a, "<this>");
        boolean zM65745e = AbstractC22676k.m65745e(userM31011a.getId(), ChatClient.ANONYMOUS_USER_ID);
        String str3 = c14122j.f50747a;
        String str4 = c14122j.f50748b;
        C2345k c2345kM40215f = c14122j.m40215f();
        InterfaceC2339e interfaceC2339e2 = c2345kM40215f.f9275c;
        String str5 = c2345kM40215f.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str5)) {
            c2345kM40215f.f9274b.log(enumC2341g, str5, AbstractC26725a.m79503g("[reconnectUser] user.id: ", userM31011a.getId(), ", isAnonymous: ", ", forceReconnection: true", zM65745e), null);
        }
        C20378c c20378c = c14122j.f50758l;
        if (zM65745e) {
            c37972d = new C37970b(str4, str3, userM31011a);
        } else {
            if (zM65745e) {
                throw new NoWhenBranchMatchedException();
            }
            c37972d = new C37972d(str4, str3, userM31011a);
        }
        Object objM56580C = c20378c.m56580C(c37972d, true, c33473w3);
        if (objM56580C != enumC31071a) {
            objM56580C = c23454a0;
        }
        if (objM56580C != enumC31071a) {
            objM56580C = c23454a0;
        }
        return objM56580C == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: l */
    public static final Object m105794l(C33366b4 c33366b4, AbstractC32269c abstractC32269c) {
        C33360a4 c33360a4;
        c33366b4.getClass();
        if (abstractC32269c instanceof C33360a4) {
            c33360a4 = (C33360a4) abstractC32269c;
            int i13 = c33360a4.f139212z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33360a4.f139212z = i13 - Integer.MIN_VALUE;
            } else {
                c33360a4 = new C33360a4(c33366b4, abstractC32269c);
            }
        } else {
            c33360a4 = new C33360a4(c33366b4, abstractC32269c);
        }
        Object objM8750d = c33360a4.f139210x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33360a4.f139212z;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8750d);
            C23336b c23336b = new C23336b(c33366b4, interfaceC30057d, 7);
            c33360a4.f139209w = c33366b4;
            c33360a4.f139212z = 1;
            objM8750d = AbstractC3028k2.m8750d(5000L, c23336b, c33360a4);
            if (objM8750d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33366b4 = c33360a4.f139209w;
            AbstractC34132o.m107864I(objM8750d);
        }
        String str = (String) objM8750d;
        C2345k c2345kM105799q = c33366b4.m105799q();
        InterfaceC2339e interfaceC2339e = c2345kM105799q.f9275c;
        String str2 = c2345kM105799q.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM105799q.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[waitForConnectionId]: ", str), null);
        }
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: a */
    public final Notification mo43670a(StreamCallId callId, String str, boolean z4, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(payload, "payload");
        return this.f139235H.mo43670a(callId, str, z4, payload);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: b */
    public final void mo43671b(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f139235H.mo43671b(callId, callDisplayName, payload);
    }

    @Override // e43.InterfaceC12716h
    /* JADX INFO: renamed from: c */
    public final C11457j mo35558c() {
        return this.f139235H.f64769z.mo35558c();
    }

    @Override // g43.InterfaceC15481r
    /* JADX INFO: renamed from: e */
    public final Object mo43672e(C33368c0 c33368c0, C26288d c26288d) {
        return this.f139235H.f64769z.mo43672e(c33368c0, c26288d);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: f */
    public final void mo43673f(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f139235H.mo43673f(callId, callDisplayName, payload);
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: g */
    public final Notification mo43674g(InterfaceC33377d3 interfaceC33377d3, StreamCallId streamCallId, String str, boolean z4, Map map) {
        return this.f139235H.f64769z.mo43674g(interfaceC33377d3, streamCallId, str, z4, C25272z.f99163w);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: h */
    public final void mo43675h(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f139235H.mo43675h(callId, callDisplayName, payload);
    }

    @Override // g43.InterfaceC15478o
    /* JADX INFO: renamed from: i */
    public final void mo43676i(StreamCallId callId, String callDisplayName, Map payload) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callDisplayName, "callDisplayName");
        AbstractC22676k.m65750j(payload, "payload");
        this.f139235H.mo43676i(callId, callDisplayName, payload);
    }

    @Override // g43.InterfaceC15479p
    /* JADX INFO: renamed from: j */
    public final Notification mo43677j(String str, StreamCallId streamCallId) {
        return this.f139235H.f64769z.mo43677j(str, streamCallId);
    }

    /* JADX INFO: renamed from: m */
    public final Object m105795m(Function1 function1, InterfaceC30057d interfaceC30057d) {
        return AbstractC35902e.m113954Y(new C0351c(this, function1, (InterfaceC30057d) null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: n */
    public final C33368c0 m105796n(String type, String id4) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        if (id4.length() == 0) {
            id4 = AbstractC11895b.m31995n("toString(...)");
        }
        String strM53370k = AbstractC18489d0.m53370k(type, ":", id4);
        LinkedHashMap linkedHashMap = this.f139253Z;
        if (linkedHashMap.containsKey(strM53370k)) {
            Object obj = linkedHashMap.get(strM53370k);
            AbstractC22676k.m65747g(obj);
            return (C33368c0) obj;
        }
        C33368c0 c33368c0 = new C33368c0(this, type, id4, this.f139236I.m31011a());
        linkedHashMap.put(strM53370k, c33368c0);
        return c33368c0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m105797o(VideoEvent event, String cid) {
        C33368c0 c33368c0;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(cid, "cid");
        C2345k c2345kM105799q = m105799q();
        InterfaceC2339e interfaceC2339e = c2345kM105799q.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM105799q.f9273a)) {
            c2345kM105799q.f9274b.log(enumC2341g, c2345kM105799q.f9273a, "Event received " + event, null);
        }
        boolean z4 = event instanceof CallRingEvent;
        if (z4) {
            C11585c c11585c = this.f139249V;
            c11585c.getClass();
            String callCid = ((CallRingEvent) event).getCallCid();
            EnumC11579a enumC11579a = EnumC11579a.f37356w;
            c11585c.getClass();
            AbstractC22676k.m65750j(callCid, "callCid");
        }
        C33391g1 c33391g1 = this.f139248U;
        C33366b4 c33366b4 = c33391g1.f139398a;
        if (event instanceof ConnectedEvent) {
            C13045h2 c13045h2 = c33391g1.f139401d;
            C33396h1 c33396h1 = C33396h1.f139459a;
            c13045h2.getClass();
            c13045h2.m36571k(null, c33396h1);
        } else if (event instanceof CallCreatedEvent) {
            List listM125906y0 = AbstractC39414r.m125906y0(((CallCreatedEvent) event).getCallCid(), new String[]{":"}, 6);
            c33366b4.m105796n((String) listM125906y0.get(0), (String) listM125906y0.get(1));
        } else if (z4) {
            List listM125906y1 = AbstractC39414r.m125906y0(((CallRingEvent) event).getCallCid(), new String[]{":"}, 6);
            C33368c0 c33368c0M105796n = c33366b4.m105796n((String) listM125906y1.get(0), (String) listM125906y1.get(1));
            C13045h2 c13045h3 = c33391g1.f139402e;
            c13045h3.getClass();
            c13045h3.m36571k(null, c33368c0M105796n);
        }
        if (cid.length() <= 0) {
            WSCallEvent wSCallEvent = event instanceof WSCallEvent ? (WSCallEvent) event : null;
            cid = wSCallEvent != null ? wSCallEvent.getCallCID() : null;
            if (cid == null) {
                cid = "";
            }
        }
        for (C33446r1 c33446r1 : this.f139252Y) {
            c33446r1.getClass();
            c33446r1.f139603a.m93345b(event);
        }
        if (cid.length() == 0) {
            return;
        }
        C33368c0 c33368c1 = (C33368c0) this.f139253Z.get(cid);
        if (c33368c1 != null) {
            c33368c1.m105812c(event);
        }
        try {
            Iterator it = this.f139254a0.m7h().entrySet().iterator();
            while (it.hasNext()) {
                C33368c0 c33368c2 = (C33368c0) ((Map.Entry) it.next()).getValue();
                if (event instanceof WSCallEvent ? AbstractC22676k.m65745e(((WSCallEvent) event).getCallCID(), c33368c2.f139308v) : true) {
                    c33368c2.m105812c(event);
                }
            }
        } catch (Exception e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
            }
        }
        if ((event instanceof CallAcceptedEvent) && (c33368c0 = (C33368c0) this.f139248U.f139404g.getValue()) != null) {
            InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) c33368c0.f139302p.f139618G.getValue();
            boolean z13 = (interfaceC33377d3 instanceof C33359a3) || AbstractC22676k.m65745e(interfaceC33377d3, C33482y2.f139792a);
            boolean zM65745e = AbstractC22676k.m65745e(c33368c0.f139308v, ((CallAcceptedEvent) event).getCallCid());
            if (z13 && !zM65745e) {
                return;
            }
        }
        C33368c0 c33368c3 = (C33368c0) this.f139253Z.get(cid);
        if (c33368c3 != null) {
            c33368c3.f139302p.m105864f(event);
            C11602h1 c11602h1 = (C11602h1) c33368c3.f139268C.getValue();
            if (c11602h1 != null) {
                C2345k c2345kM31043s = c11602h1.m31043s();
                InterfaceC2339e interfaceC2339e3 = c2345kM31043s.f9275c;
                EnumC2341g enumC2341g3 = EnumC2341g.INFO;
                if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM31043s.f9273a)) {
                    c2345kM31043s.f9274b.log(enumC2341g3, c2345kM31043s.f9273a, "[rtc handleEvent] #sfu; event: " + event, null);
                }
                if (event instanceof AbstractC35638w) {
                    AbstractC3006f0.m8732z(c11602h1.f37448j, null, null, new C0109h(c11602h1, event, interfaceC30057d, 12), 3);
                }
            }
            c33368c3.m105820k(event);
        }
        try {
            Iterator it3 = this.f139254a0.m7h().entrySet().iterator();
            while (it3.hasNext()) {
                C33368c0 c33368c4 = (C33368c0) ((Map.Entry) it3.next()).getValue();
                if (event instanceof WSCallEvent ? AbstractC22676k.m65745e(((WSCallEvent) event).getCallCID(), c33368c4.f139308v) : true) {
                    c33368c4.f139302p.m105864f(event);
                    c33368c4.m105820k(event);
                }
            }
        } catch (Exception e13) {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e4 = C2343i.f9272d;
            EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g4, "SafeCall")) {
                C2343i.f9271c.log(enumC2341g4, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e13.getMessage()), e13);
            }
        }
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionDenied() {
        this.f139235H.onPermissionDenied();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionGranted() {
        this.f139235H.onPermissionGranted();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRationale() {
        this.f139235H.onPermissionRationale();
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRequested() {
        this.f139235H.onPermissionRequested();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m105798p(AbstractC32269c abstractC32269c) {
        C33448r3 c33448r3;
        C33366b4 c33366b4;
        if (abstractC32269c instanceof C33448r3) {
            c33448r3 = (C33448r3) abstractC32269c;
            int i13 = c33448r3.f139608z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33448r3.f139608z = i13 - Integer.MIN_VALUE;
            } else {
                c33448r3 = new C33448r3(this, abstractC32269c);
            }
        } else {
            c33448r3 = new C33448r3(this, abstractC32269c);
        }
        Object obj = c33448r3.f139606x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33448r3.f139608z;
        InterfaceC30057d interfaceC30057d = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C3022j0 c3022j0M8711e = this.f139247T;
            if (c3022j0M8711e == null) {
                c3022j0M8711e = AbstractC3006f0.m8711e(this.f139260x, null, new C23336b(this, interfaceC30057d, 6), 3);
                this.f139247T = c3022j0M8711e;
            }
            c33448r3.f139605w = this;
            c33448r3.f139608z = 1;
            if (c3022j0M8711e.join(c33448r3) != enumC31071a) {
                c33366b4 = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        c33366b4 = c33448r3.f139605w;
        AbstractC34132o.m107864I(obj);
        String str = c33366b4.f139258e0;
        if (str != null) {
            return new C26204g(str);
        }
        c33448r3.f139605w = null;
        c33448r3.f139608z = 2;
        Object objM105805w = c33366b4.m105805w(c33448r3);
        return objM105805w == enumC31071a ? enumC31071a : objM105805w;
    }

    /* JADX INFO: renamed from: q */
    public final C2345k m105799q() {
        return (C2345k) this.f139251X.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final String m105800r() {
        return this.f139236I.m31011a().getId();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final Object m105801s(String str, String str2, boolean z4, ArrayList arrayList, Map map, CallSettingsRequest callSettingsRequest, C21682i c21682i, String str3, boolean z13, boolean z14, String str4, String str5, List list, Boolean bool, AbstractC32269c abstractC32269c) {
        C33458t3 c33458t3;
        if (abstractC32269c instanceof C33458t3) {
            c33458t3 = (C33458t3) abstractC32269c;
            int i13 = c33458t3.f139714y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33458t3.f139714y = i13 - Integer.MIN_VALUE;
            } else {
                c33458t3 = new C33458t3(this, abstractC32269c);
            }
        } else {
            c33458t3 = new C33458t3(this, abstractC32269c);
        }
        Object objM105795m = c33458t3.f139712w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c33458t3.f139714y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM105795m);
            CallRequest callRequest = new CallRequest(null, c21682i, str3, null, arrayList, map, callSettingsRequest, 9, null);
            Object[] objArr = 0 == true ? 1 : 0;
            Function1 c33463u3 = new C33463u3(this, str, str2, new JoinCallRequest(str4, Boolean.valueOf(z4), bool, objArr, str5, Boolean.valueOf(z14), Boolean.valueOf(z13), null, list, callRequest, 136, null), null, 0);
            c33458t3.f139714y = 1;
            objM105795m = m105795m(c33463u3, c33458t3);
            if (objM105795m == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM105795m);
        }
        return (AbstractC26205h) objM105795m;
    }

    /* JADX INFO: renamed from: t */
    public final void m105802t(C33368c0 c33368c0) {
        String str = c33368c0.f139308v;
        C2345k c2345kM105799q = m105799q();
        InterfaceC2339e interfaceC2339e = c2345kM105799q.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = c2345kM105799q.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345kM105799q.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[cleanup] Removing call from cache: ", str), null);
        }
        this.f139253Z.remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: u */
    public final Object m105803u(Map map, List list, int i13, boolean z4, AbstractC32269c abstractC32269c) {
        C33468v3 c33468v3;
        Map map2;
        boolean z13;
        C33366b4 c33366b4;
        if (abstractC32269c instanceof C33468v3) {
            c33468v3 = (C33468v3) abstractC32269c;
            int i14 = c33468v3.f139743z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c33468v3.f139743z = i14 - Integer.MIN_VALUE;
            } else {
                c33468v3 = new C33468v3(this, abstractC32269c);
            }
        } else {
            c33468v3 = new C33468v3(this, abstractC32269c);
        }
        Object objM105795m = c33468v3.f139741x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c33468v3.f139743z;
        String str = "<this>";
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM105795m);
            C2345k c2345kM105799q = m105799q();
            InterfaceC2339e interfaceC2339e = c2345kM105799q.f9275c;
            String str2 = c2345kM105799q.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                InterfaceC2344j interfaceC2344j = c2345kM105799q.f9274b;
                StringBuilder sb4 = new StringBuilder("[queryCalls] filters: ");
                map2 = map;
                sb4.append(map2);
                sb4.append(", sort: ");
                sb4.append(list);
                sb4.append(", limit: ");
                sb4.append(i13);
                sb4.append(", watch: ");
                z13 = z4;
                sb4.append(z13);
                interfaceC2344j.log(enumC2341g, str2, sb4.toString(), null);
            } else {
                map2 = map;
                z13 = z4;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC22676k.m65750j((C4205u) it.next(), "<this>");
                arrayList.add(new SortParamRequest(1, "cid", null, 4, null));
            }
            C0071f c0071f = new C0071f(this, new QueryCallsRequest(new Integer(i13), null, null, Boolean.valueOf(z13), arrayList, map2), null);
            c33468v3.f139740w = this;
            c33468v3.f139743z = 1;
            objM105795m = m105795m(c0071f, c33468v3);
            if (objM105795m == enumC31071a) {
                return enumC31071a;
            }
            c33366b4 = this;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33366b4 = c33468v3.f139740w;
            AbstractC34132o.m107864I(objM105795m);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM105795m;
        boolean z14 = abstractC26205h instanceof C26204g;
        if (z14) {
            for (CallStateResponseFields callStateResponseFields : ((QueryCallsResponse) ((C26204g) abstractC26205h).f103919a).getCalls()) {
                C33450s0 c33450s0 = c33366b4.m105796n(callStateResponseFields.getCall().getType(), callStateResponseFields.getCall().getId()).f139302p;
                c33450s0.getClass();
                c33450s0.m105866h(callStateResponseFields.getCall());
                c33450s0.f139623L.m36570j(callStateResponseFields.getOwnCapabilities());
                c33450s0.m105861c(callStateResponseFields.getMembers());
            }
        }
        if (!z14) {
            if (abstractC26205h instanceof C26203f) {
                return abstractC26205h;
            }
            throw new NoWhenBranchMatchedException();
        }
        QueryCallsResponse queryCallsResponse = (QueryCallsResponse) ((C26204g) abstractC26205h).f103919a;
        AbstractC22676k.m65750j(queryCallsResponse, "<this>");
        List<CallStateResponseFields> calls = queryCallsResponse.getCalls();
        AbstractC22676k.m65750j(calls, "<this>");
        List<CallStateResponseFields> list3 = calls;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (CallStateResponseFields callStateResponseFields2 : list3) {
            AbstractC22676k.m65750j(callStateResponseFields2, str);
            List<String> blockedUserIds = callStateResponseFields2.getCall().getBlockedUserIds();
            CallResponse call = callStateResponseFields2.getCall();
            AbstractC22676k.m65750j(call, str);
            String str3 = str;
            C4187c c4187c = new C4187c(call.getCid(), call.getType(), call.getId(), call.getCreatedBy().getId(), call.getSettings().getBroadcasting().getEnabled(), call.getSettings().getRecording().getAudioOnly(), new Date(call.getCreatedAt().toEpochSecond() * 1000), new Date(call.getUpdatedAt().toEpochSecond() * 1000), call.getCustom());
            List<MemberResponse> members = callStateResponseFields2.getMembers();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(members, 10));
            Iterator<T> it3 = members.iterator();
            while (it3.hasNext()) {
                arrayList3.add(AbstractC35903f.m114000T((MemberResponse) it3.next()));
            }
            MemberResponse membership = callStateResponseFields2.getMembership();
            arrayList2.add(new C4186b(blockedUserIds, c4187c, arrayList3, membership != null ? AbstractC35903f.m114000T(membership) : null));
            str = str3;
        }
        return new C26204g(new C4197m(arrayList2, queryCallsResponse, queryCallsResponse.getNext(), queryCallsResponse.getPrev()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r9.m8817m(r0) == r1) goto L48;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m105804v(s83.AbstractC32269c r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33366b4.m105804v(s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (bc3.AbstractC3034m0.m8782b(100, r0) == r1) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m105805w(s83.AbstractC32269c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof t23.C33483y3
            if (r0 == 0) goto L13
            r0 = r11
            t23.y3 r0 = (t23.C33483y3) r0
            int r1 = r0.f139794F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f139794F = r1
            goto L18
        L13:
            t23.y3 r0 = new t23.y3
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f139798z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f139794F
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            int r2 = r0.f139797y
            n23.h r6 = r0.f139796x
            t23.b4 r7 = r0.f139795w
            p505ts.AbstractC34132o.m107864I(r11)
        L30:
            r11 = r2
            r2 = r7
            goto L8b
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            int r2 = r0.f139797y
            t23.b4 r6 = r0.f139795w
            p505ts.AbstractC34132o.m107864I(r11)
            r7 = r6
            goto L69
        L44:
            p505ts.AbstractC34132o.m107864I(r11)
            r11 = 0
            r2 = r10
        L49:
            if (r11 >= r3) goto L8e
            int r11 = r11 + 1
            r0.f139795w = r2
            r6 = 0
            r0.f139796x = r6
            r0.f139797y = r11
            r0.f139794F = r5
            r2.getClass()
            t23.q3 r7 = new t23.q3
            r8 = 0
            r7.<init>(r2, r6, r8)
            java.lang.Object r6 = r2.m105795m(r7, r0)
            if (r6 != r1) goto L66
            goto L8a
        L66:
            r7 = r2
            r2 = r11
            r11 = r6
        L69:
            r6 = r11
            n23.h r6 = (n23.AbstractC26205h) r6
            boolean r11 = r6 instanceof n23.C26204g
            if (r11 == 0) goto L7a
            r11 = r6
            n23.g r11 = (n23.C26204g) r11
            java.lang.Object r11 = r11.f103919a
            java.lang.String r11 = (java.lang.String) r11
            r7.f139258e0 = r11
            return r6
        L7a:
            r0.f139795w = r7
            r0.f139796x = r6
            r0.f139797y = r2
            r0.f139794F = r4
            r8 = 100
            java.lang.Object r11 = bc3.AbstractC3034m0.m8782b(r8, r0)
            if (r11 != r1) goto L30
        L8a:
            return r1
        L8b:
            if (r11 != r3) goto L49
            return r6
        L8e:
            n23.f r11 = new n23.f
            n23.a r0 = new n23.a
            java.lang.String r1 = "failed to select location"
            r0.<init>(r1)
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33366b4.m105805w(s83.c):java.lang.Object");
    }
}
