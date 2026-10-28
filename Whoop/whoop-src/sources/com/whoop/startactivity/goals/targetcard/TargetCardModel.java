package com.whoop.startactivity.goals.targetcard;

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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l72.C23399f;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
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
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0003MNOBS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rB\u008f\u0001\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\f\u0010\u0017J#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\"J^\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b<\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b?\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b@\u0010\"R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ERE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010j\u0004\u0018\u0001`F¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\t0I8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010E¨\u0006P"}, m65681d2 = {"Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;", "header", "", "body", "footer", "Lcom/whoop/navigation/models/GenericInteraction;", "toggleOnInteraction", "toggleOffInteraction", "onAppearInteraction", "<init>", "(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;", "component1", "()Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "component5", "component6", "copy", "(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;", "getHeader", "Ljava/util/List;", "getBody", "getFooter", "Lcom/whoop/navigation/models/GenericInteraction;", "getToggleOnInteraction", "getToggleOffInteraction", "getOnAppearInteraction", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "TargetCardHeader", "$serializer", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TargetCardModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final List<DesignSystemModel> body;
    private final List<DesignSystemModel> footer;
    private final TargetCardHeader header;
    private final GenericInteraction onAppearInteraction;
    private final GenericInteraction toggleOffInteraction;
    private final GenericInteraction toggleOnInteraction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JF\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b\u0006\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;", "", "", "title", "", "showToggle", "isToggleOn", "endIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "endIconAction", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Z", "getShowToggle", "getEndIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "getEndIconAction", "Companion", "$serializer", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class TargetCardHeader {
        private final String endIcon;
        private final GenericInteraction endIconAction;
        private final boolean isToggleOn;
        private final boolean showToggle;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = GenericInteraction.$stable;

        /* JADX INFO: renamed from: com.whoop.startactivity.goals.targetcard.TargetCardModel$TargetCardHeader$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return TargetCardModel$TargetCardHeader$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ TargetCardHeader(int i13, String str, boolean z4, boolean z13, String str2, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, TargetCardModel$TargetCardHeader$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.showToggle = z4;
            this.isToggleOn = z13;
            if ((i13 & 8) == 0) {
                this.endIcon = null;
            } else {
                this.endIcon = str2;
            }
            if ((i13 & 16) == 0) {
                this.endIconAction = null;
            } else {
                this.endIconAction = genericInteraction;
            }
        }

        public static /* synthetic */ TargetCardHeader copy$default(TargetCardHeader targetCardHeader, String str, boolean z4, boolean z13, String str2, GenericInteraction genericInteraction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = targetCardHeader.title;
            }
            if ((i13 & 2) != 0) {
                z4 = targetCardHeader.showToggle;
            }
            if ((i13 & 4) != 0) {
                z13 = targetCardHeader.isToggleOn;
            }
            if ((i13 & 8) != 0) {
                str2 = targetCardHeader.endIcon;
            }
            if ((i13 & 16) != 0) {
                genericInteraction = targetCardHeader.endIconAction;
            }
            GenericInteraction genericInteraction2 = genericInteraction;
            boolean z14 = z13;
            return targetCardHeader.copy(str, z4, z14, str2, genericInteraction2);
        }

        public static final /* synthetic */ void write$Self$start_activity_release(TargetCardHeader self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeBooleanElement(serialDesc, 1, self.showToggle);
            output.encodeBooleanElement(serialDesc, 2, self.isToggleOn);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.endIcon != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.endIcon);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.endIconAction == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.endIconAction);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getShowToggle() {
            return this.showToggle;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsToggleOn() {
            return this.isToggleOn;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEndIcon() {
            return this.endIcon;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final GenericInteraction getEndIconAction() {
            return this.endIconAction;
        }

        public final TargetCardHeader copy(String title, boolean showToggle, boolean isToggleOn, String endIcon, GenericInteraction endIconAction) {
            AbstractC22676k.m65750j(title, "title");
            return new TargetCardHeader(title, showToggle, isToggleOn, endIcon, endIconAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetCardHeader)) {
                return false;
            }
            TargetCardHeader targetCardHeader = (TargetCardHeader) other;
            return AbstractC22676k.m65745e(this.title, targetCardHeader.title) && this.showToggle == targetCardHeader.showToggle && this.isToggleOn == targetCardHeader.isToggleOn && AbstractC22676k.m65745e(this.endIcon, targetCardHeader.endIcon) && AbstractC22676k.m65745e(this.endIconAction, targetCardHeader.endIconAction);
        }

        public final String getEndIcon() {
            return this.endIcon;
        }

        public final GenericInteraction getEndIconAction() {
            return this.endIconAction;
        }

        public final boolean getShowToggle() {
            return this.showToggle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.title.hashCode() * 31, 31, this.showToggle), 31, this.isToggleOn);
            String str = this.endIcon;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            GenericInteraction genericInteraction = this.endIconAction;
            return iHashCode + (genericInteraction != null ? genericInteraction.hashCode() : 0);
        }

        public final boolean isToggleOn() {
            return this.isToggleOn;
        }

        public String toString() {
            String str = this.title;
            boolean z4 = this.showToggle;
            boolean z13 = this.isToggleOn;
            String str2 = this.endIcon;
            GenericInteraction genericInteraction = this.endIconAction;
            StringBuilder sbM73379l = AbstractC25012a.m73379l("TargetCardHeader(title=", str, ", showToggle=", ", isToggleOn=", z4);
            AbstractC38963t7.m124391u(sbM73379l, z13, ", endIcon=", str2, ", endIconAction=");
            return AbstractC26725a.m79506j(sbM73379l, genericInteraction, ")");
        }

        public TargetCardHeader(String title, boolean z4, boolean z13, String str, GenericInteraction genericInteraction) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.showToggle = z4;
            this.isToggleOn = z13;
            this.endIcon = str;
            this.endIconAction = genericInteraction;
        }

        public /* synthetic */ TargetCardHeader(String str, boolean z4, boolean z13, String str2, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z4, z13, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : genericInteraction);
        }
    }

    /* JADX INFO: renamed from: com.whoop.startactivity.goals.targetcard.TargetCardModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TargetCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C23399f(22)), AbstractC30060g.m92087G(enumC23463i, new C23399f(23)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C23399f(24)), null};
    }

    public /* synthetic */ TargetCardModel(int i13, TargetCardHeader targetCardHeader, List list, List list2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, TargetCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = targetCardHeader;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.body = c25271y;
        } else {
            this.body = list;
        }
        if ((i13 & 4) == 0) {
            this.footer = c25271y;
        } else {
            this.footer = list2;
        }
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
        if ((i13 & 32) == 0) {
            this.onAppearInteraction = null;
        } else {
            this.onAppearInteraction = genericInteraction3;
        }
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 128) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetCardModel copy$default(TargetCardModel targetCardModel, TargetCardHeader targetCardHeader, List list, List list2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            targetCardHeader = targetCardModel.header;
        }
        if ((i13 & 2) != 0) {
            list = targetCardModel.body;
        }
        if ((i13 & 4) != 0) {
            list2 = targetCardModel.footer;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = targetCardModel.toggleOnInteraction;
        }
        if ((i13 & 16) != 0) {
            genericInteraction2 = targetCardModel.toggleOffInteraction;
        }
        if ((i13 & 32) != 0) {
            genericInteraction3 = targetCardModel.onAppearInteraction;
        }
        GenericInteraction genericInteraction4 = genericInteraction2;
        GenericInteraction genericInteraction5 = genericInteraction3;
        return targetCardModel.copy(targetCardHeader, list, list2, genericInteraction, genericInteraction4, genericInteraction5);
    }

    public static final /* synthetic */ void write$Self$start_activity_release(TargetCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, TargetCardModel$TargetCardHeader$$serializer.INSTANCE, self.header);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.body, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.footer, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.footer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.toggleOnInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.toggleOnInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.toggleOffInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.toggleOffInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.onAppearInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, GenericInteraction$$serializer.INSTANCE, self.onAppearInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TargetCardHeader getHeader() {
        return this.header;
    }

    public final List<DesignSystemModel> component2() {
        return this.body;
    }

    public final List<DesignSystemModel> component3() {
        return this.footer;
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
    public final GenericInteraction getOnAppearInteraction() {
        return this.onAppearInteraction;
    }

    public final TargetCardModel copy(TargetCardHeader header, List<? extends DesignSystemModel> body, List<? extends DesignSystemModel> footer, GenericInteraction toggleOnInteraction, GenericInteraction toggleOffInteraction, GenericInteraction onAppearInteraction) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(footer, "footer");
        return new TargetCardModel(header, body, footer, toggleOnInteraction, toggleOffInteraction, onAppearInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetCardModel)) {
            return false;
        }
        TargetCardModel targetCardModel = (TargetCardModel) other;
        return AbstractC22676k.m65745e(this.header, targetCardModel.header) && AbstractC22676k.m65745e(this.body, targetCardModel.body) && AbstractC22676k.m65745e(this.footer, targetCardModel.footer) && AbstractC22676k.m65745e(this.toggleOnInteraction, targetCardModel.toggleOnInteraction) && AbstractC22676k.m65745e(this.toggleOffInteraction, targetCardModel.toggleOffInteraction) && AbstractC22676k.m65745e(this.onAppearInteraction, targetCardModel.onAppearInteraction);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<DesignSystemModel> getBody() {
        return this.body;
    }

    public final List<DesignSystemModel> getFooter() {
        return this.footer;
    }

    public final TargetCardHeader getHeader() {
        return this.header;
    }

    public final GenericInteraction getOnAppearInteraction() {
        return this.onAppearInteraction;
    }

    public final GenericInteraction getToggleOffInteraction() {
        return this.toggleOffInteraction;
    }

    public final GenericInteraction getToggleOnInteraction() {
        return this.toggleOnInteraction;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.body), 31, this.footer);
        GenericInteraction genericInteraction = this.toggleOnInteraction;
        int iHashCode = (iM31983b + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        GenericInteraction genericInteraction2 = this.toggleOffInteraction;
        int iHashCode2 = (iHashCode + (genericInteraction2 == null ? 0 : genericInteraction2.hashCode())) * 31;
        GenericInteraction genericInteraction3 = this.onAppearInteraction;
        return iHashCode2 + (genericInteraction3 != null ? genericInteraction3.hashCode() : 0);
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
        return "TargetCardModel(header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ", toggleOnInteraction=" + this.toggleOnInteraction + ", toggleOffInteraction=" + this.toggleOffInteraction + ", onAppearInteraction=" + this.onAppearInteraction + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TargetCardModel(TargetCardHeader header, List<? extends DesignSystemModel> body, List<? extends DesignSystemModel> footer, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(footer, "footer");
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.toggleOnInteraction = genericInteraction;
        this.toggleOffInteraction = genericInteraction2;
        this.onAppearInteraction = genericInteraction3;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public TargetCardModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC10242b.m26056a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TargetCardModel(TargetCardHeader targetCardHeader, List list, List list2, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, GenericInteraction genericInteraction3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(targetCardHeader, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? null : genericInteraction, (i13 & 16) != 0 ? null : genericInteraction2, (i13 & 32) != 0 ? null : genericInteraction3);
    }
}
