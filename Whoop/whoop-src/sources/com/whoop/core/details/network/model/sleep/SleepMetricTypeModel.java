package com.whoop.core.details.network.model.sleep;

import ge3.AbstractC15751g;
import gp1.C16065a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "", "<init>", "(Ljava/lang/String;I)V", "WAKE_EVENTS", "EFFICIENCY", "RESPIRATORY_RATE", "LATENCY", "REM_SLEEP", "LIGHT_SLEEP", "SWS_SLEEP", "AWAKE", "RESTORATIVE_SLEEP", "TIME_IN_BED", "HOURS_OF_SLEEP", "TOTAL_WAKE_EVENTS", "toSleepDetailsKeyMetricTileType", "Lcom/whoop/core/details/network/model/sleep/SleepDetailsKeyMetricTileType;", "Companion", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum SleepMetricTypeModel {
    WAKE_EVENTS,
    EFFICIENCY,
    RESPIRATORY_RATE,
    LATENCY,
    REM_SLEEP,
    LIGHT_SLEEP,
    SWS_SLEEP,
    AWAKE,
    RESTORATIVE_SLEEP,
    TIME_IN_BED,
    HOURS_OF_SLEEP,
    TOTAL_WAKE_EVENTS;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16065a(28));

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) SleepMetricTypeModel.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepMetricTypeModel.values().length];
            try {
                iArr[SleepMetricTypeModel.WAKE_EVENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepMetricTypeModel.EFFICIENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepMetricTypeModel.RESPIRATORY_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepMetricTypeModel.LATENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.whoop.core.details.network.model.sleep.SleepMetricTypeModel", values(), new String[]{null, null, null, null, null, null, "DEEP_SLEEP", null, null, null, null, null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final SleepDetailsKeyMetricTileType toSleepDetailsKeyMetricTileType() {
        int i13 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i13 == 1) {
            return SleepDetailsKeyMetricTileType.WAKE_EVENTS;
        }
        if (i13 == 2) {
            return SleepDetailsKeyMetricTileType.EFFICIENCY;
        }
        if (i13 == 3) {
            return SleepDetailsKeyMetricTileType.RESPIRATORY_RATE;
        }
        if (i13 == 4) {
            return SleepDetailsKeyMetricTileType.LATENCY;
        }
        throw new IllegalStateException("Unexpected sleep metric -> key metric conversion for " + this + ". Please only try to launch dialog for a supported metric type");
    }
}
