package oa3;

import db3.C11890b;
import j93.AbstractC21478l0;
import jb3.EnumC21549i;
import jb3.InterfaceC21550j;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pa3.C29039b;
import pa3.EnumC29038a;
import qa3.C30134g0;
import ta3.AbstractC33686l;
import ua3.C34726f;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36969b;
import wa3.C37010o;
import x93.AbstractC38109c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: oa3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C27765h implements InterfaceC21550j {

    /* JADX INFO: renamed from: w */
    public final C11890b f111956w;

    /* JADX INFO: renamed from: x */
    public final C11890b f111957x;

    /* JADX INFO: renamed from: y */
    public final C36969b f111958y;

    public C27765h(C36969b kotlinClass, C30134g0 packageProto, C34726f nameResolver, boolean z4, EnumC21549i enumC21549i) {
        AbstractC22676k.m65750j(kotlinClass, "kotlinClass");
        AbstractC22676k.m65750j(packageProto, "packageProto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        C11890b c11890b = new C11890b(C11890b.m31927e(AbstractC38109c.m122089a(kotlinClass.f158227a)));
        C29039b c29039b = kotlinClass.f158228b;
        C11890b c11890bM31926c = null;
        String str = ((EnumC29038a) c29039b.f117525d) != EnumC29038a.MULTIFILE_CLASS_PART ? null : c29039b.f117523b;
        if (str != null && str.length() > 0) {
            c11890bM31926c = C11890b.m31926c(str);
        }
        this.f111956w = c11890b;
        this.f111957x = c11890bM31926c;
        this.f111958y = kotlinClass;
        C37010o packageModuleName = AbstractC33686l.f140745k;
        AbstractC22676k.m65749i(packageModuleName, "packageModuleName");
        Integer num = (Integer) AbstractC21478l0.m60453x(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public final C35845c m83871a() {
        C35847e c35847e;
        String str = this.f111956w.f38861a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            c35847e = C35847e.f152612c;
            if (c35847e == null) {
                C11890b.m31924a(9);
                throw null;
            }
        } else {
            c35847e = new C35847e(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        return new C35845c(c35847e, m83874d());
    }

    /* JADX INFO: renamed from: b */
    public final C11890b m83872b() {
        return this.f111957x;
    }

    /* JADX INFO: renamed from: c */
    public final C36969b m83873c() {
        return this.f111958y;
    }

    /* JADX INFO: renamed from: d */
    public final C35850h m83874d() {
        String strM31928d = this.f111956w.m31928d();
        AbstractC22676k.m65749i(strM31928d, "getInternalName(...)");
        return C35850h.m113814e(AbstractC39414r.m125860F0('/', strM31928d, strM31928d));
    }

    @Override // jb3.InterfaceC21550j
    /* JADX INFO: renamed from: j */
    public final String mo60582j() {
        return AbstractC25012a.m73377j(new StringBuilder("Class '"), m83871a().m113773a().f152613a.f152616a, '\'');
    }

    public final String toString() {
        return C27765h.class.getSimpleName() + ": " + this.f111956w;
    }
}
