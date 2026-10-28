package com.whoop.design.models.modal;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.calendar.archmini.C7011a;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.DismissEventModel$$serializer;
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
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JV\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/modal/DialogButton;", "", "", "title", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "Lcom/whoop/navigation/DismissEventModel;", "dismissEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/modal/DialogButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/whoopaction/domain/models/Action;", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/design/models/modal/AnyModal;", "component5", "()Lcom/whoop/navigation/DismissEventModel;", "component6", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/modal/DialogButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "Lcom/whoop/navigation/DismissEventModel;", "getDismissEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DialogButton {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final AnalyticEventModel analyticEvent;
    private final C9598e destination;
    private final DismissEventModel dismissEvent;
    private final AnyModal modal;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/DialogButton$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/DialogButton;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DialogButton$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C7011a(17)), AbstractC30060g.m92087G(enumC23463i, new C7011a(18)), AbstractC30060g.m92087G(enumC23463i, new C7011a(19)), null, null};
    }

    public /* synthetic */ DialogButton(int i13, String str, Action action, C9598e c9598e, AnyModal anyModal, DismissEventModel dismissEventModel, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, DialogButton$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        if ((i13 & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
        if ((i13 & 16) == 0) {
            this.dismissEvent = null;
        } else {
            this.dismissEvent = dismissEventModel;
        }
        if ((i13 & 32) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AnyModal.INSTANCE.serializer();
    }

    public static /* synthetic */ DialogButton copy$default(DialogButton dialogButton, String str, Action action, C9598e c9598e, AnyModal anyModal, DismissEventModel dismissEventModel, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dialogButton.title;
        }
        if ((i13 & 2) != 0) {
            action = dialogButton.action;
        }
        if ((i13 & 4) != 0) {
            c9598e = dialogButton.destination;
        }
        if ((i13 & 8) != 0) {
            anyModal = dialogButton.modal;
        }
        if ((i13 & 16) != 0) {
            dismissEventModel = dialogButton.dismissEvent;
        }
        if ((i13 & 32) != 0) {
            analyticEventModel = dialogButton.analyticEvent;
        }
        DismissEventModel dismissEventModel2 = dismissEventModel;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        return dialogButton.copy(str, action, c9598e, anyModal, dismissEventModel2, analyticEventModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DialogButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.modal != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.modal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.dismissEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, DismissEventModel$$serializer.INSTANCE, self.dismissEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final DialogButton copy(String title, Action action, C9598e destination, AnyModal modal, DismissEventModel dismissEvent, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(title, "title");
        return new DialogButton(title, action, destination, modal, dismissEvent, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogButton)) {
            return false;
        }
        DialogButton dialogButton = (DialogButton) other;
        return AbstractC22676k.m65745e(this.title, dialogButton.title) && AbstractC22676k.m65745e(this.action, dialogButton.action) && AbstractC22676k.m65745e(this.destination, dialogButton.destination) && AbstractC22676k.m65745e(this.modal, dialogButton.modal) && AbstractC22676k.m65745e(this.dismissEvent, dialogButton.dismissEvent) && AbstractC22676k.m65745e(this.analyticEvent, dialogButton.analyticEvent);
    }

    public final Action getAction() {
        return this.action;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final DismissEventModel getDismissEvent() {
        return this.dismissEvent;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        int iHashCode4 = (iHashCode3 + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        DismissEventModel dismissEventModel = this.dismissEvent;
        int iHashCode5 = (iHashCode4 + (dismissEventModel == null ? 0 : dismissEventModel.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iHashCode5 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        return "DialogButton(title=" + this.title + ", action=" + this.action + ", destination=" + this.destination + ", modal=" + this.modal + ", dismissEvent=" + this.dismissEvent + ", analyticEvent=" + this.analyticEvent + ")";
    }

    public DialogButton(String title, Action action, C9598e c9598e, AnyModal anyModal, DismissEventModel dismissEventModel, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.action = action;
        this.destination = c9598e;
        this.modal = anyModal;
        this.dismissEvent = dismissEventModel;
        this.analyticEvent = analyticEventModel;
    }

    public /* synthetic */ DialogButton(String str, Action action, C9598e c9598e, AnyModal anyModal, DismissEventModel dismissEventModel, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : action, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : anyModal, (i13 & 16) != 0 ? null : dismissEventModel, (i13 & 32) != 0 ? null : analyticEventModel);
    }
}
