package so0;

import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.coacheverywhere.domain.ProactiveApi;
import com.whoop.p057ai.chat.api.AiChatApi;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import ro0.InterfaceC31627a;
import ro0.InterfaceC31628b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: so0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0080@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Lso0/a;", "Lod1/g;", "Lro0/a;", "Lro0/b;", "Lcom/whoop/coacheverywhere/domain/ProactiveApi;", "proactiveApi", "Lcom/whoop/ai/chat/api/AiChatApi;", "aiChatApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/coacheverywhere/domain/ProactiveApi;Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "Lro0/a$c;", "action", "Lec3/l;", "o", "(Lro0/a$c;)Lec3/l;", "Lro0/a$b;", "n", "(Lro0/a$b;)Lec3/l;", "Lro0/a$f;", "r", "(Lro0/a$f;)Lec3/l;", "Lro0/a$e;", "p", "(Lro0/a$e;)Lec3/l;", "Lro0/a$d;", "q", "(Lro0/a$d;)Lec3/l;", "Lro0/a$a;", "m", "(Lro0/a$a;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "", "fingerprint", "messageId", "Ll83/a0;", "l", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/coacheverywhere/domain/ProactiveApi;", "b", "Lcom/whoop/ai/chat/api/AiChatApi;", "c", "Ltr2/n;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32801a implements InterfaceC27844g<InterfaceC31627a, InterfaceC31628b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ProactiveApi proactiveApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AiChatApi aiChatApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: so0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor", m100430f = "ProactiveInteractor.kt", m100431l = {134, 136}, m100432m = "dismissConversationTurn$coach_everywhere_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f136509E;

        /* JADX INFO: renamed from: w */
        Object f136510w;

        /* JADX INFO: renamed from: x */
        Object f136511x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f136512y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f136512y = obj;
            this.f136509E |= Integer.MIN_VALUE;
            return C32801a.this.m102881l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: so0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$dismissConversationTurn$2", m100430f = "ProactiveInteractor.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f136514w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f136516y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f136517z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f136516y = str;
            this.f136517z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C32801a.this.new b(this.f136516y, this.f136517z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136514w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AiChatApi aiChatApi = C32801a.this.aiChatApi;
            String str = this.f136516y;
            String str2 = this.f136517z;
            this.f136514w = 1;
            Object objDismissConversationTurn = aiChatApi.dismissConversationTurn(str, str2, this);
            return objDismissConversationTurn == enumC31071a ? enumC31071a : objDismissConversationTurn;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: so0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$dismissConversationTurn$3", m100430f = "ProactiveInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "it", "<anonymous>", "(Lpg3/v0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136518w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f136520y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f136521z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136520y = str;
            this.f136521z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32801a.this.new c(this.f136520y, this.f136521z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f136518w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C32801a.this.logger.mo85228t(AbstractC31061c.m95640p("Successfully dismissed via API: fingerprint=", this.f136520y, ", turnId=", this.f136521z), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C29218v0<C23454a0> c29218v0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c29218v0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: so0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$dismissPreview$1", m100430f = "ProactiveInteractor.kt", m100431l = {128, 130}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lro0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C32801a f136522E;

        /* JADX INFO: renamed from: w */
        Object f136523w;

        /* JADX INFO: renamed from: x */
        int f136524x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f136525y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC31627a.a f136526z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC31627a.a aVar, C32801a c32801a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136526z = aVar;
            this.f136522E = c32801a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f136526z, this.f136522E, interfaceC30057d);
            dVar.f136525y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f136525y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f136524x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L29
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                java.lang.Object r0 = r7.f136523w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L68
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r2 = r7.f136523w
                java.lang.String r2 = (java.lang.String) r2
                p505ts.AbstractC34132o.m107864I(r8)
                goto L50
            L29:
                p505ts.AbstractC34132o.m107864I(r8)
                ro0.a$a r8 = r7.f136526z
                java.lang.String r8 = r8.getFingerprint()
                if (r8 == 0) goto L50
                boolean r2 = yb3.AbstractC39414r.m125890i0(r8)
                if (r2 == 0) goto L3b
                goto L50
            L3b:
                so0.a r2 = r7.f136522E
                ro0.a$a r6 = r7.f136526z
                java.lang.String r6 = r6.getMessageId()
                r7.f136525y = r0
                r7.f136523w = r5
                r7.f136524x = r4
                java.lang.Object r8 = r2.m102881l(r8, r6, r7)
                if (r8 != r1) goto L50
                goto L67
            L50:
                ro0.b$e r8 = new ro0.b$e
                ro0.a$a r2 = r7.f136526z
                java.lang.String r2 = r2.getMessageId()
                r8.<init>(r2)
                r7.f136525y = r5
                r7.f136523w = r5
                r7.f136524x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L68
            L67:
                return r1
            L68:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: so0.C32801a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: so0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$fetchPresentationBff$1", m100430f = "ProactiveInteractor.kt", m100431l = {71, 73, 77, 85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lro0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC31627a.b f136527E;

        /* JADX INFO: renamed from: w */
        Object f136528w;

        /* JADX INFO: renamed from: x */
        int f136529x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f136530y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC31627a.b bVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136527E = bVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C32801a.this.new e(this.f136527E, interfaceC30057d);
            eVar.f136530y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            if (r1.emit(r0, r14) == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        
            if (r1.emit(r15, r14) == r2) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f136530y
                r1 = r0
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r0 = r14.f136529x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r0 == 0) goto L3e
                if (r0 == r6) goto L3a
                if (r0 == r5) goto L36
                if (r0 == r4) goto L29
                if (r0 != r3) goto L21
                java.lang.Object r0 = r14.f136528w
                java.lang.Exception r0 = (java.lang.Exception) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto Lac
            L21:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L29:
                java.lang.Object r0 = r14.f136528w
                com.whoop.coacheverywhere.domain.models.ProactiveResponse r0 = (com.whoop.coacheverywhere.domain.models.ProactiveResponse) r0
                p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L32
                goto Lac
            L32:
                r0 = move-exception
                r15 = r0
                r8 = r15
                goto L8f
            L36:
                p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L32
                goto L6b
            L3a:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L4e
            L3e:
                p505ts.AbstractC34132o.m107864I(r15)
                ro0.b$c r15 = ro0.InterfaceC31628b.c.f130682a
                r14.f136530y = r1
                r14.f136529x = r6
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r2) goto L4e
                goto Lab
            L4e:
                so0.a r15 = so0.C32801a.this     // Catch: java.lang.Exception -> L32
                com.whoop.coacheverywhere.domain.ProactiveApi r15 = so0.C32801a.m102871h(r15)     // Catch: java.lang.Exception -> L32
                ro0.a$b r0 = r14.f136527E     // Catch: java.lang.Exception -> L32
                java.lang.String r0 = r0.getFingerprint()     // Catch: java.lang.Exception -> L32
                ro0.a$b r6 = r14.f136527E     // Catch: java.lang.Exception -> L32
                java.lang.String r6 = r6.getScreenName()     // Catch: java.lang.Exception -> L32
                r14.f136530y = r1     // Catch: java.lang.Exception -> L32
                r14.f136529x = r5     // Catch: java.lang.Exception -> L32
                java.lang.Object r15 = r15.getPresentation(r0, r6, r14)     // Catch: java.lang.Exception -> L32
                if (r15 != r2) goto L6b
                goto Lab
            L6b:
                com.whoop.coacheverywhere.domain.models.ProactiveResponse r15 = (com.whoop.coacheverywhere.domain.models.ProactiveResponse) r15     // Catch: java.lang.Exception -> L32
                ro0.b$f r0 = new ro0.b$f     // Catch: java.lang.Exception -> L32
                com.whoop.coacheverywhere.domain.models.ProactiveLoadStyle r5 = r15.getProactiveAnimation()     // Catch: java.lang.Exception -> L32
                ep0.f r5 = r5.getOnLoadStyle()     // Catch: java.lang.Exception -> L32
                com.whoop.coacheverywhere.domain.models.ProactiveLoadStyle r15 = r15.getProactiveAnimation()     // Catch: java.lang.Exception -> L32
                ep0.g r15 = r15.getLoadStyle()     // Catch: java.lang.Exception -> L32
                r0.<init>(r5, r15)     // Catch: java.lang.Exception -> L32
                r14.f136530y = r1     // Catch: java.lang.Exception -> L32
                r14.f136528w = r7     // Catch: java.lang.Exception -> L32
                r14.f136529x = r4     // Catch: java.lang.Exception -> L32
                java.lang.Object r15 = r1.emit(r0, r14)     // Catch: java.lang.Exception -> L32
                if (r15 != r2) goto Lac
                goto Lab
            L8f:
                so0.a r15 = so0.C32801a.this
                tr2.n r10 = so0.C32801a.m102870g(r15)
                r12 = 10
                r13 = 0
                r9 = 0
                r11 = 0
                w02.AbstractC36685b.m117760b(r8, r9, r10, r11, r12, r13)
                ro0.b$b r15 = ro0.InterfaceC31628b.b.f130681a
                r14.f136530y = r7
                r14.f136528w = r7
                r14.f136529x = r3
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r2) goto Lac
            Lab:
                return r2
            Lac:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: so0.C32801a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: so0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$fetchProactiveAnimation$1", m100430f = "ProactiveInteractor.kt", m100431l = {51, 53, 57, 66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lro0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC31627a.c f136532E;

        /* JADX INFO: renamed from: w */
        Object f136533w;

        /* JADX INFO: renamed from: x */
        int f136534x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f136535y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC31627a.c cVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136532E = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C32801a.this.new f(this.f136532E, interfaceC30057d);
            fVar.f136535y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        
            if (r1.emit(r0, r14) == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
        
            if (r1.emit(r15, r14) == r2) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f136535y
                r1 = r0
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r0 = r14.f136534x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r0 == 0) goto L3e
                if (r0 == r6) goto L3a
                if (r0 == r5) goto L36
                if (r0 == r4) goto L29
                if (r0 != r3) goto L21
                java.lang.Object r0 = r14.f136533w
                java.lang.Exception r0 = (java.lang.Exception) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto Lb3
            L21:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L29:
                java.lang.Object r0 = r14.f136533w
                com.whoop.coacheverywhere.domain.models.ProactiveResponse r0 = (com.whoop.coacheverywhere.domain.models.ProactiveResponse) r0
                p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L32
                goto Lb3
            L32:
                r0 = move-exception
                r15 = r0
                r8 = r15
                goto L8f
            L36:
                p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L32
                goto L6b
            L3a:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L4e
            L3e:
                p505ts.AbstractC34132o.m107864I(r15)
                ro0.b$c r15 = ro0.InterfaceC31628b.c.f130682a
                r14.f136535y = r1
                r14.f136534x = r6
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r2) goto L4e
                goto Lb2
            L4e:
                so0.a r15 = so0.C32801a.this     // Catch: java.lang.Exception -> L32
                com.whoop.coacheverywhere.domain.ProactiveApi r15 = so0.C32801a.m102871h(r15)     // Catch: java.lang.Exception -> L32
                ro0.a$c r0 = r14.f136532E     // Catch: java.lang.Exception -> L32
                java.lang.String r0 = r0.getScreenName()     // Catch: java.lang.Exception -> L32
                ro0.a$c r6 = r14.f136532E     // Catch: java.lang.Exception -> L32
                java.lang.String r6 = r6.getConversationId()     // Catch: java.lang.Exception -> L32
                r14.f136535y = r1     // Catch: java.lang.Exception -> L32
                r14.f136534x = r5     // Catch: java.lang.Exception -> L32
                java.lang.Object r15 = r15.getProactiveAnimation(r0, r6, r14)     // Catch: java.lang.Exception -> L32
                if (r15 != r2) goto L6b
                goto Lb2
            L6b:
                com.whoop.coacheverywhere.domain.models.ProactiveResponse r15 = (com.whoop.coacheverywhere.domain.models.ProactiveResponse) r15     // Catch: java.lang.Exception -> L32
                ro0.b$f r0 = new ro0.b$f     // Catch: java.lang.Exception -> L32
                com.whoop.coacheverywhere.domain.models.ProactiveLoadStyle r5 = r15.getProactiveAnimation()     // Catch: java.lang.Exception -> L32
                ep0.f r5 = r5.getOnLoadStyle()     // Catch: java.lang.Exception -> L32
                com.whoop.coacheverywhere.domain.models.ProactiveLoadStyle r15 = r15.getProactiveAnimation()     // Catch: java.lang.Exception -> L32
                ep0.g r15 = r15.getLoadStyle()     // Catch: java.lang.Exception -> L32
                r0.<init>(r5, r15)     // Catch: java.lang.Exception -> L32
                r14.f136535y = r1     // Catch: java.lang.Exception -> L32
                r14.f136533w = r7     // Catch: java.lang.Exception -> L32
                r14.f136534x = r4     // Catch: java.lang.Exception -> L32
                java.lang.Object r15 = r1.emit(r0, r14)     // Catch: java.lang.Exception -> L32
                if (r15 != r2) goto Lb3
                goto Lb2
            L8f:
                q83.j r15 = r14.getContext()
                bc3.AbstractC3006f0.m8721o(r15)
                so0.a r15 = so0.C32801a.this
                tr2.n r10 = so0.C32801a.m102870g(r15)
                r12 = 10
                r13 = 0
                r9 = 0
                r11 = 0
                w02.AbstractC36685b.m117760b(r8, r9, r10, r11, r12, r13)
                ro0.b$b r15 = ro0.InterfaceC31628b.b.f130681a
                r14.f136535y = r7
                r14.f136533w = r7
                r14.f136534x = r3
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r2) goto Lb3
            Lb2:
                return r2
            Lb3:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: so0.C32801a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: so0.a$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$handlePrefetchContentLoaded$1", m100430f = "ProactiveInteractor.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lro0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136537w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136538x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC31627a.e f136539y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC31627a.e eVar, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136539y = eVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f136539y, interfaceC30057d);
            gVar.f136538x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136538x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136537w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC31628b.a aVar = new InterfaceC31628b.a(this.f136539y.getPreviewText());
                this.f136538x = null;
                this.f136537w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: so0.a$h */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ProactiveInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f136540w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136541x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f136542y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32801a f136543z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C32801a c32801a) {
            super(3, interfaceC30057d);
            this.f136543z = c32801a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC31627a interfaceC31627a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f136543z);
            hVar.f136541x = interfaceC13062m;
            hVar.f136542y = interfaceC31627a;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM102875m;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136540w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136541x;
                InterfaceC31627a interfaceC31627a = (InterfaceC31627a) this.f136542y;
                if (interfaceC31627a instanceof InterfaceC31627a.c) {
                    interfaceC13058lM102875m = this.f136543z.m102877o((InterfaceC31627a.c) interfaceC31627a);
                } else if (interfaceC31627a instanceof InterfaceC31627a.b) {
                    interfaceC13058lM102875m = this.f136543z.m102876n((InterfaceC31627a.b) interfaceC31627a);
                } else if (interfaceC31627a instanceof InterfaceC31627a.f) {
                    interfaceC13058lM102875m = this.f136543z.m102880r((InterfaceC31627a.f) interfaceC31627a);
                } else if (interfaceC31627a instanceof InterfaceC31627a.e) {
                    interfaceC13058lM102875m = this.f136543z.m102878p((InterfaceC31627a.e) interfaceC31627a);
                } else if (interfaceC31627a instanceof InterfaceC31627a.d) {
                    interfaceC13058lM102875m = this.f136543z.m102879q((InterfaceC31627a.d) interfaceC31627a);
                } else {
                    if (!(interfaceC31627a instanceof InterfaceC31627a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM102875m = this.f136543z.m102875m((InterfaceC31627a.a) interfaceC31627a);
                }
                this.f136541x = null;
                this.f136542y = null;
                this.f136540w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM102875m, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC31627a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: so0.a$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$markMessageAsSeen$1", m100430f = "ProactiveInteractor.kt", m100431l = {108, 117, 121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lro0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC31627a.d f136544E;

        /* JADX INFO: renamed from: w */
        Object f136545w;

        /* JADX INFO: renamed from: x */
        int f136546x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f136547y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC31627a.d dVar, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136544E = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C32801a.this.new i(this.f136544E, interfaceC30057d);
            iVar.f136547y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
        
            if (r1.emit(r13, r12) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
        
            if (r1.emit(r13, r12) == r2) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: so0.C32801a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: so0.a$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.domain.interactor.ProactiveInteractor$seedPresentation$1", m100430f = "ProactiveInteractor.kt", m100431l = {90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lro0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136549w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136550x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC31627a.f f136551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC31627a.f fVar, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136551y = fVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f136551y, interfaceC30057d);
            jVar.f136550x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136550x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136549w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC31628b.f fVar = new InterfaceC31628b.f(this.f136551y.getOnLoadStyle(), this.f136551y.getLoadStyle());
                this.f136550x = null;
                this.f136549w = 1;
                if (interfaceC13062m.emit(fVar, this) == enumC31071a) {
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

    public C32801a(ProactiveApi proactiveApi, AiChatApi aiChatApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(proactiveApi, "proactiveApi");
        AbstractC22676k.m65750j(aiChatApi, "aiChatApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.proactiveApi = proactiveApi;
        this.aiChatApi = aiChatApi;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m102875m(InterfaceC31627a.a action) {
        return new C13084s1(new d(action, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m102876n(InterfaceC31627a.b action) {
        return new C13084s1(new e(action, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m102877o(InterfaceC31627a.c action) {
        return new C13084s1(new f(action, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m102878p(InterfaceC31627a.e action) {
        return new C13084s1(new g(action, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m102879q(InterfaceC31627a.d action) {
        return new C13084s1(new i(action, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m102880r(InterfaceC31627a.f action) {
        return new C13084s1(new j(action, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new h(null, this));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (u02.AbstractC34386b.m108742g((u02.InterfaceC34385a) r14, r1, r6) == r0) goto L22;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m102881l(java.lang.String r12, java.lang.String r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof so0.C32801a.a
            if (r0 == 0) goto L14
            r0 = r14
            so0.a$a r0 = (so0.C32801a.a) r0
            int r1 = r0.f136509E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f136509E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            so0.a$a r0 = new so0.a$a
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f136512y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f136509E
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L4a
            if (r1 == r2) goto L3d
            if (r1 != r9) goto L35
            java.lang.Object r12 = r6.f136511x
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r6.f136510w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r14)
            goto L7c
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            java.lang.Object r12 = r6.f136511x
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r6.f136510w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r14)
            goto L68
        L4a:
            p505ts.AbstractC34132o.m107864I(r14)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r14 = r2
            tr2.n r2 = r11.logger
            so0.a$b r5 = new so0.a$b
            r5.<init>(r12, r13, r10)
            r6.f136510w = r12
            r6.f136511x = r13
            r6.f136509E = r14
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r14 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L68
            goto L7b
        L68:
            u02.a r14 = (u02.InterfaceC34385a) r14
            so0.a$c r1 = new so0.a$c
            r1.<init>(r12, r13, r10)
            r6.f136510w = r10
            r6.f136511x = r10
            r6.f136509E = r9
            java.lang.Object r12 = u02.AbstractC34386b.m108742g(r14, r1, r6)
            if (r12 != r0) goto L7c
        L7b:
            return r0
        L7c:
            l83.a0 r12 = l83.C23454a0.f92919a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: so0.C32801a.m102881l(java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    public /* synthetic */ C32801a(ProactiveApi proactiveApi, AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(proactiveApi, aiChatApi, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ProactiveInteractor") : interfaceC34116n);
    }
}
