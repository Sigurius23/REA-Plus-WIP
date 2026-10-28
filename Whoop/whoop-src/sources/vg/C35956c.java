package vg;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mc3.AbstractC25444j;
import mc3.C25442h;
import mc3.C25443i;
import mc3.InterfaceC25439e;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import te0.AbstractC33745d;
import ug.C34912a;
import ug.C34913b;

/* JADX INFO: renamed from: vg.c */
/* JADX INFO: loaded from: classes.dex */
public final class C35956c implements Closeable {

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f153115F = AtomicReferenceFieldUpdater.newUpdater(C35956c.class, Object.class, "z");

    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f153116G = AtomicIntegerFieldUpdater.newUpdater(C35956c.class, "E");

    /* JADX INFO: renamed from: E */
    public volatile /* synthetic */ int f153117E;

    /* JADX INFO: renamed from: w */
    public final long f153118w;

    /* JADX INFO: renamed from: x */
    public final C34912a f153119x;

    /* JADX INFO: renamed from: y */
    public final C25443i f153120y;

    /* JADX INFO: renamed from: z */
    public volatile /* synthetic */ Object f153121z;

    public C35956c(long j7, C34912a clock) {
        AbstractC22676k.m65750j(clock, "clock");
        this.f153118w = j7;
        this.f153119x = clock;
        this.f153120y = AbstractC25444j.m74674a(1);
        this.f153121z = null;
        this.f153117E = 0;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ab, B:42:0x00b1, B:44:0x00b9, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:50:0x00d0), top: B:55:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ab, B:42:0x00b1, B:44:0x00b9, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:50:0x00d0), top: B:55:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ab, B:42:0x00b1, B:44:0x00b9, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:50:0x00d0), top: B:55:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ab, B:42:0x00b1, B:44:0x00b9, B:47:0x00c3, B:48:0x00ca, B:49:0x00cb, B:50:0x00d0), top: B:55:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final Object m114203b(Function1 function1, AbstractC32269c abstractC32269c) throws Throwable {
        C35955b c35955b;
        C25443i c25443i;
        int i13;
        InterfaceC25439e interfaceC25439e;
        Function1 function2;
        Object obj;
        Object obj2;
        C35961h c35961h;
        C35961h c35961h2;
        if (abstractC32269c instanceof C35955b) {
            c35955b = (C35955b) abstractC32269c;
            int i14 = c35955b.f153110G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c35955b.f153110G = i14 - Integer.MIN_VALUE;
            } else {
                c35955b = new C35955b(this, abstractC32269c);
            }
        } else {
            c35955b = new C35955b(this, abstractC32269c);
        }
        Object obj3 = c35955b.f153108E;
        Object obj4 = EnumC31071a.f128113w;
        int i15 = c35955b.f153110G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj3);
                c25443i = this.f153120y;
                c35955b.f153111w = (AbstractC32275i) function1;
                c35955b.f153112x = c25443i;
                i13 = 0;
                c35955b.f153114z = 0;
                c35955b.f153110G = 1;
                if (c25443i.m74671a(c35955b) != obj4) {
                }
                function2 = function1;
                interfaceC25439e = c25443i;
                return obj4;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c35961h = c35955b.f153113y;
                obj = c35955b.f153112x;
                try {
                    AbstractC34132o.m107864I(obj3);
                    obj2 = obj;
                    c35961h2 = (C35961h) obj3;
                    if (this.f153117E == 0) {
                        throw new IllegalStateException("value is closed");
                    }
                    if (AbstractC33745d.m106640B(f153115F, this, c35961h, c35961h2)) {
                        throw new IllegalStateException("value changed during getOrLoad");
                    }
                    Object objM114205b = c35961h2.m114205b();
                    ((C25442h) obj2).m74673d();
                    return objM114205b;
                } catch (Throwable th3) {
                    th = th3;
                    ((C25442h) obj).m74673d();
                    throw th;
                }
            }
            int i16 = c35955b.f153114z;
            InterfaceC25439e interfaceC25439e2 = c35955b.f153112x;
            Function1 function3 = (Function1) c35955b.f153111w;
            AbstractC34132o.m107864I(obj3);
            interfaceC25439e = interfaceC25439e2;
            i13 = i16;
            function2 = function3;
            function2 = function1;
            interfaceC25439e = c25443i;
            if (this.f153117E != 0) {
                throw new IllegalStateException("value is closed");
            }
            C35961h c35961h3 = (C35961h) this.f153121z;
            if (c35961h3 != null) {
                this.f153119x.getClass();
                C33647p c33647p = C34913b.f147015x;
                if (C33647p.m106274t().compareTo(c35961h3.m114204a().m110114c(this.f153118w)) < 0) {
                    Object objM114205b2 = c35961h3.m114205b();
                    ((C25442h) interfaceC25439e).m74673d();
                    return objM114205b2;
                }
            }
            c35955b.f153111w = null;
            c35955b.f153112x = interfaceC25439e;
            c35955b.f153113y = c35961h3;
            c35955b.f153114z = i13;
            c35955b.f153110G = 2;
            Object objInvoke = function2.invoke(c35955b);
            if (objInvoke != obj4) {
                obj2 = interfaceC25439e;
                obj3 = objInvoke;
                c35961h = c35961h3;
                c35961h2 = (C35961h) obj3;
                if (this.f153117E == 0) {
                    throw new IllegalStateException("value is closed");
                }
                if (AbstractC33745d.m106640B(f153115F, this, c35961h, c35961h2)) {
                    throw new IllegalStateException("value changed during getOrLoad");
                }
                Object objM114205b3 = c35961h2.m114205b();
                ((C25442h) obj2).m74673d();
                return objM114205b3;
            }
            function2 = function1;
            interfaceC25439e = c25443i;
            return obj4;
        } catch (Throwable th4) {
            th = th4;
            obj = interfaceC25439e;
            ((C25442h) obj).m74673d();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Object obj;
        if (f153116G.compareAndSet(this, 0, 1)) {
            do {
                obj = this.f153121z;
            } while (!AbstractC33745d.m106639A(f153115F, this, obj));
        }
    }
}
