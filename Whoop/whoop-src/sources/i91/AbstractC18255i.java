package i91;

import androidx.compose.runtime.Composer;
import p088dc.AbstractC11895b;
import p390p1.C28655q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i91.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Li91/a;", "Li91/h;", "a", "(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18255i {
    /* JADX INFO: renamed from: a */
    public static final AbstractC18254h m52584a(AbstractC18247a abstractC18247a, Composer composer, int i13) {
        AbstractC22676k.m65750j(abstractC18247a, "<this>");
        if (abstractC18247a instanceof C18250d) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1972194019);
            C18251e c18251e = new C18251e(((C18250d) abstractC18247a).getBrush().mo60316a(c28655q, 0));
            c28655q.m87173q(false);
            return c18251e;
        }
        if (!(abstractC18247a instanceof C18252f)) {
            throw AbstractC11895b.m32003v(1972192858, (C28655q) composer, false);
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(1972196483);
        C18253g c18253g = new C18253g(((C18252f) abstractC18247a).getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), null);
        c28655q2.m87173q(false);
        return c18253g;
    }
}
