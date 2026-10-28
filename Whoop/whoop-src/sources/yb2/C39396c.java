package yb2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: yb2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lyb2/c;", "", "", "languageId", "languageTitleHardCoded", "Lcom/whoop/design/util/TextResource;", "languageTranslated", "", "initiallySelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)Lyb2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "e", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "Z", "()Z", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39396c {

    /* JADX INFO: renamed from: e */
    public static final int f169541e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String languageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String languageTitleHardCoded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource languageTranslated;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean initiallySelected;

    public C39396c(String languageId, String languageTitleHardCoded, TextResource languageTranslated, boolean z4) {
        AbstractC22676k.m65750j(languageId, "languageId");
        AbstractC22676k.m65750j(languageTitleHardCoded, "languageTitleHardCoded");
        AbstractC22676k.m65750j(languageTranslated, "languageTranslated");
        this.languageId = languageId;
        this.languageTitleHardCoded = languageTitleHardCoded;
        this.languageTranslated = languageTranslated;
        this.initiallySelected = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39396c m125829b(C39396c c39396c, String str, String str2, TextResource textResource, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c39396c.languageId;
        }
        if ((i13 & 2) != 0) {
            str2 = c39396c.languageTitleHardCoded;
        }
        if ((i13 & 4) != 0) {
            textResource = c39396c.languageTranslated;
        }
        if ((i13 & 8) != 0) {
            z4 = c39396c.initiallySelected;
        }
        return c39396c.m125830a(str, str2, textResource, z4);
    }

    /* JADX INFO: renamed from: a */
    public final C39396c m125830a(String languageId, String languageTitleHardCoded, TextResource languageTranslated, boolean initiallySelected) {
        AbstractC22676k.m65750j(languageId, "languageId");
        AbstractC22676k.m65750j(languageTitleHardCoded, "languageTitleHardCoded");
        AbstractC22676k.m65750j(languageTranslated, "languageTranslated");
        return new C39396c(languageId, languageTitleHardCoded, languageTranslated, initiallySelected);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getInitiallySelected() {
        return this.initiallySelected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLanguageId() {
        return this.languageId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLanguageTitleHardCoded() {
        return this.languageTitleHardCoded;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39396c)) {
            return false;
        }
        C39396c c39396c = (C39396c) other;
        return AbstractC22676k.m65745e(this.languageId, c39396c.languageId) && AbstractC22676k.m65745e(this.languageTitleHardCoded, c39396c.languageTitleHardCoded) && AbstractC22676k.m65745e(this.languageTranslated, c39396c.languageTranslated) && this.initiallySelected == c39396c.initiallySelected;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getLanguageTranslated() {
        return this.languageTranslated;
    }

    public int hashCode() {
        return Boolean.hashCode(this.initiallySelected) + AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.languageId.hashCode() * 31, 31, this.languageTitleHardCoded), this.languageTranslated, 31);
    }

    public String toString() {
        String str = this.languageId;
        String str2 = this.languageTitleHardCoded;
        TextResource textResource = this.languageTranslated;
        boolean z4 = this.initiallySelected;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LanguagePrefsItemDomainState(languageId=", str, ", languageTitleHardCoded=", str2, ", languageTranslated=");
        sbM32001t.append(textResource);
        sbM32001t.append(", initiallySelected=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C39396c(String str, String str2, TextResource textResource, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 8) != 0 ? false : z4);
    }
}
