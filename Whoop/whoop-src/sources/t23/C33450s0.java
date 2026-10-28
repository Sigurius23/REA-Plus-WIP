package t23;

import a13.C0150h;
import a30.C0332w0;
import android.app.Notification;
import androidx.room.AbstractC1772c1;
import aq0.C1898i;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.InterfaceC3027k1;
import c43.AbstractC4192h;
import c43.C4193i;
import c43.C4194j;
import c43.C4195k;
import c43.C4196l;
import c43.C4199o;
import c43.C4200p;
import c43.C4201q;
import c43.C4202r;
import c43.C4203s;
import c43.C4204t;
import c53.AbstractC4257c;
import com.squareup.wire.AbstractC5583n;
import cz.C11194d;
import d33.AbstractC11591e;
import d33.C11588d;
import d33.C11629t0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13081r1;
import ec3.C13084s1;
import ec3.C13105z1;
import f53.C14117e;
import hc3.C17171d;
import i20.C17972q0;
import io.getstream.android.video.generated.models.BlockedUserEvent;
import io.getstream.android.video.generated.models.CallAcceptedEvent;
import io.getstream.android.video.generated.models.CallClosedCaptionsStartedEvent;
import io.getstream.android.video.generated.models.CallClosedCaptionsStoppedEvent;
import io.getstream.android.video.generated.models.CallCreatedEvent;
import io.getstream.android.video.generated.models.CallEndedEvent;
import io.getstream.android.video.generated.models.CallLiveStartedEvent;
import io.getstream.android.video.generated.models.CallMemberAddedEvent;
import io.getstream.android.video.generated.models.CallMemberRemovedEvent;
import io.getstream.android.video.generated.models.CallMemberUpdatedEvent;
import io.getstream.android.video.generated.models.CallMemberUpdatedPermissionEvent;
import io.getstream.android.video.generated.models.CallMissedEvent;
import io.getstream.android.video.generated.models.CallModerationBlurEvent;
import io.getstream.android.video.generated.models.CallParticipantResponse;
import io.getstream.android.video.generated.models.CallReactionEvent;
import io.getstream.android.video.generated.models.CallRecordingStartedEvent;
import io.getstream.android.video.generated.models.CallRecordingStoppedEvent;
import io.getstream.android.video.generated.models.CallRejectedEvent;
import io.getstream.android.video.generated.models.CallResponse;
import io.getstream.android.video.generated.models.CallRingEvent;
import io.getstream.android.video.generated.models.CallSessionEndedEvent;
import io.getstream.android.video.generated.models.CallSessionParticipantCountsUpdatedEvent;
import io.getstream.android.video.generated.models.CallSessionParticipantJoinedEvent;
import io.getstream.android.video.generated.models.CallSessionParticipantLeftEvent;
import io.getstream.android.video.generated.models.CallSessionResponse;
import io.getstream.android.video.generated.models.CallSessionStartedEvent;
import io.getstream.android.video.generated.models.CallTranscriptionFailedEvent;
import io.getstream.android.video.generated.models.CallTranscriptionStartedEvent;
import io.getstream.android.video.generated.models.CallTranscriptionStoppedEvent;
import io.getstream.android.video.generated.models.CallUpdatedEvent;
import io.getstream.android.video.generated.models.ClosedCaptionEvent;
import io.getstream.android.video.generated.models.ConnectedEvent;
import io.getstream.android.video.generated.models.CustomVideoEvent;
import io.getstream.android.video.generated.models.HealthCheckEvent;
import io.getstream.android.video.generated.models.LocalCallAcceptedPostEvent;
import io.getstream.android.video.generated.models.LocalCallMissedEvent;
import io.getstream.android.video.generated.models.LocalCallRejectedPostEvent;
import io.getstream.android.video.generated.models.MemberResponse;
import io.getstream.android.video.generated.models.PermissionRequestEvent;
import io.getstream.android.video.generated.models.ThumbnailResponse;
import io.getstream.android.video.generated.models.UnblockedUserEvent;
import io.getstream.android.video.generated.models.UpdatedCallPermissionsEvent;
import io.getstream.android.video.generated.models.UserResponse;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.video.android.model.User;
import j53.C21345c;
import j53.C21355m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import jg3.C21676c;
import jg3.C21682i;
import jg3.C21689p;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import n53.C26318e;
import n53.C26324g;
import o53.C27591b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p441qx.C30706d0;
import p450r5.C30929c;
import p507tx.AbstractC34235f;
import p530up.AbstractC35148d;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.time.DurationKt;
import q30.C29934u0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import ro.C31624i;
import s33.C32118c;
import s40.C32139c0;
import stream.video.sfu.event.ConnectionQualityInfo;
import stream.video.sfu.models.ConnectionQuality;
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.ParticipantSource;
import stream.video.sfu.models.Pin;
import stream.video.sfu.models.TrackType;
import t43.C33539a;
import v33.C35614a;
import v33.C35615a0;
import v33.C35616b;
import v33.C35621f;
import v33.C35622g;
import v33.C35623h;
import v33.C35626k;
import v33.C35629n;
import v33.C35630o;
import v33.C35631p;
import v33.C35632q;
import v33.C35634s;
import v33.C35635t;
import v33.C35637v;
import v33.C35640y;
import v33.C35641z;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: t23.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33450s0 {

    /* JADX INFO: renamed from: A */
    public final C13045h2 f139610A;

    /* JADX INFO: renamed from: A0 */
    public final C23470p f139611A0;

    /* JADX INFO: renamed from: B */
    public final C13045h2 f139612B;

    /* JADX INFO: renamed from: B0 */
    public final AtomicBoolean f139613B0;

    /* JADX INFO: renamed from: C */
    public final C13045h2 f139614C;

    /* JADX INFO: renamed from: D */
    public final C13045h2 f139615D;

    /* JADX INFO: renamed from: E */
    public final C13045h2 f139616E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f139617F;

    /* JADX INFO: renamed from: G */
    public final C13045h2 f139618G;

    /* JADX INFO: renamed from: H */
    public final ConcurrentHashMap.KeySetView f139619H;

    /* JADX INFO: renamed from: I */
    public final C13045h2 f139620I;

    /* JADX INFO: renamed from: J */
    public final C13045h2 f139621J;

    /* JADX INFO: renamed from: K */
    public final C13081r1 f139622K;

    /* JADX INFO: renamed from: L */
    public final C13045h2 f139623L;

    /* JADX INFO: renamed from: M */
    public final C13045h2 f139624M;

    /* JADX INFO: renamed from: N */
    public final C13045h2 f139625N;

    /* JADX INFO: renamed from: O */
    public final C13045h2 f139626O;

    /* JADX INFO: renamed from: P */
    public final C13045h2 f139627P;

    /* JADX INFO: renamed from: Q */
    public final C13045h2 f139628Q;

    /* JADX INFO: renamed from: R */
    public final C13045h2 f139629R;

    /* JADX INFO: renamed from: S */
    public final C13045h2 f139630S;

    /* JADX INFO: renamed from: T */
    public final C13045h2 f139631T;

    /* JADX INFO: renamed from: U */
    public final C13045h2 f139632U;

    /* JADX INFO: renamed from: V */
    public final C13045h2 f139633V;

    /* JADX INFO: renamed from: W */
    public final C13045h2 f139634W;

    /* JADX INFO: renamed from: X */
    public final C13045h2 f139635X;

    /* JADX INFO: renamed from: Y */
    public final C13045h2 f139636Y;

    /* JADX INFO: renamed from: Z */
    public final C13045h2 f139637Z;

    /* JADX INFO: renamed from: a */
    public final C33366b4 f139638a;

    /* JADX INFO: renamed from: a0 */
    public final C13045h2 f139639a0;

    /* JADX INFO: renamed from: b */
    public final C33368c0 f139640b;

    /* JADX INFO: renamed from: b0 */
    public final C13045h2 f139641b0;

    /* JADX INFO: renamed from: c */
    public final User f139642c;

    /* JADX INFO: renamed from: c0 */
    public final C13045h2 f139643c0;

    /* JADX INFO: renamed from: d */
    public final C17171d f139644d;

    /* JADX INFO: renamed from: d0 */
    public final C13045h2 f139645d0;

    /* JADX INFO: renamed from: e */
    public final C23470p f139646e;

    /* JADX INFO: renamed from: e0 */
    public final C13045h2 f139647e0;

    /* JADX INFO: renamed from: f */
    public final C29934u0 f139648f;

    /* JADX INFO: renamed from: f0 */
    public final C13045h2 f139649f0;

    /* JADX INFO: renamed from: g */
    public final C13045h2 f139650g;

    /* JADX INFO: renamed from: g0 */
    public final C13045h2 f139651g0;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f139652h;

    /* JADX INFO: renamed from: h0 */
    public final C13045h2 f139653h0;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f139654i;

    /* JADX INFO: renamed from: i0 */
    public final C26318e f139655i0;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f139656j;

    /* JADX INFO: renamed from: j0 */
    public final C13045h2 f139657j0;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f139658k;

    /* JADX INFO: renamed from: k0 */
    public final C13045h2 f139659k0;

    /* JADX INFO: renamed from: l */
    public final C13045h2 f139660l;

    /* JADX INFO: renamed from: l0 */
    public final C13045h2 f139661l0;

    /* JADX INFO: renamed from: m */
    public final C26318e f139662m;

    /* JADX INFO: renamed from: m0 */
    public final C13045h2 f139663m0;

    /* JADX INFO: renamed from: n */
    public final C13045h2 f139664n;

    /* JADX INFO: renamed from: n0 */
    public final C13045h2 f139665n0;

    /* JADX INFO: renamed from: o */
    public final C23470p f139666o;

    /* JADX INFO: renamed from: o0 */
    public final C13045h2 f139667o0;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f139668p;

    /* JADX INFO: renamed from: p0 */
    public final C13045h2 f139669p0;

    /* JADX INFO: renamed from: q */
    public final C13045h2 f139670q;

    /* JADX INFO: renamed from: q0 */
    public C2996c2 f139671q0;

    /* JADX INFO: renamed from: r */
    public final C0332w0 f139672r;

    /* JADX INFO: renamed from: r0 */
    public C2996c2 f139673r0;

    /* JADX INFO: renamed from: s */
    public final C33455t0 f139674s;

    /* JADX INFO: renamed from: s0 */
    public C2996c2 f139675s0;

    /* JADX INFO: renamed from: t */
    public final C17972q0 f139676t;

    /* JADX INFO: renamed from: t0 */
    public final C32118c f139677t0;

    /* JADX INFO: renamed from: u */
    public final C26324g f139678u;

    /* JADX INFO: renamed from: u0 */
    public final C31624i f139679u0;

    /* JADX INFO: renamed from: v */
    public final C21355m f139680v;

    /* JADX INFO: renamed from: v0 */
    public final ConcurrentHashMap f139681v0;

    /* JADX INFO: renamed from: w */
    public final C13045h2 f139682w;

    /* JADX INFO: renamed from: w0 */
    public final AtomicReference f139683w0;

    /* JADX INFO: renamed from: x */
    public final C26318e f139684x;

    /* JADX INFO: renamed from: x0 */
    public final C13045h2 f139685x0;

    /* JADX INFO: renamed from: y */
    public final C13045h2 f139686y;

    /* JADX INFO: renamed from: y0 */
    public final C13045h2 f139687y0;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f139688z;

    /* JADX INFO: renamed from: z0 */
    public final C33384f f139689z0;

    public C33450s0(C33366b4 c33366b4, C33368c0 c33368c0, User user, C17171d c17171d) {
        Object next;
        AbstractC22676k.m65750j(user, "user");
        this.f139638a = c33366b4;
        this.f139640b = c33368c0;
        this.f139642c = user;
        this.f139644d = c17171d;
        this.f139646e = AbstractC1772c1.m5382S(this, "CallState");
        this.f139648f = new C29934u0(this, 19);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C33427n2.f139556a);
        this.f139650g = c13045h2M36593c;
        this.f139652h = c13045h2M36593c;
        AbstractC37926s0.m121484x(c13045h2M36593c, C33415l0.f139518E);
        this.f139654i = new ConcurrentHashMap();
        C25272z c25272z = C25272z.f99163w;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(c25272z);
        this.f139656j = c13045h2M36593c2;
        InterfaceC30057d interfaceC30057d = null;
        this.f139658k = AbstractC13091v.m36593c(null);
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(null);
        this.f139660l = c13045h2M36593c3;
        AbstractC37926s0.m121484x(c13045h2M36593c3, C33415l0.f139522I);
        int i13 = 1;
        this.f139662m = AbstractC37926s0.m121484x(c13045h2M36593c2, new C33440q0(this, i13));
        C25271y c25271y = C25271y.f99162w;
        this.f139664n = AbstractC13091v.m36593c(c25271y);
        this.f139666o = AbstractC30060g.m92088H(new C33425n0(this, 3));
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(null);
        this.f139668p = c13045h2M36593c4;
        this.f139670q = c13045h2M36593c4;
        C0332w0 c0332w0 = new C0332w0(new C33425n0(this, 2));
        this.f139672r = c0332w0;
        C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(new C13060l1((C13045h2) c0332w0.f1164E, (C13045h2) c0332w0.f1166G, new C33420m0(3, null), 1), c17171d, C13105z1.f45288a, c25272z);
        AbstractC37926s0.m121484x(c13081r1M36587M, C33415l0.f139533x);
        this.f139674s = new C33455t0(c33368c0, c17171d);
        this.f139676t = new C17972q0();
        this.f139678u = new C26324g(new C33425n0(this, 1));
        AbstractC13091v.m36587M(AbstractC13091v.m36608r(AbstractC13091v.m36602l(new C33410k0(this, interfaceC30057d, 2)), 1000L), c17171d, C13105z1.m36630a(2, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT), null);
        String name = c33368c0.f139288b;
        AbstractC22676k.m65750j(name, "name");
        int i14 = 0;
        Iterator it = AbstractC37056f.m118959K(C11588d.f37382g, C11588d.f37380e, C11588d.f37379d, C11588d.f37381f, C11588d.f37378c).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((AbstractC11591e) next).f37389a.equals(name));
        AbstractC11591e abstractC11591e = (AbstractC11591e) next;
        C21355m c21355m = new C21355m(c17171d, c33368c0, c13045h2M36593c2, c13081r1M36587M, abstractC11591e != null ? abstractC11591e.mo31012a() : C21345c.f81663a);
        this.f139680v = c21355m;
        C13045h2 c13045h2M36593c5 = AbstractC13091v.m36593c(AbstractC25247g0.m74005n0(c25272z));
        this.f139682w = c13045h2M36593c5;
        this.f139684x = AbstractC37926s0.m121484x(c13045h2M36593c5, C33415l0.f139521H);
        this.f139686y = AbstractC13091v.m36593c(null);
        Boolean bool = Boolean.FALSE;
        this.f139688z = AbstractC13091v.m36593c(bool);
        this.f139610A = AbstractC13091v.m36593c(bool);
        this.f139612B = AbstractC13091v.m36593c(bool);
        this.f139614C = AbstractC13091v.m36593c(bool);
        this.f139615D = AbstractC13091v.m36593c(bool);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.f139616E = AbstractC13091v.m36593c(c25235a0);
        C13045h2 c13045h2M36593c6 = AbstractC13091v.m36593c(C33482y2.f139792a);
        this.f139617F = c13045h2M36593c6;
        this.f139618G = c13045h2M36593c6;
        ConcurrentHashMap.KeySetView previousRingingStates = ConcurrentHashMap.newKeySet();
        this.f139619H = previousRingingStates;
        C13045h2 c13045h2M36593c7 = AbstractC13091v.m36593c(null);
        this.f139620I = c13045h2M36593c7;
        this.f139621J = c13045h2M36593c7;
        C13084s1 c13084s1 = new C13084s1(new C33410k0(this, interfaceC30057d, i14));
        this.f139622K = AbstractC13091v.m36587M(new C13084s1(new C32139c0(c13084s1, interfaceC30057d, 8)), c17171d, C13105z1.m36630a(2, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT), null);
        AbstractC37926s0.m121484x(AbstractC13091v.m36587M(c13084s1, c17171d, C13105z1.m36630a(2, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT), null), C33415l0.f139534y);
        C13045h2 c13045h2M36593c8 = AbstractC13091v.m36593c(c25271y);
        this.f139623L = c13045h2M36593c8;
        this.f139624M = c13045h2M36593c8;
        this.f139625N = AbstractC13091v.m36593c(c25271y);
        this.f139626O = AbstractC13091v.m36593c(c25272z);
        C13045h2 c13045h2M36593c9 = AbstractC13091v.m36593c(bool);
        this.f139627P = c13045h2M36593c9;
        this.f139628Q = c13045h2M36593c9;
        AbstractC37926s0.m121484x(c13045h2M36593c9, C33415l0.f139519F);
        AbstractC37926s0.m121484x(AbstractC13091v.m36587M(AbstractC13091v.m36610t(new C13084s1(new C33410k0(this, interfaceC30057d, i13))), c17171d, C13105z1.m36630a(2, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT), null), C33415l0.f139520G);
        C13045h2 c13045h2M36593c10 = AbstractC13091v.m36593c(null);
        this.f139629R = c13045h2M36593c10;
        AbstractC37926s0.m121484x(c13045h2M36593c10, C33415l0.f139535z);
        this.f139630S = AbstractC13091v.m36593c(bool);
        this.f139631T = AbstractC13091v.m36593c(bool);
        C13045h2 c13045h2M36593c11 = AbstractC13091v.m36593c(c25235a0);
        this.f139632U = c13045h2M36593c11;
        this.f139633V = c13045h2M36593c11;
        this.f139634W = AbstractC13091v.m36593c(c25235a0);
        AbstractC13091v.m36593c(null);
        C13045h2 c13045h2M36593c12 = AbstractC13091v.m36593c(null);
        this.f139635X = c13045h2M36593c12;
        this.f139636Y = c13045h2M36593c12;
        this.f139637Z = AbstractC13091v.m36593c(null);
        this.f139639a0 = AbstractC13091v.m36593c(null);
        this.f139641b0 = AbstractC13091v.m36593c(null);
        this.f139643c0 = AbstractC13091v.m36593c(c25271y);
        this.f139645d0 = AbstractC13091v.m36593c(c25272z);
        this.f139647e0 = AbstractC13091v.m36593c(null);
        C13045h2 c13045h2M36593c13 = AbstractC13091v.m36593c(null);
        this.f139649f0 = c13045h2M36593c13;
        this.f139651g0 = c13045h2M36593c13;
        C13045h2 c13045h2M36593c14 = AbstractC13091v.m36593c(null);
        this.f139653h0 = c13045h2M36593c14;
        AbstractC37926s0.m121484x(c13045h2M36593c14, new C33440q0(this, 0));
        this.f139655i0 = AbstractC37926s0.m121484x(c21355m.f81695j, C33415l0.f139524K);
        new LinkedHashMap();
        this.f139657j0 = AbstractC13091v.m36593c(null);
        this.f139659k0 = AbstractC13091v.m36593c(null);
        this.f139661l0 = AbstractC13091v.m36593c(c25271y);
        C13045h2 c13045h2M36593c15 = AbstractC13091v.m36593c(c25271y);
        this.f139663m0 = c13045h2M36593c15;
        this.f139665n0 = c13045h2M36593c15;
        this.f139667o0 = AbstractC13091v.m36593c(c25272z);
        this.f139669p0 = AbstractC13091v.m36593c(null);
        this.f139677t0 = new C32118c();
        this.f139679u0 = new C31624i(c33368c0, 23);
        this.f139681v0 = new ConcurrentHashMap();
        this.f139683w0 = new AtomicReference(null);
        C13045h2 c13045h2M36593c16 = AbstractC13091v.m36593c(null);
        this.f139685x0 = c13045h2M36593c16;
        this.f139687y0 = c13045h2M36593c16;
        AbstractC22676k.m65749i(previousRingingStates, "previousRingingStates");
        EnumC33372c4 enumC33372c4 = EnumC33372c4.f139322w;
        this.f139689z0 = new C33384f(c17171d, previousRingingStates);
        this.f139611A0 = AbstractC1772c1.m5382S(this, "RingingState");
        this.f139613B0 = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: j */
    public static void m105858j(C33450s0 c33450s0, CallSessionResponse callSessionResponse, C35637v c35637v, int i13) {
        if ((i13 & 1) != 0) {
            callSessionResponse = null;
        }
        if ((i13 & 2) != 0) {
            c35637v = null;
        }
        C13045h2 c13045h2 = c33450s0.f139660l;
        if (c35637v != null) {
            c13045h2.m36570j(c35637v.f151440a);
            return;
        }
        if (callSessionResponse != null) {
            InterfaceC33442q2 interfaceC33442q2 = (InterfaceC33442q2) c33450s0.f139652h.getValue();
            if (interfaceC33442q2 instanceof C33417l2 ? true : interfaceC33442q2 instanceof C33397h2 ? true : interfaceC33442q2 instanceof C33432o2 ? true : interfaceC33442q2 instanceof C33422m2) {
                return;
            }
            C35630o c35630o = new C35630o(callSessionResponse.getAnonymousParticipantCount() + Math.max(AbstractC25265s.m74154v1(callSessionResponse.getParticipantsCountByRole().values()), callSessionResponse.getParticipants().size()), callSessionResponse.getAnonymousParticipantCount());
            c13045h2.getClass();
            c13045h2.m36571k(null, c35630o);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m105859a() {
        C2996c2 c2996c2 = this.f139675s0;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f139675s0 = null;
    }

    /* JADX INFO: renamed from: b */
    public final C2345k m105860b() {
        return (C2345k) this.f139646e.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m105861c(List members) {
        AbstractC22676k.m65750j(members, "members");
        C13045h2 c13045h2 = this.f139682w;
        TreeMap treeMapM74005n0 = AbstractC25247g0.m74005n0((Map) c13045h2.getValue());
        List<MemberResponse> list = members;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (MemberResponse memberResponse : list) {
            String id4 = memberResponse.getUser().getId();
            if (treeMapM74005n0.containsKey(id4)) {
                Object obj = treeMapM74005n0.get(id4);
                AbstractC22676k.m65747g(obj);
            } else {
                treeMapM74005n0.put(id4, new C33486z1(AbstractC35903f.m114002V(memberResponse.getUser()), memberResponse.getCustom(), memberResponse.getRole(), memberResponse.getCreatedAt(), memberResponse.getUpdatedAt(), memberResponse.getDeletedAt(), 192));
            }
            arrayList.add(C23454a0.f92919a);
        }
        c13045h2.getClass();
        c13045h2.m36571k(null, treeMapM74005n0);
        m105868k(null);
    }

    /* JADX INFO: renamed from: d */
    public final C33392g2 m105862d(String sessionId, String userId, ParticipantSource source) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(source, "source");
        ConcurrentHashMap concurrentHashMap = this.f139654i;
        if (!concurrentHashMap.containsKey(sessionId)) {
            return new C33392g2(sessionId, this.f139644d, this.f139648f, userId, source);
        }
        Object obj = concurrentHashMap.get(sessionId);
        AbstractC22676k.m65747g(obj);
        return (C33392g2) obj;
    }

    /* JADX INFO: renamed from: e */
    public final C33392g2 m105863e(Participant participant) {
        AbstractC22676k.m65750j(participant, "participant");
        if (participant.getSession_id().length() == 0) {
            C2345k c2345kM105860b = m105860b();
            InterfaceC2339e interfaceC2339e = c2345kM105860b.f9275c;
            String str = c2345kM105860b.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345kM105860b.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("A user [id:", participant.getUser_id(), "] is in the call with empty session_id"), null);
            }
        }
        C33392g2 c33392g2M105862d = m105862d(participant.getSession_id(), participant.getUser_id(), participant.getSource());
        c33392g2M105862d.m105851b(participant);
        m105869l(AbstractC37056f.m118958J(c33392g2M105862d));
        return c33392g2M105862d;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0151  */
    /* JADX WARN: Type inference failed for: r3v68, types: [c93.a, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: f */
    public final void m105864f(VideoEvent videoEvent) {
        C33392g2 c33392g2;
        C33392g2 c33392g3;
        Object c4196l;
        C33392g2 c33392g4;
        AbstractC34235f abstractC34235f;
        C13045h2 c13045h2 = this.f139625N;
        C13045h2 c13045h3 = this.f139626O;
        C13045h2 c13045h4 = this.f139657j0;
        C13045h2 c13045h5 = this.f139634W;
        C13045h2 c13045h6 = this.f139649f0;
        C13045h2 c13045h7 = this.f139617F;
        C13045h2 c13045h8 = this.f139631T;
        C13045h2 c13045h9 = this.f139636Y;
        C13045h2 c13045h10 = this.f139615D;
        C13045h2 c13045h11 = this.f139614C;
        C13045h2 c13045h12 = this.f139612B;
        C13045h2 c13045h13 = this.f139632U;
        C13045h2 c13045h14 = this.f139682w;
        C33366b4 c33366b4 = this.f139638a;
        C0332w0 c0332w0 = this.f139672r;
        C13045h2 c13045h15 = this.f139616E;
        C13045h2 c13045h16 = this.f139686y;
        C33368c0 c33368c0 = this.f139640b;
        C13045h2 c13045h17 = this.f139635X;
        AbstractC22676k.m65750j(videoEvent, "event");
        C2345k c2345kM105860b = m105860b();
        InterfaceC2339e interfaceC2339e = c2345kM105860b.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, c2345kM105860b.f9273a)) {
            c2345kM105860b.f9274b.log(enumC2341g, c2345kM105860b.f9273a, AbstractC25012a.m73375h(AbstractC25265s.m74112P0(AbstractC39414r.m125906y0(videoEvent.getClass().getName(), new String[]{"."}, 6)), "[handleEvent] "), null);
        }
        if (videoEvent instanceof BlockedUserEvent) {
            Set setM74101H1 = AbstractC25265s.m74101H1((Iterable) c13045h15.getValue());
            setM74101H1.add(((BlockedUserEvent) videoEvent).getUser().getId());
            c13045h15.getClass();
            c13045h15.m36571k(null, setM74101H1);
            return;
        }
        if (videoEvent instanceof C35635t) {
            c0332w0.m844G(((C35635t) videoEvent).f151438a);
            return;
        }
        if (videoEvent instanceof UnblockedUserEvent) {
            Set setM74101H2 = AbstractC25265s.m74101H1((Iterable) c13045h15.getValue());
            setM74101H2.remove(((UnblockedUserEvent) videoEvent).getUser().getId());
            c13045h15.getClass();
            c13045h15.m36571k(null, setM74101H2);
            return;
        }
        int i13 = 3;
        z = true;
        z = true;
        boolean z4 = true;
        if (videoEvent instanceof CallAcceptedEvent) {
            Set setM74101H3 = AbstractC25265s.m74101H1((Iterable) c13045h13.getValue());
            CallAcceptedEvent callAcceptedEvent = (CallAcceptedEvent) videoEvent;
            setM74101H3.add(callAcceptedEvent.getUser().getId());
            Set setM74103I1 = AbstractC25265s.m74103I1(setM74101H3);
            c13045h13.getClass();
            c13045h13.m36571k(null, setM74103I1);
            m105868k(null);
            InterfaceC33377d3 interfaceC33377d3 = (InterfaceC33377d3) c13045h7.getValue();
            if ((interfaceC33377d3 instanceof C33359a3) && ((C33359a3) interfaceC33377d3).f139208a) {
                Object obj = null;
                for (Object obj2 : (Iterable) c13045h13.getValue()) {
                    if (AbstractC22676k.m65745e((String) obj2, c33366b4.m105800r())) {
                        obj = obj2;
                    }
                }
                if (obj == null && c33366b4.f139248U.f139405h.getValue() == null && this.f139673r0 == null) {
                    this.f139673r0 = AbstractC3006f0.m8732z(this.f139644d, null, null, new C33435p0(this, null, true ? 1 : 0), 3);
                } else if (interfaceC33377d3 instanceof C33487z2) {
                    c33368c0.m105823p(new C33390g0(EnumC33393g3.ACCEPTED_ON_OTHER_DEVICE, "accepted-on-another-device"));
                }
            } else if ((interfaceC33377d3 instanceof C33487z2) && AbstractC22676k.m65745e(callAcceptedEvent.getUser().getId(), c33366b4.m105800r())) {
                c33368c0.m105823p(new C33390g0(EnumC33393g3.ACCEPTED_ON_OTHER_DEVICE, "accepted-on-another-device"));
            }
            c33368c0.m105812c(new LocalCallAcceptedPostEvent(callAcceptedEvent.getCallCid(), callAcceptedEvent.getCreatedAt(), callAcceptedEvent.getCall(), callAcceptedEvent.getUser(), callAcceptedEvent.getType()));
            return;
        }
        if (videoEvent instanceof CallMissedEvent) {
            User userM114002V = AbstractC35903f.m114002V(((CallMissedEvent) videoEvent).getCall().getCreatedBy());
            c13045h6.getClass();
            c13045h6.m36571k(null, userM114002V);
            return;
        }
        if (videoEvent instanceof CallRejectedEvent) {
            CallRejectedEvent callRejectedEvent = (CallRejectedEvent) videoEvent;
            User userM114002V2 = AbstractC35903f.m114002V(callRejectedEvent.getCall().getCreatedBy());
            c13045h6.getClass();
            c13045h6.m36571k(null, userM114002V2);
            Set setM74101H4 = AbstractC25265s.m74101H1((Iterable) c13045h5.getValue());
            setM74101H4.add(callRejectedEvent.getUser().getId());
            Set setM74103I2 = AbstractC25265s.m74103I1(setM74101H4);
            c13045h5.getClass();
            c13045h5.m36571k(null, setM74103I2);
            String reason = callRejectedEvent.getReason();
            if (reason != null) {
                AbstractC34235f c4202r = C4200p.f17058a;
                if (!reason.equals("busy")) {
                    c4202r = C4201q.f17059a;
                    if (!reason.equals("cancel")) {
                        c4202r = C4203s.f17061a;
                        if (!reason.equals("decline")) {
                            c4202r = new C4202r(reason);
                        }
                    }
                }
                abstractC34235f = c4202r;
            } else {
                abstractC34235f = null;
            }
            m105868k(abstractC34235f);
            c33368c0.m105812c(new LocalCallRejectedPostEvent(callRejectedEvent.getCallCid(), callRejectedEvent.getCreatedAt(), callRejectedEvent.getCall(), callRejectedEvent.getUser(), callRejectedEvent.getType(), callRejectedEvent.getReason()));
            return;
        }
        if (videoEvent instanceof LocalCallMissedEvent) {
            AbstractC3006f0.m8732z(this.f139644d, null, null, new C0150h(this, null, 18), 3);
            return;
        }
        if (videoEvent instanceof CallEndedEvent) {
            m105859a();
            CallEndedEvent callEndedEvent = (CallEndedEvent) videoEvent;
            m105866h(callEndedEvent.getCall());
            C21689p c21689p = C21689p.f83278F;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C21676c c21676c = C21676c.f83234H;
            C21676c c21676cM60990o0 = C21676c.m60990o0(AbstractC5583n.m16743B(1000, jCurrentTimeMillis) * DurationKt.NANOS_IN_MILLIS, AbstractC5583n.m16742A(jCurrentTimeMillis, 1000L));
            C21682i c21682iM61053q0 = C21682i.m61053q0(c21676cM60990o0, c21689p.mo61071k().mo84265a(c21676cM60990o0));
            c13045h4.getClass();
            c13045h4.m36571k(null, c21682iM61053q0);
            C13045h2 c13045h18 = this.f139659k0;
            UserResponse user = callEndedEvent.getUser();
            c13045h18.m36570j(user != null ? AbstractC35903f.m114002V(user) : null);
            m105868k(null);
            c33368c0.m105823p(new C33374d0(EnumC33389g.CALL_ENDED_EVENT, "CallEndedEvent"));
            return;
        }
        if (videoEvent instanceof C35616b) {
            C21689p c21689p2 = C21689p.f83278F;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C21676c c21676c2 = C21676c.f83234H;
            C21676c c21676cM60990o1 = C21676c.m60990o0(AbstractC5583n.m16743B(1000, jCurrentTimeMillis2) * DurationKt.NANOS_IN_MILLIS, AbstractC5583n.m16742A(jCurrentTimeMillis2, 1000L));
            C21682i c21682iM61053q1 = C21682i.m61053q0(c21676cM60990o1, c21689p2.mo61071k().mo84265a(c21676cM60990o1));
            c13045h4.getClass();
            c13045h4.m36571k(null, c21682iM61053q1);
            c33368c0.m105823p(new C33374d0(EnumC33389g.CALL_ENDED_SFU_EVENT, "CallEndedSfuEvent"));
            return;
        }
        if (videoEvent instanceof CallMemberUpdatedEvent) {
            m105861c(((CallMemberUpdatedEvent) videoEvent).getMembers());
            return;
        }
        if (videoEvent instanceof CallMemberRemovedEvent) {
            TreeMap treeMapM74005n0 = AbstractC25247g0.m74005n0((Map) c13045h14.getValue());
            Iterator<T> it = ((CallMemberRemovedEvent) videoEvent).getMembers().iterator();
            while (it.hasNext()) {
                treeMapM74005n0.remove((String) it.next());
            }
            c13045h14.getClass();
            c13045h14.m36571k(null, treeMapM74005n0);
            return;
        }
        if (videoEvent instanceof CallCreatedEvent) {
            CallCreatedEvent callCreatedEvent = (CallCreatedEvent) videoEvent;
            m105861c(callCreatedEvent.getMembers());
            m105866h(callCreatedEvent.getCall());
            return;
        }
        if (videoEvent instanceof CallRingEvent) {
            CallRingEvent callRingEvent = (CallRingEvent) videoEvent;
            m105861c(callRingEvent.getMembers());
            m105866h(callRingEvent.getCall());
            TreeMap treeMapM74005n1 = AbstractC25247g0.m74005n0((Map) c13045h14.getValue());
            if (treeMapM74005n1.containsKey(callRingEvent.getCall().getCreatedBy().getId())) {
                return;
            }
            treeMapM74005n1.put(callRingEvent.getCall().getCreatedBy().getId(), new C33486z1(AbstractC35903f.m114002V(callRingEvent.getCall().getCreatedBy()), C25272z.f99163w, callRingEvent.getCall().getCreatedBy().getRole(), callRingEvent.getCall().getCreatedAt(), callRingEvent.getCall().getUpdatedAt(), null, 224));
            c13045h14.getClass();
            c13045h14.m36571k(null, treeMapM74005n1);
            return;
        }
        if (videoEvent instanceof CallUpdatedEvent) {
            CallUpdatedEvent callUpdatedEvent = (CallUpdatedEvent) videoEvent;
            m105866h(callUpdatedEvent.getCall());
            c13045h3.m36570j(callUpdatedEvent.getCapabilitiesByRole());
            return;
        }
        if (videoEvent instanceof UpdatedCallPermissionsEvent) {
            UpdatedCallPermissionsEvent updatedCallPermissionsEvent = (UpdatedCallPermissionsEvent) videoEvent;
            if (AbstractC22676k.m65745e(updatedCallPermissionsEvent.getUser().getId(), c33366b4.m105800r())) {
                this.f139623L.m36570j(updatedCallPermissionsEvent.getOwnCapabilities());
                return;
            }
            return;
        }
        boolean z13 = videoEvent instanceof ConnectedEvent;
        if (z13 || (videoEvent instanceof CustomVideoEvent) || (videoEvent instanceof HealthCheckEvent)) {
            return;
        }
        if (videoEvent instanceof PermissionRequestEvent) {
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1((Collection) c13045h2.getValue());
            arrayListM74097F1.add(new C33539a(c33368c0, (PermissionRequestEvent) videoEvent));
            c13045h2.getClass();
            c13045h2.m36571k(null, arrayListM74097F1);
            return;
        }
        if (videoEvent instanceof CallMemberUpdatedPermissionEvent) {
            c13045h3.m36570j(((CallMemberUpdatedPermissionEvent) videoEvent).getCapabilitiesByRole());
            return;
        }
        if (videoEvent instanceof CallMemberAddedEvent) {
            m105861c(((CallMemberAddedEvent) videoEvent).getMembers());
            return;
        }
        if (videoEvent instanceof CallReactionEvent) {
            ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1((Collection) this.f139661l0.getValue());
            CallReactionEvent callReactionEvent = (CallReactionEvent) videoEvent;
            arrayListM74097F2.add(callReactionEvent.getReaction());
            C13045h2 c13045h19 = this.f139661l0;
            c13045h19.getClass();
            c13045h19.m36571k(null, arrayListM74097F2);
            String str = (String) ((Map) ((AbstractC22680m) this.f139655i0.f104635y).invoke()).get(callReactionEvent.getReaction().getUser().getId());
            if (str == null || (c33392g4 = (C33392g2) this.f139654i.get(str)) == null) {
                return;
            }
            ArrayList arrayListM74097F3 = AbstractC25265s.m74097F1((Collection) c33392g4.f139417I.getValue());
            arrayListM74097F3.add(new C4199o(AbstractC11895b.m31995n("toString(...)"), callReactionEvent.getReaction(), System.currentTimeMillis()));
            C13045h2 c13045h20 = c33392g4.f139417I;
            c13045h20.getClass();
            c13045h20.m36571k(null, arrayListM74097F3);
            return;
        }
        if (videoEvent instanceof CallRecordingStartedEvent) {
            C13045h2 c13045h21 = this.f139610A;
            Boolean bool = Boolean.TRUE;
            c13045h21.getClass();
            c13045h21.m36571k(null, bool);
            CallRecordingStartedEvent.RecordingType recordingType = ((CallRecordingStartedEvent) videoEvent).getRecordingType();
            if (AbstractC22676k.m65745e(recordingType, CallRecordingStartedEvent.RecordingType.Individual.INSTANCE)) {
                c13045h12.getClass();
                c13045h12.m36571k(null, bool);
                return;
            } else if (AbstractC22676k.m65745e(recordingType, CallRecordingStartedEvent.RecordingType.Raw.INSTANCE)) {
                c13045h11.getClass();
                c13045h11.m36571k(null, bool);
                return;
            } else {
                if (AbstractC22676k.m65745e(recordingType, CallRecordingStartedEvent.RecordingType.Composite.INSTANCE)) {
                    c13045h10.getClass();
                    c13045h10.m36571k(null, bool);
                    return;
                }
                return;
            }
        }
        final int i14 = 0;
        if (videoEvent instanceof CallRecordingStoppedEvent) {
            CallRecordingStoppedEvent.RecordingType recordingType2 = ((CallRecordingStoppedEvent) videoEvent).getRecordingType();
            if (AbstractC22676k.m65745e(recordingType2, CallRecordingStoppedEvent.RecordingType.Individual.INSTANCE)) {
                Boolean bool2 = Boolean.FALSE;
                c13045h12.getClass();
                c13045h12.m36571k(null, bool2);
            } else if (AbstractC22676k.m65745e(recordingType2, CallRecordingStoppedEvent.RecordingType.Raw.INSTANCE)) {
                Boolean bool3 = Boolean.FALSE;
                c13045h11.getClass();
                c13045h11.m36571k(null, bool3);
            } else if (AbstractC22676k.m65745e(recordingType2, CallRecordingStoppedEvent.RecordingType.Composite.INSTANCE)) {
                Boolean bool4 = Boolean.FALSE;
                c13045h10.getClass();
                c13045h10.m36571k(null, bool4);
            }
            C13045h2 c13045h22 = this.f139610A;
            if (!((Boolean) c13045h10.getValue()).booleanValue() && !((Boolean) c13045h12.getValue()).booleanValue() && !((Boolean) c13045h11.getValue()).booleanValue()) {
                z4 = false;
            }
            AbstractC13673n.m38550B(z4, c13045h22, null);
            return;
        }
        if (videoEvent instanceof CallLiveStartedEvent) {
            m105866h(((CallLiveStartedEvent) videoEvent).getCall());
            return;
        }
        if (videoEvent instanceof C35614a) {
            for (Map.Entry entry : ((C35614a) videoEvent).f151398a.entrySet()) {
                C33392g2 c33392g2M105862d = m105862d((String) entry.getKey(), ((C27591b) entry.getValue()).f111083a, ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
                C13045h2 c13045h23 = c33392g2M105862d.f139415G;
                Boolean boolValueOf = Boolean.valueOf(((C27591b) entry.getValue()).f111084b);
                c13045h23.getClass();
                c13045h23.m36571k(null, boolValueOf);
                c33392g2M105862d.m105850a(((C27591b) entry.getValue()).f111085c);
            }
            C13045h2 c13045h24 = this.f139664n;
            Iterable iterable = (Iterable) this.f139680v.f81695j.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : iterable) {
                if (((Boolean) ((C33392g2) obj3).f139416H.getValue()).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
            List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new C30706d0(i13));
            c13045h24.getClass();
            c13045h24.m36571k(null, listM74152u1);
            return;
        }
        if (videoEvent instanceof C35622g) {
            C33392g2 c33392g5 = (C33392g2) this.f139670q.getValue();
            C35622g c35622g = (C35622g) videoEvent;
            if (AbstractC22676k.m65745e(c33392g5 != null ? c33392g5.f139422a : null, c35622g.f151411b)) {
                return;
            }
            C33392g2 c33392g2M105862d2 = m105862d(c35622g.f151411b, c35622g.f151410a, ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
            C13045h2 c13045h25 = c33392g2M105862d2.f139413E;
            Boolean bool5 = Boolean.TRUE;
            c13045h25.getClass();
            c13045h25.m36571k(null, bool5);
            C13045h2 c13045h26 = this.f139668p;
            c13045h26.getClass();
            c13045h26.m36571k(null, c33392g2M105862d2);
            C13045h2 c13045h27 = c33392g5 != null ? c33392g5.f139413E : null;
            if (c13045h27 == null) {
                return;
            }
            c13045h27.m36571k(null, Boolean.FALSE);
            return;
        }
        if (videoEvent instanceof C35621f) {
            for (ConnectionQualityInfo connectionQualityInfo : ((C35621f) videoEvent).f151409a) {
                C13045h2 c13045h28 = m105862d(connectionQualityInfo.getSession_id(), connectionQualityInfo.getUser_id(), ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED).f139412D;
                ConnectionQuality connectionQuality = connectionQualityInfo.getConnection_quality();
                AbstractC22676k.m65750j(connectionQuality, "connectionQuality");
                int i15 = AbstractC4192h.f17048a[connectionQuality.ordinal()];
                if (i15 == 1) {
                    c4196l = new C4196l();
                } else if (i15 == 2) {
                    c4196l = new C4195k();
                } else if (i15 == 3) {
                    c4196l = new C4194j();
                } else {
                    if (i15 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c4196l = new C4193i();
                }
                c13045h28.getClass();
                c13045h28.m36571k(null, c4196l);
            }
            return;
        }
        if (videoEvent instanceof C35623h) {
            C13045h2 c13045h29 = this.f139663m0;
            ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(videoEvent, (Collection) this.f139665n0.getValue());
            c13045h29.getClass();
            c13045h29.m36571k(null, arrayListM74128f1);
            return;
        }
        if (videoEvent instanceof C35637v) {
            m105858j(this, null, (C35637v) videoEvent, 1);
            return;
        }
        if (videoEvent instanceof C35626k) {
            return;
        }
        if (videoEvent instanceof C35629n) {
            C35629n c35629n = (C35629n) videoEvent;
            this.f139660l.m36570j(c35629n.f151424b);
            List<Participant> participants = c35629n.f151423a.getParticipants();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(participants, 10));
            Iterator<T> it3 = participants.iterator();
            while (it3.hasNext()) {
                arrayList2.add(m105863e((Participant) it3.next()));
            }
            m105869l(arrayList2);
            if (this.f139613B0.get()) {
                C33359a3 c33359a3 = new C33359a3(true);
                c13045h7.getClass();
                c13045h7.m36571k(null, c33359a3);
            } else {
                m105868k(null);
            }
            List<Pin> pins = c35629n.f151423a.getPins();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(pins, 10));
            for (Pin pin : pins) {
                arrayList3.add(new C35634s(pin.getUser_id(), pin.getSession_id()));
            }
            c0332w0.m844G(arrayList3);
            return;
        }
        int i16 = 8;
        if (videoEvent instanceof C35631p) {
            try {
                if (((List) this.f139680v.f81695j.getValue()).size() < 8) {
                    m105863e(((C35631p) videoEvent).f151430a);
                    c0332w0.m841D((C35631p) videoEvent);
                    return;
                } else {
                    this.f139681v0.put(((C35631p) videoEvent).f151430a.getSession_id(), new C23465k(((C35631p) videoEvent).f151430a, Boolean.valueOf(((C35631p) videoEvent).f151432c)));
                    this.f139676t.m51590a(this.f139644d, this.f139678u, new C33425n0(this, 0));
                    return;
                }
            } catch (Exception e5) {
                C2345k c2345kM105860b2 = m105860b();
                InterfaceC2339e interfaceC2339e2 = c2345kM105860b2.f9275c;
                EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                if (interfaceC2339e2.isLoggable(enumC2341g2, c2345kM105860b2.f9273a)) {
                    c2345kM105860b2.f9274b.log(enumC2341g2, c2345kM105860b2.f9273a, "[ParticipantJoinedEvent] #participants; #debounce; Failed to debounce, processing as usual.", e5);
                }
                m105863e(((C35631p) videoEvent).f151430a);
                return;
            }
        }
        if (videoEvent instanceof C35632q) {
            try {
                this.f139681v0.remove(((C35632q) videoEvent).f151433a.getSession_id());
            } catch (Exception e13) {
                C2343i c2343i = C2343i.f9269a;
                InterfaceC2339e interfaceC2339e3 = C2343i.f9272d;
                EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                if (interfaceC2339e3.isLoggable(enumC2341g3, "SafeCall")) {
                    C2343i.f9271c.log(enumC2341g3, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e13.getMessage()), e13);
                }
            }
            String sessionId = ((C35632q) videoEvent).f151433a.getSession_id();
            AbstractC22676k.m65750j(sessionId, "sessionId");
            ConcurrentHashMap concurrentHashMap = this.f139654i;
            concurrentHashMap.remove(sessionId);
            C13045h2 c13045h30 = this.f139656j;
            HashMap map = new HashMap(concurrentHashMap);
            c13045h30.getClass();
            c13045h30.m36571k(null, map);
            C4204t c4204t = (C4204t) c13045h16.getValue();
            if (AbstractC22676k.m65745e((c4204t == null || (c33392g2 = c4204t.f17062a) == null) ? null : c33392g2.f139422a, sessionId)) {
                c13045h16.m36570j(null);
            }
            C13045h2 c13045h31 = (C13045h2) c0332w0.f1166G;
            C13045h2 c13045h32 = (C13045h2) c0332w0.f1164E;
            if (((Map) c13045h32.getValue()).containsKey(sessionId)) {
                C13045h2 c13045h33 = (C13045h2) c0332w0.f1170z;
                Map mapM73991Z = AbstractC25247g0.m73991Z(sessionId, (Map) c13045h32.getValue());
                c13045h33.getClass();
                c13045h33.m36571k(null, mapM73991Z);
            }
            if (((Map) c13045h31.getValue()).containsKey(sessionId)) {
                C13045h2 c13045h34 = (C13045h2) c0332w0.f1165F;
                Map map2 = (Map) c13045h31.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!AbstractC22676k.m65745e(entry2.getKey(), sessionId)) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                c13045h34.getClass();
                c13045h34.m36571k(null, linkedHashMap);
                return;
            }
            return;
        }
        if (videoEvent instanceof C35640y) {
            return;
        }
        if (videoEvent instanceof C35641z) {
            C35641z c35641z = (C35641z) videoEvent;
            C33392g2 c33392g2M105862d3 = m105862d(c35641z.f151444b, c35641z.f151443a, ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
            TrackType trackType = c35641z.f151445c;
            if (trackType == TrackType.TRACK_TYPE_AUDIO) {
                C13045h2 c13045h35 = c33392g2M105862d3.f139436o;
                Boolean bool6 = Boolean.TRUE;
                c13045h35.getClass();
                c13045h35.m36571k(null, bool6);
                return;
            }
            if (trackType == TrackType.TRACK_TYPE_VIDEO) {
                C13045h2 c13045h36 = c33392g2M105862d3.f139432k;
                Boolean bool7 = Boolean.TRUE;
                c13045h36.getClass();
                c13045h36.m36571k(null, bool7);
                return;
            }
            if (trackType == TrackType.TRACK_TYPE_SCREEN_SHARE) {
                c33392g2M105862d3.f139439r.m36570j(Boolean.TRUE);
                c13045h16.m36570j(new C4204t(c33392g2M105862d3));
                return;
            }
            return;
        }
        if (videoEvent instanceof C35615a0) {
            C35615a0 c35615a0 = (C35615a0) videoEvent;
            C33392g2 c33392g2M105862d4 = m105862d(c35615a0.f151400b, c35615a0.f151399a, ParticipantSource.PARTICIPANT_SOURCE_WEBRTC_UNSPECIFIED);
            TrackType trackType2 = c35615a0.f151401c;
            if (trackType2 == TrackType.TRACK_TYPE_AUDIO) {
                c33392g2M105862d4.f139436o.m36570j(Boolean.FALSE);
                return;
            }
            if (trackType2 == TrackType.TRACK_TYPE_VIDEO) {
                c33392g2M105862d4.f139432k.m36570j(Boolean.FALSE);
                return;
            }
            if (trackType2 == TrackType.TRACK_TYPE_SCREEN_SHARE) {
                c33392g2M105862d4.f139439r.m36570j(Boolean.FALSE);
                C4204t c4204t2 = (C4204t) c13045h16.getValue();
                if (AbstractC22676k.m65745e((c4204t2 == null || (c33392g3 = c4204t2.f17062a) == null) ? null : c33392g3.f139422a, c33392g2M105862d4.f139422a)) {
                    c13045h16.m36570j(null);
                    return;
                }
                return;
            }
            return;
        }
        if (z13) {
            return;
        }
        if (videoEvent instanceof CallSessionStartedEvent) {
            CallSessionStartedEvent callSessionStartedEvent = (CallSessionStartedEvent) videoEvent;
            CallSessionResponse session = callSessionStartedEvent.getCall().getSession();
            if (session != null) {
                c13045h17.m36570j(session);
            }
            m105866h(callSessionStartedEvent.getCall());
            return;
        }
        if (videoEvent instanceof CallSessionEndedEvent) {
            CallSessionEndedEvent callSessionEndedEvent = (CallSessionEndedEvent) videoEvent;
            c13045h17.m36570j(callSessionEndedEvent.getCall().getSession());
            m105866h(callSessionEndedEvent.getCall());
            return;
        }
        if (videoEvent instanceof CallSessionParticipantCountsUpdatedEvent) {
            CallSessionResponse callSessionResponse = (CallSessionResponse) c13045h17.getValue();
            if (callSessionResponse != null) {
                CallSessionParticipantCountsUpdatedEvent callSessionParticipantCountsUpdatedEvent = (CallSessionParticipantCountsUpdatedEvent) videoEvent;
                c13045h17.m36570j(CallSessionResponse.copy$default(callSessionResponse, callSessionParticipantCountsUpdatedEvent.getAnonymousParticipantCount(), null, null, null, null, callSessionParticipantCountsUpdatedEvent.getParticipantsCountByRole(), null, null, null, null, null, null, 4062, null));
            }
            m105858j(this, (CallSessionResponse) c13045h9.getValue(), null, 2);
            return;
        }
        if (videoEvent instanceof CallSessionParticipantLeftEvent) {
            CallSessionResponse callSessionResponse2 = (CallSessionResponse) c13045h17.getValue();
            if (callSessionResponse2 != null) {
                ArrayList arrayListM74097F4 = AbstractC25265s.m74097F1(callSessionResponse2.getParticipants());
                arrayListM74097F4.removeIf(new C1898i(new C14117e(videoEvent, 1), i16));
                LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(callSessionResponse2.getParticipantsCountByRole());
                CallSessionParticipantLeftEvent callSessionParticipantLeftEvent = (CallSessionParticipantLeftEvent) videoEvent;
                Integer num = (Integer) linkedHashMapM74003l0.computeIfPresent(callSessionParticipantLeftEvent.getParticipant().getRole(), new BiFunction(i14) { // from class: t23.j0

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f139480a;

                    {
                        this.f139480a = i14;
                        switch (i14) {
                            case 1:
                                C33430o0 c33430o0 = C33430o0.f139565w;
                                break;
                        }
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj4, Object obj5) {
                        switch (this.f139480a) {
                            case 0:
                                Integer v13 = (Integer) obj5;
                                AbstractC22676k.m65750j((String) obj4, "<anonymous parameter 0>");
                                AbstractC22676k.m65750j(v13, "v");
                                return Integer.valueOf(Math.max(v13.intValue() - 1, 0));
                            default:
                                return (Integer) C33430o0.f139565w.invoke(obj4, obj5);
                        }
                    }
                });
                if (num != null && num.intValue() == 0) {
                    linkedHashMapM74003l0.remove(callSessionParticipantLeftEvent.getParticipant().getRole());
                }
                c13045h17.m36570j(CallSessionResponse.copy$default(callSessionResponse2, 0, null, arrayListM74097F4, null, null, linkedHashMapM74003l0, null, null, null, null, null, null, 4059, null));
            }
            m105858j(this, (CallSessionResponse) c13045h9.getValue(), null, 2);
            return;
        }
        if (videoEvent instanceof CallSessionParticipantJoinedEvent) {
            CallSessionResponse callSessionResponse3 = (CallSessionResponse) c13045h17.getValue();
            if (callSessionResponse3 != null) {
                ArrayList arrayListM74097F5 = AbstractC25265s.m74097F1(callSessionResponse3.getParticipants());
                CallSessionParticipantJoinedEvent callSessionParticipantJoinedEvent = (CallSessionParticipantJoinedEvent) videoEvent;
                CallParticipantResponse callParticipantResponse = new CallParticipantResponse(callSessionParticipantJoinedEvent.getCreatedAt(), callSessionParticipantJoinedEvent.getParticipant().getUser().getRole(), callSessionParticipantJoinedEvent.getParticipant().getUserSessionId(), callSessionParticipantJoinedEvent.getParticipant().getUser());
                LinkedHashMap linkedHashMapM74003l1 = AbstractC25247g0.m74003l0(callSessionResponse3.getParticipantsCountByRole());
                String role = callSessionParticipantJoinedEvent.getParticipant().getRole();
                C33430o0 c33430o0 = C33430o0.f139565w;
                final int i17 = true ? 1 : 0;
                linkedHashMapM74003l1.merge(role, 1, new BiFunction(i17) { // from class: t23.j0

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f139480a;

                    {
                        this.f139480a = i17;
                        switch (i17) {
                            case 1:
                                C33430o0 c33430o1 = C33430o0.f139565w;
                                break;
                        }
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj4, Object obj5) {
                        switch (this.f139480a) {
                            case 0:
                                Integer v13 = (Integer) obj5;
                                AbstractC22676k.m65750j((String) obj4, "<anonymous parameter 0>");
                                AbstractC22676k.m65750j(v13, "v");
                                return Integer.valueOf(Math.max(v13.intValue() - 1, 0));
                            default:
                                return (Integer) C33430o0.f139565w.invoke(obj4, obj5);
                        }
                    }
                });
                Iterator it4 = arrayListM74097F5.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    if (AbstractC22676k.m65745e(this.f139642c.getId(), callSessionParticipantJoinedEvent.getParticipant().getUser().getId())) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    arrayListM74097F5.add(callParticipantResponse);
                } else {
                    arrayListM74097F5.set(i14, callParticipantResponse);
                }
                c13045h17.m36570j(CallSessionResponse.copy$default(callSessionResponse3, 0, null, arrayListM74097F5, null, null, linkedHashMapM74003l1, null, null, null, null, null, null, 4059, null));
            }
            m105858j(this, (CallSessionResponse) c13045h9.getValue(), null, 2);
            m105868k(null);
            return;
        }
        if (videoEvent instanceof CallTranscriptionStartedEvent) {
            c13045h8.m36570j(Boolean.TRUE);
            return;
        }
        if (videoEvent instanceof CallTranscriptionStoppedEvent) {
            c13045h8.m36570j(Boolean.FALSE);
            return;
        }
        if (videoEvent instanceof CallTranscriptionFailedEvent) {
            c13045h8.m36570j(Boolean.FALSE);
            return;
        }
        if (!(videoEvent instanceof CallClosedCaptionsStartedEvent ? true : videoEvent instanceof ClosedCaptionEvent ? true : videoEvent instanceof CallClosedCaptionsStoppedEvent)) {
            InterfaceC30057d interfaceC30057d = null;
            if (videoEvent instanceof CallModerationBlurEvent) {
                AbstractC3006f0.m8732z(this.f139644d, null, null, new C33435p0(this, interfaceC30057d, i14), 3);
                return;
            }
            return;
        }
        C32118c c32118c = this.f139677t0;
        C13045h2 c13045h37 = c32118c.f133145e;
        AbstractC22676k.m65750j(videoEvent, "videoEvent");
        if (videoEvent instanceof ClosedCaptionEvent) {
            AbstractC3006f0.m8732z(c32118c.f133147g, null, null, new C11194d(c32118c, (ClosedCaptionEvent) videoEvent, (InterfaceC30057d) null, 13), 3);
            Boolean bool8 = Boolean.TRUE;
            c13045h37.getClass();
            c13045h37.m36571k(null, bool8);
            return;
        }
        if (videoEvent instanceof CallClosedCaptionsStartedEvent) {
            Boolean bool9 = Boolean.TRUE;
            c13045h37.getClass();
            c13045h37.m36571k(null, bool9);
        } else if (videoEvent instanceof CallClosedCaptionsStoppedEvent) {
            Boolean bool10 = Boolean.FALSE;
            c13045h37.getClass();
            c13045h37.m36571k(null, bool10);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m105865g() {
        C2996c2 c2996c2 = this.f139675s0;
        InterfaceC30057d interfaceC30057d = null;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f139675s0 = AbstractC3006f0.m8732z(AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2), null, null, new C33435p0(this, interfaceC30057d, 3), 3);
    }

    /* JADX INFO: renamed from: h */
    public final void m105866h(CallResponse response) {
        Map<String, C21682i> acceptedBy;
        Set<String> setKeySet;
        Map<String, C21682i> rejectedBy;
        Set<String> setKeySet2;
        AbstractC22676k.m65750j(response, "response");
        Boolean boolValueOf = Boolean.valueOf(response.getBackstage());
        C13045h2 c13045h2 = this.f139627P;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
        this.f139643c0.m36570j(response.getBlockedUserIds());
        this.f139629R.m36570j(response.getEgress());
        Boolean boolValueOf2 = Boolean.valueOf(response.getEgress().getBroadcasting());
        C13045h2 c13045h3 = this.f139630S;
        c13045h3.getClass();
        c13045h3.m36571k(null, boolValueOf2);
        CallSessionResponse session = response.getSession();
        C13045h2 c13045h4 = this.f139635X;
        c13045h4.m36570j(session);
        CallSessionResponse session2 = response.getSession();
        Set setM74103I1 = C25235a0.f99113w;
        Set setM74103I2 = (session2 == null || (rejectedBy = session2.getRejectedBy()) == null || (setKeySet2 = rejectedBy.keySet()) == null) ? setM74103I1 : AbstractC25265s.m74103I1(setKeySet2);
        C13045h2 c13045h5 = this.f139634W;
        c13045h5.getClass();
        c13045h5.m36571k(null, setM74103I2);
        CallSessionResponse session3 = response.getSession();
        if (session3 != null && (acceptedBy = session3.getAcceptedBy()) != null && (setKeySet = acceptedBy.keySet()) != null) {
            setM74103I1 = AbstractC25265s.m74103I1(setKeySet);
        }
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E((Set) this.f139633V.getValue(), setM74103I1);
        C13045h2 c13045h6 = this.f139632U;
        c13045h6.getClass();
        c13045h6.m36571k(null, linkedHashSetM34556E);
        this.f139641b0.m36570j(response.getCreatedAt());
        this.f139639a0.m36570j(response.getUpdatedAt());
        C21682i endedAt = response.getEndedAt();
        C13045h2 c13045h7 = this.f139657j0;
        c13045h7.m36570j(endedAt);
        this.f139637Z.m36570j(response.getStartsAt());
        User userM114002V = AbstractC35903f.m114002V(response.getCreatedBy());
        C13045h2 c13045h8 = this.f139649f0;
        c13045h8.getClass();
        c13045h8.m36571k(null, userM114002V);
        this.f139645d0.m36570j(response.getCustom());
        this.f139653h0.m36570j(response.getIngress());
        Boolean boolValueOf3 = Boolean.valueOf(response.getRecording());
        C13045h2 c13045h9 = this.f139610A;
        c13045h9.getClass();
        c13045h9.m36571k(null, boolValueOf3);
        this.f139620I.m36570j(response.getSettings());
        Boolean boolValueOf4 = Boolean.valueOf(response.getTranscribing());
        C13045h2 c13045h10 = this.f139631T;
        c13045h10.getClass();
        c13045h10.m36571k(null, boolValueOf4);
        this.f139647e0.m36570j(response.getTeam());
        ThumbnailResponse thumbnails = response.getThumbnails();
        this.f139669p0.m36570j(thumbnails != null ? thumbnails.getImageUrl() : null);
        CallSessionResponse session4 = response.getSession();
        c13045h4.m36570j(session4);
        C21682i startedAt = session4 != null ? session4.getStartedAt() : null;
        C13045h2 c13045h11 = this.f139658k;
        if (startedAt != null) {
            c13045h11.m36570j(session4.getStartedAt());
        } else {
            if ((session4 != null ? session4.getLiveStartedAt() : null) != null) {
                c13045h11.m36570j(session4.getLiveStartedAt());
            }
        }
        if ((session4 != null ? session4.getLiveEndedAt() : null) != null) {
            c13045h7.m36570j(session4.getLiveEndedAt());
        }
        m105858j(this, session4, null, 2);
        m105868k(null);
        C32118c c32118c = this.f139677t0;
        c32118c.getClass();
        C13045h2 c13045h12 = c32118c.f133145e;
        Boolean boolValueOf5 = Boolean.valueOf(response.getCaptioning());
        c13045h12.getClass();
        c13045h12.m36571k(null, boolValueOf5);
        c32118c.f133144d.m36570j(response.getSettings().getTranscription().getClosedCaptionMode());
    }

    /* JADX INFO: renamed from: i */
    public final void m105867i(int i13, Notification notification) {
        AbstractC22676k.m65750j(notification, "notification");
        Integer numValueOf = Integer.valueOf(i13);
        C13045h2 c13045h2 = this.f139685x0;
        c13045h2.getClass();
        c13045h2.m36571k(null, numValueOf);
        this.f139683w0.set(notification);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x030a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0313  */
    /* JADX WARN: Code duplicated, block: B:127:0x0316  */
    /* JADX WARN: Code duplicated, block: B:130:0x0322  */
    /* JADX WARN: Code duplicated, block: B:132:0x0332  */
    /* JADX WARN: Code duplicated, block: B:135:0x0356  */
    /* JADX WARN: Code duplicated, block: B:138:0x0361  */
    /* JADX WARN: Code duplicated, block: B:140:0x0365  */
    /* JADX WARN: Code duplicated, block: B:143:0x0370  */
    /* JADX WARN: Code duplicated, block: B:146:0x0383  */
    /* JADX WARN: Code duplicated, block: B:149:0x039d  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:155:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:163:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:166:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:169:0x0406  */
    /* JADX WARN: Code duplicated, block: B:172:0x0410  */
    /* JADX WARN: Code duplicated, block: B:174:0x041a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0429  */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0431  */
    /* JADX WARN: Code duplicated, block: B:183:0x0442  */
    /* JADX WARN: Code duplicated, block: B:191:0x0404 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x041e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0262  */
    /* JADX WARN: Code duplicated, block: B:93:0x0273  */
    /* JADX WARN: Code duplicated, block: B:94:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x0332, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:146:0x0383, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:154:0x03c8, please report this as an issue */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [bc3.d0, q83.j] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX INFO: renamed from: k */
    public final void m105868k(AbstractC34235f abstractC34235f) {
        boolean z4;
        boolean z13;
        CallParticipantResponse callParticipantResponse;
        C13045h2 c13045h2;
        boolean z14;
        Object c33359a3;
        Set set;
        String strMo13074M;
        C2345k c2345k;
        InterfaceC2339e interfaceC2339e;
        String str;
        boolean z15;
        C33384f c33384f;
        InterfaceC33377d3 currentRingingState;
        C30929c c30929c;
        C2345k c2345kM105844d;
        InterfaceC2339e interfaceC2339e2;
        String str2;
        ?? r10;
        ConcurrentHashMap.KeySetView keySetView;
        Iterator it;
        InterfaceC33377d3 interfaceC33377d3;
        boolean z16;
        AtomicReference atomicReference;
        InterfaceC3027k1 interfaceC3027k1;
        InterfaceC3027k1 interfaceC3027k2;
        C2345k c2345k2;
        InterfaceC2339e interfaceC2339e3;
        String str3;
        List<CallParticipantResponse> participants;
        Object obj;
        C33368c0 c33368c0 = this.f139640b;
        String str4 = c33368c0.f139308v;
        String str5 = c33368c0.f139289c;
        C33366b4 c33366b4 = this.f139638a;
        C33391g1 c33391g1 = c33366b4.f139248U;
        C13045h2 c13045h3 = this.f139618G;
        InterfaceC33377d3 interfaceC33377d4 = (InterfaceC33377d3) c13045h3.getValue();
        C33371c3 c33371c3 = C33371c3.f139321a;
        boolean zM65745e = AbstractC22676k.m65745e(interfaceC33377d4, c33371c3);
        C33365b3 c33365b3 = C33365b3.f139231a;
        if (zM65745e ? true : AbstractC22676k.m65745e(interfaceC33377d4, c33365b3)) {
            return;
        }
        C13045h2 c13045h4 = this.f139634W;
        Set set2 = (Set) c13045h4.getValue();
        boolean zContains = ((Set) c13045h4.getValue()).contains(c33366b4.m105800r());
        C13045h2 c13045h5 = this.f139632U;
        Set set3 = (Set) c13045h5.getValue();
        boolean zContains2 = ((Set) c13045h5.getValue()).contains(c33366b4.m105800r());
        User user = (User) this.f139649f0.getValue();
        if (c33391g1.f139405h.getValue() == null) {
            z4 = false;
        } else {
            C33368c0 c33368c1 = (C33368c0) c33391g1.f139405h.getValue();
            if (AbstractC22676k.m65745e(c33368c1 != null ? c33368c1.f139289c : null, str5)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (c33391g1.f139404g.getValue() == null) {
            z13 = false;
        } else {
            C33368c0 c33368c2 = (C33368c0) c33391g1.f139404g.getValue();
            if (AbstractC22676k.m65745e(c33368c2 != null ? c33368c2.f139289c : null, str5)) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        CallSessionResponse callSessionResponse = (CallSessionResponse) this.f139635X.getValue();
        if (callSessionResponse == null || (participants = callSessionResponse.getParticipants()) == null) {
            callParticipantResponse = null;
        } else {
            Iterator it3 = participants.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it3.next();
                Iterator it4 = it3;
                obj = next;
                if (AbstractC22676k.m65745e(((CallParticipantResponse) next).getUser().getId(), c33366b4.m105800r())) {
                    break;
                } else {
                    it3 = it4;
                }
            }
            callParticipantResponse = (CallParticipantResponse) obj;
        }
        boolean z17 = callParticipantResponse != null;
        Map map = (Map) this.f139682w.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C13045h2 c13045h6 = c13045h3;
            C33371c3 c33371c4 = c33371c3;
            if (!AbstractC22676k.m65745e(((C33486z1) entry.getValue()).f139808a.getId(), c33366b4.m105800r())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            c33371c3 = c33371c4;
            c13045h3 = c13045h6;
        }
        C13045h2 c13045h7 = c13045h3;
        C33371c3 c33371c5 = c33371c3;
        int size = linkedHashMap.size();
        boolean z18 = this.f139657j0.getValue() != null;
        AbstractC22676k.m65745e(user != null ? user.getId() : null, c33366b4.m105800r());
        C23470p c23470p = this.f139611A0;
        C2345k c2345k3 = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e4 = c2345k3.f9275c;
        String str6 = c2345k3.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        boolean zIsLoggable = interfaceC2339e4.isLoggable(enumC2341g, str6);
        C13045h2 c13045h8 = this.f139617F;
        if (zIsLoggable) {
            c13045h2 = c13045h8;
            c2345k3.f9274b.log(enumC2341g, str6, "Current: " + c13045h2.getValue() + ", call_id: " + str4, null);
        } else {
            c13045h2 = c13045h8;
        }
        String strM74110N0 = AbstractC25265s.m74110N0(AbstractC37056f.m118980f(AbstractC11266d.m30462p("acceptedByMe: ", zContains2), AbstractC11266d.m30462p("isRejectedByMe: ", zContains), "rejectReason: " + abstractC34235f, AbstractC11266d.m30462p("hasActiveCall: ", z4), AbstractC11266d.m30462p("hasRingingCall: ", z13), AbstractC11266d.m30462p("userIsParticipant: ", z17), AbstractC11266d.m30462p("isCallEnded: ", z18)), "", null, null, C33415l0.f139523J, 30);
        C2345k c2345k4 = (C2345k) c23470p.getValue();
        InterfaceC2339e interfaceC2339e5 = c2345k4.f9275c;
        String str7 = c2345k4.f9273a;
        if (interfaceC2339e5.isLoggable(enumC2341g, str7)) {
            c2345k4.f9274b.log(enumC2341g, str7, AbstractC31061c.m95640p("call_id: ", str4, ", Flags: ", strM74110N0), null);
        }
        AtomicBoolean atomicBoolean = this.f139613B0;
        C33477x2 c33477x2 = C33477x2.f139772a;
        if (!z4 || atomicBoolean.get()) {
            if (z13 && z18) {
                m105859a();
            } else {
                if (!zContains) {
                    if (set2.isEmpty() || set2.size() < size) {
                        if (AbstractC25265s.m74155w0(set2, user != null ? user.getId() : null) && z13) {
                            c33368c0.m105823p(new C33390g0(EnumC33393g3.REJECTED_BY_ALL, "All participants rejected the call"));
                            m105859a();
                            if (abstractC34235f != null) {
                                strMo13074M = abstractC34235f.mo13074M();
                            } else {
                                strMo13074M = null;
                            }
                            if (AbstractC22676k.m65745e(strMo13074M, "timeout")) {
                                c33359a3 = c33371c5;
                            }
                        } else {
                            if (z13) {
                                if (!AbstractC22676k.m65745e(user != null ? user.getId() : null, c33366b4.m105800r())) {
                                    if (z17) {
                                        m105859a();
                                    } else {
                                        c33359a3 = new C33487z2(zContains2);
                                    }
                                }
                            }
                            if (!z13) {
                                z14 = false;
                                if (c13045h2.getValue() instanceof C33487z2) {
                                    c33359a3 = c33371c5;
                                } else {
                                    c33359a3 = C33482y2.f139792a;
                                }
                            } else if (AbstractC22676k.m65745e(user != null ? user.getId() : null, c33366b4.m105800r())) {
                                C2345k c2345k5 = (C2345k) c23470p.getValue();
                                InterfaceC2339e interfaceC2339e6 = c2345k5.f9275c;
                                String str8 = c2345k5.f9273a;
                                if (interfaceC2339e6.isLoggable(enumC2341g, str8)) {
                                    InterfaceC2344j interfaceC2344j = c2345k5.f9274b;
                                    StringBuilder sb4 = new StringBuilder("acceptedBy: ");
                                    set = set3;
                                    sb4.append(set);
                                    sb4.append(", userIsParticipant: ");
                                    sb4.append(z17);
                                    interfaceC2344j.log(enumC2341g, str8, sb4.toString(), null);
                                } else {
                                    set = set3;
                                }
                                if (set.isEmpty()) {
                                    z14 = false;
                                    c33359a3 = new C33359a3(false);
                                } else {
                                    z14 = false;
                                    if (z17) {
                                        atomicBoolean.set(false);
                                        m105859a();
                                        c33359a3 = c33477x2;
                                    } else {
                                        c33359a3 = new C33359a3(true);
                                    }
                                }
                            } else {
                                z14 = false;
                                if (c13045h2.getValue() instanceof C33487z2) {
                                    c33359a3 = c33371c5;
                                } else {
                                    c33359a3 = C33482y2.f139792a;
                                }
                            }
                        }
                        z14 = false;
                    } else {
                        c33368c0.m105823p(new C33390g0(EnumC33393g3.REJECTED_BY_ALL, "All participants rejected the call"));
                        m105859a();
                        if (abstractC34235f != null) {
                            strMo13074M = abstractC34235f.mo13074M();
                        } else {
                            strMo13074M = null;
                        }
                        if (AbstractC22676k.m65745e(strMo13074M, "timeout")) {
                            c33359a3 = c33371c5;
                        }
                        z14 = false;
                    }
                    if (!AbstractC22676k.m65745e(c13045h2.getValue(), c33359a3)) {
                        c2345k2 = (C2345k) c23470p.getValue();
                        interfaceC2339e3 = c2345k2.f9275c;
                        str3 = c2345k2.f9273a;
                        if (interfaceC2339e3.isLoggable(enumC2341g, str3)) {
                            c2345k2.f9274b.log(enumC2341g, str3, "Updating ringing state " + c13045h2.getValue() + " -> " + c33359a3, null);
                        }
                        if (!(c33359a3 instanceof C33359a3) && !((C33359a3) c33359a3).f139208a) {
                            m105865g();
                        } else if ((c33359a3 instanceof C33487z2) || ((C33487z2) c33359a3).f139814a) {
                            m105859a();
                        } else {
                            m105865g();
                        }
                    }
                    c2345k = (C2345k) c23470p.getValue();
                    interfaceC2339e = c2345k.f9275c;
                    str = c2345k.f9273a;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345k.f9274b.log(enumC2341g, str, "Update: " + c33359a3, null);
                    }
                    z15 = c33359a3 instanceof C33477x2;
                    c33384f = this.f139689z0;
                    if (z15) {
                        currentRingingState = (InterfaceC33377d3) c13045h7.getValue();
                        c30929c = new C30929c(7, this, (C33477x2) c33359a3);
                        c33384f.getClass();
                        AbstractC22676k.m65750j(currentRingingState, "currentRingingState");
                        if (!(currentRingingState instanceof C33477x2)) {
                            c2345kM105844d = c33384f.m105844d();
                            interfaceC2339e2 = c2345kM105844d.f9275c;
                            str2 = c2345kM105844d.f9273a;
                            if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                                r10 = 0;
                                c2345kM105844d.f9274b.log(enumC2341g, str2, "[awaitAndTransition], ringingState: " + currentRingingState, null);
                            } else {
                                r10 = 0;
                            }
                            if (c33384f.f139370c == EnumC33372c4.f139322w) {
                                interfaceC3027k2 = (InterfaceC3027k1) c33384f.f139374g.get();
                                if (interfaceC3027k2 != null || !interfaceC3027k2.isActive()) {
                                    c30929c.invoke();
                                }
                            } else {
                                keySetView = c33384f.f139369b;
                                if (keySetView == null && keySetView.isEmpty()) {
                                    z16 = z14;
                                } else {
                                    it = keySetView.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            interfaceC33377d3 = (InterfaceC33377d3) it.next();
                                            if (!(interfaceC33377d3 instanceof C33487z2) || (interfaceC33377d3 instanceof C33359a3)) {
                                                z16 = true;
                                            }
                                        } else {
                                            z16 = z14;
                                        }
                                    }
                                }
                                atomicReference = c33384f.f139373f;
                                interfaceC3027k1 = (InterfaceC3027k1) atomicReference.get();
                                if (interfaceC3027k1 != null || !interfaceC3027k1.isActive()) {
                                    atomicReference.set(AbstractC3006f0.m8732z(c33384f.f139368a, r10, r10, new C11629t0(z16, c33384f, c33368c0, c30929c, (InterfaceC30057d) null), 3));
                                }
                            }
                        }
                    } else {
                        c13045h2.getClass();
                        c13045h2.m36571k(null, c33359a3);
                        c33384f.m105843c();
                    }
                    this.f139619H.add(c33359a3);
                }
                c33368c0.m105823p(new C33395h0(EnumC33378d4.REJECTED_BY_SELF, "updateRingingState-rejected-self"));
                m105859a();
            }
            c33359a3 = c33365b3;
            z14 = false;
            if (!AbstractC22676k.m65745e(c13045h2.getValue(), c33359a3)) {
                c2345k2 = (C2345k) c23470p.getValue();
                interfaceC2339e3 = c2345k2.f9275c;
                str3 = c2345k2.f9273a;
                if (interfaceC2339e3.isLoggable(enumC2341g, str3)) {
                    c2345k2.f9274b.log(enumC2341g, str3, "Updating ringing state " + c13045h2.getValue() + " -> " + c33359a3, null);
                }
                if (!(c33359a3 instanceof C33359a3)) {
                    if (c33359a3 instanceof C33487z2) {
                        m105859a();
                    } else {
                        m105859a();
                    }
                } else if (c33359a3 instanceof C33487z2) {
                    m105859a();
                } else {
                    m105859a();
                }
            }
            c2345k = (C2345k) c23470p.getValue();
            interfaceC2339e = c2345k.f9275c;
            str = c2345k.f9273a;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "Update: " + c33359a3, null);
            }
            z15 = c33359a3 instanceof C33477x2;
            c33384f = this.f139689z0;
            if (z15) {
                currentRingingState = (InterfaceC33377d3) c13045h7.getValue();
                c30929c = new C30929c(7, this, (C33477x2) c33359a3);
                c33384f.getClass();
                AbstractC22676k.m65750j(currentRingingState, "currentRingingState");
                if (!(currentRingingState instanceof C33477x2)) {
                    c2345kM105844d = c33384f.m105844d();
                    interfaceC2339e2 = c2345kM105844d.f9275c;
                    str2 = c2345kM105844d.f9273a;
                    if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                        r10 = 0;
                        c2345kM105844d.f9274b.log(enumC2341g, str2, "[awaitAndTransition], ringingState: " + currentRingingState, null);
                    } else {
                        r10 = 0;
                    }
                    if (c33384f.f139370c == EnumC33372c4.f139322w) {
                        interfaceC3027k2 = (InterfaceC3027k1) c33384f.f139374g.get();
                        if (interfaceC3027k2 != null) {
                            c30929c.invoke();
                        } else {
                            c30929c.invoke();
                        }
                    } else {
                        keySetView = c33384f.f139369b;
                        if (keySetView == null) {
                            it = keySetView.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC33377d3 = (InterfaceC33377d3) it.next();
                                    if (!(interfaceC33377d3 instanceof C33487z2)) {
                                    }
                                    z16 = true;
                                } else {
                                    z16 = z14;
                                }
                            }
                        } else {
                            it = keySetView.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    interfaceC33377d3 = (InterfaceC33377d3) it.next();
                                    if (!(interfaceC33377d3 instanceof C33487z2)) {
                                    }
                                    z16 = true;
                                } else {
                                    z16 = z14;
                                }
                            }
                        }
                        atomicReference = c33384f.f139373f;
                        interfaceC3027k1 = (InterfaceC3027k1) atomicReference.get();
                        if (interfaceC3027k1 != null) {
                            atomicReference.set(AbstractC3006f0.m8732z(c33384f.f139368a, r10, r10, new C11629t0(z16, c33384f, c33368c0, c30929c, (InterfaceC30057d) null), 3));
                        } else {
                            atomicReference.set(AbstractC3006f0.m8732z(c33384f.f139368a, r10, r10, new C11629t0(z16, c33384f, c33368c0, c30929c, (InterfaceC30057d) null), 3));
                        }
                    }
                }
            } else {
                c13045h2.getClass();
                c13045h2.m36571k(null, c33359a3);
                c33384f.m105843c();
            }
            this.f139619H.add(c33359a3);
        }
        m105859a();
        c33359a3 = c33477x2;
        z14 = false;
        if (!AbstractC22676k.m65745e(c13045h2.getValue(), c33359a3)) {
            c2345k2 = (C2345k) c23470p.getValue();
            interfaceC2339e3 = c2345k2.f9275c;
            str3 = c2345k2.f9273a;
            if (interfaceC2339e3.isLoggable(enumC2341g, str3)) {
                c2345k2.f9274b.log(enumC2341g, str3, "Updating ringing state " + c13045h2.getValue() + " -> " + c33359a3, null);
            }
            if (!(c33359a3 instanceof C33359a3)) {
                if (c33359a3 instanceof C33487z2) {
                    m105859a();
                } else {
                    m105859a();
                }
            } else if (c33359a3 instanceof C33487z2) {
                m105859a();
            } else {
                m105859a();
            }
        }
        c2345k = (C2345k) c23470p.getValue();
        interfaceC2339e = c2345k.f9275c;
        str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "Update: " + c33359a3, null);
        }
        z15 = c33359a3 instanceof C33477x2;
        c33384f = this.f139689z0;
        if (z15) {
            currentRingingState = (InterfaceC33377d3) c13045h7.getValue();
            c30929c = new C30929c(7, this, (C33477x2) c33359a3);
            c33384f.getClass();
            AbstractC22676k.m65750j(currentRingingState, "currentRingingState");
            if (!(currentRingingState instanceof C33477x2)) {
                c2345kM105844d = c33384f.m105844d();
                interfaceC2339e2 = c2345kM105844d.f9275c;
                str2 = c2345kM105844d.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                    r10 = 0;
                    c2345kM105844d.f9274b.log(enumC2341g, str2, "[awaitAndTransition], ringingState: " + currentRingingState, null);
                } else {
                    r10 = 0;
                }
                if (c33384f.f139370c == EnumC33372c4.f139322w) {
                    interfaceC3027k2 = (InterfaceC3027k1) c33384f.f139374g.get();
                    if (interfaceC3027k2 != null) {
                        c30929c.invoke();
                    } else {
                        c30929c.invoke();
                    }
                } else {
                    keySetView = c33384f.f139369b;
                    if (keySetView == null) {
                        it = keySetView.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                interfaceC33377d3 = (InterfaceC33377d3) it.next();
                                if (!(interfaceC33377d3 instanceof C33487z2)) {
                                }
                                z16 = true;
                            } else {
                                z16 = z14;
                            }
                        }
                    } else {
                        it = keySetView.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                interfaceC33377d3 = (InterfaceC33377d3) it.next();
                                if (!(interfaceC33377d3 instanceof C33487z2)) {
                                }
                                z16 = true;
                            } else {
                                z16 = z14;
                            }
                        }
                    }
                    atomicReference = c33384f.f139373f;
                    interfaceC3027k1 = (InterfaceC3027k1) atomicReference.get();
                    if (interfaceC3027k1 != null) {
                        atomicReference.set(AbstractC3006f0.m8732z(c33384f.f139368a, r10, r10, new C11629t0(z16, c33384f, c33368c0, c30929c, (InterfaceC30057d) null), 3));
                    } else {
                        atomicReference.set(AbstractC3006f0.m8732z(c33384f.f139368a, r10, r10, new C11629t0(z16, c33384f, c33368c0, c30929c, (InterfaceC30057d) null), 3));
                    }
                }
            }
        } else {
            c13045h2.getClass();
            c13045h2.m36571k(null, c33359a3);
            c33384f.m105843c();
        }
        this.f139619H.add(c33359a3);
    }

    /* JADX INFO: renamed from: l */
    public final void m105869l(List list) {
        ConcurrentHashMap concurrentHashMap;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            concurrentHashMap = this.f139654i;
            if (!zHasNext) {
                break;
            }
            C33392g2 c33392g2 = (C33392g2) it.next();
            concurrentHashMap.put(c33392g2.f139422a, c33392g2);
            if (((Boolean) c33392g2.f139440s.getValue()).booleanValue()) {
                arrayList.add(c33392g2);
            }
        }
        HashMap map = new HashMap(concurrentHashMap);
        C13045h2 c13045h2 = this.f139656j;
        c13045h2.getClass();
        c13045h2.m36571k(null, map);
        if (arrayList.isEmpty()) {
            return;
        }
        C4204t c4204t = new C4204t((C33392g2) arrayList.get(0));
        C13045h2 c13045h3 = this.f139686y;
        c13045h3.getClass();
        c13045h3.m36571k(null, c4204t);
    }
}
