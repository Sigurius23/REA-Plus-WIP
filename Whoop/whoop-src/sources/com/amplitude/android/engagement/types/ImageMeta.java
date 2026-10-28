package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ImageMeta;", "", "", "src", "filename", "size", "Lcom/amplitude/android/engagement/types/ImageStyle;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ImageStyle;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ImageStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ImageMeta;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/amplitude/android/engagement/types/ImageStyle;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/types/ImageStyle;)Lcom/amplitude/android/engagement/types/ImageMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSrc", "getFilename", "getSize", "Lcom/amplitude/android/engagement/types/ImageStyle;", "getStyle", "Companion", "$serializer", "com/amplitude/android/engagement/types/f0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImageMeta {
    public static final int $stable = 0;
    public static final C4885f0 Companion = new C4885f0();
    private final String filename;
    private final String size;
    private final String src;
    private final ImageStyle style;

    @InterfaceC23457c
    public /* synthetic */ ImageMeta(int i13, String str, String str2, String str3, ImageStyle imageStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ImageMeta$$serializer.INSTANCE.getDescriptor());
        }
        this.src = str;
        if ((i13 & 2) == 0) {
            this.filename = null;
        } else {
            this.filename = str2;
        }
        if ((i13 & 4) == 0) {
            this.size = null;
        } else {
            this.size = str3;
        }
        if ((i13 & 8) == 0) {
            this.style = null;
        } else {
            this.style = imageStyle;
        }
    }

    public static /* synthetic */ ImageMeta copy$default(ImageMeta imageMeta, String str, String str2, String str3, ImageStyle imageStyle, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = imageMeta.src;
        }
        if ((i13 & 2) != 0) {
            str2 = imageMeta.filename;
        }
        if ((i13 & 4) != 0) {
            str3 = imageMeta.size;
        }
        if ((i13 & 8) != 0) {
            imageStyle = imageMeta.style;
        }
        return imageMeta.copy(str, str2, str3, imageStyle);
    }

    public static final /* synthetic */ void write$Self(ImageMeta self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.src);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.filename != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.filename);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.size != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.size);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.style == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, ImageStyle$$serializer.INSTANCE, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImageStyle getStyle() {
        return this.style;
    }

    public final ImageMeta copy(String src, String filename, String size, ImageStyle style) {
        AbstractC22676k.m65750j(src, "src");
        return new ImageMeta(src, filename, size, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageMeta)) {
            return false;
        }
        ImageMeta imageMeta = (ImageMeta) other;
        return AbstractC22676k.m65745e(this.src, imageMeta.src) && AbstractC22676k.m65745e(this.filename, imageMeta.filename) && AbstractC22676k.m65745e(this.size, imageMeta.size) && AbstractC22676k.m65745e(this.style, imageMeta.style);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getSrc() {
        return this.src;
    }

    public final ImageStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.src.hashCode() * 31;
        String str = this.filename;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.size;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageStyle imageStyle = this.style;
        return iHashCode3 + (imageStyle != null ? imageStyle.hashCode() : 0);
    }

    public String toString() {
        return "ImageMeta(src=" + this.src + ", filename=" + this.filename + ", size=" + this.size + ", style=" + this.style + ')';
    }

    public ImageMeta(String src, String str, String str2, ImageStyle imageStyle) {
        AbstractC22676k.m65750j(src, "src");
        this.src = src;
        this.filename = str;
        this.size = str2;
        this.style = imageStyle;
    }

    public /* synthetic */ ImageMeta(String str, String str2, String str3, ImageStyle imageStyle, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : imageStyle);
    }
}
