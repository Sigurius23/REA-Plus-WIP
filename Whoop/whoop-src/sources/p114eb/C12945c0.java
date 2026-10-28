package p114eb;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: eb.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12945c0 implements Comparable {

    /* JADX INFO: renamed from: w */
    public final String f44720w;

    /* JADX INFO: renamed from: x */
    public final String f44721x;

    public C12945c0(String mimeType) {
        List listM118958J;
        List listM74156w1;
        AbstractC22676k.m65750j(mimeType, "mimeType");
        Pattern patternCompile = Pattern.compile("/");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC39414r.m125903v0(0);
        Matcher matcher = patternCompile.matcher(mimeType);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(mimeType.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(mimeType.subSequence(iEnd, mimeType.length()).toString());
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(mimeType.toString());
        }
        if (listM118958J.isEmpty()) {
            listM74156w1 = C25271y.f99162w;
        } else {
            ListIterator listIterator = listM118958J.listIterator(listM118958J.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listM74156w1 = AbstractC25265s.m74156w1(listM118958J, listIterator.nextIndex() + 1);
                }
            }
            listM74156w1 = C25271y.f99162w;
        }
        this.f44720w = (String) listM74156w1.get(0);
        this.f44721x = (String) listM74156w1.get(1);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C12945c0 other) {
        AbstractC22676k.m65750j(other, "other");
        int i13 = AbstractC22676k.m65745e(this.f44720w, other.f44720w) ? 2 : 0;
        return AbstractC22676k.m65745e(this.f44721x, other.f44721x) ? i13 + 1 : i13;
    }

    /* JADX INFO: renamed from: b */
    public final String m36420b() {
        return this.f44721x;
    }

    /* JADX INFO: renamed from: c */
    public final String m36421c() {
        return this.f44720w;
    }
}
