package t13;

import android.view.View;
import io.getstream.chat.android.p226ui.feature.messages.dialog.ModeratedMessageDialogFragment;

/* JADX INFO: renamed from: t13.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC33312a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138969w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ModeratedMessageDialogFragment f138970x;

    public /* synthetic */ ViewOnClickListenerC33312a(ModeratedMessageDialogFragment moderatedMessageDialogFragment, int i13) {
        this.f138969w = i13;
        this.f138970x = moderatedMessageDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f138969w) {
            case 0:
                ModeratedMessageDialogFragment.setupClickListeners$lambda$4$lambda$1(this.f138970x, view);
                break;
            case 1:
                ModeratedMessageDialogFragment.setupClickListeners$lambda$4$lambda$2(this.f138970x, view);
                break;
            case 2:
                ModeratedMessageDialogFragment.setupClickListeners$lambda$4$lambda$3(this.f138970x, view);
                break;
            default:
                this.f138970x.dismiss();
                break;
        }
    }
}
