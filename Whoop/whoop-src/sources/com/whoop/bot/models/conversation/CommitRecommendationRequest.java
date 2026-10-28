package com.whoop.bot.models.conversation;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PutApiRequest;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i63.C18181t;
import java.util.Map;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import sr2.AbstractC32943y;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b,\u0010\u0019¨\u0006/"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/CommitRecommendationRequest;", "Lcom/whoop/network/request/PutApiRequest;", "Lcom/whoop/bot/models/conversation/CommitRecommendationRequestBody;", "", "conversationId", "recommendationId", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/CommitRecommendationRequestBody;)V", "", "seen0", "path", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/CommitRecommendationRequestBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/CommitRecommendationRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/bot/models/conversation/CommitRecommendationRequestBody;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/CommitRecommendationRequestBody;)Lcom/whoop/bot/models/conversation/CommitRecommendationRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversationId", "getRecommendationId", "Lcom/whoop/bot/models/conversation/CommitRecommendationRequestBody;", "getBody", "getPath", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommitRecommendationRequest implements PutApiRequest<CommitRecommendationRequestBody> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CommitRecommendationRequestBody body;
    private final String conversationId;
    private final String path;
    private final String recommendationId;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/CommitRecommendationRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/CommitRecommendationRequest;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommitRecommendationRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommitRecommendationRequest(int i13, String str, String str2, CommitRecommendationRequestBody commitRecommendationRequestBody, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, CommitRecommendationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.conversationId = str;
        this.recommendationId = str2;
        this.body = commitRecommendationRequestBody;
        if ((i13 & 8) == 0) {
            this.path = AbstractC31061c.m95640p("ai-conversation-service/v2/conversation/", str, "/recommendations/", str2);
        } else {
            this.path = str3;
        }
    }

    public static /* synthetic */ CommitRecommendationRequest copy$default(CommitRecommendationRequest commitRecommendationRequest, String str, String str2, CommitRecommendationRequestBody commitRecommendationRequestBody, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = commitRecommendationRequest.conversationId;
        }
        if ((i13 & 2) != 0) {
            str2 = commitRecommendationRequest.recommendationId;
        }
        if ((i13 & 4) != 0) {
            commitRecommendationRequestBody = commitRecommendationRequest.body;
        }
        return commitRecommendationRequest.copy(str, str2, commitRecommendationRequestBody);
    }

    public static final /* synthetic */ void write$Self$bot_release(CommitRecommendationRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.conversationId);
        output.encodeStringElement(serialDesc, 1, self.recommendationId);
        output.encodeSerializableElement(serialDesc, 2, CommitRecommendationRequestBody$$serializer.INSTANCE, self.getBody());
        if (!output.shouldEncodeElementDefault(serialDesc, 3)) {
            if (AbstractC22676k.m65745e(self.getPath(), "ai-conversation-service/v2/conversation/" + self.conversationId + "/recommendations/" + self.recommendationId)) {
                return;
            }
        }
        output.encodeStringElement(serialDesc, 3, self.getPath());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecommendationId() {
        return this.recommendationId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommitRecommendationRequestBody getBody() {
        return this.body;
    }

    public final CommitRecommendationRequest copy(String conversationId, String recommendationId, CommitRecommendationRequestBody body) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(body, "body");
        return new CommitRecommendationRequest(conversationId, recommendationId, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitRecommendationRequest)) {
            return false;
        }
        CommitRecommendationRequest commitRecommendationRequest = (CommitRecommendationRequest) other;
        return AbstractC22676k.m65745e(this.conversationId, commitRecommendationRequest.conversationId) && AbstractC22676k.m65745e(this.recommendationId, commitRecommendationRequest.recommendationId) && AbstractC22676k.m65745e(this.body, commitRecommendationRequest.body);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    public final String getRecommendationId() {
        return this.recommendationId;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.body.hashCode() + AbstractC11266d.m30450d(this.conversationId.hashCode() * 31, 31, this.recommendationId);
    }

    public String toString() {
        String str = this.conversationId;
        String str2 = this.recommendationId;
        CommitRecommendationRequestBody commitRecommendationRequestBody = this.body;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CommitRecommendationRequest(conversationId=", str, ", recommendationId=", str2, ", body=");
        sbM32001t.append(commitRecommendationRequestBody);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public CommitRecommendationRequestBody getBody() {
        return this.body;
    }

    public CommitRecommendationRequest(String conversationId, String recommendationId, CommitRecommendationRequestBody body) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(body, "body");
        this.conversationId = conversationId;
        this.recommendationId = recommendationId;
        this.body = body;
        this.path = AbstractC31061c.m95640p("ai-conversation-service/v2/conversation/", conversationId, "/recommendations/", recommendationId);
    }
}
