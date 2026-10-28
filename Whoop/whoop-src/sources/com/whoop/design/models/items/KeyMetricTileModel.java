package com.whoop.design.models.items;

import com.whoop.design.atomic.atom.TrendTypeEnum;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBy\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0082\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bC\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010$¨\u0006H"}, m65681d2 = {"Lcom/whoop/design/models/items/KeyMetricTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "keyMetricTileIcon", "keyMetricTileTitleDisplay", "keyMetricTileStatValueDisplay", "keyMetricTileSuffixDisplay", "keyMetricTileTrendDisplay", "Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "keyMetricTileTrendType", "Lcom/whoop/design/models/items/TrendBarModel;", "keyMetricTileTrendBar", "placeholderMessageDisplay", "Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;", "keyMetricTileDialogContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "component8", "()Lcom/whoop/design/models/items/TrendBarModel;", "component9", "component10", "()Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/atomic/atom/TrendTypeEnum;Lcom/whoop/design/models/items/TrendBarModel;Ljava/lang/String;Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;)Lcom/whoop/design/models/items/KeyMetricTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/KeyMetricTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getKeyMetricTileIcon", "getKeyMetricTileTitleDisplay", "getKeyMetricTileStatValueDisplay", "getKeyMetricTileSuffixDisplay", "getKeyMetricTileTrendDisplay", "Lcom/whoop/design/atomic/atom/TrendTypeEnum;", "getKeyMetricTileTrendType", "Lcom/whoop/design/models/items/TrendBarModel;", "getKeyMetricTileTrendBar", "getPlaceholderMessageDisplay", "Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;", "getKeyMetricTileDialogContent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class KeyMetricTileModel implements DesignSystemModel {
    private final String id;
    private final KeyMetricTileModelDialogContentModel keyMetricTileDialogContent;
    private final String keyMetricTileIcon;
    private final String keyMetricTileStatValueDisplay;
    private final String keyMetricTileSuffixDisplay;
    private final String keyMetricTileTitleDisplay;
    private final TrendBarModel keyMetricTileTrendBar;
    private final String keyMetricTileTrendDisplay;
    private final TrendTypeEnum keyMetricTileTrendType;
    private final String placeholderMessageDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36960g(6)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/KeyMetricTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/KeyMetricTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return KeyMetricTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public KeyMetricTileModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TrendTypeEnum) null, (TrendBarModel) null, (String) null, (KeyMetricTileModelDialogContentModel) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.TrendTypeEnum", TrendTypeEnum.values());
    }

    public static /* synthetic */ KeyMetricTileModel copy$default(KeyMetricTileModel keyMetricTileModel, String str, String str2, String str3, String str4, String str5, String str6, TrendTypeEnum trendTypeEnum, TrendBarModel trendBarModel, String str7, KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = keyMetricTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = keyMetricTileModel.keyMetricTileIcon;
        }
        if ((i13 & 4) != 0) {
            str3 = keyMetricTileModel.keyMetricTileTitleDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = keyMetricTileModel.keyMetricTileStatValueDisplay;
        }
        if ((i13 & 16) != 0) {
            str5 = keyMetricTileModel.keyMetricTileSuffixDisplay;
        }
        if ((i13 & 32) != 0) {
            str6 = keyMetricTileModel.keyMetricTileTrendDisplay;
        }
        if ((i13 & 64) != 0) {
            trendTypeEnum = keyMetricTileModel.keyMetricTileTrendType;
        }
        if ((i13 & 128) != 0) {
            trendBarModel = keyMetricTileModel.keyMetricTileTrendBar;
        }
        if ((i13 & 256) != 0) {
            str7 = keyMetricTileModel.placeholderMessageDisplay;
        }
        if ((i13 & 512) != 0) {
            keyMetricTileModelDialogContentModel = keyMetricTileModel.keyMetricTileDialogContent;
        }
        String str8 = str7;
        KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel2 = keyMetricTileModelDialogContentModel;
        TrendTypeEnum trendTypeEnum2 = trendTypeEnum;
        TrendBarModel trendBarModel2 = trendBarModel;
        String str9 = str5;
        String str10 = str6;
        return keyMetricTileModel.copy(str, str2, str3, str4, str9, str10, trendTypeEnum2, trendBarModel2, str8, keyMetricTileModelDialogContentModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(KeyMetricTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.keyMetricTileIcon, "")) {
            output.encodeStringElement(serialDesc, 1, self.keyMetricTileIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.keyMetricTileTitleDisplay, "")) {
            output.encodeStringElement(serialDesc, 2, self.keyMetricTileTitleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.keyMetricTileStatValueDisplay, "")) {
            output.encodeStringElement(serialDesc, 3, self.keyMetricTileStatValueDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.keyMetricTileSuffixDisplay, "")) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.keyMetricTileSuffixDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.keyMetricTileTrendDisplay, "")) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.keyMetricTileTrendDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.keyMetricTileTrendType != TrendTypeEnum.NEUTRAL) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.keyMetricTileTrendType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.keyMetricTileTrendBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, TrendBarModel$$serializer.INSTANCE, self.keyMetricTileTrendBar);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.placeholderMessageDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.placeholderMessageDisplay);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.keyMetricTileDialogContent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, KeyMetricTileModelDialogContentModel$$serializer.INSTANCE, self.keyMetricTileDialogContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final KeyMetricTileModelDialogContentModel getKeyMetricTileDialogContent() {
        return this.keyMetricTileDialogContent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyMetricTileIcon() {
        return this.keyMetricTileIcon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKeyMetricTileTitleDisplay() {
        return this.keyMetricTileTitleDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKeyMetricTileStatValueDisplay() {
        return this.keyMetricTileStatValueDisplay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKeyMetricTileSuffixDisplay() {
        return this.keyMetricTileSuffixDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getKeyMetricTileTrendDisplay() {
        return this.keyMetricTileTrendDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TrendTypeEnum getKeyMetricTileTrendType() {
        return this.keyMetricTileTrendType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TrendBarModel getKeyMetricTileTrendBar() {
        return this.keyMetricTileTrendBar;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPlaceholderMessageDisplay() {
        return this.placeholderMessageDisplay;
    }

    public final KeyMetricTileModel copy(String id4, String keyMetricTileIcon, String keyMetricTileTitleDisplay, String keyMetricTileStatValueDisplay, String keyMetricTileSuffixDisplay, String keyMetricTileTrendDisplay, TrendTypeEnum keyMetricTileTrendType, TrendBarModel keyMetricTileTrendBar, String placeholderMessageDisplay, KeyMetricTileModelDialogContentModel keyMetricTileDialogContent) {
        AbstractC22676k.m65750j(keyMetricTileIcon, "keyMetricTileIcon");
        AbstractC22676k.m65750j(keyMetricTileTitleDisplay, "keyMetricTileTitleDisplay");
        AbstractC22676k.m65750j(keyMetricTileStatValueDisplay, "keyMetricTileStatValueDisplay");
        return new KeyMetricTileModel(id4, keyMetricTileIcon, keyMetricTileTitleDisplay, keyMetricTileStatValueDisplay, keyMetricTileSuffixDisplay, keyMetricTileTrendDisplay, keyMetricTileTrendType, keyMetricTileTrendBar, placeholderMessageDisplay, keyMetricTileDialogContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyMetricTileModel)) {
            return false;
        }
        KeyMetricTileModel keyMetricTileModel = (KeyMetricTileModel) other;
        return AbstractC22676k.m65745e(this.id, keyMetricTileModel.id) && AbstractC22676k.m65745e(this.keyMetricTileIcon, keyMetricTileModel.keyMetricTileIcon) && AbstractC22676k.m65745e(this.keyMetricTileTitleDisplay, keyMetricTileModel.keyMetricTileTitleDisplay) && AbstractC22676k.m65745e(this.keyMetricTileStatValueDisplay, keyMetricTileModel.keyMetricTileStatValueDisplay) && AbstractC22676k.m65745e(this.keyMetricTileSuffixDisplay, keyMetricTileModel.keyMetricTileSuffixDisplay) && AbstractC22676k.m65745e(this.keyMetricTileTrendDisplay, keyMetricTileModel.keyMetricTileTrendDisplay) && this.keyMetricTileTrendType == keyMetricTileModel.keyMetricTileTrendType && AbstractC22676k.m65745e(this.keyMetricTileTrendBar, keyMetricTileModel.keyMetricTileTrendBar) && AbstractC22676k.m65745e(this.placeholderMessageDisplay, keyMetricTileModel.placeholderMessageDisplay) && AbstractC22676k.m65745e(this.keyMetricTileDialogContent, keyMetricTileModel.keyMetricTileDialogContent);
    }

    public final String getId() {
        return this.id;
    }

    public final KeyMetricTileModelDialogContentModel getKeyMetricTileDialogContent() {
        return this.keyMetricTileDialogContent;
    }

    public final String getKeyMetricTileIcon() {
        return this.keyMetricTileIcon;
    }

    public final String getKeyMetricTileStatValueDisplay() {
        return this.keyMetricTileStatValueDisplay;
    }

    public final String getKeyMetricTileSuffixDisplay() {
        return this.keyMetricTileSuffixDisplay;
    }

    public final String getKeyMetricTileTitleDisplay() {
        return this.keyMetricTileTitleDisplay;
    }

    public final TrendBarModel getKeyMetricTileTrendBar() {
        return this.keyMetricTileTrendBar;
    }

    public final String getKeyMetricTileTrendDisplay() {
        return this.keyMetricTileTrendDisplay;
    }

    public final TrendTypeEnum getKeyMetricTileTrendType() {
        return this.keyMetricTileTrendType;
    }

    public final String getPlaceholderMessageDisplay() {
        return this.placeholderMessageDisplay;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.keyMetricTileIcon), 31, this.keyMetricTileTitleDisplay), 31, this.keyMetricTileStatValueDisplay);
        String str2 = this.keyMetricTileSuffixDisplay;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.keyMetricTileTrendDisplay;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        TrendTypeEnum trendTypeEnum = this.keyMetricTileTrendType;
        int iHashCode3 = (iHashCode2 + (trendTypeEnum == null ? 0 : trendTypeEnum.hashCode())) * 31;
        TrendBarModel trendBarModel = this.keyMetricTileTrendBar;
        int iHashCode4 = (iHashCode3 + (trendBarModel == null ? 0 : trendBarModel.hashCode())) * 31;
        String str4 = this.placeholderMessageDisplay;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel = this.keyMetricTileDialogContent;
        return iHashCode5 + (keyMetricTileModelDialogContentModel != null ? keyMetricTileModelDialogContentModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.keyMetricTileIcon;
        String str3 = this.keyMetricTileTitleDisplay;
        String str4 = this.keyMetricTileStatValueDisplay;
        String str5 = this.keyMetricTileSuffixDisplay;
        String str6 = this.keyMetricTileTrendDisplay;
        TrendTypeEnum trendTypeEnum = this.keyMetricTileTrendType;
        TrendBarModel trendBarModel = this.keyMetricTileTrendBar;
        String str7 = this.placeholderMessageDisplay;
        KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel = this.keyMetricTileDialogContent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("KeyMetricTileModel(id=", str, ", keyMetricTileIcon=", str2, ", keyMetricTileTitleDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", keyMetricTileStatValueDisplay=", str4, ", keyMetricTileSuffixDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", keyMetricTileTrendDisplay=", str6, ", keyMetricTileTrendType=");
        sbM32001t.append(trendTypeEnum);
        sbM32001t.append(", keyMetricTileTrendBar=");
        sbM32001t.append(trendBarModel);
        sbM32001t.append(", placeholderMessageDisplay=");
        sbM32001t.append(str7);
        sbM32001t.append(", keyMetricTileDialogContent=");
        sbM32001t.append(keyMetricTileModelDialogContentModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ KeyMetricTileModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, TrendTypeEnum trendTypeEnum, TrendBarModel trendBarModel, String str7, KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.keyMetricTileIcon = "";
        } else {
            this.keyMetricTileIcon = str2;
        }
        if ((i13 & 4) == 0) {
            this.keyMetricTileTitleDisplay = "";
        } else {
            this.keyMetricTileTitleDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.keyMetricTileStatValueDisplay = "";
        } else {
            this.keyMetricTileStatValueDisplay = str4;
        }
        if ((i13 & 16) == 0) {
            this.keyMetricTileSuffixDisplay = "";
        } else {
            this.keyMetricTileSuffixDisplay = str5;
        }
        if ((i13 & 32) == 0) {
            this.keyMetricTileTrendDisplay = "";
        } else {
            this.keyMetricTileTrendDisplay = str6;
        }
        if ((i13 & 64) == 0) {
            this.keyMetricTileTrendType = TrendTypeEnum.NEUTRAL;
        } else {
            this.keyMetricTileTrendType = trendTypeEnum;
        }
        if ((i13 & 128) == 0) {
            this.keyMetricTileTrendBar = null;
        } else {
            this.keyMetricTileTrendBar = trendBarModel;
        }
        if ((i13 & 256) == 0) {
            this.placeholderMessageDisplay = null;
        } else {
            this.placeholderMessageDisplay = str7;
        }
        if ((i13 & 512) == 0) {
            this.keyMetricTileDialogContent = null;
        } else {
            this.keyMetricTileDialogContent = keyMetricTileModelDialogContentModel;
        }
    }

    public KeyMetricTileModel(String str, String keyMetricTileIcon, String keyMetricTileTitleDisplay, String keyMetricTileStatValueDisplay, String str2, String str3, TrendTypeEnum trendTypeEnum, TrendBarModel trendBarModel, String str4, KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel) {
        AbstractC22676k.m65750j(keyMetricTileIcon, "keyMetricTileIcon");
        AbstractC22676k.m65750j(keyMetricTileTitleDisplay, "keyMetricTileTitleDisplay");
        AbstractC22676k.m65750j(keyMetricTileStatValueDisplay, "keyMetricTileStatValueDisplay");
        this.id = str;
        this.keyMetricTileIcon = keyMetricTileIcon;
        this.keyMetricTileTitleDisplay = keyMetricTileTitleDisplay;
        this.keyMetricTileStatValueDisplay = keyMetricTileStatValueDisplay;
        this.keyMetricTileSuffixDisplay = str2;
        this.keyMetricTileTrendDisplay = str3;
        this.keyMetricTileTrendType = trendTypeEnum;
        this.keyMetricTileTrendBar = trendBarModel;
        this.placeholderMessageDisplay = str4;
        this.keyMetricTileDialogContent = keyMetricTileModelDialogContentModel;
    }

    public /* synthetic */ KeyMetricTileModel(String str, String str2, String str3, String str4, String str5, String str6, TrendTypeEnum trendTypeEnum, TrendBarModel trendBarModel, String str7, KeyMetricTileModelDialogContentModel keyMetricTileModelDialogContentModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? TrendTypeEnum.NEUTRAL : trendTypeEnum, (i13 & 128) != 0 ? null : trendBarModel, (i13 & 256) != 0 ? null : str7, (i13 & 512) != 0 ? null : keyMetricTileModelDialogContentModel);
    }
}
