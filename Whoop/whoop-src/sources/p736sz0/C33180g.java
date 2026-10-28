package p736sz0;

import com.whoop.navigation.models.GenericInteraction;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: sz0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lsz0/g;", "Lm91/u;", "", "text", "Lsz0/f;", "selection", "Lsz0/h;", "positiveIcon", "negativeIcon", "<init>", "(Ljava/lang/String;Lsz0/f;Lsz0/h;Lsz0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lsz0/f;", "c", "()Lsz0/f;", "Lsz0/h;", "()Lsz0/h;", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33180g implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f138347e = GenericInteraction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC33177f selection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C33183h positiveIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33183h negativeIcon;

    public C33180g(String str, EnumC33177f selection, C33183h positiveIcon, C33183h negativeIcon) {
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(positiveIcon, "positiveIcon");
        AbstractC22676k.m65750j(negativeIcon, "negativeIcon");
        this.text = str;
        this.selection = selection;
        this.positiveIcon = positiveIcon;
        this.negativeIcon = negativeIcon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C33183h getNegativeIcon() {
        return this.negativeIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C33183h getPositiveIcon() {
        return this.positiveIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC33177f getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33180g)) {
            return false;
        }
        C33180g c33180g = (C33180g) other;
        return AbstractC22676k.m65745e(this.text, c33180g.text) && this.selection == c33180g.selection && AbstractC22676k.m65745e(this.positiveIcon, c33180g.positiveIcon) && AbstractC22676k.m65745e(this.negativeIcon, c33180g.negativeIcon);
    }

    public int hashCode() {
        String str = this.text;
        return this.negativeIcon.hashCode() + ((this.positiveIcon.hashCode() + ((this.selection.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BinaryFeedbackState(text=" + this.text + ", selection=" + this.selection + ", positiveIcon=" + this.positiveIcon + ", negativeIcon=" + this.negativeIcon + ")";
    }
}
