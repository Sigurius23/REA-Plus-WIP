package hy0;

import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hy0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lhy0/a;", "", "Lcom/whoop/design/util/TextResource;", "buttonText", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "<init>", "(Lcom/whoop/design/util/TextResource;Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Lc93/a;", "()Lc93/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17720a {

    /* JADX INFO: renamed from: c */
    public static final int f68892c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource buttonText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a onClick;

    public C17720a(TextResource buttonText, InterfaceC4339a onClick) {
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.buttonText = buttonText;
        this.onClick = onClick;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC4339a getOnClick() {
        return this.onClick;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17720a)) {
            return false;
        }
        C17720a c17720a = (C17720a) other;
        return AbstractC22676k.m65745e(this.buttonText, c17720a.buttonText) && AbstractC22676k.m65745e(this.onClick, c17720a.onClick);
    }

    public int hashCode() {
        return this.onClick.hashCode() + (this.buttonText.hashCode() * 31);
    }

    public String toString() {
        return "CTAButton(buttonText=" + this.buttonText + ", onClick=" + this.onClick + ")";
    }
}
