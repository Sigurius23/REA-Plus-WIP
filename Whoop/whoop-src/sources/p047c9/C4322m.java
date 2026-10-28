package p047c9;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import p182h3.AbstractC16792h;
import p184h5.C16870f;
import p184h5.InterfaceC16861c;
import p184h5.InterfaceC16867e;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: c9.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C4322m implements InterfaceC16861c, InterfaceC16867e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17571a;

    /* JADX INFO: renamed from: b */
    public Object f17572b;

    public C4322m() {
        this.f17571a = 0;
        this.f17572b = LogSessionId.LOG_SESSION_ID_NONE;
    }

    @Override // p184h5.InterfaceC16861c
    /* JADX INFO: renamed from: a */
    public void mo13627a(Uri uri) {
        ((ContentInfo.Builder) this.f17572b).setLinkUri(uri);
    }

    @Override // p184h5.InterfaceC16867e
    /* JADX INFO: renamed from: b */
    public ContentInfo mo13628b() {
        return (ContentInfo) this.f17572b;
    }

    @Override // p184h5.InterfaceC16861c
    public C16870f build() {
        return new C16870f(new C4322m(((ContentInfo.Builder) this.f17572b).build()));
    }

    @Override // p184h5.InterfaceC16867e
    /* JADX INFO: renamed from: c */
    public ClipData mo13629c() {
        return ((ContentInfo) this.f17572b).getClip();
    }

    @Override // p184h5.InterfaceC16867e
    /* JADX INFO: renamed from: d */
    public int mo13630d() {
        return ((ContentInfo) this.f17572b).getFlags();
    }

    @Override // p184h5.InterfaceC16861c
    /* JADX INFO: renamed from: e */
    public void mo13631e(int i13) {
        ((ContentInfo.Builder) this.f17572b).setFlags(i13);
    }

    /* JADX INFO: renamed from: f */
    public void m13632f(LogSessionId logSessionId) {
        AbstractC35849g.m113807i(((LogSessionId) this.f17572b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.f17572b = logSessionId;
    }

    @Override // p184h5.InterfaceC16867e
    public int getSource() {
        return ((ContentInfo) this.f17572b).getSource();
    }

    @Override // p184h5.InterfaceC16861c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f17572b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f17571a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.f17572b) + "}";
            default:
                return super.toString();
        }
    }

    public C4322m(ContentInfo contentInfo) {
        this.f17571a = 2;
        contentInfo.getClass();
        this.f17572b = contentInfo;
    }

    public C4322m(ClipData clipData, int i13) {
        this.f17571a = 1;
        this.f17572b = AbstractC16792h.m47339b(clipData, i13);
    }
}
