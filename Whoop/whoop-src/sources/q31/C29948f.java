package q31;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: q31.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lq31/f;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "", "initiallySelectedSegmentIndex", "", "Lq31/a;", "segments", "", "transparentBackground", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;Z)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ILjava/util/List;Z)Lq31/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "I", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "g", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29948f implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f122292f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int initiallySelectedSegmentIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C29943a> segments;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean transparentBackground;

    public C29948f(String id4, TextResource textResource, int i13, List<C29943a> segments, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segments, "segments");
        this.id = id4;
        this.title = textResource;
        this.initiallySelectedSegmentIndex = i13;
        this.segments = segments;
        this.transparentBackground = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29948f m91609b(C29948f c29948f, String str, TextResource textResource, int i13, List list, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c29948f.id;
        }
        if ((i14 & 2) != 0) {
            textResource = c29948f.title;
        }
        if ((i14 & 4) != 0) {
            i13 = c29948f.initiallySelectedSegmentIndex;
        }
        if ((i14 & 8) != 0) {
            list = c29948f.segments;
        }
        if ((i14 & 16) != 0) {
            z4 = c29948f.transparentBackground;
        }
        boolean z13 = z4;
        int i15 = i13;
        return c29948f.m91610a(str, textResource, i15, list, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C29948f m91610a(String id4, TextResource title, int initiallySelectedSegmentIndex, List<C29943a> segments, boolean transparentBackground) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segments, "segments");
        return new C29948f(id4, title, initiallySelectedSegmentIndex, segments, transparentBackground);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getInitiallySelectedSegmentIndex() {
        return this.initiallySelectedSegmentIndex;
    }

    /* JADX INFO: renamed from: e */
    public final List<C29943a> m91612e() {
        return this.segments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29948f)) {
            return false;
        }
        C29948f c29948f = (C29948f) other;
        return AbstractC22676k.m65745e(this.id, c29948f.id) && AbstractC22676k.m65745e(this.title, c29948f.title) && this.initiallySelectedSegmentIndex == c29948f.initiallySelectedSegmentIndex && AbstractC22676k.m65745e(this.segments, c29948f.segments) && this.transparentBackground == c29948f.transparentBackground;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getTransparentBackground() {
        return this.transparentBackground;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        TextResource textResource = this.title;
        return Boolean.hashCode(this.transparentBackground) + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.initiallySelectedSegmentIndex, (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31, 31), 31, this.segments);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        int i13 = this.initiallySelectedSegmentIndex;
        List<C29943a> list = this.segments;
        boolean z4 = this.transparentBackground;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("SegmentedContentState(id=", str, ", title=", textResource, ", initiallySelectedSegmentIndex=");
        sbM91847q.append(i13);
        sbM91847q.append(", segments=");
        sbM91847q.append(list);
        sbM91847q.append(", transparentBackground=");
        return AbstractC18489d0.m53372m(sbM91847q, z4, ")");
    }

    public /* synthetic */ C29948f(String str, TextResource textResource, int i13, List list, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? null : textResource, i13, list, (i14 & 16) != 0 ? false : z4);
    }
}
