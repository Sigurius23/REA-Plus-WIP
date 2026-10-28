package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/items/RewardItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "imageUrl", "icon", "Lcom/whoop/design/models/MarkdownTextModel;", "title", "subtitle", "Lcom/whoop/design/models/items/TagModel;", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/items/TagModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/RewardItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/MarkdownTextModel;", "component4", "component5", "()Lcom/whoop/design/models/items/TagModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/MarkdownTextModel;Lcom/whoop/design/models/items/TagModel;)Lcom/whoop/design/models/items/RewardItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getIcon", "Lcom/whoop/design/models/MarkdownTextModel;", "getTitle", "getSubtitle", "Lcom/whoop/design/models/items/TagModel;", "getTag", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RewardItemModel implements DesignSystemModel {
    private final String icon;
    private final String imageUrl;
    private final MarkdownTextModel subtitle;
    private final TagModel tag;
    private final MarkdownTextModel title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/RewardItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/RewardItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RewardItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RewardItemModel(int i13, String str, String str2, MarkdownTextModel markdownTextModel, MarkdownTextModel markdownTextModel2, TagModel tagModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (12 != (i13 & 12)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 12, RewardItemModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str;
        }
        if ((i13 & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        this.title = markdownTextModel;
        this.subtitle = markdownTextModel2;
        if ((i13 & 16) == 0) {
            this.tag = null;
        } else {
            this.tag = tagModel;
        }
    }

    public static /* synthetic */ RewardItemModel copy$default(RewardItemModel rewardItemModel, String str, String str2, MarkdownTextModel markdownTextModel, MarkdownTextModel markdownTextModel2, TagModel tagModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = rewardItemModel.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = rewardItemModel.icon;
        }
        if ((i13 & 4) != 0) {
            markdownTextModel = rewardItemModel.title;
        }
        if ((i13 & 8) != 0) {
            markdownTextModel2 = rewardItemModel.subtitle;
        }
        if ((i13 & 16) != 0) {
            tagModel = rewardItemModel.tag;
        }
        TagModel tagModel2 = tagModel;
        MarkdownTextModel markdownTextModel3 = markdownTextModel;
        return rewardItemModel.copy(str, str2, markdownTextModel3, markdownTextModel2, tagModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RewardItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.icon);
        }
        MarkdownTextModel$$serializer markdownTextModel$$serializer = MarkdownTextModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, markdownTextModel$$serializer, self.title);
        output.encodeSerializableElement(serialDesc, 3, markdownTextModel$$serializer, self.subtitle);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.tag == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, TagModel$$serializer.INSTANCE, self.tag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarkdownTextModel getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MarkdownTextModel getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    public final RewardItemModel copy(String imageUrl, String icon, MarkdownTextModel title, MarkdownTextModel subtitle, TagModel tag) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new RewardItemModel(imageUrl, icon, title, subtitle, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardItemModel)) {
            return false;
        }
        RewardItemModel rewardItemModel = (RewardItemModel) other;
        return AbstractC22676k.m65745e(this.imageUrl, rewardItemModel.imageUrl) && AbstractC22676k.m65745e(this.icon, rewardItemModel.icon) && AbstractC22676k.m65745e(this.title, rewardItemModel.title) && AbstractC22676k.m65745e(this.subtitle, rewardItemModel.subtitle) && AbstractC22676k.m65745e(this.tag, rewardItemModel.tag);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final MarkdownTextModel getSubtitle() {
        return this.subtitle;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final MarkdownTextModel getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (this.subtitle.hashCode() + ((this.title.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        TagModel tagModel = this.tag;
        return iHashCode2 + (tagModel != null ? tagModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.icon;
        MarkdownTextModel markdownTextModel = this.title;
        MarkdownTextModel markdownTextModel2 = this.subtitle;
        TagModel tagModel = this.tag;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RewardItemModel(imageUrl=", str, ", icon=", str2, ", title=");
        sbM32001t.append(markdownTextModel);
        sbM32001t.append(", subtitle=");
        sbM32001t.append(markdownTextModel2);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public RewardItemModel(String str, String str2, MarkdownTextModel title, MarkdownTextModel subtitle, TagModel tagModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.imageUrl = str;
        this.icon = str2;
        this.title = title;
        this.subtitle = subtitle;
        this.tag = tagModel;
    }

    public /* synthetic */ RewardItemModel(String str, String str2, MarkdownTextModel markdownTextModel, MarkdownTextModel markdownTextModel2, TagModel tagModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, markdownTextModel, markdownTextModel2, (i13 & 16) != 0 ? null : tagModel);
    }
}
