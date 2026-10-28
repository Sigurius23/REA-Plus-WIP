package com.whoop.bot.models.conversation;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b3\u00104\u001a\u0004\b\u0007\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "", "", "id", "content", "role", "", "isSuggestion", "", "fileIds", "", "userTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Long;)Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getContent", "getRole", "Z", "isSuggestion$annotations", "()V", "Ljava/util/List;", "getFileIds", "Ljava/lang/Long;", "getUserTimestamp", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatMessageRequestBody {
    private final String content;
    private final List<String> fileIds;
    private final String id;

    @SerializedName("is_suggestion")
    private final boolean isSuggestion;
    private final String role;
    private final Long userTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21769a(2)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatMessageRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AiChatMessageRequestBody(int i13, String str, String str2, String str3, boolean z4, List list, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AiChatMessageRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.content = str2;
        this.role = str3;
        this.isSuggestion = z4;
        if ((i13 & 16) == 0) {
            this.fileIds = C25271y.f99162w;
        } else {
            this.fileIds = list;
        }
        if ((i13 & 32) == 0) {
            this.userTimestamp = null;
        } else {
            this.userTimestamp = l7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatMessageRequestBody copy$default(AiChatMessageRequestBody aiChatMessageRequestBody, String str, String str2, String str3, boolean z4, List list, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatMessageRequestBody.id;
        }
        if ((i13 & 2) != 0) {
            str2 = aiChatMessageRequestBody.content;
        }
        if ((i13 & 4) != 0) {
            str3 = aiChatMessageRequestBody.role;
        }
        if ((i13 & 8) != 0) {
            z4 = aiChatMessageRequestBody.isSuggestion;
        }
        if ((i13 & 16) != 0) {
            list = aiChatMessageRequestBody.fileIds;
        }
        if ((i13 & 32) != 0) {
            l7 = aiChatMessageRequestBody.userTimestamp;
        }
        List list2 = list;
        Long l12 = l7;
        return aiChatMessageRequestBody.copy(str, str2, str3, z4, list2, l12);
    }

    @InterfaceC37143h("is_suggestion")
    public static /* synthetic */ void isSuggestion$annotations() {
    }

    public static final /* synthetic */ void write$Self$bot_release(AiChatMessageRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.content);
        output.encodeStringElement(serialDesc, 2, self.role);
        output.encodeBooleanElement(serialDesc, 3, self.isSuggestion);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.fileIds, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.fileIds);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.userTimestamp == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.userTimestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSuggestion() {
        return this.isSuggestion;
    }

    public final List<String> component5() {
        return this.fileIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public final AiChatMessageRequestBody copy(String id4, String content, String role, boolean isSuggestion, List<String> fileIds, Long userTimestamp) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(fileIds, "fileIds");
        return new AiChatMessageRequestBody(id4, content, role, isSuggestion, fileIds, userTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatMessageRequestBody)) {
            return false;
        }
        AiChatMessageRequestBody aiChatMessageRequestBody = (AiChatMessageRequestBody) other;
        return AbstractC22676k.m65745e(this.id, aiChatMessageRequestBody.id) && AbstractC22676k.m65745e(this.content, aiChatMessageRequestBody.content) && AbstractC22676k.m65745e(this.role, aiChatMessageRequestBody.role) && this.isSuggestion == aiChatMessageRequestBody.isSuggestion && AbstractC22676k.m65745e(this.fileIds, aiChatMessageRequestBody.fileIds) && AbstractC22676k.m65745e(this.userTimestamp, aiChatMessageRequestBody.userTimestamp);
    }

    public final String getContent() {
        return this.content;
    }

    public final List<String> getFileIds() {
        return this.fileIds;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRole() {
        return this.role;
    }

    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.content), 31, this.role), 31, this.isSuggestion), 31, this.fileIds);
        Long l7 = this.userTimestamp;
        return iM31983b + (l7 == null ? 0 : l7.hashCode());
    }

    public final boolean isSuggestion() {
        return this.isSuggestion;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.content;
        String str3 = this.role;
        boolean z4 = this.isSuggestion;
        List<String> list = this.fileIds;
        Long l7 = this.userTimestamp;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatMessageRequestBody(id=", str, ", content=", str2, ", role=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", isSuggestion=", z4, ", fileIds=");
        sbM32001t.append(list);
        sbM32001t.append(", userTimestamp=");
        sbM32001t.append(l7);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AiChatMessageRequestBody(String id4, String content, String role, boolean z4, List<String> fileIds, Long l7) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(fileIds, "fileIds");
        this.id = id4;
        this.content = content;
        this.role = role;
        this.isSuggestion = z4;
        this.fileIds = fileIds;
        this.userTimestamp = l7;
    }

    public /* synthetic */ AiChatMessageRequestBody(String str, String str2, String str3, boolean z4, List list, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z4, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? null : l7);
    }
}
