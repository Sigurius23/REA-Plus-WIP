package com.whoop.educationModels;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ve.C35916a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J~\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001aJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\b>\u00109\u001a\u0004\b=\u0010\u001aR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010:\u0012\u0004\b@\u00109\u001a\u0004\b?\u0010\u001aR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010\u001aR \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\bD\u00109\u001a\u0004\bC\u0010\u001aR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010:\u0012\u0004\bF\u00109\u001a\u0004\bE\u0010\u001aR \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\bH\u00109\u001a\u0004\bG\u0010\u001aR(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bK\u00109\u001a\u0004\bJ\u0010\"R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010L\u0012\u0004\bN\u00109\u001a\u0004\bM\u0010$¨\u0006Q"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationButtonDto;", "", "", "buttonId", "", "createdAt", "updatedAt", "buttonName", "color", "text", "buttonType", "clickAction", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/navigation/e;", "action", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/whoop/navigation/e;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/educationModels/FeatureEducationButtonDto;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$education_models_release", "(Lcom/whoop/educationModels/FeatureEducationButtonDto;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getButtonId", "getButtonId$annotations", "()V", "Ljava/lang/String;", "getCreatedAt", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "getButtonName", "getButtonName$annotations", "getColor", "getColor$annotations", "getText", "getText$annotations", "getButtonType", "getButtonType$annotations", "getClickAction", "getClickAction$annotations", "Ljava/util/List;", "getItems", "getItems$annotations", "Lcom/whoop/navigation/e;", "getAction", "getAction$annotations", "Companion", "$serializer", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureEducationButtonDto {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName(NotificationCompat.CATEGORY_NAVIGATION)
    private final C9598e action;

    @SerializedName("id")
    private final int buttonId;

    @SerializedName("name")
    private final String buttonName;

    @SerializedName("type")
    private final String buttonType;

    @SerializedName("click_action")
    private final String clickAction;

    @SerializedName("color")
    private final String color;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("items")
    private final List<DesignSystemModel> items;

    @SerializedName("text")
    private final String text;

    @SerializedName("updated_at")
    private final String updatedAt;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/educationModels/FeatureEducationButtonDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/educationModels/FeatureEducationButtonDto;", "serializer", "()Lwc3/c;", "education-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureEducationButtonDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35916a(2)), AbstractC30060g.m92087G(enumC23463i, new C35916a(3))};
    }

    public /* synthetic */ FeatureEducationButtonDto(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (975 != (i13 & 975)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 975, FeatureEducationButtonDto$$serializer.INSTANCE.getDescriptor());
        }
        this.buttonId = i14;
        this.createdAt = str;
        this.updatedAt = str2;
        this.buttonName = str3;
        if ((i13 & 16) == 0) {
            this.color = "BRAND_WHITE";
        } else {
            this.color = str4;
        }
        if ((i13 & 32) == 0) {
            this.text = "";
        } else {
            this.text = str5;
        }
        this.buttonType = str6;
        this.clickAction = str7;
        this.items = list;
        this.action = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureEducationButtonDto copy$default(FeatureEducationButtonDto featureEducationButtonDto, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, C9598e c9598e, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = featureEducationButtonDto.buttonId;
        }
        if ((i14 & 2) != 0) {
            str = featureEducationButtonDto.createdAt;
        }
        if ((i14 & 4) != 0) {
            str2 = featureEducationButtonDto.updatedAt;
        }
        if ((i14 & 8) != 0) {
            str3 = featureEducationButtonDto.buttonName;
        }
        if ((i14 & 16) != 0) {
            str4 = featureEducationButtonDto.color;
        }
        if ((i14 & 32) != 0) {
            str5 = featureEducationButtonDto.text;
        }
        if ((i14 & 64) != 0) {
            str6 = featureEducationButtonDto.buttonType;
        }
        if ((i14 & 128) != 0) {
            str7 = featureEducationButtonDto.clickAction;
        }
        if ((i14 & 256) != 0) {
            list = featureEducationButtonDto.items;
        }
        if ((i14 & 512) != 0) {
            c9598e = featureEducationButtonDto.action;
        }
        List list2 = list;
        C9598e c9598e2 = c9598e;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return featureEducationButtonDto.copy(i13, str, str2, str3, str10, str11, str8, str9, list2, c9598e2);
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_NAVIGATION)
    public static /* synthetic */ void getAction$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getButtonId$annotations() {
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getButtonName$annotations() {
    }

    @InterfaceC37143h("type")
    public static /* synthetic */ void getButtonType$annotations() {
    }

    @InterfaceC37143h("click_action")
    public static /* synthetic */ void getClickAction$annotations() {
    }

    @InterfaceC37143h("color")
    public static /* synthetic */ void getColor$annotations() {
    }

    @InterfaceC37143h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @InterfaceC37143h("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @InterfaceC37143h("text")
    public static /* synthetic */ void getText$annotations() {
    }

    @InterfaceC37143h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$education_models_release(FeatureEducationButtonDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.buttonId);
        output.encodeStringElement(serialDesc, 1, self.createdAt);
        output.encodeStringElement(serialDesc, 2, self.updatedAt);
        output.encodeStringElement(serialDesc, 3, self.buttonName);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.color, "BRAND_WHITE")) {
            output.encodeStringElement(serialDesc, 4, self.color);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.text, "")) {
            output.encodeStringElement(serialDesc, 5, self.text);
        }
        output.encodeStringElement(serialDesc, 6, self.buttonType);
        output.encodeStringElement(serialDesc, 7, self.clickAction);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getButtonId() {
        return this.buttonId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getButtonType() {
        return this.buttonType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getClickAction() {
        return this.clickAction;
    }

    public final List<DesignSystemModel> component9() {
        return this.items;
    }

    public final FeatureEducationButtonDto copy(int buttonId, String createdAt, String updatedAt, String buttonName, String color, String text, String buttonType, String clickAction, List<? extends DesignSystemModel> items, C9598e action) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(buttonName, "buttonName");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(buttonType, "buttonType");
        AbstractC22676k.m65750j(clickAction, "clickAction");
        return new FeatureEducationButtonDto(buttonId, createdAt, updatedAt, buttonName, color, text, buttonType, clickAction, items, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationButtonDto)) {
            return false;
        }
        FeatureEducationButtonDto featureEducationButtonDto = (FeatureEducationButtonDto) other;
        return this.buttonId == featureEducationButtonDto.buttonId && AbstractC22676k.m65745e(this.createdAt, featureEducationButtonDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, featureEducationButtonDto.updatedAt) && AbstractC22676k.m65745e(this.buttonName, featureEducationButtonDto.buttonName) && AbstractC22676k.m65745e(this.color, featureEducationButtonDto.color) && AbstractC22676k.m65745e(this.text, featureEducationButtonDto.text) && AbstractC22676k.m65745e(this.buttonType, featureEducationButtonDto.buttonType) && AbstractC22676k.m65745e(this.clickAction, featureEducationButtonDto.clickAction) && AbstractC22676k.m65745e(this.items, featureEducationButtonDto.items) && AbstractC22676k.m65745e(this.action, featureEducationButtonDto.action);
    }

    public final C9598e getAction() {
        return this.action;
    }

    public final int getButtonId() {
        return this.buttonId;
    }

    public final String getButtonName() {
        return this.buttonName;
    }

    public final String getButtonType() {
        return this.buttonType;
    }

    public final String getClickAction() {
        return this.clickAction;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.buttonId) * 31, 31, this.createdAt), 31, this.updatedAt), 31, this.buttonName), 31, this.color), 31, this.text), 31, this.buttonType), 31, this.clickAction);
        List<DesignSystemModel> list = this.items;
        int iHashCode = (iM30450d + (list == null ? 0 : list.hashCode())) * 31;
        C9598e c9598e = this.action;
        return iHashCode + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.buttonId;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.buttonName;
        String str4 = this.color;
        String str5 = this.text;
        String str6 = this.buttonType;
        String str7 = this.clickAction;
        List<DesignSystemModel> list = this.items;
        C9598e c9598e = this.action;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "FeatureEducationButtonDto(buttonId=", ", createdAt=", str, ", updatedAt=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", buttonName=", str3, ", color=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", text=", str5, ", buttonType=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", clickAction=", str7, ", items=");
        sbM53373n.append(list);
        sbM53373n.append(", action=");
        sbM53373n.append(c9598e);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureEducationButtonDto(int i13, String createdAt, String updatedAt, String buttonName, String color, String text, String buttonType, String clickAction, List<? extends DesignSystemModel> list, C9598e c9598e) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(buttonName, "buttonName");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(buttonType, "buttonType");
        AbstractC22676k.m65750j(clickAction, "clickAction");
        this.buttonId = i13;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.buttonName = buttonName;
        this.color = color;
        this.text = text;
        this.buttonType = buttonType;
        this.clickAction = clickAction;
        this.items = list;
        this.action = c9598e;
    }

    public /* synthetic */ FeatureEducationButtonDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, C9598e c9598e, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, str3, (i14 & 16) != 0 ? "BRAND_WHITE" : str4, (i14 & 32) != 0 ? "" : str5, str6, str7, list, c9598e);
    }
}
