package android.support.v4.media.session;

import a00.C0072g;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import hn.C17496d;
import hn.C17497e;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p215i9.C18227c;
import p215i9.C18228d;
import p417q8.C30027a;
import p417q8.C30028b;
import p453r8.C31057a;
import pg3.C29205p;

/* JADX INFO: renamed from: android.support.v4.media.session.h */
/* JADX INFO: loaded from: classes5.dex */
public final class HandlerC1074h extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC1074h(Object obj, Looper looper, int i13) {
        super(looper);
        this.f4192a = i13;
        this.f4193b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m3208a(Message message) {
        C18228d c18228d = (C18228d) this.f4193b;
        int i13 = message.what;
        C18227c c18227c = null;
        if (i13 == 1) {
            C18227c c18227c2 = (C18227c) message.obj;
            try {
                c18228d.f70918a.queueInputBuffer(c18227c2.f70911a, 0, c18227c2.f70912b, c18227c2.f70914d, c18227c2.f70915e);
            } catch (RuntimeException e5) {
                AtomicReference atomicReference = c18228d.f70921d;
                while (!atomicReference.compareAndSet(null, e5) && atomicReference.get() == null) {
                }
            }
            c18227c = c18227c2;
        } else if (i13 == 2) {
            C18227c c18227c3 = (C18227c) message.obj;
            int i14 = c18227c3.f70911a;
            MediaCodec.CryptoInfo cryptoInfo = c18227c3.f70913c;
            long j7 = c18227c3.f70914d;
            int i15 = c18227c3.f70915e;
            try {
                synchronized (C18228d.f70917h) {
                    c18228d.f70918a.queueSecureInputBuffer(i14, 0, cryptoInfo, j7, i15);
                }
            } catch (RuntimeException e13) {
                AtomicReference atomicReference2 = c18228d.f70921d;
                while (!atomicReference2.compareAndSet(null, e13) && atomicReference2.get() == null) {
                }
            }
            c18227c = c18227c3;
        } else if (i13 == 3) {
            c18228d.f70922e.m8248c();
        } else if (i13 != 4) {
            AtomicReference atomicReference3 = c18228d.f70921d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                c18228d.f70918a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e14) {
                AtomicReference atomicReference4 = c18228d.f70921d;
                while (!atomicReference4.compareAndSet(null, e14) && atomicReference4.get() == null) {
                }
            }
        }
        if (c18227c != null) {
            ArrayDeque arrayDeque = C18228d.f70916g;
            synchronized (arrayDeque) {
                arrayDeque.add(c18227c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC1076j interfaceC1076j;
        C0072g c0072g;
        HandlerC1074h handlerC1074h;
        C17496d c17496d;
        ArrayDeque arrayDeque;
        int size;
        C29205p[] c29205pArr;
        switch (this.f4192a) {
            case 0:
                if (message.what == 1) {
                    synchronized (((C0072g) this.f4193b).f223x) {
                        interfaceC1076j = (InterfaceC1076j) ((WeakReference) ((C0072g) this.f4193b).f225z).get();
                        c0072g = (C0072g) this.f4193b;
                        handlerC1074h = (HandlerC1074h) c0072g.f221E;
                        break;
                    }
                    if (interfaceC1076j == null || c0072g != interfaceC1076j.mo3211b() || handlerC1074h == null) {
                        return;
                    }
                    interfaceC1076j.mo3210a((C31057a) message.obj);
                    interfaceC1076j.mo3210a(null);
                    return;
                }
                return;
            case 1:
                C17497e c17497e = (C17497e) this.f4193b;
                c17497e.getClass();
                int i13 = message.what;
                C17496d c17496d2 = null;
                if (i13 != 0) {
                    if (i13 == 1) {
                        c17496d = (C17496d) message.obj;
                        int i14 = c17496d.f67620a;
                        MediaCodec.CryptoInfo cryptoInfo = c17496d.f67622c;
                        long j7 = c17496d.f67623d;
                        int i15 = c17496d.f67624e;
                        try {
                            synchronized (C17497e.f67626h) {
                                try {
                                    c17497e.f67627a.queueSecureInputBuffer(i14, 0, cryptoInfo, j7, i15);
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                                break;
                            }
                        } catch (RuntimeException e5) {
                            AtomicReference atomicReference = c17497e.f67630d;
                            while (!atomicReference.compareAndSet(null, e5) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i13 != 2) {
                        AtomicReference atomicReference2 = c17497e.f67630d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        c17497e.f67631e.m8248c();
                    }
                    if (c17496d2 != null) {
                        arrayDeque = C17497e.f67625g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(c17496d2);
                            break;
                        }
                        return;
                    }
                    return;
                }
                c17496d = (C17496d) message.obj;
                try {
                    c17497e.f67627a.queueInputBuffer(c17496d.f67620a, 0, c17496d.f67621b, c17496d.f67623d, c17496d.f67624e);
                    break;
                } catch (RuntimeException e13) {
                    AtomicReference atomicReference3 = c17497e.f67630d;
                    while (!atomicReference3.compareAndSet(null, e13) && atomicReference3.get() == null) {
                    }
                }
                c17496d2 = c17496d;
                if (c17496d2 != null) {
                    arrayDeque = C17497e.f67625g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(c17496d2);
                        return;
                    }
                }
                return;
            case 2:
                m3208a(message);
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                C30028b c30028b = (C30028b) this.f4193b;
                while (true) {
                    synchronized (c30028b.f122549b) {
                        try {
                            size = c30028b.f122551d.size();
                            if (size <= 0) {
                                return;
                            }
                            c29205pArr = new C29205p[size];
                            c30028b.f122551d.toArray(c29205pArr);
                            c30028b.f122551d.clear();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    for (int i16 = 0; i16 < size; i16++) {
                        C29205p c29205p = c29205pArr[i16];
                        int size2 = ((ArrayList) c29205p.f118205y).size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            C30027a c30027a = (C30027a) ((ArrayList) c29205p.f118205y).get(i17);
                            if (!c30027a.f122545d) {
                                c30027a.f122543b.onReceive(c30028b.f122548a, (Intent) c29205p.f118204x);
                            }
                        }
                    }
                }
                break;
        }
    }
}
