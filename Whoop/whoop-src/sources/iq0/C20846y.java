package iq0;

import android.view.View;
import com.whoop.community.presentation.chat.NotificationSettingsFragment;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iq0.y */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20846y implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78370w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ NotificationSettingsFragment f78371x;

    public /* synthetic */ C20846y(NotificationSettingsFragment notificationSettingsFragment, int i13) {
        this.f78370w = i13;
        this.f78371x = notificationSettingsFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f78370w) {
            case 0:
                return NotificationSettingsFragment.m19287U(this.f78371x, (View) obj);
            default:
                return NotificationSettingsFragment.m19283Q(this.f78371x, (String) obj);
        }
    }
}
