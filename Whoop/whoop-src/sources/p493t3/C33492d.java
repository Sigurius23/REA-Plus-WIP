package p493t3;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import ce3.C4507h;
import p098dt.AbstractC12350b;
import p181h2.C16620e;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.AbstractC17922y0;
import p208i2.C17875c1;
import p208i2.C17887h;
import p208i2.C17919x;
import p208i2.C17924z0;
import p208i2.InterfaceC17906q0;
import p270k2.AbstractC22132f;
import p270k2.C22134h;
import p270k2.C22135i;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p478s3.AbstractC32098d;
import p571w3.C36776l;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C33492d extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C17887h f139831a;

    /* JADX INFO: renamed from: b */
    public C36776l f139832b;

    /* JADX INFO: renamed from: c */
    public int f139833c;

    /* JADX INFO: renamed from: d */
    public C17924z0 f139834d;

    /* JADX INFO: renamed from: e */
    public C17919x f139835e;

    /* JADX INFO: renamed from: f */
    public AbstractC17911t f139836f;

    /* JADX INFO: renamed from: g */
    public C28612f0 f139837g;

    /* JADX INFO: renamed from: h */
    public C16620e f139838h;

    /* JADX INFO: renamed from: i */
    public AbstractC22132f f139839i;

    /* JADX INFO: renamed from: a */
    public final InterfaceC17906q0 m105877a() {
        C17887h c17887h = this.f139831a;
        if (c17887h != null) {
            return c17887h;
        }
        C17887h c17887h2 = new C17887h(this);
        this.f139831a = c17887h2;
        return c17887h2;
    }

    /* JADX INFO: renamed from: b */
    public final void m105878b(int i13) {
        if (i13 == this.f139833c) {
            return;
        }
        ((C17887h) m105877a()).m51446d(i13);
        this.f139833c = i13;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX INFO: renamed from: c */
    public final void m105879c(AbstractC17911t abstractC17911t, long j7, float f13) {
        if (abstractC17911t == null) {
            this.f139837g = null;
            this.f139836f = null;
            this.f139838h = null;
            setShader(null);
            return;
        }
        if (abstractC17911t instanceof C17875c1) {
            m105880d(AbstractC32098d.m99849p(f13, ((C17875c1) abstractC17911t).f69559c));
            return;
        }
        if (!(abstractC17911t instanceof AbstractC17922y0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (AbstractC22676k.m65745e(this.f139836f, abstractC17911t)) {
            C16620e c16620e = this.f139838h;
            if (!(c16620e == null ? false : C16620e.m47210b(c16620e.f63951a, j7))) {
                if (j7 != 9205357640488583168L) {
                    this.f139836f = abstractC17911t;
                    this.f139838h = new C16620e(j7);
                    this.f139837g = AbstractC28683x.m87264r(new C4507h(abstractC17911t, j7, 1));
                }
            }
        } else {
            if (j7 != 9205357640488583168L) {
                this.f139836f = abstractC17911t;
                this.f139838h = new C16620e(j7);
                this.f139837g = AbstractC28683x.m87264r(new C4507h(abstractC17911t, j7, 1));
            }
        }
        InterfaceC17906q0 interfaceC17906q0M105877a = m105877a();
        C28612f0 c28612f0 = this.f139837g;
        ((C17887h) interfaceC17906q0M105877a).m51451i(c28612f0 != null ? (Shader) c28612f0.getValue() : null);
        this.f139835e = null;
        AbstractC12350b.m34566O(this, f13);
    }

    /* JADX INFO: renamed from: d */
    public final void m105880d(long j7) {
        C17919x c17919x = this.f139835e;
        if (c17919x == null ? false : C17919x.m51542d(c17919x.f69639a, j7)) {
            return;
        }
        if (j7 != 16) {
            this.f139835e = new C17919x(j7);
            setColor(AbstractC17918w0.m51506H(j7));
            this.f139837g = null;
            this.f139836f = null;
            this.f139838h = null;
            setShader(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m105881e(AbstractC22132f abstractC22132f) {
        if (abstractC22132f == null || AbstractC22676k.m65745e(this.f139839i, abstractC22132f)) {
            return;
        }
        this.f139839i = abstractC22132f;
        if (abstractC22132f.equals(C22134h.f85857a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC22132f instanceof C22135i)) {
            throw new NoWhenBranchMatchedException();
        }
        ((C17887h) m105877a()).m51455m(1);
        C22135i c22135i = (C22135i) abstractC22132f;
        ((C17887h) m105877a()).m51454l(c22135i.f85858a);
        InterfaceC17906q0 interfaceC17906q0M105877a = m105877a();
        ((C17887h) interfaceC17906q0M105877a).f69578a.setStrokeMiter(c22135i.f85859b);
        ((C17887h) m105877a()).m51453k(c22135i.f85861d);
        ((C17887h) m105877a()).m51452j(c22135i.f85860c);
        ((C17887h) m105877a()).m51450h(c22135i.f85862e);
    }

    /* JADX INFO: renamed from: f */
    public final void m105882f(C17924z0 c17924z0) {
        if (c17924z0 == null || AbstractC22676k.m65745e(this.f139834d, c17924z0)) {
            return;
        }
        this.f139834d = c17924z0;
        if (c17924z0.equals(C17924z0.f69668d)) {
            clearShadowLayer();
            return;
        }
        C17924z0 c17924z1 = this.f139834d;
        float f13 = c17924z1.f69671c;
        if (f13 == 0.0f) {
            f13 = Float.MIN_VALUE;
        }
        setShadowLayer(f13, Float.intBitsToFloat((int) (c17924z1.f69670b >> 32)), Float.intBitsToFloat((int) (this.f139834d.f69670b & 4294967295L)), AbstractC17918w0.m51506H(this.f139834d.f69669a));
    }

    /* JADX INFO: renamed from: g */
    public final void m105883g(C36776l c36776l) {
        if (c36776l == null || AbstractC22676k.m65745e(this.f139832b, c36776l)) {
            return;
        }
        this.f139832b = c36776l;
        int i13 = c36776l.f157354a;
        setUnderlineText((i13 | 1) == i13);
        int i14 = this.f139832b.f157354a;
        setStrikeThruText((i14 | 2) == i14);
    }
}
