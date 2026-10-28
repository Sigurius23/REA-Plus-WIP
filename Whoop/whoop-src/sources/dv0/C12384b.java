package dv0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13035f0;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import fy1.InterfaceC14871g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yu0.EnumC39789f;

/* JADX INFO: renamed from: dv0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010+R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010.¨\u00061"}, m65681d2 = {"Ldv0/b;", "Ldv0/a;", "", "Ltr2/n;", "logger", "Lyu0/f;", "packetType", "Lci2/b;", "whoopStrapProvider", "Lrr2/c;", "crashReporter", "Lbc3/c0;", "coroutineScope", "Lfy1/g;", "nanoClock", "<init>", "(Ltr2/n;Lyu0/f;Lci2/b;Lrr2/c;Lbc3/c0;Lfy1/g;)V", "Ll83/a0;", "d", "()V", "b", "a", "Ltr2/n;", "Lyu0/f;", "c", "Lrr2/c;", "Lbc3/c0;", "e", "Lfy1/g;", "Lbc3/k1;", "f", "Lbc3/k1;", "detectGapJob", "", "g", "J", "monitoringStartNanos", "Lec3/t1;", "Ldv0/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/t1;", "realtimeDataFlow", "", "()I", "successfullyPublishedPacketCount", "l", "()Ljava/lang/Double;", "gap", "timeToFirstPacketSeconds", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12384b implements InterfaceC12383a<Double> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39789f packetType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC3027k1 detectGapJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long monitoringStartNanos;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC13087t1 realtimeDataFlow;

    /* JADX INFO: renamed from: dv0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$realtimeDataFlow$3", m100430f = "RealtimeGapDetector.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "exception", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41853w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f41854x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C12384b.this.new a(interfaceC30057d);
            aVar.f41854x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Throwable th3, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(th3, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.f41854x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41853w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12384b.this.logger.mo85230v("Caught an exception when trying to find gaps in realtime data", th3, new AbstractC30556a.a[0]);
            return Boolean.valueOf(th3 instanceof IllegalArgumentException);
        }
    }

    /* JADX INFO: renamed from: dv0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$realtimeDataFlow$4", m100430f = "RealtimeGapDetector.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldv0/d;", "currentCounter", "Ldv0/e;", "reducedRealTimePacket", "<anonymous>", "(Ldv0/d;Ldv0/e;)Ldv0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41856w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f41857x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41858y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12386d c12386d, C12387e c12387e, InterfaceC30057d<? super C12386d> interfaceC30057d) {
            b bVar = C12384b.this.new b(interfaceC30057d);
            bVar.f41857x = c12386d;
            bVar.f41858y = c12387e;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C12386d c12386d = (C12386d) this.f41857x;
            C12387e c12387e = (C12387e) this.f41858y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41856w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (c12386d.getInitialValue()) {
                return C12386d.m34761b(c12386d, false, c12387e.getCurrentSequence(), c12387e.getCurrentSubSequence(), c12387e.getCurrentTimeInSeconds(), 0.0d, c12386d.getPacketsPublished() + 1, new Double((C12384b.this.nanoClock.mo42899a() - C12384b.this.monitoringStartNanos) / 1.0E9d), 16, null);
            }
            double currentTimeInSeconds = c12387e.getCurrentTimeInSeconds() - c12386d.getPreviousTimeInSeconds();
            if (currentTimeInSeconds - 1.5d <= 1.0E-5d) {
                return C12386d.m34761b(c12386d, false, c12387e.getCurrentSequence(), c12387e.getCurrentSubSequence(), c12387e.getCurrentTimeInSeconds(), 0.0d, c12386d.getPacketsPublished() + 1, null, 81, null);
            }
            return C12386d.m34761b(c12386d, false, c12387e.getCurrentSequence(), c12387e.getCurrentSubSequence(), c12387e.getCurrentTimeInSeconds(), c12386d.getGapInSeconds() + currentTimeInSeconds, c12386d.getPacketsPublished() + 1, null, 65, null);
        }
    }

    /* JADX INFO: renamed from: dv0.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$realtimeDataFlow$5", m100430f = "RealtimeGapDetector.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Ldv0/d;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41860w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f41861x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = C12384b.this.new c(interfaceC30057d);
            cVar.f41861x = th3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.f41861x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41860w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12384b.this.crashReporter.mo98631p(th3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dv0.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$special$$inlined$flatMapLatest$1", m100430f = "RealtimeGapDetector.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f41863w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41864x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41865y;

        public d(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f41864x = interfaceC13062m;
            dVar.f41865y = interfaceC21750d;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lMo24699N;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41863w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41864x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f41865y;
                if (interfaceC21750d == null || (interfaceC13058lMo24699N = interfaceC21750d.mo24699N()) == null) {
                    interfaceC13058lMo24699N = C13054k.f45116w;
                }
                this.f41864x = null;
                this.f41865y = null;
                this.f41863w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo24699N, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dv0.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$special$$inlined$transform$1", m100430f = "RealtimeGapDetector.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41866w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f41867x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f41868y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12384b f41869z;

        /* JADX INFO: renamed from: dv0.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41870w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12384b f41871x;

            /* JADX INFO: renamed from: dv0.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$special$$inlined$transform$1$1", m100430f = "RealtimeGapDetector.kt", m100431l = {44, 52, 65, 79}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41494a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41872E;

                /* JADX INFO: renamed from: F */
                Object f41873F;

                /* JADX INFO: renamed from: G */
                Object f41874G;

                /* JADX INFO: renamed from: H */
                Object f41875H;

                /* JADX INFO: renamed from: I */
                Object f41876I;

                /* JADX INFO: renamed from: J */
                int f41877J;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41878w;

                /* JADX INFO: renamed from: x */
                int f41879x;

                /* JADX INFO: renamed from: z */
                Object f41881z;

                public C41494a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41878w = obj;
                    this.f41879x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12384b c12384b) {
                this.f41871x = c12384b;
                this.f41870w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
            
                if (r1.emit(r14, r2) == r3) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00fc, code lost:
            
                if (r1.emit(r14, r2) == r3) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x015f, code lost:
            
                if (r1.emit(r14, r2) == r3) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x01b9, code lost:
            
                if (r1.emit(r14, r2) == r3) goto L65;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x01bb, code lost:
            
                return r3;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r21, q83.InterfaceC30057d<? super l83.C23454a0> r22) {
                /*
                    Method dump skipped, instruction units count: 447
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: dv0.C12384b.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C12384b c12384b) {
            super(2, interfaceC30057d);
            this.f41868y = interfaceC13058l;
            this.f41869z = c12384b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f41868y, interfaceC30057d, this.f41869z);
            eVar.f41867x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41866w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f41867x;
                InterfaceC13058l interfaceC13058l = this.f41868y;
                a aVar = new a(interfaceC13062m, this.f41869z);
                this.f41867x = null;
                this.f41866w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dv0.b$f */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.gapdetector.RealtimeGapDetector$startMonitoringForGaps$1", m100430f = "RealtimeGapDetector.kt", m100431l = {181}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41882w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12384b.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41882w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1 = C12384b.this.realtimeDataFlow;
                this.f41882w = 1;
                if (AbstractC13091v.m36603m(interfaceC13087t1, this) == enumC31071a) {
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

    public C12384b(InterfaceC34116n logger, EnumC39789f packetType, InterfaceC4733b whoopStrapProvider, InterfaceC31766c crashReporter, InterfaceC2994c0 coroutineScope, InterfaceC14871g nanoClock) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(packetType, "packetType");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        this.logger = logger;
        this.packetType = packetType;
        this.crashReporter = crashReporter;
        this.coroutineScope = coroutineScope;
        this.nanoClock = nanoClock;
        this.realtimeDataFlow = AbstractC13091v.m36586L(new C13015a0(new C13060l1(new C12386d(false, 0L, 0, 0.0d, 0.0d, 0, null, 127, null), new C13015a0(new C13084s1(new e(AbstractC13091v.m36590P(whoopStrapProvider.mo14819c(), new d(null)), null, this)), new C13035f0(new a(null), null)), new b(null)), new c(null)), coroutineScope, C13105z1.m36630a(3, 0L), 1);
    }

    @Override // dv0.InterfaceC12383a
    /* JADX INFO: renamed from: b */
    public void mo34747b() {
        InterfaceC3027k1 interfaceC3027k1 = this.detectGapJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.detectGapJob = null;
    }

    @Override // dv0.InterfaceC12383a
    /* JADX INFO: renamed from: c */
    public Double mo34748c() {
        Double timeToFirstPacketSeconds;
        C12386d c12386d = (C12386d) AbstractC25265s.m74100H0(this.realtimeDataFlow.getReplayCache());
        if (c12386d == null || (timeToFirstPacketSeconds = c12386d.getTimeToFirstPacketSeconds()) == null) {
            return null;
        }
        return Double.valueOf(AbstractC12385c.m34760a(timeToFirstPacketSeconds.doubleValue()));
    }

    @Override // dv0.InterfaceC12383a
    /* JADX INFO: renamed from: d */
    public void mo34749d() {
        InterfaceC3027k1 interfaceC3027k1 = this.detectGapJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.monitoringStartNanos = this.nanoClock.mo42899a();
        this.detectGapJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new f(null), 3);
    }

    @Override // dv0.InterfaceC12383a
    /* JADX INFO: renamed from: e */
    public int mo34750e() {
        C12386d c12386d = (C12386d) AbstractC25265s.m74100H0(this.realtimeDataFlow.getReplayCache());
        if (c12386d != null) {
            return c12386d.getPacketsPublished();
        }
        return 0;
    }

    @Override // dv0.InterfaceC12383a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double mo34746a() {
        C12386d c12386d = (C12386d) AbstractC25265s.m74100H0(this.realtimeDataFlow.getReplayCache());
        return Double.valueOf(c12386d != null ? AbstractC12385c.m34760a(c12386d.getGapInSeconds()) : 0.0d);
    }
}
