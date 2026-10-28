package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.view.MenuItem;
import p027b3.AbstractC2378g1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC19699b implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74543a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74544b;

    public /* synthetic */ MenuItemOnMenuItemClickListenerC19699b(Object obj, int i13) {
        this.f74543a = i13;
        this.f74544b = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.f74543a) {
            case 0:
                CreatePollDialogFragment.setupToolbar$lambda$14((CreatePollDialogFragment) this.f74544b, menuItem);
                break;
            default:
                PendingIntent actionIntent = ((RemoteAction) this.f74544b).getActionIntent();
                if (Build.VERSION.SDK_INT < 34) {
                    actionIntent.send();
                } else {
                    AbstractC2378g1.m7342q(actionIntent);
                }
                break;
        }
        return true;
    }
}
