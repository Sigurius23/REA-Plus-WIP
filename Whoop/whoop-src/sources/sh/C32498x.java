package sh;

import android.graphics.ImageDecoder;
import fi.C14509o;
import mc3.C25443i;
import p249jc.AbstractC21598x;
import p461rh.C31412a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sh.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C32498x implements InterfaceC32485k {

    /* JADX INFO: renamed from: a */
    public final ImageDecoder.Source f134547a;

    /* JADX INFO: renamed from: b */
    public final AutoCloseable f134548b;

    /* JADX INFO: renamed from: c */
    public final C14509o f134549c;

    /* JADX INFO: renamed from: d */
    public final C25443i f134550d;

    public C32498x(ImageDecoder.Source source, AutoCloseable autoCloseable, C14509o c14509o, C25443i c25443i) {
        this.f134547a = source;
        this.f134548b = autoCloseable;
        this.f134549c = c14509o;
        this.f134550d = c25443i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // sh.InterfaceC32485k
    /* JADX INFO: renamed from: a */
    public final Object mo71006a(InterfaceC30057d interfaceC30057d) {
        C32496v c32496v;
        C32498x c32498x;
        C25443i c25443i;
        if (interfaceC30057d instanceof C32496v) {
            c32496v = (C32496v) interfaceC30057d;
            int i13 = c32496v.f134539E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c32496v.f134539E = i13 - Integer.MIN_VALUE;
            } else {
                c32496v = new C32496v(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c32496v = new C32496v(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c32496v.f134542y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c32496v.f134539E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c32496v.f134540w = this;
            C25443i c25443i2 = this.f134550d;
            c32496v.f134541x = c25443i2;
            c32496v.f134539E = 1;
            if (c25443i2.m74671a(c32496v) == enumC31071a) {
                return enumC31071a;
            }
            c32498x = this;
            c25443i = c25443i2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c25443i = c32496v.f134541x;
            c32498x = c32496v.f134540w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            AutoCloseable autoCloseable = c32498x.f134548b;
            try {
                C22659b0 c22659b0 = new C22659b0();
                C32483i c32483i = new C32483i(new C31412a(ImageDecoder.decodeBitmap(c32498x.f134547a, new C32497w(c32498x, c22659b0, 0))), c22659b0.f89329w);
                AbstractC21598x.m60698r(autoCloseable, null);
                c25443i.m74673d();
                return c32483i;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC21598x.m60698r(autoCloseable, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            c25443i.m74673d();
            throw th5;
        }
    }
}
