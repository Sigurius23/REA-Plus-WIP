package n10;

import e10.InterfaceC12539d;
import hm.C17417d;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38840g6;
import y00.C38901n;
import y00.C38915o4;

/* JADX INFO: renamed from: n10.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C26144o {

    /* JADX INFO: renamed from: a */
    public final C17417d f103572a;

    public C26144o(C17417d c17417d, C30765d logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f103572a = c17417d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m77688a(C38840g6 c38840g6, C38915o4 c38915o4, AbstractC32269c abstractC32269c) {
        C26146p c26146p;
        C26144o c26144o;
        if (abstractC32269c instanceof C26146p) {
            c26146p = (C26146p) abstractC32269c;
            int i13 = c26146p.f103575F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26146p.f103575F = i13 - Integer.MIN_VALUE;
            } else {
                c26146p = new C26146p(this, abstractC32269c);
            }
        } else {
            c26146p = new C26146p(this, abstractC32269c);
        }
        Object objM49430e = c26146p.f103579z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26146p.f103575F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM49430e);
            c26146p.f103576w = this;
            c26146p.f103577x = c38840g6;
            c26146p.f103578y = c38915o4;
            c26146p.f103575F = 1;
            objM49430e = this.f103572a.m49430e(c26146p);
            if (objM49430e == enumC31071a) {
                return enumC31071a;
            }
            c26144o = this;
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(objM49430e);
                    return (InterfaceC12539d) objM49430e;
                }
                AbstractC34132o.m107864I(objM49430e);
                if (objM49430e == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            }
            c38915o4 = c26146p.f103578y;
            c38840g6 = c26146p.f103577x;
            c26144o = c26146p.f103576w;
            AbstractC34132o.m107864I(objM49430e);
        }
        if (objM49430e != null) {
            throw new ClassCastException();
        }
        c26146p.f103576w = c26144o;
        c26146p.f103577x = c38840g6;
        c26146p.f103578y = c38915o4;
        c26146p.f103575F = 2;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public void m77689b(C38840g6 c38840g6, C38915o4 c38915o4, AbstractC32269c abstractC32269c) {
        C26142n c26142n;
        C26144o c26144o;
        if (abstractC32269c instanceof C26142n) {
            c26142n = (C26142n) abstractC32269c;
            int i13 = c26142n.f103565F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26142n.f103565F = i13 - Integer.MIN_VALUE;
            } else {
                c26142n = new C26142n(this, abstractC32269c);
            }
        } else {
            c26142n = new C26142n(this, abstractC32269c);
        }
        Object objM49430e = c26142n.f103569z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26142n.f103565F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM49430e);
            c26142n.f103566w = this;
            c26142n.f103567x = c38840g6;
            c26142n.f103568y = c38915o4;
            c26142n.f103565F = 1;
            objM49430e = this.f103572a.m49430e(c26142n);
            if (objM49430e == enumC31071a) {
                return;
            } else {
                c26144o = this;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM49430e);
                if (objM49430e != null) {
                    throw new ClassCastException();
                }
                throw new NoWhenBranchMatchedException();
            }
            c38915o4 = c26142n.f103568y;
            c38840g6 = c26142n.f103567x;
            c26144o = c26142n.f103566w;
            AbstractC34132o.m107864I(objM49430e);
        }
        if (objM49430e != null) {
            throw new ClassCastException();
        }
        String str = c38915o4.f167527w;
        c26142n.f103566w = c26144o;
        c26142n.f103567x = c38840g6;
        c26142n.f103568y = c38915o4;
        c26142n.f103565F = 2;
        throw null;
    }

    public C26144o(C17417d c17417d, C26145o0 intentFirstConfirmationInterceptorFactory, C30765d logger, C38901n clientAttributionMetadata) {
        AbstractC22676k.m65750j(intentFirstConfirmationInterceptorFactory, "intentFirstConfirmationInterceptorFactory");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        this.f103572a = c17417d;
    }
}
