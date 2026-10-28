package ry1;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.p069ui.login.MissingImportantAppInfoException;
import dj0.C12065a;
import dj0.C12066b;
import dj0.C12071g;
import dj0.C12086v;
import dj0.InterfaceC12070f;
import dj0.InterfaceC12072h;
import dj0.InterfaceC12085u;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fj0.C14527a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27837a0;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import py1.AbstractC29623b;
import py1.AbstractC29625d;
import py1.C29622a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ty1.InterfaceC34256a;
import ty1.InterfaceC34265j;
import ty1.InterfaceC34267l;
import wy1.C37697d;
import xy1.EnumC38705f;
import y92.C39352a;

/* JADX INFO: renamed from: ry1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001KBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J \u0010%\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010\"J\u001f\u0010(\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010)J\u001f\u0010,\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b.\u0010\"J\u001f\u00100\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J%\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00162\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u0002090\u00162\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020A2\u0006\u0010@\u001a\u000207H\u0002¢\u0006\u0004\bB\u0010CJ \u0010G\u001a\u00020F2\u0006\u0010@\u001a\u0002072\u0006\u0010E\u001a\u00020DH\u0082@¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020AH\u0082@¢\u0006\u0004\bI\u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006]"}, m65681d2 = {"Lry1/b;", "", "Ldj0/b;", "cognitoAuthApi", "Ldj0/v;", "mfaChallengeRepository", "Lod1/a0;", "userSessionManager", "Ly92/a;", "authManager", "Lwy1/d;", "mfaTokenRefresher", "Lpy1/a;", "mfaAnalyticsHelper", "Ljava/time/Clock;", "clock", "Lkotlin/time/Duration;", "loadingDelay", "Ltr2/n;", "logger", "<init>", "(Ldj0/b;Ldj0/v;Lod1/a0;Ly92/a;Lwy1/d;Lpy1/a;Ljava/time/Clock;JLtr2/n;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lec3/l;", "Lty1/j;", "upstream", "Lry1/a;", "A", "(Lec3/l;)Lec3/l;", "domainState", "Lry1/b$a$e;", "internalDomainAction", "z", "(Lry1/a;Lry1/b$a$e;Lq83/d;)Ljava/lang/Object;", "s", "(Lry1/a;)Lry1/a;", "Ldj0/h$b;", "challengeResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lry1/a;Ldj0/h$b;Lq83/d;)Ljava/lang/Object;", "u", "r", "(Lry1/a;Lry1/b$a$e;)Lry1/a;", "q", "Lry1/b$a$d;", "y", "(Lry1/a;Lry1/b$a$d;)Lry1/a;", "x", "Lry1/b$a$b;", "t", "(Lry1/a;Lry1/b$a$b;)Lry1/a;", "Lry1/b$a$a;", "p", "(Lry1/a;Lry1/b$a$a;)Lry1/a;", "Ljava/time/Instant;", "lastCodeSentAt", "", "source", "Lry1/b$a;", "D", "(Ljava/time/Instant;Ljava/lang/String;)Lec3/l;", "Lty1/j$c;", NotificationCompat.CATEGORY_EVENT, "E", "(Lty1/j$c;)Lec3/l;", "code", "", "B", "(Ljava/lang/String;)Z", "Ldj0/u$a;", "challengeData", "Ldj0/h;", "v", "(Ljava/lang/String;Ldj0/u$a;Lq83/d;)Ljava/lang/Object;", "C", "(Lq83/d;)Ljava/lang/Object;", "a", "Ldj0/b;", "b", "Ldj0/v;", "c", "Lod1/a0;", "d", "Ly92/a;", "e", "Lwy1/d;", "f", "Lpy1/a;", "g", "Ljava/time/Clock;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "J", "i", "Ltr2/n;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31911b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12086v mfaChallengeRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37697d mfaTokenRefresher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C29622a mfaAnalyticsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long loadingDelay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ry1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lry1/b$a;", "", "a", "d", "e", "f", "c", "b", "Lry1/b$a$a;", "Lry1/b$a$b;", "Lry1/b$a$c;", "Lry1/b$a$d;", "Lry1/b$a$e;", "Lry1/b$a$f;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ry1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lry1/b$a$a;", "Lry1/b$a;", "Lty1/j;", "viewEvent", "<init>", "(Lty1/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lty1/j;", "()Lty1/j;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42309a implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC34265j viewEvent;

            public C42309a(InterfaceC34265j viewEvent) {
                AbstractC22676k.m65750j(viewEvent, "viewEvent");
                this.viewEvent = viewEvent;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC34265j getViewEvent() {
                return this.viewEvent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42309a) && AbstractC22676k.m65745e(this.viewEvent, ((C42309a) other).viewEvent);
            }

            public int hashCode() {
                return this.viewEvent.hashCode();
            }

            public String toString() {
                return "HandleEvent(viewEvent=" + this.viewEvent + ")";
            }
        }

        /* JADX INFO: renamed from: ry1.b$a$b */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lry1/b$a$b;", "Lry1/b$a;", "", "result", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean result;

            public b(boolean z4) {
                this.result = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && this.result == ((b) other).result;
            }

            public int hashCode() {
                return Boolean.hashCode(this.result);
            }

            public String toString() {
                return AbstractC3855a.m11827k("HandleResendFinished(result=", ")", this.result);
            }
        }

        /* JADX INFO: renamed from: ry1.b$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lry1/b$a$c;", "Lry1/b$a;", "<init>", "()V", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f132489a = new c();

            private c() {
            }
        }

        /* JADX INFO: renamed from: ry1.b$a$d */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lry1/b$a$d;", "Lry1/b$a;", "", "code", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String code;

            public d(String code) {
                AbstractC22676k.m65750j(code, "code");
                this.code = code;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && AbstractC22676k.m65745e(this.code, ((d) other).code);
            }

            public int hashCode() {
                return this.code.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("StartSubmit(code=", this.code, ")");
            }
        }

        /* JADX INFO: renamed from: ry1.b$a$e */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lry1/b$a$e;", "Lry1/b$a;", "Ldj0/h;", "result", "<init>", "(Ldj0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldj0/h;", "()Ldj0/h;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC12072h result;

            public e(InterfaceC12072h result) {
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC12072h getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && AbstractC22676k.m65745e(this.result, ((e) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "SubmitFinished(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: ry1.b$a$f */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lry1/b$a$f;", "Lry1/b$a;", "<init>", "()V", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class f implements a {

            /* JADX INFO: renamed from: a */
            public static final f f132492a = new f();

            private f() {
            }
        }
    }

    /* JADX INFO: renamed from: ry1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor", m100430f = "MfaChallengeInteractor.kt", m100431l = {464, 475, 531, 532}, m100432m = "handleSetupVerification", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f132493E;

        /* JADX INFO: renamed from: F */
        boolean f132494F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f132495G;

        /* JADX INFO: renamed from: I */
        int f132497I;

        /* JADX INFO: renamed from: w */
        Object f132498w;

        /* JADX INFO: renamed from: x */
        Object f132499x;

        /* JADX INFO: renamed from: y */
        Object f132500y;

        /* JADX INFO: renamed from: z */
        Object f132501z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132495G = obj;
            this.f132497I |= Integer.MIN_VALUE;
            return C31911b.this.m99260v(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ry1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor", m100430f = "MfaChallengeInteractor.kt", m100431l = {137}, m100432m = "handleSignInSuccess", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f132502E;

        /* JADX INFO: renamed from: w */
        Object f132503w;

        /* JADX INFO: renamed from: x */
        Object f132504x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f132505y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132505y = obj;
            this.f132502E |= Integer.MIN_VALUE;
            return C31911b.this.m99261w(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ry1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MfaChallengeInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f132507w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f132508x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f132509y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C31911b f132510z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C31911b c31911b) {
            super(3, interfaceC30057d);
            this.f132510z = c31911b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC34265j interfaceC34265j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f132510z);
            dVar.f132508x = interfaceC13062m;
            dVar.f132509y = interfaceC34265j;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132507w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f132508x;
                InterfaceC34265j interfaceC34265j = (InterfaceC34265j) this.f132509y;
                if (interfaceC34265j instanceof InterfaceC34265j.c) {
                    c0456u = this.f132510z.m99238E((InterfaceC34265j.c) interfaceC34265j);
                } else if (interfaceC34265j instanceof InterfaceC34265j.d) {
                    InterfaceC34265j.d dVar = (InterfaceC34265j.d) interfaceC34265j;
                    c0456u = this.f132510z.m99237D(dVar.getLastCodeSentAt(), dVar.getSource());
                } else {
                    c0456u = new C0456u(new a.C42309a(interfaceC34265j), 1);
                }
                this.f132508x = null;
                this.f132509y = null;
                this.f132507w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC34265j) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ry1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$interact$2", m100430f = "MfaChallengeInteractor.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lry1/a;", "domainState", "Lry1/b$a;", "internalDomainAction", "<anonymous>", "(Lry1/a;Lry1/b$a;)Lry1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f132511w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132512x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f132513y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C31910a c31910a, a aVar, InterfaceC30057d<? super C31910a> interfaceC30057d) {
            e eVar = C31911b.this.new e(interfaceC30057d);
            eVar.f132512x = c31910a;
            eVar.f132513y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C31910a c31910a = (C31910a) this.f132512x;
            a aVar = (a) this.f132513y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132511w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (aVar instanceof a.C42309a) {
                    return C31911b.this.m99254p(c31910a, (a.C42309a) aVar);
                }
                if (aVar instanceof a.b) {
                    return C31911b.this.m99258t(c31910a, (a.b) aVar);
                }
                if (AbstractC22676k.m65745e(aVar, a.c.f132489a)) {
                    return C31911b.this.m99262x(c31910a);
                }
                if (aVar instanceof a.d) {
                    return C31911b.this.m99263y(c31910a, (a.d) aVar);
                }
                if (!(aVar instanceof a.e)) {
                    if (AbstractC22676k.m65745e(aVar, a.f.f132492a)) {
                        return C31911b.this.m99257s(c31910a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                this.f132512x = null;
                this.f132513y = null;
                this.f132511w = 1;
                obj = C31911b.this.m99264z(c31910a, (a.e) aVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C31910a) obj;
        }
    }

    /* JADX INFO: renamed from: ry1.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$resend$1", m100430f = "MfaChallengeInteractor.kt", m100431l = {406}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lry1/b$a$f;", "it", "Ll83/a0;", "<anonymous>", "(Lry1/b$a$f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132515w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a.f fVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(fVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132515w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(500, DurationUnit.MILLISECONDS);
                this.f132515w = 1;
                if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ry1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$resend$3", m100430f = "MfaChallengeInteractor.kt", m100431l = {421, 564}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lry1/b$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        long f132517w;

        /* JADX INFO: renamed from: x */
        int f132518x;

        /* JADX INFO: renamed from: y */
        int f132519y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f132520z;

        /* JADX INFO: renamed from: ry1.b$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$resend$3$invokeSuspend$$inlined$withMinimumDelayOf-KLykuaI$1", m100430f = "MfaChallengeInteractor.kt", m100431l = {44, 45, 46, 39}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ long f132521E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ C31911b f132522F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC13062m f132523G;

            /* JADX INFO: renamed from: H */
            Object f132524H;

            /* JADX INFO: renamed from: I */
            Object f132525I;

            /* JADX INFO: renamed from: J */
            int f132526J;

            /* JADX INFO: renamed from: K */
            boolean f132527K;

            /* JADX INFO: renamed from: w */
            Object f132528w;

            /* JADX INFO: renamed from: x */
            Object f132529x;

            /* JADX INFO: renamed from: y */
            int f132530y;

            /* JADX INFO: renamed from: z */
            private /* synthetic */ Object f132531z;

            /* JADX INFO: renamed from: ry1.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.util.KotlinUtilsKt$withMinimumDelayOf$3$minimumDelay$1", m100430f = "KotlinUtils.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C42310a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f132532w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ long f132533x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42310a(long j7, InterfaceC30057d interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f132533x = j7;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C42310a(this.f132533x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C42310a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f132532w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        long j7 = this.f132533x;
                        this.f132532w = 1;
                        if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j7, InterfaceC30057d interfaceC30057d, C31911b c31911b, InterfaceC13062m interfaceC13062m) {
                super(2, interfaceC30057d);
                this.f132521E = j7;
                this.f132522F = c31911b;
                this.f132523G = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f132521E, interfaceC30057d, this.f132522F, this.f132523G);
                aVar.f132531z = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00f1 A[RETURN] */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3018i0 interfaceC3018i0M8711e;
                int i13;
                InterfaceC3018i0 interfaceC3018i0;
                InterfaceC13062m interfaceC13062m;
                a.b bVar;
                C23454a0 c23454a0;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f132531z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f132530y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC3018i0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C42310a(this.f132521E, null), 3);
                    C39352a c39352a = this.f132522F.authManager;
                    this.f132531z = null;
                    this.f132528w = interfaceC3018i0M8711e;
                    this.f132529x = null;
                    this.f132524H = null;
                    i13 = 0;
                    this.f132526J = 0;
                    this.f132530y = 1;
                    obj = c39352a.m125478a(this);
                    if (obj != enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i14 == 1) {
                    i13 = this.f132526J;
                    interfaceC3018i0M8711e = (InterfaceC3018i0) this.f132528w;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i14 == 2) {
                        i13 = this.f132526J;
                        interfaceC3018i0M8711e = (InterfaceC3018i0) this.f132528w;
                        AbstractC34132o.m107864I(obj);
                        InterfaceC3018i0 interfaceC3018i1 = interfaceC3018i0M8711e;
                        int i15 = i13;
                        interfaceC3018i0 = interfaceC3018i1;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        interfaceC13062m = this.f132523G;
                        bVar = new a.b(zBooleanValue);
                        this.f132531z = null;
                        this.f132528w = interfaceC3018i0;
                        this.f132529x = null;
                        this.f132524H = null;
                        this.f132525I = null;
                        this.f132526J = i15;
                        this.f132527K = zBooleanValue;
                        this.f132530y = 3;
                        if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                        }
                        return enumC31071a;
                    }
                    if (i14 != 3) {
                        if (i14 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C23454a0 c23454a1 = (C23454a0) this.f132529x;
                        AbstractC34132o.m107864I(obj);
                        return c23454a1;
                    }
                    interfaceC3018i0 = (InterfaceC3018i0) this.f132528w;
                    AbstractC34132o.m107864I(obj);
                }
                this.f132531z = null;
                this.f132528w = null;
                c23454a0 = C23454a0.f92919a;
                this.f132529x = c23454a0;
                this.f132524H = null;
                this.f132525I = null;
                this.f132530y = 4;
                if (interfaceC3018i0.await(this) != enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
                AuthMaterial authMaterial = (AuthMaterial) obj;
                String accessToken = authMaterial != null ? authMaterial.getAccessToken() : null;
                C12066b c12066b = this.f132522F.cognitoAuthApi;
                this.f132531z = null;
                this.f132528w = interfaceC3018i0M8711e;
                this.f132529x = null;
                this.f132524H = null;
                this.f132525I = null;
                this.f132526J = i13;
                this.f132530y = 2;
                obj = c12066b.m33301F(accessToken, this);
                if (obj != enumC31071a) {
                    InterfaceC3018i0 interfaceC3018i2 = interfaceC3018i0M8711e;
                    int i16 = i13;
                    interfaceC3018i0 = interfaceC3018i2;
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    interfaceC13062m = this.f132523G;
                    bVar = new a.b(zBooleanValue2);
                    this.f132531z = null;
                    this.f132528w = interfaceC3018i0;
                    this.f132529x = null;
                    this.f132524H = null;
                    this.f132525I = null;
                    this.f132526J = i16;
                    this.f132527K = zBooleanValue2;
                    this.f132530y = 3;
                    if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                        this.f132531z = null;
                        this.f132528w = null;
                        c23454a0 = C23454a0.f92919a;
                        this.f132529x = c23454a0;
                        this.f132524H = null;
                        this.f132525I = null;
                        this.f132530y = 4;
                        if (interfaceC3018i0.await(this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
                return enumC31071a;
            }
        }

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C31911b.this.new g(interfaceC30057d);
            gVar.f132520z = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (bc3.AbstractC3006f0.m8719m(r1, r8) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f132520z
                r6 = r0
                ec3.m r6 = (ec3.InterfaceC13062m) r6
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f132519y
                r7 = 2
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 == r2) goto L1d
                if (r1 != r7) goto L15
                p505ts.AbstractC34132o.m107864I(r9)
                goto L50
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L31
            L21:
                p505ts.AbstractC34132o.m107864I(r9)
                ry1.b$a$c r9 = ry1.C31911b.a.c.f132489a
                r8.f132520z = r6
                r8.f132519y = r2
                java.lang.Object r9 = r6.emit(r9, r8)
                if (r9 != r0) goto L31
                goto L4f
            L31:
                ry1.b r9 = ry1.C31911b.this
                long r2 = ry1.C31911b.m99241c(r9)
                ry1.b r5 = ry1.C31911b.this
                ry1.b$g$a r1 = new ry1.b$g$a
                r4 = 0
                r1.<init>(r2, r4, r5, r6)
                r9 = 0
                r8.f132520z = r9
                r8.f132517w = r2
                r9 = 0
                r8.f132518x = r9
                r8.f132519y = r7
                java.lang.Object r9 = bc3.AbstractC3006f0.m8719m(r1, r8)
                if (r9 != r0) goto L50
            L4f:
                return r0
            L50:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ry1.C31911b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ry1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$submit$1", m100430f = "MfaChallengeInteractor.kt", m100431l = {432, 564, 455}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lry1/b$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f132534E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC34265j.c f132535F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C31911b f132536G;

        /* JADX INFO: renamed from: w */
        Object f132537w;

        /* JADX INFO: renamed from: x */
        long f132538x;

        /* JADX INFO: renamed from: y */
        int f132539y;

        /* JADX INFO: renamed from: z */
        int f132540z;

        /* JADX INFO: renamed from: ry1.b$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.mfa.challenge.domain.MfaChallengeInteractor$submit$1$invokeSuspend$$inlined$withMinimumDelayOf-KLykuaI$1", m100430f = "MfaChallengeInteractor.kt", m100431l = {47, 51, 39}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ long f132541E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ C31911b f132542F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ InterfaceC34265j.c f132543G;

            /* JADX INFO: renamed from: H */
            Object f132544H;

            /* JADX INFO: renamed from: I */
            Object f132545I;

            /* JADX INFO: renamed from: J */
            int f132546J;

            /* JADX INFO: renamed from: w */
            Object f132547w;

            /* JADX INFO: renamed from: x */
            Object f132548x;

            /* JADX INFO: renamed from: y */
            int f132549y;

            /* JADX INFO: renamed from: z */
            private /* synthetic */ Object f132550z;

            /* JADX INFO: renamed from: ry1.b$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.util.KotlinUtilsKt$withMinimumDelayOf$3$minimumDelay$1", m100430f = "KotlinUtils.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C42311a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f132551w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ long f132552x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42311a(long j7, InterfaceC30057d interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f132552x = j7;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C42311a(this.f132552x, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C42311a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f132551w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        long j7 = this.f132552x;
                        this.f132551w = 1;
                        if (AbstractC3034m0.m8783c(j7, this) == enumC31071a) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j7, InterfaceC30057d interfaceC30057d, C31911b c31911b, InterfaceC34265j.c cVar) {
                super(2, interfaceC30057d);
                this.f132541E = j7;
                this.f132542F = c31911b;
                this.f132543G = cVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f132541E, interfaceC30057d, this.f132542F, this.f132543G);
                aVar.f132550z = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC12072h> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3018i0 interfaceC3018i0M8711e;
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f132550z;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f132549y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC3018i0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C42311a(this.f132541E, null), 3);
                    InterfaceC12085u interfaceC12085u = (InterfaceC12085u) ((C13045h2) this.f132542F.mfaChallengeRepository.getChallengeData()).getValue();
                    if (interfaceC12085u instanceof InterfaceC12085u.b) {
                        this.f132542F.logger.mo85228t("Completing sign-in MFA challenge", new AbstractC30556a.a[0]);
                        C12066b c12066b = this.f132542F.cognitoAuthApi;
                        String code = this.f132543G.getCode();
                        this.f132550z = null;
                        this.f132547w = interfaceC3018i0M8711e;
                        this.f132548x = null;
                        this.f132544H = null;
                        this.f132545I = null;
                        this.f132546J = 0;
                        this.f132549y = 1;
                        obj = c12066b.m33309t(code, this);
                        if (obj != enumC31071a) {
                        }
                    } else if (interfaceC12085u instanceof InterfaceC12085u.a) {
                        this.f132542F.logger.mo85228t("Completing setup MFA verification", new AbstractC30556a.a[0]);
                        this.f132550z = null;
                        this.f132547w = interfaceC3018i0M8711e;
                        this.f132548x = null;
                        this.f132544H = null;
                        this.f132545I = null;
                        this.f132546J = 0;
                        this.f132549y = 2;
                        obj = this.f132542F.m99260v(this.f132543G.getCode(), (InterfaceC12085u.a) interfaceC12085u, this);
                        if (obj != enumC31071a) {
                        }
                    } else {
                        if (interfaceC12085u != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f132542F.logger.mo85222m("No challenge data available for submission", new AbstractC30556a.a[0]);
                        obj = new InterfaceC12070f.c(new IllegalStateException("No challenge data"), "NoChallengeData", -1);
                    }
                }
                if (i13 != 1 && i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f132548x;
                    AbstractC34132o.m107864I(obj);
                    return obj2;
                }
                interfaceC3018i0M8711e = (InterfaceC3018i0) this.f132547w;
                AbstractC34132o.m107864I(obj);
                this.f132550z = null;
                this.f132547w = null;
                this.f132548x = obj;
                this.f132544H = null;
                this.f132545I = null;
                this.f132549y = 3;
                return interfaceC3018i0M8711e.await(this) == enumC31071a ? enumC31071a : obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC34265j.c cVar, C31911b c31911b, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132535F = cVar;
            this.f132536G = c31911b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f132535F, this.f132536G, interfaceC30057d);
            hVar.f132534E = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
        
            if (r0.emit(r2, r14) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f132534E
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f132540z
                r3 = 3
                r4 = 1
                r5 = 2
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L27
                if (r2 == r5) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r14.f132537w
                dj0.h r0 = (dj0.InterfaceC12072h) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto L7d
            L1b:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L23:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L68
            L27:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L44
            L2b:
                p505ts.AbstractC34132o.m107864I(r15)
                ry1.b$a$d r15 = new ry1.b$a$d
                ty1.j$c r2 = r14.f132535F
                java.lang.String r2 = r2.getCode()
                r15.<init>(r2)
                r14.f132534E = r0
                r14.f132540z = r4
                java.lang.Object r15 = r0.emit(r15, r14)
                if (r15 != r1) goto L44
                goto L7c
            L44:
                ry1.b r15 = r14.f132536G
                long r6 = ry1.C31911b.m99241c(r15)
                long r9 = p715kotlin.time.Duration.m134293timesUwyO8pc(r6, r5)
                ry1.b r12 = r14.f132536G
                ty1.j$c r13 = r14.f132535F
                ry1.b$h$a r8 = new ry1.b$h$a
                r11 = 0
                r8.<init>(r9, r11, r12, r13)
                r14.f132534E = r0
                r14.f132538x = r9
                r15 = 0
                r14.f132539y = r15
                r14.f132540z = r5
                java.lang.Object r15 = bc3.AbstractC3006f0.m8719m(r8, r14)
                if (r15 != r1) goto L68
                goto L7c
            L68:
                dj0.h r15 = (dj0.InterfaceC12072h) r15
                ry1.b$a$e r2 = new ry1.b$a$e
                r2.<init>(r15)
                r15 = 0
                r14.f132534E = r15
                r14.f132537w = r15
                r14.f132540z = r3
                java.lang.Object r15 = r0.emit(r2, r14)
                if (r15 != r1) goto L7d
            L7c:
                return r1
            L7d:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: ry1.C31911b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ C31911b(C12066b c12066b, C12086v c12086v, InterfaceC27837a0 interfaceC27837a0, C39352a c39352a, C37697d c37697d, C29622a c29622a, Clock clock, long j7, InterfaceC34116n interfaceC34116n, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12066b, c12086v, interfaceC27837a0, c39352a, c37697d, c29622a, clock, j7, interfaceC34116n);
    }

    /* JADX INFO: renamed from: B */
    private final boolean m99235B(String code) {
        return code.length() > 0;
    }

    /* JADX INFO: renamed from: C */
    private final Object m99236C(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.mfaTokenRefresher.m121142b(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC13058l m99237D(Instant lastCodeSentAt, String source) {
        Instant instantNow = Instant.now(this.clock);
        if (AbstractC22676k.m65745e(lastCodeSentAt, Instant.EPOCH)) {
            this.logger.mo85216g("User requesting resend code for the first time", new AbstractC30556a.a[0]);
        } else {
            long seconds = java.time.Duration.between(lastCodeSentAt, instantNow).getSeconds();
            if (lastCodeSentAt.plusSeconds(30L).isAfter(instantNow)) {
                this.logger.mo85222m(AbstractC31061c.m95636l(seconds, "User only waited ", " seconds before trying to resend code"), new AbstractC30556a.a[0]);
                return new C13052j1(new C0456u(a.f.f132492a, 1), new f(null), 0);
            }
            this.logger.mo85216g(AbstractC31061c.m95636l(seconds, "User waited ", " seconds before resending code an additional time."), new AbstractC30556a.a[0]);
        }
        InterfaceC12085u interfaceC12085u = (InterfaceC12085u) ((C13045h2) this.mfaChallengeRepository.getChallengeData()).getValue();
        if (interfaceC12085u != null) {
            this.mfaAnalyticsHelper.m91025o(AbstractC29623b.m91035b(interfaceC12085u), source, AbstractC29623b.m91034a(interfaceC12085u));
        }
        return new C13084s1(new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final InterfaceC13058l m99238E(InterfaceC34265j.c event) {
        return new C13084s1(new h(event, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C31910a m99254p(C31910a domainState, a.C42309a internalDomainAction) {
        String deliveryMedium;
        InterfaceC34265j viewEvent = internalDomainAction.getViewEvent();
        if (!(viewEvent instanceof InterfaceC34265j.a)) {
            if (viewEvent instanceof InterfaceC34265j.b) {
                String code = ((InterfaceC34265j.b) internalDomainAction.getViewEvent()).getCode();
                return C31910a.m99220b(domainState, code, false, new InterfaceC34256a.b(null, m99235B(code), 1, null), false, InterfaceC34267l.b.f143746a, false, null, null, null, false, 0.0f, null, null, 8170, null);
            }
            if (viewEvent instanceof InterfaceC34265j.c) {
                throw new IllegalStateException();
            }
            if (viewEvent instanceof InterfaceC34265j.d) {
                throw new IllegalStateException();
            }
            throw new NoWhenBranchMatchedException();
        }
        String source = ((InterfaceC34265j.a) internalDomainAction.getViewEvent()).getSource();
        this.logger.mo85228t(AbstractC11266d.m30461o("Handling Init event from ", source), new AbstractC30556a.a[0]);
        InterfaceC12085u interfaceC12085u = (InterfaceC12085u) ((C13045h2) this.mfaChallengeRepository.getChallengeData()).getValue();
        if (interfaceC12085u instanceof InterfaceC12085u.b) {
            InterfaceC12085u.b bVar = (InterfaceC12085u.b) interfaceC12085u;
            this.logger.mo85228t(AbstractC31061c.m95640p("Sign-in challenge data available, initializing with ", bVar.getChallengeName(), " ", AbstractC25265s.m74110N0(bVar.m33342b().entrySet(), null, null, null, null, 63)), new AbstractC30556a.a[0]);
            this.mfaAnalyticsHelper.m91027q(AbstractC29623b.m91035b(interfaceC12085u), source, AbstractC29623b.m91034a(interfaceC12085u));
            boolean zM65745e = AbstractC22676k.m65745e(bVar.getChallengeName(), "EMAIL_OTP");
            String str = bVar.m33342b().get("CODE_DELIVERY_DESTINATION");
            String str2 = str == null ? "" : str;
            InterfaceC34256a.b bVar2 = new InterfaceC34256a.b(null, false, 3, null);
            InterfaceC34267l.b bVar3 = InterfaceC34267l.b.f143746a;
            Instant EPOCH = Instant.EPOCH;
            AbstractC22676k.m65749i(EPOCH, "EPOCH");
            return new C31910a(null, false, bVar2, false, bVar3, zM65745e, bVar, str2, EPOCH, false, ((InterfaceC34265j.a) internalDomainAction.getViewEvent()).getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), null, source, 2571, null);
        }
        if (!(interfaceC12085u instanceof InterfaceC12085u.a)) {
            if (interfaceC12085u != null) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85228t("No challenge data available, showing error state", new AbstractC30556a.a[0]);
            return new C31910a(null, false, new InterfaceC34256a.b(null, false, 1, null), false, InterfaceC34267l.c.f143757a, false, null, null, null, false, ((InterfaceC34265j.a) internalDomainAction.getViewEvent()).getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), null, source, 3051, null);
        }
        InterfaceC12085u.a aVar = (InterfaceC12085u.a) interfaceC12085u;
        this.logger.mo85228t("Setup challenge data available, initializing with delivery info: " + aVar.getCodeDeliveryInfo(), new AbstractC30556a.a[0]);
        C12065a codeDeliveryInfo = aVar.getCodeDeliveryInfo();
        this.mfaAnalyticsHelper.m91029t(AbstractC29623b.m91035b(interfaceC12085u), source);
        boolean z4 = (codeDeliveryInfo == null || (deliveryMedium = codeDeliveryInfo.getDeliveryMedium()) == null || !deliveryMedium.equalsIgnoreCase("EMAIL")) ? false : true;
        String destination = codeDeliveryInfo != null ? codeDeliveryInfo.getDestination() : null;
        String str3 = destination == null ? "" : destination;
        InterfaceC34256a.b bVar4 = new InterfaceC34256a.b(null, false, 1, null);
        InterfaceC34267l.b bVar5 = InterfaceC34267l.b.f143746a;
        Instant EPOCH2 = Instant.EPOCH;
        AbstractC22676k.m65749i(EPOCH2, "EPOCH");
        return new C31910a(null, false, bVar4, false, bVar5, z4, aVar, str3, EPOCH2, false, ((InterfaceC34265j.a) internalDomainAction.getViewEvent()).getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), null, source, 2571, null);
    }

    /* JADX INFO: renamed from: q */
    private final C31910a m99255q(C31910a domainState, a.e internalDomainAction) {
        InterfaceC12085u challengeData;
        InterfaceC12072h result = internalDomainAction.getResult();
        if (result instanceof InterfaceC12070f.a) {
            InterfaceC12085u challengeData2 = domainState.getChallengeData();
            if (challengeData2 != null) {
                this.mfaAnalyticsHelper.m91015c(AbstractC29623b.m91035b(challengeData2), domainState.getSource(), AbstractC29623b.m91034a(challengeData2));
            }
        } else if ((result instanceof InterfaceC12070f.b) && (challengeData = domainState.getChallengeData()) != null) {
            this.mfaAnalyticsHelper.m91016d(AbstractC29623b.m91035b(challengeData), domainState.getSource(), AbstractC29623b.m91034a(challengeData));
        }
        return C31910a.m99220b(domainState, null, true, new InterfaceC34256a.b(null, false, 1, null), true, InterfaceC34267l.a.f143734a, false, null, null, null, false, 0.0f, EnumC38705f.FAILURE, null, 6113, null);
    }

    /* JADX INFO: renamed from: r */
    private final C31910a m99256r(C31910a domainState, a.e internalDomainAction) {
        InterfaceC12085u challengeData = domainState.getChallengeData();
        if (challengeData != null) {
            InterfaceC12072h result = internalDomainAction.getResult();
            String str = "server";
            if (!(result instanceof InterfaceC12070f.c) && AbstractC22676k.m65745e(result, C12071g.f40182a)) {
                str = "network";
            }
            this.mfaAnalyticsHelper.m91018f("challenge_screen", str, AbstractC29623b.m91035b(challengeData), domainState.getSource(), AbstractC29623b.m91034a(challengeData));
        }
        return C31910a.m99220b(domainState, null, true, new InterfaceC34256a.b(AbstractC8693b.m21277k(AbstractC29625d.f120987a), m99235B(domainState.getCode())), true, InterfaceC34267l.c.f143757a, false, null, null, null, false, 0.0f, EnumC38705f.FAILURE, null, 6113, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final C31910a m99257s(C31910a domainState) {
        boolean zM99235B = m99235B(domainState.getCode());
        InterfaceC12085u challengeData = domainState.getChallengeData();
        if (challengeData != null) {
            this.mfaAnalyticsHelper.m91026p(AbstractC29623b.m91035b(challengeData), domainState.getSource(), AbstractC29623b.m91034a(challengeData));
        }
        return C31910a.m99220b(domainState, null, true, new InterfaceC34256a.b(null, zM99235B, 1, null), true, InterfaceC34267l.d.f143769a, false, null, null, null, false, 0.0f, null, null, 8161, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final C31910a m99258t(C31910a domainState, a.b internalDomainAction) {
        boolean zM99235B = m99235B(domainState.getCode());
        return internalDomainAction.getResult() ? C31910a.m99220b(domainState, null, true, new InterfaceC34256a.b(null, zM99235B, 1, null), true, InterfaceC34267l.b.f143746a, false, null, null, null, false, 0.0f, null, null, 7649, null) : C31910a.m99220b(domainState, null, true, new InterfaceC34256a.b(null, zM99235B, 1, null), true, InterfaceC34267l.b.f143746a, false, null, null, null, false, 0.0f, null, null, 7649, null);
    }

    /* JADX INFO: renamed from: u */
    private final C31910a m99259u(C31910a domainState) {
        this.logger.mo85216g("MFA setup challenge completed successfully", new AbstractC30556a.a[0]);
        InterfaceC12085u challengeData = domainState.getChallengeData();
        if (challengeData != null) {
            this.mfaAnalyticsHelper.m91033x(AbstractC29623b.m91035b(challengeData), domainState.getSource());
        }
        this.mfaChallengeRepository.m33347b();
        return C31910a.m99220b(domainState, null, false, new InterfaceC34256a.b(null, false, 1, null), false, InterfaceC34267l.b.f143746a, false, null, null, null, true, 0.0f, EnumC38705f.IDLE, null, 5537, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x0125 A[PHI: r14
      0x0125: PHI (r14v32 java.lang.Object) = (r14v29 java.lang.Object), (r14v1 java.lang.Object) binds: [B:47:0x0122, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        if (r14 == r1) goto L53;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m99260v(java.lang.String r12, dj0.InterfaceC12085u.a r13, q83.InterfaceC30057d<? super dj0.InterfaceC12072h> r14) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry1.C31911b.m99260v(java.lang.String, dj0.u$a, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: w */
    public final Object m99261w(C31910a c31910a, InterfaceC12072h.b bVar, InterfaceC30057d<? super C31910a> interfaceC30057d) {
        c cVar;
        C31910a c31910a2;
        C31910a c31910a3;
        boolean z4;
        C31910a c31910a4;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f132502E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f132502E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f132505y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f132502E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                InterfaceC27837a0 interfaceC27837a0 = this.userSessionManager;
                C14527a material = bVar.getMaterial();
                c31910a2 = c31910a;
                try {
                    cVar.f132503w = c31910a2;
                    cVar.f132504x = null;
                    cVar.f132502E = 1;
                    if (interfaceC27837a0.mo83916f(material, cVar) == enumC31071a) {
                        return enumC31071a;
                    }
                    c31910a3 = c31910a2;
                    c31910a4 = c31910a3;
                    z4 = true;
                } catch (MissingImportantAppInfoException e5) {
                    e = e5;
                    this.logger.mo85230v(AbstractC11266d.m30461o("Failed to complete mfa challenge: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                    z4 = false;
                    c31910a4 = c31910a2;
                } catch (IOException e13) {
                    e = e13;
                    this.logger.mo85230v(AbstractC11266d.m30461o("Failed to complete mfa challenge: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                    z4 = false;
                    c31910a4 = c31910a2;
                } catch (HttpException e14) {
                    e = e14;
                    this.logger.mo85230v(AbstractC11266d.m30461o("Failed to complete mfa challenge: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                    z4 = false;
                    c31910a4 = c31910a2;
                }
            } catch (MissingImportantAppInfoException e15) {
                e = e15;
                c31910a2 = c31910a;
            } catch (IOException e16) {
                e = e16;
                c31910a2 = c31910a;
            } catch (HttpException e17) {
                e = e17;
                c31910a2 = c31910a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c31910a3 = (C31910a) cVar.f132503w;
            try {
                AbstractC34132o.m107864I(obj);
                c31910a4 = c31910a3;
                z4 = true;
            } catch (MissingImportantAppInfoException e18) {
                e = e18;
                c31910a2 = c31910a3;
                this.logger.mo85230v(AbstractC11266d.m30461o("Failed to complete mfa challenge: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                z4 = false;
                c31910a4 = c31910a2;
            } catch (IOException e19) {
                e = e19;
                c31910a2 = c31910a3;
                this.logger.mo85230v(AbstractC11266d.m30461o("Failed to complete mfa challenge: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                z4 = false;
                c31910a4 = c31910a2;
            } catch (HttpException e22) {
                e = e22;
                c31910a2 = c31910a3;
                this.logger.mo85230v(AbstractC11266d.m30461o("Failed to complete mfa challenge: ", e.getMessage()), e, new AbstractC30556a.a[0]);
                z4 = false;
                c31910a4 = c31910a2;
            }
        }
        if (z4) {
            this.logger.mo85216g("MFA challenge and mission critical fetch complete", new AbstractC30556a.a[0]);
            this.mfaChallengeRepository.m33347b();
            return C31910a.m99220b(c31910a4, null, false, new InterfaceC34256a.b(null, false, 1, null), false, InterfaceC34267l.b.f143746a, false, null, null, null, true, 0.0f, EnumC38705f.IDLE, null, 5537, null);
        }
        this.mfaAnalyticsHelper.m91017e("welcome_screen", "sign_in", "Auth Flow");
        boolean zM99235B = m99235B(c31910a4.getCode());
        this.logger.mo85216g("Completed MFA challenge but mission critical fetches failed", new AbstractC30556a.a[0]);
        return C31910a.m99220b(c31910a4, null, true, new InterfaceC34256a.b(AbstractC8693b.m21277k(AbstractC29625d.f120992f), zM99235B), true, InterfaceC34267l.c.f143757a, false, null, null, null, false, 0.0f, EnumC38705f.FAILURE, null, 6113, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final C31910a m99262x(C31910a domainState) {
        InterfaceC34256a.a aVar = InterfaceC34256a.a.f143675a;
        InterfaceC34267l.b bVar = InterfaceC34267l.b.f143746a;
        Instant instantNow = Instant.now(this.clock);
        AbstractC22676k.m65749i(instantNow, "now(...)");
        return C31910a.m99220b(domainState, null, false, aVar, false, bVar, false, null, null, instantNow, false, 0.0f, null, null, 7393, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final C31910a m99263y(C31910a domainState, a.d internalDomainAction) {
        InterfaceC12085u challengeData = domainState.getChallengeData();
        if (challengeData != null) {
            this.mfaAnalyticsHelper.m91019g(AbstractC29623b.m91035b(challengeData), domainState.getSource(), AbstractC29623b.m91034a(challengeData));
        }
        return C31910a.m99220b(domainState, internalDomainAction.getCode(), false, InterfaceC34256a.a.f143675a, false, InterfaceC34267l.b.f143746a, false, null, null, null, false, 0.0f, EnumC38705f.LOADING, null, 5600, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final Object m99264z(C31910a c31910a, a.e eVar, InterfaceC30057d<? super C31910a> interfaceC30057d) {
        if (!(eVar.getResult() instanceof InterfaceC12072h.b) && !(eVar.getResult() instanceof InterfaceC12072h.a)) {
            this.logger.mo85216g("Failed to complete MFA challenge", new AbstractC30556a.a[0]);
        }
        InterfaceC12072h result = eVar.getResult();
        if ((result instanceof InterfaceC12070f.a) || (result instanceof InterfaceC12070f.b)) {
            return m99255q(c31910a, eVar);
        }
        if ((result instanceof InterfaceC12070f.c) || AbstractC22676k.m65745e(result, C12071g.f40182a)) {
            return m99256r(c31910a, eVar);
        }
        if (AbstractC22676k.m65745e(result, InterfaceC12072h.a.f40183a)) {
            return m99259u(c31910a);
        }
        if (result instanceof InterfaceC12072h.b) {
            return m99261w(c31910a, (InterfaceC12072h.b) eVar.getResult(), interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC13058l m99265A(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C31910a(null, false, null, false, null, false, null, null, null, false, 0.0f, null, null, 8191, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }

    private C31911b(C12066b cognitoAuthApi, C12086v mfaChallengeRepository, InterfaceC27837a0 userSessionManager, C39352a authManager, C37697d mfaTokenRefresher, C29622a mfaAnalyticsHelper, Clock clock, long j7, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(mfaChallengeRepository, "mfaChallengeRepository");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(mfaTokenRefresher, "mfaTokenRefresher");
        AbstractC22676k.m65750j(mfaAnalyticsHelper, "mfaAnalyticsHelper");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.cognitoAuthApi = cognitoAuthApi;
        this.mfaChallengeRepository = mfaChallengeRepository;
        this.userSessionManager = userSessionManager;
        this.authManager = authManager;
        this.mfaTokenRefresher = mfaTokenRefresher;
        this.mfaAnalyticsHelper = mfaAnalyticsHelper;
        this.clock = clock;
        this.loadingDelay = j7;
        this.logger = logger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C31911b(C12066b c12066b, C12086v c12086v, InterfaceC27837a0 interfaceC27837a0, C39352a c39352a, C37697d c37697d, C29622a c29622a, Clock clock, long j7, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        long duration;
        if ((i13 & 64) != 0) {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
            clock2 = clockSystemDefaultZone;
        } else {
            clock2 = clock;
        }
        if ((i13 & 128) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = DurationKt.toDuration(500, DurationUnit.MILLISECONDS);
        } else {
            duration = j7;
        }
        this(c12066b, c12086v, interfaceC27837a0, c39352a, c37697d, c29622a, clock2, duration, (i13 & 256) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MfaChallengeInteractor") : interfaceC34116n, null);
    }
}
