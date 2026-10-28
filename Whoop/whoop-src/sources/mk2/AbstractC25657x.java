package mk2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fv1.C14814b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: mk2.x */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aI\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00002\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lec3/l;", "Ll83/a0;", "a", "()Lec3/l;", "Lyg2/d;", "heartRateFlow", "Lfv1/b;", "locationFlow", "", "gpsTrackingEnabled", "durationTickFlow", "Lmk2/w;", "b", "(Lec3/l;Lec3/l;ZLec3/l;)Lec3/l;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25657x {

    /* JADX INFO: renamed from: mk2.x$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionUpdateKt$defaultDurationTickFlow$1", m100430f = "TrackSessionUpdate.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, 24, 25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100879w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100880x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f100880x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0034  */
        /* JADX WARN: Code duplicated, block: B:18:0x0047  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:15:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f100880x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.f100879w
                l83.a0 r3 = l83.C23454a0.f92919a
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L26
                if (r2 == r6) goto L22
                if (r2 == r5) goto L1e
                if (r2 != r4) goto L16
                goto L22
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L47
            L22:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L34
            L26:
                p505ts.AbstractC34132o.m107864I(r10)
                r9.f100880x = r0
                r9.f100879w = r6
                java.lang.Object r10 = r0.emit(r3, r9)
                if (r10 != r1) goto L34
                goto L51
            L34:
                kotlin.time.Duration$Companion r10 = p715kotlin.time.Duration.INSTANCE
                kotlin.time.DurationUnit r10 = p715kotlin.time.DurationUnit.SECONDS
                long r7 = p715kotlin.time.DurationKt.toDuration(r6, r10)
                r9.f100880x = r0
                r9.f100879w = r5
                java.lang.Object r10 = bc3.AbstractC3034m0.m8783c(r7, r9)
                if (r10 != r1) goto L47
                goto L51
            L47:
                r9.f100880x = r0
                r9.f100879w = r4
                java.lang.Object r10 = r0.emit(r3, r9)
                if (r10 != r1) goto L34
            L51:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mk2.AbstractC25657x.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mk2.x$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100881w;

        /* JADX INFO: renamed from: mk2.x$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100882w;

            /* JADX INFO: renamed from: mk2.x$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionUpdateKt$mergeTrackSessionUpdates$$inlined$map$1$2", m100430f = "TrackSessionUpdate.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42007a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100883E;

                /* JADX INFO: renamed from: F */
                Object f100884F;

                /* JADX INFO: renamed from: G */
                Object f100885G;

                /* JADX INFO: renamed from: H */
                int f100886H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100887w;

                /* JADX INFO: renamed from: x */
                int f100888x;

                /* JADX INFO: renamed from: y */
                Object f100889y;

                public C42007a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100887w = obj;
                    this.f100888x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100882w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42007a c42007a;
                if (interfaceC30057d instanceof C42007a) {
                    c42007a = (C42007a) interfaceC30057d;
                    int i13 = c42007a.f100888x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42007a.f100888x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42007a = new C42007a(interfaceC30057d);
                    }
                } else {
                    c42007a = new C42007a(interfaceC30057d);
                }
                Object obj2 = c42007a.f100887w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42007a.f100888x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100882w;
                    InterfaceC25656w.b bVar = new InterfaceC25656w.b((AbstractC39529d) obj);
                    c42007a.f100889y = null;
                    c42007a.f100883E = null;
                    c42007a.f100884F = null;
                    c42007a.f100885G = null;
                    c42007a.f100886H = 0;
                    c42007a.f100888x = 1;
                    if (interfaceC13062m.emit(bVar, c42007a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f100881w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100881w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.x$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100891w;

        /* JADX INFO: renamed from: mk2.x$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100892w;

            /* JADX INFO: renamed from: mk2.x$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionUpdateKt$mergeTrackSessionUpdates$$inlined$map$2$2", m100430f = "TrackSessionUpdate.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42008a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100893E;

                /* JADX INFO: renamed from: F */
                Object f100894F;

                /* JADX INFO: renamed from: G */
                Object f100895G;

                /* JADX INFO: renamed from: H */
                int f100896H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100897w;

                /* JADX INFO: renamed from: x */
                int f100898x;

                /* JADX INFO: renamed from: y */
                Object f100899y;

                public C42008a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100897w = obj;
                    this.f100898x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100892w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42008a c42008a;
                if (interfaceC30057d instanceof C42008a) {
                    c42008a = (C42008a) interfaceC30057d;
                    int i13 = c42008a.f100898x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42008a.f100898x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42008a = new C42008a(interfaceC30057d);
                    }
                } else {
                    c42008a = new C42008a(interfaceC30057d);
                }
                Object obj2 = c42008a.f100897w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42008a.f100898x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100892w;
                    InterfaceC25656w.a aVar = InterfaceC25656w.a.f100873a;
                    c42008a.f100899y = null;
                    c42008a.f100893E = null;
                    c42008a.f100894F = null;
                    c42008a.f100895G = null;
                    c42008a.f100896H = 0;
                    c42008a.f100898x = 1;
                    if (interfaceC13062m.emit(aVar, c42008a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f100891w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100891w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mk2.x$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f100901w;

        /* JADX INFO: renamed from: mk2.x$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f100902w;

            /* JADX INFO: renamed from: mk2.x$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.trackactivity.domain.TrackSessionUpdateKt$mergeTrackSessionUpdates$$inlined$map$3$2", m100430f = "TrackSessionUpdate.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42009a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f100903E;

                /* JADX INFO: renamed from: F */
                Object f100904F;

                /* JADX INFO: renamed from: G */
                Object f100905G;

                /* JADX INFO: renamed from: H */
                int f100906H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f100907w;

                /* JADX INFO: renamed from: x */
                int f100908x;

                /* JADX INFO: renamed from: y */
                Object f100909y;

                public C42009a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f100907w = obj;
                    this.f100908x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f100902w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42009a c42009a;
                if (interfaceC30057d instanceof C42009a) {
                    c42009a = (C42009a) interfaceC30057d;
                    int i13 = c42009a.f100908x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42009a.f100908x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42009a = new C42009a(interfaceC30057d);
                    }
                } else {
                    c42009a = new C42009a(interfaceC30057d);
                }
                Object obj2 = c42009a.f100907w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42009a.f100908x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f100902w;
                    InterfaceC25656w.c cVar = new InterfaceC25656w.c((C14814b) obj);
                    c42009a.f100909y = null;
                    c42009a.f100903E = null;
                    c42009a.f100904F = null;
                    c42009a.f100905G = null;
                    c42009a.f100906H = 0;
                    c42009a.f100908x = 1;
                    if (interfaceC13062m.emit(cVar, c42009a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f100901w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f100901w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC13058l m75550a() {
        return new C13084s1(new a(null));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC13058l m75551b(InterfaceC13058l heartRateFlow, InterfaceC13058l locationFlow, boolean z4, InterfaceC13058l durationTickFlow) {
        AbstractC22676k.m65750j(heartRateFlow, "heartRateFlow");
        AbstractC22676k.m65750j(locationFlow, "locationFlow");
        AbstractC22676k.m65750j(durationTickFlow, "durationTickFlow");
        b bVar = new b(heartRateFlow);
        c cVar = new c(durationTickFlow);
        return z4 ? AbstractC13091v.m36584J(bVar, cVar, new d(new C4588i(locationFlow, 2))) : AbstractC13091v.m36584J(bVar, cVar);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC13058l m75552c(InterfaceC13058l interfaceC13058l, InterfaceC13058l interfaceC13058l2, boolean z4, InterfaceC13058l interfaceC13058l3, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            interfaceC13058l3 = m75550a();
        }
        return m75551b(interfaceC13058l, interfaceC13058l2, z4, interfaceC13058l3);
    }
}
