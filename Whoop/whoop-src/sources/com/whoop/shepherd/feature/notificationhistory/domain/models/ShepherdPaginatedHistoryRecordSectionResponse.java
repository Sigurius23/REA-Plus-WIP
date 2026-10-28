package com.whoop.shepherd.feature.notificationhistory.domain.models;

import c13.AbstractC3855a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;", "", "", "title", "id", "", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdHistoryRecordResponse;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getId", "Ljava/util/List;", "getItems", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdPaginatedHistoryRecordSectionResponse {

    @SerializedName("id")
    private final String id;

    @SerializedName("items")
    private final List<ShepherdHistoryRecordResponse> items;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(26))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryRecordSectionResponse;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdPaginatedHistoryRecordSectionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdPaginatedHistoryRecordSectionResponse(int i13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ShepherdPaginatedHistoryRecordSectionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.id = str2;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ShepherdHistoryRecordResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShepherdPaginatedHistoryRecordSectionResponse copy$default(ShepherdPaginatedHistoryRecordSectionResponse shepherdPaginatedHistoryRecordSectionResponse, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdPaginatedHistoryRecordSectionResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = shepherdPaginatedHistoryRecordSectionResponse.id;
        }
        if ((i13 & 4) != 0) {
            list = shepherdPaginatedHistoryRecordSectionResponse.items;
        }
        return shepherdPaginatedHistoryRecordSectionResponse.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdPaginatedHistoryRecordSectionResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<ShepherdHistoryRecordResponse> component3() {
        return this.items;
    }

    public final ShepherdPaginatedHistoryRecordSectionResponse copy(String title, String id4, List<ShepherdHistoryRecordResponse> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new ShepherdPaginatedHistoryRecordSectionResponse(title, id4, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdPaginatedHistoryRecordSectionResponse)) {
            return false;
        }
        ShepherdPaginatedHistoryRecordSectionResponse shepherdPaginatedHistoryRecordSectionResponse = (ShepherdPaginatedHistoryRecordSectionResponse) other;
        return AbstractC22676k.m65745e(this.title, shepherdPaginatedHistoryRecordSectionResponse.title) && AbstractC22676k.m65745e(this.id, shepherdPaginatedHistoryRecordSectionResponse.id) && AbstractC22676k.m65745e(this.items, shepherdPaginatedHistoryRecordSectionResponse.items);
    }

    public final String getId() {
        return this.id;
    }

    public final List<ShepherdHistoryRecordResponse> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.id);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.id;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("ShepherdPaginatedHistoryRecordSectionResponse(title=", str, ", id=", str2, ", items="), this.items, ")");
    }

    public ShepherdPaginatedHistoryRecordSectionResponse(String title, String id4, List<ShepherdHistoryRecordResponse> items) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.id = id4;
        this.items = items;
    }
}
