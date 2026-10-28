package io.getstream.chat.android.p226ui.feature.messages.composer;

import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogFragment;
import java.util.List;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19710c implements AttachmentsPickerDialogFragment.AttachmentsSelectionListener, AttachmentsPickerDialogFragment.PollSubmissionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MessageComposerView f74567a;

    public /* synthetic */ C19710c(MessageComposerView messageComposerView) {
        this.f74567a = messageComposerView;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogFragment.AttachmentsSelectionListener
    public void onAttachmentsSelected(List list) {
        MessageComposerView.attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$12(this.f74567a, list);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogFragment.PollSubmissionListener
    public void onPollSubmitted(CreatePollParams createPollParams) {
        MessageComposerView.attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$13(this.f74567a, createPollParams);
    }
}
