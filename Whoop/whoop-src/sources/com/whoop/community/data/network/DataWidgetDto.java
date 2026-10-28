package com.whoop.community.data.network;

import android.os.Parcel;
import android.os.Parcelable;
import bo2.C3509a;
import bq0.C3546b;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xp0.AbstractC38505d0;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J>\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010 J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010 R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010 R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b>\u00108\u001a\u0004\b=\u0010+¨\u0006B"}, m65681d2 = {"Lcom/whoop/community/data/network/DataWidgetDto;", "Landroid/os/Parcelable;", "", "widgetType", "", MapboxMap.QFE_OFFSET, "totalCount", "", "Lcom/whoop/community/data/network/DataWidgetImageDto;", "dataWidgetImages", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "categoryHeader", "localizeCategoryHeaders", "(Ljava/lang/String;)I", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_release", "(Lcom/whoop/community/data/network/DataWidgetDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lbq0/b;", "toDataWidget", "()Lbq0/b;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;IILjava/util/List;)Lcom/whoop/community/data/network/DataWidgetDto;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWidgetType", "getWidgetType$annotations", "()V", "I", "getOffset", "getTotalCount", "Ljava/util/List;", "getDataWidgetImages", "getDataWidgetImages$annotations", "Companion", "$serializer", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataWidgetDto implements Parcelable {

    @SerializedName("records")
    private final List<DataWidgetImageDto> dataWidgetImages;

    @SerializedName(MapboxMap.QFE_OFFSET)
    private final int offset;

    @SerializedName("total_count")
    private final int totalCount;

    @SerializedName("widget_category")
    private final String widgetType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DataWidgetDto> CREATOR = new C6319b();
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3509a(2))};

    /* JADX INFO: renamed from: com.whoop.community.data.network.DataWidgetDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/data/network/DataWidgetDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/community/data/network/DataWidgetDto;", "serializer", "()Lwc3/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataWidgetDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.data.network.DataWidgetDto$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6319b implements Parcelable.Creator<DataWidgetDto> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DataWidgetDto createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            String string = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iM79498b = 0;
            while (iM79498b != i15) {
                iM79498b = AbstractC26725a.m79498b(DataWidgetImageDto.CREATOR, parcel, arrayList, iM79498b, 1);
            }
            return new DataWidgetDto(string, i13, i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DataWidgetDto[] newArray(int i13) {
            return new DataWidgetDto[i13];
        }
    }

    public /* synthetic */ DataWidgetDto(int i13, String str, int i14, int i15, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, DataWidgetDto$$serializer.INSTANCE.getDescriptor());
        }
        this.widgetType = str;
        this.offset = i14;
        this.totalCount = i15;
        this.dataWidgetImages = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(DataWidgetImageDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataWidgetDto copy$default(DataWidgetDto dataWidgetDto, String str, int i13, int i14, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = dataWidgetDto.widgetType;
        }
        if ((i15 & 2) != 0) {
            i13 = dataWidgetDto.offset;
        }
        if ((i15 & 4) != 0) {
            i14 = dataWidgetDto.totalCount;
        }
        if ((i15 & 8) != 0) {
            list = dataWidgetDto.dataWidgetImages;
        }
        return dataWidgetDto.copy(str, i13, i14, list);
    }

    @InterfaceC37143h("records")
    public static /* synthetic */ void getDataWidgetImages$annotations() {
    }

    @InterfaceC37143h("widget_category")
    public static /* synthetic */ void getWidgetType$annotations() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final int localizeCategoryHeaders(String categoryHeader) {
        Locale locale = Locale.US;
        String strM95641q = AbstractC31061c.m95641q(locale, "US", categoryHeader, locale, "toLowerCase(...)");
        switch (strM95641q.hashCode()) {
            case -891993739:
                if (strM95641q.equals("strain")) {
                    return AbstractC38505d0.f165566B;
                }
                break;
            case -799113323:
                if (strM95641q.equals("recovery")) {
                    return AbstractC38505d0.f165734z;
                }
                break;
            case 109522647:
                if (strM95641q.equals(UserState.States.SLEEP)) {
                    return AbstractC38505d0.f165563A;
                }
                break;
            case 530115961:
                if (strM95641q.equals("overview")) {
                    return AbstractC38505d0.f165731y;
                }
                break;
        }
        return AbstractC38505d0.f165725w;
    }

    public static final /* synthetic */ void write$Self$community_release(DataWidgetDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.widgetType);
        output.encodeIntElement(serialDesc, 1, self.offset);
        output.encodeIntElement(serialDesc, 2, self.totalCount);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.dataWidgetImages);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidgetType() {
        return this.widgetType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<DataWidgetImageDto> component4() {
        return this.dataWidgetImages;
    }

    public final DataWidgetDto copy(String widgetType, int offset, int totalCount, List<DataWidgetImageDto> dataWidgetImages) {
        AbstractC22676k.m65750j(widgetType, "widgetType");
        AbstractC22676k.m65750j(dataWidgetImages, "dataWidgetImages");
        return new DataWidgetDto(widgetType, offset, totalCount, dataWidgetImages);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataWidgetDto)) {
            return false;
        }
        DataWidgetDto dataWidgetDto = (DataWidgetDto) other;
        return AbstractC22676k.m65745e(this.widgetType, dataWidgetDto.widgetType) && this.offset == dataWidgetDto.offset && this.totalCount == dataWidgetDto.totalCount && AbstractC22676k.m65745e(this.dataWidgetImages, dataWidgetDto.dataWidgetImages);
    }

    public final List<DataWidgetImageDto> getDataWidgetImages() {
        return this.dataWidgetImages;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final String getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        return this.dataWidgetImages.hashCode() + AbstractC11266d.m30448b(this.totalCount, AbstractC11266d.m30448b(this.offset, this.widgetType.hashCode() * 31, 31), 31);
    }

    public final C3546b toDataWidget() {
        int iLocalizeCategoryHeaders = localizeCategoryHeaders(this.widgetType);
        int i13 = this.offset;
        int i14 = this.totalCount;
        List<DataWidgetImageDto> list = this.dataWidgetImages;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DataWidgetImageDto) it.next()).toDataImageWidget());
        }
        return new C3546b(iLocalizeCategoryHeaders, i13, i14, AbstractC25265s.m74093D1(arrayList));
    }

    public String toString() {
        String str = this.widgetType;
        int i13 = this.offset;
        int i14 = this.totalCount;
        List<DataWidgetImageDto> list = this.dataWidgetImages;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "DataWidgetDto(widgetType=", str, ", offset=", ", totalCount=");
        sbM30467u.append(i14);
        sbM30467u.append(", dataWidgetImages=");
        sbM30467u.append(list);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.widgetType);
        dest.writeInt(this.offset);
        dest.writeInt(this.totalCount);
        Iterator itM30863o = AbstractC11478a.m30863o(this.dataWidgetImages, dest);
        while (itM30863o.hasNext()) {
            ((DataWidgetImageDto) itM30863o.next()).writeToParcel(dest, flags);
        }
    }

    public DataWidgetDto(String widgetType, int i13, int i14, List<DataWidgetImageDto> dataWidgetImages) {
        AbstractC22676k.m65750j(widgetType, "widgetType");
        AbstractC22676k.m65750j(dataWidgetImages, "dataWidgetImages");
        this.widgetType = widgetType;
        this.offset = i13;
        this.totalCount = i14;
        this.dataWidgetImages = dataWidgetImages;
    }
}
