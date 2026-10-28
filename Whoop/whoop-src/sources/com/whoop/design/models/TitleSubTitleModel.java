package com.whoop.design.models;

import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 S2\u00020\u00012\u00020\u0002:\u0002TSBi\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010B¡\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000f\u0010\u0019J#\u0010\u001c\u001a\u00020\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJx\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b@\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bA\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bB\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bD\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bG\u0010\u001fR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LRE\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\t0P8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010H\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010L¨\u0006U"}, m65681d2 = {"Lcom/whoop/design/models/TitleSubTitleModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "titleColor", "subtitleColor", "titleStyle", "subtitleStyle", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "trailingButton", "alignment", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component9", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;)Lcom/whoop/design/models/TitleSubTitleModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/TitleSubTitleModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getTitleColor", "getSubtitleColor", "getTitleStyle", "getSubtitleStyle", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getTrailingButton", "getAlignment", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TitleSubTitleModel implements DesignSystemModel, WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private final String alignment;
    private Map<String, String> bindings;
    private final String id;
    private final TextResource subtitle;
    private final String subtitleColor;
    private final String subtitleStyle;
    private final TextResource title;
    private final String titleColor;
    private final String titleStyle;
    private final SecondaryButtonModel trailingButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(25)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/TitleSubTitleModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/TitleSubTitleModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TitleSubTitleModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TitleSubTitleModel(int i13, String str, TextResource textResource, TextResource textResource2, String str2, String str3, String str4, String str5, SecondaryButtonModel secondaryButtonModel, String str6, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TitleSubTitleModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = textResource;
        this.subtitle = textResource2;
        if ((i13 & 8) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = str2;
        }
        if ((i13 & 16) == 0) {
            this.subtitleColor = null;
        } else {
            this.subtitleColor = str3;
        }
        if ((i13 & 32) == 0) {
            this.titleStyle = null;
        } else {
            this.titleStyle = str4;
        }
        if ((i13 & 64) == 0) {
            this.subtitleStyle = null;
        } else {
            this.subtitleStyle = str5;
        }
        if ((i13 & 128) == 0) {
            this.trailingButton = null;
        } else {
            this.trailingButton = secondaryButtonModel;
        }
        if ((i13 & 256) == 0) {
            this.alignment = null;
        } else {
            this.alignment = str6;
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
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ TitleSubTitleModel copy$default(TitleSubTitleModel titleSubTitleModel, String str, TextResource textResource, TextResource textResource2, String str2, String str3, String str4, String str5, SecondaryButtonModel secondaryButtonModel, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = titleSubTitleModel.id;
        }
        if ((i13 & 2) != 0) {
            textResource = titleSubTitleModel.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = titleSubTitleModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str2 = titleSubTitleModel.titleColor;
        }
        if ((i13 & 16) != 0) {
            str3 = titleSubTitleModel.subtitleColor;
        }
        if ((i13 & 32) != 0) {
            str4 = titleSubTitleModel.titleStyle;
        }
        if ((i13 & 64) != 0) {
            str5 = titleSubTitleModel.subtitleStyle;
        }
        if ((i13 & 128) != 0) {
            secondaryButtonModel = titleSubTitleModel.trailingButton;
        }
        if ((i13 & 256) != 0) {
            str6 = titleSubTitleModel.alignment;
        }
        SecondaryButtonModel secondaryButtonModel2 = secondaryButtonModel;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        TextResource textResource3 = textResource2;
        return titleSubTitleModel.copy(str, textResource, textResource3, str2, str10, str8, str9, secondaryButtonModel2, str7);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TitleSubTitleModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.subtitle);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.titleColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.titleColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.subtitleColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.subtitleColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.titleStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.titleStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.subtitleStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.subtitleStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.trailingButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SecondaryButtonModel$$serializer.INSTANCE, self.trailingButton);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.alignment != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.alignment);
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
        return TitleSubTitleModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SecondaryButtonModel getTrailingButton() {
        return this.trailingButton;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    public final TitleSubTitleModel copy(String id4, TextResource title, TextResource subtitle, String titleColor, String subtitleColor, String titleStyle, String subtitleStyle, SecondaryButtonModel trailingButton, String alignment) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new TitleSubTitleModel(id4, title, subtitle, titleColor, subtitleColor, titleStyle, subtitleStyle, trailingButton, alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleSubTitleModel)) {
            return false;
        }
        TitleSubTitleModel titleSubTitleModel = (TitleSubTitleModel) other;
        return AbstractC22676k.m65745e(this.id, titleSubTitleModel.id) && AbstractC22676k.m65745e(this.title, titleSubTitleModel.title) && AbstractC22676k.m65745e(this.subtitle, titleSubTitleModel.subtitle) && AbstractC22676k.m65745e(this.titleColor, titleSubTitleModel.titleColor) && AbstractC22676k.m65745e(this.subtitleColor, titleSubTitleModel.subtitleColor) && AbstractC22676k.m65745e(this.titleStyle, titleSubTitleModel.titleStyle) && AbstractC22676k.m65745e(this.subtitleStyle, titleSubTitleModel.subtitleStyle) && AbstractC22676k.m65745e(this.trailingButton, titleSubTitleModel.trailingButton) && AbstractC22676k.m65745e(this.alignment, titleSubTitleModel.alignment);
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

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    public final String getSubtitleStyle() {
        return this.subtitleStyle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final String getTitleColor() {
        return this.titleColor;
    }

    public final String getTitleStyle() {
        return this.titleStyle;
    }

    public final SecondaryButtonModel getTrailingButton() {
        return this.trailingButton;
    }

    public int hashCode() {
        String str = this.id;
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31), this.subtitle, 31);
        String str2 = this.titleColor;
        int iHashCode = (iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleColor;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleStyle;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subtitleStyle;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SecondaryButtonModel secondaryButtonModel = this.trailingButton;
        int iHashCode5 = (iHashCode4 + (secondaryButtonModel == null ? 0 : secondaryButtonModel.hashCode())) * 31;
        String str6 = this.alignment;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
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
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str2 = this.titleColor;
        String str3 = this.subtitleColor;
        String str4 = this.titleStyle;
        String str5 = this.subtitleStyle;
        SecondaryButtonModel secondaryButtonModel = this.trailingButton;
        String str6 = this.alignment;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("TitleSubTitleModel(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC30007c.m91856z(sbM91847q, textResource2, ", titleColor=", str2, ", subtitleColor=");
        AbstractC11266d.m30444B(sbM91847q, str3, ", titleStyle=", str4, ", subtitleStyle=");
        sbM91847q.append(str5);
        sbM91847q.append(", trailingButton=");
        sbM91847q.append(secondaryButtonModel);
        sbM91847q.append(", alignment=");
        return AbstractC25012a.m73376i(str6, ")", sbM91847q);
    }

    public TitleSubTitleModel(String str, TextResource title, TextResource subtitle, String str2, String str3, String str4, String str5, SecondaryButtonModel secondaryButtonModel, String str6) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = str;
        this.title = title;
        this.subtitle = subtitle;
        this.titleColor = str2;
        this.subtitleColor = str3;
        this.titleStyle = str4;
        this.subtitleStyle = str5;
        this.trailingButton = secondaryButtonModel;
        this.alignment = str6;
    }

    public /* synthetic */ TitleSubTitleModel(String str, TextResource textResource, TextResource textResource2, String str2, String str3, String str4, String str5, SecondaryButtonModel secondaryButtonModel, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : secondaryButtonModel, (i13 & 256) != 0 ? null : str6);
    }
}
