package com.whoop.coacheverywherecommon.models;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import xr2.InterfaceC38631a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;", "Lxr2/a;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "isPreview", "()Z", "isBar", "isFab", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Companion", "a", "COACH_BAR", "COACH_BAR_PREVIEW", "COACH_BAR_POP", "FAB", "FAB_PREVIEW", "INSIGHT_PREVIEW", "UNKNOWN", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C6220b.class)
public enum CoachSurfaceType implements InterfaceC38631a {
    COACH_BAR("COACH_BAR"),
    COACH_BAR_PREVIEW("COACH_BAR_PREVIEW"),
    COACH_BAR_POP("COACH_BAR_POP"),
    FAB("FAB"),
    FAB_PREVIEW("FAB_PREVIEW"),
    INSIGHT_PREVIEW("INSIGHT_PREVIEW"),
    UNKNOWN("UNKNOWN");

    private final String serializedValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.CoachSurfaceType$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return C6220b.f24415a;
        }

        private Companion() {
        }
    }

    CoachSurfaceType(String str) {
        this.serializedValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    @Override // xr2.InterfaceC38631a
    public String getSerializedValue() {
        return this.serializedValue;
    }

    public final boolean isBar() {
        return this == COACH_BAR || this == COACH_BAR_PREVIEW || this == COACH_BAR_POP || this == INSIGHT_PREVIEW;
    }

    public final boolean isFab() {
        return this == FAB || this == FAB_PREVIEW;
    }

    public final boolean isPreview() {
        return this == COACH_BAR_PREVIEW || this == COACH_BAR_POP || this == FAB_PREVIEW || this == INSIGHT_PREVIEW;
    }
}
