package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ImageMarker;", "Lcom/amplitude/android/engagement/types/Marker;", "", "source", "Lcom/amplitude/android/engagement/types/MarkerPositioning;", "positioning", "", "width", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/MarkerPositioning;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/MarkerPositioning;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ImageMarker;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/MarkerPositioning;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/MarkerPositioning;Ljava/lang/Integer;)Lcom/amplitude/android/engagement/types/ImageMarker;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "Lcom/amplitude/android/engagement/types/MarkerPositioning;", "getPositioning", "Ljava/lang/Integer;", "getWidth", "Companion", "$serializer", "com/amplitude/android/engagement/types/e0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("image")
@InterfaceC37144i
public final /* data */ class ImageMarker extends Marker {
    public static final int $stable = 0;
    public static final C4881e0 Companion = new C4881e0();
    private final MarkerPositioning positioning;
    private final String source;
    private final Integer width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ ImageMarker(int i13, String str, MarkerPositioning markerPositioning, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ImageMarker$$serializer.INSTANCE.getDescriptor());
        }
        this.source = str;
        this.positioning = markerPositioning;
        if ((i13 & 4) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
    }

    public static /* synthetic */ ImageMarker copy$default(ImageMarker imageMarker, String str, MarkerPositioning markerPositioning, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = imageMarker.source;
        }
        if ((i13 & 2) != 0) {
            markerPositioning = imageMarker.positioning;
        }
        if ((i13 & 4) != 0) {
            num = imageMarker.width;
        }
        return imageMarker.copy(str, markerPositioning, num);
    }

    public static final /* synthetic */ void write$Self(ImageMarker self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        Marker.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.source);
        output.encodeSerializableElement(serialDesc, 1, MarkerPositioning$$serializer.INSTANCE, self.getPositioning());
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.width == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.width);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MarkerPositioning getPositioning() {
        return this.positioning;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    public final ImageMarker copy(String source, MarkerPositioning positioning, Integer width) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(positioning, "positioning");
        return new ImageMarker(source, positioning, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageMarker)) {
            return false;
        }
        ImageMarker imageMarker = (ImageMarker) other;
        return AbstractC22676k.m65745e(this.source, imageMarker.source) && AbstractC22676k.m65745e(this.positioning, imageMarker.positioning) && AbstractC22676k.m65745e(this.width, imageMarker.width);
    }

    @Override // com.amplitude.android.engagement.types.Marker
    public MarkerPositioning getPositioning() {
        return this.positioning;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.positioning.hashCode() + (this.source.hashCode() * 31)) * 31;
        Integer num = this.width;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ImageMarker(source=" + this.source + ", positioning=" + this.positioning + ", width=" + this.width + ')';
    }

    public /* synthetic */ ImageMarker(String str, MarkerPositioning markerPositioning, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, markerPositioning, (i13 & 4) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageMarker(String source, MarkerPositioning positioning, Integer num) {
        super(null);
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(positioning, "positioning");
        this.source = source;
        this.positioning = positioning;
        this.width = num;
    }
}
