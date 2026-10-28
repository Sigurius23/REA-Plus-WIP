package com.whoop.design.models.items;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36965l;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 j2\u00020\u0001:\u0002kjBÇ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dBÙ\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b9\u00108J\u0010\u0010:\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b;\u0010<Jð\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b?\u0010$J\u0010\u0010@\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010P\u001a\u0004\bR\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bS\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bT\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bU\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bV\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bW\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bX\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bY\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bZ\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b\\\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010[\u001a\u0004\b]\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\b_\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010`\u001a\u0004\ba\u00104R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010b\u001a\u0004\bc\u00106R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010d\u001a\u0004\be\u00108R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010d\u001a\u0004\bf\u00108R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0019\u0010d\u001a\u0004\bg\u00108R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bi\u0010<¨\u0006l"}, m65681d2 = {"Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "endIcon", "titleImage", "header", "title", "titleTypography", "tierImage", "style", "category", "trackingValue", "Lcom/whoop/design/models/items/CardButtonModel;", "cardButton", "secondCardButton", "Lcom/whoop/design/models/items/FeatureListModel;", "featureList", "Lcom/whoop/design/models/items/DescriptionCardModel;", "descriptionCard", "", "items", "", "sectionTopPadding", "sectionBottomPadding", "interItemPadding", "Lcom/whoop/design/models/items/TagModel;", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/design/models/items/CardButtonModel;", "component12", "component13", "()Lcom/whoop/design/models/items/FeatureListModel;", "component14", "()Lcom/whoop/design/models/items/DescriptionCardModel;", "component15", "()Ljava/util/List;", "component16", "()F", "component17", "component18", "component19", "()Lcom/whoop/design/models/items/TagModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getEndIcon", "getTitleImage", "getHeader", "getTitle", "getTitleTypography", "getTierImage", "getStyle", "getCategory", "getTrackingValue", "Lcom/whoop/design/models/items/CardButtonModel;", "getCardButton", "getSecondCardButton", "Lcom/whoop/design/models/items/FeatureListModel;", "getFeatureList", "Lcom/whoop/design/models/items/DescriptionCardModel;", "getDescriptionCard", "Ljava/util/List;", "getItems", "F", "getSectionTopPadding", "getSectionBottomPadding", "getInterItemPadding", "Lcom/whoop/design/models/items/TagModel;", "getBadge", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpsellCardFeaturesModel implements DesignSystemModel {
    private final TagModel badge;
    private final CardButtonModel cardButton;
    private final String category;
    private final DescriptionCardModel descriptionCard;
    private final String endIcon;
    private final FeatureListModel featureList;
    private final String header;
    private final String id;
    private final float interItemPadding;
    private final List<DesignSystemModel> items;
    private final CardButtonModel secondCardButton;
    private final float sectionBottomPadding;
    private final float sectionTopPadding;
    private final String style;
    private final String tierImage;
    private final String title;
    private final String titleImage;
    private final String titleTypography;
    private final String trackingValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36965l(0)), null, null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/UpsellCardFeaturesModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpsellCardFeaturesModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpsellCardFeaturesModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, FeatureListModel featureListModel, DescriptionCardModel descriptionCardModel, List list, float f13, float f14, float f15, TagModel tagModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (294911 != (i13 & 294911)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 294911, UpsellCardFeaturesModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.endIcon = str2;
        this.titleImage = str3;
        this.header = str4;
        this.title = str5;
        this.titleTypography = str6;
        this.tierImage = str7;
        this.style = str8;
        this.category = str9;
        this.trackingValue = str10;
        this.cardButton = cardButtonModel;
        this.secondCardButton = cardButtonModel2;
        this.featureList = featureListModel;
        this.descriptionCard = descriptionCardModel;
        this.items = list;
        if ((32768 & i13) == 0) {
            this.sectionTopPadding = 0.0f;
        } else {
            this.sectionTopPadding = f13;
        }
        if ((65536 & i13) == 0) {
            this.sectionBottomPadding = 0.0f;
        } else {
            this.sectionBottomPadding = f14;
        }
        this.interItemPadding = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0 ? 12.0f : f15;
        this.badge = tagModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpsellCardFeaturesModel copy$default(UpsellCardFeaturesModel upsellCardFeaturesModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, FeatureListModel featureListModel, DescriptionCardModel descriptionCardModel, List list, float f13, float f14, float f15, TagModel tagModel, int i13, Object obj) {
        TagModel tagModel2;
        float f16;
        String str11 = (i13 & 1) != 0 ? upsellCardFeaturesModel.id : str;
        String str12 = (i13 & 2) != 0 ? upsellCardFeaturesModel.endIcon : str2;
        String str13 = (i13 & 4) != 0 ? upsellCardFeaturesModel.titleImage : str3;
        String str14 = (i13 & 8) != 0 ? upsellCardFeaturesModel.header : str4;
        String str15 = (i13 & 16) != 0 ? upsellCardFeaturesModel.title : str5;
        String str16 = (i13 & 32) != 0 ? upsellCardFeaturesModel.titleTypography : str6;
        String str17 = (i13 & 64) != 0 ? upsellCardFeaturesModel.tierImage : str7;
        String str18 = (i13 & 128) != 0 ? upsellCardFeaturesModel.style : str8;
        String str19 = (i13 & 256) != 0 ? upsellCardFeaturesModel.category : str9;
        String str20 = (i13 & 512) != 0 ? upsellCardFeaturesModel.trackingValue : str10;
        CardButtonModel cardButtonModel3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? upsellCardFeaturesModel.cardButton : cardButtonModel;
        CardButtonModel cardButtonModel4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? upsellCardFeaturesModel.secondCardButton : cardButtonModel2;
        FeatureListModel featureListModel2 = (i13 & 4096) != 0 ? upsellCardFeaturesModel.featureList : featureListModel;
        DescriptionCardModel descriptionCardModel2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? upsellCardFeaturesModel.descriptionCard : descriptionCardModel;
        String str21 = str11;
        List list2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? upsellCardFeaturesModel.items : list;
        float f17 = (i13 & 32768) != 0 ? upsellCardFeaturesModel.sectionTopPadding : f13;
        float f18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? upsellCardFeaturesModel.sectionBottomPadding : f14;
        float f19 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? upsellCardFeaturesModel.interItemPadding : f15;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            f16 = f19;
            tagModel2 = upsellCardFeaturesModel.badge;
        } else {
            tagModel2 = tagModel;
            f16 = f19;
        }
        return upsellCardFeaturesModel.copy(str21, str12, str13, str14, str15, str16, str17, str18, str19, str20, cardButtonModel3, cardButtonModel4, featureListModel2, descriptionCardModel2, list2, f17, f18, f16, tagModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(UpsellCardFeaturesModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.endIcon);
        output.encodeStringElement(serialDesc, 2, self.titleImage);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.header);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.titleTypography);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.tierImage);
        output.encodeStringElement(serialDesc, 7, self.style);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.category);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.trackingValue);
        CardButtonModel$$serializer cardButtonModel$$serializer = CardButtonModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 10, cardButtonModel$$serializer, self.cardButton);
        output.encodeNullableSerializableElement(serialDesc, 11, cardButtonModel$$serializer, self.secondCardButton);
        output.encodeNullableSerializableElement(serialDesc, 12, FeatureListModel$$serializer.INSTANCE, self.featureList);
        output.encodeNullableSerializableElement(serialDesc, 13, DescriptionCardModel$$serializer.INSTANCE, self.descriptionCard);
        output.encodeNullableSerializableElement(serialDesc, 14, (InterfaceC37145j) interfaceC23462hArr[14].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 15) || Float.compare(self.sectionTopPadding, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 15, self.sectionTopPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || Float.compare(self.sectionBottomPadding, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 16, self.sectionBottomPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || Float.compare(self.interItemPadding, 12.0f) != 0) {
            output.encodeFloatElement(serialDesc, 17, self.interItemPadding);
        }
        output.encodeNullableSerializableElement(serialDesc, 18, TagModel$$serializer.INSTANCE, self.badge);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CardButtonModel getSecondCardButton() {
        return this.secondCardButton;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final FeatureListModel getFeatureList() {
        return this.featureList;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final DescriptionCardModel getDescriptionCard() {
        return this.descriptionCard;
    }

    public final List<DesignSystemModel> component15() {
        return this.items;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final float getSectionTopPadding() {
        return this.sectionTopPadding;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final float getSectionBottomPadding() {
        return this.sectionBottomPadding;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final float getInterItemPadding() {
        return this.interItemPadding;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final TagModel getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTierImage() {
        return this.tierImage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final UpsellCardFeaturesModel copy(String id4, String endIcon, String titleImage, String header, String title, String titleTypography, String tierImage, String style, String category, String trackingValue, CardButtonModel cardButton, CardButtonModel secondCardButton, FeatureListModel featureList, DescriptionCardModel descriptionCard, List<? extends DesignSystemModel> items, float sectionTopPadding, float sectionBottomPadding, float interItemPadding, TagModel badge) {
        AbstractC22676k.m65750j(titleImage, "titleImage");
        AbstractC22676k.m65750j(style, "style");
        return new UpsellCardFeaturesModel(id4, endIcon, titleImage, header, title, titleTypography, tierImage, style, category, trackingValue, cardButton, secondCardButton, featureList, descriptionCard, items, sectionTopPadding, sectionBottomPadding, interItemPadding, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpsellCardFeaturesModel)) {
            return false;
        }
        UpsellCardFeaturesModel upsellCardFeaturesModel = (UpsellCardFeaturesModel) other;
        return AbstractC22676k.m65745e(this.id, upsellCardFeaturesModel.id) && AbstractC22676k.m65745e(this.endIcon, upsellCardFeaturesModel.endIcon) && AbstractC22676k.m65745e(this.titleImage, upsellCardFeaturesModel.titleImage) && AbstractC22676k.m65745e(this.header, upsellCardFeaturesModel.header) && AbstractC22676k.m65745e(this.title, upsellCardFeaturesModel.title) && AbstractC22676k.m65745e(this.titleTypography, upsellCardFeaturesModel.titleTypography) && AbstractC22676k.m65745e(this.tierImage, upsellCardFeaturesModel.tierImage) && AbstractC22676k.m65745e(this.style, upsellCardFeaturesModel.style) && AbstractC22676k.m65745e(this.category, upsellCardFeaturesModel.category) && AbstractC22676k.m65745e(this.trackingValue, upsellCardFeaturesModel.trackingValue) && AbstractC22676k.m65745e(this.cardButton, upsellCardFeaturesModel.cardButton) && AbstractC22676k.m65745e(this.secondCardButton, upsellCardFeaturesModel.secondCardButton) && AbstractC22676k.m65745e(this.featureList, upsellCardFeaturesModel.featureList) && AbstractC22676k.m65745e(this.descriptionCard, upsellCardFeaturesModel.descriptionCard) && AbstractC22676k.m65745e(this.items, upsellCardFeaturesModel.items) && Float.compare(this.sectionTopPadding, upsellCardFeaturesModel.sectionTopPadding) == 0 && Float.compare(this.sectionBottomPadding, upsellCardFeaturesModel.sectionBottomPadding) == 0 && Float.compare(this.interItemPadding, upsellCardFeaturesModel.interItemPadding) == 0 && AbstractC22676k.m65745e(this.badge, upsellCardFeaturesModel.badge);
    }

    public final TagModel getBadge() {
        return this.badge;
    }

    public final CardButtonModel getCardButton() {
        return this.cardButton;
    }

    public final String getCategory() {
        return this.category;
    }

    public final DescriptionCardModel getDescriptionCard() {
        return this.descriptionCard;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final FeatureListModel getFeatureList() {
        return this.featureList;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final float getInterItemPadding() {
        return this.interItemPadding;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final CardButtonModel getSecondCardButton() {
        return this.secondCardButton;
    }

    public final float getSectionBottomPadding() {
        return this.sectionBottomPadding;
    }

    public final float getSectionTopPadding() {
        return this.sectionTopPadding;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTierImage() {
        return this.tierImage;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleImage() {
        return this.titleImage;
    }

    public final String getTitleTypography() {
        return this.titleTypography;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endIcon;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.titleImage);
        String str3 = this.header;
        int iHashCode2 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titleTypography;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tierImage;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.style);
        String str7 = this.category;
        int iHashCode5 = (iM30450d2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.trackingValue;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.cardButton;
        int iHashCode7 = (iHashCode6 + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        CardButtonModel cardButtonModel2 = this.secondCardButton;
        int iHashCode8 = (iHashCode7 + (cardButtonModel2 == null ? 0 : cardButtonModel2.hashCode())) * 31;
        FeatureListModel featureListModel = this.featureList;
        int iHashCode9 = (iHashCode8 + (featureListModel == null ? 0 : featureListModel.hashCode())) * 31;
        DescriptionCardModel descriptionCardModel = this.descriptionCard;
        int iHashCode10 = (iHashCode9 + (descriptionCardModel == null ? 0 : descriptionCardModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.items;
        int iM30447a = AbstractC11266d.m30447a(this.interItemPadding, AbstractC11266d.m30447a(this.sectionBottomPadding, AbstractC11266d.m30447a(this.sectionTopPadding, (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        TagModel tagModel = this.badge;
        return iM30447a + (tagModel != null ? tagModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.endIcon;
        String str3 = this.titleImage;
        String str4 = this.header;
        String str5 = this.title;
        String str6 = this.titleTypography;
        String str7 = this.tierImage;
        String str8 = this.style;
        String str9 = this.category;
        String str10 = this.trackingValue;
        CardButtonModel cardButtonModel = this.cardButton;
        CardButtonModel cardButtonModel2 = this.secondCardButton;
        FeatureListModel featureListModel = this.featureList;
        DescriptionCardModel descriptionCardModel = this.descriptionCard;
        List<DesignSystemModel> list = this.items;
        float f13 = this.sectionTopPadding;
        float f14 = this.sectionBottomPadding;
        float f15 = this.interItemPadding;
        TagModel tagModel = this.badge;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpsellCardFeaturesModel(id=", str, ", endIcon=", str2, ", titleImage=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", header=", str4, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", titleTypography=", str6, ", tierImage=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", style=", str8, ", category=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", trackingValue=", str10, ", cardButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", secondCardButton=");
        sbM32001t.append(cardButtonModel2);
        sbM32001t.append(", featureList=");
        sbM32001t.append(featureListModel);
        sbM32001t.append(", descriptionCard=");
        sbM32001t.append(descriptionCardModel);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", sectionTopPadding=");
        sbM32001t.append(f13);
        sbM32001t.append(", sectionBottomPadding=");
        AbstractC30802r.m94772u(sbM32001t, f14, ", interItemPadding=", f15, ", badge=");
        sbM32001t.append(tagModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpsellCardFeaturesModel(String str, String str2, String titleImage, String str3, String str4, String str5, String str6, String style, String str7, String str8, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, FeatureListModel featureListModel, DescriptionCardModel descriptionCardModel, List<? extends DesignSystemModel> list, float f13, float f14, float f15, TagModel tagModel) {
        AbstractC22676k.m65750j(titleImage, "titleImage");
        AbstractC22676k.m65750j(style, "style");
        this.id = str;
        this.endIcon = str2;
        this.titleImage = titleImage;
        this.header = str3;
        this.title = str4;
        this.titleTypography = str5;
        this.tierImage = str6;
        this.style = style;
        this.category = str7;
        this.trackingValue = str8;
        this.cardButton = cardButtonModel;
        this.secondCardButton = cardButtonModel2;
        this.featureList = featureListModel;
        this.descriptionCard = descriptionCardModel;
        this.items = list;
        this.sectionTopPadding = f13;
        this.sectionBottomPadding = f14;
        this.interItemPadding = f15;
        this.badge = tagModel;
    }

    public /* synthetic */ UpsellCardFeaturesModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, FeatureListModel featureListModel, DescriptionCardModel descriptionCardModel, List list, float f13, float f14, float f15, TagModel tagModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, cardButtonModel, cardButtonModel2, featureListModel, descriptionCardModel, list, (i13 & 32768) != 0 ? 0.0f : f13, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? 0.0f : f14, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? 12.0f : f15, tagModel);
    }
}
