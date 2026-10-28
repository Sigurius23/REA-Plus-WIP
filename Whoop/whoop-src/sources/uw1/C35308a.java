package uw1;

import com.whoop.design.util.TextResource;
import hy0.C17736e;
import ih0.AbstractC18489d0;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: uw1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Luw1/a;", "Lm91/u;", "Lny0/h;", "topButton", "Lhy0/e;", "divider", "bottomButton", "Lcom/whoop/design/util/TextResource;", "disclaimer", "", "disabled", "<init>", "(Lny0/h;Lhy0/e;Lny0/h;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lny0/h;", "e", "()Lny0/h;", "b", "Lhy0/e;", "c", "()Lhy0/e;", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "Z", "getDisabled", "()Z", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35308a implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f150392f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27256h topButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17736e divider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27256h bottomButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource disclaimer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean disabled;

    static {
        int i13 = TextResource.$stable;
        int i14 = C27256h.f109055z;
        f150392f = i13 | i14 | C17736e.f68939d | i14;
    }

    public C35308a(C27256h topButton, C17736e divider, C27256h bottomButton, TextResource disclaimer, boolean z4) {
        AbstractC22676k.m65750j(topButton, "topButton");
        AbstractC22676k.m65750j(divider, "divider");
        AbstractC22676k.m65750j(bottomButton, "bottomButton");
        AbstractC22676k.m65750j(disclaimer, "disclaimer");
        this.topButton = topButton;
        this.divider = divider;
        this.bottomButton = bottomButton;
        this.disclaimer = disclaimer;
        this.disabled = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getBottomButton() {
        return this.bottomButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17736e getDivider() {
        return this.divider;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27256h getTopButton() {
        return this.topButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35308a)) {
            return false;
        }
        C35308a c35308a = (C35308a) other;
        return AbstractC22676k.m65745e(this.topButton, c35308a.topButton) && AbstractC22676k.m65745e(this.divider, c35308a.divider) && AbstractC22676k.m65745e(this.bottomButton, c35308a.bottomButton) && AbstractC22676k.m65745e(this.disclaimer, c35308a.disclaimer) && this.disabled == c35308a.disabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disabled) + AbstractC31061c.m95625a((this.bottomButton.hashCode() + ((this.divider.hashCode() + (this.topButton.hashCode() * 31)) * 31)) * 31, this.disclaimer, 31);
    }

    public String toString() {
        C27256h c27256h = this.topButton;
        C17736e c17736e = this.divider;
        C27256h c27256h2 = this.bottomButton;
        TextResource textResource = this.disclaimer;
        boolean z4 = this.disabled;
        StringBuilder sb4 = new StringBuilder("DividedCardButtonsState(topButton=");
        sb4.append(c27256h);
        sb4.append(", divider=");
        sb4.append(c17736e);
        sb4.append(", bottomButton=");
        sb4.append(c27256h2);
        sb4.append(", disclaimer=");
        sb4.append(textResource);
        sb4.append(", disabled=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C35308a(C27256h c27256h, C17736e c17736e, C27256h c27256h2, TextResource textResource, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27256h, c17736e, c27256h2, textResource, (i13 & 16) != 0 ? false : z4);
    }
}
