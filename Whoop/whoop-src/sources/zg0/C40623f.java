package zg0;

import com.whoop.design.util.AbstractC8693b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import nh3.AbstractC26725a;
import nl0.C26805g;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zg0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001a\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u0017\u0010$R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006("}, m65681d2 = {"Lzg0/f;", "", "", "fingerprint", "", "Lzg0/e;", "sections", "suggestions", "", "canStartNewConversation", "header", "Lnl0/g;", "betaTagViewState", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Lnl0/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "f", "d", "Z", "()Z", "getHeader", "Lnl0/g;", "()Lnl0/g;", "Lzg0/d;", "g", "items", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40623f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String fingerprint;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C40622e> sections;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> suggestions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean canStartNewConversation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String header;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C26805g betaTagViewState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C40621d> items;

    public C40623f(String fingerprint, List<C40622e> sections, List<String> suggestions, boolean z4, String str, C26805g betaTagViewState) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(suggestions, "suggestions");
        AbstractC22676k.m65750j(betaTagViewState, "betaTagViewState");
        this.fingerprint = fingerprint;
        this.sections = sections;
        this.suggestions = suggestions;
        this.canStartNewConversation = z4;
        this.header = str;
        this.betaTagViewState = betaTagViewState;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C40622e) it.next()).m131752c());
        }
        this.items = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C26805g getBetaTagViewState() {
        return this.betaTagViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanStartNewConversation() {
        return this.canStartNewConversation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: d */
    public final List<C40621d> m131760d() {
        return this.items;
    }

    /* JADX INFO: renamed from: e */
    public final List<C40622e> m131761e() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40623f)) {
            return false;
        }
        C40623f c40623f = (C40623f) other;
        return AbstractC22676k.m65745e(this.fingerprint, c40623f.fingerprint) && AbstractC22676k.m65745e(this.sections, c40623f.sections) && AbstractC22676k.m65745e(this.suggestions, c40623f.suggestions) && this.canStartNewConversation == c40623f.canStartNewConversation && AbstractC22676k.m65745e(this.header, c40623f.header) && AbstractC22676k.m65745e(this.betaTagViewState, c40623f.betaTagViewState);
    }

    /* JADX INFO: renamed from: f */
    public final List<String> m131762f() {
        return this.suggestions;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.fingerprint.hashCode() * 31, 31, this.sections), 31, this.suggestions), 31, this.canStartNewConversation);
        String str = this.header;
        return this.betaTagViewState.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.fingerprint;
        List<C40622e> list = this.sections;
        List<String> list2 = this.suggestions;
        boolean z4 = this.canStartNewConversation;
        String str2 = this.header;
        C26805g c26805g = this.betaTagViewState;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("AiChatTurnsViewState(fingerprint=", str, ", sections=", ", suggestions=", list);
        AbstractC26725a.m79512p(", canStartNewConversation=", ", header=", sbM94766o, list2, z4);
        sbM94766o.append(str2);
        sbM94766o.append(", betaTagViewState=");
        sbM94766o.append(c26805g);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C40623f(String str, List list, List list2, boolean z4, String str2, C26805g c26805g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        list = i14 != 0 ? c25271y : list;
        this(str, list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? C40622e.INSTANCE.m131756a(list) : z4, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? new C26805g(AbstractC8693b.m21267a(), null, null, 4, null) : c26805g);
    }
}
