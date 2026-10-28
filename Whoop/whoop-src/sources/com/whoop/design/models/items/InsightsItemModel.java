package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36959f;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017B§\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001eJ°\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bH\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bI\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bJ\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bK\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bL\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010M\u001a\u0004\bN\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\bP\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bQ\u0010\u001eR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010R\u0012\u0004\bT\u0010U\u001a\u0004\bS\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bV\u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010D\u001a\u0004\bY\u0010\u001e¨\u0006\\"}, m65681d2 = {"Lcom/whoop/design/models/items/InsightsItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "title", "titleColor", "titleStyle", "description", "actionRecommendation", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "Lcom/whoop/design/models/items/CardButtonModel;", "actionButton", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "textAlignment", "Lcom/whoop/design/models/items/ExpandableContentModel;", "expandableContent", "iconStyle", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/ImpactModel;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component9", "()Lcom/whoop/design/models/items/CardButtonModel;", "component10", "component11", "()Lcom/whoop/navigation/e;", "component12", "component13", "()Lcom/whoop/design/models/items/ExpandableContentModel;", "component14", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/ExpandableContentModel;Ljava/lang/String;)Lcom/whoop/design/models/items/InsightsItemModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/InsightsItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "getTitle", "getTitleColor", "getTitleStyle", "getDescription", "getActionRecommendation", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Lcom/whoop/design/models/items/CardButtonModel;", "getActionButton", "getRightIcon", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getTextAlignment", "Lcom/whoop/design/models/items/ExpandableContentModel;", "getExpandableContent", "getIconStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InsightsItemModel implements DesignSystemModel {
    private final CardButtonModel actionButton;
    private final String actionRecommendation;
    private final InfoCalloutTileModel callout;
    private final String description;
    private final C9598e destination;
    private final ExpandableContentModel expandableContent;
    private final String iconStyle;
    private final String id;
    private final String rightIcon;
    private final String textAlignment;
    private final String title;
    private final String titleColor;
    private final String titleStyle;
    private final ImpactModel trend;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36959f(20)), null, null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/InsightsItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/InsightsItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InsightsItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InsightsItemModel(int i13, String str, ImpactModel impactModel, String str2, String str3, String str4, String str5, String str6, InfoCalloutTileModel infoCalloutTileModel, CardButtonModel cardButtonModel, String str7, C9598e c9598e, String str8, ExpandableContentModel expandableContentModel, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (2023 != (i13 & 2023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2023, InsightsItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.trend = impactModel;
        this.title = str2;
        if ((i13 & 8) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = str3;
        }
        if ((i13 & 16) == 0) {
            this.titleStyle = null;
        } else {
            this.titleStyle = str4;
        }
        this.description = str5;
        this.actionRecommendation = str6;
        this.callout = infoCalloutTileModel;
        this.actionButton = cardButtonModel;
        this.rightIcon = str7;
        this.destination = c9598e;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.textAlignment = null;
        } else {
            this.textAlignment = str8;
        }
        if ((i13 & 4096) == 0) {
            this.expandableContent = null;
        } else {
            this.expandableContent = expandableContentModel;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.iconStyle = null;
        } else {
            this.iconStyle = str9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(InsightsItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, ImpactModel$$serializer.INSTANCE, self.trend);
        output.encodeStringElement(serialDesc, 2, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.titleColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.titleColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.titleStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.titleStyle);
        }
        output.encodeStringElement(serialDesc, 5, self.description);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.actionRecommendation);
        output.encodeNullableSerializableElement(serialDesc, 7, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
        output.encodeNullableSerializableElement(serialDesc, 8, CardButtonModel$$serializer.INSTANCE, self.actionButton);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.destination);
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.textAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.textAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.expandableContent != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, ExpandableContentModel$$serializer.INSTANCE, self.expandableContent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.iconStyle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.iconStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTextAlignment() {
        return this.textAlignment;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ExpandableContentModel getExpandableContent() {
        return this.expandableContent;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getIconStyle() {
        return this.iconStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActionRecommendation() {
        return this.actionRecommendation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CardButtonModel getActionButton() {
        return this.actionButton;
    }

    public final InsightsItemModel copy(String id4, ImpactModel trend, String title, String titleColor, String titleStyle, String description, String actionRecommendation, InfoCalloutTileModel callout, CardButtonModel actionButton, String rightIcon, C9598e destination, String textAlignment, ExpandableContentModel expandableContent, String iconStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(trend, "trend");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new InsightsItemModel(id4, trend, title, titleColor, titleStyle, description, actionRecommendation, callout, actionButton, rightIcon, destination, textAlignment, expandableContent, iconStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsightsItemModel)) {
            return false;
        }
        InsightsItemModel insightsItemModel = (InsightsItemModel) other;
        return AbstractC22676k.m65745e(this.id, insightsItemModel.id) && AbstractC22676k.m65745e(this.trend, insightsItemModel.trend) && AbstractC22676k.m65745e(this.title, insightsItemModel.title) && AbstractC22676k.m65745e(this.titleColor, insightsItemModel.titleColor) && AbstractC22676k.m65745e(this.titleStyle, insightsItemModel.titleStyle) && AbstractC22676k.m65745e(this.description, insightsItemModel.description) && AbstractC22676k.m65745e(this.actionRecommendation, insightsItemModel.actionRecommendation) && AbstractC22676k.m65745e(this.callout, insightsItemModel.callout) && AbstractC22676k.m65745e(this.actionButton, insightsItemModel.actionButton) && AbstractC22676k.m65745e(this.rightIcon, insightsItemModel.rightIcon) && AbstractC22676k.m65745e(this.destination, insightsItemModel.destination) && AbstractC22676k.m65745e(this.textAlignment, insightsItemModel.textAlignment) && AbstractC22676k.m65745e(this.expandableContent, insightsItemModel.expandableContent) && AbstractC22676k.m65745e(this.iconStyle, insightsItemModel.iconStyle);
    }

    public final CardButtonModel getActionButton() {
        return this.actionButton;
    }

    public final String getActionRecommendation() {
        return this.actionRecommendation;
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final String getDescription() {
        return this.description;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final ExpandableContentModel getExpandableContent() {
        return this.expandableContent;
    }

    public final String getIconStyle() {
        return this.iconStyle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getTextAlignment() {
        return this.textAlignment;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final String getTitleStyle() {
        return this.titleStyle;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.trend.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.title);
        String str = this.titleColor;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleStyle;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.description);
        String str3 = this.actionRecommendation;
        int iHashCode2 = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        int iHashCode3 = (iHashCode2 + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.actionButton;
        int iHashCode4 = (iHashCode3 + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        String str4 = this.rightIcon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode6 = (iHashCode5 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str5 = this.textAlignment;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ExpandableContentModel expandableContentModel = this.expandableContent;
        int iHashCode8 = (iHashCode7 + (expandableContentModel == null ? 0 : expandableContentModel.hashCode())) * 31;
        String str6 = this.iconStyle;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        ImpactModel impactModel = this.trend;
        String str2 = this.title;
        String str3 = this.titleColor;
        String str4 = this.titleStyle;
        String str5 = this.description;
        String str6 = this.actionRecommendation;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        CardButtonModel cardButtonModel = this.actionButton;
        String str7 = this.rightIcon;
        C9598e c9598e = this.destination;
        String str8 = this.textAlignment;
        ExpandableContentModel expandableContentModel = this.expandableContent;
        String str9 = this.iconStyle;
        StringBuilder sb4 = new StringBuilder("InsightsItemModel(id=");
        sb4.append(str);
        sb4.append(", trend=");
        sb4.append(impactModel);
        sb4.append(", title=");
        AbstractC11266d.m30444B(sb4, str2, ", titleColor=", str3, ", titleStyle=");
        AbstractC11266d.m30444B(sb4, str4, ", description=", str5, ", actionRecommendation=");
        sb4.append(str6);
        sb4.append(", callout=");
        sb4.append(infoCalloutTileModel);
        sb4.append(", actionButton=");
        sb4.append(cardButtonModel);
        sb4.append(", rightIcon=");
        sb4.append(str7);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", textAlignment=");
        sb4.append(str8);
        sb4.append(", expandableContent=");
        sb4.append(expandableContentModel);
        sb4.append(", iconStyle=");
        sb4.append(str9);
        sb4.append(")");
        return sb4.toString();
    }

    public InsightsItemModel(String id4, ImpactModel trend, String title, String str, String str2, String description, String str3, InfoCalloutTileModel infoCalloutTileModel, CardButtonModel cardButtonModel, String str4, C9598e c9598e, String str5, ExpandableContentModel expandableContentModel, String str6) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(trend, "trend");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.id = id4;
        this.trend = trend;
        this.title = title;
        this.titleColor = str;
        this.titleStyle = str2;
        this.description = description;
        this.actionRecommendation = str3;
        this.callout = infoCalloutTileModel;
        this.actionButton = cardButtonModel;
        this.rightIcon = str4;
        this.destination = c9598e;
        this.textAlignment = str5;
        this.expandableContent = expandableContentModel;
        this.iconStyle = str6;
    }

    public /* synthetic */ InsightsItemModel(String str, ImpactModel impactModel, String str2, String str3, String str4, String str5, String str6, InfoCalloutTileModel infoCalloutTileModel, CardButtonModel cardButtonModel, String str7, C9598e c9598e, String str8, ExpandableContentModel expandableContentModel, String str9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, impactModel, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, str5, str6, infoCalloutTileModel, cardButtonModel, str7, c9598e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str8, (i13 & 4096) != 0 ? null : expandableContentModel, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str9);
    }
}
