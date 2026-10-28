package com.whoop.design.models.modal;

import ge3.AbstractC15751g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/modal/ModalType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DIALOG", "BOTTOM_SHEET", "FULLSCREEN", "COACH", "TOAST", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum ModalType {
    DIALOG("DIALOG"),
    BOTTOM_SHEET("BOTTOM_SHEET"),
    FULLSCREEN("FULLSCREEN"),
    COACH("COACH"),
    TOAST("TOAST");

    private final String value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("ModalType");

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/modal/ModalType$Companion;", "", "<init>", "()V", "Lcom/whoop/design/models/modal/Modal;", "modal", "Lcom/whoop/design/models/modal/ModalType;", "fromModal", "(Lcom/whoop/design/models/modal/Modal;)Lcom/whoop/design/models/modal/ModalType;", "Ltr2/n;", "logger", "Ltr2/n;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ModalType fromModal(Modal modal) {
            AbstractC22676k.m65750j(modal, "modal");
            if (modal instanceof DialogModel) {
                return ModalType.DIALOG;
            }
            if (modal instanceof BottomSheet) {
                return ModalType.BOTTOM_SHEET;
            }
            if (modal instanceof FullScreenContentModal) {
                return ModalType.FULLSCREEN;
            }
            if (modal instanceof CoachModal) {
                return ModalType.COACH;
            }
            if (modal instanceof ToastModal) {
                return ModalType.TOAST;
            }
            ModalType.logger.mo85226q(AbstractC11266d.m30461o("Unknown Modal subtype: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(modal.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
            return null;
        }

        private Companion() {
        }
    }

    ModalType(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
