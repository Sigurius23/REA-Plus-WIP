package com.whoop.design.models.items.recommendationtileheader;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p004a2.C0155d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002`_B¶\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012+\b\u0002\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018¢\u0006\u0004\b\u001a\u0010\u001bB¯\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J#\u0010#\u001a\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0010\u00101\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u001e\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J3\u00107\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018HÆ\u0003¢\u0006\u0004\b7\u00106JÍ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00122+\b\u0002\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u0018HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b:\u0010&J\u0010\u0010;\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bF\u0010GR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bM\u0010&R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bN\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010,R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Q\u001a\u0004\bR\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bS\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bT\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bV\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010W\u001a\u0004\bX\u00104R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010Y\u001a\u0004\bZ\u00106\"\u0004\b[\u0010\\RE\u0010\u0019\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\t0\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010Y\u001a\u0004\b]\u00106\"\u0004\b^\u0010\\¨\u0006a"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "leading", "icon", "title", "Lb91/c;", "titleTypography", "", "description", "trailing", "emoji", "", "iconBackgroundEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DesignSystemModel;", "component3", "component4", "component5", "()Lb91/c;", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Z", "component10", "()Lcom/whoop/navigation/models/GenericInteraction;", "component11", "()Ljava/util/Map;", "component12", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Lb91/c;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ZLcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/DesignSystemModel;", "getLeading", "getIcon", "getTitle", "Lb91/c;", "getTitleTypography", "Ljava/util/List;", "getDescription", "getTrailing", "getEmoji", "Z", "getIconBackgroundEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RecommendationTileHeaderModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final List<DesignSystemModel> description;
    private final DesignSystemModel emoji;
    private final String icon;
    private final boolean iconBackgroundEnabled;
    private final String id;
    private final GenericInteraction interaction;
    private final DesignSystemModel leading;
    private final String title;
    private final EnumC2888c titleTypography;
    private final DesignSystemModel trailing;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/recommendationtileheader/RecommendationTileHeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RecommendationTileHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C0155d(11)), null, null, AbstractC30060g.m92087G(enumC23463i, new C0155d(12)), AbstractC30060g.m92087G(enumC23463i, new C0155d(13)), AbstractC30060g.m92087G(enumC23463i, new C0155d(14)), AbstractC30060g.m92087G(enumC23463i, new C0155d(15)), null, null, AbstractC30060g.m92087G(enumC23463i, new C0155d(16)), null};
    }

    public /* synthetic */ RecommendationTileHeaderModel(int i13, String str, DesignSystemModel designSystemModel, String str2, String str3, EnumC2888c enumC2888c, List list, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, boolean z4, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (223 != (i13 & 223)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 223, RecommendationTileHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.leading = designSystemModel;
        this.icon = str2;
        this.title = str3;
        this.titleTypography = enumC2888c;
        if ((i13 & 32) == 0) {
            this.description = C25271y.f99162w;
        } else {
            this.description = list;
        }
        this.trailing = designSystemModel2;
        this.emoji = designSystemModel3;
        if ((i13 & 256) == 0) {
            this.iconBackgroundEnabled = true;
        } else {
            this.iconBackgroundEnabled = z4;
        }
        if ((i13 & 512) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.typography.WhoopTextStyle", EnumC2888c.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$3() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationTileHeaderModel copy$default(RecommendationTileHeaderModel recommendationTileHeaderModel, String str, DesignSystemModel designSystemModel, String str2, String str3, EnumC2888c enumC2888c, List list, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, boolean z4, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = recommendationTileHeaderModel.id;
        }
        if ((i13 & 2) != 0) {
            designSystemModel = recommendationTileHeaderModel.leading;
        }
        if ((i13 & 4) != 0) {
            str2 = recommendationTileHeaderModel.icon;
        }
        if ((i13 & 8) != 0) {
            str3 = recommendationTileHeaderModel.title;
        }
        if ((i13 & 16) != 0) {
            enumC2888c = recommendationTileHeaderModel.titleTypography;
        }
        if ((i13 & 32) != 0) {
            list = recommendationTileHeaderModel.description;
        }
        if ((i13 & 64) != 0) {
            designSystemModel2 = recommendationTileHeaderModel.trailing;
        }
        if ((i13 & 128) != 0) {
            designSystemModel3 = recommendationTileHeaderModel.emoji;
        }
        if ((i13 & 256) != 0) {
            z4 = recommendationTileHeaderModel.iconBackgroundEnabled;
        }
        if ((i13 & 512) != 0) {
            genericInteraction = recommendationTileHeaderModel.interaction;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = recommendationTileHeaderModel.bindings;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            map2 = recommendationTileHeaderModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        boolean z13 = z4;
        GenericInteraction genericInteraction2 = genericInteraction;
        DesignSystemModel designSystemModel4 = designSystemModel2;
        DesignSystemModel designSystemModel5 = designSystemModel3;
        EnumC2888c enumC2888c2 = enumC2888c;
        List list2 = list;
        return recommendationTileHeaderModel.copy(str, designSystemModel, str2, str3, enumC2888c2, list2, designSystemModel4, designSystemModel5, z13, genericInteraction2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RecommendationTileHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.leading);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        output.encodeStringElement(serialDesc, 3, self.title);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.titleTypography);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.description, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.description);
        }
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.trailing);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.emoji);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !self.iconBackgroundEnabled) {
            output.encodeBooleanElement(serialDesc, 8, self.iconBackgroundEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, GenericInteraction$$serializer.INSTANCE, self.interaction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 11, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return RecommendationTileHeaderModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final Map<String, String> component11() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component12() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    public final List<DesignSystemModel> component6() {
        return this.description;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DesignSystemModel getTrailing() {
        return this.trailing;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DesignSystemModel getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIconBackgroundEnabled() {
        return this.iconBackgroundEnabled;
    }

    public final RecommendationTileHeaderModel copy(String id4, DesignSystemModel leading, String icon, String title, EnumC2888c titleTypography, List<? extends DesignSystemModel> description, DesignSystemModel trailing, DesignSystemModel emoji, boolean iconBackgroundEnabled, GenericInteraction interaction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new RecommendationTileHeaderModel(id4, leading, icon, title, titleTypography, description, trailing, emoji, iconBackgroundEnabled, interaction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationTileHeaderModel)) {
            return false;
        }
        RecommendationTileHeaderModel recommendationTileHeaderModel = (RecommendationTileHeaderModel) other;
        return AbstractC22676k.m65745e(this.id, recommendationTileHeaderModel.id) && AbstractC22676k.m65745e(this.leading, recommendationTileHeaderModel.leading) && AbstractC22676k.m65745e(this.icon, recommendationTileHeaderModel.icon) && AbstractC22676k.m65745e(this.title, recommendationTileHeaderModel.title) && this.titleTypography == recommendationTileHeaderModel.titleTypography && AbstractC22676k.m65745e(this.description, recommendationTileHeaderModel.description) && AbstractC22676k.m65745e(this.trailing, recommendationTileHeaderModel.trailing) && AbstractC22676k.m65745e(this.emoji, recommendationTileHeaderModel.emoji) && this.iconBackgroundEnabled == recommendationTileHeaderModel.iconBackgroundEnabled && AbstractC22676k.m65745e(this.interaction, recommendationTileHeaderModel.interaction) && AbstractC22676k.m65745e(this.bindings, recommendationTileHeaderModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, recommendationTileHeaderModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<DesignSystemModel> getDescription() {
        return this.description;
    }

    public final DesignSystemModel getEmoji() {
        return this.emoji;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final boolean getIconBackgroundEnabled() {
        return this.iconBackgroundEnabled;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final DesignSystemModel getLeading() {
        return this.leading;
    }

    public final String getTitle() {
        return this.title;
    }

    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    public final DesignSystemModel getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DesignSystemModel designSystemModel = this.leading;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        String str2 = this.icon;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
        EnumC2888c enumC2888c = this.titleTypography;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31, 31, this.description);
        DesignSystemModel designSystemModel2 = this.trailing;
        int iHashCode3 = (iM31983b + (designSystemModel2 == null ? 0 : designSystemModel2.hashCode())) * 31;
        DesignSystemModel designSystemModel3 = this.emoji;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (designSystemModel3 == null ? 0 : designSystemModel3.hashCode())) * 31, 31, this.iconBackgroundEnabled);
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode4 = (iM8289b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
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
        DesignSystemModel designSystemModel = this.leading;
        String str2 = this.icon;
        String str3 = this.title;
        EnumC2888c enumC2888c = this.titleTypography;
        List<DesignSystemModel> list = this.description;
        DesignSystemModel designSystemModel2 = this.trailing;
        DesignSystemModel designSystemModel3 = this.emoji;
        boolean z4 = this.iconBackgroundEnabled;
        GenericInteraction genericInteraction = this.interaction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("RecommendationTileHeaderModel(id=");
        sb4.append(str);
        sb4.append(", leading=");
        sb4.append(designSystemModel);
        sb4.append(", icon=");
        AbstractC11266d.m30444B(sb4, str2, ", title=", str3, ", titleTypography=");
        sb4.append(enumC2888c);
        sb4.append(", description=");
        sb4.append(list);
        sb4.append(", trailing=");
        sb4.append(designSystemModel2);
        sb4.append(", emoji=");
        sb4.append(designSystemModel3);
        sb4.append(", iconBackgroundEnabled=");
        sb4.append(z4);
        sb4.append(", interaction=");
        sb4.append(genericInteraction);
        sb4.append(", bindings=");
        return AbstractC30802r.m94765n(sb4, map, ", aggregateBindings=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationTileHeaderModel(String str, DesignSystemModel designSystemModel, String str2, String title, EnumC2888c enumC2888c, List<? extends DesignSystemModel> description, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, boolean z4, GenericInteraction genericInteraction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.id = str;
        this.leading = designSystemModel;
        this.icon = str2;
        this.title = title;
        this.titleTypography = enumC2888c;
        this.description = description;
        this.trailing = designSystemModel2;
        this.emoji = designSystemModel3;
        this.iconBackgroundEnabled = z4;
        this.interaction = genericInteraction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ RecommendationTileHeaderModel(String str, DesignSystemModel designSystemModel, String str2, String str3, EnumC2888c enumC2888c, List list, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, boolean z4, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, designSystemModel, str2, str3, enumC2888c, (i13 & 32) != 0 ? C25271y.f99162w : list, designSystemModel2, designSystemModel3, (i13 & 256) != 0 ? true : z4, (i13 & 512) != 0 ? null : genericInteraction, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : map2);
    }
}
