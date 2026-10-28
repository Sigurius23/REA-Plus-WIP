package o91;

import ad3.AbstractC0757c;
import ad3.AbstractC0770m;
import ad3.InterfaceC0768k;
import com.whoop.design.models.items.graph.plot.BandPlotModel;
import com.whoop.design.models.items.graph.plot.BarPlotModel;
import com.whoop.design.models.items.graph.plot.CalibratingPlotModel;
import com.whoop.design.models.items.graph.plot.CenterScrubBandPlotModel;
import com.whoop.design.models.items.graph.plot.EmptyPlotModel;
import com.whoop.design.models.items.graph.plot.FinalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.GraphPlot;
import com.whoop.design.models.items.graph.plot.GridLinePlotModel;
import com.whoop.design.models.items.graph.plot.IconPlotModel;
import com.whoop.design.models.items.graph.plot.LinePlotModel;
import com.whoop.design.models.items.graph.plot.OverlayPlotModel;
import com.whoop.design.models.items.graph.plot.PlotModelType;
import com.whoop.design.models.items.graph.plot.ProgressPlotModel;
import com.whoop.design.models.items.graph.plot.TrendPlotModel;
import com.whoop.design.models.items.graph.plot.UnknownPlotModel;
import com.whoop.design.models.items.graph.plot.VerticalMarkerPlotModel;
import com.whoop.design.models.items.graph.plot.XLabelPlotModel;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yb3.AbstractC39414r;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: o91.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lo91/e;", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "<init>", "()V", "Lzc3/d;", "decoder", "b", "(Lzc3/d;)Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "Lzc3/e;", "encoder", "value", "Ll83/a0;", "c", "(Lzc3/e;Lcom/whoop/design/models/items/graph/plot/GraphPlot;)V", "Lyc3/g;", "Lyc3/g;", "getDescriptor", "()Lyc3/g;", "descriptor", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27688e implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C27688e f111459a = new C27688e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC39443g descriptor;

    /* JADX INFO: renamed from: c */
    public static final int f111461c;

    /* JADX INFO: renamed from: o91.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f111462a;

        static {
            int[] iArr = new int[PlotModelType.values().length];
            try {
                iArr[PlotModelType.BAND_PLOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlotModelType.BAR_PLOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlotModelType.CALIBRATING_PLOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlotModelType.CENTER_SCRUB_BAND_PLOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlotModelType.EMPTY_PLOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlotModelType.GRID_LINE_PLOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlotModelType.FINAL_MARKER_PLOT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlotModelType.ICON_PLOT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PlotModelType.LINE_PLOT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PlotModelType.OVERLAY_PLOT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PlotModelType.PROGRESS_PLOT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PlotModelType.TREND_PLOT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PlotModelType.UNKNOWN_PLOT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PlotModelType.VERTICAL_MARKER_PLOT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PlotModelType.X_LABEL_PLOT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f111462a = iArr;
        }
    }

    static {
        InterfaceC39443g[] interfaceC39443gArr = new InterfaceC39443g[0];
        if (AbstractC39414r.m125890i0("GraphPlot")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a("GraphPlot");
        m83700a(c39437a);
        descriptor = new C39444h("GraphPlot", C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
        f111461c = 8;
    }

    private C27688e() {
    }

    /* JADX INFO: renamed from: a */
    private static final C23454a0 m83700a(C39437a buildClassSerialDescriptor) {
        AbstractC22676k.m65750j(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
        buildClassSerialDescriptor.m125993a("plot", JsonElement.Companion.serializer().getDescriptor(), false);
        return C23454a0.f92919a;
    }

    @Override // wc3.InterfaceC37137b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GraphPlot deserialize(InterfaceC40541d decoder) {
        AbstractC22676k.m65750j(decoder, "decoder");
        InterfaceC0768k interfaceC0768k = decoder instanceof InterfaceC0768k ? (InterfaceC0768k) decoder : null;
        if (interfaceC0768k == null) {
            throw new IllegalStateException("GraphPlotSerializer can only be used with JSON");
        }
        JsonObject jsonObjectM1847i = AbstractC0770m.m1847i(interfaceC0768k.mo1838b());
        JsonElement jsonElement = (JsonElement) jsonObjectM1847i.get((Object) "type");
        String strM1844f = jsonElement != null ? AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement)) : null;
        JsonElement jsonElement2 = (JsonElement) jsonObjectM1847i.get((Object) "plot");
        if (jsonElement2 == null) {
            throw new IllegalArgumentException("Missing plot element");
        }
        switch (a.f111462a[PlotModelType.INSTANCE.fromType(strM1844f).ordinal()]) {
            case 1:
                AbstractC0757c abstractC0757cMo1837a = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a.getClass();
                return (GraphPlot) abstractC0757cMo1837a.m1830a(BandPlotModel.INSTANCE.serializer(), jsonElement2);
            case 2:
                AbstractC0757c abstractC0757cMo1837a2 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a2.getClass();
                return (GraphPlot) abstractC0757cMo1837a2.m1830a(BarPlotModel.INSTANCE.serializer(), jsonElement2);
            case 3:
                AbstractC0757c abstractC0757cMo1837a3 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a3.getClass();
                return (GraphPlot) abstractC0757cMo1837a3.m1830a(CalibratingPlotModel.INSTANCE.serializer(), jsonElement2);
            case 4:
                AbstractC0757c abstractC0757cMo1837a4 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a4.getClass();
                return (GraphPlot) abstractC0757cMo1837a4.m1830a(CenterScrubBandPlotModel.INSTANCE.serializer(), jsonElement2);
            case 5:
                AbstractC0757c abstractC0757cMo1837a5 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a5.getClass();
                return (GraphPlot) abstractC0757cMo1837a5.m1830a(EmptyPlotModel.INSTANCE.serializer(), jsonElement2);
            case 6:
                AbstractC0757c abstractC0757cMo1837a6 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a6.getClass();
                return (GraphPlot) abstractC0757cMo1837a6.m1830a(GridLinePlotModel.INSTANCE.serializer(), jsonElement2);
            case 7:
                AbstractC0757c abstractC0757cMo1837a7 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a7.getClass();
                return (GraphPlot) abstractC0757cMo1837a7.m1830a(FinalMarkerPlotModel.INSTANCE.serializer(), jsonElement2);
            case 8:
                AbstractC0757c abstractC0757cMo1837a8 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a8.getClass();
                return (GraphPlot) abstractC0757cMo1837a8.m1830a(IconPlotModel.INSTANCE.serializer(), jsonElement2);
            case 9:
                AbstractC0757c abstractC0757cMo1837a9 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a9.getClass();
                return (GraphPlot) abstractC0757cMo1837a9.m1830a(LinePlotModel.INSTANCE.serializer(), jsonElement2);
            case 10:
                AbstractC0757c abstractC0757cMo1837a10 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a10.getClass();
                return (GraphPlot) abstractC0757cMo1837a10.m1830a(OverlayPlotModel.INSTANCE.serializer(), jsonElement2);
            case 11:
                AbstractC0757c abstractC0757cMo1837a11 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a11.getClass();
                return (GraphPlot) abstractC0757cMo1837a11.m1830a(ProgressPlotModel.INSTANCE.serializer(), jsonElement2);
            case 12:
                AbstractC0757c abstractC0757cMo1837a12 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a12.getClass();
                return (GraphPlot) abstractC0757cMo1837a12.m1830a(TrendPlotModel.INSTANCE.serializer(), jsonElement2);
            case 13:
                return UnknownPlotModel.INSTANCE;
            case 14:
                AbstractC0757c abstractC0757cMo1837a13 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a13.getClass();
                return (GraphPlot) abstractC0757cMo1837a13.m1830a(VerticalMarkerPlotModel.INSTANCE.serializer(), jsonElement2);
            case 15:
                AbstractC0757c abstractC0757cMo1837a14 = interfaceC0768k.mo1837a();
                abstractC0757cMo1837a14.getClass();
                return (GraphPlot) abstractC0757cMo1837a14.m1830a(XLabelPlotModel.INSTANCE.serializer(), jsonElement2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // wc3.InterfaceC37145j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(InterfaceC40542e encoder, GraphPlot value) {
        AbstractC22676k.m65750j(encoder, "encoder");
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Serialization of GraphPlot is not supported. Avoid calling this method.");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public InterfaceC39443g getDescriptor() {
        return descriptor;
    }
}
