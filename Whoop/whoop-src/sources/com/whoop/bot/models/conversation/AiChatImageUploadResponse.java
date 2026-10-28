package com.whoop.bot.models.conversation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJX\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b9\u0010\u001d¨\u0006<"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;", "", "", "fileId", "", "userId", "filename", "contentType", "", "size", "", "createdAt", "createdAtFormatted", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()J", "component6", "()D", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JDLjava/lang/String;)Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileId", "I", "getUserId", "getFilename", "getContentType", "J", "getSize", "D", "getCreatedAt", "getCreatedAtFormatted", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatImageUploadResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contentType;
    private final double createdAt;
    private final String createdAtFormatted;
    private final String fileId;
    private final String filename;
    private final long size;
    private final int userId;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/AiChatImageUploadResponse;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatImageUploadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AiChatImageUploadResponse(int i13, String str, int i14, String str2, String str3, long j7, double d3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, AiChatImageUploadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.fileId = str;
        this.userId = i14;
        this.filename = str2;
        this.contentType = str3;
        this.size = j7;
        this.createdAt = d3;
        if ((i13 & 64) == 0) {
            this.createdAtFormatted = null;
        } else {
            this.createdAtFormatted = str4;
        }
    }

    public static /* synthetic */ AiChatImageUploadResponse copy$default(AiChatImageUploadResponse aiChatImageUploadResponse, String str, int i13, String str2, String str3, long j7, double d3, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = aiChatImageUploadResponse.fileId;
        }
        if ((i14 & 2) != 0) {
            i13 = aiChatImageUploadResponse.userId;
        }
        if ((i14 & 4) != 0) {
            str2 = aiChatImageUploadResponse.filename;
        }
        if ((i14 & 8) != 0) {
            str3 = aiChatImageUploadResponse.contentType;
        }
        if ((i14 & 16) != 0) {
            j7 = aiChatImageUploadResponse.size;
        }
        if ((i14 & 32) != 0) {
            d3 = aiChatImageUploadResponse.createdAt;
        }
        if ((i14 & 64) != 0) {
            str4 = aiChatImageUploadResponse.createdAtFormatted;
        }
        String str5 = str4;
        double d14 = d3;
        long j13 = j7;
        return aiChatImageUploadResponse.copy(str, i13, str2, str3, j13, d14, str5);
    }

    public static final /* synthetic */ void write$Self$bot_release(AiChatImageUploadResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.fileId);
        output.encodeIntElement(serialDesc, 1, self.userId);
        output.encodeStringElement(serialDesc, 2, self.filename);
        output.encodeStringElement(serialDesc, 3, self.contentType);
        output.encodeLongElement(serialDesc, 4, self.size);
        output.encodeDoubleElement(serialDesc, 5, self.createdAt);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.createdAtFormatted == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.createdAtFormatted);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreatedAtFormatted() {
        return this.createdAtFormatted;
    }

    public final AiChatImageUploadResponse copy(String fileId, int userId, String filename, String contentType, long size, double createdAt, String createdAtFormatted) {
        AbstractC22676k.m65750j(fileId, "fileId");
        AbstractC22676k.m65750j(filename, "filename");
        AbstractC22676k.m65750j(contentType, "contentType");
        return new AiChatImageUploadResponse(fileId, userId, filename, contentType, size, createdAt, createdAtFormatted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatImageUploadResponse)) {
            return false;
        }
        AiChatImageUploadResponse aiChatImageUploadResponse = (AiChatImageUploadResponse) other;
        return AbstractC22676k.m65745e(this.fileId, aiChatImageUploadResponse.fileId) && this.userId == aiChatImageUploadResponse.userId && AbstractC22676k.m65745e(this.filename, aiChatImageUploadResponse.filename) && AbstractC22676k.m65745e(this.contentType, aiChatImageUploadResponse.contentType) && this.size == aiChatImageUploadResponse.size && Double.compare(this.createdAt, aiChatImageUploadResponse.createdAt) == 0 && AbstractC22676k.m65745e(this.createdAtFormatted, aiChatImageUploadResponse.createdAtFormatted);
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final double getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedAtFormatted() {
        return this.createdAtFormatted;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.userId, this.fileId.hashCode() * 31, 31), 31, this.filename), 31, this.contentType), this.size, 31), 31, this.createdAt);
        String str = this.createdAtFormatted;
        return iM48499a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.fileId;
        int i13 = this.userId;
        String str2 = this.filename;
        String str3 = this.contentType;
        long j7 = this.size;
        double d3 = this.createdAt;
        String str4 = this.createdAtFormatted;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "AiChatImageUploadResponse(fileId=", str, ", userId=", ", filename=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", contentType=", str3, ", size=");
        sbM30467u.append(j7);
        AbstractC31061c.m95622B(sbM30467u, ", createdAt=", d3, ", createdAtFormatted=");
        return AbstractC25012a.m73376i(str4, ")", sbM30467u);
    }

    public AiChatImageUploadResponse(String fileId, int i13, String filename, String contentType, long j7, double d3, String str) {
        AbstractC22676k.m65750j(fileId, "fileId");
        AbstractC22676k.m65750j(filename, "filename");
        AbstractC22676k.m65750j(contentType, "contentType");
        this.fileId = fileId;
        this.userId = i13;
        this.filename = filename;
        this.contentType = contentType;
        this.size = j7;
        this.createdAt = d3;
        this.createdAtFormatted = str;
    }

    public /* synthetic */ AiChatImageUploadResponse(String str, int i13, String str2, String str3, long j7, double d3, String str4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, str3, j7, d3, (i14 & 64) != 0 ? null : str4);
    }
}
