package y00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y00.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38827f3 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f167085c = Pattern.compile("^pi_[^_]+_(scoped_)?secret_[^_]+$");

    /* JADX INFO: renamed from: a */
    public final String f167086a;

    /* JADX INFO: renamed from: b */
    public final String f167087b;

    public C38827f3(String value) {
        List listM118958J;
        Collection collectionM74156w1;
        AbstractC22676k.m65750j(value, "value");
        this.f167086a = value;
        Pattern patternCompile = Pattern.compile("_(scoped_)?secret");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC39414r.m125903v0(0);
        Matcher matcher = patternCompile.matcher(value);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(value.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(value.subSequence(iEnd, value.length()).toString());
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(value.toString());
        }
        if (!listM118958J.isEmpty()) {
            ListIterator listIterator = listM118958J.listIterator(listM118958J.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionM74156w1 = C25271y.f99162w;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    collectionM74156w1 = AbstractC25265s.m74156w1(listM118958J, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            collectionM74156w1 = C25271y.f99162w;
            break;
        }
        this.f167087b = ((String[]) collectionM74156w1.toArray(new String[0]))[0];
        String value2 = this.f167086a;
        AbstractC22676k.m65750j(value2, "value");
        if (!f167085c.matcher(value2).matches()) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Invalid Payment Intent client secret: ", this.f167086a).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38827f3) && AbstractC22676k.m65745e(this.f167086a, ((C38827f3) obj).f167086a);
    }

    public final int hashCode() {
        return this.f167086a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("ClientSecret(value=", this.f167086a, ")");
    }
}
