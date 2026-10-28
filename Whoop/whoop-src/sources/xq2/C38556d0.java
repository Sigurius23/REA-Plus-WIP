package xq2;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xq2.d0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lxq2/d0;", "", "", "text", "", "isValid", "Lkotlin/Function1;", "Ll83/a0;", "onTextChange", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38556d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isValid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 onTextChange;

    public C38556d0(String text, boolean z4, Function1 onTextChange) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(onTextChange, "onTextChange");
        this.text = text;
        this.isValid = z4;
        this.onTextChange = onTextChange;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Function1 getOnTextChange() {
        return this.onTextChange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38556d0)) {
            return false;
        }
        C38556d0 c38556d0 = (C38556d0) other;
        return AbstractC22676k.m65745e(this.text, c38556d0.text) && this.isValid == c38556d0.isValid && AbstractC22676k.m65745e(this.onTextChange, c38556d0.onTextChange);
    }

    public int hashCode() {
        return this.onTextChange.hashCode() + AbstractC2875y.m8289b(this.text.hashCode() * 31, 31, this.isValid);
    }

    public String toString() {
        String str = this.text;
        boolean z4 = this.isValid;
        Function1 function1 = this.onTextChange;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("TimeCapsuleStateHolder(text=", str, ", isValid=", ", onTextChange=", z4);
        sbM73379l.append(function1);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
