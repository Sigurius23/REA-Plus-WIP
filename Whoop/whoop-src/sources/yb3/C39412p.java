package yb3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.AbstractC11266d;
import p249jc.C21567b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35849g;
import wb3.AbstractC37056f;
import wr0.C37550r;
import x83.C38091h;

/* JADX INFO: renamed from: yb3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C39412p implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Pattern f169588w;

    public C39412p(String pattern) {
        AbstractC22676k.m65750j(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        this.f169588w = patternCompile;
    }

    /* JADX INFO: renamed from: b */
    public static C38091h m125847b(CharSequence input, C39412p c39412p) {
        c39412p.getClass();
        AbstractC22676k.m65750j(input, "input");
        if (input.length() >= 0) {
            return new C38091h(new C37550r(19, c39412p, input), C39411o.f169587w);
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(0, "Start index out of bounds: ", ", input length: ");
        sbM30466t.append(input.length());
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: a */
    public final C39410n m125848a(CharSequence input) {
        AbstractC22676k.m65750j(input, "input");
        Matcher matcher = this.f169588w.matcher(input);
        AbstractC22676k.m65749i(matcher, "matcher(...)");
        return AbstractC35849g.m113800b(matcher, 0, input);
    }

    /* JADX INFO: renamed from: c */
    public final C39410n m125849c(int i13, String input) {
        AbstractC22676k.m65750j(input, "input");
        Matcher matcherRegion = this.f169588w.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i13, input.length());
        if (matcherRegion.lookingAt()) {
            return new C39410n(matcherRegion, input);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final C39410n m125850d(CharSequence input) {
        AbstractC22676k.m65750j(input, "input");
        Matcher matcher = this.f169588w.matcher(input);
        AbstractC22676k.m65749i(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new C39410n(matcher, input);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m125851e(CharSequence input) {
        AbstractC22676k.m65750j(input, "input");
        return this.f169588w.matcher(input).matches();
    }

    /* JADX INFO: renamed from: f */
    public final String m125852f(String input, String str) {
        AbstractC22676k.m65750j(input, "input");
        String strReplaceAll = this.f169588w.matcher(input).replaceAll(str);
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: g */
    public final String m125853g(String input, Function1 transform) {
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(transform, "transform");
        C39410n c39410nM125848a = m125848a(input);
        if (c39410nM125848a == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb4 = new StringBuilder(length);
        int i13 = 0;
        do {
            sb4.append((CharSequence) input, i13, c39410nM125848a.m125844b().f71133w);
            sb4.append((CharSequence) transform.invoke(c39410nM125848a));
            i13 = c39410nM125848a.m125844b().f71134x + 1;
            c39410nM125848a = c39410nM125848a.m125846d();
            if (i13 >= length) {
                break;
            }
        } while (c39410nM125848a != null);
        if (i13 < length) {
            sb4.append((CharSequence) input, i13, length);
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: h */
    public final List m125854h(String input) {
        AbstractC22676k.m65750j(input, "input");
        int iEnd = 0;
        AbstractC39414r.m125903v0(0);
        Matcher matcher = this.f169588w.matcher(input);
        if (!matcher.find()) {
            return AbstractC37056f.m118958J(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f169588w.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public C39412p(String str, int i13) {
        EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
        Pattern patternCompile = Pattern.compile(str, C21567b.m60604j(2));
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        this.f169588w = patternCompile;
    }

    public C39412p(String str, Set set) {
        Iterator it = set.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 |= ((EnumC39413q) ((InterfaceC39400d) it.next())).f169591w;
        }
        Pattern patternCompile = Pattern.compile(str, C21567b.m60604j(i13));
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        this.f169588w = patternCompile;
    }
}
