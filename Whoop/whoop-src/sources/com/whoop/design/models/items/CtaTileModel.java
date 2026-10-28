package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0002a`B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019Bµ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b.\u0010,J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104JÂ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b7\u0010\"J\u0010\u00108\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bK\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010I\u0012\u0004\bM\u0010N\u001a\u0004\bL\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bO\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bP\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bQ\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bR\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bS\u0010\"R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bT\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u0010,R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bW\u0010,R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bX\u0010,R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u00100R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010[\u001a\u0004\b\\\u00102R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010]\u0012\u0004\b_\u0010N\u001a\u0004\b^\u00104¨\u0006b"}, m65681d2 = {"Lcom/whoop/design/models/items/CtaTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "backgroundImageUrl", "leftImageUrl", "startImageUrl", "endImageUrl", "icon", "buttonText", "buttonIcon", "tileCta", "", "dismissible", "enabled", "showCaretIcon", "Lcom/whoop/design/models/items/TileBorderStyle;", "borderStyle", "Lcom/whoop/design/models/items/CtaSupplementalInfo;", "ctaSupplementalInfo", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "component13", "component14", "()Lcom/whoop/design/models/items/TileBorderStyle;", "component15", "()Lcom/whoop/design/models/items/CtaSupplementalInfo;", "component16", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/CtaTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CtaTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getBackgroundImageUrl", "getLeftImageUrl", "getLeftImageUrl$annotations", "()V", "getStartImageUrl", "getEndImageUrl", "getIcon", "getButtonText", "getButtonIcon", "getTileCta", "Z", "getDismissible", "getEnabled", "getShowCaretIcon", "Lcom/whoop/design/models/items/TileBorderStyle;", "getBorderStyle", "Lcom/whoop/design/models/items/CtaSupplementalInfo;", "getCtaSupplementalInfo", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CtaTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String backgroundImageUrl;
    private final TileBorderStyle borderStyle;
    private final String buttonIcon;
    private final TextResource buttonText;
    private final CtaSupplementalInfo ctaSupplementalInfo;
    private final C9598e destination;
    private final boolean dismissible;
    private final boolean enabled;
    private final String endImageUrl;
    private final String icon;
    private final String leftImageUrl;
    private final boolean showCaretIcon;
    private final String startImageUrl;
    private final String subtitle;
    private final String tileCta;
    private final TextResource title;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CtaTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CtaTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CtaTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14;
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36955b(23)), null, AbstractC30060g.m92087G(enumC23463i, new C36955b(24))};
    }

    public CtaTileModel() {
        this((TextResource) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TextResource) null, (String) null, (String) null, false, false, false, (TileBorderStyle) null, (CtaSupplementalInfo) null, (C9598e) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TileBorderStyle", TileBorderStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getLeftImageUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(CtaTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.backgroundImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.backgroundImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.leftImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.leftImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.startImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.startImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.endImageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.endImageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 6, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.buttonText != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, C25452a.f99689a, self.buttonText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.buttonIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.buttonIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.tileCta, "")) {
            output.encodeStringElement(serialDesc, 9, self.tileCta);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.dismissible) {
            output.encodeBooleanElement(serialDesc, 10, self.dismissible);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.enabled) {
            output.encodeBooleanElement(serialDesc, 11, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.showCaretIcon) {
            output.encodeBooleanElement(serialDesc, 12, self.showCaretIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.borderStyle != TileBorderStyle.NONE) {
            output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.borderStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.ctaSupplementalInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, CtaSupplementalInfo$$serializer.INSTANCE, self.ctaSupplementalInfo);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 15, (InterfaceC37145j) interfaceC23462hArr[15].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTileCta() {
        return this.tileCta;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getDismissible() {
        return this.dismissible;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getShowCaretIcon() {
        return this.showCaretIcon;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final TileBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final CtaSupplementalInfo getCtaSupplementalInfo() {
        return this.ctaSupplementalInfo;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeftImageUrl() {
        return this.leftImageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartImageUrl() {
        return this.startImageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndImageUrl() {
        return this.endImageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getButtonIcon() {
        return this.buttonIcon;
    }

    public final CtaTileModel copy(TextResource title, String subtitle, String backgroundImageUrl, String leftImageUrl, String startImageUrl, String endImageUrl, String icon, TextResource buttonText, String buttonIcon, String tileCta, boolean dismissible, boolean enabled, boolean showCaretIcon, TileBorderStyle borderStyle, CtaSupplementalInfo ctaSupplementalInfo, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(tileCta, "tileCta");
        AbstractC22676k.m65750j(borderStyle, "borderStyle");
        return new CtaTileModel(title, subtitle, backgroundImageUrl, leftImageUrl, startImageUrl, endImageUrl, icon, buttonText, buttonIcon, tileCta, dismissible, enabled, showCaretIcon, borderStyle, ctaSupplementalInfo, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CtaTileModel)) {
            return false;
        }
        CtaTileModel ctaTileModel = (CtaTileModel) other;
        return AbstractC22676k.m65745e(this.title, ctaTileModel.title) && AbstractC22676k.m65745e(this.subtitle, ctaTileModel.subtitle) && AbstractC22676k.m65745e(this.backgroundImageUrl, ctaTileModel.backgroundImageUrl) && AbstractC22676k.m65745e(this.leftImageUrl, ctaTileModel.leftImageUrl) && AbstractC22676k.m65745e(this.startImageUrl, ctaTileModel.startImageUrl) && AbstractC22676k.m65745e(this.endImageUrl, ctaTileModel.endImageUrl) && AbstractC22676k.m65745e(this.icon, ctaTileModel.icon) && AbstractC22676k.m65745e(this.buttonText, ctaTileModel.buttonText) && AbstractC22676k.m65745e(this.buttonIcon, ctaTileModel.buttonIcon) && AbstractC22676k.m65745e(this.tileCta, ctaTileModel.tileCta) && this.dismissible == ctaTileModel.dismissible && this.enabled == ctaTileModel.enabled && this.showCaretIcon == ctaTileModel.showCaretIcon && this.borderStyle == ctaTileModel.borderStyle && AbstractC22676k.m65745e(this.ctaSupplementalInfo, ctaTileModel.ctaSupplementalInfo) && AbstractC22676k.m65745e(this.destination, ctaTileModel.destination);
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public final TileBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    public final String getButtonIcon() {
        return this.buttonIcon;
    }

    public final TextResource getButtonText() {
        return this.buttonText;
    }

    public final CtaSupplementalInfo getCtaSupplementalInfo() {
        return this.ctaSupplementalInfo;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final boolean getDismissible() {
        return this.dismissible;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getEndImageUrl() {
        return this.endImageUrl;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLeftImageUrl() {
        return this.leftImageUrl;
    }

    public final boolean getShowCaretIcon() {
        return this.showCaretIcon;
    }

    public final String getStartImageUrl() {
        return this.startImageUrl;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTileCta() {
        return this.tileCta;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundImageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.leftImageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startImageUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endImageUrl;
        int iM30450d = AbstractC11266d.m30450d((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.icon);
        TextResource textResource = this.buttonText;
        int iHashCode6 = (iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str6 = this.buttonIcon;
        int iHashCode7 = (this.borderStyle.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.tileCta), 31, this.dismissible), 31, this.enabled), 31, this.showCaretIcon)) * 31;
        CtaSupplementalInfo ctaSupplementalInfo = this.ctaSupplementalInfo;
        int iHashCode8 = (iHashCode7 + (ctaSupplementalInfo == null ? 0 : ctaSupplementalInfo.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode8 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        String str2 = this.backgroundImageUrl;
        String str3 = this.leftImageUrl;
        String str4 = this.startImageUrl;
        String str5 = this.endImageUrl;
        String str6 = this.icon;
        TextResource textResource2 = this.buttonText;
        String str7 = this.buttonIcon;
        String str8 = this.tileCta;
        boolean z4 = this.dismissible;
        boolean z13 = this.enabled;
        boolean z14 = this.showCaretIcon;
        TileBorderStyle tileBorderStyle = this.borderStyle;
        CtaSupplementalInfo ctaSupplementalInfo = this.ctaSupplementalInfo;
        C9598e c9598e = this.destination;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("CtaTileModel(title=", textResource, ", subtitle=", str, ", backgroundImageUrl=");
        AbstractC11266d.m30444B(sbM91845o, str2, ", leftImageUrl=", str3, ", startImageUrl=");
        AbstractC11266d.m30444B(sbM91845o, str4, ", endImageUrl=", str5, ", icon=");
        AbstractC30007c.m91826A(sbM91845o, str6, ", buttonText=", textResource2, ", buttonIcon=");
        AbstractC11266d.m30444B(sbM91845o, str7, ", tileCta=", str8, ", dismissible=");
        AbstractC38963t7.m124392v(sbM91845o, z4, ", enabled=", z13, ", showCaretIcon=");
        sbM91845o.append(z14);
        sbM91845o.append(", borderStyle=");
        sbM91845o.append(tileBorderStyle);
        sbM91845o.append(", ctaSupplementalInfo=");
        sbM91845o.append(ctaSupplementalInfo);
        sbM91845o.append(", destination=");
        sbM91845o.append(c9598e);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public /* synthetic */ CtaTileModel(int i13, TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, TextResource textResource2, String str7, String str8, boolean z4, boolean z13, boolean z14, TileBorderStyle tileBorderStyle, CtaSupplementalInfo ctaSupplementalInfo, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
        if ((i13 & 4) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str2;
        }
        if ((i13 & 8) == 0) {
            this.leftImageUrl = null;
        } else {
            this.leftImageUrl = str3;
        }
        if ((i13 & 16) == 0) {
            this.startImageUrl = null;
        } else {
            this.startImageUrl = str4;
        }
        if ((i13 & 32) == 0) {
            this.endImageUrl = null;
        } else {
            this.endImageUrl = str5;
        }
        if ((i13 & 64) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
        if ((i13 & 128) == 0) {
            this.buttonText = null;
        } else {
            this.buttonText = textResource2;
        }
        if ((i13 & 256) == 0) {
            this.buttonIcon = null;
        } else {
            this.buttonIcon = str7;
        }
        if ((i13 & 512) == 0) {
            this.tileCta = "";
        } else {
            this.tileCta = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.dismissible = false;
        } else {
            this.dismissible = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z13;
        }
        if ((i13 & 4096) == 0) {
            this.showCaretIcon = false;
        } else {
            this.showCaretIcon = z14;
        }
        this.borderStyle = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? TileBorderStyle.NONE : tileBorderStyle;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.ctaSupplementalInfo = null;
        } else {
            this.ctaSupplementalInfo = ctaSupplementalInfo;
        }
        if ((i13 & 32768) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public CtaTileModel(TextResource title, String str, String str2, String str3, String str4, String str5, String icon, TextResource textResource, String str6, String tileCta, boolean z4, boolean z13, boolean z14, TileBorderStyle borderStyle, CtaSupplementalInfo ctaSupplementalInfo, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(tileCta, "tileCta");
        AbstractC22676k.m65750j(borderStyle, "borderStyle");
        this.title = title;
        this.subtitle = str;
        this.backgroundImageUrl = str2;
        this.leftImageUrl = str3;
        this.startImageUrl = str4;
        this.endImageUrl = str5;
        this.icon = icon;
        this.buttonText = textResource;
        this.buttonIcon = str6;
        this.tileCta = tileCta;
        this.dismissible = z4;
        this.enabled = z13;
        this.showCaretIcon = z14;
        this.borderStyle = borderStyle;
        this.ctaSupplementalInfo = ctaSupplementalInfo;
        this.destination = c9598e;
    }

    public /* synthetic */ CtaTileModel(TextResource textResource, String str, String str2, String str3, String str4, String str5, String str6, TextResource textResource2, String str7, String str8, boolean z4, boolean z13, boolean z14, TileBorderStyle tileBorderStyle, CtaSupplementalInfo ctaSupplementalInfo, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? "" : str6, (i13 & 128) != 0 ? null : textResource2, (i13 & 256) != 0 ? null : str7, (i13 & 512) == 0 ? str8 : "", (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13, (i13 & 4096) == 0 ? z14 : false, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? TileBorderStyle.NONE : tileBorderStyle, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : ctaSupplementalInfo, (i13 & 32768) != 0 ? null : c9598e);
    }
}
