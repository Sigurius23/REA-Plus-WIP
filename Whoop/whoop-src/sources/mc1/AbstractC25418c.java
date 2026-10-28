package mc1;

import b21.AbstractC2333f;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BarGraph;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.HeartRateTileStyle;
import com.whoop.design.models.items.HeartRateZone;
import com.whoop.design.models.items.RangeModal;
import com.whoop.design.models.items.graph.LayoutDirection;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.C22257n;
import k71.C22258o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.C23753z4;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import y11.C39059l;
import y11.EnumC39048a;

/* JADX INFO: renamed from: mc1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"", "Lcom/whoop/design/models/items/HeartRateZone;", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "timeSpliceLayoutDirection", "Ly11/l;", "j", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;", "Lcom/whoop/design/models/items/HeartRateTileStyle;", "zoneStyle", "Ly11/a;", "c", "(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;", "Lmc1/b;", "heartZoneType", "horizontalBarGraphTileStates", "e", "(Lmc1/b;Ljava/util/List;)Lcom/whoop/design/models/items/HeartRateTileStyle;", "fillColor", "d", "(Ly11/a;)Lcom/whoop/design/models/items/HeartRateTileStyle;", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "Lk71/o;", "i", "(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "horizontalBarGraphMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25418c {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f99522a = Function1.m68251a(new C23753z4(28));

    /* JADX INFO: renamed from: mc1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f99523a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f99524b;

        static {
            int[] iArr = new int[HeartRateTileStyle.values().length];
            try {
                iArr[HeartRateTileStyle.MAX_HR_ZONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeartRateTileStyle.HARD_HR_ZONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HeartRateTileStyle.MODERATE_HR_ZONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HeartRateTileStyle.LIGHT_HR_ZONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HeartRateTileStyle.VERY_LIGHT_HR_ZONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HeartRateTileStyle.RESTORATIVE_HR_ZONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HeartRateTileStyle.SLEEP_HEART_RATE_ZONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HeartRateTileStyle.NONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HeartRateTileStyle.LIGHT_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HeartRateTileStyle.REM_SLEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HeartRateTileStyle.SWS_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HeartRateTileStyle.AWAKE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HeartRateTileStyle.HIGH_STRESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HeartRateTileStyle.LOW_STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HeartRateTileStyle.MEDIUM_STRESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f99523a = iArr;
            int[] iArr2 = new int[EnumC39048a.values().length];
            try {
                iArr2[EnumC39048a.MAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC39048a.HARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC39048a.MODERATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC39048a.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EnumC39048a.VERY_LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EnumC39048a.RESTORATIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EnumC39048a.SLEEP_HEART_RATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EnumC39048a.LIGHT_SLEEP.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[EnumC39048a.REM.ordinal()] = 9;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[EnumC39048a.SWS_SLEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[EnumC39048a.AWAKE_SLEEP.ordinal()] = 11;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[EnumC39048a.HIGH_STRESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[EnumC39048a.LOW_STRESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[EnumC39048a.MEDIUM_STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused29) {
            }
            f99524b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mc1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f99525w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f99525w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99525w.invoke((BarGraphContainerModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC39048a m74610c(HeartRateTileStyle zoneStyle) {
        AbstractC22676k.m65750j(zoneStyle, "zoneStyle");
        switch (a.f99523a[zoneStyle.ordinal()]) {
            case 1:
                return EnumC39048a.MAX;
            case 2:
                return EnumC39048a.HARD;
            case 3:
                return EnumC39048a.MODERATE;
            case 4:
                return EnumC39048a.LIGHT;
            case 5:
                return EnumC39048a.VERY_LIGHT;
            case 6:
                return EnumC39048a.RESTORATIVE;
            case 7:
                return EnumC39048a.SLEEP_HEART_RATE;
            case 8:
                return EnumC39048a.VERY_LIGHT;
            case 9:
                return EnumC39048a.LIGHT_SLEEP;
            case 10:
                return EnumC39048a.REM;
            case 11:
                return EnumC39048a.SWS_SLEEP;
            case 12:
                return EnumC39048a.AWAKE_SLEEP;
            case 13:
                return EnumC39048a.HIGH_STRESS;
            case 14:
                return EnumC39048a.LOW_STRESS;
            case 15:
                return EnumC39048a.MEDIUM_STRESS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final HeartRateTileStyle m74611d(EnumC39048a fillColor) {
        AbstractC22676k.m65750j(fillColor, "fillColor");
        switch (a.f99524b[fillColor.ordinal()]) {
            case 1:
                return HeartRateTileStyle.MAX_HR_ZONE;
            case 2:
                return HeartRateTileStyle.HARD_HR_ZONE;
            case 3:
                return HeartRateTileStyle.MODERATE_HR_ZONE;
            case 4:
                return HeartRateTileStyle.LIGHT_HR_ZONE;
            case 5:
                return HeartRateTileStyle.VERY_LIGHT_HR_ZONE;
            case 6:
                return HeartRateTileStyle.RESTORATIVE_HR_ZONE;
            case 7:
                return HeartRateTileStyle.SLEEP_HEART_RATE_ZONE;
            case 8:
                return HeartRateTileStyle.LIGHT_SLEEP;
            case 9:
                return HeartRateTileStyle.REM_SLEEP;
            case 10:
                return HeartRateTileStyle.SWS_SLEEP;
            case 11:
                return HeartRateTileStyle.AWAKE;
            case 12:
                return HeartRateTileStyle.HIGH_STRESS;
            case 13:
                return HeartRateTileStyle.LOW_STRESS;
            case 14:
                return HeartRateTileStyle.MEDIUM_STRESS;
            default:
                return HeartRateTileStyle.NONE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX INFO: renamed from: e */
    public static final HeartRateTileStyle m74612e(EnumC25417b heartZoneType, List<C39059l> list) {
        EnumC39048a fillColor;
        Object next;
        AbstractC22676k.m65750j(heartZoneType, "heartZoneType");
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C39059l) next).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() != heartZoneType);
            C39059l c39059l = (C39059l) next;
            if (c39059l == null || (fillColor = c39059l.getFillColor()) == null) {
                fillColor = EnumC39048a.VERY_LIGHT;
            }
        } else {
            fillColor = EnumC39048a.VERY_LIGHT;
        }
        return m74611d(fillColor);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m74613f() {
        return f99522a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m74614g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BarGraphContainerModel.class), new b(new C23753z4(29)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C22257n m74615h(BarGraphContainerModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C22257n(m74616i(model), m74617j(model.getHeartRateZones(), model.getTimeSpliceLayoutDirection()));
    }

    /* JADX INFO: renamed from: i */
    public static final C22258o m74616i(BarGraphContainerModel barGraphContainerModel) {
        AbstractC22676k.m65750j(barGraphContainerModel, "<this>");
        if (barGraphContainerModel.getTypicalRangeTitleDisplay().length() <= 0 && barGraphContainerModel.getDurationTitleDisplay().length() <= 0 && barGraphContainerModel.getDurationDisplay().length() <= 0) {
            return null;
        }
        return new C22258o(AbstractC8693b.m21278l(barGraphContainerModel.getTypicalRangeTitleDisplay()), AbstractC8693b.m21278l(barGraphContainerModel.getDurationTitleDisplay()), AbstractC8693b.m21278l(barGraphContainerModel.getDurationDisplay()));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00a7  */
    /* JADX INFO: renamed from: j */
    private static final List<C39059l> m74617j(List<HeartRateZone> list, LayoutDirection layoutDirection) {
        List listM7193a;
        C23465k c23465k;
        RangeModal graphRangeEndpoints;
        List<HeartRateZone> list2 = list;
        int i13 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (HeartRateZone heartRateZone : list2) {
            EnumC25417b enumC25417bM74620b = AbstractC25419d.INSTANCE.m74620b(heartRateZone.getId());
            TextResource textResourceM21278l = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileTitleDisplay());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileSubtitleDisplay());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTilePercentageDisplay());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileTimeDisplay());
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileTimeSuffixDisplay());
            EnumC39048a enumC39048aM74610c = m74610c(heartRateZone.getTileStyle());
            BarGraph barGraph = heartRateZone.getBarGraph();
            int i14 = 100;
            if (barGraph != null) {
                List<RangeModal> timeBoundRanges = barGraph.getTimeBoundRanges();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(timeBoundRanges, i13));
                for (RangeModal rangeModal : timeBoundRanges) {
                    float f13 = i14;
                    arrayList2.add(new C23465k(Float.valueOf(rangeModal.getLowerEndpoint() * f13), Float.valueOf(rangeModal.getUpperEndpoint() * f13)));
                    i14 = 100;
                }
                listM7193a = AbstractC2333f.m7193a(arrayList2);
                if (listM7193a == null) {
                    listM7193a = C25271y.f99162w;
                }
            } else {
                listM7193a = C25271y.f99162w;
            }
            BarGraph barGraph2 = heartRateZone.getBarGraph();
            if (barGraph2 == null || (graphRangeEndpoints = barGraph2.getGraphRangeEndpoints()) == null) {
                c23465k = null;
            } else {
                float f14 = 100;
                c23465k = new C23465k(Float.valueOf(graphRangeEndpoints.getLowerEndpoint() * f14), Float.valueOf(graphRangeEndpoints.getUpperEndpoint() * f14));
            }
            C23465k c23465k2 = c23465k;
            Boolean showRadioToggle = heartRateZone.getShowRadioToggle();
            boolean zBooleanValue = showRadioToggle != null ? showRadioToggle.booleanValue() : false;
            Boolean hideBackground = heartRateZone.getHideBackground();
            arrayList.add(new C39059l(enumC25417bM74620b, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, enumC39048aM74610c, null, false, false, listM7193a, false, c23465k2, zBooleanValue, hideBackground != null ? hideBackground.booleanValue() : true, layoutDirection, 2944, null));
            i13 = 10;
        }
        return arrayList;
    }
}
