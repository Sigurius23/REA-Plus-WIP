package p664yy;

import java.util.List;
import l83.C23465k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yb3.C39412p;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: yy.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C39880t implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C39880t f172196a = new C39880t();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f172197b = AbstractC35952b.m114194b("MarkdownToHtml", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        List list = AbstractC39879s.f172195a;
        String string = interfaceC40541d.decodeString();
        AbstractC22676k.m65750j(string, "string");
        for (C23465k c23465k : AbstractC39879s.f172195a) {
            string = ((C39412p) c23465k.f92937w).m125853g(string, (Function1) c23465k.f92938x);
        }
        return string;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f172197b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        String value = (String) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value);
    }
}
