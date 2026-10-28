package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006&"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ImageBlock;", "Lcom/amplitude/android/engagement/types/ContentBlock;", "Lcom/amplitude/android/engagement/types/ImageMeta;", "meta", "<init>", "(Lcom/amplitude/android/engagement/types/ImageMeta;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/ImageMeta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ImageBlock;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/ImageMeta;", "copy", "(Lcom/amplitude/android/engagement/types/ImageMeta;)Lcom/amplitude/android/engagement/types/ImageBlock;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/ImageMeta;", "getMeta", "Companion", "$serializer", "com/amplitude/android/engagement/types/d0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37143h("image")
@InterfaceC37144i
public final /* data */ class ImageBlock extends ContentBlock {
    public static final int $stable = 0;
    public static final C4877d0 Companion = new C4877d0();
    private final ImageMeta meta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public /* synthetic */ ImageBlock(int i13, ImageMeta imageMeta, SerializationConstructorMarker serializationConstructorMarker) {
        super(i13, serializationConstructorMarker);
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ImageBlock$$serializer.INSTANCE.getDescriptor());
        }
        this.meta = imageMeta;
    }

    public static /* synthetic */ ImageBlock copy$default(ImageBlock imageBlock, ImageMeta imageMeta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            imageMeta = imageBlock.meta;
        }
        return imageBlock.copy(imageMeta);
    }

    public static final /* synthetic */ void write$Self(ImageBlock self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        ContentBlock.write$Self(self, output, serialDesc);
        output.encodeSerializableElement(serialDesc, 0, ImageMeta$$serializer.INSTANCE, self.meta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageMeta getMeta() {
        return this.meta;
    }

    public final ImageBlock copy(ImageMeta meta) {
        AbstractC22676k.m65750j(meta, "meta");
        return new ImageBlock(meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageBlock) && AbstractC22676k.m65745e(this.meta, ((ImageBlock) other).meta);
    }

    public final ImageMeta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return this.meta.hashCode();
    }

    public String toString() {
        return "ImageBlock(meta=" + this.meta + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageBlock(ImageMeta meta) {
        super(null);
        AbstractC22676k.m65750j(meta, "meta");
        this.meta = meta;
    }
}
