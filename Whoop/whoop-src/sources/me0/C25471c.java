package me0;

import bm.C3383g;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.AdvancedLabsPaginatedTestHistory;
import com.whoop.advancedlabs.domain.models.AdvancedLabsTestHistorySection;
import com.whoop.advancedlabs.domain.models.TestHistoryResponse;
import com.whoop.design.models.items.DividerModel;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p007a6.C0456u;
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

/* JADX INFO: renamed from: me0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lme0/c;", "Lod1/g;", "Lme0/a;", "Lme0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "f", "(Lq83/d;)Ljava/lang/Object;", "Lme0/b$c;", "previous", "", "nextToken", "g", "(Lme0/b$c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "next", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "oldSections", "newSections", "i", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25471c implements InterfaceC27844g<AbstractC25469a, AbstractC25470b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: me0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor", m100430f = "TestHistoryInteractor.kt", m100431l = {47}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f99722w;

        /* JADX INFO: renamed from: y */
        int f99724y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99722w = obj;
            this.f99724y |= Integer.MIN_VALUE;
            return C25471c.this.m74871f(this);
        }
    }

    /* JADX INFO: renamed from: me0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor$fetchData$response$1", m100430f = "TestHistoryInteractor.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f99725w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C25471c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99725w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C25471c.this.api;
            this.f99725w = 1;
            Object testHistory = advancedLabsApi.getTestHistory(this);
            return testHistory == enumC31071a ? enumC31071a : testHistory;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TestHistoryResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: me0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor", m100430f = "TestHistoryInteractor.kt", m100431l = {55}, m100432m = "fetchNextPage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f99727E;

        /* JADX INFO: renamed from: w */
        Object f99728w;

        /* JADX INFO: renamed from: x */
        Object f99729x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f99730y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f99730y = obj;
            this.f99727E |= Integer.MIN_VALUE;
            return C25471c.this.m74872g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: me0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor$fetchNextPage$response$1", m100430f = "TestHistoryInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f99732w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f99734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f99734y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C25471c.this.new d(this.f99734y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99732w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C25471c.this.api;
            String str = this.f99734y;
            this.f99732w = 1;
            Object testHistoryPaginated = advancedLabsApi.getTestHistoryPaginated(str, this);
            return testHistoryPaginated == enumC31071a ? enumC31071a : testHistoryPaginated;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AdvancedLabsPaginatedTestHistory> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: me0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TestHistoryInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f99735w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f99736x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f99737y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC25469a abstractC25469a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f99736x = interfaceC13062m;
            eVar.f99737y = abstractC25469a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99735w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f99736x;
                AbstractC25469a abstractC25469a = (AbstractC25469a) this.f99737y;
                InterfaceC13058l c3383g = abstractC25469a instanceof AbstractC25469a.b ? new C3383g(new AbstractC25469a[]{AbstractC25469a.c.f99715a, abstractC25469a}, 3) : new C0456u(abstractC25469a, 1);
                this.f99736x = null;
                this.f99737y = null;
                this.f99735w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC25469a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: me0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.domain.TestHistoryInteractor$interact$2", m100430f = "TestHistoryInteractor.kt", m100431l = {28, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lme0/b;", "previous", "Lme0/a;", "action", "<anonymous>", "(Lme0/b;Lme0/a;)Lme0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f99738w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f99739x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f99740y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC25470b abstractC25470b, AbstractC25469a abstractC25469a, InterfaceC30057d<? super AbstractC25470b> interfaceC30057d) {
            f fVar = C25471c.this.new f(interfaceC30057d);
            fVar.f99739x = abstractC25470b;
            fVar.f99740y = abstractC25469a;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r7 == r2) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        
            if (r7 == r2) goto L23;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f99739x
                me0.b r0 = (me0.AbstractC25470b) r0
                java.lang.Object r1 = r6.f99740y
                me0.a r1 = (me0.AbstractC25469a) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r6.f99738w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L20
                if (r3 != r4) goto L18
                p505ts.AbstractC34132o.m107864I(r7)
                goto L5d
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3b
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r1 instanceof me0.AbstractC25469a.a
                r3 = 0
                if (r7 == 0) goto L3e
                me0.c r7 = me0.C25471c.this
                r6.f99739x = r3
                r6.f99740y = r3
                r6.f99738w = r5
                java.lang.Object r7 = me0.C25471c.m74868c(r7, r6)
                if (r7 != r2) goto L3b
                goto L5c
            L3b:
                me0.b r7 = (me0.AbstractC25470b) r7
                return r7
            L3e:
                boolean r7 = r1 instanceof me0.AbstractC25469a.b
                if (r7 == 0) goto L60
                boolean r7 = r0 instanceof me0.AbstractC25470b.c
                if (r7 == 0) goto L74
                me0.c r7 = me0.C25471c.this
                me0.b$c r0 = (me0.AbstractC25470b.c) r0
                me0.a$b r1 = (me0.AbstractC25469a.b) r1
                java.lang.String r1 = r1.getNextToken()
                r6.f99739x = r3
                r6.f99740y = r3
                r6.f99738w = r4
                java.lang.Object r7 = me0.C25471c.m74869d(r7, r0, r1, r6)
                if (r7 != r2) goto L5d
            L5c:
                return r2
            L5d:
                me0.b r7 = (me0.AbstractC25470b) r7
                return r7
            L60:
                boolean r7 = r1 instanceof me0.AbstractC25469a.c
                if (r7 == 0) goto L75
                boolean r7 = r0 instanceof me0.AbstractC25470b.d
                if (r7 == 0) goto L74
                me0.b$c r7 = new me0.b$c
                me0.b$d r0 = (me0.AbstractC25470b.d) r0
                com.whoop.advancedlabs.domain.models.TestHistoryResponse r0 = r0.getResponse()
                r7.<init>(r0)
                return r7
            L74:
                return r0
            L75:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: me0.C25471c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C25471c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m74871f(InterfaceC30057d<? super AbstractC25470b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f99724y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f99724y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f99722w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f99724y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f99724y = 1;
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC25470b.d((TestHistoryResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC25470b.a.f99716a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m74872g(AbstractC25470b.c cVar, String str, InterfaceC30057d<? super AbstractC25470b> interfaceC30057d) {
        c cVar2;
        if (interfaceC30057d instanceof c) {
            cVar2 = (c) interfaceC30057d;
            int i13 = cVar2.f99727E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar2.f99727E = i13 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(interfaceC30057d);
            }
        } else {
            cVar2 = new c(interfaceC30057d);
        }
        c cVar3 = cVar2;
        Object objM108729b = cVar3.f99730y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar3.f99727E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar3.f99728w = cVar;
            cVar3.f99729x = null;
            cVar3.f99727E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar3, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (AbstractC25470b.c) cVar3.f99728w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC25470b.d(m74873h(cVar.getResponse(), (AdvancedLabsPaginatedTestHistory) ((InterfaceC34385a.c) interfaceC34385a).m108735a()));
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC25470b.d(cVar.getResponse());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private final TestHistoryResponse m74873h(TestHistoryResponse previous, AdvancedLabsPaginatedTestHistory next) {
        return TestHistoryResponse.copy$default(previous, null, null, null, m74874i(previous.getPaginatedRecords(), next), 7, null);
    }

    /* JADX INFO: renamed from: i */
    public final AdvancedLabsPaginatedTestHistory m74874i(AdvancedLabsPaginatedTestHistory oldSections, AdvancedLabsPaginatedTestHistory newSections) {
        AbstractC22676k.m65750j(oldSections, "oldSections");
        AbstractC22676k.m65750j(newSections, "newSections");
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(oldSections.getSections(), newSections.getSections());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayListM74129g1) {
            String id4 = ((AdvancedLabsTestHistorySection) obj).getId();
            Object arrayList = linkedHashMap.get(id4);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(id4, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            String id5 = ((AdvancedLabsTestHistorySection) AbstractC25265s.m74096F0(list)).getId();
            DividerModel sectionHeader = ((AdvancedLabsTestHistorySection) AbstractC25265s.m74096F0(list)).getSectionHeader();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC25265s.m74141p0(arrayList3, ((AdvancedLabsTestHistorySection) it3.next()).getItems());
            }
            arrayList2.add(new AdvancedLabsTestHistorySection(id5, sectionHeader, AbstractC25265s.m74159y0(arrayList3)));
        }
        return new AdvancedLabsPaginatedTestHistory(arrayList2, newSections.getNextToken(), newSections.getAnalytics());
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC25470b.b.f99717a, AbstractC13091v.m36590P(upstream, new e(null)), new f(null));
    }

    public /* synthetic */ C25471c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TestHistoryInteractor") : interfaceC34116n);
    }
}
