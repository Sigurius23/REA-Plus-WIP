package mc1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.models.items.HeartRateTileId;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y11.C39059l;
import y11.EnumC39048a;

/* JADX INFO: renamed from: mc1.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lmc1/d;", "", "a", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25419d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: mc1.d$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmc1/d$a;", "", "<init>", "()V", "Lcom/whoop/design/models/items/HeartRateTileId;", "Lmc1/b;", "b", "(Lcom/whoop/design/models/items/HeartRateTileId;)Lmc1/b;", "", "Ly11/l;", "horizontalBarGraphTileStates", "selectedHeartZoneType", "currentHeartZoneTypeState", "a", "(Ljava/util/List;Lmc1/b;Lmc1/b;)Ljava/util/List;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: mc1.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class C41990a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f99527a;

            static {
                int[] iArr = new int[HeartRateTileId.values().length];
                try {
                    iArr[HeartRateTileId.MAX.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeartRateTileId.HARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeartRateTileId.MODERATE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HeartRateTileId.VERY_LIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HeartRateTileId.LIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HeartRateTileId.RESTORATIVE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HeartRateTileId.INHALE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HeartRateTileId.EXHALE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HeartRateTileId.HOLD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HeartRateTileId.NONE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HeartRateTileId.LIGHT_SLEEP.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[HeartRateTileId.REM_SLEEP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[HeartRateTileId.SWS_SLEEP.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[HeartRateTileId.AWAKE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[HeartRateTileId.HIGH_STRESS.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[HeartRateTileId.LOW_STRESS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[HeartRateTileId.MEDIUM_STRESS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                f99527a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<C39059l> m74619a(List<C39059l> horizontalBarGraphTileStates, EnumC25417b selectedHeartZoneType, EnumC25417b currentHeartZoneTypeState) {
            EnumC39048a enumC39048aM74610c;
            ArrayList arrayList;
            C39059l c39059lM124529a;
            AbstractC22676k.m65750j(horizontalBarGraphTileStates, "horizontalBarGraphTileStates");
            AbstractC22676k.m65750j(selectedHeartZoneType, "selectedHeartZoneType");
            AbstractC22676k.m65750j(currentHeartZoneTypeState, "currentHeartZoneTypeState");
            boolean z4 = currentHeartZoneTypeState != EnumC25417b.NONE && currentHeartZoneTypeState == selectedHeartZoneType;
            List<C39059l> list = horizontalBarGraphTileStates;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (C39059l c39059l : list) {
                if (c39059l.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == currentHeartZoneTypeState) {
                    c39059lM124529a = c39059l.m124529a((64959 & 1) != 0 ? c39059l.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (64959 & 2) != 0 ? c39059l.title : null, (64959 & 4) != 0 ? c39059l.subtitle : null, (64959 & 8) != 0 ? c39059l.percentage : null, (64959 & 16) != 0 ? c39059l.time : null, (64959 & 32) != 0 ? c39059l.timeSuffix : null, (64959 & 64) != 0 ? c39059l.fillColor : AbstractC25418c.m74610c(AbstractC25418c.m74612e(currentHeartZoneTypeState, horizontalBarGraphTileStates)), (64959 & 128) != 0 ? c39059l.modifier : null, (64959 & 256) != 0 ? c39059l.isDrillDown : false, (64959 & 512) != 0 ? c39059l.isSelected : c39059l.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() == selectedHeartZoneType, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39059l.ratios : null, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39059l.showAverage : false, (64959 & 4096) != 0 ? c39059l.averageRange : null, (64959 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39059l.showRadioButton : false, (64959 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39059l.hideBackground : false, (64959 & 32768) != 0 ? c39059l.timeSpliceLayoutDirection : null);
                    arrayList = arrayList2;
                } else {
                    if (z4) {
                        enumC39048aM74610c = EnumC39048a.AWAKE_SLEEP;
                    } else {
                        Object obj = c39059l.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.whoop.design.reducer.mapper.hrgraph.HeartRateZoneType");
                        enumC39048aM74610c = AbstractC25418c.m74610c(AbstractC25418c.m74612e((EnumC25417b) obj, horizontalBarGraphTileStates));
                    }
                    arrayList = arrayList2;
                    c39059lM124529a = c39059l.m124529a((64959 & 1) != 0 ? c39059l.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (64959 & 2) != 0 ? c39059l.title : null, (64959 & 4) != 0 ? c39059l.subtitle : null, (64959 & 8) != 0 ? c39059l.percentage : null, (64959 & 16) != 0 ? c39059l.time : null, (64959 & 32) != 0 ? c39059l.timeSuffix : null, (64959 & 64) != 0 ? c39059l.fillColor : enumC39048aM74610c, (64959 & 128) != 0 ? c39059l.modifier : null, (64959 & 256) != 0 ? c39059l.isDrillDown : z4, (64959 & 512) != 0 ? c39059l.isSelected : false, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39059l.ratios : null, (64959 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39059l.showAverage : false, (64959 & 4096) != 0 ? c39059l.averageRange : null, (64959 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39059l.showRadioButton : false, (64959 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39059l.hideBackground : false, (64959 & 32768) != 0 ? c39059l.timeSpliceLayoutDirection : null);
                }
                arrayList.add(c39059lM124529a);
                arrayList2 = arrayList;
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: b */
        public final EnumC25417b m74620b(HeartRateTileId heartRateTileId) {
            AbstractC22676k.m65750j(heartRateTileId, "<this>");
            switch (C41990a.f99527a[heartRateTileId.ordinal()]) {
                case 1:
                    return EnumC25417b.MAX;
                case 2:
                    return EnumC25417b.HARD;
                case 3:
                    return EnumC25417b.MODERATE;
                case 4:
                    return EnumC25417b.VERY_LIGHT;
                case 5:
                    return EnumC25417b.LIGHT;
                case 6:
                    return EnumC25417b.RESTORATIVE;
                case 7:
                    return EnumC25417b.INHALE;
                case 8:
                    return EnumC25417b.EXHALE;
                case 9:
                    return EnumC25417b.HOLD;
                case 10:
                    return EnumC25417b.NONE;
                case 11:
                    return EnumC25417b.LIGHT_SLEEP;
                case 12:
                    return EnumC25417b.REM_SLEEP;
                case 13:
                    return EnumC25417b.SWS_SLEEP;
                case 14:
                    return EnumC25417b.AWAKE;
                case 15:
                    return EnumC25417b.HIGH_STRESS;
                case 16:
                    return EnumC25417b.LOW_STRESS;
                case C1533u.MAX_FIELD_NUMBER /* 17 */:
                    return EnumC25417b.MEDIUM_STRESS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        private Companion() {
        }
    }
}
