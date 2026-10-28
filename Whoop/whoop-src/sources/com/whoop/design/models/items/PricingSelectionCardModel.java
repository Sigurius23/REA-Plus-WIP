package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
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
import w91.C36961h;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002`_B\u0081\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014BÅ\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0013\u0010\u001dJ#\u0010 \u001a\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u0017H\u0016¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u009e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b4\u0010#J\u0010\u00105\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bF\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bG\u0010#R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bH\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bI\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bJ\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bK\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010+R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bN\u0010#R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bO\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010/R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u00101R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XRE\u0010\u001a\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017j\u0004\u0018\u0001`Y¢\u0006\f\bZ\u0012\b\b[\u0012\u0004\b\t0\\8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010T\u001a\u0004\b]\u0010V\"\u0004\b^\u0010X¨\u0006a"}, m65681d2 = {"Lcom/whoop/design/models/items/PricingSelectionCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "subtitle", "priceLabel", "priceLabelSize", "priceSubLabel", "priceSubLabelMarkdown", "Lcom/whoop/design/models/items/TagModel;", "tag", "description", "style", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "", "features", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/TagModel;", "component9", "component10", "component11", "()Lcom/whoop/whoopaction/domain/models/Action;", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;)Lcom/whoop/design/models/items/PricingSelectionCardModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/PricingSelectionCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getPriceLabel", "getPriceLabelSize", "getPriceSubLabel", "getPriceSubLabelMarkdown", "Lcom/whoop/design/models/items/TagModel;", "getTag", "getDescription", "getStyle", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Ljava/util/List;", "getFeatures", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PricingSelectionCardModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String description;
    private final List<TagModel> features;
    private final String id;
    private final String priceLabel;
    private final String priceLabelSize;
    private final String priceSubLabel;
    private final String priceSubLabelMarkdown;
    private final String style;
    private final String subtitle;
    private final TagModel tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/PricingSelectionCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/PricingSelectionCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PricingSelectionCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(26)), AbstractC30060g.m92087G(enumC23463i, new C36961h(27)), AbstractC30060g.m92087G(enumC23463i, new C36961h(28)), null};
    }

    public /* synthetic */ PricingSelectionCardModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, TagModel tagModel, String str8, String str9, Action action, List list, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, PricingSelectionCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.priceLabel = str4;
        this.priceLabelSize = str5;
        this.priceSubLabel = str6;
        this.priceSubLabelMarkdown = str7;
        this.tag = tagModel;
        this.description = str8;
        this.style = str9;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.features = null;
        } else {
            this.features = list;
        }
        if ((i13 & 4096) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(TagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PricingSelectionCardModel copy$default(PricingSelectionCardModel pricingSelectionCardModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, TagModel tagModel, String str8, String str9, Action action, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pricingSelectionCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = pricingSelectionCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = pricingSelectionCardModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = pricingSelectionCardModel.priceLabel;
        }
        if ((i13 & 16) != 0) {
            str5 = pricingSelectionCardModel.priceLabelSize;
        }
        if ((i13 & 32) != 0) {
            str6 = pricingSelectionCardModel.priceSubLabel;
        }
        if ((i13 & 64) != 0) {
            str7 = pricingSelectionCardModel.priceSubLabelMarkdown;
        }
        if ((i13 & 128) != 0) {
            tagModel = pricingSelectionCardModel.tag;
        }
        if ((i13 & 256) != 0) {
            str8 = pricingSelectionCardModel.description;
        }
        if ((i13 & 512) != 0) {
            str9 = pricingSelectionCardModel.style;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            action = pricingSelectionCardModel.action;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            list = pricingSelectionCardModel.features;
        }
        Action action2 = action;
        List list2 = list;
        String str10 = str8;
        String str11 = str9;
        String str12 = str7;
        TagModel tagModel2 = tagModel;
        String str13 = str5;
        String str14 = str6;
        return pricingSelectionCardModel.copy(str, str2, str3, str4, str13, str14, str12, tagModel2, str10, str11, action2, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(PricingSelectionCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.priceLabel);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.priceLabelSize);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.priceSubLabel);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.priceSubLabelMarkdown);
        output.encodeNullableSerializableElement(serialDesc, 7, TagModel$$serializer.INSTANCE, self.tag);
        output.encodeStringElement(serialDesc, 8, self.description);
        output.encodeStringElement(serialDesc, 9, self.style);
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.features != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.features);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, (InterfaceC37145j) interfaceC23462hArr[12].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return PricingSelectionCardModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    public final List<TagModel> component12() {
        return this.features;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPriceLabel() {
        return this.priceLabel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPriceLabelSize() {
        return this.priceLabelSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPriceSubLabel() {
        return this.priceSubLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPriceSubLabelMarkdown() {
        return this.priceSubLabelMarkdown;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final PricingSelectionCardModel copy(String id4, String title, String subtitle, String priceLabel, String priceLabelSize, String priceSubLabel, String priceSubLabelMarkdown, TagModel tag, String description, String style, Action action, List<TagModel> features) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(priceLabel, "priceLabel");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        return new PricingSelectionCardModel(id4, title, subtitle, priceLabel, priceLabelSize, priceSubLabel, priceSubLabelMarkdown, tag, description, style, action, features);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricingSelectionCardModel)) {
            return false;
        }
        PricingSelectionCardModel pricingSelectionCardModel = (PricingSelectionCardModel) other;
        return AbstractC22676k.m65745e(this.id, pricingSelectionCardModel.id) && AbstractC22676k.m65745e(this.title, pricingSelectionCardModel.title) && AbstractC22676k.m65745e(this.subtitle, pricingSelectionCardModel.subtitle) && AbstractC22676k.m65745e(this.priceLabel, pricingSelectionCardModel.priceLabel) && AbstractC22676k.m65745e(this.priceLabelSize, pricingSelectionCardModel.priceLabelSize) && AbstractC22676k.m65745e(this.priceSubLabel, pricingSelectionCardModel.priceSubLabel) && AbstractC22676k.m65745e(this.priceSubLabelMarkdown, pricingSelectionCardModel.priceSubLabelMarkdown) && AbstractC22676k.m65745e(this.tag, pricingSelectionCardModel.tag) && AbstractC22676k.m65745e(this.description, pricingSelectionCardModel.description) && AbstractC22676k.m65745e(this.style, pricingSelectionCardModel.style) && AbstractC22676k.m65745e(this.action, pricingSelectionCardModel.action) && AbstractC22676k.m65745e(this.features, pricingSelectionCardModel.features);
    }

    public final Action getAction() {
        return this.action;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<TagModel> getFeatures() {
        return this.features;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPriceLabel() {
        return this.priceLabel;
    }

    public final String getPriceLabelSize() {
        return this.priceLabelSize;
    }

    public final String getPriceSubLabel() {
        return this.priceSubLabel;
    }

    public final String getPriceSubLabelMarkdown() {
        return this.priceSubLabelMarkdown;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.subtitle;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.priceLabel);
        String str3 = this.priceLabelSize;
        int iHashCode = (iM30450d2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceSubLabel;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.priceSubLabelMarkdown;
        int iHashCode3 = (iHashCode2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        TagModel tagModel = this.tag;
        int iM30450d3 = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode3 + (tagModel == null ? 0 : tagModel.hashCode())) * 31, 31, this.description), 31, this.style);
        Action action = this.action;
        int iHashCode4 = (iM30450d3 + (action == null ? 0 : action.hashCode())) * 31;
        List<TagModel> list = this.features;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
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
        String str3 = this.subtitle;
        String str4 = this.priceLabel;
        String str5 = this.priceLabelSize;
        String str6 = this.priceSubLabel;
        String str7 = this.priceSubLabelMarkdown;
        TagModel tagModel = this.tag;
        String str8 = this.description;
        String str9 = this.style;
        Action action = this.action;
        List<TagModel> list = this.features;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PricingSelectionCardModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", priceLabel=", str4, ", priceLabelSize=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", priceSubLabel=", str6, ", priceSubLabelMarkdown=");
        sbM32001t.append(str7);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", description=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", style=", str9, ", action=");
        sbM32001t.append(action);
        sbM32001t.append(", features=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PricingSelectionCardModel(String str, String title, String str2, String priceLabel, String str3, String str4, String str5, TagModel tagModel, String description, String style, Action action, List<TagModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(priceLabel, "priceLabel");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(style, "style");
        this.id = str;
        this.title = title;
        this.subtitle = str2;
        this.priceLabel = priceLabel;
        this.priceLabelSize = str3;
        this.priceSubLabel = str4;
        this.priceSubLabelMarkdown = str5;
        this.tag = tagModel;
        this.description = description;
        this.style = style;
        this.action = action;
        this.features = list;
    }

    public /* synthetic */ PricingSelectionCardModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, TagModel tagModel, String str8, String str9, Action action, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, tagModel, str8, str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : action, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : list);
    }
}
