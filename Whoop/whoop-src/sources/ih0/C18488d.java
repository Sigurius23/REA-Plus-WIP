package ih0;

import java.util.Map;
import java.util.Set;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ih0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lih0/d;", "", "", "", "selectedOptionIds", "freeText", "", "optionTexts", "<init>", "(Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "b", "Ljava/lang/String;", "Ljava/util/Map;", "()Ljava/util/Map;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18488d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<String> selectedOptionIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String freeText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> optionTexts;

    public C18488d(Set<String> selectedOptionIds, String freeText, Map<String, String> optionTexts) {
        AbstractC22676k.m65750j(selectedOptionIds, "selectedOptionIds");
        AbstractC22676k.m65750j(freeText, "freeText");
        AbstractC22676k.m65750j(optionTexts, "optionTexts");
        this.selectedOptionIds = selectedOptionIds;
        this.freeText = freeText;
        this.optionTexts = optionTexts;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFreeText() {
        return this.freeText;
    }

    /* JADX INFO: renamed from: b */
    public final Map<String, String> m53353b() {
        return this.optionTexts;
    }

    /* JADX INFO: renamed from: c */
    public final Set<String> m53354c() {
        return this.selectedOptionIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18488d)) {
            return false;
        }
        C18488d c18488d = (C18488d) other;
        return AbstractC22676k.m65745e(this.selectedOptionIds, c18488d.selectedOptionIds) && AbstractC22676k.m65745e(this.freeText, c18488d.freeText) && AbstractC22676k.m65745e(this.optionTexts, c18488d.optionTexts);
    }

    public int hashCode() {
        return this.optionTexts.hashCode() + AbstractC11266d.m30450d(this.selectedOptionIds.hashCode() * 31, 31, this.freeText);
    }

    public String toString() {
        Set<String> set = this.selectedOptionIds;
        String str = this.freeText;
        Map<String, String> map = this.optionTexts;
        StringBuilder sb4 = new StringBuilder("FormSubmission(selectedOptionIds=");
        sb4.append(set);
        sb4.append(", freeText=");
        sb4.append(str);
        sb4.append(", optionTexts=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }
}
