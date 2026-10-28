package com.whoop.data.remote.domain.request;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.ProfileApiKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006("}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;", "", "", ProfileApiKt.COMMUNITY_ID_PARAM, "", "source", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCommunityId", "Ljava/lang/String;", "getSource", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommunityOfferRequestBodyV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("community_id")
    private final Integer communityId;

    @SerializedName("source")
    private final String source;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/request/CommunityOfferRequestBodyV2;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommunityOfferRequestBodyV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommunityOfferRequestBodyV2(int i13, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CommunityOfferRequestBodyV2$$serializer.INSTANCE.getDescriptor());
        }
        this.communityId = num;
        this.source = str;
    }

    public static /* synthetic */ CommunityOfferRequestBodyV2 copy$default(CommunityOfferRequestBodyV2 communityOfferRequestBodyV2, Integer num, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = communityOfferRequestBodyV2.communityId;
        }
        if ((i13 & 2) != 0) {
            str = communityOfferRequestBodyV2.source;
        }
        return communityOfferRequestBodyV2.copy(num, str);
    }

    public static final /* synthetic */ void write$Self$core_release(CommunityOfferRequestBodyV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, IntSerializer.INSTANCE, self.communityId);
        output.encodeStringElement(serialDesc, 1, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCommunityId() {
        return this.communityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final CommunityOfferRequestBodyV2 copy(Integer communityId, String source) {
        AbstractC22676k.m65750j(source, "source");
        return new CommunityOfferRequestBodyV2(communityId, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityOfferRequestBodyV2)) {
            return false;
        }
        CommunityOfferRequestBodyV2 communityOfferRequestBodyV2 = (CommunityOfferRequestBodyV2) other;
        return AbstractC22676k.m65745e(this.communityId, communityOfferRequestBodyV2.communityId) && AbstractC22676k.m65745e(this.source, communityOfferRequestBodyV2.source);
    }

    public final Integer getCommunityId() {
        return this.communityId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        Integer num = this.communityId;
        return this.source.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public String toString() {
        return "CommunityOfferRequestBodyV2(communityId=" + this.communityId + ", source=" + this.source + ")";
    }

    public CommunityOfferRequestBodyV2(Integer num, String source) {
        AbstractC22676k.m65750j(source, "source");
        this.communityId = num;
        this.source = source;
    }
}
