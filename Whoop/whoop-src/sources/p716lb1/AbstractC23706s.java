package p716lb1;

import a01.C0081a;
import a01.C0088h;
import a01.C0094n;
import a01.C0095o;
import a01.EnumC0093m;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BiomarkerCardDisclaimerModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.MiniCalloutModel;
import com.whoop.design.models.items.RangeMeterModel;
import com.whoop.design.models.items.RangeSectionModel;
import com.whoop.design.models.items.RangeSectionStyle;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import v21.C35585c;
import vb1.AbstractC35869b;

/* JADX INFO: renamed from: lb1.s */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/design/models/items/MiniCalloutModel;", "Lv21/c;", "g", "(Lcom/whoop/design/models/items/MiniCalloutModel;)Lv21/c;", "Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;", "La01/a;", "f", "(Lcom/whoop/design/models/items/BiomarkerCardDisclaimerModel;)La01/a;", "Lcom/whoop/design/models/items/RangeMeterModel;", "La01/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/RangeMeterModel;)La01/n;", "Lcom/whoop/design/models/items/RangeSectionStyle;", "Ly81/f;", "i", "(Lcom/whoop/design/models/items/RangeSectionStyle;)Ly81/f;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "biomarkerCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23706s {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93953a = Function1.m68251a(new C23587a(22));

    /* JADX INFO: renamed from: lb1.s$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93954a;

        static {
            int[] iArr = new int[RangeSectionStyle.values().length];
            try {
                iArr[RangeSectionStyle.OPTIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RangeSectionStyle.SUFFICIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RangeSectionStyle.OUT_OF_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93954a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.s$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93955w;

        public b(Function1 function1) {
            this.f93955w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93955w.invoke((BiomarkerCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m69368c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BiomarkerCardModel.class), new b(new C23587a(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C0088h m69369d(BiomarkerCardModel model) {
        EnumC16313m0 enumC16313m0;
        EnumC0093m enumC0093m;
        EnumC16313m0 enumC16313m1;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        String icon = model.getIcon();
        if (icon != null) {
            enumC16313m0 = EnumC16313m0.CARET_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        } else {
            enumC16313m0 = null;
        }
        String valueText = model.getValueText();
        if (valueText == null) {
            valueText = model.getValue();
        }
        int i14 = 0;
        EnumC16313m0 enumC16313m2 = enumC16313m0;
        String unit = model.getUnit();
        ImpactModel trend = model.getTrend();
        C17731c2 c17731c2M68791d = trend != null ? AbstractC23632g2.m68791d(trend) : null;
        String statusType = model.getStatusType();
        EnumC0093m enumC0093m2 = EnumC0093m.UNAVAILABLE;
        EnumC0093m[] enumC0093mArrValues = EnumC0093m.values();
        int length2 = enumC0093mArrValues.length;
        while (true) {
            if (i14 >= length2) {
                enumC0093m = null;
                break;
            }
            enumC0093m = enumC0093mArrValues[i14];
            if (AbstractC22676k.m65745e(enumC0093m.name(), statusType)) {
                break;
            }
            i14++;
        }
        EnumC0093m enumC0093m3 = enumC0093m == null ? enumC0093m2 : enumC0093m;
        BiomarkerCardDisclaimerModel disclaimer = model.getDisclaimer();
        C0081a c0081aM69371f = disclaimer != null ? m69371f(disclaimer) : null;
        C9598e destination = model.getDestination();
        GenericInteraction interaction = model.getInteraction();
        List<String> categoryIds = model.getCategoryIds();
        RangeMeterModel rangeMeter = model.getRangeMeter();
        C0094n c0094nM69373h = rangeMeter != null ? m69373h(rangeMeter) : null;
        Integer lastRecording = model.getLastRecording();
        MiniCalloutModel miniCallout = model.getMiniCallout();
        C35585c c35585cM69372g = miniCallout != null ? m69372g(miniCallout) : null;
        GraphModel graph = model.getGraph();
        return new C0088h(id4, title, enumC16313m2, valueText, unit, enumC0093m3, c17731c2M68791d, c0081aM69371f, destination, interaction, categoryIds, c0094nM69373h, lastRecording, c35585cM69372g, graph != null ? AbstractC35869b.m113874t(graph) : null, model.getUseTileBackground());
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69370e() {
        return f93953a;
    }

    /* JADX INFO: renamed from: f */
    private static final C0081a m69371f(BiomarkerCardDisclaimerModel biomarkerCardDisclaimerModel) {
        String icon = biomarkerCardDisclaimerModel.getIcon();
        EnumC16313m0 enumC16313m0 = null;
        if (icon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_INFORMATION;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), icon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = enumC16313m1;
            }
        }
        return new C0081a(enumC16313m0, biomarkerCardDisclaimerModel.getText());
    }

    /* JADX INFO: renamed from: g */
    private static final C35585c m69372g(MiniCalloutModel miniCalloutModel) {
        C23626f3 c23626f3M68706f = AbstractC23619e3.m68706f(miniCalloutModel.getStyle());
        TextResource.C8691e c8691e = new TextResource.C8691e(miniCalloutModel.getDescription());
        String cta = miniCalloutModel.getCta();
        return new C35585c(c8691e, cta != null ? new TextResource.C8691e(cta) : null, miniCalloutModel.getDestination(), c23626f3M68706f.getForegroundColor(), c23626f3M68706f.getBackgroundColor(), miniCalloutModel.getModal());
    }

    /* JADX INFO: renamed from: h */
    private static final C0094n m69373h(RangeMeterModel rangeMeterModel) {
        List<RangeSectionModel> sections = rangeMeterModel.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (RangeSectionModel rangeSectionModel : sections) {
            arrayList.add(new C0095o(m69374i(rangeSectionModel.getStyle()), rangeSectionModel.getStart(), rangeSectionModel.getEnd()));
        }
        float indicatorPercent = rangeMeterModel.getIndicatorPercent();
        String indicatorImageUrl = rangeMeterModel.getIndicatorImageUrl();
        return new C0094n(arrayList, indicatorPercent, indicatorImageUrl != null ? AbstractC22404p.m64503l(indicatorImageUrl) : null);
    }

    /* JADX INFO: renamed from: i */
    private static final EnumC39333f m69374i(RangeSectionStyle rangeSectionStyle) {
        int i13 = a.f93954a[rangeSectionStyle.ordinal()];
        if (i13 == 1) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        if (i13 == 2) {
            return EnumC39333f.SUFFICIENT_TREND;
        }
        if (i13 == 3) {
            return EnumC39333f.ACCENT_NEGATIVE_TREND;
        }
        throw new NoWhenBranchMatchedException();
    }
}
