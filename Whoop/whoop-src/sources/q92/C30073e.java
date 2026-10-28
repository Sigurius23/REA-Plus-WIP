package q92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hg3.AbstractC17269i;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: q92.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lq92/e;", "", "La6/g;", "Lf6/f;", "dataStore", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "<init>", "(La6/g;Lbc3/c0;Ltr2/n;)V", "", "c", "()Ljava/lang/String;", "signature", "Ll83/a0;", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "b", "(Lq83/d;)Ljava/lang/Object;", "a", "La6/g;", "Ltr2/n;", "Lec3/f2;", "Lec3/f2;", "signatureState", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30073e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13037f2 signatureState;

    /* JADX INFO: renamed from: q92.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.StrapSignatureDataStoreHelper", m100430f = "StrapSignatureDataStoreHelper.kt", m100431l = {73}, m100432m = "clearStrapSignature", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f122723w;

        /* JADX INFO: renamed from: y */
        int f122725y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f122723w = obj;
            this.f122725y |= Integer.MIN_VALUE;
            return C30073e.this.m92182b(this);
        }
    }

    /* JADX INFO: renamed from: q92.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.StrapSignatureDataStoreHelper$clearStrapSignature$2", m100430f = "StrapSignatureDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122726w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f122727x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f122727x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f122727x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122726w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(AbstractC30074f.f122749a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q92.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.StrapSignatureDataStoreHelper", m100430f = "StrapSignatureDataStoreHelper.kt", m100431l = {56}, m100432m = "saveStrapSignature", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f122728w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f122729x;

        /* JADX INFO: renamed from: z */
        int f122731z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f122729x = obj;
            this.f122731z |= Integer.MIN_VALUE;
            return C30073e.this.m92184d(null, this);
        }
    }

    /* JADX INFO: renamed from: q92.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.StrapSignatureDataStoreHelper$saveStrapSignature$2", m100430f = "StrapSignatureDataStoreHelper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122732w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f122733x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f122734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f122734y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f122734y, interfaceC30057d);
            dVar.f122733x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f122733x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122732w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f122734y == null) {
                c14129a.m40229f(AbstractC30074f.f122749a);
            } else {
                c14129a.m40230g(AbstractC30074f.f122749a, this.f122734y);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: q92.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.StrapSignatureDataStoreHelper$signatureState$1", m100430f = "StrapSignatureDataStoreHelper.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lf6/f;", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f122735w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f122736x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f122737y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = C30073e.this.new e(interfaceC30057d);
            eVar.f122736x = interfaceC13062m;
            eVar.f122737y = th3;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f122736x;
            Throwable th3 = (Throwable) this.f122737y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f122735w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(th3 instanceof IOException)) {
                    throw th3;
                }
                C30073e.this.logger.mo85230v("[StrapSignatureDataStoreHelper] Failed to read strap signature", th3, new AbstractC30556a.a[0]);
                C14129a c14129a = new C14129a(true);
                this.f122736x = null;
                this.f122737y = null;
                this.f122735w = 1;
                if (interfaceC13062m.emit(c14129a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: q92.e$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f122739w;

        /* JADX INFO: renamed from: q92.e$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f122740w;

            /* JADX INFO: renamed from: q92.e$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.StrapSignatureDataStoreHelper$special$$inlined$map$1$2", m100430f = "StrapSignatureDataStoreHelper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42209a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f122741E;

                /* JADX INFO: renamed from: F */
                Object f122742F;

                /* JADX INFO: renamed from: G */
                Object f122743G;

                /* JADX INFO: renamed from: H */
                int f122744H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f122745w;

                /* JADX INFO: renamed from: x */
                int f122746x;

                /* JADX INFO: renamed from: y */
                Object f122747y;

                public C42209a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f122745w = obj;
                    this.f122746x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f122740w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42209a c42209a;
                if (interfaceC30057d instanceof C42209a) {
                    c42209a = (C42209a) interfaceC30057d;
                    int i13 = c42209a.f122746x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42209a.f122746x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42209a = new C42209a(interfaceC30057d);
                    }
                } else {
                    c42209a = new C42209a(interfaceC30057d);
                }
                Object obj2 = c42209a.f122745w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42209a.f122746x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f122740w;
                    Object objMo40227b = ((AbstractC14134f) obj).mo40227b(AbstractC30074f.f122749a);
                    c42209a.f122747y = null;
                    c42209a.f122741E = null;
                    c42209a.f122742F = null;
                    c42209a.f122743G = null;
                    c42209a.f122744H = 0;
                    c42209a.f122746x = 1;
                    if (interfaceC13062m.emit(objMo40227b, c42209a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f122739w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f122739w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C30073e(InterfaceC0422g dataStore, InterfaceC2994c0 scope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.logger = logger;
        this.signatureState = AbstractC13091v.m36587M(new f(new C13015a0(dataStore.getData(), new e(null))), scope, C13105z1.f45288a, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m92182b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f122725y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f122725y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f122723w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f122725y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.dataStore;
                b bVar = new b(null);
                aVar.f122725y = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, bVar, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (CancellationException e5) {
            AbstractC3006f0.m8721o(aVar.getContext());
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[StrapSignatureDataStoreHelper] Failed to clear strap signature", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final String m92183c() {
        return (String) this.signatureState.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m92184d(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f122731z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f122731z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f122729x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f122731z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.dataStore;
                d dVar = new d(str, null);
                cVar.f122728w = null;
                cVar.f122731z = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, dVar, cVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (CancellationException e5) {
            AbstractC3006f0.m8721o(cVar.getContext());
            throw e5;
        } catch (Exception e13) {
            this.logger.mo85230v("[StrapSignatureDataStoreHelper] Failed to save strap signature", e13, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C30073e(InterfaceC0422g interfaceC0422g, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0422g, interfaceC2994c0, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StrapSignatureDataStoreHelper") : interfaceC34116n);
    }
}
