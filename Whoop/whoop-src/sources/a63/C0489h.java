package a63;

import i63.AbstractC18159b;
import i63.C18163d;
import j63.AbstractC21385b;

/* JADX INFO: renamed from: a63.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0489h extends AbstractC21385b {

    /* JADX INFO: renamed from: a */
    public final C18163d f1649a;

    /* JADX INFO: renamed from: b */
    public final long f1650b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1651c;

    public C0489h(C18163d c18163d, Object obj) {
        this.f1651c = obj;
        if (c18163d == null) {
            C18163d c18163d2 = AbstractC18159b.f70468a;
            c18163d = AbstractC18159b.f70469b;
        }
        this.f1649a = c18163d;
        this.f1650b = ((byte[]) obj).length;
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: a */
    public final Long mo1201a() {
        return Long.valueOf(this.f1650b);
    }

    @Override // j63.AbstractC21387d
    /* JADX INFO: renamed from: b */
    public final C18163d mo1202b() {
        return this.f1649a;
    }

    @Override // j63.AbstractC21385b
    /* JADX INFO: renamed from: d */
    public final byte[] mo1203d() {
        return (byte[]) this.f1651c;
    }
}
