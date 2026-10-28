package com.whoop.design.models.modal;

import ad3.AbstractC0757c;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.json.C9602a;
import com.whoop.navigation.models.GenericInteraction;
import j02.AbstractC21170u;
import j02.C21166s;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sw2.AbstractC33054a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/navigation/models/GenericInteraction;", "Lad3/c;", "json", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "toDecodedGenericInteraction", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "Lcom/whoop/design/models/modal/ModalLifecycleInteractions;", "Lcom/whoop/design/models/modal/ModalLifecycleInteraction;", "toModalLifecycleInteraction", "(Lcom/whoop/design/models/modal/ModalLifecycleInteractions;Lad3/c;)Lcom/whoop/design/models/modal/ModalLifecycleInteraction;", "Lcom/whoop/design/models/modal/AnyModal;", "decodeModal", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;", "Lcom/whoop/navigation/e;", "decodeNavigation", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/navigation/e;", "Lj02/s;", "decodeDismissEvent", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lj02/s;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GenericInteractionDecoderKt {
    private static final C21166s decodeDismissEvent(GenericInteraction genericInteraction, AbstractC0757c abstractC0757c) {
        DismissEventModel dismissEventModel;
        JsonElement dismissEvent = genericInteraction.getDismissEvent();
        if (dismissEvent == null || (dismissEventModel = (DismissEventModel) AbstractC33054a.m104672c(dismissEvent, abstractC0757c, DismissEventModel.INSTANCE.serializer())) == null) {
            return null;
        }
        return AbstractC21170u.m59413a(dismissEventModel);
    }

    private static final AnyModal decodeModal(GenericInteraction genericInteraction, AbstractC0757c abstractC0757c) {
        JsonElement modal = genericInteraction.getModal();
        if (modal != null) {
            return (AnyModal) AbstractC33054a.m104672c(modal, abstractC0757c, AnyModal.INSTANCE.serializer());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final C9598e decodeNavigation(GenericInteraction genericInteraction, AbstractC0757c abstractC0757c) {
        JsonElement navigation = genericInteraction.getNavigation();
        Map map = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (navigation == null) {
            return null;
        }
        return (C9598e) AbstractC33054a.m104672c(navigation, abstractC0757c, new C9602a(map, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0));
    }

    public static final DecodedGenericInteraction toDecodedGenericInteraction(GenericInteraction genericInteraction, AbstractC0757c json) {
        AbstractC22676k.m65750j(genericInteraction, "<this>");
        AbstractC22676k.m65750j(json, "json");
        if (genericInteraction.isEmpty()) {
            return null;
        }
        DecodedGenericInteraction decodedGenericInteraction = new DecodedGenericInteraction(decodeModal(genericInteraction, json), AbstractC33054a.m104670a(genericInteraction, json), AbstractC33054a.m104671b(genericInteraction, json), decodeNavigation(genericInteraction, json), decodeDismissEvent(genericInteraction, json));
        if (decodedGenericInteraction.isEmpty()) {
            return null;
        }
        return decodedGenericInteraction;
    }

    public static final ModalLifecycleInteraction toModalLifecycleInteraction(ModalLifecycleInteractions modalLifecycleInteractions, AbstractC0757c json) {
        AbstractC22676k.m65750j(modalLifecycleInteractions, "<this>");
        AbstractC22676k.m65750j(json, "json");
        GenericInteraction onStart = modalLifecycleInteractions.getOnStart();
        return new ModalLifecycleInteraction(onStart != null ? toDecodedGenericInteraction(onStart, json) : null);
    }
}
