package da2;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hg3.AbstractC17269i;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: da2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lda2/a;", "", "La6/g;", "Lf6/f;", "dataStore", "Ltr2/n;", "logger", "<init>", "(La6/g;Ltr2/n;)V", "", "timestamp", "Ll83/a0;", "c", "(JLq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "La6/g;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11832a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: da2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateDataStoreHelper", m100430f = "TimezoneUpdateDataStoreHelper.kt", m100431l = {51}, m100432m = "clearTimezoneUpdateTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f38556w;

        /* JADX INFO: renamed from: y */
        int f38558y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f38556w = obj;
            this.f38558y |= Integer.MIN_VALUE;
            return C11832a.this.m31777a(this);
        }
    }

    /* JADX INFO: renamed from: da2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateDataStoreHelper$clearTimezoneUpdateTimestamp$2", m100430f = "TimezoneUpdateDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38559w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f38560x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f38560x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f38560x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38559w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(AbstractC11833b.f38571a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: da2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateDataStoreHelper", m100430f = "TimezoneUpdateDataStoreHelper.kt", m100431l = {40}, m100432m = "getTimezoneUpdateTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f38561w;

        /* JADX INFO: renamed from: y */
        int f38563y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f38561w = obj;
            this.f38563y |= Integer.MIN_VALUE;
            return C11832a.this.m31778b(this);
        }
    }

    /* JADX INFO: renamed from: da2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateDataStoreHelper", m100430f = "TimezoneUpdateDataStoreHelper.kt", m100431l = {27}, m100432m = "saveTimezoneUpdateTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f38564w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f38565x;

        /* JADX INFO: renamed from: z */
        int f38567z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f38565x = obj;
            this.f38567z |= Integer.MIN_VALUE;
            return C11832a.this.m31779c(0L, this);
        }
    }

    /* JADX INFO: renamed from: da2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateDataStoreHelper$saveTimezoneUpdateTimestamp$2", m100430f = "TimezoneUpdateDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f38568w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f38569x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f38570y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j7, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f38570y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f38570y, interfaceC30057d);
            eVar.f38569x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f38569x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f38568w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(AbstractC11833b.f38571a, new Long(this.f38570y));
            return C23454a0.f92919a;
        }
    }

    public C11832a(InterfaceC0422g dataStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m31777a(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f38558y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f38558y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f38556w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f38558y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.dataStore;
                b bVar = new b(null);
                aVar.f38558y = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, bVar, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.logger.mo85228t("[TimezoneUpdateDataStoreHelper] Cleared timezone update timestamp", new AbstractC30556a.a[0]);
        } catch (CancellationException e5) {
            AbstractC3006f0.m8721o(aVar.getContext());
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[TimezoneUpdateDataStoreHelper] Failed to clear timezone update timestamp", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m31778b(InterfaceC30057d<? super Long> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f38563y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f38563y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36575A = cVar.f38561w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f38563y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.dataStore.getData();
                cVar.f38563y = 1;
                objM36575A = AbstractC13091v.m36575A(data, cVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36575A);
            }
            return (Long) ((AbstractC14134f) objM36575A).mo40227b(AbstractC11833b.f38571a);
        } catch (CancellationException e5) {
            AbstractC3006f0.m8721o(cVar.getContext());
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[TimezoneUpdateDataStoreHelper] Failed to get timezone update timestamp", e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m31779c(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f38567z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f38567z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f38565x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f38567z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.dataStore;
                e eVar = new e(j7, null);
                dVar.f38564w = j7;
                dVar.f38567z = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, eVar, dVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = dVar.f38564w;
                AbstractC34132o.m107864I(obj);
            }
            this.logger.mo85228t("[TimezoneUpdateDataStoreHelper] Saved timezone update timestamp: " + j7, new AbstractC30556a.a[0]);
        } catch (CancellationException e5) {
            AbstractC3006f0.m8721o(dVar.getContext());
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[TimezoneUpdateDataStoreHelper] Failed to save timezone update timestamp", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C11832a(InterfaceC0422g interfaceC0422g, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0422g, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TimezoneUpdateDataStoreHelper") : interfaceC34116n);
    }
}
