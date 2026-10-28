package ld0;

import a01.EnumC0093m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ld0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lld0/e;", "", "La01/m;", "type", "", "text", "<init>", "(La01/m;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La01/m;", "b", "()La01/m;", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23846e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC0093m type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    public C23846e(EnumC0093m type, String text) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(text, "text");
        this.type = type;
        this.text = text;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC0093m getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23846e)) {
            return false;
        }
        C23846e c23846e = (C23846e) other;
        return this.type == c23846e.type && AbstractC22676k.m65745e(this.text, c23846e.text);
    }

    public int hashCode() {
        return this.text.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "BiomarkerStatusViewState(type=" + this.type + ", text=" + this.text + ")";
    }
}
