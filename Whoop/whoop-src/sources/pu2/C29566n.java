package pu2;

import com.whoop.design.util.TextResource;
import hu2.InterfaceC17654a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: pu2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lpu2/n;", "", "Lhu2/a$c0;", "clickEvent", "", "icon", "iconColor", "background", "Lcom/whoop/design/util/TextResource;", "contentDescription", "<init>", "(Lhu2/a$c0;IIILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhu2/a$c0;", "b", "()Lhu2/a$c0;", "I", "d", "c", "e", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29566n {

    /* JADX INFO: renamed from: f */
    public static final int f120618f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC17654a.c0 clickEvent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int iconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int background;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource contentDescription;

    public C29566n(InterfaceC17654a.c0 clickEvent, int i13, int i14, int i15, TextResource contentDescription) {
        AbstractC22676k.m65750j(clickEvent, "clickEvent");
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        this.clickEvent = clickEvent;
        this.icon = i13;
        this.iconColor = i14;
        this.background = i15;
        this.contentDescription = contentDescription;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC17654a.c0 getClickEvent() {
        return this.clickEvent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIconColor() {
        return this.iconColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29566n)) {
            return false;
        }
        C29566n c29566n = (C29566n) other;
        return AbstractC22676k.m65745e(this.clickEvent, c29566n.clickEvent) && this.icon == c29566n.icon && this.iconColor == c29566n.iconColor && this.background == c29566n.background && AbstractC22676k.m65745e(this.contentDescription, c29566n.contentDescription);
    }

    public int hashCode() {
        return this.contentDescription.hashCode() + AbstractC11266d.m30448b(this.background, AbstractC11266d.m30448b(this.iconColor, AbstractC11266d.m30448b(this.icon, this.clickEvent.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        InterfaceC17654a.c0 c0Var = this.clickEvent;
        int i13 = this.icon;
        int i14 = this.iconColor;
        int i15 = this.background;
        TextResource textResource = this.contentDescription;
        StringBuilder sb4 = new StringBuilder("NotificationActionButtonState(clickEvent=");
        sb4.append(c0Var);
        sb4.append(", icon=");
        sb4.append(i13);
        sb4.append(", iconColor=");
        AbstractC30802r.m94773v(sb4, i14, ", background=", i15, ", contentDescription=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }
}
