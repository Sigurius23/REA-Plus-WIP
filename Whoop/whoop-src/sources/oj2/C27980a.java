package oj2;

import c93.InterfaceC4351m;
import com.google.gson.JsonObject;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.stress.domain.BreathingEvent;
import com.whoop.stress.domain.model.HoldingFrame;
import com.whoop.stress.domain.model.StressIntervention;
import com.whoop.stress.domain.model.StressInterventionBottomDisplay;
import com.whoop.stress.domain.model.StressInterventionFinishDialog;
import com.whoop.stress.domain.model.StressInterventionFrame;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ej2.AbstractC13265b;
import ej2.AbstractC13266c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import nj2.C26762i;
import nj2.C26764k;
import nj2.C26773t;
import nj2.EnumC26763j;
import o81.C27656a;
import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35679m0;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: oj2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'Ji\u0010/\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u001c2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J#\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0013¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b8\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Loj2/a;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lcom/whoop/stress/domain/model/StressIntervention;", "intervention", "Lcom/whoop/stress/domain/model/HoldingFrame;", "holdingFrame", "", "totalFrames", "msPerAnimationCycle", "Lo81/a;", "toolbarSubtitle", "Lec3/l;", "Lnj2/t;", "l", "(Lcom/whoop/stress/domain/model/StressIntervention;Lcom/whoop/stress/domain/model/HoldingFrame;DDLo81/a;)Lec3/l;", "", "totalInterventionLengthInSeconds", "e", "(Lcom/whoop/stress/domain/model/StressIntervention;DDI)Lec3/l;", "", "totalSecondsElapsed", "", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "Ly81/f;", "bottomDisplay", "k", "(JLjava/util/List;Lcom/whoop/stress/domain/model/StressIntervention;DLo81/a;)Lnj2/t;", "Lcom/whoop/stress/domain/model/StressInterventionFrame;", "frame", "", "currentTimeInMs", "g", "(Lcom/whoop/stress/domain/model/StressInterventionFrame;FLcom/whoop/stress/domain/model/StressIntervention;DDLo81/a;Ljava/lang/Integer;)Lnj2/t;", "m", "(Lcom/whoop/stress/domain/model/StressIntervention;)Lnj2/t;", "Lv41/m0;", "clipSpec", "overlay", "", "showHoldingFrame", "showSessionFinished", "Lnj2/k;", "i", "(Lcom/whoop/stress/domain/model/StressIntervention;Lv41/m0;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZZLo81/a;Ljava/lang/Integer;)Lnj2/k;", "Lnj2/j;", "style", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lnj2/j;)Ly81/f;", "totalRounds", "n", "(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;", "f", "a", "Lzr2/a;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27980a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: oj2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f112822a;

        static {
            int[] iArr = new int[EnumC26763j.values().length];
            try {
                iArr[EnumC26763j.INHALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26763j.EXHALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112822a = iArr;
        }
    }

    /* JADX INFO: renamed from: oj2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.util.BreathingAnimationHelper$continuousAnimation$1", m100430f = "BreathingAnimationHelper.kt", m100431l = {143, 144, 148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f112823E;

        /* JADX INFO: renamed from: F */
        Object f112824F;

        /* JADX INFO: renamed from: G */
        Object f112825G;

        /* JADX INFO: renamed from: H */
        Object f112826H;

        /* JADX INFO: renamed from: I */
        int f112827I;

        /* JADX INFO: renamed from: J */
        int f112828J;

        /* JADX INFO: renamed from: K */
        int f112829K;

        /* JADX INFO: renamed from: L */
        int f112830L;

        /* JADX INFO: renamed from: M */
        int f112831M;

        /* JADX INFO: renamed from: N */
        int f112832N;

        /* JADX INFO: renamed from: O */
        int f112833O;

        /* JADX INFO: renamed from: P */
        double f112834P;

        /* JADX INFO: renamed from: Q */
        double f112835Q;

        /* JADX INFO: renamed from: R */
        int f112836R;

        /* JADX INFO: renamed from: S */
        private /* synthetic */ Object f112837S;

        /* JADX INFO: renamed from: T */
        final /* synthetic */ StressIntervention f112838T;

        /* JADX INFO: renamed from: U */
        final /* synthetic */ C27980a f112839U;

        /* JADX INFO: renamed from: V */
        final /* synthetic */ double f112840V;

        /* JADX INFO: renamed from: W */
        final /* synthetic */ double f112841W;

        /* JADX INFO: renamed from: X */
        final /* synthetic */ int f112842X;

        /* JADX INFO: renamed from: w */
        Object f112843w;

        /* JADX INFO: renamed from: x */
        Object f112844x;

        /* JADX INFO: renamed from: y */
        Object f112845y;

        /* JADX INFO: renamed from: z */
        Object f112846z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StressIntervention stressIntervention, C27980a c27980a, double d3, double d14, int i13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f112838T = stressIntervention;
            this.f112839U = c27980a;
            this.f112840V = d3;
            this.f112841W = d14;
            this.f112842X = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f112838T, this.f112839U, this.f112840V, this.f112841W, this.f112842X, interfaceC30057d);
            bVar.f112837S = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:20:0x0170  */
        /* JADX WARN: Code duplicated, block: B:23:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:24:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00da -> B:15:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x01c3 -> B:25:0x01d5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 534
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oj2.C27980a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oj2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.util.BreathingAnimationHelper$segmentedAnimation$1", m100430f = "BreathingAnimationHelper.kt", m100431l = {94, 95, 106, 116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f112847E;

        /* JADX INFO: renamed from: F */
        Object f112848F;

        /* JADX INFO: renamed from: G */
        Object f112849G;

        /* JADX INFO: renamed from: H */
        Object f112850H;

        /* JADX INFO: renamed from: I */
        Object f112851I;

        /* JADX INFO: renamed from: J */
        long f112852J;

        /* JADX INFO: renamed from: K */
        double f112853K;

        /* JADX INFO: renamed from: L */
        double f112854L;

        /* JADX INFO: renamed from: M */
        int f112855M;

        /* JADX INFO: renamed from: N */
        int f112856N;

        /* JADX INFO: renamed from: O */
        int f112857O;

        /* JADX INFO: renamed from: P */
        private /* synthetic */ Object f112858P;

        /* JADX INFO: renamed from: Q */
        final /* synthetic */ StressIntervention f112859Q;

        /* JADX INFO: renamed from: R */
        final /* synthetic */ HoldingFrame f112860R;

        /* JADX INFO: renamed from: S */
        final /* synthetic */ C27980a f112861S;

        /* JADX INFO: renamed from: T */
        final /* synthetic */ double f112862T;

        /* JADX INFO: renamed from: U */
        final /* synthetic */ C27656a f112863U;

        /* JADX INFO: renamed from: V */
        final /* synthetic */ double f112864V;

        /* JADX INFO: renamed from: w */
        Object f112865w;

        /* JADX INFO: renamed from: x */
        Object f112866x;

        /* JADX INFO: renamed from: y */
        Object f112867y;

        /* JADX INFO: renamed from: z */
        Object f112868z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StressIntervention stressIntervention, HoldingFrame holdingFrame, C27980a c27980a, double d3, C27656a c27656a, double d14, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f112859Q = stressIntervention;
            this.f112860R = holdingFrame;
            this.f112861S = c27980a;
            this.f112862T = d3;
            this.f112863U = c27656a;
            this.f112864V = d14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f112859Q, this.f112860R, this.f112861S, this.f112862T, this.f112863U, this.f112864V, interfaceC30057d);
            cVar.f112858P = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:20:0x014c  */
        /* JADX WARN: Code duplicated, block: B:21:0x014f  */
        /* JADX WARN: Code duplicated, block: B:25:0x019b  */
        /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x019b -> B:26:0x01a3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0240 -> B:9:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instruction units count: 584
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oj2.C27980a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C27980a(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC13058l m84403e(StressIntervention intervention, double totalFrames, double msPerAnimationCycle, int totalInterventionLengthInSeconds) {
        return new C13084s1(new b(intervention, this, totalFrames, msPerAnimationCycle, totalInterventionLengthInSeconds, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C26773t m84404g(StressInterventionFrame frame, float currentTimeInMs, StressIntervention intervention, double totalFrames, double msPerAnimationCycle, C27656a toolbarSubtitle, Integer totalInterventionLengthInSeconds) {
        TextResource textResourceM21267a;
        String strName = frame.getBreathType().name();
        DateTime dateTimeMo133364c = this.dateAndTimeProvider.mo133364c();
        String during = new DateTimeRange(dateTimeMo133364c, new DateTime(dateTimeMo133364c.getMillis() + frame.getTime()), null, null, 12, null).getDuring();
        String overlay = frame.getOverlay();
        if (overlay == null || (textResourceM21267a = AbstractC8693b.m21278l(overlay)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        List<StressInterventionBottomDisplay> bottomDisplay = frame.getBottomDisplay();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(bottomDisplay, 10));
        for (StressInterventionBottomDisplay stressInterventionBottomDisplay : bottomDisplay) {
            arrayList.add(new C23465k(AbstractC8693b.m21278l(stressInterventionBottomDisplay.getText()), m84405h(EnumC26763j.valueOf(stressInterventionBottomDisplay.getStyle()))));
        }
        return new C26773t(false, false, null, m84407j(this, intervention, new AbstractC35679m0.a(Integer.valueOf((int) ((((double) currentTimeInMs) / msPerAnimationCycle) * totalFrames)), Integer.valueOf((int) ((((double) (frame.getTime() + currentTimeInMs)) / msPerAnimationCycle) * totalFrames)), false), textResource, arrayList, false, false, toolbarSubtitle, totalInterventionLengthInSeconds, 48, null), null, null, AbstractC37056f.m118958J(new BreathingEvent(during, strName)), 50, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final EnumC39333f m84405h(EnumC26763j style) {
        int i13 = a.f112822a[style.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.STRAIN_ZONE_5;
        }
        if (i13 == 2) {
            return EnumC39333f.STRAIN;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    private final C26764k m84406i(StressIntervention intervention, AbstractC35679m0 clipSpec, TextResource overlay, List<? extends C23465k> bottomDisplay, boolean showHoldingFrame, boolean showSessionFinished, C27656a toolbarSubtitle, Integer totalInterventionLengthInSeconds) {
        InterfaceC35689r0 interfaceC35689r0M113122a;
        TextResource textResourceM21278l;
        if (showSessionFinished) {
            interfaceC35689r0M113122a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC13265b.f45928a));
        } else {
            String string = intervention.getAnimationJson().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            interfaceC35689r0M113122a = InterfaceC35689r0.c.m113122a(InterfaceC35689r0.c.m113123b(string));
        }
        InterfaceC35689r0 interfaceC35689r0 = interfaceC35689r0M113122a;
        if (!showHoldingFrame || intervention.getHoldingFrame() == null) {
            textResourceM21278l = showSessionFinished ? AbstractC8693b.m21278l(intervention.getButton()) : AbstractC8693b.m21267a();
        } else {
            textResourceM21278l = AbstractC8693b.m21278l(intervention.getHoldingFrame().getButtonText());
        }
        TextResource textResource = textResourceM21278l;
        StressInterventionFinishDialog finishDialog = intervention.getFinishDialog();
        return new C26764k(interfaceC35689r0, clipSpec, AbstractC8693b.m21278l(intervention.getTitle()), textResource, intervention.getRepeatCount(), AbstractC8693b.m21278l(intervention.getSessionDone()), overlay, bottomDisplay, new C26762i(AbstractC8693b.m21278l(finishDialog.getTitle()), AbstractC8693b.m21278l(finishDialog.getButton()), AbstractC8693b.m21278l(finishDialog.getCancel())), showHoldingFrame, showSessionFinished, toolbarSubtitle, totalInterventionLengthInSeconds);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C26764k m84407j(C27980a c27980a, StressIntervention stressIntervention, AbstractC35679m0 abstractC35679m0, TextResource textResource, List list, boolean z4, boolean z13, C27656a c27656a, Integer num, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z4 = false;
        }
        if ((i13 & 32) != 0) {
            z13 = false;
        }
        return c27980a.m84406i(stressIntervention, abstractC35679m0, textResource, list, z4, z13, c27656a, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C26773t m84408k(long totalSecondsElapsed, List<? extends C23465k> bottomDisplay, StressIntervention intervention, double totalFrames, C27656a toolbarSubtitle) {
        long j7 = 60;
        long j13 = totalSecondsElapsed % j7;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((totalSecondsElapsed / j7) % j7), Long.valueOf(j13)}, 2)));
        DateTime dateTimeMo133364c = this.dateAndTimeProvider.mo133364c();
        int i13 = (int) totalFrames;
        return new C26773t(false, false, null, m84407j(this, intervention, new AbstractC35679m0.a(Integer.valueOf(i13), Integer.valueOf(i13), true), textResourceM21278l, bottomDisplay, true, false, toolbarSubtitle, null, 32, null), null, null, AbstractC37056f.m118958J(new BreathingEvent(new DateTimeRange(new DateTime(dateTimeMo133364c.getMillis() - (j13 * ((long) 1000))), dateTimeMo133364c, null, null, 12, null).getDuring(), "HOLD")), 48, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m84409l(StressIntervention intervention, HoldingFrame holdingFrame, double totalFrames, double msPerAnimationCycle, C27656a toolbarSubtitle) {
        return new C13084s1(new c(intervention, holdingFrame, this, totalFrames, toolbarSubtitle, msPerAnimationCycle, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C26773t m84410m(StressIntervention intervention) {
        return new C26773t(false, false, null, m84407j(this, intervention, new AbstractC35679m0.b(0.0f, 0.0f, 3, null), AbstractC8693b.m21267a(), AbstractC37056f.m118958J(new C23465k(AbstractC8693b.m21278l(intervention.getSessionDone()), EnumC39333f.ACCENT_POSITIVE_TREND)), false, true, null, null, 16, null), null, null, null, 114, null);
    }

    /* JADX INFO: renamed from: f */
    public final C26773t m84411f(StressIntervention intervention) {
        AbstractC22676k.m65750j(intervention, "intervention");
        return m84410m(intervention);
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m84412n(StressIntervention intervention, int totalRounds) {
        AbstractC22676k.m65750j(intervention, "intervention");
        JsonObject animationJson = intervention.getAnimationJson();
        double asDouble = animationJson.get("fr").getAsDouble();
        double asDouble2 = animationJson.get("op").getAsDouble();
        double d3 = asDouble2 / asDouble;
        double d14 = d3 * ((double) 1000);
        return intervention.getHoldingFrame() != null ? m84409l(intervention, intervention.getHoldingFrame(), asDouble2, d14, new C27656a(new TextResource.C8688b(AbstractC13266c.f45931c, new TextResource.AbstractC8690d.b(Integer.valueOf((totalRounds - intervention.getRepeatCount()) + 1)), new TextResource.AbstractC8690d.b(Integer.valueOf(totalRounds))), false)) : m84403e(intervention, asDouble2, d14, (int) (d3 * ((double) totalRounds)));
    }
}
