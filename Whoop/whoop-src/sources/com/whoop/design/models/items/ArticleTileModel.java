package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 d2\u00020\u0001:\u0002edB§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB»\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105JÆ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010 J\u0010\u00109\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bJ\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bK\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bL\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bM\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bO\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bP\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bQ\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bR\u0010 R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010I\u0012\u0004\bT\u0010U\u001a\u0004\bS\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bV\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bW\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bY\u0010-R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Z\u001a\u0004\b[\u0010/\"\u0004\b\\\u0010]R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010`\u001a\u0004\ba\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010b\u001a\u0004\bc\u00105¨\u0006f"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "subText", "imageUrl", "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "type", "size", "icon", "paragraph", "publishDate", "tag", "articleUrl", "Lcom/whoop/design/models/items/ArticleTileModelEventEnum;", "cta", "", "index", "Lcom/whoop/design/models/items/TileBorderStyle;", "borderStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/whoop/design/models/items/ArticleTileModelEventEnum;", "component13", "()Ljava/lang/Integer;", "component14", "()Lcom/whoop/design/models/items/TileBorderStyle;", "component15", "()Lcom/whoop/navigation/models/GenericInteraction;", "component16", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/Integer;Lcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ArticleTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubText", "getImageUrl", "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "getType", "getSize", "getIcon", "getParagraph", "getPublishDate", "getPublishDate$annotations", "()V", "getTag", "getArticleUrl", "Lcom/whoop/design/models/items/ArticleTileModelEventEnum;", "getCta", "Ljava/lang/Integer;", "getIndex", "setIndex", "(Ljava/lang/Integer;)V", "Lcom/whoop/design/models/items/TileBorderStyle;", "getBorderStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ArticleTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AnalyticEventModel analyticEvent;
    private final String articleUrl;
    private final TileBorderStyle borderStyle;
    private final ArticleTileModelEventEnum cta;
    private final GenericInteraction genericInteraction;
    private final String icon;
    private final String id;
    private final String imageUrl;
    private Integer index;
    private final String paragraph;
    private final String publishDate;
    private final String size;
    private final String subText;
    private final String tag;
    private final String title;
    private final ArticleTileTypeDtoEnum type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ArticleTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ArticleTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(0)), null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(1)), null, AbstractC30060g.m92087G(enumC23463i, new C36954a(2)), null, null};
    }

    public /* synthetic */ ArticleTileModel(int i13, String str, String str2, String str3, String str4, ArticleTileTypeDtoEnum articleTileTypeDtoEnum, String str5, String str6, String str7, String str8, String str9, String str10, ArticleTileModelEventEnum articleTileModelEventEnum, Integer num, TileBorderStyle tileBorderStyle, GenericInteraction genericInteraction, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (4091 != (i13 & 4091)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4091, ArticleTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        if ((i13 & 4) == 0) {
            this.subText = null;
        } else {
            this.subText = str3;
        }
        this.imageUrl = str4;
        this.type = articleTileTypeDtoEnum;
        this.size = str5;
        this.icon = str6;
        this.paragraph = str7;
        this.publishDate = str8;
        this.tag = str9;
        this.articleUrl = str10;
        this.cta = articleTileModelEventEnum;
        if ((i13 & 4096) == 0) {
            this.index = null;
        } else {
            this.index = num;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.borderStyle = null;
        } else {
            this.borderStyle = tileBorderStyle;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
        if ((i13 & 32768) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ArticleTileTypeDtoEnum", ArticleTileTypeDtoEnum.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.ArticleTileModelEventEnum", ArticleTileModelEventEnum.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TileBorderStyle", TileBorderStyle.values());
    }

    @InterfaceC23457c
    public static /* synthetic */ void getPublishDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ArticleTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subText != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subText);
        }
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.type);
        output.encodeStringElement(serialDesc, 5, self.size);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.paragraph);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.publishDate);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.articleUrl);
        output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.cta);
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.index != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, IntSerializer.INSTANCE, self.index);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.borderStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.borderStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.genericInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 15, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getArticleUrl() {
        return this.articleUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ArticleTileModelEventEnum getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TileBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ArticleTileTypeDtoEnum getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getParagraph() {
        return this.paragraph;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPublishDate() {
        return this.publishDate;
    }

    public final ArticleTileModel copy(String id4, String title, String subText, String imageUrl, ArticleTileTypeDtoEnum type, String size, String icon, String paragraph, String publishDate, String tag, String articleUrl, ArticleTileModelEventEnum cta, Integer index, TileBorderStyle borderStyle, GenericInteraction genericInteraction, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(size, "size");
        return new ArticleTileModel(id4, title, subText, imageUrl, type, size, icon, paragraph, publishDate, tag, articleUrl, cta, index, borderStyle, genericInteraction, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleTileModel)) {
            return false;
        }
        ArticleTileModel articleTileModel = (ArticleTileModel) other;
        return AbstractC22676k.m65745e(this.id, articleTileModel.id) && AbstractC22676k.m65745e(this.title, articleTileModel.title) && AbstractC22676k.m65745e(this.subText, articleTileModel.subText) && AbstractC22676k.m65745e(this.imageUrl, articleTileModel.imageUrl) && this.type == articleTileModel.type && AbstractC22676k.m65745e(this.size, articleTileModel.size) && AbstractC22676k.m65745e(this.icon, articleTileModel.icon) && AbstractC22676k.m65745e(this.paragraph, articleTileModel.paragraph) && AbstractC22676k.m65745e(this.publishDate, articleTileModel.publishDate) && AbstractC22676k.m65745e(this.tag, articleTileModel.tag) && AbstractC22676k.m65745e(this.articleUrl, articleTileModel.articleUrl) && this.cta == articleTileModel.cta && AbstractC22676k.m65745e(this.index, articleTileModel.index) && this.borderStyle == articleTileModel.borderStyle && AbstractC22676k.m65745e(this.genericInteraction, articleTileModel.genericInteraction) && AbstractC22676k.m65745e(this.analyticEvent, articleTileModel.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final String getArticleUrl() {
        return this.articleUrl;
    }

    public final TileBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    public final ArticleTileModelEventEnum getCta() {
        return this.cta;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getParagraph() {
        return this.paragraph;
    }

    public final String getPublishDate() {
        return this.publishDate;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getSubText() {
        return this.subText;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ArticleTileTypeDtoEnum getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subText;
        int iM30450d2 = AbstractC11266d.m30450d((this.type.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.imageUrl)) * 31, 31, this.size);
        String str2 = this.icon;
        int iHashCode = (iM30450d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paragraph;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.publishDate;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tag;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.articleUrl;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArticleTileModelEventEnum articleTileModelEventEnum = this.cta;
        int iHashCode6 = (iHashCode5 + (articleTileModelEventEnum == null ? 0 : articleTileModelEventEnum.hashCode())) * 31;
        Integer num = this.index;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        TileBorderStyle tileBorderStyle = this.borderStyle;
        int iHashCode8 = (iHashCode7 + (tileBorderStyle == null ? 0 : tileBorderStyle.hashCode())) * 31;
        GenericInteraction genericInteraction = this.genericInteraction;
        int iHashCode9 = (iHashCode8 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode9 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subText;
        String str4 = this.imageUrl;
        ArticleTileTypeDtoEnum articleTileTypeDtoEnum = this.type;
        String str5 = this.size;
        String str6 = this.icon;
        String str7 = this.paragraph;
        String str8 = this.publishDate;
        String str9 = this.tag;
        String str10 = this.articleUrl;
        ArticleTileModelEventEnum articleTileModelEventEnum = this.cta;
        Integer num = this.index;
        TileBorderStyle tileBorderStyle = this.borderStyle;
        GenericInteraction genericInteraction = this.genericInteraction;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ArticleTileModel(id=", str, ", title=", str2, ", subText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", type=");
        sbM32001t.append(articleTileTypeDtoEnum);
        sbM32001t.append(", size=");
        sbM32001t.append(str5);
        sbM32001t.append(", icon=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", paragraph=", str7, ", publishDate=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", tag=", str9, ", articleUrl=");
        sbM32001t.append(str10);
        sbM32001t.append(", cta=");
        sbM32001t.append(articleTileModelEventEnum);
        sbM32001t.append(", index=");
        sbM32001t.append(num);
        sbM32001t.append(", borderStyle=");
        sbM32001t.append(tileBorderStyle);
        sbM32001t.append(", genericInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ArticleTileModel(String id4, String title, String str, String imageUrl, ArticleTileTypeDtoEnum type, String size, String str2, String str3, String str4, String str5, String str6, ArticleTileModelEventEnum articleTileModelEventEnum, Integer num, TileBorderStyle tileBorderStyle, GenericInteraction genericInteraction, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(size, "size");
        this.id = id4;
        this.title = title;
        this.subText = str;
        this.imageUrl = imageUrl;
        this.type = type;
        this.size = size;
        this.icon = str2;
        this.paragraph = str3;
        this.publishDate = str4;
        this.tag = str5;
        this.articleUrl = str6;
        this.cta = articleTileModelEventEnum;
        this.index = num;
        this.borderStyle = tileBorderStyle;
        this.genericInteraction = genericInteraction;
        this.analyticEvent = analyticEventModel;
    }

    public /* synthetic */ ArticleTileModel(String str, String str2, String str3, String str4, ArticleTileTypeDtoEnum articleTileTypeDtoEnum, String str5, String str6, String str7, String str8, String str9, String str10, ArticleTileModelEventEnum articleTileModelEventEnum, Integer num, TileBorderStyle tileBorderStyle, GenericInteraction genericInteraction, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, str4, articleTileTypeDtoEnum, str5, str6, str7, str8, str9, str10, articleTileModelEventEnum, (i13 & 4096) != 0 ? null : num, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : tileBorderStyle, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : genericInteraction, (i13 & 32768) != 0 ? null : analyticEventModel);
    }
}
