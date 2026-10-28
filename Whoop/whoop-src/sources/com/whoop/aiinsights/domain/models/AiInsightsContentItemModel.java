package com.whoop.aiinsights.domain.models;

import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33691b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0015¨\u0006("}, m65681d2 = {"Lcom/whoop/aiinsights/domain/models/AiInsightsContentItemModel;", "", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "content", "<init>", "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$ai_insights_release", "(Lcom/whoop/aiinsights/domain/models/AiInsightsContentItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "copy", "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Lcom/whoop/aiinsights/domain/models/AiInsightsContentItemModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "getContent", "getContent$annotations", "()V", "Companion", "$serializer", "a", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiInsightsContentItemModel {
    private final ActivityRecommendationTileModel content;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ActivityRecommendationTileModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33691b(15))};

    /* JADX INFO: renamed from: com.whoop.aiinsights.domain.models.AiInsightsContentItemModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/aiinsights/domain/models/AiInsightsContentItemModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/aiinsights/domain/models/AiInsightsContentItemModel;", "serializer", "()Lwc3/c;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiInsightsContentItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AiInsightsContentItemModel(int i13, ActivityRecommendationTileModel activityRecommendationTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AiInsightsContentItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.content = activityRecommendationTileModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ActivityRecommendationTileModel.class), ActivityRecommendationTileModel$$serializer.INSTANCE, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ AiInsightsContentItemModel copy$default(AiInsightsContentItemModel aiInsightsContentItemModel, ActivityRecommendationTileModel activityRecommendationTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            activityRecommendationTileModel = aiInsightsContentItemModel.content;
        }
        return aiInsightsContentItemModel.copy(activityRecommendationTileModel);
    }

    @InterfaceC37143h("content")
    public static /* synthetic */ void getContent$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActivityRecommendationTileModel getContent() {
        return this.content;
    }

    public final AiInsightsContentItemModel copy(ActivityRecommendationTileModel content) {
        AbstractC22676k.m65750j(content, "content");
        return new AiInsightsContentItemModel(content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AiInsightsContentItemModel) && AbstractC22676k.m65745e(this.content, ((AiInsightsContentItemModel) other).content);
    }

    public final ActivityRecommendationTileModel getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "AiInsightsContentItemModel(content=" + this.content + ")";
    }

    public AiInsightsContentItemModel(ActivityRecommendationTileModel content) {
        AbstractC22676k.m65750j(content, "content");
        this.content = content;
    }
}
