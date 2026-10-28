package ol0;

import e31.C12611c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ol0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lol0/c;", "Lm91/u;", "Lol0/c$a;", "miniArchModal", "widget", "<init>", "(Lol0/c$a;Lm91/u;)V", "a", "(Lol0/c$a;Lm91/u;)Lol0/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lol0/c$a;", "c", "()Lol0/c$a;", "b", "Lm91/u;", "e", "()Lm91/u;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28013c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a miniArchModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25312u widget;

    public C28013c(a aVar, InterfaceC25312u interfaceC25312u) {
        this.miniArchModal = aVar;
        this.widget = interfaceC25312u;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28013c m84479b(C28013c c28013c, a aVar, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aVar = c28013c.miniArchModal;
        }
        if ((i13 & 2) != 0) {
            interfaceC25312u = c28013c.widget;
        }
        return c28013c.m84480a(aVar, interfaceC25312u);
    }

    /* JADX INFO: renamed from: a */
    public final C28013c m84480a(a miniArchModal, InterfaceC25312u widget) {
        return new C28013c(miniArchModal, widget);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getMiniArchModal() {
        return this.miniArchModal;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getWidget() {
        return this.widget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28013c)) {
            return false;
        }
        C28013c c28013c = (C28013c) other;
        return AbstractC22676k.m65745e(this.miniArchModal, c28013c.miniArchModal) && AbstractC22676k.m65745e(this.widget, c28013c.widget);
    }

    public int hashCode() {
        a aVar = this.miniArchModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        InterfaceC25312u interfaceC25312u = this.widget;
        return iHashCode + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    public String toString() {
        return "ChatMiniArchWidgetViewState(miniArchModal=" + this.miniArchModal + ", widget=" + this.widget + ")";
    }

    /* JADX INFO: renamed from: ol0.c$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lol0/c$a;", "", "Le31/c;", "state", "Lol0/a;", "secondaryClickEvent", "<init>", "(Le31/c;Lol0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le31/c;", "b", "()Le31/c;", "Lol0/a;", "()Lol0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: c */
        public static final int f112973c = C12611c.f43049g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C12611c state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC28011a secondaryClickEvent;

        public a(C12611c state, InterfaceC28011a interfaceC28011a) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.secondaryClickEvent = interfaceC28011a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC28011a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C12611c getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC28011a interfaceC28011a = this.secondaryClickEvent;
            return iHashCode + (interfaceC28011a == null ? 0 : interfaceC28011a.hashCode());
        }

        public String toString() {
            return "MiniArchModal(state=" + this.state + ", secondaryClickEvent=" + this.secondaryClickEvent + ")";
        }

        public /* synthetic */ a(C12611c c12611c, InterfaceC28011a interfaceC28011a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c12611c, (i13 & 2) != 0 ? null : interfaceC28011a);
        }
    }

    public /* synthetic */ C28013c(a aVar, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : interfaceC25312u);
    }
}
