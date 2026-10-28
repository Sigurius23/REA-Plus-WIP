package com.whoop.bot.models.conversation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ImageUploadResponse;", "", "", "id", "", "userId", "filename", "contentType", "", "size", "createdAt", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/ImageUploadResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()J", "component6", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/whoop/bot/models/conversation/ImageUploadResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getUserId", "getFilename", "getContentType", "J", "getSize", "getCreatedAt", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImageUploadResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contentType;
    private final String createdAt;
    private final String filename;
    private final String id;
    private final long size;
    private final int userId;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ImageUploadResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/ImageUploadResponse;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImageUploadResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageUploadResponse(int i13, String str, int i14, String str2, String str3, long j7, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ImageUploadResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.userId = i14;
        this.filename = str2;
        this.contentType = str3;
        this.size = j7;
        this.createdAt = str4;
    }

    public static /* synthetic */ ImageUploadResponse copy$default(ImageUploadResponse imageUploadResponse, String str, int i13, String str2, String str3, long j7, String str4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = imageUploadResponse.id;
        }
        if ((i14 & 2) != 0) {
            i13 = imageUploadResponse.userId;
        }
        if ((i14 & 4) != 0) {
            str2 = imageUploadResponse.filename;
        }
        if ((i14 & 8) != 0) {
            str3 = imageUploadResponse.contentType;
        }
        if ((i14 & 16) != 0) {
            j7 = imageUploadResponse.size;
        }
        if ((i14 & 32) != 0) {
            str4 = imageUploadResponse.createdAt;
        }
        String str5 = str4;
        long j13 = j7;
        return imageUploadResponse.copy(str, i13, str2, str3, j13, str5);
    }

    public static final /* synthetic */ void write$Self$bot_release(ImageUploadResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeIntElement(serialDesc, 1, self.userId);
        output.encodeStringElement(serialDesc, 2, self.filename);
        output.encodeStringElement(serialDesc, 3, self.contentType);
        output.encodeLongElement(serialDesc, 4, self.size);
        output.encodeStringElement(serialDesc, 5, self.createdAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final ImageUploadResponse copy(String id4, int userId, String filename, String contentType, long size, String createdAt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(filename, "filename");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        return new ImageUploadResponse(id4, userId, filename, contentType, size, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageUploadResponse)) {
            return false;
        }
        ImageUploadResponse imageUploadResponse = (ImageUploadResponse) other;
        return AbstractC22676k.m65745e(this.id, imageUploadResponse.id) && this.userId == imageUploadResponse.userId && AbstractC22676k.m65745e(this.filename, imageUploadResponse.filename) && AbstractC22676k.m65745e(this.contentType, imageUploadResponse.contentType) && this.size == imageUploadResponse.size && AbstractC22676k.m65745e(this.createdAt, imageUploadResponse.createdAt);
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getId() {
        return this.id;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.createdAt.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.userId, this.id.hashCode() * 31, 31), 31, this.filename), 31, this.contentType), this.size, 31);
    }

    public String toString() {
        String str = this.id;
        int i13 = this.userId;
        String str2 = this.filename;
        String str3 = this.contentType;
        long j7 = this.size;
        String str4 = this.createdAt;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "ImageUploadResponse(id=", str, ", userId=", ", filename=");
        AbstractC11266d.m30444B(sbM30467u, str2, ", contentType=", str3, ", size=");
        sbM30467u.append(j7);
        sbM30467u.append(", createdAt=");
        sbM30467u.append(str4);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public ImageUploadResponse(String id4, int i13, String filename, String contentType, long j7, String createdAt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(filename, "filename");
        AbstractC22676k.m65750j(contentType, "contentType");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        this.id = id4;
        this.userId = i13;
        this.filename = filename;
        this.contentType = contentType;
        this.size = j7;
        this.createdAt = createdAt;
    }
}
