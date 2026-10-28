package t11;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33194k1;

/* JADX INFO: renamed from: t11.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, m65681d2 = {"Lt11/f;", "Lm91/u;", "", "id", "Lsz0/k1;", "titleSubtitle", "", "Lt11/g;", "options", "Lt11/h;", "textAreaState", "<init>", "(Ljava/lang/String;Lsz0/k1;Ljava/util/List;Lt11/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lsz0/k1;", "c", "()Lsz0/k1;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lt11/h;", "()Lt11/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33306f implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f138893e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33194k1 titleSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C33307g> options;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33308h textAreaState;

    public C33306f(String str, C33194k1 titleSubtitle, List<C33307g> options, C33308h c33308h) {
        AbstractC22676k.m65750j(titleSubtitle, "titleSubtitle");
        AbstractC22676k.m65750j(options, "options");
        this.id = str;
        this.titleSubtitle = titleSubtitle;
        this.options = options;
        this.textAreaState = c33308h;
    }

    /* JADX INFO: renamed from: a */
    public final List<C33307g> m105659a() {
        return this.options;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33308h getTextAreaState() {
        return this.textAreaState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33194k1 getTitleSubtitle() {
        return this.titleSubtitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33306f)) {
            return false;
        }
        C33306f c33306f = (C33306f) other;
        return AbstractC22676k.m65745e(this.id, c33306f.id) && AbstractC22676k.m65745e(this.titleSubtitle, c33306f.titleSubtitle) && AbstractC22676k.m65745e(this.options, c33306f.options) && AbstractC22676k.m65745e(this.textAreaState, c33306f.textAreaState);
    }

    public int hashCode() {
        String str = this.id;
        int iM31983b = AbstractC11895b.m31983b((this.titleSubtitle.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.options);
        C33308h c33308h = this.textAreaState;
        return iM31983b + (c33308h != null ? c33308h.hashCode() : 0);
    }

    public String toString() {
        return "FeedbackSurveyState(id=" + this.id + ", titleSubtitle=" + this.titleSubtitle + ", options=" + this.options + ", textAreaState=" + this.textAreaState + ")";
    }
}
