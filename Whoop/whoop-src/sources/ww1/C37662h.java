package ww1;

import androidx.core.app.NotificationCompat;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import uw1.C35310c;

/* JADX INFO: renamed from: ww1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lww1/h;", "", "Lww1/a;", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "Luw1/c$c;", "hubScreenContent", "<init>", "(Ljava/lang/Object;Lm91/u;Luw1/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Lm91/u;", "()Lm91/u;", "c", "Luw1/c$c;", "()Luw1/c$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37662h implements InterfaceC37657c, InterfaceC37655a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u element;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35310c.c hubScreenContent;

    public C37662h(Object event, InterfaceC25312u element, C35310c.c cVar) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(element, "element");
        this.event = event;
        this.element = element;
        this.hubScreenContent = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25312u getElement() {
        return this.element;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C35310c.c getHubScreenContent() {
        return this.hubScreenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37662h)) {
            return false;
        }
        C37662h c37662h = (C37662h) other;
        return AbstractC22676k.m65745e(this.event, c37662h.event) && AbstractC22676k.m65745e(this.element, c37662h.element) && AbstractC22676k.m65745e(this.hubScreenContent, c37662h.hubScreenContent);
    }

    public int hashCode() {
        int iM30851c = AbstractC11478a.m30851c(this.element, this.event.hashCode() * 31, 31);
        C35310c.c cVar = this.hubScreenContent;
        return iM30851c + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "ItemClicked(event=" + this.event + ", element=" + this.element + ", hubScreenContent=" + this.hubScreenContent + ")";
    }

    public /* synthetic */ C37662h(Object obj, InterfaceC25312u interfaceC25312u, C35310c.c cVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, interfaceC25312u, (i13 & 4) != 0 ? null : cVar);
    }
}
