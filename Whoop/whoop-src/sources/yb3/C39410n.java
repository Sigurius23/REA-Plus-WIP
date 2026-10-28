package yb3;

import e93.AbstractC12889b;
import i93.C18284j;
import java.util.List;
import java.util.regex.Matcher;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: yb3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C39410n implements InterfaceC39407k {

    /* JADX INFO: renamed from: a */
    public final Matcher f169583a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f169584b;

    /* JADX INFO: renamed from: c */
    public final C39409m f169585c;

    /* JADX INFO: renamed from: d */
    public C39408l f169586d;

    public C39410n(Matcher matcher, CharSequence input) {
        AbstractC22676k.m65750j(input, "input");
        this.f169583a = matcher;
        this.f169584b = input;
        this.f169585c = new C39409m(this);
    }

    /* JADX INFO: renamed from: a */
    public final List m125843a() {
        if (this.f169586d == null) {
            this.f169586d = new C39408l(this);
        }
        C39408l c39408l = this.f169586d;
        AbstractC22676k.m65747g(c39408l);
        return c39408l;
    }

    /* JADX INFO: renamed from: b */
    public final C18284j m125844b() {
        Matcher matcher = this.f169583a;
        return AbstractC12889b.m36278i0(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: c */
    public final String m125845c() {
        String strGroup = this.f169583a.group();
        AbstractC22676k.m65749i(strGroup, "group(...)");
        return strGroup;
    }

    /* JADX INFO: renamed from: d */
    public final C39410n m125846d() {
        Matcher matcher = this.f169583a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f169584b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC22676k.m65749i(matcher2, "matcher(...)");
        return AbstractC35849g.m113800b(matcher2, iEnd, charSequence);
    }
}
