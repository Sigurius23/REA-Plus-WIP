package com.whoop.design.models.items;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import java.util.Map;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0004efgdB´\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012+\b\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001b¢\u0006\u0004\b\u001d\u0010\u001eB©\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J#\u0010%\u001a\u00020\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b7\u00108J\u001e\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b9\u0010:J3\u0010;\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001bHÆ\u0003¢\u0006\u0004\b;\u0010:JÇ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152+\b\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001bHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b>\u0010(J\u0010\u0010?\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\bB\u0010CJ'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010M\u001a\u0004\bN\u0010(R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\bO\u0010(R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\b\u0007\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bR\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010Q\u001a\u0004\bS\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010T\u001a\u0004\bU\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\bW\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\bY\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\b[\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\\\u001a\u0004\b]\u00108R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010^\u001a\u0004\b_\u0010:\"\u0004\b`\u0010aRE\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010^\u001a\u0004\bb\u0010:\"\u0004\bc\u0010a¨\u0006h"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "label", "", "isToggled", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "Lb91/c;", "labelStyle", "", "spacerSize", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;", "alignment", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;", "style", "Ly81/f;", "toggledOnColor", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "component5", "component6", "()Lb91/c;", "component7", "()Ljava/lang/Integer;", "component8", "()Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;", "component9", "()Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;", "component10", "()Ly81/f;", "component11", "()Ljava/util/Map;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lb91/c;Ljava/lang/Integer;Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;Ly81/f;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/CheckboxModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CheckboxModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getLabel", "Z", "Lcom/whoop/navigation/models/GenericInteraction;", "getToggleOnInteraction", "getToggleOffInteraction", "Lb91/c;", "getLabelStyle", "Ljava/lang/Integer;", "getSpacerSize", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;", "getAlignment", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;", "getStyle", "Ly81/f;", "getToggledOnColor", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "CheckboxAlignment", "CheckboxStyle", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CheckboxModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final CheckboxAlignment alignment;
    private Map<String, String> bindings;
    private final String id;
    private final boolean isToggled;
    private final String label;
    private final EnumC2888c labelStyle;
    private final Integer spacerSize;
    private final CheckboxStyle style;
    private final GenericInteraction toggleOffInteraction;
    private final GenericInteraction toggleOnInteraction;
    private final EnumC39333f toggledOnColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "LEADING", "CENTER", "TRAILING", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum CheckboxAlignment {
        LEADING,
        CENTER,
        TRAILING;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(28));

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxAlignment;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
                return (InterfaceC37138c) CheckboxAlignment.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC37138c serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.CheckboxModel.CheckboxAlignment", values());
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;", "", "<init>", "(Ljava/lang/String;I)V", "MARKDOWN", "TRADITIONAL", "TOGGLE", "NO_LABEL", "V2", "V2_NO_LABEL", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum CheckboxStyle {
        MARKDOWN,
        TRADITIONAL,
        TOGGLE,
        NO_LABEL,
        V2,
        V2_NO_LABEL;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(29));

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CheckboxModel$CheckboxStyle;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
                return (InterfaceC37138c) CheckboxStyle.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC37138c serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.CheckboxModel.CheckboxStyle", values());
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CheckboxModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CheckboxModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CheckboxModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(23)), null, AbstractC30060g.m92087G(enumC23463i, new C36954a(24)), AbstractC30060g.m92087G(enumC23463i, new C36954a(25)), AbstractC30060g.m92087G(enumC23463i, new C36954a(26)), AbstractC30060g.m92087G(enumC23463i, new C36954a(27)), null};
    }

    public /* synthetic */ CheckboxModel(int i13, String str, String str2, boolean z4, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, EnumC2888c enumC2888c, Integer num, CheckboxAlignment checkboxAlignment, CheckboxStyle checkboxStyle, EnumC39333f enumC39333f, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (103 != (i13 & 103)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 103, CheckboxModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = str2;
        this.isToggled = z4;
        if ((i13 & 8) == 0) {
            this.toggleOnInteraction = null;
        } else {
            this.toggleOnInteraction = genericInteraction;
        }
        if ((i13 & 16) == 0) {
            this.toggleOffInteraction = null;
        } else {
            this.toggleOffInteraction = genericInteraction2;
        }
        this.labelStyle = enumC2888c;
        this.spacerSize = num;
        if ((i13 & 128) == 0) {
            this.alignment = null;
        } else {
            this.alignment = checkboxAlignment;
        }
        if ((i13 & 256) == 0) {
            this.style = null;
        } else {
            this.style = checkboxStyle;
        }
        if ((i13 & 512) == 0) {
            this.toggledOnColor = null;
        } else {
            this.toggledOnColor = enumC39333f;
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
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.typography.WhoopTextStyle", EnumC2888c.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return CheckboxAlignment.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return CheckboxStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckboxModel copy$default(CheckboxModel checkboxModel, String str, String str2, boolean z4, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, EnumC2888c enumC2888c, Integer num, CheckboxAlignment checkboxAlignment, CheckboxStyle checkboxStyle, EnumC39333f enumC39333f, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checkboxModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = checkboxModel.label;
        }
        if ((i13 & 4) != 0) {
            z4 = checkboxModel.isToggled;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = checkboxModel.toggleOnInteraction;
        }
        if ((i13 & 16) != 0) {
            genericInteraction2 = checkboxModel.toggleOffInteraction;
        }
        if ((i13 & 32) != 0) {
            enumC2888c = checkboxModel.labelStyle;
        }
        if ((i13 & 64) != 0) {
            num = checkboxModel.spacerSize;
        }
        if ((i13 & 128) != 0) {
            checkboxAlignment = checkboxModel.alignment;
        }
        if ((i13 & 256) != 0) {
            checkboxStyle = checkboxModel.style;
        }
        if ((i13 & 512) != 0) {
            enumC39333f = checkboxModel.toggledOnColor;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map = checkboxModel.bindings;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            map2 = checkboxModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        CheckboxStyle checkboxStyle2 = checkboxStyle;
        EnumC39333f enumC39333f2 = enumC39333f;
        Integer num2 = num;
        CheckboxAlignment checkboxAlignment2 = checkboxAlignment;
        GenericInteraction genericInteraction3 = genericInteraction2;
        EnumC2888c enumC2888c2 = enumC2888c;
        return checkboxModel.copy(str, str2, z4, genericInteraction, genericInteraction3, enumC2888c2, num2, checkboxAlignment2, checkboxStyle2, enumC39333f2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CheckboxModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeBooleanElement(serialDesc, 2, self.isToggled);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.toggleOnInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.toggleOnInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.toggleOffInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.toggleOffInteraction);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.labelStyle);
        output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.spacerSize);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.alignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.toggledOnColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.toggledOnColor);
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
        return CheckboxModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EnumC39333f getToggledOnColor() {
        return this.toggledOnColor;
    }

    public final Map<String, String> component11() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component12() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsToggled() {
        return this.isToggled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC2888c getLabelStyle() {
        return this.labelStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getSpacerSize() {
        return this.spacerSize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CheckboxAlignment getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CheckboxStyle getStyle() {
        return this.style;
    }

    public final CheckboxModel copy(String id4, String label, boolean isToggled, GenericInteraction toggleOnInteraction, GenericInteraction toggleOffInteraction, EnumC2888c labelStyle, Integer spacerSize, CheckboxAlignment alignment, CheckboxStyle style, EnumC39333f toggledOnColor, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        return new CheckboxModel(id4, label, isToggled, toggleOnInteraction, toggleOffInteraction, labelStyle, spacerSize, alignment, style, toggledOnColor, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxModel)) {
            return false;
        }
        CheckboxModel checkboxModel = (CheckboxModel) other;
        return AbstractC22676k.m65745e(this.id, checkboxModel.id) && AbstractC22676k.m65745e(this.label, checkboxModel.label) && this.isToggled == checkboxModel.isToggled && AbstractC22676k.m65745e(this.toggleOnInteraction, checkboxModel.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, checkboxModel.toggleOffInteraction) && this.labelStyle == checkboxModel.labelStyle && AbstractC22676k.m65745e(this.spacerSize, checkboxModel.spacerSize) && this.alignment == checkboxModel.alignment && this.style == checkboxModel.style && this.toggledOnColor == checkboxModel.toggledOnColor && AbstractC22676k.m65745e(this.bindings, checkboxModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, checkboxModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final CheckboxAlignment getAlignment() {
        return this.alignment;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final EnumC2888c getLabelStyle() {
        return this.labelStyle;
    }

    public final Integer getSpacerSize() {
        return this.spacerSize;
    }

    public final CheckboxStyle getStyle() {
        return this.style;
    }

    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    public final EnumC39333f getToggledOnColor() {
        return this.toggledOnColor;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label), 31, this.isToggled);
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        int iHashCode = (iM8289b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        int iHashCode2 = (iHashCode + (genericInteraction2 == null ? 0 : genericInteraction2.hashCode())) * 31;
        EnumC2888c enumC2888c = this.labelStyle;
        int iHashCode3 = (iHashCode2 + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
        Integer num = this.spacerSize;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        CheckboxAlignment checkboxAlignment = this.alignment;
        int iHashCode5 = (iHashCode4 + (checkboxAlignment == null ? 0 : checkboxAlignment.hashCode())) * 31;
        CheckboxStyle checkboxStyle = this.style;
        int iHashCode6 = (iHashCode5 + (checkboxStyle == null ? 0 : checkboxStyle.hashCode())) * 31;
        EnumC39333f enumC39333f = this.toggledOnColor;
        int iHashCode7 = (iHashCode6 + (enumC39333f == null ? 0 : enumC39333f.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode8 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isToggled() {
        return this.isToggled;
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
        String str2 = this.label;
        boolean z4 = this.isToggled;
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        EnumC2888c enumC2888c = this.labelStyle;
        Integer num = this.spacerSize;
        CheckboxAlignment checkboxAlignment = this.alignment;
        CheckboxStyle checkboxStyle = this.style;
        EnumC39333f enumC39333f = this.toggledOnColor;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CheckboxModel(id=", str, ", label=", str2, ", isToggled=");
        sbM32001t.append(z4);
        sbM32001t.append(", toggleOnInteraction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", toggleOffInteraction=");
        sbM32001t.append(genericInteraction2);
        sbM32001t.append(", labelStyle=");
        sbM32001t.append(enumC2888c);
        sbM32001t.append(", spacerSize=");
        sbM32001t.append(num);
        sbM32001t.append(", alignment=");
        sbM32001t.append(checkboxAlignment);
        sbM32001t.append(", style=");
        sbM32001t.append(checkboxStyle);
        sbM32001t.append(", toggledOnColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", bindings=");
        return AbstractC30802r.m94765n(sbM32001t, map, ", aggregateBindings=", map2, ")");
    }

    public CheckboxModel(String id4, String label, boolean z4, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, EnumC2888c enumC2888c, Integer num, CheckboxAlignment checkboxAlignment, CheckboxStyle checkboxStyle, EnumC39333f enumC39333f, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        this.id = id4;
        this.label = label;
        this.isToggled = z4;
        this.toggleOnInteraction = genericInteraction;
        this.toggleOffInteraction = genericInteraction2;
        this.labelStyle = enumC2888c;
        this.spacerSize = num;
        this.alignment = checkboxAlignment;
        this.style = checkboxStyle;
        this.toggledOnColor = enumC39333f;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ CheckboxModel(String str, String str2, boolean z4, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, EnumC2888c enumC2888c, Integer num, CheckboxAlignment checkboxAlignment, CheckboxStyle checkboxStyle, EnumC39333f enumC39333f, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z4, (i13 & 8) != 0 ? null : genericInteraction, (i13 & 16) != 0 ? null : genericInteraction2, enumC2888c, num, (i13 & 128) != 0 ? null : checkboxAlignment, (i13 & 256) != 0 ? null : checkboxStyle, (i13 & 512) != 0 ? null : enumC39333f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : map2);
    }
}
