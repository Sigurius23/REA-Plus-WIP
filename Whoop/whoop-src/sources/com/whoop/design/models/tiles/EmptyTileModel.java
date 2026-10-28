package com.whoop.design.models.tiles;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import k11.EnumC22118a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0002\\[B¦\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012+\b\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017¢\u0006\u0004\b\u0019\u0010\u001aB¡\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ#\u0010\"\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b2\u00103J3\u00104\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0003¢\u0006\u0004\b4\u00103J¹\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112+\b\u0002\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u0017HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b7\u0010%J\u0010\u00108\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bH\u0010%R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bI\u0010%R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bJ\u0010%R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bK\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bP\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u00101R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010U\u001a\u0004\bV\u00103\"\u0004\bW\u0010XRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\t0\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010U\u001a\u0004\bY\u00103\"\u0004\bZ\u0010X¨\u0006]"}, m65681d2 = {"Lcom/whoop/design/models/tiles/EmptyTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "body", "imageUrl", "Lcom/whoop/design/models/items/TagModel;", "tag", "Lcom/whoop/design/models/items/CardButtonModel;", "primaryButton", "secondaryButton", "Lk11/a;", "buttonConfiguration", "Lcom/whoop/analytics/AnalyticEventModel;", "viewedAnalyticEvent", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/TagModel;", "component6", "()Lcom/whoop/design/models/items/CardButtonModel;", "component7", "component8", "()Lk11/a;", "component9", "()Lcom/whoop/analytics/AnalyticEventModel;", "component10", "()Ljava/util/Map;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lk11/a;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/tiles/EmptyTileModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/tiles/EmptyTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getBody", "getImageUrl", "Lcom/whoop/design/models/items/TagModel;", "getTag", "Lcom/whoop/design/models/items/CardButtonModel;", "getPrimaryButton", "getSecondaryButton", "Lk11/a;", "getButtonConfiguration", "Lcom/whoop/analytics/AnalyticEventModel;", "getViewedAnalyticEvent", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EmptyTileModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String body;
    private final EnumC22118a buttonConfiguration;
    private final String id;
    private final String imageUrl;
    private final CardButtonModel primaryButton;
    private final CardButtonModel secondaryButton;
    private final TagModel tag;
    private final String title;
    private final AnalyticEventModel viewedAnalyticEvent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/tiles/EmptyTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EmptyTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13998z1(3)), null, AbstractC30060g.m92087G(enumC23463i, new C13998z1(4)), null};
    }

    public /* synthetic */ EmptyTileModel(int i13, String str, String str2, String str3, String str4, TagModel tagModel, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, EnumC22118a enumC22118a, AnalyticEventModel analyticEventModel, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, EmptyTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.body = str3;
        this.imageUrl = str4;
        this.tag = tagModel;
        if ((i13 & 32) == 0) {
            this.primaryButton = null;
        } else {
            this.primaryButton = cardButtonModel;
        }
        if ((i13 & 64) == 0) {
            this.secondaryButton = null;
        } else {
            this.secondaryButton = cardButtonModel2;
        }
        if ((i13 & 128) == 0) {
            this.buttonConfiguration = null;
        } else {
            this.buttonConfiguration = enumC22118a;
        }
        if ((i13 & 256) == 0) {
            this.viewedAnalyticEvent = null;
        } else {
            this.viewedAnalyticEvent = analyticEventModel;
        }
        if ((i13 & 512) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.emptytile.ButtonConfiguration", EnumC22118a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EmptyTileModel copy$default(EmptyTileModel emptyTileModel, String str, String str2, String str3, String str4, TagModel tagModel, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, EnumC22118a enumC22118a, AnalyticEventModel analyticEventModel, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = emptyTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = emptyTileModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = emptyTileModel.body;
        }
        if ((i13 & 8) != 0) {
            str4 = emptyTileModel.imageUrl;
        }
        if ((i13 & 16) != 0) {
            tagModel = emptyTileModel.tag;
        }
        if ((i13 & 32) != 0) {
            cardButtonModel = emptyTileModel.primaryButton;
        }
        if ((i13 & 64) != 0) {
            cardButtonModel2 = emptyTileModel.secondaryButton;
        }
        if ((i13 & 128) != 0) {
            enumC22118a = emptyTileModel.buttonConfiguration;
        }
        if ((i13 & 256) != 0) {
            analyticEventModel = emptyTileModel.viewedAnalyticEvent;
        }
        if ((i13 & 512) != 0) {
            map = emptyTileModel.bindings;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map2 = emptyTileModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        EnumC22118a enumC22118a2 = enumC22118a;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        CardButtonModel cardButtonModel3 = cardButtonModel;
        CardButtonModel cardButtonModel4 = cardButtonModel2;
        TagModel tagModel2 = tagModel;
        String str5 = str3;
        return emptyTileModel.copy(str, str2, str5, str4, tagModel2, cardButtonModel3, cardButtonModel4, enumC22118a2, analyticEventModel2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(EmptyTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.body);
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 4, TagModel$$serializer.INSTANCE, self.tag);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.primaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, CardButtonModel$$serializer.INSTANCE, self.primaryButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.secondaryButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, CardButtonModel$$serializer.INSTANCE, self.secondaryButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.buttonConfiguration != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.buttonConfiguration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.viewedAnalyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, AnalyticEventModel$$serializer.INSTANCE, self.viewedAnalyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, String> component10() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component11() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CardButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EnumC22118a getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AnalyticEventModel getViewedAnalyticEvent() {
        return this.viewedAnalyticEvent;
    }

    public final EmptyTileModel copy(String id4, String title, String body, String imageUrl, TagModel tag, CardButtonModel primaryButton, CardButtonModel secondaryButton, EnumC22118a buttonConfiguration, AnalyticEventModel viewedAnalyticEvent, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new EmptyTileModel(id4, title, body, imageUrl, tag, primaryButton, secondaryButton, buttonConfiguration, viewedAnalyticEvent, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyTileModel)) {
            return false;
        }
        EmptyTileModel emptyTileModel = (EmptyTileModel) other;
        return AbstractC22676k.m65745e(this.id, emptyTileModel.id) && AbstractC22676k.m65745e(this.title, emptyTileModel.title) && AbstractC22676k.m65745e(this.body, emptyTileModel.body) && AbstractC22676k.m65745e(this.imageUrl, emptyTileModel.imageUrl) && AbstractC22676k.m65745e(this.tag, emptyTileModel.tag) && AbstractC22676k.m65745e(this.primaryButton, emptyTileModel.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, emptyTileModel.secondaryButton) && this.buttonConfiguration == emptyTileModel.buttonConfiguration && AbstractC22676k.m65745e(this.viewedAnalyticEvent, emptyTileModel.viewedAnalyticEvent) && AbstractC22676k.m65745e(this.bindings, emptyTileModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, emptyTileModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getBody() {
        return this.body;
    }

    public final EnumC22118a getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final CardButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AnalyticEventModel getViewedAnalyticEvent() {
        return this.viewedAnalyticEvent;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.body), 31, this.imageUrl);
        TagModel tagModel = this.tag;
        int iHashCode = (iM30450d + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        CardButtonModel cardButtonModel = this.primaryButton;
        int iHashCode2 = (iHashCode + (cardButtonModel == null ? 0 : cardButtonModel.hashCode())) * 31;
        CardButtonModel cardButtonModel2 = this.secondaryButton;
        int iHashCode3 = (iHashCode2 + (cardButtonModel2 == null ? 0 : cardButtonModel2.hashCode())) * 31;
        EnumC22118a enumC22118a = this.buttonConfiguration;
        int iHashCode4 = (iHashCode3 + (enumC22118a == null ? 0 : enumC22118a.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.viewedAnalyticEvent;
        int iHashCode5 = (iHashCode4 + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.body;
        String str4 = this.imageUrl;
        TagModel tagModel = this.tag;
        CardButtonModel cardButtonModel = this.primaryButton;
        CardButtonModel cardButtonModel2 = this.secondaryButton;
        EnumC22118a enumC22118a = this.buttonConfiguration;
        AnalyticEventModel analyticEventModel = this.viewedAnalyticEvent;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EmptyTileModel(id=", str, ", title=", str2, ", body=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", imageUrl=", str4, ", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", primaryButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(", secondaryButton=");
        sbM32001t.append(cardButtonModel2);
        sbM32001t.append(", buttonConfiguration=");
        sbM32001t.append(enumC22118a);
        sbM32001t.append(", viewedAnalyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(", bindings=");
        sbM32001t.append(map);
        sbM32001t.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public EmptyTileModel(String id4, String title, String body, String imageUrl, TagModel tagModel, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, EnumC22118a enumC22118a, AnalyticEventModel analyticEventModel, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.id = id4;
        this.title = title;
        this.body = body;
        this.imageUrl = imageUrl;
        this.tag = tagModel;
        this.primaryButton = cardButtonModel;
        this.secondaryButton = cardButtonModel2;
        this.buttonConfiguration = enumC22118a;
        this.viewedAnalyticEvent = analyticEventModel;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public EmptyTileModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return EmptyTileModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ EmptyTileModel(String str, String str2, String str3, String str4, TagModel tagModel, CardButtonModel cardButtonModel, CardButtonModel cardButtonModel2, EnumC22118a enumC22118a, AnalyticEventModel analyticEventModel, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, tagModel, (i13 & 32) != 0 ? null : cardButtonModel, (i13 & 64) != 0 ? null : cardButtonModel2, (i13 & 128) != 0 ? null : enumC22118a, (i13 & 256) != 0 ? null : analyticEventModel, (i13 & 512) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map2);
    }
}
