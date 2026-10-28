package com.whoop.design.models.modal;

import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.ObjectSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/design/models/modal/Modal;", "", "Companion", "Lcom/whoop/design/models/modal/BottomSheet;", "Lcom/whoop/design/models/modal/CoachModal;", "Lcom/whoop/design/models/modal/DialogModel;", "Lcom/whoop/design/models/modal/FullScreenContentModal;", "Lcom/whoop/design/models/modal/ToastModal;", "Lcom/whoop/design/models/modal/UnknownModal;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public interface Modal {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/modal/Modal$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/modal/Modal;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final InterfaceC37138c serializer() {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return new C37142g("com.whoop.design.models.modal.Modal", c22673i0.getOrCreateKotlinClass(Modal.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(BottomSheet.class), c22673i0.getOrCreateKotlinClass(CoachModal.class), c22673i0.getOrCreateKotlinClass(DialogModel.class), c22673i0.getOrCreateKotlinClass(FullScreenContentModal.class), c22673i0.getOrCreateKotlinClass(ToastModal.class), c22673i0.getOrCreateKotlinClass(UnknownModal.class)}, new InterfaceC37138c[]{BottomSheet$$serializer.INSTANCE, CoachModal$$serializer.INSTANCE, DialogModel$$serializer.INSTANCE, FullScreenContentModal$$serializer.INSTANCE, ToastModal$$serializer.INSTANCE, new ObjectSerializer("com.whoop.design.models.modal.UnknownModal", UnknownModal.INSTANCE, new Annotation[0])}, new Annotation[0]);
        }
    }
}
