package b31;

import com.whoop.design.util.TextResource;
import java.util.List;
import ny0.C27256h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: b31.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u0019\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006)"}, m65681d2 = {"Lb31/c;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "subtitleSupportsMarkdown", "", "Lm91/o;", "options", "Lny0/h;", "primaryButton", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLjava/util/List;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lny0/h;", "()Lny0/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2674c implements InterfaceC25312u {

    /* JADX INFO: renamed from: g */
    public static final int f10464g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean subtitleSupportsMarkdown;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C25306o> options;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27256h primaryButton;

    public C2674c(String str, TextResource textResource, TextResource textResource2, boolean z4, List<C25306o> options, C27256h primaryButton) {
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.id = str;
        this.title = textResource;
        this.subtitle = textResource2;
        this.subtitleSupportsMarkdown = z4;
        this.options = options;
        this.primaryButton = primaryButton;
    }

    /* JADX INFO: renamed from: a */
    public final List<C25306o> m7539a() {
        return this.options;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27256h getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSubtitleSupportsMarkdown() {
        return this.subtitleSupportsMarkdown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2674c)) {
            return false;
        }
        C2674c c2674c = (C2674c) other;
        return AbstractC22676k.m65745e(this.id, c2674c.id) && AbstractC22676k.m65745e(this.title, c2674c.title) && AbstractC22676k.m65745e(this.subtitle, c2674c.subtitle) && this.subtitleSupportsMarkdown == c2674c.subtitleSupportsMarkdown && AbstractC22676k.m65745e(this.options, c2674c.options) && AbstractC22676k.m65745e(this.primaryButton, c2674c.primaryButton);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.title;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.subtitle;
        return this.primaryButton.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, 31, this.subtitleSupportsMarkdown), 31, this.options);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        boolean z4 = this.subtitleSupportsMarkdown;
        List<C25306o> list = this.options;
        C27256h c27256h = this.primaryButton;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("OptionCommitPanelState(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC33745d.m106664w(textResource2, ", subtitleSupportsMarkdown=", ", options=", sbM91847q, z4);
        sbM91847q.append(list);
        sbM91847q.append(", primaryButton=");
        sbM91847q.append(c27256h);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public /* synthetic */ C2674c(String str, TextResource textResource, TextResource textResource2, boolean z4, List list, C27256h c27256h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, textResource2, (i13 & 8) != 0 ? false : z4, list, c27256h);
    }
}
