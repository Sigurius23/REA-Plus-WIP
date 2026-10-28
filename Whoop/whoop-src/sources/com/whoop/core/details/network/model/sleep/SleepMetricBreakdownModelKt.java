package com.whoop.core.details.network.model.sleep;

import hy0.EnumC17727b2;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;", "Lhy0/b2;", "toTrendTypeState", "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;)Lhy0/b2;", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SleepMetricBreakdownModelKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepMetricTrendType.values().length];
            try {
                iArr[SleepMetricTrendType.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepMetricTrendType.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepMetricTrendType.NEGATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepMetricTrendType.POSITIVE_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SleepMetricTrendType.CONCERN_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SleepMetricTrendType.ALERT_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final EnumC17727b2 toTrendTypeState(SleepMetricTrendType sleepMetricTrendType) {
        AbstractC22676k.m65750j(sleepMetricTrendType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[sleepMetricTrendType.ordinal()]) {
            case 1:
                return EnumC17727b2.POSITIVE;
            case 2:
                return EnumC17727b2.NEUTRAL;
            case 3:
                return EnumC17727b2.NEGATIVE;
            case 4:
                return EnumC17727b2.POSITIVE_RANGE;
            case 5:
                return EnumC17727b2.CONCERN_RANGE;
            case 6:
                return EnumC17727b2.CONCERN_RANGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
