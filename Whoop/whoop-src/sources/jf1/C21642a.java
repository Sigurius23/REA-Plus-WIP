package jf1;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25272z;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: jf1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0086@¢\u0006\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006#"}, m65681d2 = {"Ljf1/a;", "", "La6/g;", "Lf6/f;", "prefsDataStore", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "<init>", "(La6/g;Lzr2/a;Ltr2/n;)V", "", "experimentName", "Lf6/d;", "b", "(Ljava/lang/String;)Lf6/d;", "", "c", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "cacheTtlSeconds", "e", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "variant", "Ll83/a0;", "g", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "(Lq83/d;)Ljava/lang/Object;", "", "a", "La6/g;", "Lzr2/a;", "Ltr2/n;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21642a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: jf1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {97}, m100432m = "fetchExperimentsCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f83104w;

        /* JADX INFO: renamed from: y */
        int f83106y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83104w = obj;
            this.f83106y |= Integer.MIN_VALUE;
            return C21642a.this.m60899a(this);
        }
    }

    /* JADX INFO: renamed from: jf1.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {27}, m100432m = "getVariantFor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83107E;

        /* JADX INFO: renamed from: w */
        Object f83108w;

        /* JADX INFO: renamed from: x */
        Object f83109x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83110y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83110y = obj;
            this.f83107E |= Integer.MIN_VALUE;
            return C21642a.this.m60900d(null, this);
        }
    }

    /* JADX INFO: renamed from: jf1.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {40}, m100432m = "getVariantWithTtl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f83112E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f83113F;

        /* JADX INFO: renamed from: H */
        int f83115H;

        /* JADX INFO: renamed from: w */
        Object f83116w;

        /* JADX INFO: renamed from: x */
        Object f83117x;

        /* JADX INFO: renamed from: y */
        Object f83118y;

        /* JADX INFO: renamed from: z */
        long f83119z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83113F = obj;
            this.f83115H |= Integer.MIN_VALUE;
            return C21642a.this.m60901e(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: jf1.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {82}, m100432m = "resetCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f83120w;

        /* JADX INFO: renamed from: y */
        int f83122y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83120w = obj;
            this.f83122y |= Integer.MIN_VALUE;
            return C21642a.this.m60902f(this);
        }
    }

    /* JADX INFO: renamed from: jf1.a$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper$resetCache$2", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83123w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83124x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f83124x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f83124x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83123w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Set setKeySet = c14129a.mo40226a().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                C14132d c14132d = (C14132d) obj2;
                if (AbstractC39421y.m125930O(c14132d.f50837a, "exp_", false) || AbstractC39421y.m125930O(c14132d.f50837a, "exp_ts_", false)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c14129a.m40229f((C14132d) it.next());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jf1.a$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {59}, m100432m = "saveVariantFor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f83126F;

        /* JADX INFO: renamed from: w */
        Object f83127w;

        /* JADX INFO: renamed from: x */
        Object f83128x;

        /* JADX INFO: renamed from: y */
        Object f83129y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f83130z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83130z = obj;
            this.f83126F |= Integer.MIN_VALUE;
            return C21642a.this.m60903g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jf1.a$g */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper$saveVariantFor$2", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83131w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83132x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f83133y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f83134z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C14132d c14132d, String str, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83133y = c14132d;
            this.f83134z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f83133y, this.f83134z, interfaceC30057d);
            gVar.f83132x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f83132x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83131w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(this.f83133y, this.f83134z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jf1.a$h */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {71}, m100432m = "saveVariantWithTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f83135E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f83136F;

        /* JADX INFO: renamed from: H */
        int f83138H;

        /* JADX INFO: renamed from: w */
        Object f83139w;

        /* JADX INFO: renamed from: x */
        Object f83140x;

        /* JADX INFO: renamed from: y */
        Object f83141y;

        /* JADX INFO: renamed from: z */
        Object f83142z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83136F = obj;
            this.f83138H |= Integer.MIN_VALUE;
            return C21642a.this.m60904h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jf1.a$i */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.datastore.ExperimentsDataStoreHelper$saveVariantWithTimestamp$2", m100430f = "ExperimentsDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14132d f83143E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ long f83144F;

        /* JADX INFO: renamed from: w */
        int f83145w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83146x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f83147y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f83148z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C14132d c14132d, String str, C14132d c14132d2, long j7, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83147y = c14132d;
            this.f83148z = str;
            this.f83143E = c14132d2;
            this.f83144F = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f83147y, this.f83148z, this.f83143E, this.f83144F, interfaceC30057d);
            iVar.f83146x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f83146x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83145w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(this.f83147y, this.f83148z);
            c14129a.m40230g(this.f83143E, new Long(this.f83144F));
            return C23454a0.f92919a;
        }
    }

    public C21642a(InterfaceC0422g prefsDataStore, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.prefsDataStore = prefsDataStore;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final C14132d m60897b(String experimentName) {
        return AbstractC15751g.m44441U("exp_" + experimentName);
    }

    /* JADX INFO: renamed from: c */
    private final C14132d m60898c(String experimentName) {
        return AbstractC15751g.m44429I("exp_ts_" + experimentName);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m60899a(InterfaceC30057d<? super Map<String, String>> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f83106y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f83106y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM36575A = aVar.f83104w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f83106y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.prefsDataStore.getData();
                aVar.f83106y = 1;
                objM36575A = AbstractC13091v.m36575A(data, aVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36575A);
            }
            Map mapMo40226a = ((AbstractC14134f) objM36575A).mo40226a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapMo40226a.entrySet()) {
                if (AbstractC39421y.m125930O(((C14132d) entry.getKey()).f50837a, "exp_", false)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
            for (Object obj : linkedHashMap.entrySet()) {
                linkedHashMap2.put(AbstractC39414r.m125898q0(((C14132d) ((Map.Entry) obj).getKey()).f50837a, "exp_"), ((Map.Entry) obj).getValue());
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
            for (Object obj2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(((Map.Entry) obj2).getKey(), ((Map.Entry) obj2).getValue().toString());
            }
            return linkedHashMap3;
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to fetch experiments from data store", e5, new AbstractC30556a.a[0]);
            return C25272z.f99163w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m60900d(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        b bVar;
        C14132d c14132dM60897b;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f83107E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f83107E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36575A = bVar.f83110y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f83107E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                c14132dM60897b = m60897b(str);
                InterfaceC13058l data = this.prefsDataStore.getData();
                bVar.f83108w = null;
                bVar.f83109x = c14132dM60897b;
                bVar.f83107E = 1;
                objM36575A = AbstractC13091v.m36575A(data, bVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c14132dM60897b = (C14132d) bVar.f83109x;
                AbstractC34132o.m107864I(objM36575A);
            }
            return (String) ((AbstractC14134f) objM36575A).mo40227b(c14132dM60897b);
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to get experiment from data store", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m60901e(String str, long j7, InterfaceC30057d<? super String> interfaceC30057d) {
        c cVar;
        long j13;
        C14132d c14132d;
        C14132d c14132d2;
        long j14;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f83115H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f83115H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f83113F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f83115H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                long jMo133363b = this.dateAndTimeProvider.mo133363b() / ((long) 1000);
                C14132d c14132dM60898c = m60898c(str);
                C14132d c14132dM60897b = m60897b(str);
                InterfaceC13058l data = this.prefsDataStore.getData();
                cVar.f83116w = null;
                cVar.f83117x = c14132dM60898c;
                cVar.f83118y = c14132dM60897b;
                cVar.f83119z = j7;
                cVar.f83112E = jMo133363b;
                cVar.f83115H = 1;
                Object objM36575A = AbstractC13091v.m36575A(data, cVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
                j13 = j7;
                c14132d = c14132dM60898c;
                obj = objM36575A;
                c14132d2 = c14132dM60897b;
                j14 = jMo133363b;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = cVar.f83112E;
                j13 = cVar.f83119z;
                c14132d2 = (C14132d) cVar.f83118y;
                c14132d = (C14132d) cVar.f83117x;
                AbstractC34132o.m107864I(obj);
            }
            AbstractC14134f abstractC14134f = (AbstractC14134f) obj;
            Long l7 = (Long) abstractC14134f.mo40227b(c14132d);
            if (l7 != null) {
                long jLongValue = l7.longValue();
                String str2 = (String) abstractC14134f.mo40227b(c14132d2);
                if (str2 != null && j13 != 0 && j14 - jLongValue < j13) {
                    return str2;
                }
            }
            return null;
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to get experiment with TTL from data store", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m60902f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f83122y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f83122y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f83120w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f83122y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.prefsDataStore;
                e eVar = new e(null);
                dVar.f83122y = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, eVar, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to clear experiments from data store", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m60903g(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f83126F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f83126F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f83130z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f83126F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM60897b = m60897b(str);
                InterfaceC0422g interfaceC0422g = this.prefsDataStore;
                g gVar = new g(c14132dM60897b, str2, null);
                fVar.f83127w = null;
                fVar.f83128x = null;
                fVar.f83129y = null;
                fVar.f83126F = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, gVar, fVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to insert experiment into data store", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m60904h(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f83138H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f83138H = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f83136F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f83138H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM60897b = m60897b(str);
                C14132d c14132dM60898c = m60898c(str);
                long jMo133363b = this.dateAndTimeProvider.mo133363b() / ((long) 1000);
                InterfaceC0422g interfaceC0422g = this.prefsDataStore;
                i iVar = new i(c14132dM60897b, str2, c14132dM60898c, jMo133363b, null);
                hVar.f83139w = null;
                hVar.f83140x = null;
                hVar.f83141y = null;
                hVar.f83142z = null;
                hVar.f83135E = jMo133363b;
                hVar.f83138H = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, iVar, hVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to insert experiment with timestamp into data store", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }
}
