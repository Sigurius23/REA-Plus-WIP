package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXB§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B£\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J°\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bF\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bG\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bK\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bP\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bQ\u0010\u001eR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bU\u0010.R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u00100¨\u0006Z"}, m65681d2 = {"Lcom/whoop/design/models/items/TagModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "leftIcon", "title", "rightIcon", "Lcom/whoop/design/models/items/TagBackgroundStyle;", "tagStyle", "backgroundColor", "textColor", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "imageUrl", "value", "", "avatars", "Lcom/whoop/design/models/items/IconSize;", "iconSize", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/IconSize;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/IconSize;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/TagBackgroundStyle;", "component5", "component6", "component7", "()Lcom/whoop/navigation/e;", "component8", "()Lcom/whoop/whoopaction/domain/models/Action;", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "()Lcom/whoop/design/models/items/IconSize;", "component13", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagBackgroundStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/IconSize;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/TagModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TagModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getLeftIcon", "getTitle", "getRightIcon", "Lcom/whoop/design/models/items/TagBackgroundStyle;", "getTagStyle", "getBackgroundColor", "getTextColor", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "getImageUrl", "getValue", "Ljava/util/List;", "getAvatars", "Lcom/whoop/design/models/items/IconSize;", "getIconSize", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TagModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final List<String> avatars;
    private final String backgroundColor;
    private final C9598e destination;
    private final IconSize iconSize;
    private final String imageUrl;
    private final GenericInteraction interaction;
    private final String leftIcon;
    private final String rightIcon;
    private final TagBackgroundStyle tagStyle;
    private final String textColor;
    private final String title;
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TagModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TagModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TagModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(4)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(5)), AbstractC30060g.m92087G(enumC23463i, new C36964k(6)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(7)), AbstractC30060g.m92087G(enumC23463i, new C36964k(8)), null};
    }

    public TagModel() {
        this((String) null, (String) null, (String) null, (TagBackgroundStyle) null, (String) null, (String) null, (C9598e) null, (Action) null, (String) null, (String) null, (List) null, (IconSize) null, (GenericInteraction) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TagBackgroundStyle", TagBackgroundStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return IconSize.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagModel copy$default(TagModel tagModel, String str, String str2, String str3, TagBackgroundStyle tagBackgroundStyle, String str4, String str5, C9598e c9598e, Action action, String str6, String str7, List list, IconSize iconSize, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tagModel.leftIcon;
        }
        return tagModel.copy(str, (i13 & 2) != 0 ? tagModel.title : str2, (i13 & 4) != 0 ? tagModel.rightIcon : str3, (i13 & 8) != 0 ? tagModel.tagStyle : tagBackgroundStyle, (i13 & 16) != 0 ? tagModel.backgroundColor : str4, (i13 & 32) != 0 ? tagModel.textColor : str5, (i13 & 64) != 0 ? tagModel.destination : c9598e, (i13 & 128) != 0 ? tagModel.action : action, (i13 & 256) != 0 ? tagModel.imageUrl : str6, (i13 & 512) != 0 ? tagModel.value : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? tagModel.avatars : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? tagModel.iconSize : iconSize, (i13 & 4096) != 0 ? tagModel.interaction : genericInteraction);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TagModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.leftIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.leftIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.rightIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.rightIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.tagStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.tagStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.backgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.textColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.textColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.value);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.avatars != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.avatars);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.iconSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.iconSize);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.interaction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final List<String> component11() {
        return this.avatars;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final IconSize getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagBackgroundStyle getTagStyle() {
        return this.tagStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final TagModel copy(String leftIcon, String title, String rightIcon, TagBackgroundStyle tagStyle, String backgroundColor, String textColor, C9598e destination, Action action, String imageUrl, String value, List<String> avatars, IconSize iconSize, GenericInteraction interaction) {
        AbstractC22676k.m65750j(title, "title");
        return new TagModel(leftIcon, title, rightIcon, tagStyle, backgroundColor, textColor, destination, action, imageUrl, value, avatars, iconSize, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagModel)) {
            return false;
        }
        TagModel tagModel = (TagModel) other;
        return AbstractC22676k.m65745e(this.leftIcon, tagModel.leftIcon) && AbstractC22676k.m65745e(this.title, tagModel.title) && AbstractC22676k.m65745e(this.rightIcon, tagModel.rightIcon) && this.tagStyle == tagModel.tagStyle && AbstractC22676k.m65745e(this.backgroundColor, tagModel.backgroundColor) && AbstractC22676k.m65745e(this.textColor, tagModel.textColor) && AbstractC22676k.m65745e(this.destination, tagModel.destination) && AbstractC22676k.m65745e(this.action, tagModel.action) && AbstractC22676k.m65745e(this.imageUrl, tagModel.imageUrl) && AbstractC22676k.m65745e(this.value, tagModel.value) && AbstractC22676k.m65745e(this.avatars, tagModel.avatars) && this.iconSize == tagModel.iconSize && AbstractC22676k.m65745e(this.interaction, tagModel.interaction);
    }

    public final Action getAction() {
        return this.action;
    }

    public final List<String> getAvatars() {
        return this.avatars;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final IconSize getIconSize() {
        return this.iconSize;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final TagBackgroundStyle getTagStyle() {
        return this.tagStyle;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.leftIcon;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.rightIcon;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        TagBackgroundStyle tagBackgroundStyle = this.tagStyle;
        int iHashCode2 = (iHashCode + (tagBackgroundStyle == null ? 0 : tagBackgroundStyle.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode5 = (iHashCode4 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode6 = (iHashCode5 + (action == null ? 0 : action.hashCode())) * 31;
        String str5 = this.imageUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.value;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.avatars;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        IconSize iconSize = this.iconSize;
        int iHashCode10 = (iHashCode9 + (iconSize == null ? 0 : iconSize.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode10 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        String str = this.leftIcon;
        String str2 = this.title;
        String str3 = this.rightIcon;
        TagBackgroundStyle tagBackgroundStyle = this.tagStyle;
        String str4 = this.backgroundColor;
        String str5 = this.textColor;
        C9598e c9598e = this.destination;
        Action action = this.action;
        String str6 = this.imageUrl;
        String str7 = this.value;
        List<String> list = this.avatars;
        IconSize iconSize = this.iconSize;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TagModel(leftIcon=", str, ", title=", str2, ", rightIcon=");
        sbM32001t.append(str3);
        sbM32001t.append(", tagStyle=");
        sbM32001t.append(tagBackgroundStyle);
        sbM32001t.append(", backgroundColor=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", textColor=", str5, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", action=");
        sbM32001t.append(action);
        sbM32001t.append(", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", value=", str7, ", avatars=");
        sbM32001t.append(list);
        sbM32001t.append(", iconSize=");
        sbM32001t.append(iconSize);
        sbM32001t.append(", interaction=");
        return AbstractC26725a.m79506j(sbM32001t, genericInteraction, ")");
    }

    public /* synthetic */ TagModel(int i13, String str, String str2, String str3, TagBackgroundStyle tagBackgroundStyle, String str4, String str5, C9598e c9598e, Action action, String str6, String str7, List list, IconSize iconSize, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.leftIcon = null;
        } else {
            this.leftIcon = str;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.rightIcon = null;
        } else {
            this.rightIcon = str3;
        }
        if ((i13 & 8) == 0) {
            this.tagStyle = null;
        } else {
            this.tagStyle = tagBackgroundStyle;
        }
        if ((i13 & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str4;
        }
        if ((i13 & 32) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str5;
        }
        if ((i13 & 64) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 128) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & 256) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str6;
        }
        if ((i13 & 512) == 0) {
            this.value = null;
        } else {
            this.value = str7;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.avatars = null;
        } else {
            this.avatars = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.iconSize = null;
        } else {
            this.iconSize = iconSize;
        }
        if ((i13 & 4096) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
    }

    public TagModel(String str, String title, String str2, TagBackgroundStyle tagBackgroundStyle, String str3, String str4, C9598e c9598e, Action action, String str5, String str6, List<String> list, IconSize iconSize, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(title, "title");
        this.leftIcon = str;
        this.title = title;
        this.rightIcon = str2;
        this.tagStyle = tagBackgroundStyle;
        this.backgroundColor = str3;
        this.textColor = str4;
        this.destination = c9598e;
        this.action = action;
        this.imageUrl = str5;
        this.value = str6;
        this.avatars = list;
        this.iconSize = iconSize;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ TagModel(String str, String str2, String str3, TagBackgroundStyle tagBackgroundStyle, String str4, String str5, C9598e c9598e, Action action, String str6, String str7, List list, IconSize iconSize, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : tagBackgroundStyle, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : c9598e, (i13 & 128) != 0 ? null : action, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : iconSize, (i13 & 4096) != 0 ? null : genericInteraction);
    }
}
