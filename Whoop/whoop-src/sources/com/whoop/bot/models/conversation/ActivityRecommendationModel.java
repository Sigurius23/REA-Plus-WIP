package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21179y0;
import java.lang.annotation.Annotation;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0081\b\u0018\u0000 G2\u00020\u0001:\u0002HGBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bo\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/Jn\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\f2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010%R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\b\r\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010/¨\u0006I"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "recommendationId", "icon", "Lcom/whoop/design/util/TextResource;", "title", "", "Lcom/whoop/bot/models/conversation/ActivityRecommendationSubtitle;", "subtitles", "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;", "targetZones", "", "isSelected", "content", "Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;", "cta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;", "component6", "()Z", "component7", "()Lcom/whoop/design/models/DesignSystemModel;", "component8", "()Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;ZLcom/whoop/design/models/DesignSystemModel;Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;)Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRecommendationId", "getIcon", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/util/List;", "getSubtitles", "Lcom/whoop/bot/models/conversation/ActivityRecommendationTargetZones;", "getTargetZones", "Z", "Lcom/whoop/design/models/DesignSystemModel;", "getContent", "Lcom/whoop/bot/models/conversation/ActivityRecommendationCta;", "getCta", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityRecommendationModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel content;
    private final ActivityRecommendationCta cta;
    private final String icon;
    private final boolean isSelected;
    private final String recommendationId;
    private final List<ActivityRecommendationSubtitle> subtitles;
    private final ActivityRecommendationTargetZones targetZones;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/ActivityRecommendationModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityRecommendationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21179y0(20)), null, null, AbstractC30060g.m92087G(enumC23463i, new C21179y0(21)), null};
    }

    public /* synthetic */ ActivityRecommendationModel(int i13, String str, String str2, TextResource textResource, List list, ActivityRecommendationTargetZones activityRecommendationTargetZones, boolean z4, DesignSystemModel designSystemModel, ActivityRecommendationCta activityRecommendationCta, SerializationConstructorMarker serializationConstructorMarker) {
        if (191 != (i13 & 191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 191, ActivityRecommendationModel$$serializer.INSTANCE.getDescriptor());
        }
        this.recommendationId = str;
        this.icon = str2;
        this.title = textResource;
        this.subtitles = list;
        this.targetZones = activityRecommendationTargetZones;
        this.isSelected = z4;
        if ((i13 & 64) == 0) {
            this.content = null;
        } else {
            this.content = designSystemModel;
        }
        this.cta = activityRecommendationCta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ActivityRecommendationSubtitle$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityRecommendationModel copy$default(ActivityRecommendationModel activityRecommendationModel, String str, String str2, TextResource textResource, List list, ActivityRecommendationTargetZones activityRecommendationTargetZones, boolean z4, DesignSystemModel designSystemModel, ActivityRecommendationCta activityRecommendationCta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activityRecommendationModel.recommendationId;
        }
        if ((i13 & 2) != 0) {
            str2 = activityRecommendationModel.icon;
        }
        if ((i13 & 4) != 0) {
            textResource = activityRecommendationModel.title;
        }
        if ((i13 & 8) != 0) {
            list = activityRecommendationModel.subtitles;
        }
        if ((i13 & 16) != 0) {
            activityRecommendationTargetZones = activityRecommendationModel.targetZones;
        }
        if ((i13 & 32) != 0) {
            z4 = activityRecommendationModel.isSelected;
        }
        if ((i13 & 64) != 0) {
            designSystemModel = activityRecommendationModel.content;
        }
        if ((i13 & 128) != 0) {
            activityRecommendationCta = activityRecommendationModel.cta;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        ActivityRecommendationCta activityRecommendationCta2 = activityRecommendationCta;
        ActivityRecommendationTargetZones activityRecommendationTargetZones2 = activityRecommendationTargetZones;
        boolean z13 = z4;
        return activityRecommendationModel.copy(str, str2, textResource, list, activityRecommendationTargetZones2, z13, designSystemModel2, activityRecommendationCta2);
    }

    public static final /* synthetic */ void write$Self$bot_release(ActivityRecommendationModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.recommendationId);
        output.encodeStringElement(serialDesc, 1, self.icon);
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.subtitles);
        output.encodeNullableSerializableElement(serialDesc, 4, ActivityRecommendationTargetZones$$serializer.INSTANCE, self.targetZones);
        output.encodeBooleanElement(serialDesc, 5, self.isSelected);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.content != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.content);
        }
        output.encodeNullableSerializableElement(serialDesc, 7, ActivityRecommendationCta$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecommendationId() {
        return this.recommendationId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<ActivityRecommendationSubtitle> component4() {
        return this.subtitles;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ActivityRecommendationTargetZones getTargetZones() {
        return this.targetZones;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DesignSystemModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ActivityRecommendationCta getCta() {
        return this.cta;
    }

    public final ActivityRecommendationModel copy(String recommendationId, String icon, TextResource title, List<ActivityRecommendationSubtitle> subtitles, ActivityRecommendationTargetZones targetZones, boolean isSelected, DesignSystemModel content, ActivityRecommendationCta cta) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        return new ActivityRecommendationModel(recommendationId, icon, title, subtitles, targetZones, isSelected, content, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRecommendationModel)) {
            return false;
        }
        ActivityRecommendationModel activityRecommendationModel = (ActivityRecommendationModel) other;
        return AbstractC22676k.m65745e(this.recommendationId, activityRecommendationModel.recommendationId) && AbstractC22676k.m65745e(this.icon, activityRecommendationModel.icon) && AbstractC22676k.m65745e(this.title, activityRecommendationModel.title) && AbstractC22676k.m65745e(this.subtitles, activityRecommendationModel.subtitles) && AbstractC22676k.m65745e(this.targetZones, activityRecommendationModel.targetZones) && this.isSelected == activityRecommendationModel.isSelected && AbstractC22676k.m65745e(this.content, activityRecommendationModel.content) && AbstractC22676k.m65745e(this.cta, activityRecommendationModel.cta);
    }

    public final DesignSystemModel getContent() {
        return this.content;
    }

    public final ActivityRecommendationCta getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getRecommendationId() {
        return this.recommendationId;
    }

    public final List<ActivityRecommendationSubtitle> getSubtitles() {
        return this.subtitles;
    }

    public final ActivityRecommendationTargetZones getTargetZones() {
        return this.targetZones;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.recommendationId.hashCode() * 31, 31, this.icon), this.title, 31);
        List<ActivityRecommendationSubtitle> list = this.subtitles;
        int iHashCode = (iM95625a + (list == null ? 0 : list.hashCode())) * 31;
        ActivityRecommendationTargetZones activityRecommendationTargetZones = this.targetZones;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (activityRecommendationTargetZones == null ? 0 : activityRecommendationTargetZones.hashCode())) * 31, 31, this.isSelected);
        DesignSystemModel designSystemModel = this.content;
        int iHashCode2 = (iM8289b + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        ActivityRecommendationCta activityRecommendationCta = this.cta;
        return iHashCode2 + (activityRecommendationCta != null ? activityRecommendationCta.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.recommendationId;
        String str2 = this.icon;
        TextResource textResource = this.title;
        List<ActivityRecommendationSubtitle> list = this.subtitles;
        ActivityRecommendationTargetZones activityRecommendationTargetZones = this.targetZones;
        boolean z4 = this.isSelected;
        DesignSystemModel designSystemModel = this.content;
        ActivityRecommendationCta activityRecommendationCta = this.cta;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityRecommendationModel(recommendationId=", str, ", icon=", str2, ", title=");
        AbstractC21702c.m61143n(textResource, ", subtitles=", ", targetZones=", sbM32001t, list);
        sbM32001t.append(activityRecommendationTargetZones);
        sbM32001t.append(", isSelected=");
        sbM32001t.append(z4);
        sbM32001t.append(", content=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", cta=");
        sbM32001t.append(activityRecommendationCta);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ActivityRecommendationModel(String recommendationId, String icon, TextResource title, List<ActivityRecommendationSubtitle> list, ActivityRecommendationTargetZones activityRecommendationTargetZones, boolean z4, DesignSystemModel designSystemModel, ActivityRecommendationCta activityRecommendationCta) {
        AbstractC22676k.m65750j(recommendationId, "recommendationId");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        this.recommendationId = recommendationId;
        this.icon = icon;
        this.title = title;
        this.subtitles = list;
        this.targetZones = activityRecommendationTargetZones;
        this.isSelected = z4;
        this.content = designSystemModel;
        this.cta = activityRecommendationCta;
    }

    public /* synthetic */ ActivityRecommendationModel(String str, String str2, TextResource textResource, List list, ActivityRecommendationTargetZones activityRecommendationTargetZones, boolean z4, DesignSystemModel designSystemModel, ActivityRecommendationCta activityRecommendationCta, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, textResource, list, activityRecommendationTargetZones, z4, (i13 & 64) != 0 ? null : designSystemModel, activityRecommendationCta);
    }
}
