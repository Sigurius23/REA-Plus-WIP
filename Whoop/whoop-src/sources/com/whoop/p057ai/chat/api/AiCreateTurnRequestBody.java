package com.whoop.p057ai.chat.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b\f\u0010'¨\u0006="}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;", "", "", "content", "role", "", "userTimestamp", "", "fileIds", "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "trackingCapabilities", "", "isSuggestion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Z)Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent", "getRole", "Ljava/lang/Long;", "getUserTimestamp", "Ljava/util/List;", "getFileIds", "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "getTrackingCapabilities", "Z", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiCreateTurnRequestBody {
    private final String content;
    private final List<String> fileIds;
    private final boolean isSuggestion;
    private final String role;
    private final AiTrackingCapabilities trackingCapabilities;
    private final Long userTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(25)), null, null};

    /* JADX INFO: renamed from: com.whoop.ai.chat.api.AiCreateTurnRequestBody$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiCreateTurnRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AiCreateTurnRequestBody(int i13, String str, String str2, Long l7, List list, AiTrackingCapabilities aiTrackingCapabilities, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AiCreateTurnRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.content = str;
        this.role = str2;
        this.userTimestamp = l7;
        if ((i13 & 8) == 0) {
            this.fileIds = null;
        } else {
            this.fileIds = list;
        }
        if ((i13 & 16) == 0) {
            this.trackingCapabilities = new AiTrackingCapabilities(false, false, false, 7, (DefaultConstructorMarker) null);
        } else {
            this.trackingCapabilities = aiTrackingCapabilities;
        }
        if ((i13 & 32) == 0) {
            this.isSuggestion = false;
        } else {
            this.isSuggestion = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiCreateTurnRequestBody copy$default(AiCreateTurnRequestBody aiCreateTurnRequestBody, String str, String str2, Long l7, List list, AiTrackingCapabilities aiTrackingCapabilities, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiCreateTurnRequestBody.content;
        }
        if ((i13 & 2) != 0) {
            str2 = aiCreateTurnRequestBody.role;
        }
        if ((i13 & 4) != 0) {
            l7 = aiCreateTurnRequestBody.userTimestamp;
        }
        if ((i13 & 8) != 0) {
            list = aiCreateTurnRequestBody.fileIds;
        }
        if ((i13 & 16) != 0) {
            aiTrackingCapabilities = aiCreateTurnRequestBody.trackingCapabilities;
        }
        if ((i13 & 32) != 0) {
            z4 = aiCreateTurnRequestBody.isSuggestion;
        }
        AiTrackingCapabilities aiTrackingCapabilities2 = aiTrackingCapabilities;
        boolean z13 = z4;
        return aiCreateTurnRequestBody.copy(str, str2, l7, list, aiTrackingCapabilities2, z13);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    public static final /* synthetic */ void write$Self$bot_release(AiCreateTurnRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.content);
        output.encodeStringElement(serialDesc, 1, self.role);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.userTimestamp);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.fileIds != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.fileIds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4)) {
            output.encodeSerializableElement(serialDesc, 4, AiTrackingCapabilities$$serializer.INSTANCE, self.trackingCapabilities);
        } else {
            if (!AbstractC22676k.m65745e(self.trackingCapabilities, new AiTrackingCapabilities(false, false, false, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 4, AiTrackingCapabilities$$serializer.INSTANCE, self.trackingCapabilities);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.isSuggestion) {
            output.encodeBooleanElement(serialDesc, 5, self.isSuggestion);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public final List<String> component4() {
        return this.fileIds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AiTrackingCapabilities getTrackingCapabilities() {
        return this.trackingCapabilities;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSuggestion() {
        return this.isSuggestion;
    }

    public final AiCreateTurnRequestBody copy(String content, String role, Long userTimestamp, List<String> fileIds, AiTrackingCapabilities trackingCapabilities, boolean isSuggestion) {
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(trackingCapabilities, "trackingCapabilities");
        return new AiCreateTurnRequestBody(content, role, userTimestamp, fileIds, trackingCapabilities, isSuggestion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiCreateTurnRequestBody)) {
            return false;
        }
        AiCreateTurnRequestBody aiCreateTurnRequestBody = (AiCreateTurnRequestBody) other;
        return AbstractC22676k.m65745e(this.content, aiCreateTurnRequestBody.content) && AbstractC22676k.m65745e(this.role, aiCreateTurnRequestBody.role) && AbstractC22676k.m65745e(this.userTimestamp, aiCreateTurnRequestBody.userTimestamp) && AbstractC22676k.m65745e(this.fileIds, aiCreateTurnRequestBody.fileIds) && AbstractC22676k.m65745e(this.trackingCapabilities, aiCreateTurnRequestBody.trackingCapabilities) && this.isSuggestion == aiCreateTurnRequestBody.isSuggestion;
    }

    public final String getContent() {
        return this.content;
    }

    public final List<String> getFileIds() {
        return this.fileIds;
    }

    public final String getRole() {
        return this.role;
    }

    public final AiTrackingCapabilities getTrackingCapabilities() {
        return this.trackingCapabilities;
    }

    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public int hashCode() {
        String str = this.content;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.role);
        Long l7 = this.userTimestamp;
        int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        List<String> list = this.fileIds;
        return Boolean.hashCode(this.isSuggestion) + ((this.trackingCapabilities.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final boolean isSuggestion() {
        return this.isSuggestion;
    }

    public String toString() {
        String str = this.content;
        String str2 = this.role;
        Long l7 = this.userTimestamp;
        List<String> list = this.fileIds;
        AiTrackingCapabilities aiTrackingCapabilities = this.trackingCapabilities;
        boolean z4 = this.isSuggestion;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiCreateTurnRequestBody(content=", str, ", role=", str2, ", userTimestamp=");
        sbM32001t.append(l7);
        sbM32001t.append(", fileIds=");
        sbM32001t.append(list);
        sbM32001t.append(", trackingCapabilities=");
        sbM32001t.append(aiTrackingCapabilities);
        sbM32001t.append(", isSuggestion=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AiCreateTurnRequestBody(String str, String role, Long l7, List<String> list, AiTrackingCapabilities trackingCapabilities, boolean z4) {
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(trackingCapabilities, "trackingCapabilities");
        this.content = str;
        this.role = role;
        this.userTimestamp = l7;
        this.fileIds = list;
        this.trackingCapabilities = trackingCapabilities;
        this.isSuggestion = z4;
    }

    public /* synthetic */ AiCreateTurnRequestBody(String str, String str2, Long l7, List list, AiTrackingCapabilities aiTrackingCapabilities, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l7, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? new AiTrackingCapabilities(false, false, false, 7, (DefaultConstructorMarker) null) : aiTrackingCapabilities, (i13 & 32) != 0 ? false : z4);
    }
}
