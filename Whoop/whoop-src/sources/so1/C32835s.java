package so1;

import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import java.util.List;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: so1.s */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, m65681d2 = {"Lso1/s;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "titleIcon", "fabIcon", "", "Lso1/u;", "loggedDataStates", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "e", "()Lgz0/m0;", "d", "Ljava/util/List;", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32835s implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 titleIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 fabIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C32837u> loggedDataStates;

    public C32835s(TextResource title, EnumC16313m0 titleIcon, EnumC16313m0 fabIcon, List<C32837u> loggedDataStates) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleIcon, "titleIcon");
        AbstractC22676k.m65750j(fabIcon, "fabIcon");
        AbstractC22676k.m65750j(loggedDataStates, "loggedDataStates");
        this.title = title;
        this.titleIcon = titleIcon;
        this.fabIcon = fabIcon;
        this.loggedDataStates = loggedDataStates;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getFabIcon() {
        return this.fabIcon;
    }

    /* JADX INFO: renamed from: b */
    public final List<C32837u> m103046b() {
        return this.loggedDataStates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getTitleIcon() {
        return this.titleIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32835s)) {
            return false;
        }
        C32835s c32835s = (C32835s) other;
        return AbstractC22676k.m65745e(this.title, c32835s.title) && this.titleIcon == c32835s.titleIcon && this.fabIcon == c32835s.fabIcon && AbstractC22676k.m65745e(this.loggedDataStates, c32835s.loggedDataStates);
    }

    public int hashCode() {
        return this.loggedDataStates.hashCode() + AbstractC17176i.m48500b(this.fabIcon, AbstractC17176i.m48500b(this.titleIcon, this.title.hashCode() * 31, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.titleIcon;
        EnumC16313m0 enumC16313m1 = this.fabIcon;
        List<C32837u> list = this.loggedDataStates;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("LogPeriodDataViewState(title=", textResource, ", titleIcon=", enumC16313m0, ", fabIcon=");
        sbM61140k.append(enumC16313m1);
        sbM61140k.append(", loggedDataStates=");
        sbM61140k.append(list);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
