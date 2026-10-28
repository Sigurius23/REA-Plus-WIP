package zq2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: zq2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzq2/p;", "", "Lcom/whoop/design/util/TextResource;", "text", "Ly81/e;", "textColor", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "()Ly81/e;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41003p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    public C41003p(TextResource text, InterfaceC39332e textColor) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(textColor, "textColor");
        this.text = text;
        this.textColor = textColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41003p)) {
            return false;
        }
        C41003p c41003p = (C41003p) other;
        return AbstractC22676k.m65745e(this.text, c41003p.text) && AbstractC22676k.m65745e(this.textColor, c41003p.textColor);
    }

    public int hashCode() {
        return this.textColor.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "WhoopCoachResponseState(text=" + this.text + ", textColor=" + this.textColor + ")";
    }
}
