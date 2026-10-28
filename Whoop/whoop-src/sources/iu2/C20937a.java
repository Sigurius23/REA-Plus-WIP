package iu2;

import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.FeatureFlagChecker;
import e82.C12853a;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import jk0.InterfaceC21750d;
import jt0.EnumC21935b;
import jt0.InterfaceC21934a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lt0.AbstractC24726c;
import nt0.C27121i;
import or2.AbstractC28181m0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rt0.AbstractC31802d;
import rt0.InterfaceC31799a;
import rt0.InterfaceC31800b;
import rt0.InterfaceC31801c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import u92.C34660d;
import zj0.C40727h;

/* JADX INFO: renamed from: iu2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u001dH\u0086@¢\u0006\u0004\b \u0010\u001cJ\r\u0010!\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002¢\u0006\u0004\b'\u0010&J\u0018\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b)\u0010*J \u0010,\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b,\u0010-J8\u00102\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001a2\u001e\u00101\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001000/\u0012\u0006\u0012\u0004\u0018\u00010\u00010.H\u0082@¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b4\u0010\u001cJ\u0010\u00105\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b5\u0010\u001cJ\u0010\u00106\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b6\u0010\u001cJ\u0012\u00108\u001a\u0004\u0018\u000107H\u0082@¢\u0006\u0004\b8\u0010\u001cJ\u000f\u00109\u001a\u00020\u001aH\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010KR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010LR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0O8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR!\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bS\u0010W\u001a\u0004\bX\u0010&R\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\bI\u0010&R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u0002070#8F¢\u0006\u0006\u001a\u0004\bQ\u0010&R\u0016\u0010^\u001a\u0004\u0018\u00010\\8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010]¨\u0006_"}, m65681d2 = {"Liu2/a;", "", "Lrt0/c;", "realTimeStreamSdk", "Le82/a;", "r10RealtimeStream", "Ltd1/b;", "whoopStrap", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lin2/d;", "dispatcherFactory", "Lfi0/a;", "baseAnalytics", "Lu92/d;", "prefsStore", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "Ljt0/a;", "connectivityAnalytics", "<init>", "(Lrt0/c;Le82/a;Ltd1/b;Lci2/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lin2/d;Lfi0/a;Lu92/d;Lbc3/c0;Ltr2/n;Ljt0/a;)V", "", "v", "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "y", "u", "x", "q", "()V", "Lec3/l;", "", "i", "()Lec3/l;", "j", "turnOn", "z", "(ZLq83/d;)Ljava/lang/Object;", "waitForStrapReady", "A", "(ZZLq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lq83/d;", "Lzj0/h;", "sendCommand", "s", "(ZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "t", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "r", "Lnt0/i;", "p", "n", "()Z", "a", "Lrt0/c;", "b", "Le82/a;", "c", "Ltd1/b;", "d", "Lci2/b;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Lin2/d;", "g", "Lfi0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lu92/d;", "Lbc3/c0;", "Ltr2/n;", "k", "Ljt0/a;", "Lec3/p1;", "Lbc3/k1;", "l", "Lec3/p1;", "m", "()Lec3/p1;", "retryRawDataStreamingJob", "Lrt0/b$b;", "Ll83/h;", "getMaverickImuPacketsFlow", "maverickImuPacketsFlow", "hrFlow", "r10Flow", "Ljk0/d;", "()Ljk0/d;", "iWhoopStrap", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20937a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31801c realTimeStreamSdk;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12853a r10RealtimeStream;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC21934a connectivityAnalytics;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13075p1 retryRawDataStreamingJob;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC23462h maverickImuPacketsFlow;

    /* JADX INFO: renamed from: iu2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78958a;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f78958a = iArr;
        }
    }

    /* JADX INFO: renamed from: iu2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78959w;

        /* JADX INFO: renamed from: iu2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78960w;

            /* JADX INFO: renamed from: iu2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrRealtimeFlow$$inlined$filterIsInstance$1$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41792a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f78962F;

                /* JADX INFO: renamed from: G */
                Object f78963G;

                /* JADX INFO: renamed from: H */
                int f78964H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78965w;

                /* JADX INFO: renamed from: x */
                int f78966x;

                /* JADX INFO: renamed from: y */
                Object f78967y;

                /* JADX INFO: renamed from: z */
                Object f78968z;

                public C41792a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78965w = obj;
                    this.f78966x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f78960w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41792a c41792a;
                if (interfaceC30057d instanceof C41792a) {
                    c41792a = (C41792a) interfaceC30057d;
                    int i13 = c41792a.f78966x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41792a.f78966x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41792a = new C41792a(interfaceC30057d);
                    }
                } else {
                    c41792a = new C41792a(interfaceC30057d);
                }
                Object obj2 = c41792a.f78965w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41792a.f78966x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78960w;
                    if (obj instanceof InterfaceC31799a.d) {
                        c41792a.f78967y = null;
                        c41792a.f78968z = null;
                        c41792a.f78962F = null;
                        c41792a.f78963G = null;
                        c41792a.f78964H = 0;
                        c41792a.f78966x = 1;
                        if (interfaceC13062m.emit(obj, c41792a) == enumC31071a) {
                            return enumC31071a;
                        }
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
            this.f78959w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78959w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78969w;

        /* JADX INFO: renamed from: iu2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78970w;

            /* JADX INFO: renamed from: iu2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrRealtimeFlow$$inlined$map$1$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41793a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78971E;

                /* JADX INFO: renamed from: F */
                Object f78972F;

                /* JADX INFO: renamed from: G */
                Object f78973G;

                /* JADX INFO: renamed from: H */
                int f78974H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78975w;

                /* JADX INFO: renamed from: x */
                int f78976x;

                /* JADX INFO: renamed from: y */
                Object f78977y;

                public C41793a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78975w = obj;
                    this.f78976x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f78970w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41793a c41793a;
                if (interfaceC30057d instanceof C41793a) {
                    c41793a = (C41793a) interfaceC30057d;
                    int i13 = c41793a.f78976x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41793a.f78976x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41793a = new C41793a(interfaceC30057d);
                    }
                } else {
                    c41793a = new C41793a(interfaceC30057d);
                }
                Object obj2 = c41793a.f78975w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41793a.f78976x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78970w;
                    InterfaceC31800b interfaceC31800bM98792a = ((InterfaceC31799a.d) obj).getPacket();
                    AbstractC22676k.m65748h(interfaceC31800bM98792a, "null cannot be cast to non-null type com.whoop.connectivityCore.sdk.RealTimeDataType.HR");
                    Integer num = new Integer(((InterfaceC31800b.a) interfaceC31800bM98792a).getHeartRate());
                    c41793a.f78977y = null;
                    c41793a.f78971E = null;
                    c41793a.f78972F = null;
                    c41793a.f78973G = null;
                    c41793a.f78974H = 0;
                    c41793a.f78976x = 1;
                    if (interfaceC13062m.emit(num, c41793a) == enumC31071a) {
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
            this.f78969w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78969w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrRealtimeFlow$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "hr", "Ll83/a0;", "<anonymous>", "(I)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78979w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ int f78980x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C20937a.this.new d(interfaceC30057d);
            dVar.f78980x = ((Number) obj).intValue();
            return dVar;
        }

        public final Object invoke(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(Integer.valueOf(i13), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13 = this.f78980x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78979w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (i13 == 0) {
                C20937a.this.logger.mo85226q("Received HR packet with value 0", new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }
    }

    /* JADX INFO: renamed from: iu2.a$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78982w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f78983x;

        /* JADX INFO: renamed from: iu2.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78984w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f78985x;

            /* JADX INFO: renamed from: iu2.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrStreamFromR10$$inlined$filter$1$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41794a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f78987F;

                /* JADX INFO: renamed from: G */
                Object f78988G;

                /* JADX INFO: renamed from: H */
                int f78989H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78990w;

                /* JADX INFO: renamed from: x */
                int f78991x;

                /* JADX INFO: renamed from: y */
                Object f78992y;

                /* JADX INFO: renamed from: z */
                Object f78993z;

                public C41794a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78990w = obj;
                    this.f78991x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4) {
                this.f78984w = interfaceC13062m;
                this.f78985x = z4;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0050  */
            /* JADX WARN: Code duplicated, block: B:23:0x0063 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41794a c41794a;
                if (interfaceC30057d instanceof C41794a) {
                    c41794a = (C41794a) interfaceC30057d;
                    int i13 = c41794a.f78991x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41794a.f78991x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41794a = new C41794a(interfaceC30057d);
                    }
                } else {
                    c41794a = new C41794a(interfaceC30057d);
                }
                Object obj2 = c41794a.f78990w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41794a.f78991x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78984w;
                    C27121i c27121i = (C27121i) obj;
                    if (this.f78985x) {
                        if ((c27121i != null ? c27121i.getType() : null) == AbstractC24726c.a.REALTIME_RAW_DATA) {
                            c41794a.f78992y = null;
                            c41794a.f78993z = null;
                            c41794a.f78987F = null;
                            c41794a.f78988G = null;
                            c41794a.f78989H = 0;
                            c41794a.f78991x = 1;
                            if (interfaceC13062m.emit(obj, c41794a) == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                    } else {
                        c41794a.f78992y = null;
                        c41794a.f78993z = null;
                        c41794a.f78987F = null;
                        c41794a.f78988G = null;
                        c41794a.f78989H = 0;
                        c41794a.f78991x = 1;
                        if (interfaceC13062m.emit(obj, c41794a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public e(InterfaceC13058l interfaceC13058l, boolean z4) {
            this.f78982w = interfaceC13058l;
            this.f78983x = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78982w.collect(new a(interfaceC13062m, this.f78983x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78994w;

        /* JADX INFO: renamed from: iu2.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78995w;

            /* JADX INFO: renamed from: iu2.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrStreamFromR10$$inlined$map$1$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41795a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78996E;

                /* JADX INFO: renamed from: F */
                Object f78997F;

                /* JADX INFO: renamed from: G */
                Object f78998G;

                /* JADX INFO: renamed from: H */
                int f78999H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79000w;

                /* JADX INFO: renamed from: x */
                int f79001x;

                /* JADX INFO: renamed from: y */
                Object f79002y;

                public C41795a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79000w = obj;
                    this.f79001x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f78995w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41795a c41795a;
                if (interfaceC30057d instanceof C41795a) {
                    c41795a = (C41795a) interfaceC30057d;
                    int i13 = c41795a.f79001x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41795a.f79001x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41795a = new C41795a(interfaceC30057d);
                    }
                } else {
                    c41795a = new C41795a(interfaceC30057d);
                }
                Object obj2 = c41795a.f79000w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41795a.f79001x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78995w;
                    C27121i c27121i = (C27121i) obj;
                    Integer num = new Integer(c27121i != null ? c27121i.getHeartRate() & 255 : -1);
                    c41795a.f79002y = null;
                    c41795a.f78996E = null;
                    c41795a.f78997F = null;
                    c41795a.f78998G = null;
                    c41795a.f78999H = 0;
                    c41795a.f79001x = 1;
                    if (interfaceC13062m.emit(num, c41795a) == enumC31071a) {
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
            this.f78994w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78994w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$g */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79004w;

        /* JADX INFO: renamed from: iu2.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79005w;

            /* JADX INFO: renamed from: iu2.a$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrStreamFromR10$$inlined$map$2$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41796a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79006E;

                /* JADX INFO: renamed from: F */
                Object f79007F;

                /* JADX INFO: renamed from: G */
                Object f79008G;

                /* JADX INFO: renamed from: H */
                int f79009H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79010w;

                /* JADX INFO: renamed from: x */
                int f79011x;

                /* JADX INFO: renamed from: y */
                Object f79012y;

                public C41796a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79010w = obj;
                    this.f79011x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f79005w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41796a c41796a;
                if (interfaceC30057d instanceof C41796a) {
                    c41796a = (C41796a) interfaceC30057d;
                    int i13 = c41796a.f79011x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41796a.f79011x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41796a = new C41796a(interfaceC30057d);
                    }
                } else {
                    c41796a = new C41796a(interfaceC30057d);
                }
                Object obj2 = c41796a.f79010w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41796a.f79011x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79005w;
                    Integer num = new Integer(((C27121i) obj).getHeartRate() & 255);
                    c41796a.f79012y = null;
                    c41796a.f79006E = null;
                    c41796a.f79007F = null;
                    c41796a.f79008G = null;
                    c41796a.f79009H = 0;
                    c41796a.f79011x = 1;
                    if (interfaceC13062m.emit(num, c41796a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f79004w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79004w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$getHrStreamFromR10$1", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lnt0/i;", "oldVal", "newVal", "<anonymous>", "(Lnt0/i;Lnt0/i;)Lnt0/i;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f79014w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f79015x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79016y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C27121i c27121i, C27121i c27121i2, InterfaceC30057d<? super C27121i> interfaceC30057d) {
            h hVar = C20937a.this.new h(interfaceC30057d);
            hVar.f79015x = c27121i;
            hVar.f79016y = c27121i2;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27121i c27121i = (C27121i) this.f79015x;
            C27121i c27121i2 = (C27121i) this.f79016y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f79014w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (c27121i != null) {
                C20937a c20937a = C20937a.this;
                if (c27121i2.getTimestampSeconds() < c27121i.getTimestampSeconds()) {
                    c20937a.logger.mo85216g("R10 packets received in StrengthTrainerPacketManager out of order. Latest packet: ( timestamp seconds " + c27121i2.getTimestampSeconds() + ", hr " + (c27121i2.getHeartRate() & 255) + ", type: " + c27121i2.getType() + " ), previous packet: ( timestamp seconds " + c27121i.getTimestampSeconds() + ", hr " + (c27121i.getHeartRate() & 255) + ", type: " + c27121i2.getType() + " )", new AbstractC30556a.a[0]);
                }
            }
            return c27121i2;
        }
    }

    /* JADX INFO: renamed from: iu2.a$i */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79018w;

        /* JADX INFO: renamed from: iu2.a$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79019w;

            /* JADX INFO: renamed from: iu2.a$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$maverickImuPacketsFlow_delegate$lambda$0$$inlined$filterIsInstance$1$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41797a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f79021F;

                /* JADX INFO: renamed from: G */
                Object f79022G;

                /* JADX INFO: renamed from: H */
                int f79023H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79024w;

                /* JADX INFO: renamed from: x */
                int f79025x;

                /* JADX INFO: renamed from: y */
                Object f79026y;

                /* JADX INFO: renamed from: z */
                Object f79027z;

                public C41797a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79024w = obj;
                    this.f79025x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f79019w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41797a c41797a;
                if (interfaceC30057d instanceof C41797a) {
                    c41797a = (C41797a) interfaceC30057d;
                    int i13 = c41797a.f79025x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41797a.f79025x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41797a = new C41797a(interfaceC30057d);
                    }
                } else {
                    c41797a = new C41797a(interfaceC30057d);
                }
                Object obj2 = c41797a.f79024w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41797a.f79025x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79019w;
                    if (obj instanceof InterfaceC31799a.d) {
                        c41797a.f79026y = null;
                        c41797a.f79027z = null;
                        c41797a.f79021F = null;
                        c41797a.f79022G = null;
                        c41797a.f79023H = 0;
                        c41797a.f79025x = 1;
                        if (interfaceC13062m.emit(obj, c41797a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f79018w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79018w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$j */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f79028w;

        /* JADX INFO: renamed from: iu2.a$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79029w;

            /* JADX INFO: renamed from: iu2.a$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$maverickImuPacketsFlow_delegate$lambda$0$$inlined$map$1$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41798a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79030E;

                /* JADX INFO: renamed from: F */
                Object f79031F;

                /* JADX INFO: renamed from: G */
                Object f79032G;

                /* JADX INFO: renamed from: H */
                int f79033H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79034w;

                /* JADX INFO: renamed from: x */
                int f79035x;

                /* JADX INFO: renamed from: y */
                Object f79036y;

                public C41798a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79034w = obj;
                    this.f79035x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f79029w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41798a c41798a;
                if (interfaceC30057d instanceof C41798a) {
                    c41798a = (C41798a) interfaceC30057d;
                    int i13 = c41798a.f79035x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41798a.f79035x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41798a = new C41798a(interfaceC30057d);
                    }
                } else {
                    c41798a = new C41798a(interfaceC30057d);
                }
                Object obj2 = c41798a.f79034w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41798a.f79035x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f79029w;
                    InterfaceC31800b interfaceC31800bM98792a = ((InterfaceC31799a.d) obj).getPacket();
                    AbstractC22676k.m65748h(interfaceC31800bM98792a, "null cannot be cast to non-null type com.whoop.connectivityCore.sdk.RealTimeDataType.Imu");
                    c41798a.f79036y = null;
                    c41798a.f79030E = null;
                    c41798a.f79031F = null;
                    c41798a.f79032G = null;
                    c41798a.f79033H = 0;
                    c41798a.f79035x = 1;
                    if (interfaceC13062m.emit((InterfaceC31800b.b) interfaceC31800bM98792a, c41798a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l) {
            this.f79028w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f79028w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$nextRawDataPacketOrNull$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {321}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lnt0/i;", "<anonymous>", "(Lbc3/c0;)Lnt0/i;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79038w;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20937a.this.new k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C27121i> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79038w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13058l interfaceC13058lM58157l = C20937a.this.m58157l();
            this.f79038w = 1;
            Object objM36577C = AbstractC13091v.m36577C(interfaceC13058lM58157l, this);
            return objM36577C == enumC31071a ? enumC31071a : objM36577C;
        }
    }

    /* JADX INFO: renamed from: iu2.a$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$retryRawDataStreamingUntilOn$1", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {306}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79040w;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20937a.this.new l(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79040w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C20937a c20937a = C20937a.this;
                this.f79040w = 1;
                if (c20937a.m58151r(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: iu2.a$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {313, 315}, m100432m = "retryStreamingR10UntilOn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f79042w;

        /* JADX INFO: renamed from: y */
        int f79044y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79042w = obj;
            this.f79044y |= Integer.MIN_VALUE;
            return C20937a.this.m58151r(this);
        }
    }

    /* JADX INFO: renamed from: iu2.a$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$sendStrapCommandWithRetry$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {204, 207, 208}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C20937a f79045E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f79046F;

        /* JADX INFO: renamed from: w */
        int f79047w;

        /* JADX INFO: renamed from: x */
        int f79048x;

        /* JADX INFO: renamed from: y */
        int f79049y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f79050z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(boolean z4, C20937a c20937a, Function1 function1, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79050z = z4;
            this.f79045E = c20937a;
            this.f79046F = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new n(this.f79050z, this.f79045E, this.f79046F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x005e A[PHI: r1
          0x005e: PHI (r1v7 int) = (r1v3 int), (r1v8 int) binds: [B:23:0x0057, B:35:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        
            if (r10 == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v11, types: [int] */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v24 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:34:0x0085). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.f79049y
                r2 = 2
                r3 = 0
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L2f
                if (r1 == r5) goto L29
                if (r1 == r2) goto L1f
                if (r1 != r4) goto L17
                int r1 = r9.f79047w
                p505ts.AbstractC34132o.m107864I(r10)
                goto L85
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                int r1 = r9.f79048x
                int r5 = r9.f79047w
                p505ts.AbstractC34132o.m107864I(r10)
                r10 = r1
                r1 = r5
                goto L76
            L29:
                int r1 = r9.f79047w
                p505ts.AbstractC34132o.m107864I(r10)
                goto L55
            L2f:
                p505ts.AbstractC34132o.m107864I(r10)
                boolean r10 = r9.f79050z
                if (r10 != 0) goto L47
                iu2.a r10 = r9.f79045E
                td1.b r10 = iu2.C20937a.m58142e(r10)
                td1.e r10 = r10.mo106484A()
                td1.e r1 = td1.EnumC33707e.READY
                if (r10 == r1) goto L47
                java.lang.Boolean r10 = java.lang.Boolean.FALSE
                return r10
            L47:
                kotlin.jvm.functions.Function1 r10 = r9.f79046F
                r9.f79047w = r3
                r9.f79049y = r5
                java.lang.Object r10 = r10.invoke(r9)
                if (r10 != r0) goto L54
                goto L84
            L54:
                r1 = r3
            L55:
                zj0.h r10 = (zj0.C40727h) r10
                if (r10 == 0) goto L5e
                boolean r10 = r10.m132198W()
                goto L5f
            L5e:
                r10 = r3
            L5f:
                if (r1 >= r4) goto L8e
                if (r10 != 0) goto L8e
                int r1 = r1 + 1
                r5 = 500(0x1f4, double:2.47E-321)
                long r7 = (long) r1
                long r7 = r7 * r5
                r9.f79047w = r1
                r9.f79048x = r10
                r9.f79049y = r2
                java.lang.Object r5 = bc3.AbstractC3034m0.m8782b(r7, r9)
                if (r5 != r0) goto L76
                goto L84
            L76:
                kotlin.jvm.functions.Function1 r5 = r9.f79046F
                r9.f79047w = r1
                r9.f79048x = r10
                r9.f79049y = r4
                java.lang.Object r10 = r5.invoke(r9)
                if (r10 != r0) goto L85
            L84:
                return r0
            L85:
                zj0.h r10 = (zj0.C40727h) r10
                if (r10 == 0) goto L5e
                boolean r10 = r10.m132198W()
                goto L5f
            L8e:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: iu2.C20937a.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: iu2.a$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$startStreamingRawData$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {256, 268}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        boolean f79051w;

        /* JADX INFO: renamed from: x */
        int f79052x;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20937a.this.new o(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79052x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C20937a.this.prefsStore.m109538q(SharedPreferenceConstants.RAW_DATA_STREAMING_ENABLED, true);
                C20937a c20937a = C20937a.this;
                this.f79052x = 1;
                obj = c20937a.m58137A(true, false, this);
                if (obj != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f79051w;
                AbstractC34132o.m107864I(obj);
            }
            zBooleanValue = z4;
            return Boolean.valueOf(zBooleanValue);
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (!zBooleanValue) {
                C20937a.this.baseAnalytics.mo41424f("Connectivity", "R10 Stream Not On", null, "Workout Builder");
                C20937a.this.logger.mo85222m("Failed to turnOnOrOffR10StreamingWithRetry", new AbstractC30556a.a[0]);
                InterfaceC33704b interfaceC33704b = C20937a.this.whoopStrap;
                this.f79051w = zBooleanValue;
                this.f79052x = 2;
                if (InterfaceC33704b.m106483v(interfaceC33704b, false, 0L, this, 2, null) != enumC31071a) {
                    z4 = zBooleanValue;
                    zBooleanValue = z4;
                }
                return enumC31071a;
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: iu2.a$p */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {136}, m100432m = "startStreamingRealtimeStrengthTrainerPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f79054w;

        /* JADX INFO: renamed from: y */
        int f79056y;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79054w = obj;
            this.f79056y |= Integer.MIN_VALUE;
            return C20937a.this.m58161v(this);
        }
    }

    /* JADX INFO: renamed from: iu2.a$q */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$stopStreamingRawData$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {280}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79057w;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20937a.this.new q(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79057w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C20937a c20937a = C20937a.this;
                this.f79057w = 1;
                obj = c20937a.m58137A(false, true, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C20937a.this.prefsStore.m109538q(SharedPreferenceConstants.RAW_DATA_STREAMING_ENABLED, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iu2.a$r */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {162, 163}, m100432m = "stopStreamingRealtimeStrengthTrainerPackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f79059w;

        /* JADX INFO: renamed from: y */
        int f79061y;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79059w = obj;
            this.f79061y |= Integer.MIN_VALUE;
            return C20937a.this.m58163y(this);
        }
    }

    /* JADX INFO: renamed from: iu2.a$s */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.data.StrengthTrainerPacketManager$turnOnOrOffR10StreamingWithRetry$2", m100430f = "StrengthTrainerPacketManager.kt", m100431l = {186}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lzj0/h;", "<anonymous>", "()Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f79062w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f79064y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(boolean z4, InterfaceC30057d<? super s> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f79064y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C20937a.this.new s(this.f79064y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79062w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC33704b interfaceC33704b = C20937a.this.whoopStrap;
            boolean z4 = this.f79064y;
            this.f79062w = 1;
            Object objM106483v = InterfaceC33704b.m106483v(interfaceC33704b, z4, 0L, this, 2, null);
            return objM106483v == enumC31071a ? enumC31071a : objM106483v;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C40727h> interfaceC30057d) {
            return ((s) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C20937a(InterfaceC31801c realTimeStreamSdk, C12853a r10RealtimeStream, InterfaceC33704b whoopStrap, InterfaceC4733b whoopStrapProvider, FeatureFlagChecker featureFlagChecker, InterfaceC18732d dispatcherFactory, InterfaceC14515a baseAnalytics, C34660d prefsStore, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, InterfaceC21934a connectivityAnalytics) {
        AbstractC22676k.m65750j(realTimeStreamSdk, "realTimeStreamSdk");
        AbstractC22676k.m65750j(r10RealtimeStream, "r10RealtimeStream");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(connectivityAnalytics, "connectivityAnalytics");
        this.realTimeStreamSdk = realTimeStreamSdk;
        this.r10RealtimeStream = r10RealtimeStream;
        this.whoopStrap = whoopStrap;
        this.whoopStrapProvider = whoopStrapProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.dispatcherFactory = dispatcherFactory;
        this.baseAnalytics = baseAnalytics;
        this.prefsStore = prefsStore;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.connectivityAnalytics = connectivityAnalytics;
        this.retryRawDataStreamingJob = AbstractC13091v.m36593c(null);
        this.maverickImuPacketsFlow = AbstractC30060g.m92088H(new C19683b(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final Object m58137A(boolean z4, boolean z13, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return m58152s(z13, new s(z4, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m58145i() {
        InterfaceC21750d interfaceC21750dM58147k = m58147k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM58147k != null ? interfaceC21750dM58147k.mo24752w0() : null;
        switch (enumC32978vMo24752w0 == null ? -1 : a.f78958a[enumC32978vMo24752w0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                return C13054k.f45116w;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                return m58146j();
            case 5:
            case 6:
                return new C13052j1(new c(new b(this.realTimeStreamSdk.mo36106a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31800b.a.class), true))), new d(null), 0);
        }
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC13058l m58146j() {
        if (!this.featureFlagChecker.isFeatureEnabled("st-packet-debug-logs")) {
            return new g(m58157l());
        }
        return new f(new e(new C13060l1(null, m58157l(), new h(null)), this.featureFlagChecker.isFeatureEnabled("st-packet-sanitize")));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC21750d m58147k() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m58148n() {
        return this.prefsStore.m109528e(SharedPreferenceConstants.RAW_DATA_STREAMING_ENABLED, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC13058l m58149o(C20937a c20937a) {
        return new j(new i(c20937a.realTimeStreamSdk.mo36106a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31800b.b.class), true)));
    }

    /* JADX INFO: renamed from: p */
    private final Object m58150p(InterfaceC30057d<? super C27121i> interfaceC30057d) {
        Duration.Companion companion = Duration.INSTANCE;
        return AbstractC3028k2.m8751e(DurationKt.toDuration(5, DurationUnit.SECONDS), new k(null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[PHI: r0 r13
      0x0032: PHI (r0v4 iu2.a$m) = (r0v3 iu2.a$m), (r0v2 iu2.a$m) binds: [B:19:0x003d, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r13v3 java.lang.Object) = (r13v2 java.lang.Object), (r13v1 java.lang.Object) binds: [B:19:0x003d, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005c -> B:18:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: r */
    public final java.lang.Object m58151r(q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof iu2.C20937a.m
            if (r0 == 0) goto L13
            r0 = r13
            iu2.a$m r0 = (iu2.C20937a.m) r0
            int r1 = r0.f79044y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79044y = r1
            goto L18
        L13:
            iu2.a$m r0 = new iu2.a$m
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f79042w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f79044y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L34
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            p505ts.AbstractC34132o.m107864I(r13)
        L32:
            r9 = r0
            goto L40
        L34:
            p505ts.AbstractC34132o.m107864I(r13)
        L37:
            r0.f79044y = r4
            java.lang.Object r13 = r12.m58150p(r0)
            if (r13 != r1) goto L32
            goto L5b
        L40:
            r0 = 0
            if (r13 != 0) goto L5e
            tr2.n r13 = r12.logger
            java.lang.String r2 = "no R10 packets received 5 seconds after enabling raw data streaming, resending command..."
            qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
            r13.mo85226q(r2, r0)
            td1.b r5 = r12.whoopStrap
            r9.f79044y = r3
            r6 = 1
            r7 = 0
            r10 = 2
            r11 = 0
            java.lang.Object r13 = td1.InterfaceC33704b.m106483v(r5, r6, r7, r9, r10, r11)
            if (r13 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r0 = r9
            goto L37
        L5e:
            tr2.n r13 = r12.logger
            java.lang.String r1 = "R10 packet received, raw data streaming is enabled"
            qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
            r13.mo85216g(r1, r0)
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: iu2.C20937a.m58151r(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: s */
    private final Object m58152s(boolean z4, Function1 function1, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new n(z4, this, function1, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: t */
    private final Object m58153t(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new o(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: w */
    private final Object m58154w(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.mo54465b(), new q(null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private final Object m58155z(boolean z4, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        boolean z13;
        InterfaceC21750d interfaceC21750dM58147k = m58147k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM58147k != null ? interfaceC21750dM58147k.mo24752w0() : null;
        switch (enumC32978vMo24752w0 == null ? -1 : a.f78958a[enumC32978vMo24752w0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                z13 = false;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                z13 = true;
                break;
            case 5:
            case 6:
                return AbstractC31802d.m98793a(this.realTimeStreamSdk.mo36106a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31800b.a.class), z4), interfaceC30057d);
        }
        return Boolean.valueOf(z13);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m58156h() {
        return m58145i();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m58157l() {
        return this.r10RealtimeStream.getFlow();
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC13075p1 getRetryRawDataStreamingJob() {
        return this.retryRawDataStreamingJob;
    }

    /* JADX INFO: renamed from: q */
    public final void m58159q() {
        InterfaceC21750d interfaceC21750dM58147k = m58147k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM58147k != null ? interfaceC21750dM58147k.mo24752w0() : null;
        switch (enumC32978vMo24752w0 == null ? -1 : a.f78958a[enumC32978vMo24752w0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                AbstractC28181m0.m85297a(this.coroutineScope, this.retryRawDataStreamingJob, this.dispatcherFactory.mo54465b(), new l(null));
                return;
        }
    }

    /* JADX INFO: renamed from: u */
    public final Object m58160u(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM58147k = m58147k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM58147k != null ? interfaceC21750dM58147k.mo24752w0() : null;
        switch (enumC32978vMo24752w0 == null ? -1 : a.f78958a[enumC32978vMo24752w0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                return Boolean.FALSE;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                return m58153t(interfaceC30057d);
            case 5:
            case 6:
                return AbstractC31802d.m98793a(this.realTimeStreamSdk.mo36106a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31800b.b.class), true), interfaceC30057d);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m58161v(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        p pVar;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f79056y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f79056y = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        Object objM58160u = pVar.f79054w;
        Object obj = EnumC31071a.f128113w;
        int i14 = pVar.f79056y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM58160u);
            pVar.f79056y = 1;
            objM58160u = m58160u(pVar);
            if (objM58160u == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM58160u);
        }
        boolean zBooleanValue = ((Boolean) objM58160u).booleanValue();
        InterfaceC21750d interfaceC21750dM58147k = m58147k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM58147k != null ? interfaceC21750dM58147k.mo24752w0() : null;
        switch (enumC32978vMo24752w0 == null ? -1 : a.f78958a[enumC32978vMo24752w0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                this.connectivityAnalytics.mo62488b(EnumC21935b.REALTIME_R10);
                break;
            case 5:
            case 6:
                this.connectivityAnalytics.mo62488b(EnumC21935b.REALTIME_HR, EnumC21935b.REALTIME_IMU);
                break;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x004b A[RETURN] */
    /* JADX INFO: renamed from: x */
    public final Object m58162x(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM58154w;
        InterfaceC21750d interfaceC21750dM58147k = m58147k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM58147k != null ? interfaceC21750dM58147k.mo24752w0() : null;
        int i13 = enumC32978vMo24752w0 == null ? -1 : a.f78958a[enumC32978vMo24752w0.ordinal()];
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case -1:
            case 1:
            case 2:
            case 3:
                return c23454a0;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                if (m58148n() && (objM58154w = m58154w(interfaceC30057d)) == EnumC31071a.f128113w) {
                    return objM58154w;
                }
                return c23454a0;
            case 5:
            case 6:
                Object objM98793a = AbstractC31802d.m98793a(this.realTimeStreamSdk.mo36106a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31800b.b.class), false), interfaceC30057d);
                return objM98793a == EnumC31071a.f128113w ? objM98793a : c23454a0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (m58155z(false, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m58163y(q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof iu2.C20937a.r
            if (r0 == 0) goto L13
            r0 = r6
            iu2.a$r r0 = (iu2.C20937a.r) r0
            int r1 = r0.f79061y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79061y = r1
            goto L18
        L13:
            iu2.a$r r0 = new iu2.a$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79059w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f79061y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r6)
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L42
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            r0.f79061y = r4
            java.lang.Object r6 = r5.m58162x(r0)
            if (r6 != r1) goto L42
            goto L4b
        L42:
            r0.f79061y = r3
            r6 = 0
            java.lang.Object r6 = r5.m58155z(r6, r0)
            if (r6 != r1) goto L4c
        L4b:
            return r1
        L4c:
            jt0.a r6 = r5.connectivityAnalytics
            java.lang.String r0 = "Weightlifting"
            r6.mo62487a(r0)
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: iu2.C20937a.m58163y(q83.d):java.lang.Object");
    }
}
