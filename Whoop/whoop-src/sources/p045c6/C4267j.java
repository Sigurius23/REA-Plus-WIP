package p045c6;

import dd3.C11972a;
import io.getstream.video.android.core.notifications.internal.storage.DevicePreferences;
import java.io.FileNotFoundException;
import l83.C23454a0;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26615g0;
import ne3.C26617h0;
import ne3.C26646z;
import p007a6.InterfaceC0439l1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32417h;

/* JADX INFO: renamed from: c6.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C4267j extends C4260c implements InterfaceC0439l1 {
    /* JADX WARN: Code duplicated, block: B:74:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p007a6.InterfaceC0439l1
    /* JADX INFO: renamed from: d */
    public final Object mo1120d(Object obj, InterfaceC30057d interfaceC30057d) throws Exception {
        C4266i c4266i;
        C26646z c26646zMo79154o0;
        C26646z c26646z;
        Throwable th3;
        C26617h0 c26617h0;
        C26646z c26646z2;
        Throwable th4;
        if (interfaceC30057d instanceof C4266i) {
            c4266i = (C4266i) interfaceC30057d;
            int i13 = c4266i.f17337F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c4266i.f17337F = i13 - Integer.MIN_VALUE;
            } else {
                c4266i = new C4266i(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c4266i = new C4266i(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj2 = c4266i.f17341z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c4266i.f17337F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C26611e0 file = this.f17307b;
        Throwable th5 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            if (this.f17308c.f17300a.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                AbstractC26632p abstractC26632p = this.f17306a;
                abstractC26632p.getClass();
                AbstractC22676k.m65750j(file, "file");
                c26646zMo79154o0 = abstractC26632p.mo79154o0(file);
                try {
                    C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(C26646z.m79287h(c26646zMo79154o0));
                    try {
                        c4266i.f17338w = c26646zMo79154o0;
                        c4266i.f17339x = c26646zMo79154o0;
                        c4266i.f17340y = c26617h0M79157b;
                        c4266i.f17337F = 1;
                        C26615g0 c26615g0 = new C26615g0(c26617h0M79157b);
                        DevicePreferences devicePreferences = (DevicePreferences) obj;
                        if (devicePreferences != null) {
                            c26615g0.write(C11972a.f39315b.m32972b(DevicePreferences.Companion.serializer(), devicePreferences));
                        }
                        if (c23454a0 == enumC31071a) {
                            return enumC31071a;
                        }
                        c26646z = c26646zMo79154o0;
                        c26646z2 = c26646z;
                        c26617h0 = c26617h0M79157b;
                    } catch (Throwable th6) {
                        c26646z = c26646zMo79154o0;
                        th3 = th6;
                        c26617h0 = c26617h0M79157b;
                        if (c26617h0 != null) {
                            c26617h0.close();
                        }
                        th4 = th3;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (c26646zMo79154o0 != null) {
                        c26646zMo79154o0.close();
                    }
                    th5 = th;
                }
            } catch (Exception e5) {
                if (e5 instanceof FileNotFoundException) {
                    throw AbstractC32417h.m101191V(String.valueOf(file.m79174c()), (FileNotFoundException) e5);
                }
                throw e5;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26617h0 = c4266i.f17340y;
            c26646z2 = c4266i.f17339x;
            c26646z = c4266i.f17338w;
            try {
                AbstractC34132o.m107864I(obj2);
            } catch (Throwable th8) {
                th3 = th8;
                if (c26617h0 != null) {
                    try {
                        c26617h0.close();
                    } catch (Throwable th9) {
                        try {
                            AbstractC29125c.m88530g(th3, th9);
                        } catch (Throwable th10) {
                            th = th10;
                            c26646zMo79154o0 = c26646z;
                            if (c26646zMo79154o0 != null) {
                                try {
                                    c26646zMo79154o0.close();
                                } catch (Throwable th11) {
                                    AbstractC29125c.m88530g(th, th11);
                                }
                            }
                            th5 = th;
                        }
                    }
                }
                th4 = th3;
            }
        }
        c26646z2.flush();
        if (c26617h0 != null) {
            try {
                c26617h0.close();
            } catch (Throwable th12) {
                th4 = th12;
            }
        }
        th4 = null;
        c26646zMo79154o0 = c26646z;
        if (th4 != null) {
            throw th4;
        }
        if (c26646zMo79154o0 != null) {
            try {
                c26646zMo79154o0.close();
            } catch (Throwable th13) {
                th5 = th13;
            }
        }
        if (th5 == null) {
            return c23454a0;
        }
        throw th5;
    }
}
