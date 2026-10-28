package qx1;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qx1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lqx1/a;", "", "", "title", "Lgz0/m0;", "icon", "analyticsLabel", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lgz0/m0;", "getIcon", "()Lgz0/m0;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30754a {

    /* JADX INFO: renamed from: e */
    public static final int f126614e = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String analyticsLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    public C30754a(String title, EnumC16313m0 icon, String analyticsLabel, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(analyticsLabel, "analyticsLabel");
        AbstractC22676k.m65750j(destination, "destination");
        this.title = title;
        this.icon = icon;
        this.analyticsLabel = analyticsLabel;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30754a)) {
            return false;
        }
        C30754a c30754a = (C30754a) other;
        return AbstractC22676k.m65745e(this.title, c30754a.title) && this.icon == c30754a.icon && AbstractC22676k.m65745e(this.analyticsLabel, c30754a.analyticsLabel) && AbstractC22676k.m65745e(this.destination, c30754a.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + AbstractC11266d.m30450d(AbstractC17176i.m48500b(this.icon, this.title.hashCode() * 31, 31), 31, this.analyticsLabel);
    }

    public String toString() {
        String str = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        return AbstractC13673n.m38563j(AbstractC21702c.m61141l("HowItWorksCta(title=", str, ", icon=", enumC16313m0, ", analyticsLabel="), this.analyticsLabel, ", destination=", this.destination, ")");
    }
}
