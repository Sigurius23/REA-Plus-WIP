package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import p088dc.InterfaceC11898e;
import p479s4.AbstractC32126g;

/* JADX INFO: loaded from: classes5.dex */
public final class RemoteActionCompat implements InterfaceC11898e {
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    public static class Api26Impl {
        private Api26Impl() {
        }

        public static RemoteAction createRemoteAction(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        public static PendingIntent getActionIntent(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        public static CharSequence getContentDescription(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        public static Icon getIcon(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        public static CharSequence getTitle(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        public static boolean isEnabled(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        public static void setEnabled(RemoteAction remoteAction, boolean z4) {
            remoteAction.setEnabled(z4);
        }
    }

    public static class Api28Impl {
        private Api28Impl() {
        }

        public static void setShouldShowIcon(RemoteAction remoteAction, boolean z4) {
            remoteAction.setShouldShowIcon(z4);
        }

        public static boolean shouldShowIcon(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        iconCompat.getClass();
        this.mIcon = iconCompat;
        charSequence.getClass();
        this.mTitle = charSequence;
        charSequence2.getClass();
        this.mContentDescription = charSequence2;
        pendingIntent.getClass();
        this.mActionIntent = pendingIntent;
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction) {
        remoteAction.getClass();
        Icon icon = Api26Impl.getIcon(remoteAction);
        PorterDuff.Mode mode = IconCompat.f5264k;
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(AbstractC32126g.m100041f(icon), Api26Impl.getTitle(remoteAction), Api26Impl.getContentDescription(remoteAction), Api26Impl.getActionIntent(remoteAction));
        remoteActionCompat.setEnabled(Api26Impl.isEnabled(remoteAction));
        remoteActionCompat.setShouldShowIcon(Api28Impl.shouldShowIcon(remoteAction));
        return remoteActionCompat;
    }

    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z4) {
        this.mEnabled = z4;
    }

    public void setShouldShowIcon(boolean z4) {
        this.mShouldShowIcon = z4;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public RemoteAction toRemoteAction() {
        RemoteAction remoteActionCreateRemoteAction = Api26Impl.createRemoteAction(this.mIcon.m3687k(null), this.mTitle, this.mContentDescription, this.mActionIntent);
        Api26Impl.setEnabled(remoteActionCreateRemoteAction, isEnabled());
        Api28Impl.setShouldShowIcon(remoteActionCreateRemoteAction, shouldShowIcon());
        return remoteActionCreateRemoteAction;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }
}
