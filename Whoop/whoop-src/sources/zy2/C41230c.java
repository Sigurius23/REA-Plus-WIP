package zy2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c51.AbstractC4234k;
import c51.C4242s;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: zy2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C41230c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f177918x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f177919y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f177920z;

    public /* synthetic */ C41230c(Object obj, Object obj2, int i13, int i14) {
        this.f177917w = i14;
        this.f177919y = obj;
        this.f177920z = obj2;
        this.f177918x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f177917w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC41231d.m133933l((InterfaceC41233f.b) this.f177919y, (Function1) this.f177920z, this.f177918x, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4234k.m13136I((C4242s) this.f177919y, (Modifier) this.f177920z, this.f177918x, (Composer) obj, iIntValue2);
        }
    }
}
