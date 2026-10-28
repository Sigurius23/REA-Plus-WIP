package com.whoop.bot.models.conversation;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PostApiRequest;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i63.C18181t;
import java.util.Map;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b)\u0010\u0018¨\u0006,"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/StopGeneratingRequest;", "Lcom/whoop/network/request/PostApiRequest;", "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "", "conversationId", "body", "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)V", "", "seen0", "path", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/StopGeneratingRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "copy", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)Lcom/whoop/bot/models/conversation/StopGeneratingRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversationId", "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;", "getBody", "getPath", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StopGeneratingRequest implements PostApiRequest<AiChatMessageRequestBody> {
    private final AiChatMessageRequestBody body;
    private final String conversationId;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/StopGeneratingRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/StopGeneratingRequest;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StopGeneratingRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StopGeneratingRequest(int i13, String str, AiChatMessageRequestBody aiChatMessageRequestBody, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, StopGeneratingRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.conversationId = str;
        this.body = aiChatMessageRequestBody;
        if ((i13 & 4) == 0) {
            this.path = AbstractC2875y.m8300m("ai-conversation-service/v1/conversation/", str, "/message/", getBody().getId(), "/stop");
        } else {
            this.path = str2;
        }
    }

    public static /* synthetic */ StopGeneratingRequest copy$default(StopGeneratingRequest stopGeneratingRequest, String str, AiChatMessageRequestBody aiChatMessageRequestBody, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = stopGeneratingRequest.conversationId;
        }
        if ((i13 & 2) != 0) {
            aiChatMessageRequestBody = stopGeneratingRequest.body;
        }
        return stopGeneratingRequest.copy(str, aiChatMessageRequestBody);
    }

    public static final /* synthetic */ void write$Self$bot_release(StopGeneratingRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.conversationId);
        output.encodeSerializableElement(serialDesc, 1, AiChatMessageRequestBody$$serializer.INSTANCE, self.getBody());
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.getPath(), AbstractC2875y.m8300m("ai-conversation-service/v1/conversation/", self.conversationId, "/message/", self.getBody().getId(), "/stop"))) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.getPath());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiChatMessageRequestBody getBody() {
        return this.body;
    }

    public final StopGeneratingRequest copy(String conversationId, AiChatMessageRequestBody body) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(body, "body");
        return new StopGeneratingRequest(conversationId, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StopGeneratingRequest)) {
            return false;
        }
        StopGeneratingRequest stopGeneratingRequest = (StopGeneratingRequest) other;
        return AbstractC22676k.m65745e(this.conversationId, stopGeneratingRequest.conversationId) && AbstractC22676k.m65745e(this.body, stopGeneratingRequest.body);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.body.hashCode() + (this.conversationId.hashCode() * 31);
    }

    public String toString() {
        return "StopGeneratingRequest(conversationId=" + this.conversationId + ", body=" + this.body + ")";
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public AiChatMessageRequestBody getBody() {
        return this.body;
    }

    public StopGeneratingRequest(String conversationId, AiChatMessageRequestBody body) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(body, "body");
        this.conversationId = conversationId;
        this.body = body;
        this.path = AbstractC2875y.m8300m("ai-conversation-service/v1/conversation/", conversationId, "/message/", getBody().getId(), "/stop");
    }
}
