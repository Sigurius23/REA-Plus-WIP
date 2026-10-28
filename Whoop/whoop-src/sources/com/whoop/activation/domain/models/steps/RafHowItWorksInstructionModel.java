package com.whoop.activation.domain.models.steps;

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
import r70.C31050b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;", "", "Lcom/whoop/design/util/TextResource;", "text", "Lgz0/m0;", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Lgz0/m0;", "copy", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;)Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getText", "Lgz0/m0;", "getIcon", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RafHowItWorksInstructionModel {
    private final EnumC16313m0 icon;
    private final TextResource text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31050b(4))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/RafHowItWorksInstructionModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RafHowItWorksInstructionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RafHowItWorksInstructionModel(int i13, TextResource textResource, EnumC16313m0 enumC16313m0, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, RafHowItWorksInstructionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = textResource;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ RafHowItWorksInstructionModel copy$default(RafHowItWorksInstructionModel rafHowItWorksInstructionModel, TextResource textResource, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = rafHowItWorksInstructionModel.text;
        }
        if ((i13 & 2) != 0) {
            enumC16313m0 = rafHowItWorksInstructionModel.icon;
        }
        return rafHowItWorksInstructionModel.copy(textResource, enumC16313m0);
    }

    public static final /* synthetic */ void write$Self$activation_release(RafHowItWorksInstructionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.text);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final RafHowItWorksInstructionModel copy(TextResource text, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(icon, "icon");
        return new RafHowItWorksInstructionModel(text, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RafHowItWorksInstructionModel)) {
            return false;
        }
        RafHowItWorksInstructionModel rafHowItWorksInstructionModel = (RafHowItWorksInstructionModel) other;
        return AbstractC22676k.m65745e(this.text, rafHowItWorksInstructionModel.text) && this.icon == rafHowItWorksInstructionModel.icon;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        return this.icon.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "RafHowItWorksInstructionModel(text=" + this.text + ", icon=" + this.icon + ")";
    }

    public RafHowItWorksInstructionModel(TextResource text, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(icon, "icon");
        this.text = text;
        this.icon = icon;
    }
}
