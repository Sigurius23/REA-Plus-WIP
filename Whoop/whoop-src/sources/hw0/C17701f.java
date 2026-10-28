package hw0;

import androidx.health.platform.client.proto.C1533u;
import b21.AbstractC2333f;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.items.BarGraph;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.HeartRateTileId;
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
import l83.C23465k;
import m83.AbstractC25267u;
import m83.C25271y;
import mc1.EnumC25417b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y11.C39059l;
import y11.EnumC39048a;

/* JADX INFO: renamed from: hw0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u001c¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lhw0/f;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "Lcom/whoop/design/models/items/HeartRateZone;", "Lcom/whoop/design/models/items/graph/LayoutDirection;", "timeSpliceLayoutDirection", "Ly11/l;", "f", "(Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;)Ljava/util/List;", "heartRateZones", "Lmc1/b;", "heartZoneType", "Lcom/whoop/design/models/items/HeartRateTileStyle;", "b", "(Ljava/util/List;Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileStyle;", "zoneStyle", "Ly11/a;", "a", "(Lcom/whoop/design/models/items/HeartRateTileStyle;)Ly11/a;", "horizontalBarGraphTileStates", "selectedHeartZoneType", "currentHeartZoneTypeState", "d", "(Ljava/util/List;Lmc1/b;Lmc1/b;Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "barGraphContainerModel", "Lk71/n;", "c", "(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;", "Lk71/o;", "e", "(Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/o;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17701f {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final int f68766c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: hw0.f$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lhw0/f$a;", "", "<init>", "()V", "Lmc1/b;", "Lcom/whoop/design/models/items/HeartRateTileId;", "b", "(Lmc1/b;)Lcom/whoop/design/models/items/HeartRateTileId;", "c", "(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: hw0.f$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41720a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f68768a;

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ int[] f68769b;

            static {
                int[] iArr = new int[HeartRateTileId.values().length];
                try {
                    iArr[HeartRateTileId.AWAKE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeartRateTileId.EXHALE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeartRateTileId.HARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HeartRateTileId.HIGH_STRESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HeartRateTileId.HOLD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HeartRateTileId.INHALE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HeartRateTileId.LIGHT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HeartRateTileId.LIGHT_SLEEP.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HeartRateTileId.LOW_STRESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HeartRateTileId.MAX.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HeartRateTileId.MEDIUM_STRESS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[HeartRateTileId.MODERATE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[HeartRateTileId.NONE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[HeartRateTileId.REM_SLEEP.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[HeartRateTileId.RESTORATIVE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[HeartRateTileId.SWS_SLEEP.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[HeartRateTileId.VERY_LIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                f68768a = iArr;
                int[] iArr2 = new int[EnumC25417b.values().length];
                try {
                    iArr2[EnumC25417b.MAX.ordinal()] = 1;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[EnumC25417b.HARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[EnumC25417b.MODERATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr2[EnumC25417b.VERY_LIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr2[EnumC25417b.LIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr2[EnumC25417b.RESTORATIVE.ordinal()] = 6;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr2[EnumC25417b.INHALE.ordinal()] = 7;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr2[EnumC25417b.EXHALE.ordinal()] = 8;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr2[EnumC25417b.HOLD.ordinal()] = 9;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr2[EnumC25417b.LIGHT_SLEEP.ordinal()] = 10;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr2[EnumC25417b.REM_SLEEP.ordinal()] = 11;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr2[EnumC25417b.SWS_SLEEP.ordinal()] = 12;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr2[EnumC25417b.AWAKE.ordinal()] = 13;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr2[EnumC25417b.HIGH_STRESS.ordinal()] = 14;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr2[EnumC25417b.LOW_STRESS.ordinal()] = 15;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr2[EnumC25417b.MEDIUM_STRESS.ordinal()] = 16;
                } catch (NoSuchFieldError unused33) {
                }
                f68769b = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final HeartRateTileId m50665b(EnumC25417b enumC25417b) {
            switch (C41720a.f68769b[enumC25417b.ordinal()]) {
                case 1:
                    return HeartRateTileId.MAX;
                case 2:
                    return HeartRateTileId.HARD;
                case 3:
                    return HeartRateTileId.MODERATE;
                case 4:
                    return HeartRateTileId.VERY_LIGHT;
                case 5:
                    return HeartRateTileId.LIGHT;
                case 6:
                    return HeartRateTileId.RESTORATIVE;
                case 7:
                    return HeartRateTileId.INHALE;
                case 8:
                    return HeartRateTileId.EXHALE;
                case 9:
                    return HeartRateTileId.HOLD;
                case 10:
                    return HeartRateTileId.LIGHT_SLEEP;
                case 11:
                    return HeartRateTileId.REM_SLEEP;
                case 12:
                    return HeartRateTileId.SWS_SLEEP;
                case 13:
                    return HeartRateTileId.AWAKE;
                case 14:
                    return HeartRateTileId.HIGH_STRESS;
                case 15:
                    return HeartRateTileId.LOW_STRESS;
                case 16:
                    return HeartRateTileId.MEDIUM_STRESS;
                default:
                    return HeartRateTileId.NONE;
            }
        }

        /* JADX INFO: renamed from: c */
        public final EnumC25417b m50666c(HeartRateTileId heartRateTileId) {
            AbstractC22676k.m65750j(heartRateTileId, "<this>");
            switch (C41720a.f68768a[heartRateTileId.ordinal()]) {
                case 1:
                    return EnumC25417b.AWAKE;
                case 2:
                    return EnumC25417b.EXHALE;
                case 3:
                    return EnumC25417b.HARD;
                case 4:
                    return EnumC25417b.HIGH_STRESS;
                case 5:
                    return EnumC25417b.HOLD;
                case 6:
                    return EnumC25417b.INHALE;
                case 7:
                    return EnumC25417b.LIGHT;
                case 8:
                    return EnumC25417b.LIGHT_SLEEP;
                case 9:
                    return EnumC25417b.LOW_STRESS;
                case 10:
                    return EnumC25417b.MAX;
                case 11:
                    return EnumC25417b.MEDIUM_STRESS;
                case 12:
                    return EnumC25417b.MODERATE;
                case 13:
                    return EnumC25417b.NONE;
                case 14:
                    return EnumC25417b.REM_SLEEP;
                case 15:
                    return EnumC25417b.RESTORATIVE;
                case 16:
                    return EnumC25417b.SWS_SLEEP;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    return EnumC25417b.VERY_LIGHT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: hw0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68770a;

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
            f68770a = iArr;
        }
    }

    public C17701f(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    private final HeartRateTileStyle m50658b(List<HeartRateZone> heartRateZones, EnumC25417b heartZoneType) {
        Object next;
        if (heartRateZones != null) {
            Iterator<T> it = heartRateZones.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((HeartRateZone) next).getId() != INSTANCE.m50665b(heartZoneType));
            HeartRateZone heartRateZone = (HeartRateZone) next;
            HeartRateTileStyle tileStyle = heartRateZone != null ? heartRateZone.getTileStyle() : null;
            if (tileStyle != null) {
                return tileStyle;
            }
        }
        return HeartRateTileStyle.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00dd  */
    /* JADX INFO: renamed from: f */
    private final List<C39059l> m50659f(List<HeartRateZone> list, LayoutDirection layoutDirection) {
        Iterator it;
        List listM7193a;
        BarGraph barGraph;
        C23465k c23465k;
        RangeModal graphRangeEndpoints;
        List<HeartRateZone> list2 = list;
        int i13 = 10;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            HeartRateZone heartRateZone = (HeartRateZone) it3.next();
            EnumC25417b enumC25417bM50666c = INSTANCE.m50666c(heartRateZone.getId());
            TextResource textResourceM21278l = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileTitleDisplay());
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileSubtitleDisplay());
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTilePercentageDisplay());
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileTimeDisplay());
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(heartRateZone.getBarGraphTileTimeSuffixDisplay());
            EnumC39048a enumC39048aM50660a = m50660a(heartRateZone.getTileStyle());
            BarGraph barGraph2 = heartRateZone.getBarGraph();
            int i14 = 100;
            if (barGraph2 != null) {
                List<RangeModal> timeBoundRanges = barGraph2.getTimeBoundRanges();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(timeBoundRanges, i13));
                for (RangeModal rangeModal : timeBoundRanges) {
                    Iterator it4 = it3;
                    float f13 = i14;
                    arrayList2.add(new C23465k(Float.valueOf(rangeModal.getLowerEndpoint() * f13), Float.valueOf(rangeModal.getUpperEndpoint() * f13)));
                    it3 = it4;
                    i14 = 100;
                }
                it = it3;
                listM7193a = AbstractC2333f.m7193a(arrayList2);
                if (listM7193a == null) {
                }
                barGraph = heartRateZone.getBarGraph();
                if (barGraph != null || (graphRangeEndpoints = barGraph.getGraphRangeEndpoints()) == null) {
                    c23465k = null;
                } else {
                    float f14 = 100;
                    c23465k = new C23465k(Float.valueOf(graphRangeEndpoints.getLowerEndpoint() * f14), Float.valueOf(graphRangeEndpoints.getUpperEndpoint() * f14));
                }
                arrayList.add(new C39059l(enumC25417bM50666c, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, enumC39048aM50660a, null, false, false, listM7193a, false, c23465k, false, false, layoutDirection, 27520, null));
                it3 = it;
                i13 = 10;
            } else {
                it = it3;
            }
            listM7193a = C25271y.f99162w;
            barGraph = heartRateZone.getBarGraph();
            if (barGraph != null) {
                c23465k = null;
            } else {
                c23465k = null;
            }
            arrayList.add(new C39059l(enumC25417bM50666c, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, enumC39048aM50660a, null, false, false, listM7193a, false, c23465k, false, false, layoutDirection, 27520, null));
            it3 = it;
            i13 = 10;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final EnumC39048a m50660a(HeartRateTileStyle zoneStyle) {
        AbstractC22676k.m65750j(zoneStyle, "zoneStyle");
        switch (b.f68770a[zoneStyle.ordinal()]) {
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

    /* JADX INFO: renamed from: c */
    public final C22257n m50661c(BarGraphContainerModel barGraphContainerModel) {
        AbstractC22676k.m65750j(barGraphContainerModel, "barGraphContainerModel");
        return new C22257n(m50663e(barGraphContainerModel), m50659f(barGraphContainerModel.getHeartRateZones(), barGraphContainerModel.getTimeSpliceLayoutDirection()));
    }

    /* JADX INFO: renamed from: d */
    public final List<C39059l> m50662d(List<C39059l> horizontalBarGraphTileStates, EnumC25417b selectedHeartZoneType, EnumC25417b currentHeartZoneTypeState, List<HeartRateZone> heartRateZones) {
        EnumC39048a enumC39048aM50660a;
        C39059l c39059lM124529a;
        AbstractC22676k.m65750j(horizontalBarGraphTileStates, "horizontalBarGraphTileStates");
        AbstractC22676k.m65750j(selectedHeartZoneType, "selectedHeartZoneType");
        AbstractC22676k.m65750j(currentHeartZoneTypeState, "currentHeartZoneTypeState");
        boolean z4 = currentHeartZoneTypeState != EnumC25417b.NONE && currentHeartZoneTypeState == selectedHeartZoneType;
        List<C39059l> list = horizontalBarGraphTileStates;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C39059l c39059l : list) {
            if (c39059l.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == currentHeartZoneTypeState) {
                c39059lM124529a = c39059l.m124529a((64959 & 1) != 0 ? c39059l.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (64959 & 2) != 0 ? c39059l.title : null, (64959 & 4) != 0 ? c39059l.subtitle : null, (64959 & 8) != 0 ? c39059l.percentage : null, (64959 & 16) != 0 ? c39059l.time : null, (64959 & 32) != 0 ? c39059l.timeSuffix : null, (64959 & 64) != 0 ? c39059l.fillColor : m50660a(m50658b(heartRateZones, currentHeartZoneTypeState)), (64959 & 128) != 0 ? c39059l.modifier : null, (64959 & 256) != 0 ? c39059l.isDrillDown : false, (64959 & 512) != 0 ? c39059l.isSelected : c39059l.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == selectedHeartZoneType, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39059l.ratios : null, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39059l.showAverage : false, (64959 & 4096) != 0 ? c39059l.averageRange : null, (64959 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39059l.showRadioButton : false, (64959 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39059l.hideBackground : false, (64959 & 32768) != 0 ? c39059l.timeSpliceLayoutDirection : null);
            } else {
                if (z4) {
                    enumC39048aM50660a = EnumC39048a.AWAKE_SLEEP;
                } else {
                    Object obj = c39059l.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.whoop.design.reducer.mapper.hrgraph.HeartRateZoneType");
                    enumC39048aM50660a = m50660a(m50658b(heartRateZones, (EnumC25417b) obj));
                }
                c39059lM124529a = c39059l.m124529a((64959 & 1) != 0 ? c39059l.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (64959 & 2) != 0 ? c39059l.title : null, (64959 & 4) != 0 ? c39059l.subtitle : null, (64959 & 8) != 0 ? c39059l.percentage : null, (64959 & 16) != 0 ? c39059l.time : null, (64959 & 32) != 0 ? c39059l.timeSuffix : null, (64959 & 64) != 0 ? c39059l.fillColor : enumC39048aM50660a, (64959 & 128) != 0 ? c39059l.modifier : null, (64959 & 256) != 0 ? c39059l.isDrillDown : z4, (64959 & 512) != 0 ? c39059l.isSelected : false, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39059l.ratios : null, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39059l.showAverage : false, (64959 & 4096) != 0 ? c39059l.averageRange : null, (64959 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39059l.showRadioButton : false, (64959 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39059l.hideBackground : false, (64959 & 32768) != 0 ? c39059l.timeSpliceLayoutDirection : null);
            }
            arrayList.add(c39059lM124529a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final C22258o m50663e(BarGraphContainerModel barGraphContainerModel) {
        AbstractC22676k.m65750j(barGraphContainerModel, "<this>");
        if (barGraphContainerModel.getTypicalRangeTitleDisplay().length() <= 0 && barGraphContainerModel.getDurationTitleDisplay().length() <= 0 && barGraphContainerModel.getDurationDisplay().length() <= 0) {
            return null;
        }
        return new C22258o(AbstractC8693b.m21278l(barGraphContainerModel.getTypicalRangeTitleDisplay()), AbstractC8693b.m21278l(barGraphContainerModel.getDurationTitleDisplay()), AbstractC8693b.m21278l(barGraphContainerModel.getDurationDisplay()));
    }
}
