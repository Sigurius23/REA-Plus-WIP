package xq2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ny0.C27256h;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: xq2.c0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, m65681d2 = {"Lxq2/c0;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "header", "title", "textPrompt", "Lny0/h;", "button", "", "submittedText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Ljava/lang/String;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/h;Ljava/lang/String;)Lxq2/c0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "g", "d", "Lny0/h;", "()Lny0/h;", "Ljava/lang/String;", "f", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38553c0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f165893f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource textPrompt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27256h button;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String submittedText;

    static {
        int i13 = C27256h.f109055z;
        int i14 = TextResource.$stable;
        f165893f = i13 | i14 | i14 | i14;
    }

    public C38553c0(TextResource header, TextResource title, TextResource textPrompt, C27256h c27256h, String str) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(textPrompt, "textPrompt");
        this.header = header;
        this.title = title;
        this.textPrompt = textPrompt;
        this.button = c27256h;
        this.submittedText = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38553c0 m123540b(C38553c0 c38553c0, TextResource textResource, TextResource textResource2, TextResource textResource3, C27256h c27256h, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c38553c0.header;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c38553c0.title;
        }
        if ((i13 & 4) != 0) {
            textResource3 = c38553c0.textPrompt;
        }
        if ((i13 & 8) != 0) {
            c27256h = c38553c0.button;
        }
        if ((i13 & 16) != 0) {
            str = c38553c0.submittedText;
        }
        String str2 = str;
        TextResource textResource4 = textResource3;
        return c38553c0.m123541a(textResource, textResource2, textResource4, c27256h, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C38553c0 m123541a(TextResource header, TextResource title, TextResource textPrompt, C27256h button, String submittedText) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(textPrompt, "textPrompt");
        return new C38553c0(header, title, textPrompt, button, submittedText);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C27256h getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38553c0)) {
            return false;
        }
        C38553c0 c38553c0 = (C38553c0) other;
        return AbstractC22676k.m65745e(this.header, c38553c0.header) && AbstractC22676k.m65745e(this.title, c38553c0.title) && AbstractC22676k.m65745e(this.textPrompt, c38553c0.textPrompt) && AbstractC22676k.m65745e(this.button, c38553c0.button) && AbstractC22676k.m65745e(this.submittedText, c38553c0.submittedText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubmittedText() {
        return this.submittedText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTextPrompt() {
        return this.textPrompt;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.header.hashCode() * 31, this.title, 31), this.textPrompt, 31);
        C27256h c27256h = this.button;
        int iHashCode = (iM95625a + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        String str = this.submittedText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.header;
        TextResource textResource2 = this.title;
        TextResource textResource3 = this.textPrompt;
        C27256h c27256h = this.button;
        String str = this.submittedText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TimeCapsuleState(header=", textResource, ", title=", textResource2, ", textPrompt=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", button=");
        sbM106658q.append(c27256h);
        sbM106658q.append(", submittedText=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }
}
