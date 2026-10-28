package tg2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ha0.C17051d;
import ia0.C18292a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import n82.C26457c;
import n82.EnumC26455a;
import n82.InterfaceC26456b;
import od1.AbstractC27845h;
import od1.C27850m;
import od1.C27851n;
import od1.InterfaceC27849l;
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

/* JADX INFO: renamed from: tg2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R)\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,0%8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*¨\u00062"}, m65681d2 = {"Ltg2/l;", "Landroidx/lifecycle/w1;", "Lod1/n;", "selectActivityTypeInteractor", "Lia0/a;", "activityTypesRepository", "Ltg2/h;", "reducer", "Lbc3/c0;", "scope", "<init>", "(Lod1/n;Lia0/a;Ltg2/h;Lbc3/c0;)V", "Ln82/b;", NotificationCompat.CATEGORY_EVENT, "Lod1/l;", "q", "(Ln82/b;)Lod1/l;", "Lbc3/k1;", "r", "(Ln82/b;)Lbc3/k1;", "Ln82/a;", "screenType", "Ll83/a0;", "o", "(Ln82/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lod1/n;", "x", "Lia0/a;", "y", "Ltg2/h;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/l;", "Ln82/c;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "", "", "Lha0/d;", "G", "getActivitiesByInternalName", "activitiesByInternalName", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33798l extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l activitiesByInternalName;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27851n selectActivityTypeInteractor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C33794h reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: tg2.l$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerViewModel$activitiesByInternalName$1", m100430f = "SelectActivityPickerViewModel.kt", m100431l = {40, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "", "Lha0/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141540w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141541x;

        /* JADX INFO: renamed from: tg2.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42389a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141543w;

            public C42389a(InterfaceC13062m interfaceC13062m) {
                this.f141543w = interfaceC13062m;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C17051d> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC13062m interfaceC13062m = this.f141543w;
                List<C17051d> list2 = list;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (T t14 : list2) {
                    linkedHashMap.put(((C17051d) t14).getInternalName(), t14);
                }
                Object objEmit = interfaceC13062m.emit(linkedHashMap, interfaceC30057d);
                return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C33798l.this.new a(interfaceC30057d);
            aVar.f141541x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (((ec3.InterfaceC13058l) r6).collect(r2, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f141541x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f141540w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L47
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L34
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                tg2.l r6 = tg2.C33798l.this
                ia0.a r6 = tg2.C33798l.m106948g(r6)
                r5.f141541x = r0
                r5.f141540w = r4
                java.lang.Object r6 = r6.m52660e(r5)
                if (r6 != r1) goto L34
                goto L46
            L34:
                ec3.l r6 = (ec3.InterfaceC13058l) r6
                tg2.l$a$a r2 = new tg2.l$a$a
                r2.<init>(r0)
                r0 = 0
                r5.f141541x = r0
                r5.f141540w = r3
                java.lang.Object r6 = r6.collect(r2, r5)
                if (r6 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tg2.C33798l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: tg2.l$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerViewModel$sendViewEvent$1", m100430f = "SelectActivityPickerViewModel.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141544w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC26456b f141546y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC26456b interfaceC26456b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141546y = interfaceC26456b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33798l.this.new b(this.f141546y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141544w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33798l.this.eventFlow;
                InterfaceC26456b interfaceC26456b = this.f141546y;
                this.f141544w = 1;
                if (interfaceC13072o1.emit(interfaceC26456b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tg2.l$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141547w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33798l f141548x;

        /* JADX INFO: renamed from: tg2.l$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141549w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33798l f141550x;

            /* JADX INFO: renamed from: tg2.l$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerViewModel$special$$inlined$map$1$2", m100430f = "SelectActivityPickerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42390a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141551E;

                /* JADX INFO: renamed from: F */
                Object f141552F;

                /* JADX INFO: renamed from: G */
                Object f141553G;

                /* JADX INFO: renamed from: H */
                int f141554H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141555w;

                /* JADX INFO: renamed from: x */
                int f141556x;

                /* JADX INFO: renamed from: y */
                Object f141557y;

                public C42390a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141555w = obj;
                    this.f141556x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33798l c33798l) {
                this.f141549w = interfaceC13062m;
                this.f141550x = c33798l;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42390a c42390a;
                if (interfaceC30057d instanceof C42390a) {
                    c42390a = (C42390a) interfaceC30057d;
                    int i13 = c42390a.f141556x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42390a.f141556x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42390a = new C42390a(interfaceC30057d);
                    }
                } else {
                    c42390a = new C42390a(interfaceC30057d);
                }
                Object obj2 = c42390a.f141555w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42390a.f141556x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141549w;
                    InterfaceC27849l interfaceC27849lM106953q = this.f141550x.m106953q((InterfaceC26456b) obj);
                    c42390a.f141557y = null;
                    c42390a.f141551E = null;
                    c42390a.f141552F = null;
                    c42390a.f141553G = null;
                    c42390a.f141554H = 0;
                    c42390a.f141556x = 1;
                    if (interfaceC13062m.emit(interfaceC27849lM106953q, c42390a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C33798l c33798l) {
            this.f141547w = interfaceC13058l;
            this.f141548x = c33798l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141547w.collect(new a(interfaceC13062m, this.f141548x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.l$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f141559w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33798l f141560x;

        /* JADX INFO: renamed from: tg2.l$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141561w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33798l f141562x;

            /* JADX INFO: renamed from: tg2.l$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerViewModel$special$$inlined$map$2$2", m100430f = "SelectActivityPickerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42391a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141563E;

                /* JADX INFO: renamed from: F */
                Object f141564F;

                /* JADX INFO: renamed from: G */
                Object f141565G;

                /* JADX INFO: renamed from: H */
                int f141566H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141567w;

                /* JADX INFO: renamed from: x */
                int f141568x;

                /* JADX INFO: renamed from: y */
                Object f141569y;

                public C42391a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141567w = obj;
                    this.f141568x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33798l c33798l) {
                this.f141561w = interfaceC13062m;
                this.f141562x = c33798l;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42391a c42391a;
                if (interfaceC30057d instanceof C42391a) {
                    c42391a = (C42391a) interfaceC30057d;
                    int i13 = c42391a.f141568x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42391a.f141568x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42391a = new C42391a(interfaceC30057d);
                    }
                } else {
                    c42391a = new C42391a(interfaceC30057d);
                }
                Object obj2 = c42391a.f141567w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42391a.f141568x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f141561w;
                    C26457c c26457cM106912g = C33794h.m106912g(this.f141562x.reducer, (C27850m) obj, null, 2, null);
                    c42391a.f141569y = null;
                    c42391a.f141563E = null;
                    c42391a.f141564F = null;
                    c42391a.f141565G = null;
                    c42391a.f141566H = 0;
                    c42391a.f141568x = 1;
                    if (interfaceC13062m.emit(c26457cM106912g, c42391a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C33798l c33798l) {
            this.f141559w = interfaceC13058l;
            this.f141560x = c33798l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f141559w.collect(new a(interfaceC13062m, this.f141560x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33798l(C27851n selectActivityTypeInteractor, C18292a activityTypesRepository, C33794h reducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(selectActivityTypeInteractor, "selectActivityTypeInteractor");
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.selectActivityTypeInteractor = selectActivityTypeInteractor;
        this.activityTypesRepository = activityTypesRepository;
        this.reducer = reducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this.eventFlow = c13096w1M36592b;
        d dVar = new d(AbstractC27845h.m83945a(new c(c13096w1M36592b, this), selectActivityTypeInteractor), this);
        C13021b2 c13021b2 = C13105z1.f45288a;
        this.viewState = AbstractC13091v.m36586L(dVar, scope, c13021b2, 1);
        this.activitiesByInternalName = AbstractC13091v.m36586L(new C13084s1(new a(null)), scope, c13021b2, 1);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m106952p(C33798l c33798l, EnumC26455a enumC26455a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC26455a = EnumC26455a.ALL;
        }
        c33798l.m106954o(enumC26455a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC27849l m106953q(InterfaceC26456b event) {
        if (event instanceof InterfaceC26456b.a) {
            return new InterfaceC27849l.a(((InterfaceC26456b.a) event).getInitialScreenType(), true);
        }
        if (!(event instanceof InterfaceC26456b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC26456b.b bVar = (InterfaceC26456b.b) event;
        return new InterfaceC27849l.b(bVar.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), bVar.getScreenType());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m106954o(EnumC26455a screenType) {
        AbstractC22676k.m65750j(screenType, "screenType");
        InterfaceC26456b.a aVar = new InterfaceC26456b.a(screenType);
        if (this.eventFlow.mo36564a(aVar)) {
            return;
        }
        m106955r(aVar);
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC3027k1 m106955r(InterfaceC26456b event) {
        AbstractC22676k.m65750j(event, "event");
        return AbstractC3006f0.m8732z(this.scope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C33798l(C27851n c27851n, C18292a c18292a, C33794h c33794h, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27851n, c18292a, c33794h, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
