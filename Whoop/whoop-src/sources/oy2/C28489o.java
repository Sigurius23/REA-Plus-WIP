package oy2;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oy2.o */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Loy2/o;", "", "", "title", "subtitle", "Loy2/p;", "timerState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Loy2/p;)V", "", "f", "()Z", "a", "(Ljava/lang/String;Ljava/lang/String;Loy2/p;)Loy2/o;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "c", "Loy2/p;", "d", "()Loy2/p;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28489o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC28490p timerState;

    public C28489o(String str, String str2, AbstractC28490p timerState) {
        AbstractC22676k.m65750j(timerState, "timerState");
        this.title = str;
        this.subtitle = str2;
        this.timerState = timerState;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C28489o m86778b(C28489o c28489o, String str, String str2, AbstractC28490p abstractC28490p, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c28489o.title;
        }
        if ((i13 & 2) != 0) {
            str2 = c28489o.subtitle;
        }
        if ((i13 & 4) != 0) {
            abstractC28490p = c28489o.timerState;
        }
        return c28489o.m86779a(str, str2, abstractC28490p);
    }

    /* JADX INFO: renamed from: a */
    public final C28489o m86779a(String title, String subtitle, AbstractC28490p timerState) {
        AbstractC22676k.m65750j(timerState, "timerState");
        return new C28489o(title, subtitle, timerState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC28490p getTimerState() {
        return this.timerState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28489o)) {
            return false;
        }
        C28489o c28489o = (C28489o) other;
        return AbstractC22676k.m65745e(this.title, c28489o.title) && AbstractC22676k.m65745e(this.subtitle, c28489o.subtitle) && AbstractC22676k.m65745e(this.timerState, c28489o.timerState);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m86783f() {
        if (this.timerState.getIsCountDown()) {
            Integer numMo86784a = this.timerState.getSeconds();
            if ((numMo86784a != null ? numMo86784a.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        return this.timerState.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        AbstractC28490p abstractC28490p = this.timerState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StepToolbarDomainState(title=", str, ", subtitle=", str2, ", timerState=");
        sbM32001t.append(abstractC28490p);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C28489o(String str, String str2, AbstractC28490p abstractC28490p, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? AbstractC28490p.b.f115367a : abstractC28490p);
    }
}
