package com.whoop.bot.models.conversation;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PostApiRequest;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i63.C18181t;
import java.util.Map;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import sr2.AbstractC32943y;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002('B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u001b¨\u0006)"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ImageUploadRequest;", "Lcom/whoop/network/request/PostApiRequest;", "Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;", "body", "<init>", "(Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;)V", "", "seen0", "", "path", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/bot/models/conversation/ImageUploadRequestBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/ImageUploadRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;", "copy", "(Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;)Lcom/whoop/bot/models/conversation/ImageUploadRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/bot/models/conversation/ImageUploadRequestBody;", "getBody", "Ljava/lang/String;", "getPath", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImageUploadRequest implements PostApiRequest<ImageUploadRequestBody> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageUploadRequestBody body;
    private final String path;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ImageUploadRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/ImageUploadRequest;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImageUploadRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageUploadRequest(int i13, ImageUploadRequestBody imageUploadRequestBody, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ImageUploadRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.body = imageUploadRequestBody;
        if ((i13 & 2) == 0) {
            this.path = "ai-conversation-service/v1/files";
        } else {
            this.path = str;
        }
    }

    public static /* synthetic */ ImageUploadRequest copy$default(ImageUploadRequest imageUploadRequest, ImageUploadRequestBody imageUploadRequestBody, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            imageUploadRequestBody = imageUploadRequest.body;
        }
        return imageUploadRequest.copy(imageUploadRequestBody);
    }

    public static final /* synthetic */ void write$Self$bot_release(ImageUploadRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ImageUploadRequestBody$$serializer.INSTANCE, self.getBody());
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.getPath(), "ai-conversation-service/v1/files")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.getPath());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageUploadRequestBody getBody() {
        return this.body;
    }

    public final ImageUploadRequest copy(ImageUploadRequestBody body) {
        AbstractC22676k.m65750j(body, "body");
        return new ImageUploadRequest(body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageUploadRequest) && AbstractC22676k.m65745e(this.body, ((ImageUploadRequest) other).body);
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
        return this.body.hashCode();
    }

    public String toString() {
        return "ImageUploadRequest(body=" + this.body + ")";
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PostApiRequest, z02.InterfaceC39944a
    public ImageUploadRequestBody getBody() {
        return this.body;
    }

    public ImageUploadRequest(ImageUploadRequestBody body) {
        AbstractC22676k.m65750j(body, "body");
        this.body = body;
        this.path = "ai-conversation-service/v1/files";
    }
}
