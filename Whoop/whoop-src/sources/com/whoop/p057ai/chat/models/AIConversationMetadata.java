package com.whoop.p057ai.chat.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJj\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u001d¨\u0006<"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIConversationMetadata;", "", "", "fingerprint", "title", "sourceType", "sourceId", "", "seenAt", "turnStatus", "icon", "scrollToTurnId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/AIConversationMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/models/AIConversationMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFingerprint", "getTitle", "getSourceType", "getSourceId", "Ljava/lang/Long;", "getSeenAt", "getTurnStatus", "getIcon", "getScrollToTurnId", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AIConversationMetadata {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fingerprint;
    private final String icon;
    private final String scrollToTurnId;
    private final Long seenAt;
    private final String sourceId;
    private final String sourceType;
    private final String title;
    private final String turnStatus;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.AIConversationMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIConversationMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/AIConversationMetadata;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AIConversationMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AIConversationMetadata(int i13, String str, String str2, String str3, String str4, Long l7, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AIConversationMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.fingerprint = str;
        this.title = str2;
        this.sourceType = str3;
        if ((i13 & 8) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str4;
        }
        if ((i13 & 16) == 0) {
            this.seenAt = null;
        } else {
            this.seenAt = l7;
        }
        if ((i13 & 32) == 0) {
            this.turnStatus = null;
        } else {
            this.turnStatus = str5;
        }
        if ((i13 & 64) == 0) {
            this.icon = null;
        } else {
            this.icon = str6;
        }
        if ((i13 & 128) == 0) {
            this.scrollToTurnId = null;
        } else {
            this.scrollToTurnId = str7;
        }
    }

    public static /* synthetic */ AIConversationMetadata copy$default(AIConversationMetadata aIConversationMetadata, String str, String str2, String str3, String str4, Long l7, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aIConversationMetadata.fingerprint;
        }
        if ((i13 & 2) != 0) {
            str2 = aIConversationMetadata.title;
        }
        if ((i13 & 4) != 0) {
            str3 = aIConversationMetadata.sourceType;
        }
        if ((i13 & 8) != 0) {
            str4 = aIConversationMetadata.sourceId;
        }
        if ((i13 & 16) != 0) {
            l7 = aIConversationMetadata.seenAt;
        }
        if ((i13 & 32) != 0) {
            str5 = aIConversationMetadata.turnStatus;
        }
        if ((i13 & 64) != 0) {
            str6 = aIConversationMetadata.icon;
        }
        if ((i13 & 128) != 0) {
            str7 = aIConversationMetadata.scrollToTurnId;
        }
        String str8 = str6;
        String str9 = str7;
        Long l12 = l7;
        String str10 = str5;
        return aIConversationMetadata.copy(str, str2, str3, str4, l12, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$bot_release(AIConversationMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.fingerprint);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.sourceType);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sourceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.sourceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.seenAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.seenAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.turnStatus != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.turnStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.scrollToTurnId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.scrollToTurnId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSeenAt() {
        return this.seenAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTurnStatus() {
        return this.turnStatus;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScrollToTurnId() {
        return this.scrollToTurnId;
    }

    public final AIConversationMetadata copy(String fingerprint, String title, String sourceType, String sourceId, Long seenAt, String turnStatus, String icon, String scrollToTurnId) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        return new AIConversationMetadata(fingerprint, title, sourceType, sourceId, seenAt, turnStatus, icon, scrollToTurnId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIConversationMetadata)) {
            return false;
        }
        AIConversationMetadata aIConversationMetadata = (AIConversationMetadata) other;
        return AbstractC22676k.m65745e(this.fingerprint, aIConversationMetadata.fingerprint) && AbstractC22676k.m65745e(this.title, aIConversationMetadata.title) && AbstractC22676k.m65745e(this.sourceType, aIConversationMetadata.sourceType) && AbstractC22676k.m65745e(this.sourceId, aIConversationMetadata.sourceId) && AbstractC22676k.m65745e(this.seenAt, aIConversationMetadata.seenAt) && AbstractC22676k.m65745e(this.turnStatus, aIConversationMetadata.turnStatus) && AbstractC22676k.m65745e(this.icon, aIConversationMetadata.icon) && AbstractC22676k.m65745e(this.scrollToTurnId, aIConversationMetadata.scrollToTurnId);
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getScrollToTurnId() {
        return this.scrollToTurnId;
    }

    public final Long getSeenAt() {
        return this.seenAt;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTurnStatus() {
        return this.turnStatus;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.fingerprint.hashCode() * 31, 31, this.title), 31, this.sourceType);
        String str = this.sourceId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.seenAt;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.turnStatus;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scrollToTurnId;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.title;
        String str3 = this.sourceType;
        String str4 = this.sourceId;
        Long l7 = this.seenAt;
        String str5 = this.turnStatus;
        String str6 = this.icon;
        String str7 = this.scrollToTurnId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AIConversationMetadata(fingerprint=", str, ", title=", str2, ", sourceType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", sourceId=", str4, ", seenAt=");
        sbM32001t.append(l7);
        sbM32001t.append(", turnStatus=");
        sbM32001t.append(str5);
        sbM32001t.append(", icon=");
        return AbstractC11266d.m30464r(sbM32001t, str6, ", scrollToTurnId=", str7, ")");
    }

    public AIConversationMetadata(String fingerprint, String title, String sourceType, String str, Long l7, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        this.fingerprint = fingerprint;
        this.title = title;
        this.sourceType = sourceType;
        this.sourceId = str;
        this.seenAt = l7;
        this.turnStatus = str2;
        this.icon = str3;
        this.scrollToTurnId = str4;
    }

    public /* synthetic */ AIConversationMetadata(String str, String str2, String str3, String str4, Long l7, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : l7, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7);
    }
}
