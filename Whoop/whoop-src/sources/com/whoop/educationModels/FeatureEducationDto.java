package com.whoop.educationModels;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
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
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_^Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u008c\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b1\u0010#J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u001a\u00104\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010C\u0012\u0004\bE\u0010B\u001a\u0004\bD\u0010\u001fR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010F\u0012\u0004\bH\u0010B\u001a\u0004\bG\u0010!R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010I\u0012\u0004\bK\u0010B\u001a\u0004\bJ\u0010#R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010I\u0012\u0004\bM\u0010B\u001a\u0004\bL\u0010#R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010N\u0012\u0004\bP\u0010B\u001a\u0004\bO\u0010&R \u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bR\u0010B\u001a\u0004\bQ\u0010#R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010S\u0012\u0004\bU\u0010B\u001a\u0004\bT\u0010)R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010S\u0012\u0004\bW\u0010B\u001a\u0004\bV\u0010)R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010X\u0012\u0004\bZ\u0010B\u001a\u0004\bY\u0010,R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010[\u0012\u0004\b]\u0010B\u001a\u0004\b\\\u0010.¨\u0006`"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationDto;", "", "", "storyId", "Lcom/whoop/educationModels/NavBarDto;", "navBar", "", "Lcom/whoop/educationModels/FeatureEducationScreenDto;", "screens", "", "createdAt", "updatedAt", "Lcom/whoop/data/onboarding/FeatureEducationType;", "type", "feature", "", "enabled", "deleted", "Lcom/whoop/educationModels/MediaHeader;", "mediaHeader", "Lcom/whoop/educationModels/StickyButton;", "stickyButton", "<init>", "(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Lcom/whoop/educationModels/NavBarDto;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/whoop/data/onboarding/FeatureEducationType;", "component7", "component8", "()Z", "component9", "component10", "()Lcom/whoop/educationModels/MediaHeader;", "component11", "()Lcom/whoop/educationModels/StickyButton;", "copy", "(ILcom/whoop/educationModels/NavBarDto;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;ZZLcom/whoop/educationModels/MediaHeader;Lcom/whoop/educationModels/StickyButton;)Lcom/whoop/educationModels/FeatureEducationDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getStoryId", "getStoryId$annotations", "()V", "Lcom/whoop/educationModels/NavBarDto;", "getNavBar", "getNavBar$annotations", "Ljava/util/List;", "getScreens", "getScreens$annotations", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Lcom/whoop/data/onboarding/FeatureEducationType;", "getType", "getType$annotations", "getFeature", "getFeature$annotations", "Z", "getEnabled", "getEnabled$annotations", "getDeleted", "getDeleted$annotations", "Lcom/whoop/educationModels/MediaHeader;", "getMediaHeader", "getMediaHeader$annotations", "Lcom/whoop/educationModels/StickyButton;", "getStickyButton", "getStickyButton$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("deleted")
    private final boolean deleted;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("feature")
    private final String feature;

    @SerializedName("media_header")
    private final MediaHeader mediaHeader;

    @SerializedName("navigation_bar")
    private final NavBarDto navBar;

    @SerializedName("screens")
    private final List<FeatureEducationScreenDto> screens;

    @SerializedName("sticky_button")
    private final StickyButton stickyButton;

    @SerializedName("id")
    private final int storyId;

    @SerializedName("name")
    private final FeatureEducationType type;

    @SerializedName("updated_at")
    private final String updatedAt;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C35916a(4)), null, null, AbstractC30060g.m92087G(enumC23463i, new C35916a(5)), null, null, null, null, null};
    }

    public /* synthetic */ FeatureEducationDto(int i13, int i14, NavBarDto navBarDto, List list, String str, String str2, FeatureEducationType featureEducationType, String str3, boolean z4, boolean z13, MediaHeader mediaHeader, StickyButton stickyButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (2015 != (i13 & 2015)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2015, FeatureEducationDto$$serializer.INSTANCE.getDescriptor());
        }
        this.storyId = i14;
        this.navBar = navBarDto;
        this.screens = list;
        this.createdAt = str;
        this.updatedAt = str2;
        if ((i13 & 32) == 0) {
            this.type = null;
        } else {
            this.type = featureEducationType;
        }
        this.feature = str3;
        this.enabled = z4;
        this.deleted = z13;
        this.mediaHeader = mediaHeader;
        this.stickyButton = stickyButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(FeatureEducationScreenDto$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.data.onboarding.FeatureEducationType", FeatureEducationType.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureEducationDto copy$default(FeatureEducationDto featureEducationDto, int i13, NavBarDto navBarDto, List list, String str, String str2, FeatureEducationType featureEducationType, String str3, boolean z4, boolean z13, MediaHeader mediaHeader, StickyButton stickyButton, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = featureEducationDto.storyId;
        }
        if ((i14 & 2) != 0) {
            navBarDto = featureEducationDto.navBar;
        }
        if ((i14 & 4) != 0) {
            list = featureEducationDto.screens;
        }
        if ((i14 & 8) != 0) {
            str = featureEducationDto.createdAt;
        }
        if ((i14 & 16) != 0) {
            str2 = featureEducationDto.updatedAt;
        }
        if ((i14 & 32) != 0) {
            featureEducationType = featureEducationDto.type;
        }
        if ((i14 & 64) != 0) {
            str3 = featureEducationDto.feature;
        }
        if ((i14 & 128) != 0) {
            z4 = featureEducationDto.enabled;
        }
        if ((i14 & 256) != 0) {
            z13 = featureEducationDto.deleted;
        }
        if ((i14 & 512) != 0) {
            mediaHeader = featureEducationDto.mediaHeader;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            stickyButton = featureEducationDto.stickyButton;
        }
        MediaHeader mediaHeader2 = mediaHeader;
        StickyButton stickyButton2 = stickyButton;
        boolean z14 = z4;
        boolean z15 = z13;
        FeatureEducationType featureEducationType2 = featureEducationType;
        String str4 = str3;
        String str5 = str2;
        List list2 = list;
        return featureEducationDto.copy(i13, navBarDto, list2, str, str5, featureEducationType2, str4, z14, z15, mediaHeader2, stickyButton2);
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("deleted")
    public static /* synthetic */ void getDeleted$annotations() {
    }

    @InterfaceC37143h("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @InterfaceC37143h("feature")
    public static /* synthetic */ void getFeature$annotations() {
    }

    @InterfaceC37143h("media_header")
    public static /* synthetic */ void getMediaHeader$annotations() {
    }

    @InterfaceC37143h("navigation_bar")
    public static /* synthetic */ void getNavBar$annotations() {
    }

    @InterfaceC37143h("screens")
    public static /* synthetic */ void getScreens$annotations() {
    }

    @InterfaceC37143h("sticky_button")
    public static /* synthetic */ void getStickyButton$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getStoryId$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getType$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.storyId);
        output.encodeNullableSerializableElement(serialDesc, 1, NavBarDto$$serializer.INSTANCE, self.navBar);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.screens);
        output.encodeStringElement(serialDesc, 3, self.createdAt);
        output.encodeStringElement(serialDesc, 4, self.updatedAt);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.type);
        }
        output.encodeStringElement(serialDesc, 6, self.feature);
        output.encodeBooleanElement(serialDesc, 7, self.enabled);
        output.encodeBooleanElement(serialDesc, 8, self.deleted);
        output.encodeNullableSerializableElement(serialDesc, 9, MediaHeader$$serializer.INSTANCE, self.mediaHeader);
        output.encodeNullableSerializableElement(serialDesc, 10, StickyButton$$serializer.INSTANCE, self.stickyButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStoryId() {
        return this.storyId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final MediaHeader getMediaHeader() {
        return this.mediaHeader;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final StickyButton getStickyButton() {
        return this.stickyButton;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavBarDto getNavBar() {
        return this.navBar;
    }

    public final List<FeatureEducationScreenDto> component3() {
        return this.screens;
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
    public final FeatureEducationType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFeature() {
        return this.feature;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final FeatureEducationDto copy(int storyId, NavBarDto navBar, List<FeatureEducationScreenDto> screens, String createdAt, String updatedAt, FeatureEducationType type, String feature, boolean enabled, boolean deleted, MediaHeader mediaHeader, StickyButton stickyButton) {
        AbstractC22676k.m65750j(screens, "screens");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(feature, "feature");
        return new FeatureEducationDto(storyId, navBar, screens, createdAt, updatedAt, type, feature, enabled, deleted, mediaHeader, stickyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationDto)) {
            return false;
        }
        FeatureEducationDto featureEducationDto = (FeatureEducationDto) other;
        return this.storyId == featureEducationDto.storyId && AbstractC22676k.m65745e(this.navBar, featureEducationDto.navBar) && AbstractC22676k.m65745e(this.screens, featureEducationDto.screens) && AbstractC22676k.m65745e(this.createdAt, featureEducationDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationDto.updatedAt) && this.type == featureEducationDto.type && AbstractC22676k.m65745e(this.feature, featureEducationDto.feature) && this.enabled == featureEducationDto.enabled && this.deleted == featureEducationDto.deleted && AbstractC22676k.m65745e(this.mediaHeader, featureEducationDto.mediaHeader) && AbstractC22676k.m65745e(this.stickyButton, featureEducationDto.stickyButton);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFeature() {
        return this.feature;
    }

    public final MediaHeader getMediaHeader() {
        return this.mediaHeader;
    }

    public final NavBarDto getNavBar() {
        return this.navBar;
    }

    public final List<FeatureEducationScreenDto> getScreens() {
        return this.screens;
    }

    public final StickyButton getStickyButton() {
        return this.stickyButton;
    }

    public final int getStoryId() {
        return this.storyId;
    }

    public final FeatureEducationType getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.storyId) * 31;
        NavBarDto navBarDto = this.navBar;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode + (navBarDto == null ? 0 : navBarDto.hashCode())) * 31, 31, this.screens), 31, this.createdAt), 31, this.updatedAt);
        FeatureEducationType featureEducationType = this.type;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((iM30450d + (featureEducationType == null ? 0 : featureEducationType.hashCode())) * 31, 31, this.feature), 31, this.enabled), 31, this.deleted);
        MediaHeader mediaHeader = this.mediaHeader;
        int iHashCode2 = (iM8289b + (mediaHeader == null ? 0 : mediaHeader.hashCode())) * 31;
        StickyButton stickyButton = this.stickyButton;
        return iHashCode2 + (stickyButton != null ? stickyButton.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.storyId;
        NavBarDto navBarDto = this.navBar;
        List<FeatureEducationScreenDto> list = this.screens;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        FeatureEducationType featureEducationType = this.type;
        String str3 = this.feature;
        boolean z4 = this.enabled;
        boolean z13 = this.deleted;
        MediaHeader mediaHeader = this.mediaHeader;
        StickyButton stickyButton = this.stickyButton;
        StringBuilder sb4 = new StringBuilder("FeatureEducationDto(storyId=");
        sb4.append(i13);
        sb4.append(", navBar=");
        sb4.append(navBarDto);
        sb4.append(", screens=");
        AbstractC17176i.m48511m(", createdAt=", str, ", updatedAt=", sb4, list);
        sb4.append(str2);
        sb4.append(", type=");
        sb4.append(featureEducationType);
        sb4.append(", feature=");
        AbstractC38963t7.m124390t(sb4, str3, ", enabled=", z4, ", deleted=");
        sb4.append(z13);
        sb4.append(", mediaHeader=");
        sb4.append(mediaHeader);
        sb4.append(", stickyButton=");
        sb4.append(stickyButton);
        sb4.append(")");
        return sb4.toString();
    }

    public FeatureEducationDto(int i13, NavBarDto navBarDto, List<FeatureEducationScreenDto> screens, String createdAt, String updatedAt, FeatureEducationType featureEducationType, String feature, boolean z4, boolean z13, MediaHeader mediaHeader, StickyButton stickyButton) {
        AbstractC22676k.m65750j(screens, "screens");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(feature, "feature");
        this.storyId = i13;
        this.navBar = navBarDto;
        this.screens = screens;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.type = featureEducationType;
        this.feature = feature;
        this.enabled = z4;
        this.deleted = z13;
        this.mediaHeader = mediaHeader;
        this.stickyButton = stickyButton;
    }

    public /* synthetic */ FeatureEducationDto(int i13, NavBarDto navBarDto, List list, String str, String str2, FeatureEducationType featureEducationType, String str3, boolean z4, boolean z13, MediaHeader mediaHeader, StickyButton stickyButton, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, navBarDto, list, str, str2, (i14 & 32) != 0 ? null : featureEducationType, str3, z4, z13, mediaHeader, stickyButton);
    }
}
