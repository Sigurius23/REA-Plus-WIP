package ej1;

import com.whoop.design.util.TextResource;
import hy0.C17731c2;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ej1.c0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006!"}, m65681d2 = {"Lej1/c0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "subtitle", "title", "", "Lhy0/c2;", "trends", "Lkd1/o;", "image", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lkd1/o;", "()Lkd1/o;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13233c0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C17731c2> trends;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o image;

    public C13233c0(TextResource textResource, TextResource title, List<C17731c2> trends, AbstractC22403o image) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(image, "image");
        this.subtitle = textResource;
        this.title = title;
        this.trends = trends;
        this.image = image;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c */
    public final List<C17731c2> m37157c() {
        return this.trends;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13233c0)) {
            return false;
        }
        C13233c0 c13233c0 = (C13233c0) other;
        return AbstractC22676k.m65745e(this.subtitle, c13233c0.subtitle) && AbstractC22676k.m65745e(this.title, c13233c0.title) && AbstractC22676k.m65745e(this.trends, c13233c0.trends) && AbstractC22676k.m65745e(this.image, c13233c0.image);
    }

    public int hashCode() {
        TextResource textResource = this.subtitle;
        return this.image.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a((textResource == null ? 0 : textResource.hashCode()) * 31, this.title, 31), 31, this.trends);
    }

    public String toString() {
        TextResource textResource = this.subtitle;
        TextResource textResource2 = this.title;
        List<C17731c2> list = this.trends;
        AbstractC22403o abstractC22403o = this.image;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ImageVisualizationCardViewState(subtitle=", textResource, ", title=", textResource2, ", trends=");
        sbM106658q.append(list);
        sbM106658q.append(", image=");
        sbM106658q.append(abstractC22403o);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
