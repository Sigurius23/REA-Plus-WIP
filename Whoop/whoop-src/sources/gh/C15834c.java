package gh;

import al0.C0971f;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import cc.C4409p;
import java.nio.ByteBuffer;
import mh.C25545m;
import ne3.C26616h;
import p092dh.C12039z;
import p092dh.EnumC12020g;
import p425qh.AbstractC30358d;
import p477s2.AbstractC32073e;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: gh.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15834c implements InterfaceC15839h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59820a;

    /* JADX INFO: renamed from: b */
    public final C25545m f59821b;

    /* JADX INFO: renamed from: c */
    public final Object f59822c;

    public /* synthetic */ C15834c(Object obj, C25545m c25545m, int i13) {
        this.f59820a = i13;
        this.f59822c = obj;
        this.f59821b = c25545m;
    }

    @Override // gh.InterfaceC15839h
    /* JADX INFO: renamed from: a */
    public final Object mo44670a(InterfaceC30057d interfaceC30057d) {
        int i13 = this.f59820a;
        int i14 = 0;
        Object obj = this.f59822c;
        C25545m c25545m = this.f59821b;
        switch (i13) {
            case 0:
                return new C15836e(new BitmapDrawable(c25545m.f100135a.getResources(), (Bitmap) obj), false, EnumC12020g.f39762x);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C26616h c26616h = new C26616h();
                    c26616h.write(byteBuffer);
                    return new C15845n(new C12039z(c26616h, new C0971f(c25545m.f100135a, 3), null), null, EnumC12020g.f39762x);
                } finally {
                    byteBuffer.position(0);
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC30358d.f124548a;
                boolean z4 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C4409p);
                if (z4) {
                    bitmapDrawable = new BitmapDrawable(c25545m.f100135a.getResources(), AbstractC32073e.m99759r(bitmapDrawable, c25545m.f100136b, c25545m.f100138d, c25545m.f100139e, c25545m.f100140f));
                }
                return new C15836e(bitmapDrawable, z4, EnumC12020g.f39762x);
        }
    }
}
