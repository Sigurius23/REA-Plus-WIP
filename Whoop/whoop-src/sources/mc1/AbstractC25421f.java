package mc1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.graph.GraphModel;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m01.C24875c;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p088dc.AbstractC11895b;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mc1.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphModel;", "graphResponse", "", "requestedPlotId", "Lj71/c;", "b", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;)Lj71/c;", "", "Lj71/b;", "plots", "graphId", "f", "(Ljava/util/List;Ljava/lang/String;)Lj71/b;", "Lmc1/b;", "heartRateZoneType", "Lmc1/e$a;", "activityType", "c", "(Lmc1/b;Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;", "e", "(Lmc1/e$a;Ljava/lang/String;)Ljava/lang/String;", "Ljb1/a;", "a", "Ljb1/a;", "reducer", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25421f {

    /* JADX INFO: renamed from: a */
    private static final C21535a f99529a = AbstractC21537c.m60554d(new C24875c(22));

    /* JADX INFO: renamed from: mc1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99530a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f99531b;

        static {
            int[] iArr = new int[EnumC25417b.values().length];
            try {
                iArr[EnumC25417b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25417b.EXHALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25417b.HARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25417b.HOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25417b.INHALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC25417b.LIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25417b.LIGHT_SLEEP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC25417b.MAX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC25417b.MODERATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC25417b.NO_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC25417b.REM_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC25417b.RESTORATIVE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC25417b.SWS_SLEEP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC25417b.VERY_LIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC25417b.AWAKE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC25417b.HIGH_STRESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC25417b.LOW_STRESS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EnumC25417b.MEDIUM_STRESS.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            f99530a = iArr;
            int[] iArr2 = new int[C25420e.a.values().length];
            try {
                iArr2[C25420e.a.RECOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[C25420e.a.CARDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[C25420e.a.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            f99531b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mc1.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            C21395c c21395c = (C21395c) it;
            C21374h plane = c21395c.getPlane();
            return C21395c.m60092b(c21395c, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : C16618c.f63938e, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C21395c m74622b(GraphModel graphResponse, String requestedPlotId) {
        List listM118958J;
        AbstractC22676k.m65750j(graphResponse, "graphResponse");
        AbstractC22676k.m65750j(requestedPlotId, "requestedPlotId");
        InterfaceC25312u interfaceC25312uM60541h = f99529a.m60541h(graphResponse);
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState");
        C21395c c21395c = (C21395c) interfaceC25312uM60541h;
        String id4 = ((AbstractC21394b) AbstractC25265s.m74096F0(c21395c.m60096f())).getId();
        AbstractC21394b abstractC21394bM74626f = m74626f(c21395c.m60096f(), id4);
        if (AbstractC22676k.m65745e(id4, requestedPlotId)) {
            listM118958J = AbstractC37056f.m118958J(abstractC21394bM74626f);
        } else {
            AbstractC22676k.m65748h(abstractC21394bM74626f, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphPlotState.Line");
            listM118958J = AbstractC37056f.m118959K(AbstractC25416a.m74605b((AbstractC21394b.g) abstractC21394bM74626f), m74626f(c21395c.m60096f(), requestedPlotId));
        }
        return C21395c.m60092b(c21395c, null, listM118958J, null, null, 13, null);
    }

    /* JADX INFO: renamed from: c */
    public static final String m74623c(EnumC25417b heartRateZoneType, C25420e.a activityType, String graphId) {
        AbstractC22676k.m65750j(heartRateZoneType, "heartRateZoneType");
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(graphId, "graphId");
        switch (a.f99530a[heartRateZoneType.ordinal()]) {
            case 1:
                return m74625e(activityType, graphId);
            case 2:
                return "EXHALE";
            case 3:
                return "HARD";
            case 4:
                return "HOLD";
            case 5:
                return "INHALE";
            case 6:
                return "LIGHT";
            case 7:
                return "LIGHT_SLEEP";
            case 8:
                return "MAX";
            case 9:
                return "MODERATE";
            case 10:
                return "NO_DATA";
            case 11:
                return "REM_SLEEP";
            case 12:
                return "RESTORATIVE";
            case 13:
                return "SWS_SLEEP";
            case 14:
                return "VERY_LIGHT";
            case 15:
                return "AWAKE";
            case 16:
                return "HIGH_STRESS";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "LOW_STRESS";
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return "MEDIUM_STRESS";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m74624d(EnumC25417b enumC25417b, C25420e.a aVar, String str, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str = "HEART_RATE";
        }
        return m74623c(enumC25417b, aVar, str);
    }

    /* JADX INFO: renamed from: e */
    private static final String m74625e(C25420e.a aVar, String str) {
        int i13 = a.f99531b[aVar.ordinal()];
        if (i13 == 1) {
            return AbstractC22676k.m65745e(str, "STRESS") ? "STRESS" : "RECOVERY_HEART_RATE";
        }
        if (i13 == 2) {
            return "STRAIN_HEART_RATE";
        }
        if (i13 == 3) {
            return "SLEEP_HEART_RATE";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private static final AbstractC21394b m74626f(List<? extends AbstractC21394b> list, String str) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC21394b.g) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((AbstractC21394b.g) next).getId(), str));
        AbstractC21394b.g gVar = (AbstractC21394b.g) next;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(AbstractC11895b.m31996o("GraphId ", str, " is not in list of line plots"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m74627g(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21395c.class), new b());
        return C23454a0.f92919a;
    }
}
