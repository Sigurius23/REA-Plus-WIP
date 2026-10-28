package gy1;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import fy1.C14866b;
import fy1.InterfaceC14868d;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: gy1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lgy1/a;", "Lfy1/d;", "<init>", "()V", "Lfy1/b;", HMSTrackSource.SCREEN, "Ll83/a0;", "a", "(Lfy1/b;)V", "Lec3/p1;", "Lec3/p1;", "mutableCurrentScreen", "Lec3/f2;", "b", "Lec3/f2;", "()Lec3/f2;", "currentScreen", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16279a implements InterfaceC14868d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 mutableCurrentScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 currentScreen;

    public C16279a() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.mutableCurrentScreen = c13045h2M36593c;
        this.currentScreen = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    @Override // fy1.InterfaceC14868d
    /* JADX INFO: renamed from: a */
    public void mo42893a(C14866b screen) {
        ((C13045h2) this.mutableCurrentScreen).m36570j(screen);
    }

    @Override // fy1.InterfaceC14867c
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13037f2 getCurrentScreen() {
        return this.currentScreen;
    }
}
