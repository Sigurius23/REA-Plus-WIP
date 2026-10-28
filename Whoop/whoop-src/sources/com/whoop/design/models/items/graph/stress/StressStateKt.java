package com.whoop.design.models.items.graph.stress;

import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/stress/StressState;", "Ly81/e;", "toWhoopColor", "(Lcom/whoop/design/models/items/graph/stress/StressState;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StressStateKt {

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StressState.values().length];
            try {
                iArr[StressState.RELAXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StressState.BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StressState.STRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StressState.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StressState.CALIBRATING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final InterfaceC39332e toWhoopColor(StressState stressState) {
        AbstractC22676k.m65750j(stressState, "<this>");
        int i13 = WhenMappings.$EnumSwitchMapping$0[stressState.ordinal()];
        if (i13 == 1) {
            return Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: com.whoop.design.models.items.graph.stress.StressStateKt.toWhoopColor.1
                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m134160invokevNxB06k((C39336i) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m134160invokevNxB06k(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return whoopColor.getRecovery();
                }
            });
        }
        if (i13 == 2) {
            return Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: com.whoop.design.models.items.graph.stress.StressStateKt.toWhoopColor.2
                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m134161invokevNxB06k((C39336i) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m134161invokevNxB06k(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return whoopColor.getAccentPositiveTrend();
                }
            });
        }
        if (i13 == 3) {
            return Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: com.whoop.design.models.items.graph.stress.StressStateKt.toWhoopColor.3
                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m134162invokevNxB06k((C39336i) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m134162invokevNxB06k(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return whoopColor.getAccentNegativeTrend();
                }
            });
        }
        if (i13 == 4) {
            return Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: com.whoop.design.models.items.graph.stress.StressStateKt.toWhoopColor.4
                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m134163invokevNxB06k((C39336i) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m134163invokevNxB06k(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return whoopColor.getBrandWhite();
                }
            });
        }
        if (i13 == 5) {
            return Function1.m125323a(new p715kotlin.jvm.functions.Function1() { // from class: com.whoop.design.models.items.graph.stress.StressStateKt.toWhoopColor.5
                @Override // p715kotlin.jvm.functions.Function1
                public /* synthetic */ Object invoke(Object obj) {
                    return new C17919x(m134164invokevNxB06k((C39336i) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m134164invokevNxB06k(C39336i whoopColor) {
                    AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
                    return whoopColor.getBrandWhite();
                }
            });
        }
        throw new NoWhenBranchMatchedException();
    }
}
