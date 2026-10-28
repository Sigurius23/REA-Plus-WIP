package com.whoop.design.models.items;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u009a\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u0010\u0010-\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010=\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\bB\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010=\u0012\u0004\bD\u0010A\u001a\u0004\bC\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010=\u0012\u0004\bF\u0010A\u001a\u0004\bE\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010G\u0012\u0004\bI\u0010A\u001a\u0004\bH\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\bK\u0010A\u001a\u0004\bJ\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bL\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\bN\u0010A\u001a\u0004\bM\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010O\u0012\u0004\bQ\u0010A\u001a\u0004\bP\u0010%R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010R\u0012\u0004\bT\u0010A\u001a\u0004\bS\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u0010)¨\u0006Y"}, m65681d2 = {"Lcom/whoop/design/models/items/ProfileInfoTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "layoutStyle", "title", "image", "imageStyle", "topItem", "endIcon", "subtitle", "familyPlanId", "", "userId", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/design/models/DesignSystemModel;", "component7", "component8", "component9", "component10", "()Ljava/lang/Long;", "component11", "()Lcom/whoop/navigation/e;", "component12", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/ProfileInfoTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ProfileInfoTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getLayoutStyle", "getLayoutStyle$annotations", "()V", "getTitle", "getImage", "getImage$annotations", "getImageStyle", "getImageStyle$annotations", "Lcom/whoop/design/models/DesignSystemModel;", "getTopItem", "getTopItem$annotations", "getEndIcon", "getEndIcon$annotations", "getSubtitle", "getFamilyPlanId", "getFamilyPlanId$annotations", "Ljava/lang/Long;", "getUserId", "getUserId$annotations", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProfileInfoTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;

    @SerializedName("end_icon")
    private final String endIcon;

    @SerializedName("family_plan_id")
    private final String familyPlanId;
    private final String id;

    @SerializedName("image_url")
    private final String image;

    @SerializedName("image_style")
    private final String imageStyle;
    private final GenericInteraction interaction;

    @SerializedName("layout_style")
    private final String layoutStyle;
    private final String subtitle;
    private final String title;

    @SerializedName("top_item")
    private final DesignSystemModel topItem;

    @SerializedName("user_id")
    private final Long userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable | C9598e.f28134d;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ProfileInfoTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ProfileInfoTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProfileInfoTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(4)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(5)), null};
    }

    public /* synthetic */ ProfileInfoTileModel(int i13, String str, String str2, String str3, String str4, String str5, DesignSystemModel designSystemModel, String str6, String str7, String str8, Long l7, C9598e c9598e, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (2031 != (i13 & 2031)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2031, ProfileInfoTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.layoutStyle = str2;
        this.title = str3;
        this.image = str4;
        if ((i13 & 16) == 0) {
            this.imageStyle = null;
        } else {
            this.imageStyle = str5;
        }
        this.topItem = designSystemModel;
        this.endIcon = str6;
        this.subtitle = str7;
        this.familyPlanId = str8;
        this.userId = l7;
        this.destination = c9598e;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ProfileInfoTileModel copy$default(ProfileInfoTileModel profileInfoTileModel, String str, String str2, String str3, String str4, String str5, DesignSystemModel designSystemModel, String str6, String str7, String str8, Long l7, C9598e c9598e, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = profileInfoTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = profileInfoTileModel.layoutStyle;
        }
        if ((i13 & 4) != 0) {
            str3 = profileInfoTileModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = profileInfoTileModel.image;
        }
        if ((i13 & 16) != 0) {
            str5 = profileInfoTileModel.imageStyle;
        }
        if ((i13 & 32) != 0) {
            designSystemModel = profileInfoTileModel.topItem;
        }
        if ((i13 & 64) != 0) {
            str6 = profileInfoTileModel.endIcon;
        }
        if ((i13 & 128) != 0) {
            str7 = profileInfoTileModel.subtitle;
        }
        if ((i13 & 256) != 0) {
            str8 = profileInfoTileModel.familyPlanId;
        }
        if ((i13 & 512) != 0) {
            l7 = profileInfoTileModel.userId;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c9598e = profileInfoTileModel.destination;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            genericInteraction = profileInfoTileModel.interaction;
        }
        C9598e c9598e2 = c9598e;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str9 = str8;
        Long l12 = l7;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        DesignSystemModel designSystemModel2 = designSystemModel;
        return profileInfoTileModel.copy(str, str2, str3, str4, str12, designSystemModel2, str10, str11, str9, l12, c9598e2, genericInteraction2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("end_icon")
    public static /* synthetic */ void getEndIcon$annotations() {
    }

    @InterfaceC37143h("family_plan_id")
    public static /* synthetic */ void getFamilyPlanId$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImage$annotations() {
    }

    @InterfaceC37143h("image_style")
    public static /* synthetic */ void getImageStyle$annotations() {
    }

    @InterfaceC37143h("layout_style")
    public static /* synthetic */ void getLayoutStyle$annotations() {
    }

    @InterfaceC37143h("top_item")
    public static /* synthetic */ void getTopItem$annotations() {
    }

    @InterfaceC37143h("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProfileInfoTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.layoutStyle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.image);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.imageStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.imageStyle);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.topItem);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.endIcon);
        output.encodeStringElement(serialDesc, 7, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.familyPlanId);
        output.encodeNullableSerializableElement(serialDesc, 9, LongSerializer.INSTANCE, self.userId);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.destination);
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.interaction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayoutStyle() {
        return this.layoutStyle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageStyle() {
        return this.imageStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DesignSystemModel getTopItem() {
        return this.topItem;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFamilyPlanId() {
        return this.familyPlanId;
    }

    public final ProfileInfoTileModel copy(String id4, String layoutStyle, String title, String image, String imageStyle, DesignSystemModel topItem, String endIcon, String subtitle, String familyPlanId, Long userId, C9598e destination, GenericInteraction interaction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(layoutStyle, "layoutStyle");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new ProfileInfoTileModel(id4, layoutStyle, title, image, imageStyle, topItem, endIcon, subtitle, familyPlanId, userId, destination, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileInfoTileModel)) {
            return false;
        }
        ProfileInfoTileModel profileInfoTileModel = (ProfileInfoTileModel) other;
        return AbstractC22676k.m65745e(this.id, profileInfoTileModel.id) && AbstractC22676k.m65745e(this.layoutStyle, profileInfoTileModel.layoutStyle) && AbstractC22676k.m65745e(this.title, profileInfoTileModel.title) && AbstractC22676k.m65745e(this.image, profileInfoTileModel.image) && AbstractC22676k.m65745e(this.imageStyle, profileInfoTileModel.imageStyle) && AbstractC22676k.m65745e(this.topItem, profileInfoTileModel.topItem) && AbstractC22676k.m65745e(this.endIcon, profileInfoTileModel.endIcon) && AbstractC22676k.m65745e(this.subtitle, profileInfoTileModel.subtitle) && AbstractC22676k.m65745e(this.familyPlanId, profileInfoTileModel.familyPlanId) && AbstractC22676k.m65745e(this.userId, profileInfoTileModel.userId) && AbstractC22676k.m65745e(this.destination, profileInfoTileModel.destination) && AbstractC22676k.m65745e(this.interaction, profileInfoTileModel.interaction);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getFamilyPlanId() {
        return this.familyPlanId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageStyle() {
        return this.imageStyle;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final String getLayoutStyle() {
        return this.layoutStyle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final DesignSystemModel getTopItem() {
        return this.topItem;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.layoutStyle);
        String str = this.title;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageStyle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DesignSystemModel designSystemModel = this.topItem;
        int iHashCode4 = (iHashCode3 + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        String str4 = this.endIcon;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.subtitle);
        String str5 = this.familyPlanId;
        int iHashCode5 = (iM30450d2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l7 = this.userId;
        int iHashCode6 = (iHashCode5 + (l7 == null ? 0 : l7.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode7 = (iHashCode6 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode7 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.layoutStyle;
        String str3 = this.title;
        String str4 = this.image;
        String str5 = this.imageStyle;
        DesignSystemModel designSystemModel = this.topItem;
        String str6 = this.endIcon;
        String str7 = this.subtitle;
        String str8 = this.familyPlanId;
        Long l7 = this.userId;
        C9598e c9598e = this.destination;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProfileInfoTileModel(id=", str, ", layoutStyle=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", imageStyle=");
        sbM32001t.append(str5);
        sbM32001t.append(", topItem=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", endIcon=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", subtitle=", str7, ", familyPlanId=");
        sbM32001t.append(str8);
        sbM32001t.append(", userId=");
        sbM32001t.append(l7);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ProfileInfoTileModel(String id4, String layoutStyle, String str, String str2, String str3, DesignSystemModel designSystemModel, String str4, String subtitle, String str5, Long l7, C9598e c9598e, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(layoutStyle, "layoutStyle");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.layoutStyle = layoutStyle;
        this.title = str;
        this.image = str2;
        this.imageStyle = str3;
        this.topItem = designSystemModel;
        this.endIcon = str4;
        this.subtitle = subtitle;
        this.familyPlanId = str5;
        this.userId = l7;
        this.destination = c9598e;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ ProfileInfoTileModel(String str, String str2, String str3, String str4, String str5, DesignSystemModel designSystemModel, String str6, String str7, String str8, Long l7, C9598e c9598e, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, designSystemModel, str6, str7, str8, l7, c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : genericInteraction);
    }
}
