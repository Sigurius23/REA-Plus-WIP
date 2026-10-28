package nm2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wr2.InterfaceC37576d;
import yb3.AbstractC39414r;
import yb3.C39412p;

/* JADX INFO: renamed from: nm2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001a\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u0011\u0010!¨\u0006#"}, m65681d2 = {"Lnm2/e;", "Lwr2/d;", "", "featureName", "", "isEnabled", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Z", "f", "()Z", "c", "e", "userFacingText", "", "Ljava/util/List;", "()Ljava/util/List;", "userFacingKeywords", "Lyb3/p;", "Lyb3/p;", "()Lyb3/p;", "searchQueryDelimiter", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26849e implements InterfaceC37576d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String featureName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userFacingText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> userFacingKeywords;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C39412p searchQueryDelimiter;

    public C26849e(String featureName, boolean z4) {
        List<String> listM118958J;
        AbstractC22676k.m65750j(featureName, "featureName");
        this.featureName = featureName;
        this.isEnabled = z4;
        this.userFacingText = featureName;
        Pattern patternCompile = Pattern.compile("[-_]");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        int iEnd = 0;
        AbstractC39414r.m125903v0(0);
        Matcher matcher = patternCompile.matcher(featureName);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(featureName.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(featureName.subSequence(iEnd, featureName.length()).toString());
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(featureName.toString());
        }
        this.userFacingKeywords = listM118958J;
        this.searchQueryDelimiter = new C39412p("[\\s-_]");
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: a, reason: from getter */
    public C39412p getSearchQueryDelimiter() {
        return this.searchQueryDelimiter;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: b */
    public List<String> mo30154b() {
        return this.userFacingKeywords;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: c */
    public /* bridge */ Iterable<String> mo30155c() {
        return super.mo30155c();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFeatureName() {
        return this.featureName;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUserFacingText() {
        return this.userFacingText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26849e)) {
            return false;
        }
        C26849e c26849e = (C26849e) other;
        return AbstractC22676k.m65745e(this.featureName, c26849e.featureName) && this.isEnabled == c26849e.isEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEnabled) + (this.featureName.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79503g("FeatureFlagListItem(featureName=", this.featureName, ", isEnabled=", ")", this.isEnabled);
    }
}
