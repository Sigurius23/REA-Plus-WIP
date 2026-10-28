package p210i4;

import androidx.constraintlayout.core.parser.CLParsingException;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: i4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18060b extends AbstractC18061c {

    /* JADX INFO: renamed from: E */
    public ArrayList f70145E;

    public AbstractC18060b(char[] cArr) {
        super(cArr);
        this.f70145E = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public final ArrayList m51890A() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC18061c abstractC18061c : this.f70145E) {
            if (abstractC18061c instanceof C18062d) {
                arrayList.add(((C18062d) abstractC18061c).m51906c());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public final void m51891B(String str, AbstractC18061c abstractC18061c) {
        Iterator it = this.f70145E.iterator();
        while (it.hasNext()) {
            C18062d c18062d = (C18062d) ((AbstractC18061c) it.next());
            if (c18062d.m51906c().equals(str)) {
                if (c18062d.f70145E.size() > 0) {
                    c18062d.f70145E.set(0, abstractC18061c);
                    return;
                } else {
                    c18062d.f70145E.add(abstractC18061c);
                    return;
                }
            }
        }
        C18062d c18062d2 = new C18062d(str.toCharArray());
        c18062d2.f70147x = 0L;
        c18062d2.m51910g(str.length() - 1);
        if (c18062d2.f70145E.size() > 0) {
            c18062d2.f70145E.set(0, abstractC18061c);
        } else {
            c18062d2.f70145E.add(abstractC18061c);
        }
        this.f70145E.add(c18062d2);
    }

    @Override // p210i4.AbstractC18061c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC18060b) {
            return this.f70145E.equals(((AbstractC18060b) obj).f70145E);
        }
        return false;
    }

    @Override // p210i4.AbstractC18061c
    public int hashCode() {
        return Objects.hash(this.f70145E, Integer.valueOf(super.hashCode()));
    }

    /* JADX INFO: renamed from: j */
    public final void m51893j(AbstractC18061c abstractC18061c) {
        this.f70145E.add(abstractC18061c);
    }

    @Override // p210i4.AbstractC18061c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AbstractC18060b clone() {
        AbstractC18060b abstractC18060b = (AbstractC18060b) super.clone();
        ArrayList arrayList = new ArrayList(this.f70145E.size());
        Iterator it = this.f70145E.iterator();
        while (it.hasNext()) {
            AbstractC18061c abstractC18061cClone = ((AbstractC18061c) it.next()).clone();
            abstractC18061cClone.f70149z = abstractC18060b;
            arrayList.add(abstractC18061cClone);
        }
        abstractC18060b.f70145E = arrayList;
        return abstractC18060b;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC18061c m51895n(int i13) {
        if (i13 < 0 || i13 >= this.f70145E.size()) {
            throw new CLParsingException(AbstractC2875y.m8295h(i13, "no element at index "), this);
        }
        return (AbstractC18061c) this.f70145E.get(i13);
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC18061c m51896o(String str) {
        Iterator it = this.f70145E.iterator();
        while (it.hasNext()) {
            C18062d c18062d = (C18062d) ((AbstractC18061c) it.next());
            if (c18062d.m51906c().equals(str)) {
                if (c18062d.f70145E.size() > 0) {
                    return (AbstractC18061c) c18062d.f70145E.get(0);
                }
                return null;
            }
        }
        throw new CLParsingException(AbstractC11895b.m31996o("no element for key <", str, ">"), this);
    }

    /* JADX INFO: renamed from: p */
    public final float m51897p(int i13) {
        AbstractC18061c abstractC18061cM51895n = m51895n(i13);
        if (abstractC18061cM51895n != null) {
            return abstractC18061cM51895n.mo51907d();
        }
        throw new CLParsingException(AbstractC2875y.m8295h(i13, "no float at index "), this);
    }

    /* JADX INFO: renamed from: q */
    public final float m51898q(String str) {
        AbstractC18061c abstractC18061cM51896o = m51896o(str);
        if (abstractC18061cM51896o != null) {
            return abstractC18061cM51896o.mo51907d();
        }
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("no float found for key <", str, ">, found [");
        sbM53375p.append(abstractC18061cM51896o.m51909f());
        sbM53375p.append("] : ");
        sbM53375p.append(abstractC18061cM51896o);
        throw new CLParsingException(sbM53375p.toString(), this);
    }

    /* JADX INFO: renamed from: r */
    public final int m51899r(int i13) throws CLParsingException {
        AbstractC18061c abstractC18061cM51895n = m51895n(i13);
        if (abstractC18061cM51895n != null) {
            return abstractC18061cM51895n.mo51908e();
        }
        throw new CLParsingException(AbstractC2875y.m8295h(i13, "no int at index "), this);
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC18061c m51900t(int i13) {
        if (i13 < 0 || i13 >= this.f70145E.size()) {
            return null;
        }
        return (AbstractC18061c) this.f70145E.get(i13);
    }

    @Override // p210i4.AbstractC18061c
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        for (AbstractC18061c abstractC18061c : this.f70145E) {
            if (sb4.length() > 0) {
                sb4.append("; ");
            }
            sb4.append(abstractC18061c);
        }
        return super.toString() + " = <" + ((Object) sb4) + " >";
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC18061c m51901u(String str) {
        Iterator it = this.f70145E.iterator();
        while (it.hasNext()) {
            C18062d c18062d = (C18062d) ((AbstractC18061c) it.next());
            if (c18062d.m51906c().equals(str)) {
                if (c18062d.f70145E.size() <= 0) {
                    break;
                }
                return (AbstractC18061c) c18062d.f70145E.get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final String m51902v(int i13) {
        AbstractC18061c abstractC18061cM51895n = m51895n(i13);
        if (abstractC18061cM51895n instanceof C18066h) {
            return abstractC18061cM51895n.m51906c();
        }
        throw new CLParsingException(AbstractC2875y.m8295h(i13, "no string at index "), this);
    }

    /* JADX INFO: renamed from: w */
    public final String m51903w(String str) {
        AbstractC18061c abstractC18061cM51896o = m51896o(str);
        if (abstractC18061cM51896o instanceof C18066h) {
            return abstractC18061cM51896o.m51906c();
        }
        StringBuilder sbM32001t = AbstractC11895b.m32001t("no string found for key <", str, ">, found [", abstractC18061cM51896o != null ? abstractC18061cM51896o.m51909f() : null, "] : ");
        sbM32001t.append(abstractC18061cM51896o);
        throw new CLParsingException(sbM32001t.toString(), this);
    }

    /* JADX INFO: renamed from: y */
    public final String m51904y(String str) {
        AbstractC18061c abstractC18061cM51901u = m51901u(str);
        if (abstractC18061cM51901u instanceof C18066h) {
            return abstractC18061cM51901u.m51906c();
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m51905z(String str) {
        for (AbstractC18061c abstractC18061c : this.f70145E) {
            if ((abstractC18061c instanceof C18062d) && ((C18062d) abstractC18061c).m51906c().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
