package com.whoop.bot.models.conversation;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PostApiRequest;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i63.C18181t;
import java.util.Map;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.UnitSerializer;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 )2\u000e\u0012\n\u0012\b\u0018\u00010\u0002j\u0002`\u00030\u0001:\u0002*)B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ'\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b%\u0010\u0018R \u0010\u000b\u001a\b\u0018\u00010\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;", "Lcom/whoop/network/request/PostApiRequest;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "", "conversationId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "path", "body", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ll83/a0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversationId", "getPath", "Ll83/a0;", "getBody", "()Ll83/a0;", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SwapRecommendationsRequest implements PostApiRequest<C23454a0> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final C23454a0 body;
    private final String conversationId;
    private final String path;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/SwapRecommendationsRequest;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SwapRecommendationsRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SwapRecommendationsRequest(int i13, String str, String str2, C23454a0 c23454a0, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SwapRecommendationsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.conversationId = str;
        if ((i13 & 2) == 0) {
            this.path = AbstractC11895b.m31996o("ai-conversation-service/v1/conversation/", str, "/recommendations");
        } else {
            this.path = str2;
        }
        if ((i13 & 4) == 0) {
            this.body = C23454a0.f92919a;
        } else {
            this.body = c23454a0;
        }
    }

    public static /* synthetic */ SwapRecommendationsRequest copy$default(SwapRecommendationsRequest swapRecommendationsRequest, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = swapRecommendationsRequest.conversationId;
        }
        return swapRecommendationsRequest.copy(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public static final /* synthetic */ void write$Self$bot_release(SwapRecommendationsRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.conversationId);
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeStringElement(serialDesc, 1, self.getPath());
        } else {
            if (!AbstractC22676k.m65745e(self.getPath(), "ai-conversation-service/v1/conversation/" + self.conversationId + "/recommendations")) {
                output.encodeStringElement(serialDesc, 1, self.getPath());
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.getBody(), C23454a0.f92919a)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, UnitSerializer.INSTANCE, self.getBody());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    public final SwapRecommendationsRequest copy(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        return new SwapRecommendationsRequest(conversationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SwapRecommendationsRequest) && AbstractC22676k.m65745e(this.conversationId, ((SwapRecommendationsRequest) other).conversationId);
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
        return this.conversationId.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("SwapRecommendationsRequest(conversationId=", this.conversationId, ")");
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public C23454a0 getBody() {
        return this.body;
    }

    public SwapRecommendationsRequest(String conversationId) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        this.conversationId = conversationId;
        this.path = AbstractC11895b.m31996o("ai-conversation-service/v1/conversation/", conversationId, "/recommendations");
        this.body = C23454a0.f92919a;
    }
}
