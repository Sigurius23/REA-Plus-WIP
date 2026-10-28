package com.whoop.communityhighlights.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JV\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006@"}, m65681d2 = {"Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;", "label", "Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;", "badge", "backgroundImageUrl", "Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;", "footer", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_highlights_release", "(Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;", "component3", "()Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;", "component4", "component5", "()Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;", "component6", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;Ljava/lang/String;Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;", "getLabel", "Lcom/whoop/communityhighlights/domain/models/HighlightCardBadgeModel;", "getBadge", "getBackgroundImageUrl", "Lcom/whoop/communityhighlights/domain/models/HighlightCardFooterModel;", "getFooter", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "a", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HighlightCardModel implements DesignSystemModel {
    private final String backgroundImageUrl;
    private final HighlightCardBadgeModel badge;
    private final HighlightCardFooterModel footer;
    private final String id;
    private final GenericInteraction interaction;
    private final HighlightCardLabelModel label;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    /* JADX INFO: renamed from: com.whoop.communityhighlights.domain.models.HighlightCardModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityhighlights/domain/models/HighlightCardModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityhighlights/domain/models/HighlightCardModel;", "serializer", "()Lwc3/c;", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HighlightCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HighlightCardModel(int i13, String str, HighlightCardLabelModel highlightCardLabelModel, HighlightCardBadgeModel highlightCardBadgeModel, String str2, HighlightCardFooterModel highlightCardFooterModel, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, HighlightCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = highlightCardLabelModel;
        this.badge = highlightCardBadgeModel;
        this.backgroundImageUrl = str2;
        this.footer = highlightCardFooterModel;
        this.interaction = genericInteraction;
    }

    public static /* synthetic */ HighlightCardModel copy$default(HighlightCardModel highlightCardModel, String str, HighlightCardLabelModel highlightCardLabelModel, HighlightCardBadgeModel highlightCardBadgeModel, String str2, HighlightCardFooterModel highlightCardFooterModel, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = highlightCardModel.id;
        }
        if ((i13 & 2) != 0) {
            highlightCardLabelModel = highlightCardModel.label;
        }
        if ((i13 & 4) != 0) {
            highlightCardBadgeModel = highlightCardModel.badge;
        }
        if ((i13 & 8) != 0) {
            str2 = highlightCardModel.backgroundImageUrl;
        }
        if ((i13 & 16) != 0) {
            highlightCardFooterModel = highlightCardModel.footer;
        }
        if ((i13 & 32) != 0) {
            genericInteraction = highlightCardModel.interaction;
        }
        HighlightCardFooterModel highlightCardFooterModel2 = highlightCardFooterModel;
        GenericInteraction genericInteraction2 = genericInteraction;
        return highlightCardModel.copy(str, highlightCardLabelModel, highlightCardBadgeModel, str2, highlightCardFooterModel2, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$community_highlights_release(HighlightCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, HighlightCardLabelModel$$serializer.INSTANCE, self.label);
        output.encodeNullableSerializableElement(serialDesc, 2, HighlightCardBadgeModel$$serializer.INSTANCE, self.badge);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.backgroundImageUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, HighlightCardFooterModel$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 5, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HighlightCardLabelModel getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HighlightCardBadgeModel getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HighlightCardFooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final HighlightCardModel copy(String id4, HighlightCardLabelModel label, HighlightCardBadgeModel badge, String backgroundImageUrl, HighlightCardFooterModel footer, GenericInteraction interaction) {
        AbstractC22676k.m65750j(id4, "id");
        return new HighlightCardModel(id4, label, badge, backgroundImageUrl, footer, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightCardModel)) {
            return false;
        }
        HighlightCardModel highlightCardModel = (HighlightCardModel) other;
        return AbstractC22676k.m65745e(this.id, highlightCardModel.id) && AbstractC22676k.m65745e(this.label, highlightCardModel.label) && AbstractC22676k.m65745e(this.badge, highlightCardModel.badge) && AbstractC22676k.m65745e(this.backgroundImageUrl, highlightCardModel.backgroundImageUrl) && AbstractC22676k.m65745e(this.footer, highlightCardModel.footer) && AbstractC22676k.m65745e(this.interaction, highlightCardModel.interaction);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final HighlightCardBadgeModel getBadge() {
        return this.badge;
    }

    public final HighlightCardFooterModel getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final HighlightCardLabelModel getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        HighlightCardLabelModel highlightCardLabelModel = this.label;
        int iHashCode2 = (iHashCode + (highlightCardLabelModel == null ? 0 : highlightCardLabelModel.hashCode())) * 31;
        HighlightCardBadgeModel highlightCardBadgeModel = this.badge;
        int iHashCode3 = (iHashCode2 + (highlightCardBadgeModel == null ? 0 : highlightCardBadgeModel.hashCode())) * 31;
        String str = this.backgroundImageUrl;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        HighlightCardFooterModel highlightCardFooterModel = this.footer;
        int iHashCode5 = (iHashCode4 + (highlightCardFooterModel == null ? 0 : highlightCardFooterModel.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode5 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "HighlightCardModel(id=" + this.id + ", label=" + this.label + ", badge=" + this.badge + ", backgroundImageUrl=" + this.backgroundImageUrl + ", footer=" + this.footer + ", interaction=" + this.interaction + ")";
    }

    public HighlightCardModel(String id4, HighlightCardLabelModel highlightCardLabelModel, HighlightCardBadgeModel highlightCardBadgeModel, String str, HighlightCardFooterModel highlightCardFooterModel, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.label = highlightCardLabelModel;
        this.badge = highlightCardBadgeModel;
        this.backgroundImageUrl = str;
        this.footer = highlightCardFooterModel;
        this.interaction = genericInteraction;
    }
}
