package com.whoop.design.models;

import b91.EnumC2888c;
import com.whoop.design.models.items.InfoCalloutStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mlB½\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB¹\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u001e\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b=\u0010>JÆ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bA\u00104J\u0010\u0010B\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GJ'\u0010P\u001a\u00020M2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Q\u001a\u0004\bS\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bU\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010X\u001a\u0004\bY\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\b[\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b]\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\b_\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\ba\u00104R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010b\u001a\u0004\bc\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010d\u001a\u0004\be\u00108R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\bg\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010h\u001a\u0004\bi\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010j\u001a\u0004\bk\u0010>¨\u0006n"}, m65681d2 = {"Lcom/whoop/design/models/InfoCalloutTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "description", "Lb91/c;", "descriptionTypography", "Lcom/whoop/design/models/items/InfoCalloutStyle;", "style", "Lgz0/m0;", "icon", "", "useFallbackIcon", "Lcom/whoop/design/models/IconGradient;", "iconGradient", "Lcom/whoop/design/models/IconSize;", "iconSize", "", "componentDismissalId", "", "items", "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;", "itemsAlignment", "", "analyticsProperties", "Lcom/whoop/whoopaction/domain/models/Action;", "dismissAction", "Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;", "analyticEvents", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lb91/c;", "component4", "()Lcom/whoop/design/models/items/InfoCalloutStyle;", "component5", "()Lgz0/m0;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/whoop/design/models/IconGradient;", "component8", "()Lcom/whoop/design/models/IconSize;", "component9", "()Ljava/lang/String;", "component10", "()Ljava/util/List;", "component11", "()Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;", "component12", "()Ljava/util/Map;", "component13", "()Lcom/whoop/whoopaction/domain/models/Action;", "component14", "()Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Lcom/whoop/design/models/items/InfoCalloutStyle;Lgz0/m0;Ljava/lang/Boolean;Lcom/whoop/design/models/IconGradient;Lcom/whoop/design/models/IconSize;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;)Lcom/whoop/design/models/InfoCalloutTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/InfoCalloutTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/util/TextResource;", "getTitle", "getDescription", "Lb91/c;", "getDescriptionTypography", "Lcom/whoop/design/models/items/InfoCalloutStyle;", "getStyle", "Lgz0/m0;", "getIcon", "Ljava/lang/Boolean;", "getUseFallbackIcon", "Lcom/whoop/design/models/IconGradient;", "getIconGradient", "Lcom/whoop/design/models/IconSize;", "getIconSize", "Ljava/lang/String;", "getComponentDismissalId", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/InfoCalloutTileItemsAlignment;", "getItemsAlignment", "Ljava/util/Map;", "getAnalyticsProperties", "Lcom/whoop/whoopaction/domain/models/Action;", "getDismissAction", "Lcom/whoop/design/models/InfoCalloutTileAnalyticEvents;", "getAnalyticEvents", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InfoCalloutTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final InfoCalloutTileAnalyticEvents analyticEvents;
    private final Map<String, String> analyticsProperties;
    private final String componentDismissalId;
    private final TextResource description;
    private final EnumC2888c descriptionTypography;
    private final Action dismissAction;
    private final EnumC16313m0 icon;
    private final IconGradient iconGradient;
    private final IconSize iconSize;
    private final List<DesignSystemModel> items;
    private final InfoCalloutTileItemsAlignment itemsAlignment;
    private final InfoCalloutStyle style;
    private final TextResource title;
    private final Boolean useFallbackIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/InfoCalloutTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/InfoCalloutTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InfoCalloutTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C6909a(4)), AbstractC30060g.m92087G(enumC23463i, new C6909a(5)), AbstractC30060g.m92087G(enumC23463i, new C6909a(6)), null, AbstractC30060g.m92087G(enumC23463i, new C6909a(7)), AbstractC30060g.m92087G(enumC23463i, new C6909a(8)), null, AbstractC30060g.m92087G(enumC23463i, new C6909a(9)), AbstractC30060g.m92087G(enumC23463i, new C6909a(10)), AbstractC30060g.m92087G(enumC23463i, new C6909a(11)), AbstractC30060g.m92087G(enumC23463i, new C6909a(12)), null};
    }

    public InfoCalloutTileModel() {
        this((TextResource) null, (TextResource) null, (EnumC2888c) null, (InfoCalloutStyle) null, (EnumC16313m0) null, (Boolean) null, (IconGradient) null, (IconSize) null, (String) null, (List) null, (InfoCalloutTileItemsAlignment) null, (Map) null, (Action) null, (InfoCalloutTileAnalyticEvents) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.typography.WhoopTextStyle", EnumC2888c.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.InfoCalloutStyle", InfoCalloutStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.IconGradient", IconGradient.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.IconSize", IconSize.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$4() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$5() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.InfoCalloutTileItemsAlignment", InfoCalloutTileItemsAlignment.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$6() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$7() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static final /* synthetic */ void write$Self$design_models_release(InfoCalloutTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.description, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.description);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.descriptionTypography != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.descriptionTypography);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.style != InfoCalloutStyle.NEUTRAL) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.useFallbackIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, BooleanSerializer.INSTANCE, self.useFallbackIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.iconGradient != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.iconGradient);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.iconSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.iconSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.componentDismissalId != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.componentDismissalId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.itemsAlignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.itemsAlignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.analyticsProperties != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.analyticsProperties);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.dismissAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.dismissAction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.analyticEvents == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, InfoCalloutTileAnalyticEvents$$serializer.INSTANCE, self.analyticEvents);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component10() {
        return this.items;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final InfoCalloutTileItemsAlignment getItemsAlignment() {
        return this.itemsAlignment;
    }

    public final Map<String, String> component12() {
        return this.analyticsProperties;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final InfoCalloutTileAnalyticEvents getAnalyticEvents() {
        return this.analyticEvents;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC2888c getDescriptionTypography() {
        return this.descriptionTypography;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InfoCalloutStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getUseFallbackIcon() {
        return this.useFallbackIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final IconGradient getIconGradient() {
        return this.iconGradient;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final IconSize getIconSize() {
        return this.iconSize;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getComponentDismissalId() {
        return this.componentDismissalId;
    }

    public final InfoCalloutTileModel copy(TextResource title, TextResource description, EnumC2888c descriptionTypography, InfoCalloutStyle style, EnumC16313m0 icon, Boolean useFallbackIcon, IconGradient iconGradient, IconSize iconSize, String componentDismissalId, List<? extends DesignSystemModel> items, InfoCalloutTileItemsAlignment itemsAlignment, Map<String, String> analyticsProperties, Action dismissAction, InfoCalloutTileAnalyticEvents analyticEvents) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        return new InfoCalloutTileModel(title, description, descriptionTypography, style, icon, useFallbackIcon, iconGradient, iconSize, componentDismissalId, items, itemsAlignment, analyticsProperties, dismissAction, analyticEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoCalloutTileModel)) {
            return false;
        }
        InfoCalloutTileModel infoCalloutTileModel = (InfoCalloutTileModel) other;
        return AbstractC22676k.m65745e(this.title, infoCalloutTileModel.title) && AbstractC22676k.m65745e(this.description, infoCalloutTileModel.description) && this.descriptionTypography == infoCalloutTileModel.descriptionTypography && this.style == infoCalloutTileModel.style && this.icon == infoCalloutTileModel.icon && AbstractC22676k.m65745e(this.useFallbackIcon, infoCalloutTileModel.useFallbackIcon) && this.iconGradient == infoCalloutTileModel.iconGradient && this.iconSize == infoCalloutTileModel.iconSize && AbstractC22676k.m65745e(this.componentDismissalId, infoCalloutTileModel.componentDismissalId) && AbstractC22676k.m65745e(this.items, infoCalloutTileModel.items) && this.itemsAlignment == infoCalloutTileModel.itemsAlignment && AbstractC22676k.m65745e(this.analyticsProperties, infoCalloutTileModel.analyticsProperties) && AbstractC22676k.m65745e(this.dismissAction, infoCalloutTileModel.dismissAction) && AbstractC22676k.m65745e(this.analyticEvents, infoCalloutTileModel.analyticEvents);
    }

    public final InfoCalloutTileAnalyticEvents getAnalyticEvents() {
        return this.analyticEvents;
    }

    public final Map<String, String> getAnalyticsProperties() {
        return this.analyticsProperties;
    }

    public final String getComponentDismissalId() {
        return this.componentDismissalId;
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final EnumC2888c getDescriptionTypography() {
        return this.descriptionTypography;
    }

    public final Action getDismissAction() {
        return this.dismissAction;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final IconGradient getIconGradient() {
        return this.iconGradient;
    }

    public final IconSize getIconSize() {
        return this.iconSize;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final InfoCalloutTileItemsAlignment getItemsAlignment() {
        return this.itemsAlignment;
    }

    public final InfoCalloutStyle getStyle() {
        return this.style;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final Boolean getUseFallbackIcon() {
        return this.useFallbackIcon;
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iM95625a = AbstractC31061c.m95625a((textResource == null ? 0 : textResource.hashCode()) * 31, this.description, 31);
        EnumC2888c enumC2888c = this.descriptionTypography;
        int iHashCode = (this.style.hashCode() + ((iM95625a + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31)) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        Boolean bool = this.useFallbackIcon;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        IconGradient iconGradient = this.iconGradient;
        int iHashCode4 = (iHashCode3 + (iconGradient == null ? 0 : iconGradient.hashCode())) * 31;
        IconSize iconSize = this.iconSize;
        int iHashCode5 = (iHashCode4 + (iconSize == null ? 0 : iconSize.hashCode())) * 31;
        String str = this.componentDismissalId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        List<DesignSystemModel> list = this.items;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment = this.itemsAlignment;
        int iHashCode8 = (iHashCode7 + (infoCalloutTileItemsAlignment == null ? 0 : infoCalloutTileItemsAlignment.hashCode())) * 31;
        Map<String, String> map = this.analyticsProperties;
        int iHashCode9 = (iHashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        Action action = this.dismissAction;
        int iHashCode10 = (iHashCode9 + (action == null ? 0 : action.hashCode())) * 31;
        InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents = this.analyticEvents;
        return iHashCode10 + (infoCalloutTileAnalyticEvents != null ? infoCalloutTileAnalyticEvents.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        EnumC2888c enumC2888c = this.descriptionTypography;
        InfoCalloutStyle infoCalloutStyle = this.style;
        EnumC16313m0 enumC16313m0 = this.icon;
        Boolean bool = this.useFallbackIcon;
        IconGradient iconGradient = this.iconGradient;
        IconSize iconSize = this.iconSize;
        String str = this.componentDismissalId;
        List<DesignSystemModel> list = this.items;
        InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment = this.itemsAlignment;
        Map<String, String> map = this.analyticsProperties;
        Action action = this.dismissAction;
        InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents = this.analyticEvents;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("InfoCalloutTileModel(title=", textResource, ", description=", textResource2, ", descriptionTypography=");
        sbM106658q.append(enumC2888c);
        sbM106658q.append(", style=");
        sbM106658q.append(infoCalloutStyle);
        sbM106658q.append(", icon=");
        sbM106658q.append(enumC16313m0);
        sbM106658q.append(", useFallbackIcon=");
        sbM106658q.append(bool);
        sbM106658q.append(", iconGradient=");
        sbM106658q.append(iconGradient);
        sbM106658q.append(", iconSize=");
        sbM106658q.append(iconSize);
        sbM106658q.append(", componentDismissalId=");
        AbstractC36095b.m114694v(str, ", items=", ", itemsAlignment=", sbM106658q, list);
        sbM106658q.append(infoCalloutTileItemsAlignment);
        sbM106658q.append(", analyticsProperties=");
        sbM106658q.append(map);
        sbM106658q.append(", dismissAction=");
        sbM106658q.append(action);
        sbM106658q.append(", analyticEvents=");
        sbM106658q.append(infoCalloutTileAnalyticEvents);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public /* synthetic */ InfoCalloutTileModel(int i13, TextResource textResource, TextResource textResource2, EnumC2888c enumC2888c, InfoCalloutStyle infoCalloutStyle, EnumC16313m0 enumC16313m0, Boolean bool, IconGradient iconGradient, IconSize iconSize, String str, List list, InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment, Map map, Action action, InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = textResource;
        }
        if ((i13 & 2) == 0) {
            this.description = AbstractC8693b.m21267a();
        } else {
            this.description = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.descriptionTypography = null;
        } else {
            this.descriptionTypography = enumC2888c;
        }
        if ((i13 & 8) == 0) {
            this.style = InfoCalloutStyle.NEUTRAL;
        } else {
            this.style = infoCalloutStyle;
        }
        if ((i13 & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = enumC16313m0;
        }
        if ((i13 & 32) == 0) {
            this.useFallbackIcon = null;
        } else {
            this.useFallbackIcon = bool;
        }
        if ((i13 & 64) == 0) {
            this.iconGradient = null;
        } else {
            this.iconGradient = iconGradient;
        }
        if ((i13 & 128) == 0) {
            this.iconSize = null;
        } else {
            this.iconSize = iconSize;
        }
        if ((i13 & 256) == 0) {
            this.componentDismissalId = null;
        } else {
            this.componentDismissalId = str;
        }
        if ((i13 & 512) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.itemsAlignment = null;
        } else {
            this.itemsAlignment = infoCalloutTileItemsAlignment;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.analyticsProperties = null;
        } else {
            this.analyticsProperties = map;
        }
        if ((i13 & 4096) == 0) {
            this.dismissAction = null;
        } else {
            this.dismissAction = action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.analyticEvents = null;
        } else {
            this.analyticEvents = infoCalloutTileAnalyticEvents;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoCalloutTileModel(TextResource textResource, TextResource description, EnumC2888c enumC2888c, InfoCalloutStyle style, EnumC16313m0 enumC16313m0, Boolean bool, IconGradient iconGradient, IconSize iconSize, String str, List<? extends DesignSystemModel> list, InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment, Map<String, String> map, Action action, InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        this.title = textResource;
        this.description = description;
        this.descriptionTypography = enumC2888c;
        this.style = style;
        this.icon = enumC16313m0;
        this.useFallbackIcon = bool;
        this.iconGradient = iconGradient;
        this.iconSize = iconSize;
        this.componentDismissalId = str;
        this.items = list;
        this.itemsAlignment = infoCalloutTileItemsAlignment;
        this.analyticsProperties = map;
        this.dismissAction = action;
        this.analyticEvents = infoCalloutTileAnalyticEvents;
    }

    public /* synthetic */ InfoCalloutTileModel(TextResource textResource, TextResource textResource2, EnumC2888c enumC2888c, InfoCalloutStyle infoCalloutStyle, EnumC16313m0 enumC16313m0, Boolean bool, IconGradient iconGradient, IconSize iconSize, String str, List list, InfoCalloutTileItemsAlignment infoCalloutTileItemsAlignment, Map map, Action action, InfoCalloutTileAnalyticEvents infoCalloutTileAnalyticEvents, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? null : enumC2888c, (i13 & 8) != 0 ? InfoCalloutStyle.NEUTRAL : infoCalloutStyle, (i13 & 16) != 0 ? null : enumC16313m0, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : iconGradient, (i13 & 128) != 0 ? null : iconSize, (i13 & 256) != 0 ? null : str, (i13 & 512) != 0 ? C25271y.f99162w : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : infoCalloutTileItemsAlignment, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : map, (i13 & 4096) != 0 ? null : action, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : infoCalloutTileAnalyticEvents);
    }
}
