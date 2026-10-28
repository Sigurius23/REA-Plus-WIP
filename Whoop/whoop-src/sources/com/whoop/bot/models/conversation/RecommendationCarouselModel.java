package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J6\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "", "recommendations", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getRecommendations", "getActionTitle", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecommendationCarouselModel implements DesignSystemModel {
    private final String actionTitle;
    private final List<DesignSystemModel> recommendations;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21769a(9)), null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/RecommendationCarouselModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/RecommendationCarouselModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendationCarouselModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RecommendationCarouselModel() {
        this((String) null, (List) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationCarouselModel copy$default(RecommendationCarouselModel recommendationCarouselModel, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recommendationCarouselModel.title;
        }
        if ((i13 & 2) != 0) {
            list = recommendationCarouselModel.recommendations;
        }
        if ((i13 & 4) != 0) {
            str2 = recommendationCarouselModel.actionTitle;
        }
        return recommendationCarouselModel.copy(str, list, str2);
    }

    public static final /* synthetic */ void write$Self$bot_release(RecommendationCarouselModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.recommendations, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.recommendations);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.actionTitle, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.actionTitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component2() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final RecommendationCarouselModel copy(String title, List<? extends DesignSystemModel> recommendations, String actionTitle) {
        AbstractC22676k.m65750j(recommendations, "recommendations");
        AbstractC22676k.m65750j(actionTitle, "actionTitle");
        return new RecommendationCarouselModel(title, recommendations, actionTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationCarouselModel)) {
            return false;
        }
        RecommendationCarouselModel recommendationCarouselModel = (RecommendationCarouselModel) other;
        return AbstractC22676k.m65745e(this.title, recommendationCarouselModel.title) && AbstractC22676k.m65745e(this.recommendations, recommendationCarouselModel.recommendations) && AbstractC22676k.m65745e(this.actionTitle, recommendationCarouselModel.actionTitle);
    }

    public final String getActionTitle() {
        return this.actionTitle;
    }

    public final List<DesignSystemModel> getRecommendations() {
        return this.recommendations;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.actionTitle.hashCode() + AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.recommendations);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.actionTitle, ")", AbstractC30802r.m94766o("RecommendationCarouselModel(title=", this.title, ", recommendations=", ", actionTitle=", this.recommendations));
    }

    public /* synthetic */ RecommendationCarouselModel(int i13, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? null : str;
        if ((i13 & 2) == 0) {
            this.recommendations = C25271y.f99162w;
        } else {
            this.recommendations = list;
        }
        if ((i13 & 4) == 0) {
            this.actionTitle = "";
        } else {
            this.actionTitle = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationCarouselModel(String str, List<? extends DesignSystemModel> recommendations, String actionTitle) {
        AbstractC22676k.m65750j(recommendations, "recommendations");
        AbstractC22676k.m65750j(actionTitle, "actionTitle");
        this.title = str;
        this.recommendations = recommendations;
        this.actionTitle = actionTitle;
    }

    public /* synthetic */ RecommendationCarouselModel(String str, List list, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? "" : str2);
    }
}
