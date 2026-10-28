package com.whoop.realtime.presentation;

import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p92.C29016e;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\"\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lp92/e;", "", "f", "(Lp92/e;)Z", "e", "", "d", "(Lp92/e;)Ljava/lang/String;", "activityKey", "realtime-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9885i {

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f28951w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f28951w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f28951w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28951w.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final String m24030d(C29016e c29016e) {
        InterfaceC24516b interfaceC24516bM88168a;
        if (c29016e == null || (interfaceC24516bM88168a = c29016e.m88168a()) == null) {
            return null;
        }
        return interfaceC24516bM88168a.mo71413b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final boolean m24031e(C29016e c29016e) {
        if (c29016e == null) {
            return false;
        }
        InterfaceC24516b interfaceC24516bM88168a = c29016e.m88168a();
        C24517c c24517c = interfaceC24516bM88168a instanceof C24517c ? (C24517c) interfaceC24516bM88168a : null;
        return c24517c != null && c24517c.m71418s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final boolean m24032f(C29016e c29016e) {
        return c29016e != null && (c29016e.m88168a() instanceof C24518d);
    }
}
