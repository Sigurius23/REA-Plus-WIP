package lk;

import dk.C12100f;
import fk.InterfaceC14544a;
import g73.C15553a;
import io.sentry.config.AbstractC20301a;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import mk.C25626a;
import p005a3.C0237p;
import p173gj.C15903d;
import p173gj.C15906g;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p282kk.C22533b;
import p343nk.AbstractC26793n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lk.g */
/* JADX INFO: loaded from: classes.dex */
public final class C24488g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC18598b f95535a;

    /* JADX INFO: renamed from: b */
    public final C15903d f95536b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC14544a f95537c;

    /* JADX INFO: renamed from: d */
    public final C15906g f95538d;

    /* JADX INFO: renamed from: e */
    public final C25626a f95539e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f95540f;

    /* JADX INFO: renamed from: g */
    public String f95541g;

    /* JADX INFO: renamed from: h */
    public String f95542h;

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f95543i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC24484c f95544j;

    public C24488g(InterfaceC18598b interfaceC18598b, C15903d c15903d, InterfaceC14544a logger, C15906g c15906g, C25626a c25626a) {
        InterfaceC24484c c15553a;
        AbstractC22676k.m65750j(logger, "logger");
        this.f95535a = interfaceC18598b;
        this.f95536b = c15903d;
        this.f95537c = logger;
        this.f95538d = c15906g;
        this.f95539e = c25626a;
        this.f95540f = new AtomicBoolean(false);
        this.f95543i = new AtomicBoolean(false);
        if (interfaceC18598b instanceof C12100f) {
            c15553a = new C0237p((C12100f) interfaceC18598b, logger, c15903d);
        } else if (interfaceC18598b instanceof AbstractC26793n) {
            c15553a = new C15553a((AbstractC26793n) interfaceC18598b);
        } else {
            logger.warn("Custom storage, identify intercept not started");
            c15553a = null;
        }
        this.f95544j = c15553a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        if (m71260c(r0) == r1) goto L99;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m71258a(p255jk.C21743a r12, s83.AbstractC32269c r13) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.C24488g.m71258a(jk.a, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71259b(C21743a c21743a, AbstractC32269c abstractC32269c) {
        C24486e c24486e;
        C24488g c24488g;
        if (abstractC32269c instanceof C24486e) {
            c24486e = (C24486e) abstractC32269c;
            int i13 = c24486e.f95530z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24486e.f95530z = i13 - Integer.MIN_VALUE;
            } else {
                c24486e = new C24486e(this, abstractC32269c);
            }
        } else {
            c24486e = new C24486e(this, abstractC32269c);
        }
        Object obj = c24486e.f95528x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24486e.f95530z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                InterfaceC18598b interfaceC18598b = this.f95535a;
                c24486e.f95527w = this;
                c24486e.f95530z = 1;
                if (interfaceC18598b.mo33428e(c21743a, c24486e) == enumC31071a) {
                    return enumC31071a;
                }
            } catch (Exception e5) {
                e = e5;
                c24488g = this;
                AbstractC20301a.m56317P(e, c24488g.f95537c, "Error when intercepting identifies");
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24488g = c24486e.f95527w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e13) {
                e = e13;
                AbstractC20301a.m56317P(e, c24488g.f95537c, "Error when intercepting identifies");
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m71260c(AbstractC32269c abstractC32269c) {
        C24487f c24487f;
        C24488g c24488g;
        if (abstractC32269c instanceof C24487f) {
            c24487f = (C24487f) abstractC32269c;
            int i13 = c24487f.f95534z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c24487f.f95534z = i13 - Integer.MIN_VALUE;
            } else {
                c24487f = new C24487f(this, abstractC32269c);
            }
        } else {
            c24487f = new C24487f(this, abstractC32269c);
        }
        Object objMo708n = c24487f.f95532x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c24487f.f95534z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo708n);
            c24487f.f95531w = this;
            c24487f.f95534z = 1;
            InterfaceC24484c interfaceC24484c = this.f95544j;
            AbstractC22676k.m65747g(interfaceC24484c);
            objMo708n = interfaceC24484c.mo708n(c24487f);
            if (objMo708n == enumC31071a) {
                return enumC31071a;
            }
            c24488g = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24488g = c24487f.f95531w;
            AbstractC34132o.m107864I(objMo708n);
        }
        C21743a c21743a = (C21743a) objMo708n;
        if (c21743a != null) {
            C22533b c22533b = c24488g.f95539e.f100571z;
            if (c22533b == null) {
                AbstractC22676k.m65757q("pipeline");
                throw null;
            }
            c22533b.m65128a(c21743a);
        }
        return C23454a0.f92919a;
    }
}
