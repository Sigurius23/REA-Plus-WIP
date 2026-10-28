package com.whoop.design.models;

import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0004fgheB¤\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015\u0012+\b\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001b¢\u0006\u0004\b\u001d\u0010\u001eB¡\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J#\u0010&\u001a\u00020\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$0\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b8\u00109J\u001e\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b:\u0010;J3\u0010<\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001bHÆ\u0003¢\u0006\u0004\b<\u0010;J·\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152+\b\u0002\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001bHÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b?\u0010-J\u0010\u0010@\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\bC\u0010DJ'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001¢\u0006\u0004\bK\u0010LR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010N\u001a\u0004\bO\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bS\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010T\u001a\u0004\bU\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b[\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\b\u0012\u00107R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010]\u001a\u0004\b^\u00109R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010_\u001a\u0004\b`\u0010;\"\u0004\ba\u0010bRE\u0010\u001c\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\t0\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010_\u001a\u0004\bc\u0010;\"\u0004\bd\u0010b¨\u0006i"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;", "buttonType", "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "style", "", "icon", "Ly81/f;", "iconColor", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "glowStyle", "", "fillPercentage", "", "isEnabled", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Lcom/whoop/design/models/ProgressButtonModel$ButtonType;", "component2", "()Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "component3", "()Ljava/lang/String;", "component4", "()Ly81/f;", "component5", "()Lcom/whoop/design/util/TextResource;", "component6", "()Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "component7", "()Ljava/lang/Float;", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/whoop/navigation/models/GenericInteraction;", "component10", "()Ljava/util/Map;", "component11", "copy", "(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/ProgressButtonModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/ProgressButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;", "getButtonType", "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "getStyle", "Ljava/lang/String;", "getIcon", "Ly81/f;", "getIconColor", "Lcom/whoop/design/util/TextResource;", "getText", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "getGlowStyle", "Ljava/lang/Float;", "getFillPercentage", "Ljava/lang/Boolean;", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "ButtonType", "ButtonStyle", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressButtonModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final ButtonType buttonType;
    private final Float fillPercentage;
    private final GlowStyle glowStyle;
    private final String icon;
    private final EnumC39333f iconColor;
    private final GenericInteraction interaction;
    private final Boolean isEnabled;
    private final ButtonStyle style;
    private final TextResource text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "IN_PROGRESS", "ERROR", "RECOVERY", "ONBOARDING", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum ButtonStyle {
        SUCCESS,
        IN_PROGRESS,
        ERROR,
        RECOVERY,
        ONBOARDING;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(20));

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
                return (InterfaceC37138c) ButtonStyle.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC37138c serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.ProgressButtonModel.ButtonStyle", values());
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "FILLED", "PROGRESS", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public enum ButtonType {
        FILLED,
        PROGRESS;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(21));

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel$ButtonType$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/ProgressButtonModel$ButtonType;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
                return (InterfaceC37138c) ButtonType.$cachedSerializer$delegate.getValue();
            }

            public final InterfaceC37138c serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.ProgressButtonModel.ButtonType", values());
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/ProgressButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/ProgressButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C6909a(15)), AbstractC30060g.m92087G(enumC23463i, new C6909a(16)), null, AbstractC30060g.m92087G(enumC23463i, new C6909a(17)), null, AbstractC30060g.m92087G(enumC23463i, new C6909a(18)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C6909a(19)), null};
    }

    public /* synthetic */ ProgressButtonModel(int i13, ButtonType buttonType, ButtonStyle buttonStyle, String str, EnumC39333f enumC39333f, TextResource textResource, GlowStyle glowStyle, Float f13, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ProgressButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.buttonType = buttonType;
        this.style = buttonStyle;
        this.icon = str;
        this.iconColor = enumC39333f;
        this.text = textResource;
        if ((i13 & 32) == 0) {
            this.glowStyle = null;
        } else {
            this.glowStyle = glowStyle;
        }
        if ((i13 & 64) == 0) {
            this.fillPercentage = null;
        } else {
            this.fillPercentage = f13;
        }
        if ((i13 & 128) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
        if ((i13 & 256) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
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
        return ButtonType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return ButtonStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return GlowStyle.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgressButtonModel copy$default(ProgressButtonModel progressButtonModel, ButtonType buttonType, ButtonStyle buttonStyle, String str, EnumC39333f enumC39333f, TextResource textResource, GlowStyle glowStyle, Float f13, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            buttonType = progressButtonModel.buttonType;
        }
        if ((i13 & 2) != 0) {
            buttonStyle = progressButtonModel.style;
        }
        if ((i13 & 4) != 0) {
            str = progressButtonModel.icon;
        }
        if ((i13 & 8) != 0) {
            enumC39333f = progressButtonModel.iconColor;
        }
        if ((i13 & 16) != 0) {
            textResource = progressButtonModel.text;
        }
        if ((i13 & 32) != 0) {
            glowStyle = progressButtonModel.glowStyle;
        }
        if ((i13 & 64) != 0) {
            f13 = progressButtonModel.fillPercentage;
        }
        if ((i13 & 128) != 0) {
            bool = progressButtonModel.isEnabled;
        }
        if ((i13 & 256) != 0) {
            genericInteraction = progressButtonModel.interaction;
        }
        if ((i13 & 512) != 0) {
            map = progressButtonModel.bindings;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map2 = progressButtonModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        Boolean bool2 = bool;
        GenericInteraction genericInteraction2 = genericInteraction;
        GlowStyle glowStyle2 = glowStyle;
        Float f14 = f13;
        TextResource textResource2 = textResource;
        String str2 = str;
        return progressButtonModel.copy(buttonType, buttonStyle, str2, enumC39333f, textResource2, glowStyle2, f14, bool2, genericInteraction2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProgressButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.buttonType);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.iconColor);
        output.encodeSerializableElement(serialDesc, 4, C25452a.f99689a, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.glowStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.glowStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.fillPercentage != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, FloatSerializer.INSTANCE, self.fillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, GenericInteraction$$serializer.INSTANCE, self.interaction);
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
        return ProgressButtonModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    public final Map<String, String> component10() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component11() {
        return this.aggregateBindings;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ButtonStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GlowStyle getGlowStyle() {
        return this.glowStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Float getFillPercentage() {
        return this.fillPercentage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final ProgressButtonModel copy(ButtonType buttonType, ButtonStyle style, String icon, EnumC39333f iconColor, TextResource text, GlowStyle glowStyle, Float fillPercentage, Boolean isEnabled, GenericInteraction interaction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(buttonType, "buttonType");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(text, "text");
        return new ProgressButtonModel(buttonType, style, icon, iconColor, text, glowStyle, fillPercentage, isEnabled, interaction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressButtonModel)) {
            return false;
        }
        ProgressButtonModel progressButtonModel = (ProgressButtonModel) other;
        return this.buttonType == progressButtonModel.buttonType && this.style == progressButtonModel.style && AbstractC22676k.m65745e(this.icon, progressButtonModel.icon) && this.iconColor == progressButtonModel.iconColor && AbstractC22676k.m65745e(this.text, progressButtonModel.text) && this.glowStyle == progressButtonModel.glowStyle && AbstractC22676k.m65745e(this.fillPercentage, progressButtonModel.fillPercentage) && AbstractC22676k.m65745e(this.isEnabled, progressButtonModel.isEnabled) && AbstractC22676k.m65745e(this.interaction, progressButtonModel.interaction) && AbstractC22676k.m65745e(this.bindings, progressButtonModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, progressButtonModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    public final Float getFillPercentage() {
        return this.fillPercentage;
    }

    public final GlowStyle getGlowStyle() {
        return this.glowStyle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final EnumC39333f getIconColor() {
        return this.iconColor;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final ButtonStyle getStyle() {
        return this.style;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC21702c.m61132c(this.iconColor, AbstractC11266d.m30450d((this.style.hashCode() + (this.buttonType.hashCode() * 31)) * 31, 31, this.icon), 31), this.text, 31);
        GlowStyle glowStyle = this.glowStyle;
        int iHashCode = (iM95625a + (glowStyle == null ? 0 : glowStyle.hashCode())) * 31;
        Float f13 = this.fillPercentage;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        int iHashCode4 = (iHashCode3 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
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
        ButtonType buttonType = this.buttonType;
        ButtonStyle buttonStyle = this.style;
        String str = this.icon;
        EnumC39333f enumC39333f = this.iconColor;
        TextResource textResource = this.text;
        GlowStyle glowStyle = this.glowStyle;
        Float f13 = this.fillPercentage;
        Boolean bool = this.isEnabled;
        GenericInteraction genericInteraction = this.interaction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("ProgressButtonModel(buttonType=");
        sb4.append(buttonType);
        sb4.append(", style=");
        sb4.append(buttonStyle);
        sb4.append(", icon=");
        sb4.append(str);
        sb4.append(", iconColor=");
        sb4.append(enumC39333f);
        sb4.append(", text=");
        sb4.append(textResource);
        sb4.append(", glowStyle=");
        sb4.append(glowStyle);
        sb4.append(", fillPercentage=");
        sb4.append(f13);
        sb4.append(", isEnabled=");
        sb4.append(bool);
        sb4.append(", interaction=");
        sb4.append(genericInteraction);
        sb4.append(", bindings=");
        sb4.append(map);
        sb4.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    public ProgressButtonModel(ButtonType buttonType, ButtonStyle style, String icon, EnumC39333f iconColor, TextResource text, GlowStyle glowStyle, Float f13, Boolean bool, GenericInteraction genericInteraction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(buttonType, "buttonType");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(text, "text");
        this.buttonType = buttonType;
        this.style = style;
        this.icon = icon;
        this.iconColor = iconColor;
        this.text = text;
        this.glowStyle = glowStyle;
        this.fillPercentage = f13;
        this.isEnabled = bool;
        this.interaction = genericInteraction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ ProgressButtonModel(ButtonType buttonType, ButtonStyle buttonStyle, String str, EnumC39333f enumC39333f, TextResource textResource, GlowStyle glowStyle, Float f13, Boolean bool, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonType, buttonStyle, str, enumC39333f, textResource, (i13 & 32) != 0 ? null : glowStyle, (i13 & 64) != 0 ? null : f13, (i13 & 128) != 0 ? null : bool, (i13 & 256) != 0 ? null : genericInteraction, (i13 & 512) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map2);
    }
}
