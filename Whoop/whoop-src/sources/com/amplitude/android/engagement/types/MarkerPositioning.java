package com.amplitude.android.engagement.types;

import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/MarkerPositioning;", "", "Lcom/amplitude/android/engagement/types/TooltipPosition;", "position", "Lcom/amplitude/android/engagement/types/OffsetValue;", MapboxMap.QFE_OFFSET, "<init>", "(Lcom/amplitude/android/engagement/types/TooltipPosition;Lcom/amplitude/android/engagement/types/OffsetValue;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/TooltipPosition;Lcom/amplitude/android/engagement/types/OffsetValue;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/MarkerPositioning;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/TooltipPosition;", "component2", "()Lcom/amplitude/android/engagement/types/OffsetValue;", "copy", "(Lcom/amplitude/android/engagement/types/TooltipPosition;Lcom/amplitude/android/engagement/types/OffsetValue;)Lcom/amplitude/android/engagement/types/MarkerPositioning;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/TooltipPosition;", "getPosition", "Lcom/amplitude/android/engagement/types/OffsetValue;", "getOffset", "Companion", "$serializer", "com/amplitude/android/engagement/types/n0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MarkerPositioning {
    public static final int $stable = 0;
    private final OffsetValue offset;
    private final TooltipPosition position;
    public static final C4917n0 Companion = new C4917n0();
    private static final InterfaceC37138c[] $childSerializers = {TooltipPosition.Companion.serializer(), null};

    @InterfaceC23457c
    public /* synthetic */ MarkerPositioning(int i13, TooltipPosition tooltipPosition, OffsetValue offsetValue, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, MarkerPositioning$$serializer.INSTANCE.getDescriptor());
        }
        this.position = tooltipPosition;
        this.offset = offsetValue;
    }

    public static /* synthetic */ MarkerPositioning copy$default(MarkerPositioning markerPositioning, TooltipPosition tooltipPosition, OffsetValue offsetValue, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tooltipPosition = markerPositioning.position;
        }
        if ((i13 & 2) != 0) {
            offsetValue = markerPositioning.offset;
        }
        return markerPositioning.copy(tooltipPosition, offsetValue);
    }

    public static final /* synthetic */ void write$Self(MarkerPositioning self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0], self.position);
        output.encodeSerializableElement(serialDesc, 1, OffsetValue$$serializer.INSTANCE, self.offset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TooltipPosition getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetValue getOffset() {
        return this.offset;
    }

    public final MarkerPositioning copy(TooltipPosition position, OffsetValue offset) {
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(offset, "offset");
        return new MarkerPositioning(position, offset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkerPositioning)) {
            return false;
        }
        MarkerPositioning markerPositioning = (MarkerPositioning) other;
        return this.position == markerPositioning.position && AbstractC22676k.m65745e(this.offset, markerPositioning.offset);
    }

    public final OffsetValue getOffset() {
        return this.offset;
    }

    public final TooltipPosition getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.offset.hashCode() + (this.position.hashCode() * 31);
    }

    public String toString() {
        return "MarkerPositioning(position=" + this.position + ", offset=" + this.offset + ')';
    }

    public MarkerPositioning(TooltipPosition position, OffsetValue offset) {
        AbstractC22676k.m65750j(position, "position");
        AbstractC22676k.m65750j(offset, "offset");
        this.position = position;
        this.offset = offset;
    }
}
