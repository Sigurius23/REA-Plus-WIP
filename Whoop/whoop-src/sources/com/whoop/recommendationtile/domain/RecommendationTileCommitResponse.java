package com.whoop.recommendationtile.domain;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;", "", "Lcom/whoop/design/models/DesignSystemModel;", "item", "", "followupMessage", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$recommendation_tile_arch_mini_release", "(Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/DesignSystemModel;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/DesignSystemModel;", "getItem", "Ljava/lang/String;", "getFollowupMessage", "Companion", "$serializer", "a", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
final /* data */ class RecommendationTileCommitResponse {
    private final String followupMessage;
    private final DesignSystemModel item;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C9910a()), null};

    /* JADX INFO: renamed from: com.whoop.recommendationtile.domain.RecommendationTileCommitResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/recommendationtile/domain/RecommendationTileCommitResponse;", "serializer", "()Lwc3/c;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendationTileCommitResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RecommendationTileCommitResponse(int i13, DesignSystemModel designSystemModel, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, RecommendationTileCommitResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.item = designSystemModel;
        this.followupMessage = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ RecommendationTileCommitResponse copy$default(RecommendationTileCommitResponse recommendationTileCommitResponse, DesignSystemModel designSystemModel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            designSystemModel = recommendationTileCommitResponse.item;
        }
        if ((i13 & 2) != 0) {
            str = recommendationTileCommitResponse.followupMessage;
        }
        return recommendationTileCommitResponse.copy(designSystemModel, str);
    }

    public static final /* synthetic */ void write$Self$recommendation_tile_arch_mini_release(RecommendationTileCommitResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.item);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.followupMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesignSystemModel getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    public final RecommendationTileCommitResponse copy(DesignSystemModel item, String followupMessage) {
        AbstractC22676k.m65750j(item, "item");
        return new RecommendationTileCommitResponse(item, followupMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationTileCommitResponse)) {
            return false;
        }
        RecommendationTileCommitResponse recommendationTileCommitResponse = (RecommendationTileCommitResponse) other;
        return AbstractC22676k.m65745e(this.item, recommendationTileCommitResponse.item) && AbstractC22676k.m65745e(this.followupMessage, recommendationTileCommitResponse.followupMessage);
    }

    public final String getFollowupMessage() {
        return this.followupMessage;
    }

    public final DesignSystemModel getItem() {
        return this.item;
    }

    public int hashCode() {
        int iHashCode = this.item.hashCode() * 31;
        String str = this.followupMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecommendationTileCommitResponse(item=" + this.item + ", followupMessage=" + this.followupMessage + ")";
    }

    public RecommendationTileCommitResponse(DesignSystemModel item, String str) {
        AbstractC22676k.m65750j(item, "item");
        this.item = item;
        this.followupMessage = str;
    }
}
