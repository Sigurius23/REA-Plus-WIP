package com.whoop.navigation;

import com.whoop.navigation.models.ChatHeaderMetadata;
import com.whoop.navigation.models.ChatHeaderMetadata$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%Jd\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "fingerprint", "sourceId", "sourceType", "source", "conversationSeedId", "", "dismissible", "Lcom/whoop/navigation/models/ChatHeaderMetadata;", "headerMetaData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/models/ChatHeaderMetadata;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/models/ChatHeaderMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/whoop/navigation/models/ChatHeaderMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/models/ChatHeaderMetadata;)Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFingerprint", "getSourceId", "getSourceType", "getSource", "getConversationSeedId", "Ljava/lang/Boolean;", "getDismissible", "Lcom/whoop/navigation/models/ChatHeaderMetadata;", "getHeaderMetaData", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DayZeroPersonalizationScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String conversationSeedId;
    private final Boolean dismissible;
    private final String fingerprint;
    private final ChatHeaderMetadata headerMetaData;
    private final String source;
    private final String sourceId;
    private final String sourceType;

    /* JADX INFO: renamed from: com.whoop.navigation.DayZeroPersonalizationScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/DayZeroPersonalizationScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DayZeroPersonalizationScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DayZeroPersonalizationScreenModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (ChatHeaderMetadata) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DayZeroPersonalizationScreenModel copy$default(DayZeroPersonalizationScreenModel dayZeroPersonalizationScreenModel, String str, String str2, String str3, String str4, String str5, Boolean bool, ChatHeaderMetadata chatHeaderMetadata, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dayZeroPersonalizationScreenModel.fingerprint;
        }
        if ((i13 & 2) != 0) {
            str2 = dayZeroPersonalizationScreenModel.sourceId;
        }
        if ((i13 & 4) != 0) {
            str3 = dayZeroPersonalizationScreenModel.sourceType;
        }
        if ((i13 & 8) != 0) {
            str4 = dayZeroPersonalizationScreenModel.source;
        }
        if ((i13 & 16) != 0) {
            str5 = dayZeroPersonalizationScreenModel.conversationSeedId;
        }
        if ((i13 & 32) != 0) {
            bool = dayZeroPersonalizationScreenModel.dismissible;
        }
        if ((i13 & 64) != 0) {
            chatHeaderMetadata = dayZeroPersonalizationScreenModel.headerMetaData;
        }
        Boolean bool2 = bool;
        ChatHeaderMetadata chatHeaderMetadata2 = chatHeaderMetadata;
        String str6 = str5;
        String str7 = str3;
        return dayZeroPersonalizationScreenModel.copy(str, str2, str7, str4, str6, bool2, chatHeaderMetadata2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(DayZeroPersonalizationScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.fingerprint != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.fingerprint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sourceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.sourceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sourceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.sourceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.conversationSeedId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.conversationSeedId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.dismissible != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.dismissible);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.headerMetaData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, ChatHeaderMetadata$$serializer.INSTANCE, self.headerMetaData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ChatHeaderMetadata getHeaderMetaData() {
        return this.headerMetaData;
    }

    public final DayZeroPersonalizationScreenModel copy(String fingerprint, String sourceId, String sourceType, String source, String conversationSeedId, Boolean dismissible, ChatHeaderMetadata headerMetaData) {
        return new DayZeroPersonalizationScreenModel(fingerprint, sourceId, sourceType, source, conversationSeedId, dismissible, headerMetaData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DayZeroPersonalizationScreenModel)) {
            return false;
        }
        DayZeroPersonalizationScreenModel dayZeroPersonalizationScreenModel = (DayZeroPersonalizationScreenModel) other;
        return AbstractC22676k.m65745e(this.fingerprint, dayZeroPersonalizationScreenModel.fingerprint) && AbstractC22676k.m65745e(this.sourceId, dayZeroPersonalizationScreenModel.sourceId) && AbstractC22676k.m65745e(this.sourceType, dayZeroPersonalizationScreenModel.sourceType) && AbstractC22676k.m65745e(this.source, dayZeroPersonalizationScreenModel.source) && AbstractC22676k.m65745e(this.conversationSeedId, dayZeroPersonalizationScreenModel.conversationSeedId) && AbstractC22676k.m65745e(this.dismissible, dayZeroPersonalizationScreenModel.dismissible) && AbstractC22676k.m65745e(this.headerMetaData, dayZeroPersonalizationScreenModel.headerMetaData);
    }

    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    public final Boolean getDismissible() {
        return this.dismissible;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final ChatHeaderMetadata getHeaderMetaData() {
        return this.headerMetaData;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        String str = this.fingerprint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.conversationSeedId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.dismissible;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatHeaderMetadata chatHeaderMetadata = this.headerMetaData;
        return iHashCode6 + (chatHeaderMetadata != null ? chatHeaderMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.sourceId;
        String str3 = this.sourceType;
        String str4 = this.source;
        String str5 = this.conversationSeedId;
        Boolean bool = this.dismissible;
        ChatHeaderMetadata chatHeaderMetadata = this.headerMetaData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DayZeroPersonalizationScreenModel(fingerprint=", str, ", sourceId=", str2, ", sourceType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", source=", str4, ", conversationSeedId=");
        AbstractC36095b.m114692t(bool, str5, ", dismissible=", ", headerMetaData=", sbM32001t);
        sbM32001t.append(chatHeaderMetadata);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ DayZeroPersonalizationScreenModel(int i13, String str, String str2, String str3, String str4, String str5, Boolean bool, ChatHeaderMetadata chatHeaderMetadata, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.fingerprint = null;
        } else {
            this.fingerprint = str;
        }
        if ((i13 & 2) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str2;
        }
        if ((i13 & 4) == 0) {
            this.sourceType = null;
        } else {
            this.sourceType = str3;
        }
        if ((i13 & 8) == 0) {
            this.source = null;
        } else {
            this.source = str4;
        }
        if ((i13 & 16) == 0) {
            this.conversationSeedId = null;
        } else {
            this.conversationSeedId = str5;
        }
        if ((i13 & 32) == 0) {
            this.dismissible = null;
        } else {
            this.dismissible = bool;
        }
        if ((i13 & 64) == 0) {
            this.headerMetaData = null;
        } else {
            this.headerMetaData = chatHeaderMetadata;
        }
    }

    public DayZeroPersonalizationScreenModel(String str, String str2, String str3, String str4, String str5, Boolean bool, ChatHeaderMetadata chatHeaderMetadata) {
        this.fingerprint = str;
        this.sourceId = str2;
        this.sourceType = str3;
        this.source = str4;
        this.conversationSeedId = str5;
        this.dismissible = bool;
        this.headerMetaData = chatHeaderMetadata;
    }

    public /* synthetic */ DayZeroPersonalizationScreenModel(String str, String str2, String str3, String str4, String str5, Boolean bool, ChatHeaderMetadata chatHeaderMetadata, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : chatHeaderMetadata);
    }
}
