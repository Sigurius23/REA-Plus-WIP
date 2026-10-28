package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.EnumC27267m0;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36962i;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0002feB²\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012+\b\u0002\u0010\u001b\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001a¢\u0006\u0004\b\u001c\u0010\u001dB¡\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J#\u0010%\u001a\u00020\u00022\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b5\u0010(J\u0012\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b8\u00109J3\u0010:\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001aHÆ\u0003¢\u0006\u0004\b:\u00109J»\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142+\b\u0002\u0010\u001b\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001aHÆ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b=\u0010(J\u0010\u0010>\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010A\u001a\u00020\u00122\b\u0010@\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\bA\u0010BJ'\u0010K\u001a\u00020H2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0001¢\u0006\u0004\bI\u0010JR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010L\u001a\u0004\bM\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010*R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010P\u0012\u0004\bR\u0010S\u001a\u0004\bQ\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010T\u0012\u0004\bV\u0010S\u001a\u0004\bU\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bX\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\b\\\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010L\u001a\u0004\b]\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010^\u001a\u0004\b\u0013\u00107R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010_\u001a\u0004\b`\u00109\"\u0004\ba\u0010bRE\u0010\u001b\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\t0\u001a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010_\u001a\u0004\bc\u00109\"\u0004\bd\u0010b¨\u0006g"}, m65681d2 = {"Lcom/whoop/design/models/items/SecondaryButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "icon", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/navigation/e;", "action", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "Lcom/whoop/navigation/DismissEventModel;", "dismissEvent", "Lny0/m0;", "style", "alignment", "", "isEnabled", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/design/models/modal/AnyModal;", "component5", "()Lcom/whoop/analytics/AnalyticEventModel;", "component6", "()Lcom/whoop/navigation/DismissEventModel;", "component7", "()Lny0/m0;", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "()Ljava/util/Map;", "component11", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/navigation/DismissEventModel;Lny0/m0;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SecondaryButtonModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SecondaryButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/util/TextResource;", "getText", "Lcom/whoop/navigation/e;", "getAction", "getAction$annotations", "()V", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "getModal$annotations", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Lcom/whoop/navigation/DismissEventModel;", "getDismissEvent", "Lny0/m0;", "getStyle", "getAlignment", "Ljava/lang/Boolean;", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SecondaryButtonModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e action;
    private Map<String, AggregateBinding> aggregateBindings;
    private final String alignment;
    private final AnalyticEventModel analyticEvent;
    private Map<String, String> bindings;
    private final DismissEventModel dismissEvent;
    private final String icon;
    private final Boolean isEnabled;
    private final AnyModal modal;
    private final EnumC27267m0 style;
    private final TextResource text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SecondaryButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SecondaryButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(21)), AbstractC30060g.m92087G(enumC23463i, new C36962i(22)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(23)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(24)), null};
    }

    public SecondaryButtonModel() {
        this((String) null, (TextResource) null, (C9598e) null, (AnyModal) null, (AnalyticEventModel) null, (DismissEventModel) null, (EnumC27267m0) null, (String) null, (Boolean) null, (Map) null, (Map) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnyModal.class), AbstractC38195a.m122336d(AnyModal.INSTANCE.serializer()), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.button.SecondaryButtonStyle", EnumC27267m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecondaryButtonModel copy$default(SecondaryButtonModel secondaryButtonModel, String str, TextResource textResource, C9598e c9598e, AnyModal anyModal, AnalyticEventModel analyticEventModel, DismissEventModel dismissEventModel, EnumC27267m0 enumC27267m0, String str2, Boolean bool, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = secondaryButtonModel.icon;
        }
        if ((i13 & 2) != 0) {
            textResource = secondaryButtonModel.text;
        }
        if ((i13 & 4) != 0) {
            c9598e = secondaryButtonModel.action;
        }
        if ((i13 & 8) != 0) {
            anyModal = secondaryButtonModel.modal;
        }
        if ((i13 & 16) != 0) {
            analyticEventModel = secondaryButtonModel.analyticEvent;
        }
        if ((i13 & 32) != 0) {
            dismissEventModel = secondaryButtonModel.dismissEvent;
        }
        if ((i13 & 64) != 0) {
            enumC27267m0 = secondaryButtonModel.style;
        }
        if ((i13 & 128) != 0) {
            str2 = secondaryButtonModel.alignment;
        }
        if ((i13 & 256) != 0) {
            bool = secondaryButtonModel.isEnabled;
        }
        if ((i13 & 512) != 0) {
            map = secondaryButtonModel.bindings;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map2 = secondaryButtonModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        String str3 = str2;
        Boolean bool2 = bool;
        DismissEventModel dismissEventModel2 = dismissEventModel;
        EnumC27267m0 enumC27267m1 = enumC27267m0;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        C9598e c9598e2 = c9598e;
        return secondaryButtonModel.copy(str, textResource, c9598e2, anyModal, analyticEventModel2, dismissEventModel2, enumC27267m1, str3, bool2, map3, map4);
    }

    public static /* synthetic */ void getAction$annotations() {
    }

    public static /* synthetic */ void getModal$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public static final /* synthetic */ void write$Self$design_models_release(SecondaryButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.text, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.action);
        } else {
            if (!AbstractC22676k.m65745e(self.action, new C9598e(null, null, null, 7, null))) {
                output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.action);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.modal != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.modal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.dismissEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DismissEventModel$$serializer.INSTANCE, self.dismissEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.style != EnumC27267m0.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.alignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.isEnabled);
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
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return SecondaryButtonModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final Map<String, String> component10() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component11() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC27267m0 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final SecondaryButtonModel copy(String icon, TextResource text, C9598e action, AnyModal modal, AnalyticEventModel analyticEvent, DismissEventModel dismissEvent, EnumC27267m0 style, String alignment, Boolean isEnabled, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(style, "style");
        return new SecondaryButtonModel(icon, text, action, modal, analyticEvent, dismissEvent, style, alignment, isEnabled, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryButtonModel)) {
            return false;
        }
        SecondaryButtonModel secondaryButtonModel = (SecondaryButtonModel) other;
        return AbstractC22676k.m65745e(this.icon, secondaryButtonModel.icon) && AbstractC22676k.m65745e(this.text, secondaryButtonModel.text) && AbstractC22676k.m65745e(this.action, secondaryButtonModel.action) && AbstractC22676k.m65745e(this.modal, secondaryButtonModel.modal) && AbstractC22676k.m65745e(this.analyticEvent, secondaryButtonModel.analyticEvent) && AbstractC22676k.m65745e(this.dismissEvent, secondaryButtonModel.dismissEvent) && this.style == secondaryButtonModel.style && AbstractC22676k.m65745e(this.alignment, secondaryButtonModel.alignment) && AbstractC22676k.m65745e(this.isEnabled, secondaryButtonModel.isEnabled) && AbstractC22676k.m65745e(this.bindings, secondaryButtonModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, secondaryButtonModel.aggregateBindings);
    }

    public final C9598e getAction() {
        return this.action;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final EnumC27267m0 getStyle() {
        return this.style;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.icon;
        int iM114673a = AbstractC36095b.m114673a(this.action, AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.text, 31), 31);
        AnyModal anyModal = this.modal;
        int iHashCode = (iM114673a + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode2 = (iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        DismissEventModel dismissEventModel = this.dismissEvent;
        int iHashCode3 = (this.style.hashCode() + ((iHashCode2 + (dismissEventModel == null ? 0 : dismissEventModel.hashCode())) * 31)) * 31;
        String str2 = this.alignment;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode6 + (map2 != null ? map2.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
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
        String str = this.icon;
        TextResource textResource = this.text;
        C9598e c9598e = this.action;
        AnyModal anyModal = this.modal;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        DismissEventModel dismissEventModel = this.dismissEvent;
        EnumC27267m0 enumC27267m0 = this.style;
        String str2 = this.alignment;
        Boolean bool = this.isEnabled;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("SecondaryButtonModel(icon=", str, ", text=", textResource, ", action=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", modal=");
        sbM91847q.append(anyModal);
        sbM91847q.append(", analyticEvent=");
        sbM91847q.append(analyticEventModel);
        sbM91847q.append(", dismissEvent=");
        sbM91847q.append(dismissEventModel);
        sbM91847q.append(", style=");
        sbM91847q.append(enumC27267m0);
        sbM91847q.append(", alignment=");
        sbM91847q.append(str2);
        sbM91847q.append(", isEnabled=");
        sbM91847q.append(bool);
        sbM91847q.append(", bindings=");
        sbM91847q.append(map);
        sbM91847q.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM91847q, map2, ")");
    }

    public /* synthetic */ SecondaryButtonModel(int i13, String str, TextResource textResource, C9598e c9598e, AnyModal anyModal, AnalyticEventModel analyticEventModel, DismissEventModel dismissEventModel, EnumC27267m0 enumC27267m0, String str2, Boolean bool, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i13 & 2) == 0) {
            this.text = AbstractC8693b.m21267a();
        } else {
            this.text = textResource;
        }
        if ((i13 & 4) == 0) {
            this.action = new C9598e(null, null, null, 7, null);
        } else {
            this.action = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
        if ((i13 & 16) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 32) == 0) {
            this.dismissEvent = null;
        } else {
            this.dismissEvent = dismissEventModel;
        }
        this.style = (i13 & 64) == 0 ? EnumC27267m0.DEFAULT : enumC27267m0;
        if ((i13 & 128) == 0) {
            this.alignment = null;
        } else {
            this.alignment = str2;
        }
        if ((i13 & 256) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
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

    public SecondaryButtonModel(String str, TextResource text, C9598e action, AnyModal anyModal, AnalyticEventModel analyticEventModel, DismissEventModel dismissEventModel, EnumC27267m0 style, String str2, Boolean bool, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(style, "style");
        this.icon = str;
        this.text = text;
        this.action = action;
        this.modal = anyModal;
        this.analyticEvent = analyticEventModel;
        this.dismissEvent = dismissEventModel;
        this.style = style;
        this.alignment = str2;
        this.isEnabled = bool;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ SecondaryButtonModel(String str, TextResource textResource, C9598e c9598e, AnyModal anyModal, AnalyticEventModel analyticEventModel, DismissEventModel dismissEventModel, EnumC27267m0 enumC27267m0, String str2, Boolean bool, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? new C9598e(null, null, null, 7, null) : c9598e, (i13 & 8) != 0 ? null : anyModal, (i13 & 16) != 0 ? null : analyticEventModel, (i13 & 32) != 0 ? null : dismissEventModel, (i13 & 64) != 0 ? EnumC27267m0.DEFAULT : enumC27267m0, (i13 & 128) != 0 ? null : str2, (i13 & 256) != 0 ? null : bool, (i13 & 512) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map2);
    }
}
