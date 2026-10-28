package zg0;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: zg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lzg0/a;", "", "", "fingerprint", "Lcom/whoop/design/util/TextResource;", "title", "Lkd1/o;", "icon", "source", "sourceId", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "Lkd1/o;", "()Lkd1/o;", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40618a {

    /* JADX INFO: renamed from: f */
    public static final int f175051f = AbstractC22403o.f87638a | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String sourceId;

    public C40618a(String fingerprint, TextResource title, AbstractC22403o abstractC22403o, String source, String str) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(source, "source");
        this.fingerprint = fingerprint;
        this.title = title;
        this.icon = abstractC22403o;
        this.source = source;
        this.sourceId = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40618a)) {
            return false;
        }
        C40618a c40618a = (C40618a) other;
        return AbstractC22676k.m65745e(this.fingerprint, c40618a.fingerprint) && AbstractC22676k.m65745e(this.title, c40618a.title) && AbstractC22676k.m65745e(this.icon, c40618a.icon) && AbstractC22676k.m65745e(this.source, c40618a.source) && AbstractC22676k.m65745e(this.sourceId, c40618a.sourceId);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.fingerprint.hashCode() * 31, this.title, 31);
        AbstractC22403o abstractC22403o = this.icon;
        int iM30450d = AbstractC11266d.m30450d((iM95625a + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.source);
        String str = this.sourceId;
        return iM30450d + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.fingerprint;
        TextResource textResource = this.title;
        AbstractC22403o abstractC22403o = this.icon;
        String str2 = this.source;
        String str3 = this.sourceId;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("AiChatHistoryItemViewState(fingerprint=", str, ", title=", textResource, ", icon=");
        sbM91847q.append(abstractC22403o);
        sbM91847q.append(", source=");
        sbM91847q.append(str2);
        sbM91847q.append(", sourceId=");
        return AbstractC25012a.m73376i(str3, ")", sbM91847q);
    }
}
