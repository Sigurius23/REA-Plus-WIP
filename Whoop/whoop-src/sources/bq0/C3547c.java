package bq0;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lbq0/c;", "Landroid/os/Parcelable;", "", "imageUrl", "name", "thumbnailUrl", "category", "", "hasData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getImageUrl", "x", "f", "y", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "z", "getCategory", "E", "Z", "b", "()Z", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3547c implements Parcelable {
    public static final Parcelable.Creator<C3547c> CREATOR = new a();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final boolean hasData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String imageUrl;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String thumbnailUrl;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: bq0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Parcelable.Creator<C3547c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3547c createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new C3547c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3547c[] newArray(int i13) {
            return new C3547c[i13];
        }
    }

    public C3547c(String imageUrl, String name, String thumbnailUrl, String category, boolean z4) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(thumbnailUrl, "thumbnailUrl");
        AbstractC22676k.m65750j(category, "category");
        this.imageUrl = imageUrl;
        this.name = name;
        this.thumbnailUrl = thumbnailUrl;
        this.category = category;
        this.hasData = z4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3547c)) {
            return false;
        }
        C3547c c3547c = (C3547c) other;
        return AbstractC22676k.m65745e(this.imageUrl, c3547c.imageUrl) && AbstractC22676k.m65745e(this.name, c3547c.name) && AbstractC22676k.m65745e(this.thumbnailUrl, c3547c.thumbnailUrl) && AbstractC22676k.m65745e(this.category, c3547c.category) && this.hasData == c3547c.hasData;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasData) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.name), 31, this.thumbnailUrl), 31, this.category);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.name;
        String str3 = this.thumbnailUrl;
        String str4 = this.category;
        boolean z4 = this.hasData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DataWidgetImage(imageUrl=", str, ", name=", str2, ", thumbnailUrl=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", category=", str4, ", hasData=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeString(this.thumbnailUrl);
        dest.writeString(this.category);
        dest.writeInt(this.hasData ? 1 : 0);
    }
}
