package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JJ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010#¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/MiniCalloutModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "description", "cta", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/InfoCalloutStyle;", "style", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/InfoCalloutStyle;Lcom/whoop/design/models/modal/AnyModal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/InfoCalloutStyle;Lcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/MiniCalloutModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/design/models/items/InfoCalloutStyle;", "component5", "()Lcom/whoop/design/models/modal/AnyModal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/InfoCalloutStyle;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/items/MiniCalloutModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getCta", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/design/models/items/InfoCalloutStyle;", "getStyle", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "getModal$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MiniCalloutModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String cta;
    private final String description;
    private final C9598e destination;
    private final AnyModal modal;
    private final InfoCalloutStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/MiniCalloutModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/MiniCalloutModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MiniCalloutModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36960g(20)), AbstractC30060g.m92087G(enumC23463i, new C36960g(21)), AbstractC30060g.m92087G(enumC23463i, new C36960g(22))};
    }

    public /* synthetic */ MiniCalloutModel(int i13, String str, String str2, C9598e c9598e, InfoCalloutStyle infoCalloutStyle, AnyModal anyModal, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, MiniCalloutModel$$serializer.INSTANCE.getDescriptor());
        }
        this.description = str;
        this.cta = str2;
        this.destination = c9598e;
        this.style = infoCalloutStyle;
        this.modal = anyModal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.InfoCalloutStyle", InfoCalloutStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnyModal.class), AbstractC38195a.m122336d(AnyModal.INSTANCE.serializer()), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ MiniCalloutModel copy$default(MiniCalloutModel miniCalloutModel, String str, String str2, C9598e c9598e, InfoCalloutStyle infoCalloutStyle, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = miniCalloutModel.description;
        }
        if ((i13 & 2) != 0) {
            str2 = miniCalloutModel.cta;
        }
        if ((i13 & 4) != 0) {
            c9598e = miniCalloutModel.destination;
        }
        if ((i13 & 8) != 0) {
            infoCalloutStyle = miniCalloutModel.style;
        }
        if ((i13 & 16) != 0) {
            anyModal = miniCalloutModel.modal;
        }
        AnyModal anyModal2 = anyModal;
        C9598e c9598e2 = c9598e;
        return miniCalloutModel.copy(str, str2, c9598e2, infoCalloutStyle, anyModal2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static /* synthetic */ void getModal$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(MiniCalloutModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.description);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.modal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InfoCalloutStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public final MiniCalloutModel copy(String description, String cta, C9598e destination, InfoCalloutStyle style, AnyModal modal) {
        AbstractC22676k.m65750j(description, "description");
        return new MiniCalloutModel(description, cta, destination, style, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniCalloutModel)) {
            return false;
        }
        MiniCalloutModel miniCalloutModel = (MiniCalloutModel) other;
        return AbstractC22676k.m65745e(this.description, miniCalloutModel.description) && AbstractC22676k.m65745e(this.cta, miniCalloutModel.cta) && AbstractC22676k.m65745e(this.destination, miniCalloutModel.destination) && this.style == miniCalloutModel.style && AbstractC22676k.m65745e(this.modal, miniCalloutModel.modal);
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final InfoCalloutStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.description.hashCode() * 31;
        String str = this.cta;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        InfoCalloutStyle infoCalloutStyle = this.style;
        int iHashCode4 = (iHashCode3 + (infoCalloutStyle == null ? 0 : infoCalloutStyle.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return iHashCode4 + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.cta;
        C9598e c9598e = this.destination;
        InfoCalloutStyle infoCalloutStyle = this.style;
        AnyModal anyModal = this.modal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MiniCalloutModel(description=", str, ", cta=", str2, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", style=");
        sbM32001t.append(infoCalloutStyle);
        sbM32001t.append(", modal=");
        sbM32001t.append(anyModal);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MiniCalloutModel(String description, String str, C9598e c9598e, InfoCalloutStyle infoCalloutStyle, AnyModal anyModal) {
        AbstractC22676k.m65750j(description, "description");
        this.description = description;
        this.cta = str;
        this.destination = c9598e;
        this.style = infoCalloutStyle;
        this.modal = anyModal;
    }
}
