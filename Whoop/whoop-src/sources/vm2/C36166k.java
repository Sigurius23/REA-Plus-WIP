package vm2;

import com.whoop.navigation.AppScreen;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vm2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lvm2/k;", "", "<init>", "()V", "Lcom/whoop/navigation/AppScreen;", HMSTrackSource.SCREEN, "", "a", "(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36166k {

    /* JADX INFO: renamed from: a */
    public static final C36166k f154741a = new C36166k();

    private C36166k() {
    }

    /* JADX INFO: renamed from: a */
    public final String m115107a(AppScreen screen) {
        AbstractC22676k.m65750j(screen, "screen");
        if (screen.equals(AppScreen.C9426u2.f27963w)) {
            return "home";
        }
        if (screen.equals(AppScreen.C9394q2.f27867w)) {
            return "health";
        }
        if (screen.equals(AppScreen.C9361m1.f27766w)) {
            return "community";
        }
        if (screen.equals(AppScreen.C9276b4.f27502w)) {
            return "menu";
        }
        return null;
    }
}
