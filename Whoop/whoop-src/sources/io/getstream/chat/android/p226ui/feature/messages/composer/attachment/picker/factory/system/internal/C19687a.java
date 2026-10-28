package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.system.internal;

import android.net.Uri;
import java.io.File;
import java.util.List;
import p236j.C21062a;
import p236j.InterfaceC21063b;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.system.internal.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19687a implements InterfaceC21063b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74536w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AttachmentsPickerSystemFragment f74537x;

    public /* synthetic */ C19687a(AttachmentsPickerSystemFragment attachmentsPickerSystemFragment, int i13) {
        this.f74536w = i13;
        this.f74537x = attachmentsPickerSystemFragment;
    }

    @Override // p236j.InterfaceC21063b
    /* JADX INFO: renamed from: a */
    public final void mo364a(Object obj) {
        switch (this.f74536w) {
            case 0:
                AttachmentsPickerSystemFragment.registerVisualMediaPickerLauncher$lambda$10(this.f74537x, (List) obj);
                break;
            case 1:
                AttachmentsPickerSystemFragment.registerVisualMediaPickerLauncher$lambda$11(this.f74537x, (Uri) obj);
                break;
            case 2:
                AttachmentsPickerSystemFragment.setupViews$lambda$4(this.f74537x, (File) obj);
                break;
            default:
                AttachmentsPickerSystemFragment.filePickerLauncher$lambda$0(this.f74537x, (C21062a) obj);
                break;
        }
    }
}
