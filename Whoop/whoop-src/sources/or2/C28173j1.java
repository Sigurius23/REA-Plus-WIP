package or2;

import i93.C18284j;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.C38173h;
import yb3.C39410n;
import yb3.C39412p;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: or2.j1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0018"}, m65681d2 = {"Lor2/j1;", "", "<init>", "()V", "", "text", "Lyb3/p;", "regex", "", "Li93/j;", "a", "(Ljava/lang/CharSequence;Lyb3/p;)Ljava/util/List;", "b", "Lyb3/p;", "()Lyb3/p;", "doubleAsteriskRegex", "c", "getParenthesisRegex", "parenthesisRegex", "d", "getBracketsRegex", "bracketsRegex", "e", "whitespaceRegex", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28173j1 {

    /* JADX INFO: renamed from: a */
    public static final C28173j1 f113890a = new C28173j1();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C39412p doubleAsteriskRegex = new C39412p("\\*{2}(.*?)\\*{2}");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C39412p parenthesisRegex = new C39412p("\\((.*?)\\)");

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C39412p bracketsRegex = new C39412p("\\[(.*?)]");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C39412p whitespaceRegex = new C39412p("\\s");

    private C28173j1() {
    }

    /* JADX INFO: renamed from: a */
    public final List<C18284j> m85283a(CharSequence text, C39412p regex) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(regex, "regex");
        ArrayList arrayList = new ArrayList();
        C38173h c38173h = new C38173h(C39412p.m125847b(text, regex));
        while (c38173h.hasNext()) {
            arrayList.add(((C39410n) ((InterfaceC39407k) c38173h.next())).m125844b());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final C39412p m85284b() {
        return doubleAsteriskRegex;
    }

    /* JADX INFO: renamed from: c */
    public final C39412p m85285c() {
        return whitespaceRegex;
    }
}
