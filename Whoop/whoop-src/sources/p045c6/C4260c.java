package p045c6;

import dd3.C11972a;
import io.getstream.video.android.core.notifications.internal.storage.DevicePreferences;
import io.getstream.video.android.model.Device;
import java.io.FileNotFoundException;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26619i0;
import ne3.C26621j0;
import p007a6.C0450r;
import p007a6.InterfaceC0461w0;
import p505ts.AbstractC34132o;
import p671z5.C40084b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import r83.EnumC31071a;
import s40.AbstractC32145e0;
import s83.AbstractC32269c;
import se.AbstractC32417h;

/* JADX INFO: renamed from: c6.c */
/* JADX INFO: loaded from: classes5.dex */
public class C4260c implements InterfaceC0461w0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC26632p f17306a;

    /* JADX INFO: renamed from: b */
    public final C26611e0 f17307b;

    /* JADX INFO: renamed from: c */
    public final C4258a f17308c;

    public C4260c(AbstractC26632p fileSystem, C26611e0 path, C40084b c40084b) {
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        AbstractC22676k.m65750j(path, "path");
        this.f17306a = fileSystem;
        this.f17307b = path;
        this.f17308c = new C4258a(0);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7 A[Catch: all -> 0x0103, TryCatch #4 {all -> 0x0103, blocks: (B:56:0x00c5, B:58:0x00d7, B:59:0x00dd), top: B:102:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #4 {all -> 0x0103, blocks: (B:56:0x00c5, B:58:0x00d7, B:59:0x00dd), top: B:102:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115 A[Catch: Exception -> 0x0116, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0116, blocks: (B:82:0x0115, B:55:0x00bb), top: B:110:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.getstream.video.android.model.Device, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX INFO: renamed from: f */
    public static Object m13290f(C4260c c4260c, AbstractC32269c abstractC32269c) throws Exception {
        C4259b c4259b;
        C4260c c4260c2;
        C26621j0 c26621j0;
        Throwable th3;
        Throwable th4;
        AbstractC26632p abstractC26632p;
        C26611e0 c26611e0;
        C26621j0 c26621j0M79158c;
        C4260c c4260c3;
        C26621j0 c26621j1;
        Throwable th5;
        byte[] bArrM100100g;
        Object objM32971a;
        if (abstractC32269c instanceof C4259b) {
            c4259b = (C4259b) abstractC32269c;
            int i13 = c4259b.f17301E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c4259b.f17301E = i13 - Integer.MIN_VALUE;
            } else {
                c4259b = new C4259b(c4260c, abstractC32269c);
            }
        } else {
            c4259b = new C4259b(c4260c, abstractC32269c);
        }
        Object obj = c4259b.f17304y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c4259b.f17301E;
        int i15 = 1;
        ?? r10 = 0;
        th = null;
        th = null;
        obj = null;
        obj = null;
        Object obj2 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (c4260c.f17308c.f17300a.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                C26621j0 c26621j0M79158c2 = AbstractC26604b.m79158c(c4260c.f17306a.mo79155x0(c4260c.f17307b));
                try {
                    c4259b.f17302w = c4260c;
                    c4259b.f17303x = c26621j0M79158c2;
                    c4259b.f17301E = 1;
                    byte[] bArrM100100g2 = AbstractC32145e0.m100100g(new C26619i0(c26621j0M79158c2));
                    Object devicePreferences = bArrM100100g2.length == 0 ? new DevicePreferences((Device) r10, i15, (DefaultConstructorMarker) r10) : C11972a.f39315b.m32971a(DevicePreferences.Companion.serializer(), bArrM100100g2);
                    if (devicePreferences != enumC31071a) {
                        Object obj3 = devicePreferences;
                        c4260c2 = c4260c;
                        c26621j0 = c26621j0M79158c2;
                        obj = obj3;
                        if (c26621j0 != null) {
                            c26621j0.close();
                        }
                        th4 = null;
                    }
                    return enumC31071a;
                } catch (Throwable th6) {
                    c4260c2 = c4260c;
                    c26621j0 = c26621j0M79158c2;
                    th3 = th6;
                    if (c26621j0 != null) {
                        c26621j0.close();
                    }
                    th4 = th3;
                    obj = null;
                }
            } catch (FileNotFoundException unused) {
                abstractC26632p = c4260c.f17306a;
                c26611e0 = c4260c.f17307b;
                if (abstractC26632p.m79274x(c26611e0)) {
                    c26621j0M79158c = AbstractC26604b.m79158c(c4260c.f17306a.mo79155x0(c26611e0));
                    c4259b.f17302w = c4260c;
                    c4259b.f17303x = c26621j0M79158c;
                    c4259b.f17301E = 2;
                    bArrM100100g = AbstractC32145e0.m100100g(new C26619i0(c26621j0M79158c));
                    if (bArrM100100g.length == 0) {
                        objM32971a = new DevicePreferences((Device) r10, i15, (DefaultConstructorMarker) r10);
                    } else {
                        objM32971a = C11972a.f39315b.m32971a(DevicePreferences.Companion.serializer(), bArrM100100g);
                    }
                    if (objM32971a != enumC31071a) {
                        Object obj4 = objM32971a;
                        c4260c3 = c4260c;
                        c26621j1 = c26621j0M79158c;
                        obj = obj4;
                        if (c26621j1 != null) {
                            c26621j1.close();
                        }
                        Throwable th7 = th;
                        obj2 = obj;
                        th5 = th7;
                        c4260c = c4260c3;
                        r10 = obj2;
                        if (th5 != null) {
                            throw th5;
                        }
                    }
                }
                return r10;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c26621j1 = c4259b.f17303x;
                c4260c3 = c4259b.f17302w;
                try {
                    AbstractC34132o.m107864I(obj);
                    if (c26621j1 != null) {
                        try {
                            c26621j1.close();
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    Throwable th9 = th;
                    obj2 = obj;
                    th5 = th9;
                } catch (Throwable th10) {
                    th5 = th10;
                    if (c26621j1 != null) {
                        try {
                            c26621j1.close();
                        } catch (Throwable th11) {
                            try {
                                AbstractC29125c.m88530g(th5, th11);
                            } catch (Exception e5) {
                                e = e5;
                                if (e instanceof FileNotFoundException) {
                                    throw AbstractC32417h.m101191V(String.valueOf(c4260c3.f17307b.m79174c()), (FileNotFoundException) e);
                                }
                                throw e;
                            }
                        }
                    }
                }
                c4260c = c4260c3;
                r10 = obj2;
                if (th5 != null) {
                    throw th5;
                }
                return r10;
            }
            c26621j0 = c4259b.f17303x;
            c4260c2 = c4259b.f17302w;
            try {
                AbstractC34132o.m107864I(obj);
                if (c26621j0 != null) {
                    try {
                        c26621j0.close();
                    } catch (Throwable th12) {
                        th4 = th12;
                    }
                }
                th4 = null;
            } catch (Throwable th13) {
                th3 = th13;
                if (c26621j0 != null) {
                    try {
                        try {
                            c26621j0.close();
                        } catch (Throwable th14) {
                            AbstractC29125c.m88530g(th3, th14);
                        }
                    } catch (FileNotFoundException unused2) {
                        c4260c = c4260c2;
                        abstractC26632p = c4260c.f17306a;
                        c26611e0 = c4260c.f17307b;
                        if (abstractC26632p.m79274x(c26611e0)) {
                            try {
                                c26621j0M79158c = AbstractC26604b.m79158c(c4260c.f17306a.mo79155x0(c26611e0));
                                try {
                                    c4259b.f17302w = c4260c;
                                    c4259b.f17303x = c26621j0M79158c;
                                    c4259b.f17301E = 2;
                                    bArrM100100g = AbstractC32145e0.m100100g(new C26619i0(c26621j0M79158c));
                                    if (bArrM100100g.length == 0) {
                                        objM32971a = new DevicePreferences((Device) r10, i15, (DefaultConstructorMarker) r10);
                                    } else {
                                        objM32971a = C11972a.f39315b.m32971a(DevicePreferences.Companion.serializer(), bArrM100100g);
                                    }
                                    if (objM32971a != enumC31071a) {
                                        Object obj5 = objM32971a;
                                        c4260c3 = c4260c;
                                        c26621j1 = c26621j0M79158c;
                                        obj = obj5;
                                        if (c26621j1 != null) {
                                            c26621j1.close();
                                        }
                                        Throwable th15 = th;
                                        obj2 = obj;
                                        th5 = th15;
                                        c4260c = c4260c3;
                                        r10 = obj2;
                                        if (th5 != null) {
                                            throw th5;
                                        }
                                    }
                                    return enumC31071a;
                                } catch (Throwable th16) {
                                    c4260c3 = c4260c;
                                    c26621j1 = c26621j0M79158c;
                                    th5 = th16;
                                    if (c26621j1 != null) {
                                        c26621j1.close();
                                    }
                                }
                            } catch (Exception e13) {
                                c4260c3 = c4260c;
                                e = e13;
                                if (e instanceof FileNotFoundException) {
                                    throw AbstractC32417h.m101191V(String.valueOf(c4260c3.f17307b.m79174c()), (FileNotFoundException) e);
                                }
                                throw e;
                            }
                        }
                        return r10;
                    }
                }
                th4 = th3;
                obj = null;
            }
        }
        if (th4 == null) {
            return obj;
        }
        throw th4;
    }

    @Override // p007a6.InterfaceC0461w0
    /* JADX INFO: renamed from: a */
    public final Object mo1118a(C0450r c0450r) {
        return m13290f(this, c0450r);
    }

    @Override // p007a6.InterfaceC0404a
    public final void close() {
        this.f17308c.f17300a.set(true);
    }
}
