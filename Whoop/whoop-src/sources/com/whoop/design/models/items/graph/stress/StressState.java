package com.whoop.design.models.items.graph.stress;

import androidx.annotation.Keep;
import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/stress/StressState;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "<init>", "(Ljava/lang/String;I)V", "RELAXED", "BALANCED", "STRESSED", "NO_DATA", "CALIBRATING", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum StressState implements DesignSystemEnum {
    RELAXED,
    BALANCED,
    STRESSED,
    NO_DATA,
    CALIBRATING;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
