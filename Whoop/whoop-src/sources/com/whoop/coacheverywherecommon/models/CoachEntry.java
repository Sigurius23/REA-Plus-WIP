package com.whoop.coacheverywherecommon.models;

import androidx.annotation.Keep;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0011\u0010+\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u00061"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "", "Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;", "type", "Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "data", "<init>", "(Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;Lcom/whoop/coacheverywherecommon/models/CoachEntryData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/coacheverywherecommon/models/CoachSurfaceType;Lcom/whoop/coacheverywherecommon/models/CoachEntryData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_common_release", "(Lcom/whoop/coacheverywherecommon/models/CoachEntry;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;", "component2", "()Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "copy", "(Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;Lcom/whoop/coacheverywherecommon/models/CoachEntryData;)Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;", "getType", "Lcom/whoop/coacheverywherecommon/models/CoachEntryData;", "getData", "getHasSurface", "()Z", "hasSurface", "getStartsCollapsed", "startsCollapsed", "Companion", "$serializer", "a", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoachEntry {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CoachEntryData data;
    private final CoachSurfaceType type;

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.CoachEntry$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEntry$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoachEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoachEntry() {
        this((CoachSurfaceType) null, (CoachEntryData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CoachEntry copy$default(CoachEntry coachEntry, CoachSurfaceType coachSurfaceType, CoachEntryData coachEntryData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            coachSurfaceType = coachEntry.type;
        }
        if ((i13 & 2) != 0) {
            coachEntryData = coachEntry.data;
        }
        return coachEntry.copy(coachSurfaceType, coachEntryData);
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_common_release(CoachEntry self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != CoachSurfaceType.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, C6220b.f24415a, self.type);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.data == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, CoachEntryData$$serializer.INSTANCE, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoachSurfaceType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoachEntryData getData() {
        return this.data;
    }

    public final CoachEntry copy(CoachSurfaceType type, CoachEntryData data) {
        AbstractC22676k.m65750j(type, "type");
        return new CoachEntry(type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachEntry)) {
            return false;
        }
        CoachEntry coachEntry = (CoachEntry) other;
        return this.type == coachEntry.type && AbstractC22676k.m65745e(this.data, coachEntry.data);
    }

    public final CoachEntryData getData() {
        return this.data;
    }

    public final boolean getHasSurface() {
        return this.type.isBar() || this.type.isFab();
    }

    public final boolean getStartsCollapsed() {
        if (this.type != CoachSurfaceType.COACH_BAR_POP) {
            return false;
        }
        CoachEntryData coachEntryData = this.data;
        return (coachEntryData != null ? coachEntryData.getDrawerPresentation() : null) == DrawerPresentation.INLINE;
    }

    public final CoachSurfaceType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        CoachEntryData coachEntryData = this.data;
        return iHashCode + (coachEntryData == null ? 0 : coachEntryData.hashCode());
    }

    public String toString() {
        return "CoachEntry(type=" + this.type + ", data=" + this.data + ")";
    }

    public /* synthetic */ CoachEntry(int i13, CoachSurfaceType coachSurfaceType, CoachEntryData coachEntryData, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i13 & 1) == 0 ? CoachSurfaceType.UNKNOWN : coachSurfaceType;
        if ((i13 & 2) == 0) {
            this.data = null;
        } else {
            this.data = coachEntryData;
        }
    }

    public CoachEntry(CoachSurfaceType type, CoachEntryData coachEntryData) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.data = coachEntryData;
    }

    public /* synthetic */ CoachEntry(CoachSurfaceType coachSurfaceType, CoachEntryData coachEntryData, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? CoachSurfaceType.UNKNOWN : coachSurfaceType, (i13 & 2) != 0 ? null : coachEntryData);
    }
}
