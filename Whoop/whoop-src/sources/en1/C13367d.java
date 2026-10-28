package en1;

import bn1.C3498a;
import c93.InterfaceC4351m;
import com.whoop.homecustomization.domain.HomeCustomizationApi;
import com.whoop.homecustomization.domain.legacy.models.CustomizeableKeyStatModel;
import com.whoop.homecustomization.domain.legacy.models.HomeCustomizationResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: en1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010#J#\u0010&\u001a\u00020\u0003*\u00020\u001b2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Len1/d;", "Lod1/g;", "Len1/b;", "Len1/c;", "Lcom/whoop/homecustomization/domain/HomeCustomizationApi;", "api", "Ltr2/n;", "logger", "Lbn1/a;", "analyticsHelper", "<init>", "(Lcom/whoop/homecustomization/domain/HomeCustomizationApi;Ltr2/n;Lbn1/a;)V", "Lec3/l;", "l", "(Lec3/l;)Lec3/l;", "", "isFirstTimeFetch", "k", "(ZLq83/d;)Ljava/lang/Object;", "", "", "keyStats", "o", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "p", "(Lq83/d;)Ljava/lang/Object;", "Len1/c$c;", "", "fromIndex", "toIndex", "n", "(Len1/c$c;II)Len1/c;", "index", "j", "(Len1/c$c;I)Len1/c;", "m", "isToggleOn", "q", "(Len1/c$c;IZ)Len1/c;", "upstream", "interact", "a", "Lcom/whoop/homecustomization/domain/HomeCustomizationApi;", "b", "Ltr2/n;", "c", "Lbn1/a;", "d", "Len1/c;", "initialState", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13367d implements InterfaceC27844g<AbstractC13365b, AbstractC13366c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HomeCustomizationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C3498a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC13366c initialState;

    /* JADX INFO: renamed from: en1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor", m100430f = "HomeCustomizationInteractor.kt", m100431l = {106, 114}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f46745F;

        /* JADX INFO: renamed from: w */
        boolean f46746w;

        /* JADX INFO: renamed from: x */
        Object f46747x;

        /* JADX INFO: renamed from: y */
        int f46748y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f46749z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f46749z = obj;
            this.f46745F |= Integer.MIN_VALUE;
            return C13367d.this.m37656k(false, this);
        }
    }

    /* JADX INFO: renamed from: en1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$fetchData$2", m100430f = "HomeCustomizationInteractor.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f46750w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13367d.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46750w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeCustomizationApi homeCustomizationApi = C13367d.this.api;
            this.f46750w = 1;
            Object homeCustomizationLegacy = homeCustomizationApi.getHomeCustomizationLegacy(this);
            return homeCustomizationLegacy == enumC31071a ? enumC31071a : homeCustomizationLegacy;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HomeCustomizationResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: en1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$interact$1", m100430f = "HomeCustomizationInteractor.kt", m100431l = {41, 90}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Len1/c;", "currentState", "Len1/b;", "domainAction", "<anonymous>", "(Len1/c;Len1/b;)Len1/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f46753w;

        /* JADX INFO: renamed from: x */
        int f46754x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46755y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f46756z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC13366c abstractC13366c, AbstractC13365b abstractC13365b, InterfaceC30057d<? super AbstractC13366c> interfaceC30057d) {
            c cVar = C13367d.this.new c(interfaceC30057d);
            cVar.f46755y = abstractC13366c;
            cVar.f46756z = abstractC13365b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r1 == r3) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01c2, code lost:
        
            if (r1 == r3) goto L83;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 495
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: en1.C13367d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: en1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$reduceCustomizeAction$$inlined$flatMapLatest$1", m100430f = "HomeCustomizationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46757w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46758x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46759y;

        public d(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC13365b abstractC13365b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f46758x = interfaceC13062m;
            dVar.f46759y = abstractC13365b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46757w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46758x;
                AbstractC13365b abstractC13365b = (AbstractC13365b) this.f46759y;
                C13084s1 c13084s1 = AbstractC22676k.m65745e(abstractC13365b, AbstractC13365b.c.f46720a) ? new C13084s1(new e(abstractC13365b, null)) : new C13084s1(new f(abstractC13365b, null));
                this.f46758x = null;
                this.f46759y = null;
                this.f46757w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC13365b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: en1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$reduceCustomizeAction$1$1", m100430f = "HomeCustomizationInteractor.kt", m100431l = {26, 27, 28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Len1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46760w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46761x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC13365b f46762y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC13365b abstractC13365b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46762y = abstractC13365b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f46762y, interfaceC30057d);
            eVar.f46761x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f46761x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f46760w
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L27
                if (r2 == r5) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                p505ts.AbstractC34132o.m107864I(r7)
                goto L52
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L23:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L27:
                p505ts.AbstractC34132o.m107864I(r7)
                en1.b$e r7 = en1.AbstractC13365b.e.f46723a
                r6.f46761x = r0
                r6.f46760w = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L37
                goto L51
            L37:
                r6.f46761x = r0
                r6.f46760w = r4
                r4 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                if (r7 != r1) goto L44
                goto L51
            L44:
                en1.b r7 = r6.f46762y
                r2 = 0
                r6.f46761x = r2
                r6.f46760w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L52
            L51:
                return r1
            L52:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: en1.C13367d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: en1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$reduceCustomizeAction$1$2", m100430f = "HomeCustomizationInteractor.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Len1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46763w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46764x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC13365b f46765y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC13365b abstractC13365b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46765y = abstractC13365b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f46765y, interfaceC30057d);
            fVar.f46764x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46764x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46763w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC13365b abstractC13365b = this.f46765y;
                this.f46764x = null;
                this.f46763w = 1;
                if (interfaceC13062m.emit(abstractC13365b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: en1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((CustomizeableKeyStatModel) t14).getName(), ((CustomizeableKeyStatModel) t15).getName());
        }
    }

    /* JADX INFO: renamed from: en1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor", m100430f = "HomeCustomizationInteractor.kt", m100431l = {137}, m100432m = "saveKeyStats", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f46766w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46767x;

        /* JADX INFO: renamed from: z */
        int f46769z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f46767x = obj;
            this.f46769z |= Integer.MIN_VALUE;
            return C13367d.this.m37660o(null, this);
        }
    }

    /* JADX INFO: renamed from: en1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$saveKeyStats$2", m100430f = "HomeCustomizationInteractor.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f46770w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f46772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<String> list, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f46772y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13367d.this.new i(this.f46772y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46770w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeCustomizationApi homeCustomizationApi = C13367d.this.api;
            List<String> list = this.f46772y;
            this.f46770w = 1;
            Object objSaveKeyStats = homeCustomizationApi.saveKeyStats(list, this);
            return objSaveKeyStats == enumC31071a ? enumC31071a : objSaveKeyStats;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: en1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homecustomization.domain.legacy.HomeCustomizationInteractor$setCustomizeOnboardingStateToFalse$2", m100430f = "HomeCustomizationInteractor.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f46773w;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C13367d.this.new j(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46773w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeCustomizationApi homeCustomizationApi = C13367d.this.api;
            this.f46773w = 1;
            Object customizeOnboardingStateToFalse = homeCustomizationApi.setCustomizeOnboardingStateToFalse(this);
            return customizeOnboardingStateToFalse == enumC31071a ? enumC31071a : customizeOnboardingStateToFalse;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C13367d(HomeCustomizationApi api, InterfaceC34116n logger, C3498a analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
        this.initialState = AbstractC13366c.b.f46728a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final AbstractC13366c m37655j(AbstractC13366c.c cVar, int i13) {
        CustomizeableKeyStatModel customizeableKeyStatModel = cVar.m37645j().get(i13);
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(cVar.m37638c());
        arrayListM74097F1.add(customizeableKeyStatModel);
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(cVar.m37645j());
        arrayListM74097F2.remove(i13);
        return AbstractC13366c.c.m37636b(cVar, null, null, null, null, null, arrayListM74097F1, arrayListM74097F2, null, false, false, 671, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m37656k(boolean z4, InterfaceC30057d<? super AbstractC13366c> interfaceC30057d) {
        a aVar;
        InterfaceC34385a interfaceC34385a;
        InterfaceC34385a interfaceC34385a2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f46745F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f46745F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f46749z;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar2.f46745F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f46746w = z4;
            aVar2.f46745F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            z4 = aVar2.f46746w;
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34385a2 = (InterfaceC34385a) aVar2.f46747x;
            AbstractC34132o.m107864I(objM108729b);
        }
        interfaceC34385a = interfaceC34385a2;
        HomeCustomizationResponse homeCustomizationResponse = (HomeCustomizationResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        return new AbstractC13366c.c(new C13364a(homeCustomizationResponse.getDefaultStatLeftName(), homeCustomizationResponse.getDefaultStatRightName()), homeCustomizationResponse.getDescription(), homeCustomizationResponse.getErrorMessage(), homeCustomizationResponse.getPinnedKeyStatsHeader(), homeCustomizationResponse.getUnpinnedKeyStatsHeader(), homeCustomizationResponse.getPinnedKeyStats().getKeyStats(), homeCustomizationResponse.getUnpinnedKeyStats().getKeyStats(), homeCustomizationResponse.getToggleKeyStats(), false, false, 768, null);
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.b.C42432b) && !(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z4) {
                aVar2.f46747x = interfaceC34385a;
                aVar2.f46746w = z4;
                aVar2.f46748y = 0;
                aVar2.f46745F = 2;
                if (m37661p(aVar2) != obj) {
                    interfaceC34385a2 = interfaceC34385a;
                    interfaceC34385a = interfaceC34385a2;
                }
                return obj;
            }
            HomeCustomizationResponse homeCustomizationResponse2 = (HomeCustomizationResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            return new AbstractC13366c.c(new C13364a(homeCustomizationResponse2.getDefaultStatLeftName(), homeCustomizationResponse2.getDefaultStatRightName()), homeCustomizationResponse2.getDescription(), homeCustomizationResponse2.getErrorMessage(), homeCustomizationResponse2.getPinnedKeyStatsHeader(), homeCustomizationResponse2.getUnpinnedKeyStatsHeader(), homeCustomizationResponse2.getPinnedKeyStats().getKeyStats(), homeCustomizationResponse2.getUnpinnedKeyStats().getKeyStats(), homeCustomizationResponse2.getToggleKeyStats(), false, false, 768, null);
        }
        return AbstractC13366c.a.f46727a;
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m37657l(InterfaceC13058l interfaceC13058l) {
        return AbstractC13091v.m36590P(interfaceC13058l, new d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final AbstractC13366c m37658m(AbstractC13366c.c cVar, int i13) {
        CustomizeableKeyStatModel customizeableKeyStatModel = cVar.m37638c().get(i13);
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(cVar.m37638c());
        arrayListM74097F1.remove(i13);
        ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(cVar.m37645j());
        arrayListM74097F2.add(customizeableKeyStatModel);
        if (arrayListM74097F2.size() > 1) {
            AbstractC25269w.m74166l0(arrayListM74097F2, new g());
        }
        return AbstractC13366c.c.m37636b(cVar, null, null, null, null, null, arrayListM74097F1, arrayListM74097F2, null, false, false, 671, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final AbstractC13366c m37659n(AbstractC13366c.c cVar, int i13, int i14) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(cVar.m37638c());
        if (i13 >= 0 && i13 < arrayListM74097F1.size() && i14 >= 0 && i14 < arrayListM74097F1.size()) {
            arrayListM74097F1.add(i14, arrayListM74097F1.remove(i13));
        }
        return AbstractC13366c.c.m37636b(cVar, null, null, null, null, null, arrayListM74097F1, null, null, false, false, 735, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m37660o(List<String> list, InterfaceC30057d<? super AbstractC13366c> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f46769z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f46769z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM108729b = hVar2.f46767x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f46769z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            i iVar = new i(list, null);
            hVar2.f46766w = list;
            hVar2.f46769z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, iVar, hVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) hVar2.f46766w;
            AbstractC34132o.m107864I(objM108729b);
        }
        if (!(((InterfaceC34385a) objM108729b) instanceof InterfaceC34385a.c)) {
            return AbstractC13366c.a.f46727a;
        }
        this.analyticsHelper.m10325b(list);
        return AbstractC13366c.d.f46739a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m37661p(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, null, new j(null), interfaceC30057d, 6, null);
        return objM108729b == EnumC31071a.f128113w ? objM108729b : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC13366c m37662q(AbstractC13366c.c cVar, int i13, boolean z4) {
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(cVar.m37644i());
        arrayListM74097F1.set(i13, CustomizeableKeyStatModel.copy$default((CustomizeableKeyStatModel) arrayListM74097F1.get(i13), null, null, null, null, z4, 15, null));
        return AbstractC13366c.c.m37636b(cVar, null, null, null, null, null, null, null, arrayListM74097F1, false, false, 639, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialState, m37657l(upstream), new c(null));
    }
}
