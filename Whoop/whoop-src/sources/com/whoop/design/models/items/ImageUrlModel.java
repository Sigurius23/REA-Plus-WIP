package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.Map;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36959f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKBM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u008b\u0001\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\r\u0010\u0016J#\u0010\u0019\u001a\u00020\u00002\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b;\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b<\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b=\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010$R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRE\u0010\u0013\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010j\u0004\u0018\u0001`E¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\t0H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010D¨\u0006M"}, m65681d2 = {"Lcom/whoop/design/models/items/ImageUrlModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "imageUrl", "alignment", "", "width", "height", "captionDisplay", "shape", "", "inline", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/items/ImageUrlModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/design/models/items/ImageUrlModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ImageUrlModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getImageUrl", "getAlignment", "Ljava/lang/Integer;", "getWidth", "getHeight", "getCaptionDisplay", "getShape", "Z", "getInline", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImageUrlModel implements WithGeneratedBindings, DesignSystemModel {
    private Map<String, AggregateBinding> aggregateBindings;
    private final String alignment;
    private Map<String, String> bindings;
    private final String captionDisplay;
    private final Integer height;
    private final String imageUrl;
    private final boolean inline;
    private final String shape;
    private final Integer width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36959f(8)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ImageUrlModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ImageUrlModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImageUrlModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageUrlModel(int i13, String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ImageUrlModel$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.alignment = str2;
        this.width = num;
        this.height = num2;
        this.captionDisplay = str3;
        if ((i13 & 32) == 0) {
            this.shape = null;
        } else {
            this.shape = str4;
        }
        if ((i13 & 64) == 0) {
            this.inline = false;
        } else {
            this.inline = z4;
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
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ ImageUrlModel copy$default(ImageUrlModel imageUrlModel, String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = imageUrlModel.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = imageUrlModel.alignment;
        }
        if ((i13 & 4) != 0) {
            num = imageUrlModel.width;
        }
        if ((i13 & 8) != 0) {
            num2 = imageUrlModel.height;
        }
        if ((i13 & 16) != 0) {
            str3 = imageUrlModel.captionDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = imageUrlModel.shape;
        }
        if ((i13 & 64) != 0) {
            z4 = imageUrlModel.inline;
        }
        String str5 = str4;
        boolean z13 = z4;
        String str6 = str3;
        Integer num3 = num;
        return imageUrlModel.copy(str, str2, num3, num2, str6, str5, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImageUrlModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.imageUrl);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.alignment);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, intSerializer, self.width);
        output.encodeNullableSerializableElement(serialDesc, 3, intSerializer, self.height);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.captionDisplay);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.shape != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.shape);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.inline) {
            output.encodeBooleanElement(serialDesc, 6, self.inline);
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
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCaptionDisplay() {
        return this.captionDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getInline() {
        return this.inline;
    }

    public final ImageUrlModel copy(String imageUrl, String alignment, Integer width, Integer height, String captionDisplay, String shape, boolean inline) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new ImageUrlModel(imageUrl, alignment, width, height, captionDisplay, shape, inline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageUrlModel)) {
            return false;
        }
        ImageUrlModel imageUrlModel = (ImageUrlModel) other;
        return AbstractC22676k.m65745e(this.imageUrl, imageUrlModel.imageUrl) && AbstractC22676k.m65745e(this.alignment, imageUrlModel.alignment) && AbstractC22676k.m65745e(this.width, imageUrlModel.width) && AbstractC22676k.m65745e(this.height, imageUrlModel.height) && AbstractC22676k.m65745e(this.captionDisplay, imageUrlModel.captionDisplay) && AbstractC22676k.m65745e(this.shape, imageUrlModel.shape) && this.inline == imageUrlModel.inline;
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

    public final String getCaptionDisplay() {
        return this.captionDisplay;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getInline() {
        return this.inline;
    }

    public final String getShape() {
        return this.shape;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.imageUrl.hashCode() * 31;
        String str = this.alignment;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.width;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.captionDisplay;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shape;
        return Boolean.hashCode(this.inline) + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
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
        String str = this.imageUrl;
        String str2 = this.alignment;
        Integer num = this.width;
        Integer num2 = this.height;
        String str3 = this.captionDisplay;
        String str4 = this.shape;
        boolean z4 = this.inline;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ImageUrlModel(imageUrl=", str, ", alignment=", str2, ", width=");
        AbstractC31061c.m95621A(sbM32001t, num, ", height=", num2, ", captionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", shape=", str4, ", inline=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public ImageUrlModel(String imageUrl, String str, Integer num, Integer num2, String str2, String str3, boolean z4) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.alignment = str;
        this.width = num;
        this.height = num2;
        this.captionDisplay = str2;
        this.shape = str3;
        this.inline = z4;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public ImageUrlModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return ImageUrlModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ ImageUrlModel(String str, String str2, Integer num, Integer num2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, num2, str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? false : z4);
    }
}
