package tk2;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
import mk2.C25650q;
import mk2.C25651r;
import mk2.EnumC25655v;
import mk2.InterfaceC25649p;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uk2.C35053c;

/* JADX INFO: renamed from: tk2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\r*\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Ltk2/l;", "Lld1/c;", "Ltk2/m;", "Ltk2/j$l;", "Lmk2/r;", "interactor", "Luk2/c;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lmk2/r;Luk2/c;Lbc3/c0;)V", "Lec3/l;", "Lmk2/p;", "Lmk2/q;", "interact", "(Lec3/l;)Lec3/l;", "p", "(Ltk2/j$l;)Lmk2/p;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Ltk2/j$l;)V", "x", "Lmk2/r;", "y", "Luk2/c;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33894l extends AbstractC23864c<C33895m, InterfaceC33892j.l> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25651r interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C35053c reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: tk2.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.presentation.TrackSessionMiniArchViewModel$sendViewEvent$1", m100430f = "TrackSessionMiniArchViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f142007w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC33892j.l f142009y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC33892j.l lVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f142009y = lVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33894l.this.new a(this.f142009y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f142007w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33894l.this.eventFlow;
                InterfaceC33892j.l lVar = this.f142009y;
                this.f142007w = 1;
                if (interfaceC13072o1.emit(lVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tk2.l$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142010w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33894l f142011x;

        /* JADX INFO: renamed from: tk2.l$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142012w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33894l f142013x;

            /* JADX INFO: renamed from: tk2.l$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.presentation.TrackSessionMiniArchViewModel$special$$inlined$map$1$2", m100430f = "TrackSessionMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42399a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142014E;

                /* JADX INFO: renamed from: F */
                Object f142015F;

                /* JADX INFO: renamed from: G */
                Object f142016G;

                /* JADX INFO: renamed from: H */
                int f142017H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142018w;

                /* JADX INFO: renamed from: x */
                int f142019x;

                /* JADX INFO: renamed from: y */
                Object f142020y;

                public C42399a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142018w = obj;
                    this.f142019x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33894l c33894l) {
                this.f142012w = interfaceC13062m;
                this.f142013x = c33894l;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42399a c42399a;
                if (interfaceC30057d instanceof C42399a) {
                    c42399a = (C42399a) interfaceC30057d;
                    int i13 = c42399a.f142019x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42399a.f142019x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42399a = new C42399a(interfaceC30057d);
                    }
                } else {
                    c42399a = new C42399a(interfaceC30057d);
                }
                Object obj2 = c42399a.f142018w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42399a.f142019x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142012w;
                    InterfaceC25649p interfaceC25649pM107212p = this.f142013x.m107212p((InterfaceC33892j.l) obj);
                    c42399a.f142020y = null;
                    c42399a.f142014E = null;
                    c42399a.f142015F = null;
                    c42399a.f142016G = null;
                    c42399a.f142017H = 0;
                    c42399a.f142019x = 1;
                    if (interfaceC13062m.emit(interfaceC25649pM107212p, c42399a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C33894l c33894l) {
            this.f142010w = interfaceC13058l;
            this.f142011x = c33894l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142010w.collect(new a(interfaceC13062m, this.f142011x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tk2.l$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f142022w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33894l f142023x;

        /* JADX INFO: renamed from: tk2.l$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f142024w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33894l f142025x;

            /* JADX INFO: renamed from: tk2.l$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.presentation.TrackSessionMiniArchViewModel$special$$inlined$map$2$2", m100430f = "TrackSessionMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42400a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f142026E;

                /* JADX INFO: renamed from: F */
                Object f142027F;

                /* JADX INFO: renamed from: G */
                Object f142028G;

                /* JADX INFO: renamed from: H */
                int f142029H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f142030w;

                /* JADX INFO: renamed from: x */
                int f142031x;

                /* JADX INFO: renamed from: y */
                Object f142032y;

                public C42400a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f142030w = obj;
                    this.f142031x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33894l c33894l) {
                this.f142024w = interfaceC13062m;
                this.f142025x = c33894l;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42400a c42400a;
                if (interfaceC30057d instanceof C42400a) {
                    c42400a = (C42400a) interfaceC30057d;
                    int i13 = c42400a.f142031x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42400a.f142031x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42400a = new C42400a(interfaceC30057d);
                    }
                } else {
                    c42400a = new C42400a(interfaceC30057d);
                }
                Object obj2 = c42400a.f142030w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42400a.f142031x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f142024w;
                    C33895m c33895mM110825j = this.f142025x.reducer.m110825j((C25650q) obj);
                    c42400a.f142032y = null;
                    c42400a.f142026E = null;
                    c42400a.f142027F = null;
                    c42400a.f142028G = null;
                    c42400a.f142029H = 0;
                    c42400a.f142031x = 1;
                    if (interfaceC13062m.emit(c33895mM110825j, c42400a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C33894l c33894l) {
            this.f142022w = interfaceC13058l;
            this.f142023x = c33894l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f142022w.collect(new a(interfaceC13062m, this.f142023x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33894l(C25651r interactor, C35053c reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC25649p m107212p(InterfaceC33892j.l lVar) {
        EnumC25655v enumC25655v;
        if (lVar instanceof InterfaceC33892j.h) {
            InterfaceC33892j.h hVar = (InterfaceC33892j.h) lVar;
            return new InterfaceC25649p.k(hVar.getSelectedActivityInternalName(), hVar.getGpsTrackingEnabled(), hVar.getRestoreSessionDestination());
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.g.f141991a)) {
            return InterfaceC25649p.g.f100665a;
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.f.f141990a)) {
            return InterfaceC25649p.f.f100664a;
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.b.f141986a)) {
            return InterfaceC25649p.b.f100660a;
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.d.f141988a)) {
            return InterfaceC25649p.d.f100662a;
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.c.f141987a)) {
            return InterfaceC25649p.c.f100661a;
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.e.f141989a)) {
            return InterfaceC25649p.e.f100663a;
        }
        if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.a.f141985a)) {
            return InterfaceC25649p.a.f100659a;
        }
        if (!(lVar instanceof InterfaceC33892j.k)) {
            if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.i.f141996a)) {
                return InterfaceC25649p.i.f100666a;
            }
            if (AbstractC22676k.m65745e(lVar, InterfaceC33892j.j.f141997a)) {
                return InterfaceC25649p.j.f100667a;
            }
            throw new NoWhenBranchMatchedException();
        }
        String tagId = ((InterfaceC33892j.k) lVar).getTagId();
        EnumC25655v enumC25655v2 = EnumC25655v.HEART_RATE;
        EnumC25655v[] enumC25655vArrValues = EnumC25655v.values();
        int length = enumC25655vArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC25655v = null;
                break;
            }
            enumC25655v = enumC25655vArrValues[i13];
            if (AbstractC22676k.m65745e(enumC25655v.name(), tagId)) {
                break;
            }
            i13++;
        }
        if (enumC25655v != null) {
            enumC25655v2 = enumC25655v;
        }
        return new InterfaceC25649p.l(enumC25655v2);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC33892j.l event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C33894l(C25651r c25651r, C35053c c35053c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25651r, c35053c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
