package com.whoop.communitymoments.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ur0.AbstractC35182c;
import ur0.C35180a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0002QRB\u0096\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012+\b\u0002\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u008d\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J3\u0010+\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0003¢\u0006\u0004\b+\u0010*J¥\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2+\b\u0002\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bD\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bE\u0010 R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bF\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bG\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010(R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010*\"\u0004\bL\u0010MRE\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010J\u001a\u0004\bN\u0010*\"\u0004\bO\u0010M¨\u0006S"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "leading", "placeholder", "stateUpdateValueKey", "saveIcon", "saveContentDescription", "Lcom/whoop/navigation/models/GenericInteraction;", "submitInteraction", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DesignSystemModel;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "component8", "()Ljava/util/Map;", "component9", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/models/DesignSystemModel;", "getLeading", "getLeading$annotations", "()V", "getPlaceholder", "getStateUpdateValueKey", "getSaveIcon", "getSaveContentDescription", "Lcom/whoop/navigation/models/GenericInteraction;", "getSubmitInteraction", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MomentCaptionBarModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final DesignSystemModel leading;
    private final String placeholder;
    private final String saveContentDescription;
    private final String saveIcon;
    private final String stateUpdateValueKey;
    private final GenericInteraction submitInteraction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCaptionBarModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCaptionBarModel;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MomentCaptionBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C35180a(3)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35180a(4)), null};
    }

    public /* synthetic */ MomentCaptionBarModel(int i13, String str, DesignSystemModel designSystemModel, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (37 != (i13 & 37)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 37, MomentCaptionBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.leading = null;
        } else {
            this.leading = designSystemModel;
        }
        this.placeholder = str2;
        if ((i13 & 8) == 0) {
            this.stateUpdateValueKey = null;
        } else {
            this.stateUpdateValueKey = str3;
        }
        if ((i13 & 16) == 0) {
            this.saveIcon = "ARROW_FORWARD";
        } else {
            this.saveIcon = str4;
        }
        this.saveContentDescription = str5;
        if ((i13 & 64) == 0) {
            this.submitInteraction = null;
        } else {
            this.submitInteraction = genericInteraction;
        }
        if ((i13 & 128) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 256) == 0) {
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
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MomentCaptionBarModel copy$default(MomentCaptionBarModel momentCaptionBarModel, String str, DesignSystemModel designSystemModel, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = momentCaptionBarModel.id;
        }
        if ((i13 & 2) != 0) {
            designSystemModel = momentCaptionBarModel.leading;
        }
        if ((i13 & 4) != 0) {
            str2 = momentCaptionBarModel.placeholder;
        }
        if ((i13 & 8) != 0) {
            str3 = momentCaptionBarModel.stateUpdateValueKey;
        }
        if ((i13 & 16) != 0) {
            str4 = momentCaptionBarModel.saveIcon;
        }
        if ((i13 & 32) != 0) {
            str5 = momentCaptionBarModel.saveContentDescription;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = momentCaptionBarModel.submitInteraction;
        }
        if ((i13 & 128) != 0) {
            map = momentCaptionBarModel.bindings;
        }
        if ((i13 & 256) != 0) {
            map2 = momentCaptionBarModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        String str6 = str5;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str7 = str4;
        String str8 = str2;
        return momentCaptionBarModel.copy(str, designSystemModel, str8, str3, str7, str6, genericInteraction2, map3, map4);
    }

    public static /* synthetic */ void getLeading$annotations() {
    }

    public static final /* synthetic */ void write$Self$community_moments_release(MomentCaptionBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.leading != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.leading);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.placeholder);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.stateUpdateValueKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.stateUpdateValueKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.saveIcon, "ARROW_FORWARD")) {
            output.encodeStringElement(serialDesc, 4, self.saveIcon);
        }
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.saveContentDescription);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.submitInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.submitInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC35182c.m111346a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSaveIcon() {
        return this.saveIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSaveContentDescription() {
        return this.saveContentDescription;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getSubmitInteraction() {
        return this.submitInteraction;
    }

    public final Map<String, String> component8() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component9() {
        return this.aggregateBindings;
    }

    public final MomentCaptionBarModel copy(String id4, DesignSystemModel leading, String placeholder, String stateUpdateValueKey, String saveIcon, String saveContentDescription, GenericInteraction submitInteraction, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(saveIcon, "saveIcon");
        return new MomentCaptionBarModel(id4, leading, placeholder, stateUpdateValueKey, saveIcon, saveContentDescription, submitInteraction, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentCaptionBarModel)) {
            return false;
        }
        MomentCaptionBarModel momentCaptionBarModel = (MomentCaptionBarModel) other;
        return AbstractC22676k.m65745e(this.id, momentCaptionBarModel.id) && AbstractC22676k.m65745e(this.leading, momentCaptionBarModel.leading) && AbstractC22676k.m65745e(this.placeholder, momentCaptionBarModel.placeholder) && AbstractC22676k.m65745e(this.stateUpdateValueKey, momentCaptionBarModel.stateUpdateValueKey) && AbstractC22676k.m65745e(this.saveIcon, momentCaptionBarModel.saveIcon) && AbstractC22676k.m65745e(this.saveContentDescription, momentCaptionBarModel.saveContentDescription) && AbstractC22676k.m65745e(this.submitInteraction, momentCaptionBarModel.submitInteraction) && AbstractC22676k.m65745e(this.bindings, momentCaptionBarModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, momentCaptionBarModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final DesignSystemModel getLeading() {
        return this.leading;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getSaveContentDescription() {
        return this.saveContentDescription;
    }

    public final String getSaveIcon() {
        return this.saveIcon;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final GenericInteraction getSubmitInteraction() {
        return this.submitInteraction;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DesignSystemModel designSystemModel = this.leading;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        String str = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.stateUpdateValueKey;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.saveIcon);
        String str3 = this.saveContentDescription;
        int iHashCode4 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        GenericInteraction genericInteraction = this.submitInteraction;
        int iHashCode5 = (iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
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
        DesignSystemModel designSystemModel = this.leading;
        String str2 = this.placeholder;
        String str3 = this.stateUpdateValueKey;
        String str4 = this.saveIcon;
        String str5 = this.saveContentDescription;
        GenericInteraction genericInteraction = this.submitInteraction;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sb4 = new StringBuilder("MomentCaptionBarModel(id=");
        sb4.append(str);
        sb4.append(", leading=");
        sb4.append(designSystemModel);
        sb4.append(", placeholder=");
        AbstractC11266d.m30444B(sb4, str2, ", stateUpdateValueKey=", str3, ", saveIcon=");
        AbstractC11266d.m30444B(sb4, str4, ", saveContentDescription=", str5, ", submitInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", bindings=");
        sb4.append(map);
        sb4.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    public MomentCaptionBarModel(String id4, DesignSystemModel designSystemModel, String str, String str2, String saveIcon, String str3, GenericInteraction genericInteraction, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(saveIcon, "saveIcon");
        this.id = id4;
        this.leading = designSystemModel;
        this.placeholder = str;
        this.stateUpdateValueKey = str2;
        this.saveIcon = saveIcon;
        this.saveContentDescription = str3;
        this.submitInteraction = genericInteraction;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ MomentCaptionBarModel(String str, DesignSystemModel designSystemModel, String str2, String str3, String str4, String str5, GenericInteraction genericInteraction, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : designSystemModel, str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? "ARROW_FORWARD" : str4, str5, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : map, (i13 & 256) != 0 ? null : map2);
    }
}
