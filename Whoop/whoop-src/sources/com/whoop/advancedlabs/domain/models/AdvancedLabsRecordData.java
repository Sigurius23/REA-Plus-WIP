package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\\\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "icon", "value", "units", "dateTime", "Lcom/whoop/design/models/items/TagModel;", "tag", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/TagModel;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "getValue", "getUnits", "getDateTime", "Lcom/whoop/design/models/items/TagModel;", "getTag", "getImageUrl", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsRecordData implements DesignSystemModel {
    private final String dateTime;
    private final String icon;
    private final String id;
    private final String imageUrl;
    private final TagModel tag;
    private final String units;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TagModel.$stable;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsRecordData;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsRecordData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvancedLabsRecordData(int i13, String str, String str2, String str3, String str4, String str5, TagModel tagModel, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, AdvancedLabsRecordData$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.icon = str2;
        this.value = str3;
        this.units = str4;
        this.dateTime = str5;
        this.tag = tagModel;
        this.imageUrl = str6;
    }

    public static /* synthetic */ AdvancedLabsRecordData copy$default(AdvancedLabsRecordData advancedLabsRecordData, String str, String str2, String str3, String str4, String str5, TagModel tagModel, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = advancedLabsRecordData.id;
        }
        if ((i13 & 2) != 0) {
            str2 = advancedLabsRecordData.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = advancedLabsRecordData.value;
        }
        if ((i13 & 8) != 0) {
            str4 = advancedLabsRecordData.units;
        }
        if ((i13 & 16) != 0) {
            str5 = advancedLabsRecordData.dateTime;
        }
        if ((i13 & 32) != 0) {
            tagModel = advancedLabsRecordData.tag;
        }
        if ((i13 & 64) != 0) {
            str6 = advancedLabsRecordData.imageUrl;
        }
        TagModel tagModel2 = tagModel;
        String str7 = str6;
        String str8 = str5;
        String str9 = str3;
        return advancedLabsRecordData.copy(str, str2, str9, str4, str8, tagModel2, str7);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AdvancedLabsRecordData self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeStringElement(serialDesc, 2, self.value);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.units);
        output.encodeStringElement(serialDesc, 4, self.dateTime);
        output.encodeNullableSerializableElement(serialDesc, 5, TagModel$$serializer.INSTANCE, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.imageUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final AdvancedLabsRecordData copy(String id4, String icon, String value, String units, String dateTime, TagModel tag, String imageUrl) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(dateTime, "dateTime");
        return new AdvancedLabsRecordData(id4, icon, value, units, dateTime, tag, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsRecordData)) {
            return false;
        }
        AdvancedLabsRecordData advancedLabsRecordData = (AdvancedLabsRecordData) other;
        return AbstractC22676k.m65745e(this.id, advancedLabsRecordData.id) && AbstractC22676k.m65745e(this.icon, advancedLabsRecordData.icon) && AbstractC22676k.m65745e(this.value, advancedLabsRecordData.value) && AbstractC22676k.m65745e(this.units, advancedLabsRecordData.units) && AbstractC22676k.m65745e(this.dateTime, advancedLabsRecordData.dateTime) && AbstractC22676k.m65745e(this.tag, advancedLabsRecordData.tag) && AbstractC22676k.m65745e(this.imageUrl, advancedLabsRecordData.imageUrl);
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getUnits() {
        return this.units;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.icon), 31, this.value);
        String str = this.units;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.dateTime);
        TagModel tagModel = this.tag;
        int iHashCode = (iM30450d2 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        String str2 = this.imageUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        String str3 = this.value;
        String str4 = this.units;
        String str5 = this.dateTime;
        TagModel tagModel = this.tag;
        String str6 = this.imageUrl;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AdvancedLabsRecordData(id=", str, ", icon=", str2, ", value=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", units=", str4, ", dateTime=");
        sbM32001t.append(str5);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", imageUrl=");
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public AdvancedLabsRecordData(String id4, String icon, String value, String str, String dateTime, TagModel tagModel, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(dateTime, "dateTime");
        this.id = id4;
        this.icon = icon;
        this.value = value;
        this.units = str;
        this.dateTime = dateTime;
        this.tag = tagModel;
        this.imageUrl = str2;
    }
}
