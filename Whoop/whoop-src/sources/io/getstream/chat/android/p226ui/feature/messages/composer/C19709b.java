package io.getstream.chat.android.p226ui.feature.messages.composer;

import android.view.MotionEvent;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19709b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74565w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageComposerView f74566x;

    public /* synthetic */ C19709b(MessageComposerView messageComposerView, int i13) {
        this.f74565w = i13;
        this.f74566x = messageComposerView;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74565w) {
            case 0:
                MessageComposerView.setCenterContent$lambda$64(this.f74566x, (String) obj);
                return C23454a0.f92919a;
            case 1:
                MessageComposerView.setCenterContent$lambda$65(this.f74566x, (Attachment) obj);
                return C23454a0.f92919a;
            case 2:
                MessageComposerView.setFooterContent$lambda$68(this.f74566x, ((Boolean) obj).booleanValue());
                return C23454a0.f92919a;
            case 3:
                return Boolean.valueOf(MessageComposerView.setTrailingContent$lambda$67(this.f74566x, (MotionEvent) obj));
            case 4:
                return MessageComposerView.attachmentsPickerDialogBuilder$lambda$15(this.f74566x, (AttachmentsPickerDialogStyle) obj);
            case 5:
                MessageComposerView.audioRecordButtonTouchListener$lambda$19(this.f74566x, (MotionEvent) obj);
                return Boolean.TRUE;
            case 6:
                MessageComposerView.m55216x2f1c0c5e(this.f74566x, (User) obj);
                return C23454a0.f92919a;
            case 7:
                MessageComposerView.m55215x50cf53c8(this.f74566x, (Command) obj);
                return C23454a0.f92919a;
            case 8:
                MessageComposerView.setMentionSuggestionsContent$lambda$80(this.f74566x, (User) obj);
                return C23454a0.f92919a;
            case 9:
                MessageComposerView.init$lambda$59$lambda$57(this.f74566x, ((Float) obj).floatValue());
                return C23454a0.f92919a;
            case 10:
                MessageComposerView.init$lambda$59$lambda$58(this.f74566x, ((Float) obj).floatValue());
                return C23454a0.f92919a;
            case 11:
                MessageComposerView.init$lambda$41$lambda$39(this.f74566x, (String) obj);
                return C23454a0.f92919a;
            case 12:
                MessageComposerView.init$lambda$41$lambda$40(this.f74566x, (Attachment) obj);
                return C23454a0.f92919a;
            case 13:
                return Boolean.valueOf(MessageComposerView.init$lambda$44$lambda$43(this.f74566x, (MotionEvent) obj));
            case 14:
                MessageComposerView.init$lambda$46$lambda$45(this.f74566x, ((Boolean) obj).booleanValue());
                return C23454a0.f92919a;
            case 15:
                MessageComposerView.setCommandSuggestionsContent$lambda$81(this.f74566x, (Command) obj);
                return C23454a0.f92919a;
            case 16:
                MessageComposerView.setCenterOverlapContent$lambda$78(this.f74566x, ((Float) obj).floatValue());
                return C23454a0.f92919a;
            default:
                MessageComposerView.setCenterOverlapContent$lambda$79(this.f74566x, ((Float) obj).floatValue());
                return C23454a0.f92919a;
        }
    }
}
