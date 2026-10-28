package com.whoop.design.models.modal;

import com.whoop.design.json.C6727a;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0015R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,RE\u00102\u001a%\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020-\u0018\u00010\nj\u0004\u0018\u0001`.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\t018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/modal/AnyModal;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/modal/Modal;", "modal", "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "analyticEvents", "Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "modalLifecycleInteractions", "<init>", "(Lcom/whoop/design/models/modal/Modal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/design/models/modal/ModalLifecycleInteractions;)V", "", "", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/modal/AnyModal;", "component1", "()Lcom/whoop/design/models/modal/Modal;", "component2", "()Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "component3", "()Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "copy", "(Lcom/whoop/design/models/modal/Modal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lcom/whoop/design/models/modal/ModalLifecycleInteractions;)Lcom/whoop/design/models/modal/AnyModal;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/modal/Modal;", "getModal", "Lcom/whoop/design/models/modal/ModalAnalyticEventModel;", "getAnalyticEvents", "Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "getModalLifecycleInteractions", "bindings", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "getAggregateBindings", "setAggregateBindings", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C6727a.class)
public final /* data */ class AnyModal implements WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private final ModalAnalyticEventModel analyticEvents;
    private Map<String, String> bindings;
    private final Modal modal;
    private final ModalLifecycleInteractions modalLifecycleInteractions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/AnyModal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/AnyModal;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return new C6727a();
        }

        private Companion() {
        }
    }

    public AnyModal(Modal modal, ModalAnalyticEventModel modalAnalyticEventModel, ModalLifecycleInteractions modalLifecycleInteractions) {
        AbstractC22676k.m65750j(modal, "modal");
        this.modal = modal;
        this.analyticEvents = modalAnalyticEventModel;
        this.modalLifecycleInteractions = modalLifecycleInteractions;
    }

    public static /* synthetic */ AnyModal copy$default(AnyModal anyModal, Modal modal, ModalAnalyticEventModel modalAnalyticEventModel, ModalLifecycleInteractions modalLifecycleInteractions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            modal = anyModal.modal;
        }
        if ((i13 & 2) != 0) {
            modalAnalyticEventModel = anyModal.analyticEvents;
        }
        if ((i13 & 4) != 0) {
            modalLifecycleInteractions = anyModal.modalLifecycleInteractions;
        }
        return anyModal.copy(modal, modalAnalyticEventModel, modalLifecycleInteractions);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Modal getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ModalAnalyticEventModel getAnalyticEvents() {
        return this.analyticEvents;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ModalLifecycleInteractions getModalLifecycleInteractions() {
        return this.modalLifecycleInteractions;
    }

    public final AnyModal copy(Modal modal, ModalAnalyticEventModel analyticEvents, ModalLifecycleInteractions modalLifecycleInteractions) {
        AbstractC22676k.m65750j(modal, "modal");
        return new AnyModal(modal, analyticEvents, modalLifecycleInteractions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnyModal)) {
            return false;
        }
        AnyModal anyModal = (AnyModal) other;
        return AbstractC22676k.m65745e(this.modal, anyModal.modal) && AbstractC22676k.m65745e(this.analyticEvents, anyModal.analyticEvents) && AbstractC22676k.m65745e(this.modalLifecycleInteractions, anyModal.modalLifecycleInteractions);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final ModalAnalyticEventModel getAnalyticEvents() {
        return this.analyticEvents;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final Modal getModal() {
        return this.modal;
    }

    public final ModalLifecycleInteractions getModalLifecycleInteractions() {
        return this.modalLifecycleInteractions;
    }

    public int hashCode() {
        int iHashCode = this.modal.hashCode() * 31;
        ModalAnalyticEventModel modalAnalyticEventModel = this.analyticEvents;
        int iHashCode2 = (iHashCode + (modalAnalyticEventModel == null ? 0 : modalAnalyticEventModel.hashCode())) * 31;
        ModalLifecycleInteractions modalLifecycleInteractions = this.modalLifecycleInteractions;
        return iHashCode2 + (modalLifecycleInteractions != null ? modalLifecycleInteractions.hashCode() : 0);
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
        return "AnyModal(modal=" + this.modal + ", analyticEvents=" + this.analyticEvents + ", modalLifecycleInteractions=" + this.modalLifecycleInteractions + ")";
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public AnyModal bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AnyModalStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ AnyModal(Modal modal, ModalAnalyticEventModel modalAnalyticEventModel, ModalLifecycleInteractions modalLifecycleInteractions, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(modal, (i13 & 2) != 0 ? null : modalAnalyticEventModel, (i13 & 4) != 0 ? null : modalLifecycleInteractions);
    }
}
