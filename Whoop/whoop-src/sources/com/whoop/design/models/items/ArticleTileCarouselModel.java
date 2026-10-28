package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(JV\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010(¨\u0006?"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "", "Lcom/whoop/design/models/items/ArticleTileModel;", "articleList", "Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;", "style", "accessibilityLabel", "Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;", "cta", "", "hideHeader", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;", "component4", "component5", "()Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;", "component6", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getArticleList", "Lcom/whoop/design/models/items/ArticleTileCarouselStyleDtoEnum;", "getStyle", "getAccessibilityLabel", "Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;", "getCta", "Ljava/lang/Boolean;", "getHideHeader", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ArticleTileCarouselModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String accessibilityLabel;
    private final List<ArticleTileModel> articleList;
    private final ArticleTileCarouselEventEnum cta;
    private final Boolean hideHeader;
    private final ArticleTileCarouselStyleDtoEnum style;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileCarouselModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ArticleTileCarouselModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ArticleTileCarouselModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36870a(27)), AbstractC30060g.m92087G(enumC23463i, new C36870a(28)), null, AbstractC30060g.m92087G(enumC23463i, new C36870a(29)), null};
    }

    public /* synthetic */ ArticleTileCarouselModel(int i13, String str, List list, ArticleTileCarouselStyleDtoEnum articleTileCarouselStyleDtoEnum, String str2, ArticleTileCarouselEventEnum articleTileCarouselEventEnum, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ArticleTileCarouselModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.articleList = list;
        this.style = articleTileCarouselStyleDtoEnum;
        this.accessibilityLabel = str2;
        this.cta = articleTileCarouselEventEnum;
        if ((i13 & 32) == 0) {
            this.hideHeader = null;
        } else {
            this.hideHeader = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ArticleTileModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ArticleTileCarouselStyleDtoEnum", ArticleTileCarouselStyleDtoEnum.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ArticleTileCarouselEventEnum", ArticleTileCarouselEventEnum.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleTileCarouselModel copy$default(ArticleTileCarouselModel articleTileCarouselModel, String str, List list, ArticleTileCarouselStyleDtoEnum articleTileCarouselStyleDtoEnum, String str2, ArticleTileCarouselEventEnum articleTileCarouselEventEnum, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = articleTileCarouselModel.title;
        }
        if ((i13 & 2) != 0) {
            list = articleTileCarouselModel.articleList;
        }
        if ((i13 & 4) != 0) {
            articleTileCarouselStyleDtoEnum = articleTileCarouselModel.style;
        }
        if ((i13 & 8) != 0) {
            str2 = articleTileCarouselModel.accessibilityLabel;
        }
        if ((i13 & 16) != 0) {
            articleTileCarouselEventEnum = articleTileCarouselModel.cta;
        }
        if ((i13 & 32) != 0) {
            bool = articleTileCarouselModel.hideHeader;
        }
        ArticleTileCarouselEventEnum articleTileCarouselEventEnum2 = articleTileCarouselEventEnum;
        Boolean bool2 = bool;
        return articleTileCarouselModel.copy(str, list, articleTileCarouselStyleDtoEnum, str2, articleTileCarouselEventEnum2, bool2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ArticleTileCarouselModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.articleList);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        output.encodeStringElement(serialDesc, 3, self.accessibilityLabel);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.cta);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.hideHeader == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.hideHeader);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ArticleTileModel> component2() {
        return this.articleList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ArticleTileCarouselStyleDtoEnum getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ArticleTileCarouselEventEnum getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getHideHeader() {
        return this.hideHeader;
    }

    public final ArticleTileCarouselModel copy(String title, List<ArticleTileModel> articleList, ArticleTileCarouselStyleDtoEnum style, String accessibilityLabel, ArticleTileCarouselEventEnum cta, Boolean hideHeader) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(articleList, "articleList");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        return new ArticleTileCarouselModel(title, articleList, style, accessibilityLabel, cta, hideHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleTileCarouselModel)) {
            return false;
        }
        ArticleTileCarouselModel articleTileCarouselModel = (ArticleTileCarouselModel) other;
        return AbstractC22676k.m65745e(this.title, articleTileCarouselModel.title) && AbstractC22676k.m65745e(this.articleList, articleTileCarouselModel.articleList) && this.style == articleTileCarouselModel.style && AbstractC22676k.m65745e(this.accessibilityLabel, articleTileCarouselModel.accessibilityLabel) && this.cta == articleTileCarouselModel.cta && AbstractC22676k.m65745e(this.hideHeader, articleTileCarouselModel.hideHeader);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final List<ArticleTileModel> getArticleList() {
        return this.articleList;
    }

    public final ArticleTileCarouselEventEnum getCta() {
        return this.cta;
    }

    public final Boolean getHideHeader() {
        return this.hideHeader;
    }

    public final ArticleTileCarouselStyleDtoEnum getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.style.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.articleList)) * 31, 31, this.accessibilityLabel);
        ArticleTileCarouselEventEnum articleTileCarouselEventEnum = this.cta;
        int iHashCode = (iM30450d + (articleTileCarouselEventEnum == null ? 0 : articleTileCarouselEventEnum.hashCode())) * 31;
        Boolean bool = this.hideHeader;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<ArticleTileModel> list = this.articleList;
        ArticleTileCarouselStyleDtoEnum articleTileCarouselStyleDtoEnum = this.style;
        String str2 = this.accessibilityLabel;
        ArticleTileCarouselEventEnum articleTileCarouselEventEnum = this.cta;
        Boolean bool = this.hideHeader;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ArticleTileCarouselModel(title=", str, ", articleList=", ", style=", list);
        sbM94766o.append(articleTileCarouselStyleDtoEnum);
        sbM94766o.append(", accessibilityLabel=");
        sbM94766o.append(str2);
        sbM94766o.append(", cta=");
        sbM94766o.append(articleTileCarouselEventEnum);
        sbM94766o.append(", hideHeader=");
        sbM94766o.append(bool);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public ArticleTileCarouselModel(String title, List<ArticleTileModel> articleList, ArticleTileCarouselStyleDtoEnum style, String accessibilityLabel, ArticleTileCarouselEventEnum articleTileCarouselEventEnum, Boolean bool) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(articleList, "articleList");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        this.title = title;
        this.articleList = articleList;
        this.style = style;
        this.accessibilityLabel = accessibilityLabel;
        this.cta = articleTileCarouselEventEnum;
        this.hideHeader = bool;
    }

    public /* synthetic */ ArticleTileCarouselModel(String str, List list, ArticleTileCarouselStyleDtoEnum articleTileCarouselStyleDtoEnum, String str2, ArticleTileCarouselEventEnum articleTileCarouselEventEnum, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, articleTileCarouselStyleDtoEnum, str2, articleTileCarouselEventEnum, (i13 & 32) != 0 ? null : bool);
    }
}
