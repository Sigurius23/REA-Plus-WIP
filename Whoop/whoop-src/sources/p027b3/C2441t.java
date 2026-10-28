package p027b3;

import android.os.Bundle;
import p164g2.C15252x;
import p512u2.AbstractC34455e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: b3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C2441t extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9542w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f9543x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2441t(C22669g0 c22669g0, int i13) {
        super(1);
        this.f9542w = i13;
        this.f9543x = c22669g0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9542w) {
            case 0:
                this.f9543x.f89336w = (C15252x) obj;
                return Boolean.TRUE;
            case 1:
                String key = (String) obj;
                AbstractC22676k.m65750j(key, "key");
                Object obj2 = this.f9543x.f89336w;
                boolean z4 = true;
                if (obj2 != null && ((Bundle) obj2).containsKey(key)) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                AbstractC34455e abstractC34455e = (AbstractC34455e) obj;
                C22669g0 c22669g0 = this.f9543x;
                Object obj3 = c22669g0.f89336w;
                if (obj3 == null && abstractC34455e.f144759Q) {
                    c22669g0.f89336w = abstractC34455e;
                } else if (obj3 != null) {
                    abstractC34455e.getClass();
                }
                return Boolean.TRUE;
        }
    }
}
