package se1;

import ge3.AbstractC15751g;
import ie1.AbstractC18444b;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: se1.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m65681d2 = {"Lse1/b;", "", "", "sourceName", "", "imageResource", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "getSourceName", "()Ljava/lang/String;", "I", "getImageResource", "()I", "SPOTIFY", "WEB", "GOOGLE_PODCASTS", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC32422b {
    SPOTIFY("SPOTIFY", AbstractC18444b.f71814d),
    WEB("Listen on the web", AbstractC18444b.f71812b),
    GOOGLE_PODCASTS("GOOGLE PODCASTS", AbstractC18444b.f71811a);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int imageResource;
    private final String sourceName;

    EnumC32422b(String str, int i13) {
        this.sourceName = str;
        this.imageResource = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getImageResource() {
        return this.imageResource;
    }

    public final String getSourceName() {
        return this.sourceName;
    }
}
