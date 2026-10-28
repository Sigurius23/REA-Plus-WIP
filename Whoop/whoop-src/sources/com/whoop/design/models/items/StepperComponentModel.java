package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/items/StepperComponentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "Lcom/whoop/design/models/items/StepperBarModel;", "progressBar", "Lgz0/m0;", "closeIcon", "", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/StepperBarModel;Lgz0/m0;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/StepperBarModel;Lgz0/m0;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/StepperComponentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Lcom/whoop/design/models/items/StepperBarModel;", "component3", "()Lgz0/m0;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/StepperBarModel;Lgz0/m0;Ljava/lang/String;)Lcom/whoop/design/models/items/StepperComponentModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "Lcom/whoop/design/models/items/StepperBarModel;", "getProgressBar", "Lgz0/m0;", "getCloseIcon", "Ljava/lang/String;", "getStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StepperComponentModel implements DesignSystemModel {
    private final EnumC16313m0 closeIcon;
    private final StepperBarModel progressBar;
    private final String style;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(2)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/StepperComponentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/StepperComponentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StepperComponentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StepperComponentModel(int i13, TextResource textResource, StepperBarModel stepperBarModel, EnumC16313m0 enumC16313m0, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StepperComponentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.progressBar = stepperBarModel;
        this.closeIcon = enumC16313m0;
        this.style = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ StepperComponentModel copy$default(StepperComponentModel stepperComponentModel, TextResource textResource, StepperBarModel stepperBarModel, EnumC16313m0 enumC16313m0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = stepperComponentModel.title;
        }
        if ((i13 & 2) != 0) {
            stepperBarModel = stepperComponentModel.progressBar;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = stepperComponentModel.closeIcon;
        }
        if ((i13 & 8) != 0) {
            str = stepperComponentModel.style;
        }
        return stepperComponentModel.copy(textResource, stepperBarModel, enumC16313m0, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(StepperComponentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StepperBarModel$$serializer.INSTANCE, self.progressBar);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.closeIcon);
        output.encodeStringElement(serialDesc, 3, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StepperBarModel getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC16313m0 getCloseIcon() {
        return this.closeIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final StepperComponentModel copy(TextResource title, StepperBarModel progressBar, EnumC16313m0 closeIcon, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        return new StepperComponentModel(title, progressBar, closeIcon, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepperComponentModel)) {
            return false;
        }
        StepperComponentModel stepperComponentModel = (StepperComponentModel) other;
        return AbstractC22676k.m65745e(this.title, stepperComponentModel.title) && AbstractC22676k.m65745e(this.progressBar, stepperComponentModel.progressBar) && this.closeIcon == stepperComponentModel.closeIcon && AbstractC22676k.m65745e(this.style, stepperComponentModel.style);
    }

    public final EnumC16313m0 getCloseIcon() {
        return this.closeIcon;
    }

    public final StepperBarModel getProgressBar() {
        return this.progressBar;
    }

    public final String getStyle() {
        return this.style;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        StepperBarModel stepperBarModel = this.progressBar;
        int iHashCode2 = (iHashCode + (stepperBarModel == null ? 0 : stepperBarModel.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.closeIcon;
        return this.style.hashCode() + ((iHashCode2 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "StepperComponentModel(title=" + this.title + ", progressBar=" + this.progressBar + ", closeIcon=" + this.closeIcon + ", style=" + this.style + ")";
    }

    public StepperComponentModel(TextResource title, StepperBarModel stepperBarModel, EnumC16313m0 enumC16313m0, String style) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        this.title = title;
        this.progressBar = stepperBarModel;
        this.closeIcon = enumC16313m0;
        this.style = style;
    }
}
