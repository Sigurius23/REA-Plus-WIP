package sr1;

import live.hms.video.media.tracks.HMSTrackSource;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sr1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lsr1/g;", "", "", "titleDisplay", HMSTrackSource.SCREEN, "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32915g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String screen;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String icon;

    public C32915g(String titleDisplay, String screen, String icon) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(icon, "icon");
        this.titleDisplay = titleDisplay;
        this.screen = screen;
        this.icon = icon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32915g)) {
            return false;
        }
        C32915g c32915g = (C32915g) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32915g.titleDisplay) && AbstractC22676k.m65745e(this.screen, c32915g.screen) && AbstractC22676k.m65745e(this.icon, c32915g.icon);
    }

    public int hashCode() {
        return this.icon.hashCode() + AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.screen);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.icon, ")", AbstractC11895b.m32001t("NavigationButtonDomainState(titleDisplay=", this.titleDisplay, ", screen=", this.screen, ", icon="));
    }
}
