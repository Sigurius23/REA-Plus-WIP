package dj1;

import c41.C4092p2;
import cj1.AbstractC4756l;
import cj1.C4757m;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r21.C30885c;
import ri1.C31465n;
import ri1.InterfaceC31464m;

/* JADX INFO: renamed from: dj1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m65681d2 = {"Ldj1/d;", "", "<init>", "()V", "Lri1/n;", "domainState", "Lcj1/l;", "c", "(Lri1/n;)Lcj1/l;", "Lm91/u;", "item", "", "a", "(Lm91/u;)Z", "b", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12091d {
    /* JADX INFO: renamed from: a */
    public final boolean m33410a(InterfaceC25312u item) {
        AbstractC22676k.m65750j(item, "item");
        return (item instanceof C30885c) && ((C30885c) item).getHasCloseButton();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m33411b(InterfaceC25312u item) {
        AbstractC22676k.m65750j(item, "item");
        return (item instanceof C4092p2) && AbstractC22676k.m65745e(((C4092p2) item).getComponentDismissalId(), "CALIBRATING_INFO_CALLOUT");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX INFO: renamed from: c */
    public final AbstractC4756l m33412c(C31465n domainState) {
        C4757m c4757mM14990b;
        List<InterfaceC25312u> listM14995g;
        AbstractC22676k.m65750j(domainState, "domainState");
        InterfaceC31464m result = domainState.getResult();
        if (AbstractC22676k.m65745e(result, InterfaceC31464m.a.f129640a)) {
            return AbstractC4756l.a.f19605a;
        }
        if (!AbstractC22676k.m65745e(result, InterfaceC31464m.b.f129641a)) {
            throw new NoWhenBranchMatchedException();
        }
        ?? M14995g = 0;
        M14995g = 0;
        M14995g = 0;
        if (domainState.getHasClosedCalibration()) {
            C4757m viewState = domainState.getViewState();
            if (viewState != null && (listM14995g = viewState.m14995g()) != null) {
                M14995g = new ArrayList();
                for (Object obj : listM14995g) {
                    InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                    if (!m33410a(interfaceC25312u) && !m33411b(interfaceC25312u)) {
                        M14995g.add(obj);
                    }
                }
            }
        } else {
            C4757m viewState2 = domainState.getViewState();
            if (viewState2 != null) {
                M14995g = viewState2.m14995g();
            }
        }
        if (M14995g == 0) {
            M14995g = C25271y.f99162w;
        }
        ?? r10 = M14995g;
        C4757m viewState3 = domainState.getViewState();
        return (viewState3 == null || (c4757mM14990b = C4757m.m14990b(viewState3, false, r10, false, null, null, false, 61, null)) == null) ? AbstractC4756l.a.f19605a : new AbstractC4756l.b(c4757mM14990b);
    }
}
