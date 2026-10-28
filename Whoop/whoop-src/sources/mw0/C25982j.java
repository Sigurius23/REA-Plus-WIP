package mw0;

import hw0.C17701f;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jw0.AbstractC21988f;
import l83.C23454a0;
import mm1.C25694h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mw0.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lmw0/j;", "", "Lhw0/f;", "horizontalHeartZoneBarGraphReducer", "Ljb1/a;", "reducer", "<init>", "(Lhw0/f;Ljb1/a;)V", "Ljw0/f;", "domainState", "Lmw0/i;", "c", "(Ljw0/f;)Lmw0/i;", "a", "Lhw0/f;", "b", "Ljb1/a;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25982j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17701f horizontalHeartZoneBarGraphReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21535a reducer;

    public C25982j(C17701f horizontalHeartZoneBarGraphReducer, C21535a reducer) {
        AbstractC22676k.m65750j(horizontalHeartZoneBarGraphReducer, "horizontalHeartZoneBarGraphReducer");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.horizontalHeartZoneBarGraphReducer = horizontalHeartZoneBarGraphReducer;
        this.reducer = reducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m77071b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC25981i m77072c(AbstractC21988f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof AbstractC21988f.a) {
            return AbstractC25983k.m77080h((AbstractC21988f.a) domainState);
        }
        if (domainState.equals(AbstractC21988f.c.f85178a)) {
            return AbstractC25981i.d.f102677a;
        }
        if (domainState instanceof AbstractC21988f.d) {
            return AbstractC25983k.m77082j((AbstractC21988f.d) domainState, this.horizontalHeartZoneBarGraphReducer, this.reducer);
        }
        if (domainState instanceof AbstractC21988f.b) {
            return AbstractC25983k.m77081i((AbstractC21988f.b) domainState, this.horizontalHeartZoneBarGraphReducer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C25982j(C17701f c17701f, C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17701f, (i13 & 2) != 0 ? AbstractC21537c.m60554d(new C25694h(27)) : c21535a);
    }
}
