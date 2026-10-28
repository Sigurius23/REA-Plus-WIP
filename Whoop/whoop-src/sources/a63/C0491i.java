package a63;

import bc3.AbstractC3050q0;
import bc3.C3003e1;
import e63.C12775d;
import hg3.AbstractC17269i;
import i63.AbstractC18159b;
import i63.AbstractC18179r;
import i63.C18163d;
import i63.C18175n;
import io.ktor.utils.p228io.InterfaceC20024q;
import j63.AbstractC21386c;
import java.io.InputStream;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p026b2.C2319y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r63.AbstractC30993e;
import x63.AbstractC38030b;
import x63.C38029a;

/* JADX INFO: renamed from: a63.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C0491i extends AbstractC21386c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1657a = 1;

    /* JADX INFO: renamed from: b */
    public final Long f1658b;

    /* JADX INFO: renamed from: c */
    public final C18163d f1659c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1660d;

    public C0491i(C12775d c12775d, C18163d c18163d, Object obj) {
        this.f1660d = obj;
        C18175n c18175n = c12775d.f43711c;
        List list = AbstractC18179r.f70507a;
        String strM2426w0 = c18175n.m2426w0("Content-Length");
        this.f1658b = strM2426w0 != null ? Long.valueOf(Long.parseLong(strM2426w0)) : null;
        if (c18163d == null) {
            C18163d c18163d2 = AbstractC18159b.f70468a;
            c18163d = AbstractC18159b.f70469b;
        }
        this.f1659c = c18163d;
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: a */
    public final Long mo1201a() {
        switch (this.f1657a) {
            case 0:
                break;
        }
        return this.f1658b;
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: b */
    public final C18163d mo1202b() {
        switch (this.f1657a) {
            case 0:
                break;
        }
        return this.f1659c;
    }

    @Override // j63.AbstractC21386c
    /* JADX INFO: renamed from: d */
    public final InterfaceC20024q mo1204d() {
        int i13 = this.f1657a;
        Object obj = this.f1660d;
        switch (i13) {
            case 0:
                return (InterfaceC20024q) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d context = ExecutorC22364d.f87316w;
                C38029a pool = AbstractC38030b.f162933a;
                AbstractC22676k.m65750j(inputStream, "<this>");
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(pool, "pool");
                return AbstractC17269i.m48915s0(C3003e1.f12012w, context, true, new C2319y(pool, inputStream, (InterfaceC30057d) null, 16)).f75135x;
        }
    }

    public C0491i(AbstractC30993e abstractC30993e, C18163d c18163d, Object obj) {
        this.f1660d = obj;
        C18175n c18175n = ((C12775d) abstractC30993e.f127968w).f43711c;
        List list = AbstractC18179r.f70507a;
        String strM2426w0 = c18175n.m2426w0("Content-Length");
        this.f1658b = strM2426w0 != null ? Long.valueOf(Long.parseLong(strM2426w0)) : null;
        if (c18163d == null) {
            C18163d c18163d2 = AbstractC18159b.f70468a;
            c18163d = AbstractC18159b.f70469b;
        }
        this.f1659c = c18163d;
    }
}
