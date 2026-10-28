package gv2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: gv2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lgv2/e;", "", "", "ctaEnabled", "Lgv2/a;", "ctaEvent", "Lcom/whoop/design/util/TextResource;", "text", "<init>", "(ZLgv2/a;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lgv2/a;", "()Lgv2/a;", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16247e {

    /* JADX INFO: renamed from: d */
    public static final int f61756d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean ctaEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC16243a ctaEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource text;

    public C16247e(boolean z4, InterfaceC16243a ctaEvent, TextResource text) {
        AbstractC22676k.m65750j(ctaEvent, "ctaEvent");
        AbstractC22676k.m65750j(text, "text");
        this.ctaEnabled = z4;
        this.ctaEvent = ctaEvent;
        this.text = text;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCtaEnabled() {
        return this.ctaEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC16243a getCtaEvent() {
        return this.ctaEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16247e)) {
            return false;
        }
        C16247e c16247e = (C16247e) other;
        return this.ctaEnabled == c16247e.ctaEnabled && AbstractC22676k.m65745e(this.ctaEvent, c16247e.ctaEvent) && AbstractC22676k.m65745e(this.text, c16247e.text);
    }

    public int hashCode() {
        return this.text.hashCode() + ((this.ctaEvent.hashCode() + (Boolean.hashCode(this.ctaEnabled) * 31)) * 31);
    }

    public String toString() {
        boolean z4 = this.ctaEnabled;
        InterfaceC16243a interfaceC16243a = this.ctaEvent;
        TextResource textResource = this.text;
        StringBuilder sb4 = new StringBuilder("ScreenCta(ctaEnabled=");
        sb4.append(z4);
        sb4.append(", ctaEvent=");
        sb4.append(interfaceC16243a);
        sb4.append(", text=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }

    public /* synthetic */ C16247e(boolean z4, InterfaceC16243a interfaceC16243a, TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? InterfaceC16243a.k.f61712a : interfaceC16243a, textResource);
    }
}
