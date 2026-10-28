package ao1;

import ad3.AbstractC0757c;
import bq1.AbstractC3551c;
import c93.InterfaceC4339a;
import jb1.InterfaceC21538d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;

/* JADX INFO: renamed from: ao1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lao1/a;", "Ljb1/d;", "Lad3/c;", "json", "Lkotlin/Function0;", "Lmo1/d;", "trackedBehaviorReducer", "<init>", "(Lad3/c;Lc93/a;)V", "Llb1/y0;", "a", "()Llb1/y0;", "Lad3/c;", "b", "Lc93/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C1866a implements InterfaceC21538d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a trackedBehaviorReducer;

    public C1866a(AbstractC0757c json, InterfaceC4339a trackedBehaviorReducer) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(trackedBehaviorReducer, "trackedBehaviorReducer");
        this.json = json;
        this.trackedBehaviorReducer = trackedBehaviorReducer;
    }

    @Override // jb1.InterfaceC21538d
    /* JADX INFO: renamed from: a */
    public C23743y0 mo1796a() {
        return AbstractC3551c.m10597e(this.json, this.trackedBehaviorReducer).getModelMapper();
    }
}
