package com.mapbox.maps;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Objects;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B)\b\u0002\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lcom/mapbox/maps/ImageHolder;", "Landroid/os/Parcelable;", "", "drawableId", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/mapbox/maps/Image;", "image", "<init>", "(Ljava/lang/Integer;Landroid/graphics/Bitmap;Lcom/mapbox/maps/Image;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getDrawableId", "()Ljava/lang/Integer;", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Lcom/mapbox/maps/Image;", "getImage", "()Lcom/mapbox/maps/Image;", "Companion", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ImageHolder implements Parcelable {
    private final Bitmap bitmap;
    private final Integer drawableId;
    private final Image image;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ImageHolder> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m65681d2 = {"Lcom/mapbox/maps/ImageHolder$Companion;", "", "()V", "from", "Lcom/mapbox/maps/ImageHolder;", "bitmap", "Landroid/graphics/Bitmap;", "image", "Lcom/mapbox/maps/Image;", "drawableId", "", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImageHolder from(int drawableId) {
            return new ImageHolder(Integer.valueOf(drawableId), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImageHolder from(Bitmap bitmap) {
            AbstractC22676k.m65750j(bitmap, "bitmap");
            return new ImageHolder(null, bitmap, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ImageHolder from(Image image) {
            AbstractC22676k.m65750j(image, "image");
            return new ImageHolder(null, 0 == true ? 1 : 0, image, 0 == true ? 1 : 0);
        }
    }

    @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageHolder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageHolder createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new ImageHolder(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Bitmap) parcel.readParcelable(ImageHolder.class.getClassLoader()), (Image) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageHolder[] newArray(int i13) {
            return new ImageHolder[i13];
        }
    }

    public /* synthetic */ ImageHolder(Integer num, Bitmap bitmap, Image image, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, bitmap, image);
    }

    public static final ImageHolder from(int i13) {
        return INSTANCE.from(i13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ImageHolder.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(other, "null cannot be cast to non-null type com.mapbox.maps.ImageHolder");
        ImageHolder imageHolder = (ImageHolder) other;
        return AbstractC22676k.m65745e(this.drawableId, imageHolder.drawableId) && AbstractC22676k.m65745e(this.bitmap, imageHolder.bitmap) && AbstractC22676k.m65745e(this.image, imageHolder.image);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Integer getDrawableId() {
        return this.drawableId;
    }

    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        return Objects.hash(this.drawableId, this.bitmap, this.image);
    }

    public String toString() {
        return "ImageHolder(bitmap=" + this.bitmap + ", drawableId=" + this.drawableId + ", image=" + this.image + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        AbstractC22676k.m65750j(parcel, "out");
        Integer num = this.drawableId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            AbstractC3855a.m11837u(parcel, 1, num);
        }
        parcel.writeParcelable(this.bitmap, flags);
        parcel.writeSerializable(this.image);
    }

    private ImageHolder(Integer num, Bitmap bitmap, Image image) {
        this.drawableId = num;
        this.bitmap = bitmap;
        this.image = image;
    }

    public static final ImageHolder from(Bitmap bitmap) {
        return INSTANCE.from(bitmap);
    }

    public static final ImageHolder from(Image image) {
        return INSTANCE.from(image);
    }
}
