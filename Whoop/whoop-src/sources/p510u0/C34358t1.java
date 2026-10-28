package p510u0;

import p412q3.C29875i;
import p412q3.C29891y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u0.t1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34358t1 {

    /* JADX INFO: renamed from: a */
    public C29875i f144354a;

    /* JADX INFO: renamed from: b */
    public C29875i f144355b;

    /* JADX INFO: renamed from: c */
    public int f144356c;

    /* JADX INFO: renamed from: d */
    public Long f144357d;

    /* JADX INFO: renamed from: e */
    public boolean f144358e;

    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX INFO: renamed from: a */
    public final void m108666a(C29891y c29891y) {
        C29875i c29875i;
        C29891y c29891y2;
        this.f144358e = false;
        C29875i c29875i2 = this.f144354a;
        if (AbstractC22676k.m65745e(c29891y, c29875i2 != null ? (C29891y) c29875i2.f122095w : null)) {
            return;
        }
        String str = c29891y.f122125a.f92135x;
        C29875i c29875i3 = this.f144354a;
        if (AbstractC22676k.m65745e(str, (c29875i3 == null || (c29891y2 = (C29891y) c29875i3.f122095w) == null) ? null : c29891y2.f122125a.f92135x)) {
            C29875i c29875i4 = this.f144354a;
            if (c29875i4 != null) {
                c29875i4.f122095w = c29891y;
                return;
            }
            return;
        }
        this.f144354a = new C29875i(this.f144354a, c29891y, false);
        this.f144355b = null;
        int length = c29891y.f122125a.f92135x.length() + this.f144356c;
        this.f144356c = length;
        if (length > 100000) {
            C29875i c29875i5 = this.f144354a;
            if ((c29875i5 != null ? (C29875i) c29875i5.f122096x : null) == null) {
                return;
            }
            while (true) {
                if (c29875i5 == null) {
                    c29875i = null;
                } else {
                    C29875i c29875i6 = (C29875i) c29875i5.f122096x;
                    if (c29875i6 != null) {
                        c29875i = (C29875i) c29875i6.f122096x;
                    } else {
                        c29875i = null;
                    }
                }
                if (c29875i == null) {
                    break;
                } else {
                    c29875i5 = (C29875i) c29875i5.f122096x;
                }
            }
            if (c29875i5 != null) {
                c29875i5.f122096x = null;
            }
        }
    }
}
