package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0002WVB°\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u009f\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u0010H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010*J\u0012\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J3\u00102\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0003¢\u0006\u0004\b2\u00101J»\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102+\b\u0002\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u0016HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b5\u0010$J\u0010\u00106\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\u000e2\b\u00108\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bF\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bG\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bI\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010*R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bL\u0010*R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bM\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bN\u0010$R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\b\u000f\u0010/R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u00101\"\u0004\bR\u0010SRE\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\t0\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010P\u001a\u0004\bT\u00101\"\u0004\bU\u0010S¨\u0006X"}, m65681d2 = {"Lcom/whoop/design/models/items/SectionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "subtitle", "", "items", "", "sectionTopPadding", "sectionBottomPadding", "interItemPadding", "alignment", "", "isVisible", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLjava/lang/String;ZLjava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLjava/lang/String;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/SectionModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()F", "component6", "component7", "component8", "component9", "()Z", "component10", "()Ljava/util/Map;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLjava/lang/String;ZLjava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SectionModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "F", "getSectionTopPadding", "getSectionBottomPadding", "getInterItemPadding", "getAlignment", "Z", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SectionModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private final String alignment;
    private Map<String, String> bindings;
    private final String id;
    private final float interItemPadding;
    private final boolean isVisible;
    private final List<DesignSystemModel> items;
    private final float sectionBottomPadding;
    private final float sectionTopPadding;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(25)), null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(26)), null};
    }

    public /* synthetic */ SectionModel(int i13, String str, String str2, String str3, List list, float f13, float f14, float f15, String str4, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 16) == 0) {
            this.sectionTopPadding = 0.0f;
        } else {
            this.sectionTopPadding = f13;
        }
        if ((i13 & 32) == 0) {
            this.sectionBottomPadding = 0.0f;
        } else {
            this.sectionBottomPadding = f14;
        }
        if ((i13 & 64) == 0) {
            this.interItemPadding = 8.0f;
        } else {
            this.interItemPadding = f15;
        }
        if ((i13 & 128) == 0) {
            this.alignment = null;
        } else {
            this.alignment = str4;
        }
        if ((i13 & 256) == 0) {
            this.isVisible = true;
        } else {
            this.isVisible = z4;
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
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionModel copy$default(SectionModel sectionModel, String str, String str2, String str3, List list, float f13, float f14, float f15, String str4, boolean z4, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sectionModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = sectionModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = sectionModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = sectionModel.items;
        }
        if ((i13 & 16) != 0) {
            f13 = sectionModel.sectionTopPadding;
        }
        if ((i13 & 32) != 0) {
            f14 = sectionModel.sectionBottomPadding;
        }
        if ((i13 & 64) != 0) {
            f15 = sectionModel.interItemPadding;
        }
        if ((i13 & 128) != 0) {
            str4 = sectionModel.alignment;
        }
        if ((i13 & 256) != 0) {
            z4 = sectionModel.isVisible;
        }
        if ((i13 & 512) != 0) {
            map = sectionModel.bindings;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            map2 = sectionModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        String str5 = str4;
        boolean z13 = z4;
        float f16 = f14;
        float f17 = f15;
        float f18 = f13;
        String str6 = str3;
        return sectionModel.copy(str, str2, str6, list, f18, f16, f17, str5, z13, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || Float.compare(self.sectionTopPadding, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 4, self.sectionTopPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || Float.compare(self.sectionBottomPadding, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 5, self.sectionBottomPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || Float.compare(self.interItemPadding, 8.0f) != 0) {
            output.encodeFloatElement(serialDesc, 6, self.interItemPadding);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.alignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !self.isVisible) {
            output.encodeBooleanElement(serialDesc, 8, self.isVisible);
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getSectionTopPadding() {
        return this.sectionTopPadding;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getSectionBottomPadding() {
        return this.sectionBottomPadding;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getInterItemPadding() {
        return this.interItemPadding;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final SectionModel copy(String id4, String title, String subtitle, List<? extends DesignSystemModel> items, float sectionTopPadding, float sectionBottomPadding, float interItemPadding, String alignment, boolean isVisible, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new SectionModel(id4, title, subtitle, items, sectionTopPadding, sectionBottomPadding, interItemPadding, alignment, isVisible, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionModel)) {
            return false;
        }
        SectionModel sectionModel = (SectionModel) other;
        return AbstractC22676k.m65745e(this.id, sectionModel.id) && AbstractC22676k.m65745e(this.title, sectionModel.title) && AbstractC22676k.m65745e(this.subtitle, sectionModel.subtitle) && AbstractC22676k.m65745e(this.items, sectionModel.items) && Float.compare(this.sectionTopPadding, sectionModel.sectionTopPadding) == 0 && Float.compare(this.sectionBottomPadding, sectionModel.sectionBottomPadding) == 0 && Float.compare(this.interItemPadding, sectionModel.interItemPadding) == 0 && AbstractC22676k.m65745e(this.alignment, sectionModel.alignment) && this.isVisible == sectionModel.isVisible && AbstractC22676k.m65745e(this.bindings, sectionModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, sectionModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final String getAlignment() {
        return this.alignment;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final float getInterItemPadding() {
        return this.interItemPadding;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final float getSectionBottomPadding() {
        return this.sectionBottomPadding;
    }

    public final float getSectionTopPadding() {
        return this.sectionTopPadding;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iM30447a = AbstractC11266d.m30447a(this.interItemPadding, AbstractC11266d.m30447a(this.sectionBottomPadding, AbstractC11266d.m30447a(this.sectionTopPadding, AbstractC11895b.m31983b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items), 31), 31), 31);
        String str3 = this.alignment;
        int iM8289b = AbstractC2875y.m8289b((iM30447a + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isVisible);
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iM8289b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isVisible() {
        return this.isVisible;
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
        List<DesignSystemModel> list = this.items;
        float f13 = this.sectionTopPadding;
        float f14 = this.sectionBottomPadding;
        float f15 = this.interItemPadding;
        String str4 = this.alignment;
        boolean z4 = this.isVisible;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SectionModel(id=", str, ", title=", str2, ", subtitle=");
        AbstractC36095b.m114694v(str3, ", items=", ", sectionTopPadding=", sbM32001t, list);
        AbstractC30802r.m94772u(sbM32001t, f13, ", sectionBottomPadding=", f14, ", interItemPadding=");
        sbM32001t.append(f15);
        sbM32001t.append(", alignment=");
        sbM32001t.append(str4);
        sbM32001t.append(", isVisible=");
        sbM32001t.append(z4);
        sbM32001t.append(", bindings=");
        sbM32001t.append(map);
        sbM32001t.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public SectionModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return SectionModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionModel(String id4, String str, String str2, List<? extends DesignSystemModel> items, float f13, float f14, float f15, String str3, boolean z4, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.title = str;
        this.subtitle = str2;
        this.items = items;
        this.sectionTopPadding = f13;
        this.sectionBottomPadding = f14;
        this.interItemPadding = f15;
        this.alignment = str3;
        this.isVisible = z4;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ SectionModel(String str, String str2, String str3, List list, float f13, float f14, float f15, String str4, boolean z4, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? 0.0f : f13, (i13 & 32) != 0 ? 0.0f : f14, (i13 & 64) != 0 ? 8.0f : f15, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? true : z4, (i13 & 512) != 0 ? null : map, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : map2);
    }
}
