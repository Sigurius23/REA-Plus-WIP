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

/* JADX INFO: renamed from: y00.d6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38810d6 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f167030c = Pattern.compile("^seti_[^_]+_secret_[^_]+$");

    /* JADX INFO: renamed from: a */
    public final String f167031a;

    /* JADX INFO: renamed from: b */
    public final String f167032b;

    public C38810d6(String value) {
        List listM118958J;
        Collection collectionM74156w1;
        AbstractC22676k.m65750j(value, "value");
        this.f167031a = value;
        Pattern patternCompile = Pattern.compile("_secret");
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
        this.f167032b = ((String[]) collectionM74156w1.toArray(new String[0]))[0];
        String value2 = this.f167031a;
        AbstractC22676k.m65750j(value2, "value");
        if (!f167030c.matcher(value2).matches()) {
            throw new IllegalArgumentException(AbstractC11266d.m30461o("Invalid Setup Intent client secret: ", this.f167031a).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38810d6) && AbstractC22676k.m65745e(this.f167031a, ((C38810d6) obj).f167031a);
    }

    public final int hashCode() {
        return this.f167031a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("ClientSecret(value=", this.f167031a, ")");
    }
}
