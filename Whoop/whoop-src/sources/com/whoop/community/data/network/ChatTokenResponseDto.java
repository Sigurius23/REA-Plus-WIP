package com.whoop.community.data.network;

import bq0.C3545a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001b¨\u0006+"}, m65681d2 = {"Lcom/whoop/community/data/network/ChatTokenResponseDto;", "", "", "userId", "", "chatToken", "<init>", "(ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_release", "(Lcom/whoop/community/data/network/ChatTokenResponseDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lbq0/a;", "toChatTokenResponse", "()Lbq0/a;", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/whoop/community/data/network/ChatTokenResponseDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getUserId", "Ljava/lang/String;", "getChatToken", "Companion", "$serializer", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChatTokenResponseDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("chat_token")
    private final String chatToken;

    @SerializedName("user_id")
    private final int userId;

    /* JADX INFO: renamed from: com.whoop.community.data.network.ChatTokenResponseDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/community/data/network/ChatTokenResponseDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/community/data/network/ChatTokenResponseDto;", "serializer", "()Lwc3/c;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChatTokenResponseDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ChatTokenResponseDto(int i13, int i14, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ChatTokenResponseDto$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = i14;
        this.chatToken = str;
    }

    public static /* synthetic */ ChatTokenResponseDto copy$default(ChatTokenResponseDto chatTokenResponseDto, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = chatTokenResponseDto.userId;
        }
        if ((i14 & 2) != 0) {
            str = chatTokenResponseDto.chatToken;
        }
        return chatTokenResponseDto.copy(i13, str);
    }

    public static final /* synthetic */ void write$Self$community_release(ChatTokenResponseDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.userId);
        output.encodeStringElement(serialDesc, 1, self.chatToken);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatToken() {
        return this.chatToken;
    }

    public final ChatTokenResponseDto copy(int userId, String chatToken) {
        AbstractC22676k.m65750j(chatToken, "chatToken");
        return new ChatTokenResponseDto(userId, chatToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatTokenResponseDto)) {
            return false;
        }
        ChatTokenResponseDto chatTokenResponseDto = (ChatTokenResponseDto) other;
        return this.userId == chatTokenResponseDto.userId && AbstractC22676k.m65745e(this.chatToken, chatTokenResponseDto.chatToken);
    }

    public final String getChatToken() {
        return this.chatToken;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.chatToken.hashCode() + (Integer.hashCode(this.userId) * 31);
    }

    public final C3545a toChatTokenResponse() {
        return new C3545a(this.userId, this.chatToken);
    }

    public String toString() {
        return AbstractC30007c.m91838h(this.userId, "ChatTokenResponseDto(userId=", ", chatToken=", this.chatToken, ")");
    }

    public ChatTokenResponseDto(int i13, String chatToken) {
        AbstractC22676k.m65750j(chatToken, "chatToken");
        this.userId = i13;
        this.chatToken = chatToken;
    }
}
