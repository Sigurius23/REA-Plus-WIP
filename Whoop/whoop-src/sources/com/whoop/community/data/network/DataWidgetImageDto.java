package com.whoop.community.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import bq0.C3547c;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010)JB\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u001a\u00100\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010$R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010$R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010)¨\u0006<"}, m65681d2 = {"Lcom/whoop/community/data/network/DataWidgetImageDto;", "Landroid/os/Parcelable;", "", "name", "category", QueryParams.URL, "thumbnailUrl", "", "hasData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_release", "(Lcom/whoop/community/data/network/DataWidgetImageDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lbq0/c;", "toDataImageWidget", "()Lbq0/c;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/community/data/network/DataWidgetImageDto;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getCategory", "getUrl", "getThumbnailUrl", "Z", "getHasData", "Companion", "$serializer", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataWidgetImageDto implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("category")
    private final String category;

    @SerializedName("has_data")
    private final boolean hasData;

    @SerializedName("name")
    private final String name;

    @SerializedName("thumbnail_url")
    private final String thumbnailUrl;

    @SerializedName(QueryParams.URL)
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DataWidgetImageDto> CREATOR = new C6321b();

    /* JADX INFO: renamed from: com.whoop.community.data.network.DataWidgetImageDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/data/network/DataWidgetImageDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/community/data/network/DataWidgetImageDto;", "serializer", "()Lwc3/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataWidgetImageDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.data.network.DataWidgetImageDto$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6321b implements Parcelable.Creator<DataWidgetImageDto> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DataWidgetImageDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new DataWidgetImageDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DataWidgetImageDto[] newArray(int i13) {
            return new DataWidgetImageDto[i13];
        }
    }

    public /* synthetic */ DataWidgetImageDto(int i13, String str, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, DataWidgetImageDto$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.category = str2;
        this.url = str3;
        this.thumbnailUrl = str4;
        this.hasData = z4;
    }

    public static /* synthetic */ DataWidgetImageDto copy$default(DataWidgetImageDto dataWidgetImageDto, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataWidgetImageDto.name;
        }
        if ((i13 & 2) != 0) {
            str2 = dataWidgetImageDto.category;
        }
        if ((i13 & 4) != 0) {
            str3 = dataWidgetImageDto.url;
        }
        if ((i13 & 8) != 0) {
            str4 = dataWidgetImageDto.thumbnailUrl;
        }
        if ((i13 & 16) != 0) {
            z4 = dataWidgetImageDto.hasData;
        }
        boolean z13 = z4;
        String str5 = str3;
        return dataWidgetImageDto.copy(str, str2, str5, str4, z13);
    }

    public static final /* synthetic */ void write$Self$community_release(DataWidgetImageDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.name);
        output.encodeStringElement(serialDesc, 1, self.category);
        output.encodeStringElement(serialDesc, 2, self.url);
        output.encodeStringElement(serialDesc, 3, self.thumbnailUrl);
        output.encodeBooleanElement(serialDesc, 4, self.hasData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    public final DataWidgetImageDto copy(String name, String category, String url, String thumbnailUrl, boolean hasData) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(thumbnailUrl, "thumbnailUrl");
        return new DataWidgetImageDto(name, category, url, thumbnailUrl, hasData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataWidgetImageDto)) {
            return false;
        }
        DataWidgetImageDto dataWidgetImageDto = (DataWidgetImageDto) other;
        return AbstractC22676k.m65745e(this.name, dataWidgetImageDto.name) && AbstractC22676k.m65745e(this.category, dataWidgetImageDto.category) && AbstractC22676k.m65745e(this.url, dataWidgetImageDto.url) && AbstractC22676k.m65745e(this.thumbnailUrl, dataWidgetImageDto.thumbnailUrl) && this.hasData == dataWidgetImageDto.hasData;
    }

    public final String getCategory() {
        return this.category;
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public final String getName() {
        return this.name;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasData) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.category), 31, this.url), 31, this.thumbnailUrl);
    }

    public final C3547c toDataImageWidget() {
        String str = this.category;
        return new C3547c(this.url, this.name, this.thumbnailUrl, str, this.hasData);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.category;
        String str3 = this.url;
        String str4 = this.thumbnailUrl;
        boolean z4 = this.hasData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DataWidgetImageDto(name=", str, ", category=", str2, ", url=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", thumbnailUrl=", str4, ", hasData=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.category);
        dest.writeString(this.url);
        dest.writeString(this.thumbnailUrl);
        dest.writeInt(this.hasData ? 1 : 0);
    }

    public DataWidgetImageDto(String name, String category, String url, String thumbnailUrl, boolean z4) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(thumbnailUrl, "thumbnailUrl");
        this.name = name;
        this.category = category;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.hasData = z4;
    }
}
