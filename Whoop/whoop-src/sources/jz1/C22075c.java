package jz1;

import androidx.core.app.NotificationCompat;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ljz1/c;", "", "Ljz1/c$a;", "sessionAction", "", "Ljz1/e;", "sections", "<init>", "(Ljz1/c$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljz1/c$a;", "b", "()Ljz1/c$a;", "Ljava/util/List;", "()Ljava/util/List;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22075c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a sessionAction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C22077e> sections;

    /* JADX INFO: renamed from: jz1.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ljz1/c$a;", "", "", "label", "Ljz1/a;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Ljz1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljz1/a;", "()Ljz1/a;", "motion-tracking-sandbox_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC22073a event;

        public a(String label, InterfaceC22073a event) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(event, "event");
            this.label = label;
            this.event = event;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC22073a getEvent() {
            return this.event;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.label, aVar.label) && AbstractC22676k.m65745e(this.event, aVar.event);
        }

        public int hashCode() {
            return this.event.hashCode() + (this.label.hashCode() * 31);
        }

        public String toString() {
            return "SessionAction(label=" + this.label + ", event=" + this.event + ")";
        }
    }

    public C22075c(a sessionAction, List<C22077e> sections) {
        AbstractC22676k.m65750j(sessionAction, "sessionAction");
        AbstractC22676k.m65750j(sections, "sections");
        this.sessionAction = sessionAction;
        this.sections = sections;
    }

    /* JADX INFO: renamed from: a */
    public final List<C22077e> m63150a() {
        return this.sections;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getSessionAction() {
        return this.sessionAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22075c)) {
            return false;
        }
        C22075c c22075c = (C22075c) other;
        return AbstractC22676k.m65745e(this.sessionAction, c22075c.sessionAction) && AbstractC22676k.m65745e(this.sections, c22075c.sections);
    }

    public int hashCode() {
        return this.sections.hashCode() + (this.sessionAction.hashCode() * 31);
    }

    public String toString() {
        return "MotionTrackingSandboxViewState(sessionAction=" + this.sessionAction + ", sections=" + this.sections + ")";
    }
}
