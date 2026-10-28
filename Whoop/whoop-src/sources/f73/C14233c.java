package f73;

import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0843s;
import af3.C0847w;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: f73.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C14233c extends AbstractC36259c {

    /* JADX INFO: renamed from: w */
    public static final Pattern f51995w = Pattern.compile("^\\[([xX\\s])]\\s+(.*)");

    @Override // p558vp.AbstractC36259c, af3.InterfaceC0827c0
    /* JADX INFO: renamed from: B */
    public final void mo2031B(C0843s c0843s) {
        AbstractC0844t abstractC0844t = c0843s.f3039b;
        if (abstractC0844t instanceof C0847w) {
            AbstractC0844t abstractC0844t2 = abstractC0844t.f3039b;
            if (abstractC0844t2 instanceof C0823a0) {
                Matcher matcher = f51995w.matcher(((C0823a0) abstractC0844t2).f3019g);
                if (matcher.matches()) {
                    boolean z4 = true;
                    String strGroup = matcher.group(1);
                    if (!"x".equals(strGroup) && !"X".equals(strGroup)) {
                        z4 = false;
                    }
                    C14232b c14232b = new C14232b(z4);
                    C0847w c0847w = new C0847w();
                    c14232b.m2059j();
                    AbstractC0844t abstractC0844t3 = c0843s.f3041d;
                    c14232b.f3041d = abstractC0844t3;
                    if (abstractC0844t3 != null) {
                        abstractC0844t3.f3042e = c14232b;
                    }
                    c14232b.f3042e = c0843s;
                    c0843s.f3041d = c14232b;
                    AbstractC0844t abstractC0844t4 = c0843s.f3038a;
                    c14232b.f3038a = abstractC0844t4;
                    if (c14232b.f3041d == null) {
                        abstractC0844t4.f3039b = c14232b;
                    }
                    String strGroup2 = matcher.group(2);
                    if (!TextUtils.isEmpty(strGroup2)) {
                        c0847w.m2055c(new C0823a0(strGroup2));
                    }
                    AbstractC0844t abstractC0844t5 = abstractC0844t2.f3042e;
                    while (abstractC0844t5 != null) {
                        AbstractC0844t abstractC0844t6 = abstractC0844t5.f3042e;
                        c0847w.m2055c(abstractC0844t5);
                        abstractC0844t5 = abstractC0844t6;
                    }
                    c14232b.m2055c(c0847w);
                    AbstractC0844t abstractC0844t7 = abstractC0844t.f3042e;
                    while (abstractC0844t7 != null) {
                        AbstractC0844t abstractC0844t8 = abstractC0844t7.f3042e;
                        c14232b.m2055c(abstractC0844t7);
                        abstractC0844t7 = abstractC0844t8;
                    }
                    c0843s.m2059j();
                    m115715r0(c14232b);
                    return;
                }
            }
        }
        m115715r0(c0843s);
    }
}
