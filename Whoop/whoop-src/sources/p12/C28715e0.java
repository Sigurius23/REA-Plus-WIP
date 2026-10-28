package p12;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: p12.e0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lp12/e0;", "", "", "title", "subtitle", "Lkd1/o;", "imageSource", "videoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lkd1/o;", "()Lkd1/o;", "d", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28715e0 {

    /* JADX INFO: renamed from: e */
    public static final int f116134e = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String videoUrl;

    public C28715e0(String title, String subtitle, AbstractC22403o imageSource, String videoUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(imageSource, "imageSource");
        AbstractC22676k.m65750j(videoUrl, "videoUrl");
        this.title = title;
        this.subtitle = subtitle;
        this.imageSource = imageSource;
        this.videoUrl = videoUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28715e0)) {
            return false;
        }
        C28715e0 c28715e0 = (C28715e0) other;
        return AbstractC22676k.m65745e(this.title, c28715e0.title) && AbstractC22676k.m65745e(this.subtitle, c28715e0.subtitle) && AbstractC22676k.m65745e(this.imageSource, c28715e0.imageSource) && AbstractC22676k.m65745e(this.videoUrl, c28715e0.videoUrl);
    }

    public int hashCode() {
        return this.videoUrl.hashCode() + AbstractC30007c.m91833c(this.imageSource, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AbstractC22403o abstractC22403o = this.imageSource;
        String str3 = this.videoUrl;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VideoInfo(title=", str, ", subtitle=", str2, ", imageSource=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", videoUrl=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
