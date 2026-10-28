package ds0;

import ad3.AbstractC0757c;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.models.modal.UnknownModal;
import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ds0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/models/modal/AnyModal;", "", "a", "(Lcom/whoop/design/models/modal/AnyModal;)Z", "Lcom/whoop/navigation/models/GenericInteraction;", "Lad3/c;", "json", "b", "(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/design/models/modal/AnyModal;", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12330i {
    /* JADX INFO: renamed from: a */
    public static final boolean m34416a(AnyModal anyModal) {
        AbstractC22676k.m65750j(anyModal, "<this>");
        return ((anyModal.getModal() instanceof FullScreenContentModal) || (anyModal.getModal() instanceof UnknownModal)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static final AnyModal m34417b(GenericInteraction genericInteraction, AbstractC0757c json) {
        AnyModal modal;
        AbstractC22676k.m65750j(genericInteraction, "<this>");
        AbstractC22676k.m65750j(json, "json");
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(genericInteraction, json);
        if (decodedGenericInteraction == null || (modal = decodedGenericInteraction.getModal()) == null || !m34416a(modal)) {
            return null;
        }
        return modal;
    }
}
