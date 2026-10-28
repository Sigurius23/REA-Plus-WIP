package com.whoop.design.models;

import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0002RQB_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u000f\u0010\u0018J#\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00190\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJr\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b7\u00108R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b?\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bB\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bE\u0010\u001eR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JRE\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`K¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\t0N8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010F\u001a\u0004\bO\u0010H\"\u0004\bP\u0010J¨\u0006S"}, m65681d2 = {"Lcom/whoop/design/models/MarkdownTextModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "text", "style", "color", "alignment", "icon", "", "maxLines", "minLines", "", "fillWidth", "iconPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)V", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/MarkdownTextModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "()Z", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/whoop/design/models/MarkdownTextModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/MarkdownTextModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getText", "getStyle", "getColor", "getAlignment", "getIcon", "Ljava/lang/Integer;", "getMaxLines", "getMinLines", "Z", "getFillWidth", "getIconPosition", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MarkdownTextModel implements WithGeneratedBindings, DesignSystemModel {
    private Map<String, AggregateBinding> aggregateBindings;
    private final String alignment;
    private Map<String, String> bindings;
    private final String color;
    private final boolean fillWidth;
    private final String icon;
    private final String iconPosition;
    private final Integer maxLines;
    private final Integer minLines;
    private final String style;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(14)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/MarkdownTextModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/MarkdownTextModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MarkdownTextModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MarkdownTextModel(int i13, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z4, String str6, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MarkdownTextModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.style = str2;
        this.color = str3;
        this.alignment = str4;
        this.icon = str5;
        if ((i13 & 32) == 0) {
            this.maxLines = null;
        } else {
            this.maxLines = num;
        }
        if ((i13 & 64) == 0) {
            this.minLines = null;
        } else {
            this.minLines = num2;
        }
        if ((i13 & 128) == 0) {
            this.fillWidth = true;
        } else {
            this.fillWidth = z4;
        }
        if ((i13 & 256) == 0) {
            this.iconPosition = null;
        } else {
            this.iconPosition = str6;
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

    public static /* synthetic */ MarkdownTextModel copy$default(MarkdownTextModel markdownTextModel, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z4, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = markdownTextModel.text;
        }
        if ((i13 & 2) != 0) {
            str2 = markdownTextModel.style;
        }
        if ((i13 & 4) != 0) {
            str3 = markdownTextModel.color;
        }
        if ((i13 & 8) != 0) {
            str4 = markdownTextModel.alignment;
        }
        if ((i13 & 16) != 0) {
            str5 = markdownTextModel.icon;
        }
        if ((i13 & 32) != 0) {
            num = markdownTextModel.maxLines;
        }
        if ((i13 & 64) != 0) {
            num2 = markdownTextModel.minLines;
        }
        if ((i13 & 128) != 0) {
            z4 = markdownTextModel.fillWidth;
        }
        if ((i13 & 256) != 0) {
            str6 = markdownTextModel.iconPosition;
        }
        boolean z13 = z4;
        String str7 = str6;
        Integer num3 = num;
        Integer num4 = num2;
        String str8 = str5;
        String str9 = str3;
        return markdownTextModel.copy(str, str2, str9, str4, str8, num3, num4, z13, str7);
    }

    public static final /* synthetic */ void write$Self$design_models_release(MarkdownTextModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.text);
        output.encodeStringElement(serialDesc, 1, self.style);
        output.encodeStringElement(serialDesc, 2, self.color);
        output.encodeStringElement(serialDesc, 3, self.alignment);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.maxLines != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, IntSerializer.INSTANCE, self.maxLines);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.minLines != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, IntSerializer.INSTANCE, self.minLines);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !self.fillWidth) {
            output.encodeBooleanElement(serialDesc, 7, self.fillWidth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.iconPosition != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.iconPosition);
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
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getMinLines() {
        return this.minLines;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getFillWidth() {
        return this.fillWidth;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIconPosition() {
        return this.iconPosition;
    }

    public final MarkdownTextModel copy(String text, String style, String color, String alignment, String icon, Integer maxLines, Integer minLines, boolean fillWidth, String iconPosition) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(alignment, "alignment");
        return new MarkdownTextModel(text, style, color, alignment, icon, maxLines, minLines, fillWidth, iconPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownTextModel)) {
            return false;
        }
        MarkdownTextModel markdownTextModel = (MarkdownTextModel) other;
        return AbstractC22676k.m65745e(this.text, markdownTextModel.text) && AbstractC22676k.m65745e(this.style, markdownTextModel.style) && AbstractC22676k.m65745e(this.color, markdownTextModel.color) && AbstractC22676k.m65745e(this.alignment, markdownTextModel.alignment) && AbstractC22676k.m65745e(this.icon, markdownTextModel.icon) && AbstractC22676k.m65745e(this.maxLines, markdownTextModel.maxLines) && AbstractC22676k.m65745e(this.minLines, markdownTextModel.minLines) && this.fillWidth == markdownTextModel.fillWidth && AbstractC22676k.m65745e(this.iconPosition, markdownTextModel.iconPosition);
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

    public final String getColor() {
        return this.color;
    }

    public final boolean getFillWidth() {
        return this.fillWidth;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconPosition() {
        return this.iconPosition;
    }

    public final Integer getMaxLines() {
        return this.maxLines;
    }

    public final Integer getMinLines() {
        return this.minLines;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.text.hashCode() * 31, 31, this.style), 31, this.color), 31, this.alignment);
        String str = this.icon;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxLines;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minLines;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.fillWidth);
        String str2 = this.iconPosition;
        return iM8289b + (str2 != null ? str2.hashCode() : 0);
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
        String str = this.text;
        String str2 = this.style;
        String str3 = this.color;
        String str4 = this.alignment;
        String str5 = this.icon;
        Integer num = this.maxLines;
        Integer num2 = this.minLines;
        boolean z4 = this.fillWidth;
        String str6 = this.iconPosition;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MarkdownTextModel(text=", str, ", style=", str2, ", color=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", alignment=", str4, ", icon=");
        AbstractC30007c.m91853w(num, str5, ", maxLines=", ", minLines=", sbM32001t);
        sbM32001t.append(num2);
        sbM32001t.append(", fillWidth=");
        sbM32001t.append(z4);
        sbM32001t.append(", iconPosition=");
        return AbstractC25012a.m73376i(str6, ")", sbM32001t);
    }

    public MarkdownTextModel(String text, String style, String color, String alignment, String str, Integer num, Integer num2, boolean z4, String str2) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(alignment, "alignment");
        this.text = text;
        this.style = style;
        this.color = color;
        this.alignment = alignment;
        this.icon = str;
        this.maxLines = num;
        this.minLines = num2;
        this.fillWidth = z4;
        this.iconPosition = str2;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public MarkdownTextModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return MarkdownTextModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ MarkdownTextModel(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, boolean z4, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : num2, (i13 & 128) != 0 ? true : z4, (i13 & 256) != 0 ? null : str6);
    }
}
