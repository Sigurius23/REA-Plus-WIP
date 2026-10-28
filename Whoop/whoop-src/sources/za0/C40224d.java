package za0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.BiomarkerDetailsResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import java.util.Set;
import l83.C23454a0;
import m83.C25235a0;
import od1.InterfaceC27844g;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: za0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lza0/d;", "Lod1/g;", "Lza0/b;", "Lza0/c;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "action", "", "", "dismissedCardIds", "prevResult", "g", "(Lza0/b;Ljava/util/Set;Lza0/c;Lq83/d;)Ljava/lang/Object;", "id", "nextToken", "f", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40224d implements InterfaceC27844g<AbstractC40222b, AbstractC40223c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: za0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor", m100430f = "BiomarkerDetailsInteractor.kt", m100431l = {89}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f173695E;

        /* JADX INFO: renamed from: w */
        Object f173696w;

        /* JADX INFO: renamed from: x */
        Object f173697x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f173698y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173698y = obj;
            this.f173695E |= Integer.MIN_VALUE;
            return C40224d.this.m129131f(null, null, this);
        }
    }

    /* JADX INFO: renamed from: za0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor$fetchData$response$1", m100430f = "BiomarkerDetailsInteractor.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f173700w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f173702y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f173703z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f173702y = str;
            this.f173703z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40224d.this.new b(this.f173702y, this.f173703z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173700w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C40224d.this.api;
            String str = this.f173702y;
            String str2 = this.f173703z;
            this.f173700w = 1;
            Object biomarkerDetails = advancedLabsApi.getBiomarkerDetails(str, str2, this);
            return biomarkerDetails == enumC31071a ? enumC31071a : biomarkerDetails;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super BiomarkerDetailsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: za0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor", m100430f = "BiomarkerDetailsInteractor.kt", m100431l = {71}, m100432m = "handleDomainAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f173705F;

        /* JADX INFO: renamed from: w */
        Object f173706w;

        /* JADX INFO: renamed from: x */
        Object f173707x;

        /* JADX INFO: renamed from: y */
        Object f173708y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f173709z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173709z = obj;
            this.f173705F |= Integer.MIN_VALUE;
            return C40224d.this.m129132g(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: za0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "BiomarkerDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f173710w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173711x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f173712y;

        public d(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC40222b abstractC40222b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f173711x = interfaceC13062m;
            dVar.f173712y = abstractC40222b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173710w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173711x;
                C13084s1 c13084s1 = new C13084s1(new e((AbstractC40222b) this.f173712y, null));
                this.f173711x = null;
                this.f173712y = null;
                this.f173710w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC40222b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: za0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor$interact$1$1", m100430f = "BiomarkerDetailsInteractor.kt", m100431l = {35, 37, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza0/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173713w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173714x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC40222b f173715y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC40222b abstractC40222b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173715y = abstractC40222b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f173715y, interfaceC30057d);
            eVar.f173714x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004f  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if (r0.emit(r6, r13) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r0.emit(r5, r13) == r1) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f173714x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r13.f173713w
                r3 = 0
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L25
                if (r2 == r6) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L81
            L21:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L4f
            L25:
                p505ts.AbstractC34132o.m107864I(r14)
                r14 = r6
                za0.b r6 = r13.f173715y
                boolean r2 = r6 instanceof za0.AbstractC40222b.b
                if (r2 == 0) goto L67
                za0.b$b r6 = (za0.AbstractC40222b.b) r6
                java.lang.String r2 = r6.getNextToken()
                if (r2 == 0) goto L4f
                za0.a r6 = new za0.a
                za0.b r7 = r13.f173715y
                r11 = 10
                r12 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r13.f173714x = r0
                r13.f173713w = r14
                java.lang.Object r14 = r0.emit(r6, r13)
                if (r14 != r1) goto L4f
                goto L80
            L4f:
                za0.a r6 = new za0.a
                za0.b r7 = r13.f173715y
                r11 = 10
                r12 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                r13.f173714x = r3
                r13.f173713w = r5
                java.lang.Object r14 = r0.emit(r6, r13)
                if (r14 != r1) goto L81
                goto L80
            L67:
                boolean r14 = r6 instanceof za0.AbstractC40222b.a
                if (r14 == 0) goto L84
                za0.a r5 = new za0.a
                r10 = 14
                r11 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r13.f173714x = r3
                r13.f173713w = r4
                java.lang.Object r14 = r0.emit(r5, r13)
                if (r14 != r1) goto L81
            L80:
                return r1
            L81:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            L84:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: za0.C40224d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: za0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsInteractor$interact$2", m100430f = "BiomarkerDetailsInteractor.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lza0/c;", "prevResult", "Lza0/a;", "accumulator", "<anonymous>", "(Lza0/c;Lza0/a;)Lza0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f173716E;

        /* JADX INFO: renamed from: w */
        Object f173718w;

        /* JADX INFO: renamed from: x */
        Object f173719x;

        /* JADX INFO: renamed from: y */
        int f173720y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f173721z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC40223c abstractC40223c, C40221a c40221a, InterfaceC30057d<? super AbstractC40223c> interfaceC30057d) {
            f fVar = C40224d.this.new f(interfaceC30057d);
            fVar.f173721z = abstractC40223c;
            fVar.f173716E = c40221a;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Set<String> setM129126d;
            AbstractC40223c abstractC40223c = (AbstractC40223c) this.f173721z;
            C40221a c40221a = (C40221a) this.f173716E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173720y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                boolean z4 = abstractC40223c instanceof AbstractC40223c.d;
                AbstractC40223c.d dVar = z4 ? (AbstractC40223c.d) abstractC40223c : null;
                if (dVar == null || (setM129126d = dVar.m129126d()) == null) {
                    setM129126d = C25235a0.f99113w;
                }
                C40221a c40221aM129112b = C40221a.m129112b(c40221a, null, null, false, setM129126d, 7, null);
                if (c40221a.getEmitDateSelectorLoading()) {
                    AbstractC40223c.d dVar2 = z4 ? (AbstractC40223c.d) abstractC40223c : null;
                    BiomarkerDetailsResponse response = dVar2 != null ? dVar2.getResponse() : null;
                    if (response == null) {
                        return AbstractC40223c.c.f173689a;
                    }
                    AbstractC40222b action = c40221a.getAction();
                    AbstractC22676k.m65748h(action, "null cannot be cast to non-null type com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsDomainAction.LoadData");
                    return new AbstractC40223c.a(((AbstractC40222b.b) action).getId(), response, c40221aM129112b.m129115d());
                }
                C40224d c40224d = C40224d.this;
                AbstractC40222b action2 = c40221aM129112b.getAction();
                Set<String> setM129115d = c40221aM129112b.m129115d();
                this.f173721z = null;
                this.f173716E = null;
                this.f173718w = null;
                this.f173719x = null;
                this.f173720y = 1;
                obj = c40224d.m129132g(action2, setM129115d, abstractC40223c, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC40223c) obj;
        }
    }

    public C40224d(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m129131f(String str, String str2, InterfaceC30057d<? super AbstractC40223c> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f173695E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f173695E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f173698y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f173695E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, str2, null);
            aVar2.f173696w = str;
            aVar2.f173697x = null;
            aVar2.f173695E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f173696w;
            AbstractC34132o.m107864I(objM108729b);
        }
        String str3 = str;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC40223c.d(str3, (BiomarkerDetailsResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, 4, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC40223c.b.f173688a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m129132g(AbstractC40222b abstractC40222b, Set<String> set, AbstractC40223c abstractC40223c, InterfaceC30057d<? super AbstractC40223c> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f173705F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f173705F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM129131f = cVar.f173709z;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f173705F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM129131f);
            if (!(abstractC40222b instanceof AbstractC40222b.b)) {
                if (!(abstractC40222b instanceof AbstractC40222b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC40223c.d dVar = abstractC40223c instanceof AbstractC40223c.d ? (AbstractC40223c.d) abstractC40223c : null;
                return dVar != null ? AbstractC40223c.d.m129123b(dVar, null, null, AbstractC12350b.m34555D(((AbstractC40222b.a) abstractC40222b).getCardId(), set), 3, null) : abstractC40223c;
            }
            AbstractC40222b.b bVar = (AbstractC40222b.b) abstractC40222b;
            String id4 = bVar.getId();
            String nextToken = bVar.getNextToken();
            cVar.f173706w = null;
            cVar.f173707x = set;
            cVar.f173708y = null;
            cVar.f173705F = 1;
            objM129131f = m129131f(id4, nextToken, cVar);
            if (objM129131f == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) cVar.f173707x;
            AbstractC34132o.m107864I(objM129131f);
        }
        AbstractC40223c abstractC40223c2 = (AbstractC40223c) objM129131f;
        return abstractC40223c2 instanceof AbstractC40223c.d ? AbstractC40223c.d.m129123b((AbstractC40223c.d) abstractC40223c2, null, null, set, 3, null) : abstractC40223c2;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        C14380k c14380kM36590P = AbstractC13091v.m36590P(upstream, new d(null));
        AbstractC40223c.c cVar = AbstractC40223c.c.f173689a;
        AbstractC22676k.m65748h(cVar, "null cannot be cast to non-null type com.whoop.advancedlabs.biomarkerdetails.domain.BiomarkerDetailsDomainResult");
        return new C13060l1(cVar, c14380kM36590P, new f(null));
    }

    public /* synthetic */ C40224d(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BiomarkerDetailsInteractor") : interfaceC34116n);
    }
}
