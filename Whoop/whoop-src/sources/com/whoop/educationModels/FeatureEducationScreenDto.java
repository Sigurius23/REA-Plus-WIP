package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.CtaTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ve.C35916a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mlB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bB³\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010#J¸\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b8\u0010&J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010!J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010!R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010K\u0012\u0004\bM\u0010J\u001a\u0004\bL\u0010#R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010K\u0012\u0004\bO\u0010J\u001a\u0004\bN\u0010#R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010P\u0012\u0004\bR\u0010J\u001a\u0004\bQ\u0010&R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010P\u0012\u0004\bT\u0010J\u001a\u0004\bS\u0010&R \u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010P\u0012\u0004\bV\u0010J\u001a\u0004\bU\u0010&R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010G\u0012\u0004\bX\u0010J\u001a\u0004\bW\u0010!R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010Y\u0012\u0004\b[\u0010J\u001a\u0004\bZ\u0010+R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\\\u0012\u0004\b^\u0010J\u001a\u0004\b]\u0010-R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010_\u0012\u0004\ba\u0010J\u001a\u0004\b`\u0010/R \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010G\u0012\u0004\bc\u0010J\u001a\u0004\bb\u0010!R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010d\u0012\u0004\bf\u0010J\u001a\u0004\be\u00102R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010g\u0012\u0004\bi\u0010J\u001a\u0004\bh\u00104R(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010K\u0012\u0004\bk\u0010J\u001a\u0004\bj\u0010#¨\u0006n"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationScreenDto;", "", "", "screenId", "", "Lcom/whoop/educationModels/FeatureEducationParagraphDto;", "paragraphs", "sections", "", "createdAt", "updatedAt", "screenName", "featureId", "Lcom/whoop/educationModels/FeatureEducationBackgroundDto;", "background", "Lcom/whoop/educationModels/ImageDto;", "heroImage", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "video", "sortOrder", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "ctaButton", "Lcom/whoop/educationModels/NavBarDto;", "navBar", "Lcom/whoop/design/models/items/CtaTileModel;", "ctas", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/FeatureEducationBackgroundDto;Lcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;ILcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/NavBarDto;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/FeatureEducationBackgroundDto;Lcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;ILcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/NavBarDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "()Lcom/whoop/educationModels/FeatureEducationBackgroundDto;", "component9", "()Lcom/whoop/educationModels/ImageDto;", "component10", "()Lcom/whoop/educationModels/FeatureEducationVideoDto;", "component11", "component12", "()Lcom/whoop/educationModels/FeatureEducationButtonDto;", "component13", "()Lcom/whoop/educationModels/NavBarDto;", "component14", "copy", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/educationModels/FeatureEducationBackgroundDto;Lcom/whoop/educationModels/ImageDto;Lcom/whoop/educationModels/FeatureEducationVideoDto;ILcom/whoop/educationModels/FeatureEducationButtonDto;Lcom/whoop/educationModels/NavBarDto;Ljava/util/List;)Lcom/whoop/educationModels/FeatureEducationScreenDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationScreenDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getScreenId", "getScreenId$annotations", "()V", "Ljava/util/List;", "getParagraphs", "getParagraphs$annotations", "getSections", "getSections$annotations", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getScreenName", "getScreenName$annotations", "getFeatureId", "getFeatureId$annotations", "Lcom/whoop/educationModels/FeatureEducationBackgroundDto;", "getBackground", "getBackground$annotations", "Lcom/whoop/educationModels/ImageDto;", "getHeroImage", "getHeroImage$annotations", "Lcom/whoop/educationModels/FeatureEducationVideoDto;", "getVideo", "getVideo$annotations", "getSortOrder", "getSortOrder$annotations", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "getCtaButton", "getCtaButton$annotations", "Lcom/whoop/educationModels/NavBarDto;", "getNavBar", "getNavBar$annotations", "getCtas", "getCtas$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationScreenDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("background")
    private final FeatureEducationBackgroundDto background;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("ctabutton")
    private final FeatureEducationButtonDto ctaButton;

    @SerializedName("cta_tiles")
    private final List<CtaTileModel> ctas;

    @SerializedName("feature_id")
    private final int featureId;

    @SerializedName("image")
    private final ImageDto heroImage;

    @SerializedName("navigation_bar")
    private final NavBarDto navBar;

    @SerializedName("paragraphs")
    private final List<FeatureEducationParagraphDto> paragraphs;

    @SerializedName("id")
    private final int screenId;

    @SerializedName("name")
    private final String screenName;

    @SerializedName("sections")
    private final List<FeatureEducationParagraphDto> sections;

    @SerializedName("sort_order")
    private final int sortOrder;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("video")
    private final FeatureEducationVideoDto video;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationScreenDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationScreenDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationScreenDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C35916a(7)), AbstractC30060g.m92087G(enumC23463i, new C35916a(8)), null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35916a(9))};
    }

    public /* synthetic */ FeatureEducationScreenDto(int i13, int i14, List list, List list2, String str, String str2, String str3, int i15, FeatureEducationBackgroundDto featureEducationBackgroundDto, ImageDto imageDto, FeatureEducationVideoDto featureEducationVideoDto, int i16, FeatureEducationButtonDto featureEducationButtonDto, NavBarDto navBarDto, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i13 & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16383, FeatureEducationScreenDto$$serializer.INSTANCE.getDescriptor());
        }
        this.screenId = i14;
        this.paragraphs = list;
        this.sections = list2;
        this.createdAt = str;
        this.updatedAt = str2;
        this.screenName = str3;
        this.featureId = i15;
        this.background = featureEducationBackgroundDto;
        this.heroImage = imageDto;
        this.video = featureEducationVideoDto;
        this.sortOrder = i16;
        this.ctaButton = featureEducationButtonDto;
        this.navBar = navBarDto;
        this.ctas = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(FeatureEducationParagraphDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(FeatureEducationParagraphDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(CtaTileModel$$serializer.INSTANCE);
    }

    @InterfaceC37143h("background")
    public static /* synthetic */ void getBackground$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("ctabutton")
    public static /* synthetic */ void getCtaButton$annotations() {
    }

    @InterfaceC37143h("cta_tiles")
    public static /* synthetic */ void getCtas$annotations() {
    }

    @InterfaceC37143h("feature_id")
    public static /* synthetic */ void getFeatureId$annotations() {
    }

    @InterfaceC37143h("image")
    public static /* synthetic */ void getHeroImage$annotations() {
    }

    @InterfaceC37143h("navigation_bar")
    public static /* synthetic */ void getNavBar$annotations() {
    }

    @InterfaceC37143h("paragraphs")
    public static /* synthetic */ void getParagraphs$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getScreenId$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getScreenName$annotations() {
    }

    @InterfaceC37143h("sections")
    public static /* synthetic */ void getSections$annotations() {
    }

    @InterfaceC37143h("sort_order")
    public static /* synthetic */ void getSortOrder$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @InterfaceC37143h("video")
    public static /* synthetic */ void getVideo$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationScreenDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.screenId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.paragraphs);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeStringElement(serialDesc, 3, self.createdAt);
        output.encodeStringElement(serialDesc, 4, self.updatedAt);
        output.encodeStringElement(serialDesc, 5, self.screenName);
        output.encodeIntElement(serialDesc, 6, self.featureId);
        output.encodeSerializableElement(serialDesc, 7, FeatureEducationBackgroundDto$$serializer.INSTANCE, self.background);
        output.encodeNullableSerializableElement(serialDesc, 8, ImageDto$$serializer.INSTANCE, self.heroImage);
        output.encodeNullableSerializableElement(serialDesc, 9, FeatureEducationVideoDto$$serializer.INSTANCE, self.video);
        output.encodeIntElement(serialDesc, 10, self.sortOrder);
        output.encodeNullableSerializableElement(serialDesc, 11, FeatureEducationButtonDto$$serializer.INSTANCE, self.ctaButton);
        output.encodeNullableSerializableElement(serialDesc, 12, NavBarDto$$serializer.INSTANCE, self.navBar);
        output.encodeNullableSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.ctas);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScreenId() {
        return this.screenId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final FeatureEducationVideoDto getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final FeatureEducationButtonDto getCtaButton() {
        return this.ctaButton;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final NavBarDto getNavBar() {
        return this.navBar;
    }

    public final List<CtaTileModel> component14() {
        return this.ctas;
    }

    public final List<FeatureEducationParagraphDto> component2() {
        return this.paragraphs;
    }

    public final List<FeatureEducationParagraphDto> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFeatureId() {
        return this.featureId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final FeatureEducationBackgroundDto getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ImageDto getHeroImage() {
        return this.heroImage;
    }

    public final FeatureEducationScreenDto copy(int screenId, List<FeatureEducationParagraphDto> paragraphs, List<FeatureEducationParagraphDto> sections, String createdAt, String updatedAt, String screenName, int featureId, FeatureEducationBackgroundDto background, ImageDto heroImage, FeatureEducationVideoDto video, int sortOrder, FeatureEducationButtonDto ctaButton, NavBarDto navBar, List<CtaTileModel> ctas) {
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(background, "background");
        return new FeatureEducationScreenDto(screenId, paragraphs, sections, createdAt, updatedAt, screenName, featureId, background, heroImage, video, sortOrder, ctaButton, navBar, ctas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationScreenDto)) {
            return false;
        }
        FeatureEducationScreenDto featureEducationScreenDto = (FeatureEducationScreenDto) other;
        return this.screenId == featureEducationScreenDto.screenId && AbstractC22676k.m65745e(this.paragraphs, featureEducationScreenDto.paragraphs) && AbstractC22676k.m65745e(this.sections, featureEducationScreenDto.sections) && AbstractC22676k.m65745e(this.createdAt, featureEducationScreenDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationScreenDto.updatedAt) && AbstractC22676k.m65745e(this.screenName, featureEducationScreenDto.screenName) && this.featureId == featureEducationScreenDto.featureId && AbstractC22676k.m65745e(this.background, featureEducationScreenDto.background) && AbstractC22676k.m65745e(this.heroImage, featureEducationScreenDto.heroImage) && AbstractC22676k.m65745e(this.video, featureEducationScreenDto.video) && this.sortOrder == featureEducationScreenDto.sortOrder && AbstractC22676k.m65745e(this.ctaButton, featureEducationScreenDto.ctaButton) && AbstractC22676k.m65745e(this.navBar, featureEducationScreenDto.navBar) && AbstractC22676k.m65745e(this.ctas, featureEducationScreenDto.ctas);
    }

    public final FeatureEducationBackgroundDto getBackground() {
        return this.background;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final FeatureEducationButtonDto getCtaButton() {
        return this.ctaButton;
    }

    public final List<CtaTileModel> getCtas() {
        return this.ctas;
    }

    public final int getFeatureId() {
        return this.featureId;
    }

    public final ImageDto getHeroImage() {
        return this.heroImage;
    }

    public final NavBarDto getNavBar() {
        return this.navBar;
    }

    public final List<FeatureEducationParagraphDto> getParagraphs() {
        return this.paragraphs;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final List<FeatureEducationParagraphDto> getSections() {
        return this.sections;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final FeatureEducationVideoDto getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = (this.background.hashCode() + AbstractC11266d.m30448b(this.featureId, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b(Integer.hashCode(this.screenId) * 31, 31, this.paragraphs), 31, this.sections), 31, this.createdAt), 31, this.updatedAt), 31, this.screenName), 31)) * 31;
        ImageDto imageDto = this.heroImage;
        int iHashCode2 = (iHashCode + (imageDto == null ? 0 : imageDto.hashCode())) * 31;
        FeatureEducationVideoDto featureEducationVideoDto = this.video;
        int iM30448b = AbstractC11266d.m30448b(this.sortOrder, (iHashCode2 + (featureEducationVideoDto == null ? 0 : featureEducationVideoDto.hashCode())) * 31, 31);
        FeatureEducationButtonDto featureEducationButtonDto = this.ctaButton;
        int iHashCode3 = (iM30448b + (featureEducationButtonDto == null ? 0 : featureEducationButtonDto.hashCode())) * 31;
        NavBarDto navBarDto = this.navBar;
        int iHashCode4 = (iHashCode3 + (navBarDto == null ? 0 : navBarDto.hashCode())) * 31;
        List<CtaTileModel> list = this.ctas;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.screenId;
        List<FeatureEducationParagraphDto> list = this.paragraphs;
        List<FeatureEducationParagraphDto> list2 = this.sections;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.screenName;
        int i14 = this.featureId;
        FeatureEducationBackgroundDto featureEducationBackgroundDto = this.background;
        ImageDto imageDto = this.heroImage;
        FeatureEducationVideoDto featureEducationVideoDto = this.video;
        int i15 = this.sortOrder;
        FeatureEducationButtonDto featureEducationButtonDto = this.ctaButton;
        NavBarDto navBarDto = this.navBar;
        List<CtaTileModel> list3 = this.ctas;
        StringBuilder sb4 = new StringBuilder("FeatureEducationScreenDto(screenId=");
        sb4.append(i13);
        sb4.append(", paragraphs=");
        sb4.append(list);
        sb4.append(", sections=");
        AbstractC17176i.m48511m(", createdAt=", str, ", updatedAt=", sb4, list2);
        AbstractC11266d.m30444B(sb4, str2, ", screenName=", str3, ", featureId=");
        sb4.append(i14);
        sb4.append(", background=");
        sb4.append(featureEducationBackgroundDto);
        sb4.append(", heroImage=");
        sb4.append(imageDto);
        sb4.append(", video=");
        sb4.append(featureEducationVideoDto);
        sb4.append(", sortOrder=");
        sb4.append(i15);
        sb4.append(", ctaButton=");
        sb4.append(featureEducationButtonDto);
        sb4.append(", navBar=");
        sb4.append(navBarDto);
        sb4.append(", ctas=");
        sb4.append(list3);
        sb4.append(")");
        return sb4.toString();
    }

    public FeatureEducationScreenDto(int i13, List<FeatureEducationParagraphDto> paragraphs, List<FeatureEducationParagraphDto> sections, String createdAt, String updatedAt, String screenName, int i14, FeatureEducationBackgroundDto background, ImageDto imageDto, FeatureEducationVideoDto featureEducationVideoDto, int i15, FeatureEducationButtonDto featureEducationButtonDto, NavBarDto navBarDto, List<CtaTileModel> list) {
        AbstractC22676k.m65750j(paragraphs, "paragraphs");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(screenName, "screenName");
        AbstractC22676k.m65750j(background, "background");
        this.screenId = i13;
        this.paragraphs = paragraphs;
        this.sections = sections;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.screenName = screenName;
        this.featureId = i14;
        this.background = background;
        this.heroImage = imageDto;
        this.video = featureEducationVideoDto;
        this.sortOrder = i15;
        this.ctaButton = featureEducationButtonDto;
        this.navBar = navBarDto;
        this.ctas = list;
    }
}
