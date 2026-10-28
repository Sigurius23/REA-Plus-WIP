package o53;

import com.squareup.wire.AbstractC5583n;
import g73.C15553a;
import jg3.C21682i;
import lg3.C24040b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: o53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C27590a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C27590a f111081a = new C27590a();

    /* JADX INFO: renamed from: b */
    public static final C24040b f111082b;

    static {
        C24040b ISO_OFFSET_DATE_TIME = C24040b.f95018h;
        AbstractC22676k.m65749i(ISO_OFFSET_DATE_TIME, "ISO_OFFSET_DATE_TIME");
        f111082b = ISO_OFFSET_DATE_TIME;
    }

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        String strDecodeString = interfaceC40541d.decodeString();
        C15553a c15553a = C21682i.f83261H;
        C24040b c24040b = f111082b;
        AbstractC5583n.m16762V(c24040b, "formatter");
        C21682i c21682i = (C21682i) c24040b.m70943b(strDecodeString, C21682i.f83261H);
        AbstractC22676k.m65749i(c21682i, "parse(...)");
        return c21682i;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21682i.class).getQualifiedName();
        AbstractC22676k.m65747g(qualifiedName);
        return AbstractC35952b.m114194b(qualifiedName, C39441e.f169698i);
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        C21682i value = (C21682i) obj;
        AbstractC22676k.m65750j(value, "value");
        C24040b c24040b = f111082b;
        AbstractC5583n.m16762V(c24040b, "formatter");
        String strM70942a = c24040b.m70942a(value);
        AbstractC22676k.m65749i(strM70942a, "format(...)");
        interfaceC40542e.encodeString(strM70942a);
    }
}
