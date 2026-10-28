package zo0;

import bc3.InterfaceC2994c0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: zo0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001a\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000fJ'\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u001f\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010/\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b'\u0010-¨\u00060"}, m65681d2 = {"Lzo0/d;", "", "Ljava/time/Clock;", "clock", "Lbc3/c0;", "coroutineScope", "<init>", "(Ljava/time/Clock;Lbc3/c0;)V", "Ll83/a0;", "k", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "uuid", "i", "(Ljava/lang/String;)V", "g", "messageId", "f", "", "isBffScreen", "isWcePrefetch", "isBottomSheetVisible", "j", "(ZLjava/lang/Boolean;Z)Z", "Lzo0/d$b;", "a", "()Lzo0/d$b;", "Lep0/e;", "proactiveAnimationState", "b", "(Lep0/e;ZZ)Lzo0/d$b;", "Ljava/time/Clock;", "Lec3/p1;", "Lzo0/d$a;", "Lec3/p1;", "latencyState", "Lec3/f2;", "", "c", "Lec3/f2;", "e", "()Lec3/f2;", "ttfmtStartTimeMs", "d", "()Ljava/lang/String;", "currentMessageId", "currentConversationUuid", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40916d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 latencyState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13037f2 ttfmtStartTimeMs;

    /* JADX INFO: renamed from: zo0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lzo0/d$b;", "", "", "conversationUuid", "messageId", "", "ttfmtMs", "ttpiaMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "d", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String conversationUuid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Long ttfmtMs;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Long ttpiaMs;

        public b(String conversationUuid, String messageId, Long l7, Long l12) {
            AbstractC22676k.m65750j(conversationUuid, "conversationUuid");
            AbstractC22676k.m65750j(messageId, "messageId");
            this.conversationUuid = conversationUuid;
            this.messageId = messageId;
            this.ttfmtMs = l7;
            this.ttpiaMs = l12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getConversationUuid() {
            return this.conversationUuid;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getTtfmtMs() {
            return this.ttfmtMs;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getTtpiaMs() {
            return this.ttpiaMs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.conversationUuid, bVar.conversationUuid) && AbstractC22676k.m65745e(this.messageId, bVar.messageId) && AbstractC22676k.m65745e(this.ttfmtMs, bVar.ttfmtMs) && AbstractC22676k.m65745e(this.ttpiaMs, bVar.ttpiaMs);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.conversationUuid.hashCode() * 31, 31, this.messageId);
            Long l7 = this.ttfmtMs;
            int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
            Long l12 = this.ttpiaMs;
            return iHashCode + (l12 != null ? l12.hashCode() : 0);
        }

        public String toString() {
            String str = this.conversationUuid;
            String str2 = this.messageId;
            Long l7 = this.ttfmtMs;
            Long l12 = this.ttpiaMs;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("MarkSeenPayload(conversationUuid=", str, ", messageId=", str2, ", ttfmtMs=");
            sbM32001t.append(l7);
            sbM32001t.append(", ttpiaMs=");
            sbM32001t.append(l12);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: zo0.d$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176369w;

        /* JADX INFO: renamed from: zo0.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176370w;

            /* JADX INFO: renamed from: zo0.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.LatencyTracker$special$$inlined$map$1$2", m100430f = "LatencyTracker.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42765a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176371E;

                /* JADX INFO: renamed from: F */
                Object f176372F;

                /* JADX INFO: renamed from: G */
                Object f176373G;

                /* JADX INFO: renamed from: H */
                int f176374H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176375w;

                /* JADX INFO: renamed from: x */
                int f176376x;

                /* JADX INFO: renamed from: y */
                Object f176377y;

                public C42765a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176375w = obj;
                    this.f176376x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f176370w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42765a c42765a;
                if (interfaceC30057d instanceof C42765a) {
                    c42765a = (C42765a) interfaceC30057d;
                    int i13 = c42765a.f176376x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42765a.f176376x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42765a = new C42765a(interfaceC30057d);
                    }
                } else {
                    c42765a = new C42765a(interfaceC30057d);
                }
                Object obj2 = c42765a.f176375w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42765a.f176376x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176370w;
                    Long ttfmtStartTimeMs = ((a) obj).getTtfmtStartTimeMs();
                    c42765a.f176377y = null;
                    c42765a.f176371E = null;
                    c42765a.f176372F = null;
                    c42765a.f176373G = null;
                    c42765a.f176374H = 0;
                    c42765a.f176376x = 1;
                    if (interfaceC13062m.emit(ttfmtStartTimeMs, c42765a) == enumC31071a) {
                        return enumC31071a;
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f176369w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176369w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C40916d(Clock clock, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.clock = clock;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new a(null, null, null, false, null, null, 63, null));
        this.latencyState = c13045h2M36593c;
        this.ttfmtStartTimeMs = AbstractC13091v.m36587M(new c(c13045h2M36593c), coroutineScope, C13105z1.f45288a, null);
    }

    /* JADX INFO: renamed from: a */
    public final b m132630a() {
        String currentMessageId;
        C13045h2 c13045h2;
        Object value;
        a aVar = (a) ((C13045h2) this.latencyState).getValue();
        String currentConversationUuid = aVar.getCurrentConversationUuid();
        if (currentConversationUuid == null || (currentMessageId = aVar.getCurrentMessageId()) == null) {
            return null;
        }
        Long ttfmtStopTimeMs = aVar.getTtfmtStopTimeMs();
        Long ttfmtStartTimeMs = aVar.getTtfmtStartTimeMs();
        Long ttpiaStartTimeMs = aVar.getTtpiaStartTimeMs();
        InterfaceC13075p1 interfaceC13075p1 = this.latencyState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, a.m132641b((a) value, null, null, null, true, null, null, 55, null)));
        return new b(currentConversationUuid, currentMessageId, (ttfmtStopTimeMs == null || ttfmtStartTimeMs == null) ? null : Long.valueOf(ttfmtStopTimeMs.longValue() - ttfmtStartTimeMs.longValue()), ttpiaStartTimeMs != null ? Long.valueOf(this.clock.millis() - ttpiaStartTimeMs.longValue()) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (r1.getOnLoadStyle() != ep0.EnumC13400f.PREVIEW) goto L37;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zo0.C40916d.b m132631b(ep0.InterfaceC13399e r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "proactiveAnimationState"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r1, r2)
            ec3.p1 r2 = r0.latencyState
            ec3.h2 r2 = (ec3.C13045h2) r2
            java.lang.Object r2 = r2.getValue()
            zo0.d$a r2 = (zo0.C40916d.a) r2
            boolean r3 = r2.getHasMarkedSeenForCurrentSession()
            r4 = 0
            if (r3 == 0) goto L1b
            return r4
        L1b:
            if (r20 == 0) goto L1e
            return r4
        L1e:
            java.lang.String r3 = r2.getCurrentMessageId()
            if (r3 == 0) goto L99
            java.lang.String r2 = r2.getCurrentConversationUuid()
            if (r2 != 0) goto L2c
            goto L99
        L2c:
            boolean r2 = r1 instanceof ep0.InterfaceC13399e.a
            if (r2 != 0) goto L31
            return r4
        L31:
            java.time.Clock r2 = r0.clock
            long r2 = r2.millis()
            ec3.p1 r5 = r0.latencyState
        L39:
            r6 = r5
            ec3.h2 r6 = (ec3.C13045h2) r6
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            zo0.d$a r8 = (zo0.C40916d.a) r8
            java.lang.Long r9 = r8.getTtfmtStopTimeMs()
            if (r9 != 0) goto L55
            java.lang.Long r9 = r8.getTtfmtStartTimeMs()
            if (r9 == 0) goto L55
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
        L53:
            r11 = r9
            goto L5a
        L55:
            java.lang.Long r9 = r8.getTtfmtStopTimeMs()
            goto L53
        L5a:
            r15 = 59
            r16 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            zo0.d$a r8 = zo0.C40916d.a.m132641b(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r6 = r6.m36569i(r7, r8)
            if (r6 == 0) goto L39
            ec3.p1 r2 = r0.latencyState
            ec3.h2 r2 = (ec3.C13045h2) r2
            java.lang.Object r2 = r2.getValue()
            zo0.d$a r2 = (zo0.C40916d.a) r2
            if (r19 == 0) goto L80
            java.lang.Long r2 = r2.getTtfmtStartTimeMs()
            if (r2 == 0) goto L80
            goto L94
        L80:
            if (r19 == 0) goto L99
            ep0.e$a r1 = (ep0.InterfaceC13399e.a) r1
            ep0.f r2 = r1.getOnLoadStyle()
            ep0.f r3 = ep0.EnumC13400f.GLOW
            if (r2 == r3) goto L94
            ep0.f r1 = r1.getOnLoadStyle()
            ep0.f r2 = ep0.EnumC13400f.PREVIEW
            if (r1 != r2) goto L99
        L94:
            zo0.d$b r1 = r0.m132630a()
            return r1
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zo0.C40916d.m132631b(ep0.e, boolean, boolean):zo0.d$b");
    }

    /* JADX INFO: renamed from: c */
    public final String m132632c() {
        return ((a) ((C13045h2) this.latencyState).getValue()).getCurrentConversationUuid();
    }

    /* JADX INFO: renamed from: d */
    public final String m132633d() {
        return ((a) ((C13045h2) this.latencyState).getValue()).getCurrentMessageId();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC13037f2 getTtfmtStartTimeMs() {
        return this.ttfmtStartTimeMs;
    }

    /* JADX INFO: renamed from: f */
    public final void m132635f(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        long jMillis = this.clock.millis();
        InterfaceC13075p1 interfaceC13075p1 = this.latencyState;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            a aVar = (a) value;
            String str = messageId;
            if (c13045h2.m36569i(value, a.m132641b(aVar, null, null, (aVar.getTtfmtStopTimeMs() != null || aVar.getTtfmtStartTimeMs() == null) ? aVar.getTtfmtStopTimeMs() : Long.valueOf(jMillis), false, str, null, 43, null))) {
                return;
            } else {
                messageId = str;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m132636g() {
        C13045h2 c13045h2;
        Object value;
        long jMillis = this.clock.millis();
        InterfaceC13075p1 interfaceC13075p1 = this.latencyState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, a.m132641b((a) value, Long.valueOf(jMillis), null, null, false, null, null, 62, null)));
    }

    /* JADX INFO: renamed from: h */
    public final void m132637h() {
        InterfaceC13075p1 interfaceC13075p1 = this.latencyState;
        a aVar = new a(null, null, null, false, null, null, 63, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, aVar);
    }

    /* JADX INFO: renamed from: i */
    public final void m132638i(String uuid) {
        AbstractC22676k.m65750j(uuid, "uuid");
        InterfaceC13075p1 interfaceC13075p1 = this.latencyState;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            String str = uuid;
            if (c13045h2.m36569i(value, a.m132641b((a) value, null, null, null, false, null, str, 31, null))) {
                return;
            } else {
                uuid = str;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m132639j(boolean isBffScreen, Boolean isWcePrefetch, boolean isBottomSheetVisible) {
        a aVar = (a) ((C13045h2) this.latencyState).getValue();
        return (isBffScreen || isWcePrefetch == null || !isBottomSheetVisible || aVar.getHasMarkedSeenForCurrentSession() || aVar.getCurrentConversationUuid() == null) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final void m132640k() {
        C13045h2 c13045h2;
        Object value;
        a aVar;
        Long lValueOf;
        Long ttfmtStartTimeMs;
        long jMillis = this.clock.millis();
        InterfaceC13075p1 interfaceC13075p1 = this.latencyState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            aVar = (a) value;
            Long ttpiaStartTimeMs = aVar.getTtpiaStartTimeMs();
            lValueOf = Long.valueOf(ttpiaStartTimeMs != null ? ttpiaStartTimeMs.longValue() : jMillis);
            ttfmtStartTimeMs = aVar.getTtfmtStartTimeMs();
        } while (!c13045h2.m36569i(value, a.m132641b(aVar, lValueOf, Long.valueOf(ttfmtStartTimeMs != null ? ttfmtStartTimeMs.longValue() : jMillis), null, false, null, null, 60, null)));
    }

    /* JADX INFO: renamed from: zo0.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001c\u0010\u0010¨\u0006#"}, m65681d2 = {"Lzo0/d$a;", "", "", "ttpiaStartTimeMs", "ttfmtStartTimeMs", "ttfmtStopTimeMs", "", "hasMarkedSeenForCurrentSession", "", "currentMessageId", "currentConversationUuid", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)Lzo0/d$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/lang/Long;", "b", "f", "c", "g", "d", "Z", "e", "()Z", "Ljava/lang/String;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Long ttpiaStartTimeMs;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Long ttfmtStartTimeMs;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Long ttfmtStopTimeMs;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean hasMarkedSeenForCurrentSession;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String currentMessageId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String currentConversationUuid;

        public a(Long l7, Long l12, Long l13, boolean z4, String str, String str2) {
            this.ttpiaStartTimeMs = l7;
            this.ttfmtStartTimeMs = l12;
            this.ttfmtStopTimeMs = l13;
            this.hasMarkedSeenForCurrentSession = z4;
            this.currentMessageId = str;
            this.currentConversationUuid = str2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m132641b(a aVar, Long l7, Long l12, Long l13, boolean z4, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                l7 = aVar.ttpiaStartTimeMs;
            }
            if ((i13 & 2) != 0) {
                l12 = aVar.ttfmtStartTimeMs;
            }
            if ((i13 & 4) != 0) {
                l13 = aVar.ttfmtStopTimeMs;
            }
            if ((i13 & 8) != 0) {
                z4 = aVar.hasMarkedSeenForCurrentSession;
            }
            if ((i13 & 16) != 0) {
                str = aVar.currentMessageId;
            }
            if ((i13 & 32) != 0) {
                str2 = aVar.currentConversationUuid;
            }
            String str3 = str;
            String str4 = str2;
            return aVar.m132642a(l7, l12, l13, z4, str3, str4);
        }

        /* JADX INFO: renamed from: a */
        public final a m132642a(Long ttpiaStartTimeMs, Long ttfmtStartTimeMs, Long ttfmtStopTimeMs, boolean hasMarkedSeenForCurrentSession, String currentMessageId, String currentConversationUuid) {
            return new a(ttpiaStartTimeMs, ttfmtStartTimeMs, ttfmtStopTimeMs, hasMarkedSeenForCurrentSession, currentMessageId, currentConversationUuid);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCurrentConversationUuid() {
            return this.currentConversationUuid;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCurrentMessageId() {
            return this.currentMessageId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getHasMarkedSeenForCurrentSession() {
            return this.hasMarkedSeenForCurrentSession;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.ttpiaStartTimeMs, aVar.ttpiaStartTimeMs) && AbstractC22676k.m65745e(this.ttfmtStartTimeMs, aVar.ttfmtStartTimeMs) && AbstractC22676k.m65745e(this.ttfmtStopTimeMs, aVar.ttfmtStopTimeMs) && this.hasMarkedSeenForCurrentSession == aVar.hasMarkedSeenForCurrentSession && AbstractC22676k.m65745e(this.currentMessageId, aVar.currentMessageId) && AbstractC22676k.m65745e(this.currentConversationUuid, aVar.currentConversationUuid);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Long getTtfmtStartTimeMs() {
            return this.ttfmtStartTimeMs;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Long getTtfmtStopTimeMs() {
            return this.ttfmtStopTimeMs;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Long getTtpiaStartTimeMs() {
            return this.ttpiaStartTimeMs;
        }

        public int hashCode() {
            Long l7 = this.ttpiaStartTimeMs;
            int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
            Long l12 = this.ttfmtStartTimeMs;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.ttfmtStopTimeMs;
            int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31, 31, this.hasMarkedSeenForCurrentSession);
            String str = this.currentMessageId;
            int iHashCode3 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.currentConversationUuid;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            Long l7 = this.ttpiaStartTimeMs;
            Long l12 = this.ttfmtStartTimeMs;
            Long l13 = this.ttfmtStopTimeMs;
            boolean z4 = this.hasMarkedSeenForCurrentSession;
            String str = this.currentMessageId;
            String str2 = this.currentConversationUuid;
            StringBuilder sb4 = new StringBuilder("LatencyState(ttpiaStartTimeMs=");
            sb4.append(l7);
            sb4.append(", ttfmtStartTimeMs=");
            sb4.append(l12);
            sb4.append(", ttfmtStopTimeMs=");
            sb4.append(l13);
            sb4.append(", hasMarkedSeenForCurrentSession=");
            sb4.append(z4);
            sb4.append(", currentMessageId=");
            return AbstractC11266d.m30464r(sb4, str, ", currentConversationUuid=", str2, ")");
        }

        public /* synthetic */ a(Long l7, Long l12, Long l13, boolean z4, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : l12, (i13 & 4) != 0 ? null : l13, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2);
        }
    }
}
