package p550vd;

import c93.InterfaceC4351m;
import java.util.LinkedHashSet;
import l83.C23454a0;
import m83.AbstractC25260n;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17243d;
import p194hg.InterfaceC17252m;
import p194hg.InterfaceC17253n;
import p219ig.C18458c;
import p520ud.AbstractC34787h;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: vd.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C35898a extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C35898a f152833w = new C35898a(2, AbstractC35903f.class, "serializeTagDocument", "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/Tag;)V", 1);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC17252m p13 = (InterfaceC17252m) obj;
        AbstractC34787h p14 = (AbstractC34787h) obj2;
        AbstractC22676k.m65750j(p13, "p0");
        AbstractC22676k.m65750j(p14, "p1");
        C17251l c17251l = C17251l.f66278i;
        C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("Key")}), 0);
        C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C18458c("Value")}), 0);
        C38445a c38445a = new C38445a(13);
        ((LinkedHashSet) c38445a.f164637y).add(new C18458c("Tag"));
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        InterfaceC17253n interfaceC17253nMo48823e = p13.mo48823e(new C17249j(c38445a));
        p14.getClass();
        interfaceC17253nMo48823e.mo30739a(c17248i, null);
        interfaceC17253nMo48823e.mo30739a(c17248i2, null);
        interfaceC17253nMo48823e.mo30746o();
        return C23454a0.f92919a;
    }
}
