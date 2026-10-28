package vg0;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.api.AiSuggestionsResponse;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: vg0.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lvg0/a0;", "", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "", "fingerprint", "", "c", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "timeoutMs", "d", "(Ljava/lang/String;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35975a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.a0$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.GetSuggestionsInteractor", m100430f = "GetSuggestionsInteractor.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "fetchSuggestions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f153179w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f153180x;

        /* JADX INFO: renamed from: z */
        int f153182z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153180x = obj;
            this.f153182z |= Integer.MIN_VALUE;
            return C35975a0.this.m114218c(null, this);
        }
    }

    /* JADX INFO: renamed from: vg0.a0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.GetSuggestionsInteractor$fetchSuggestions$response$1", m100430f = "GetSuggestionsInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/ai/chat/api/AiSuggestionsResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f153183w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f153185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f153185y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35975a0.this.new b(this.f153185y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153183w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AiChatApi aiChatApi = C35975a0.this.api;
            String str = this.f153185y;
            this.f153183w = 1;
            Object suggestions = aiChatApi.getSuggestions(str, this);
            return suggestions == enumC31071a ? enumC31071a : suggestions;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<AiSuggestionsResponse>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vg0.a0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.GetSuggestionsInteractor", m100430f = "GetSuggestionsInteractor.kt", m100431l = {14, 15}, m100432m = "getSuggestions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f153186E;

        /* JADX INFO: renamed from: w */
        Object f153187w;

        /* JADX INFO: renamed from: x */
        Object f153188x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153189y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f153189y = obj;
            this.f153186E |= Integer.MIN_VALUE;
            return C35975a0.this.m114220d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vg0.a0$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.GetSuggestionsInteractor$getSuggestions$2", m100430f = "GetSuggestionsInteractor.kt", m100431l = {15}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153191w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f153193y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153193y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35975a0.this.new d(this.f153193y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<String>> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153191w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C35975a0 c35975a0 = C35975a0.this;
            String str = this.f153193y;
            this.f153191w = 1;
            Object objM114218c = c35975a0.m114218c(str, this);
            return objM114218c == enumC31071a ? enumC31071a : objM114218c;
        }
    }

    public C35975a0(AiChatApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m114218c(String str, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        a aVar;
        List<String> suggestions;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f153182z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f153182z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f153180x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f153182z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f153179w = null;
            aVar2.f153182z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        boolean z4 = interfaceC34385a instanceof InterfaceC34385a.c;
        C25271y c25271y = C25271y.f99162w;
        if (z4) {
            AiSuggestionsResponse aiSuggestionsResponse = (AiSuggestionsResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            return (aiSuggestionsResponse == null || (suggestions = aiSuggestionsResponse.getSuggestions()) == null) ? c25271y : suggestions;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(AbstractC11266d.m30461o("Failed to fetch suggestions: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
        return c25271y;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m114219e(C35975a0 c35975a0, String str, Long l7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            l7 = null;
        }
        return c35975a0.m114220d(str, l7, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m114220d(java.lang.String r7, java.lang.Long r8, q83.InterfaceC30057d<? super java.util.List<java.lang.String>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof vg0.C35975a0.c
            if (r0 == 0) goto L13
            r0 = r9
            vg0.a0$c r0 = (vg0.C35975a0.c) r0
            int r1 = r0.f153186E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153186E = r1
            goto L18
        L13:
            vg0.a0$c r0 = new vg0.a0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f153189y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f153186E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.f153188x
            r8 = r7
            java.lang.Long r8 = (java.lang.Long) r8
            java.lang.Object r7 = r0.f153187w
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L71
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.f153188x
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r7 = r0.f153187w
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r9)
            return r9
        L47:
            p505ts.AbstractC34132o.m107864I(r9)
            r9 = 0
            if (r8 != 0) goto L5b
            r0.f153187w = r9
            r0.f153188x = r9
            r0.f153186E = r4
            java.lang.Object r7 = r6.m114218c(r7, r0)
            if (r7 != r1) goto L5a
            goto L70
        L5a:
            return r7
        L5b:
            long r4 = r8.longValue()
            vg0.a0$d r2 = new vg0.a0$d
            r2.<init>(r7, r9)
            r0.f153187w = r9
            r0.f153188x = r8
            r0.f153186E = r3
            java.lang.Object r9 = bc3.AbstractC3028k2.m8750d(r4, r2, r0)
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L93
            tr2.n r7 = r6.logger
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Timed out fetching suggestions after "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = "ms"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 0
            qr2.a$a[] r9 = new qr2.AbstractC30556a.a[r9]
            r7.mo85222m(r8, r9)
            m83.y r7 = m83.C25271y.f99162w
            return r7
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vg0.C35975a0.m114220d(java.lang.String, java.lang.Long, q83.d):java.lang.Object");
    }

    public /* synthetic */ C35975a0(AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("GetSuggestionsInteractor") : interfaceC34116n);
    }
}
