package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001d¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "icon", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/whoopaction/domain/models/Action;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/whoopaction/domain/models/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/modal/AnyModal;", "component3", "()Lcom/whoop/whoopaction/domain/models/Action;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/whoopaction/domain/models/Action;)Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "getAction$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentCardIconButtonModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final String icon;
    private final AnyModal modal;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AppointmentCardIconButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AppointmentCardIconButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentCardIconButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36870a(22)), AbstractC30060g.m92087G(enumC23463i, new C36870a(23))};
    }

    public /* synthetic */ AppointmentCardIconButtonModel(int i13, String str, AnyModal anyModal, Action action, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AppointmentCardIconButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        if ((i13 & 2) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
        if ((i13 & 4) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AnyModal.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ AppointmentCardIconButtonModel copy$default(AppointmentCardIconButtonModel appointmentCardIconButtonModel, String str, AnyModal anyModal, Action action, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = appointmentCardIconButtonModel.icon;
        }
        if ((i13 & 2) != 0) {
            anyModal = appointmentCardIconButtonModel.modal;
        }
        if ((i13 & 4) != 0) {
            action = appointmentCardIconButtonModel.action;
        }
        return appointmentCardIconButtonModel.copy(str, anyModal, action);
    }

    public static /* synthetic */ void getAction$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(AppointmentCardIconButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.modal != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.modal);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.action == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    public final AppointmentCardIconButtonModel copy(String icon, AnyModal modal, Action action) {
        AbstractC22676k.m65750j(icon, "icon");
        return new AppointmentCardIconButtonModel(icon, modal, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentCardIconButtonModel)) {
            return false;
        }
        AppointmentCardIconButtonModel appointmentCardIconButtonModel = (AppointmentCardIconButtonModel) other;
        return AbstractC22676k.m65745e(this.icon, appointmentCardIconButtonModel.icon) && AbstractC22676k.m65745e(this.modal, appointmentCardIconButtonModel.modal) && AbstractC22676k.m65745e(this.action, appointmentCardIconButtonModel.action);
    }

    public final Action getAction() {
        return this.action;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        AnyModal anyModal = this.modal;
        int iHashCode2 = (iHashCode + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        Action action = this.action;
        return iHashCode2 + (action != null ? action.hashCode() : 0);
    }

    public String toString() {
        return "AppointmentCardIconButtonModel(icon=" + this.icon + ", modal=" + this.modal + ", action=" + this.action + ")";
    }

    public AppointmentCardIconButtonModel(String icon, AnyModal anyModal, Action action) {
        AbstractC22676k.m65750j(icon, "icon");
        this.icon = icon;
        this.modal = anyModal;
        this.action = action;
    }

    public /* synthetic */ AppointmentCardIconButtonModel(String str, AnyModal anyModal, Action action, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : anyModal, (i13 & 4) != 0 ? null : action);
    }
}
