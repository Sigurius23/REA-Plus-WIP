package pt1;

import androidx.core.app.NotificationManagerCompat;
import c93.InterfaceC4351m;
import dk0.C12110j;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import fu1.InterfaceC14783b;
import fu1.InterfaceC14784c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23468n;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import qt1.C30587a;
import qt1.C30588b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ss1.C32948a;
import tr2.InterfaceC34116n;
import ts1.InterfaceC34144c;
import wb3.AbstractC37056f;
import yu0.C39787d;
import yu0.EnumC39788e;

/* JADX INFO: renamed from: pt1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010'\u001a\b\u0012\u0004\u0012\u00020&0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 H\u0082@¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m65681d2 = {"Lpt1/d;", "", "Lfu1/b;", "labradorService", "Lyu0/d;", "gen5ConnectivityAnalyticsHelper", "Ltr2/n;", "logger", "Lts1/c;", "labradorReadingAccumulator", "Lss1/a;", "analytics", "<init>", "(Lfu1/b;Lyu0/d;Ltr2/n;Lts1/c;Lss1/a;)V", "Lht1/e;", "wrist", "Lpt1/b;", "m", "(Lht1/e;Lq83/d;)Ljava/lang/Object;", "o", "(Lq83/d;)Ljava/lang/Object;", "domainState", "q", "(Lpt1/b;Lq83/d;)Ljava/lang/Object;", "n", "Ll83/a0;", "p", "()V", "r", "", "k", "()I", "", "readings", "Ly81/f;", "lineColor", "", "inProgress", "Lqt1/b;", "j", "(Ljava/util/List;Ly81/f;ZLq83/d;)Ljava/lang/Object;", "s", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lpt1/a;", "upstream", "l", "(Lec3/l;)Lec3/l;", "a", "Lfu1/b;", "b", "Lyu0/d;", "c", "Ltr2/n;", "d", "Lts1/c;", "e", "Lss1/a;", "Lec3/p1;", "f", "Lec3/p1;", "currentXPosition", "Lmc3/a;", "g", "Lmc3/a;", "graphDataPointsMutex", "", "Lqt1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "[Lqt1/a;", "graphPointsArray", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29514d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14783b labradorService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39787d gen5ConnectivityAnalyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34144c labradorReadingAccumulator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C32948a analytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13075p1 currentXPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC25435a graphDataPointsMutex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C30587a[] graphPointsArray;

    /* JADX INFO: renamed from: pt1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor", m100430f = "LabradorReadingInteractor.kt", m100431l = {375}, m100432m = "createdLabradorLineGraphs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f120062F;

        /* JADX INFO: renamed from: w */
        Object f120063w;

        /* JADX INFO: renamed from: x */
        Object f120064x;

        /* JADX INFO: renamed from: y */
        boolean f120065y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f120066z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120066z = obj;
            this.f120062F |= Integer.MIN_VALUE;
            return C29514d.this.m90182j(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: pt1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LabradorReadingInteractor.kt", m100431l = {192, 206, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f120067E;

        /* JADX INFO: renamed from: F */
        Object f120068F;

        /* JADX INFO: renamed from: G */
        Object f120069G;

        /* JADX INFO: renamed from: H */
        int f120070H;

        /* JADX INFO: renamed from: w */
        int f120071w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120072x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120073y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29514d f120074z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C29514d c29514d) {
            super(3, interfaceC30057d);
            this.f120074z = c29514d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC29511a interfaceC29511a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f120074z);
            bVar.f120072x = interfaceC13062m;
            bVar.f120073y = interfaceC29511a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
        
            if (r4 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r7, r2, r17) == r1) goto L27;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC29511a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pt1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$1$1", m100430f = "LabradorReadingInteractor.kt", m100431l = {109, 114, 130, 159, 164}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lpt1/b;", "domainState", "Ldk0/j;", "r17", "<anonymous>", "(Lpt1/b;Ldk0/j;)Lpt1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f120075E;

        /* JADX INFO: renamed from: F */
        Object f120076F;

        /* JADX INFO: renamed from: G */
        Object f120077G;

        /* JADX INFO: renamed from: H */
        long f120078H;

        /* JADX INFO: renamed from: I */
        int f120079I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f120080J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f120081K;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ InterfaceC29511a f120083M;

        /* JADX INFO: renamed from: w */
        Object f120084w;

        /* JADX INFO: renamed from: x */
        Object f120085x;

        /* JADX INFO: renamed from: y */
        Object f120086y;

        /* JADX INFO: renamed from: z */
        Object f120087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC29511a interfaceC29511a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f120083M = interfaceC29511a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C29512b c29512b, C12110j c12110j, InterfaceC30057d<? super C29512b> interfaceC30057d) {
            c cVar = C29514d.this.new c(this.f120083M, interfaceC30057d);
            cVar.f120080J = c29512b;
            cVar.f120081K = c12110j;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:73:0x022a  */
        /* JADX WARN: Code duplicated, block: B:76:0x0250  */
        /* JADX WARN: Code duplicated, block: B:79:0x0261  */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0318, code lost:
        
            if (r1 == r3) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0342, code lost:
        
            if (r1 == r3) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0140, code lost:
        
            if (r1 == r3) goto L113;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 841
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pt1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$1$2$1", m100430f = "LabradorReadingInteractor.kt", m100431l = {205, 209, 206}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpt1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f120088E;

        /* JADX INFO: renamed from: F */
        Object f120089F;

        /* JADX INFO: renamed from: G */
        Object f120090G;

        /* JADX INFO: renamed from: H */
        Object f120091H;

        /* JADX INFO: renamed from: I */
        Object f120092I;

        /* JADX INFO: renamed from: J */
        long f120093J;

        /* JADX INFO: renamed from: K */
        int f120094K;

        /* JADX INFO: renamed from: L */
        int f120095L;

        /* JADX INFO: renamed from: M */
        int f120096M;

        /* JADX INFO: renamed from: N */
        private /* synthetic */ Object f120097N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ List<List<Integer>> f120098O;

        /* JADX INFO: renamed from: P */
        final /* synthetic */ long f120099P;

        /* JADX INFO: renamed from: Q */
        final /* synthetic */ C29512b f120100Q;

        /* JADX INFO: renamed from: R */
        final /* synthetic */ C29514d f120101R;

        /* JADX INFO: renamed from: w */
        Object f120102w;

        /* JADX INFO: renamed from: x */
        Object f120103x;

        /* JADX INFO: renamed from: y */
        Object f120104y;

        /* JADX INFO: renamed from: z */
        Object f120105z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends List<Integer>> list, long j7, C29512b c29512b, C29514d c29514d, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120098O = list;
            this.f120099P = j7;
            this.f120100Q = c29512b;
            this.f120101R = c29514d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f120098O, this.f120099P, this.f120100Q, this.f120101R, interfaceC30057d);
            dVar.f120097N = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:19:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:23:0x0107  */
        /* JADX WARN: Code duplicated, block: B:27:0x0146  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0146 -> B:8:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pt1.d$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120106w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29514d f120107x;

        /* JADX INFO: renamed from: pt1.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120108w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29514d f120109x;

            /* JADX INFO: renamed from: pt1.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "LabradorReadingInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42190a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120110E;

                /* JADX INFO: renamed from: F */
                Object f120111F;

                /* JADX INFO: renamed from: G */
                Object f120112G;

                /* JADX INFO: renamed from: H */
                Object f120113H;

                /* JADX INFO: renamed from: I */
                Object f120114I;

                /* JADX INFO: renamed from: J */
                Object f120115J;

                /* JADX INFO: renamed from: K */
                Object f120116K;

                /* JADX INFO: renamed from: L */
                Object f120117L;

                /* JADX INFO: renamed from: M */
                Object f120118M;

                /* JADX INFO: renamed from: N */
                int f120119N;

                /* JADX INFO: renamed from: O */
                int f120120O;

                /* JADX INFO: renamed from: P */
                int f120121P;

                /* JADX INFO: renamed from: Q */
                int f120122Q;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120123w;

                /* JADX INFO: renamed from: x */
                int f120124x;

                /* JADX INFO: renamed from: y */
                Object f120125y;

                public C42190a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120123w = obj;
                    this.f120124x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29514d c29514d) {
                this.f120108w = interfaceC13062m;
                this.f120109x = c29514d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x013c, code lost:
            
                if (r10.emit(r1, r2) == r3) goto L40;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r19, q83.InterfaceC30057d r20) {
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C29514d c29514d) {
            this.f120106w = interfaceC13058l;
            this.f120107x = c29514d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120106w.collect(new a(interfaceC13062m, this.f120107x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt1.d$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor", m100430f = "LabradorReadingInteractor.kt", m100431l = {242, 244}, m100432m = "prepLabrador", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f120127E;

        /* JADX INFO: renamed from: G */
        int f120129G;

        /* JADX INFO: renamed from: w */
        Object f120130w;

        /* JADX INFO: renamed from: x */
        Object f120131x;

        /* JADX INFO: renamed from: y */
        Object f120132y;

        /* JADX INFO: renamed from: z */
        int f120133z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120127E = obj;
            this.f120129G |= Integer.MIN_VALUE;
            return C29514d.this.m90184m(null, this);
        }
    }

    /* JADX INFO: renamed from: pt1.d$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor", m100430f = "LabradorReadingInteractor.kt", m100431l = {306, 307}, m100432m = "restartLabrador", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f120134w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f120135x;

        /* JADX INFO: renamed from: z */
        int f120137z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120135x = obj;
            this.f120137z |= Integer.MIN_VALUE;
            return C29514d.this.m90185n(null, this);
        }
    }

    /* JADX INFO: renamed from: pt1.d$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor", m100430f = "LabradorReadingInteractor.kt", m100431l = {262, 264}, m100432m = "startLabrador", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f120138w;

        /* JADX INFO: renamed from: y */
        int f120140y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120138w = obj;
            this.f120140y |= Integer.MIN_VALUE;
            return C29514d.this.m90186o(this);
        }
    }

    /* JADX INFO: renamed from: pt1.d$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor", m100430f = "LabradorReadingInteractor.kt", m100431l = {285}, m100432m = "stopLabrador", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f120141w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f120142x;

        /* JADX INFO: renamed from: z */
        int f120144z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120142x = obj;
            this.f120144z |= Integer.MIN_VALUE;
            return C29514d.this.m90188q(null, this);
        }
    }

    /* JADX INFO: renamed from: pt1.d$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.domain.LabradorReadingInteractor", m100430f = "LabradorReadingInteractor.kt", m100431l = {425}, m100432m = "updateGraphDataPoints", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f120146F;

        /* JADX INFO: renamed from: w */
        Object f120147w;

        /* JADX INFO: renamed from: x */
        Object f120148x;

        /* JADX INFO: renamed from: y */
        int f120149y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f120150z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120150z = obj;
            this.f120146F |= Integer.MIN_VALUE;
            return C29514d.this.m90190s(null, this);
        }
    }

    public C29514d(InterfaceC14783b labradorService, C39787d gen5ConnectivityAnalyticsHelper, InterfaceC34116n logger, InterfaceC34144c labradorReadingAccumulator, C32948a analytics) {
        AbstractC22676k.m65750j(labradorService, "labradorService");
        AbstractC22676k.m65750j(gen5ConnectivityAnalyticsHelper, "gen5ConnectivityAnalyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labradorReadingAccumulator, "labradorReadingAccumulator");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.labradorService = labradorService;
        this.gen5ConnectivityAnalyticsHelper = gen5ConnectivityAnalyticsHelper;
        this.logger = logger;
        this.labradorReadingAccumulator = labradorReadingAccumulator;
        this.analytics = analytics;
        this.currentXPosition = AbstractC13091v.m36593c(0);
        this.graphDataPointsMutex = AbstractC25438d.m74669a();
        C30587a[] c30587aArr = new C30587a[300];
        for (int i13 = 0; i13 < 300; i13++) {
            c30587aArr[i13] = new C30587a(i13, null);
        }
        this.graphPointsArray = c30587aArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m90182j(List<Integer> list, EnumC39333f enumC39333f, boolean z4, InterfaceC30057d<? super List<C30588b>> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f120062F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f120062F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f120066z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f120062F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            aVar.f120063w = null;
            aVar.f120064x = enumC39333f;
            aVar.f120065y = z4;
            aVar.f120062F = 1;
            if (m90190s(list, aVar) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = aVar.f120065y;
            enumC39333f = (EnumC39333f) aVar.f120064x;
            AbstractC34132o.m107864I(obj);
        }
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(new C30588b(enumC39333f, 3.0f, z4 ? 30 : 0, z4 ? ((Number) ((C13045h2) this.currentXPosition).getValue()).intValue() : 0, this.graphPointsArray, false));
        if (z4) {
            arrayListM118964P.add(new C30588b(EnumC39333f.BRAND_WHITE, 5.0f, 0, 0, new C30587a[]{this.graphPointsArray[((Number) ((C13045h2) this.currentXPosition).getValue()).intValue()]}, true, 8, null));
        }
        return arrayListM118964P;
    }

    /* JADX INFO: renamed from: k */
    private final int m90183k() {
        C13045h2 c13045h2;
        Object value;
        int iIntValue = (((Number) ((C13045h2) this.currentXPosition).getValue()).intValue() + 1) % 300;
        InterfaceC13075p1 interfaceC13075p1 = this.currentXPosition;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            ((Number) value).intValue();
        } while (!c13045h2.m36569i(value, Integer.valueOf(iIntValue)));
        return iIntValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m90184m(ht1.EnumC17628e r9, q83.InterfaceC30057d<? super pt1.C29512b> r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.m90184m(ht1.e, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m90185n(pt1.C29512b r9, q83.InterfaceC30057d<? super pt1.C29512b> r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.m90185n(pt1.b, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m90186o(q83.InterfaceC30057d<? super pt1.C29512b> r10) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pt1.C29514d.m90186o(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    private final void m90187p() {
        this.gen5ConnectivityAnalyticsHelper.m127500c("ecg-connectivity-analytics", EnumC39788e.REALTIME_ECG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m90188q(C29512b c29512b, InterfaceC30057d<? super C29512b> interfaceC30057d) {
        i iVar;
        Object objMo42417b;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f120144z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f120144z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f120142x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f120144z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            m90189r();
            InterfaceC14783b interfaceC14783b = this.labradorService;
            InterfaceC14784c.c cVar = InterfaceC14784c.c.f54814a;
            iVar.f120141w = c29512b;
            iVar.f120144z = 1;
            objMo42417b = interfaceC14783b.mo42417b(cVar, iVar);
            if (objMo42417b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29512b = (C29512b) iVar.f120141w;
            AbstractC34132o.m107864I(obj);
            objMo42417b = ((C23468n) obj).f92940w;
        }
        C29512b c29512b2 = c29512b;
        if (C23468n.m68037a(objMo42417b) != null) {
            InterfaceC29513c readingDomainStateType = c29512b2.getReadingDomainStateType();
            return ((readingDomainStateType instanceof InterfaceC29513c.b) || (readingDomainStateType instanceof InterfaceC29513c.d) || (readingDomainStateType instanceof InterfaceC29513c.j)) ? c29512b2 : C29512b.m90160b(c29512b2, InterfaceC29513c.a.f120040a, 0, false, 6, null);
        }
        InterfaceC29513c readingDomainStateType2 = c29512b2.getReadingDomainStateType();
        return ((readingDomainStateType2 instanceof InterfaceC29513c.b) || (readingDomainStateType2 instanceof InterfaceC29513c.d) || (readingDomainStateType2 instanceof InterfaceC29513c.j)) ? c29512b2 : C29512b.m90160b(c29512b2, InterfaceC29513c.a.f120040a, 0, false, 6, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m90189r() {
        this.gen5ConnectivityAnalyticsHelper.m127501d("ecg-connectivity-analytics", "ECG");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m90190s(List<Integer> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        j jVar;
        InterfaceC25435a interfaceC25435a;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f120146F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f120146F = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f120150z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f120146F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.graphDataPointsMutex;
            jVar.f120147w = list;
            jVar.f120148x = interfaceC25435a;
            jVar.f120149y = 0;
            jVar.f120146F = 1;
            if (interfaceC25435a.mo68211b(jVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) jVar.f120148x;
            List<Integer> list2 = (List) jVar.f120147w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            list = list2;
        }
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                int iM90183k = m90183k();
                this.graphPointsArray[iM90183k] = new C30587a(iM90183k, new Integer(AbstractC12889b.m36284n(iIntValue, NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 1000)));
            }
            interfaceC25435a.mo68214i(null);
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            interfaceC25435a.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m90191l(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }
}
