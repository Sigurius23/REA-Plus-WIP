package com.whoop.service.network.model;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx2.C22038b;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J@\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010 R,\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010 ¨\u00066"}, m65681d2 = {"Lcom/whoop/service/network/model/DefaultImages;", "Landroid/os/Parcelable;", "", "id", "", "", "banners", "avatars", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/service/network/model/DefaultImages;Lzc3/c;Lyc3/g;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/util/List;", "component3", "copy", "(ILjava/util/List;Ljava/util/List;)Lcom/whoop/service/network/model/DefaultImages;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getBanners", "getBanners$annotations", "()V", "getAvatars", "getAvatars$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DefaultImages implements Parcelable {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("avatar_urls")
    private final List<List<String>> avatars;

    @SerializedName("banner_urls")
    private final List<String> banners;
    private final int id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DefaultImages> CREATOR = new Creator();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/service/network/model/DefaultImages$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/service/network/model/DefaultImages;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DefaultImages$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<DefaultImages> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultImages createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            int i13 = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(parcel.createStringArrayList());
            }
            return new DefaultImages(i13, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefaultImages[] newArray(int i13) {
            return new DefaultImages[i13];
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C22038b(14)), AbstractC30060g.m92087G(enumC23463i, new C22038b(15))};
    }

    public /* synthetic */ DefaultImages(int i13, int i14, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i13 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 6, DefaultImages$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = 0;
        } else {
            this.id = i14;
        }
        this.banners = list;
        this.avatars = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(new ArrayListSerializer(StringSerializer.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultImages copy$default(DefaultImages defaultImages, int i13, List list, List list2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = defaultImages.id;
        }
        if ((i14 & 2) != 0) {
            list = defaultImages.banners;
        }
        if ((i14 & 4) != 0) {
            list2 = defaultImages.avatars;
        }
        return defaultImages.copy(i13, list, list2);
    }

    @InterfaceC37143h("avatar_urls")
    public static /* synthetic */ void getAvatars$annotations() {
    }

    @InterfaceC37143h("banner_urls")
    public static /* synthetic */ void getBanners$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(DefaultImages self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != 0) {
            output.encodeIntElement(serialDesc, 0, self.id);
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.banners);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.avatars);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<String> component2() {
        return this.banners;
    }

    public final List<List<String>> component3() {
        return this.avatars;
    }

    public final DefaultImages copy(int id4, List<String> banners, List<? extends List<String>> avatars) {
        AbstractC22676k.m65750j(banners, "banners");
        AbstractC22676k.m65750j(avatars, "avatars");
        return new DefaultImages(id4, banners, avatars);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultImages)) {
            return false;
        }
        DefaultImages defaultImages = (DefaultImages) other;
        return this.id == defaultImages.id && AbstractC22676k.m65745e(this.banners, defaultImages.banners) && AbstractC22676k.m65745e(this.avatars, defaultImages.avatars);
    }

    public final List<List<String>> getAvatars() {
        return this.avatars;
    }

    public final List<String> getBanners() {
        return this.banners;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.avatars.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.id) * 31, 31, this.banners);
    }

    public String toString() {
        int i13 = this.id;
        List<String> list = this.banners;
        List<List<String>> list2 = this.avatars;
        StringBuilder sb4 = new StringBuilder("DefaultImages(id=");
        sb4.append(i13);
        sb4.append(", banners=");
        sb4.append(list);
        sb4.append(", avatars=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.id);
        dest.writeStringList(this.banners);
        Iterator itM30863o = AbstractC11478a.m30863o(this.avatars, dest);
        while (itM30863o.hasNext()) {
            dest.writeStringList((List) itM30863o.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultImages(int i13, List<String> banners, List<? extends List<String>> avatars) {
        AbstractC22676k.m65750j(banners, "banners");
        AbstractC22676k.m65750j(avatars, "avatars");
        this.id = i13;
        this.banners = banners;
        this.avatars = avatars;
    }

    public /* synthetic */ DefaultImages(int i13, List list, List list2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, list, list2);
    }
}
