package ht2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p91.C29007a;
import yy0.AbstractC39888b;

/* JADX INFO: renamed from: ht2.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17630b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f68372E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f68373F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68374w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f68375x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f68376y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f68377z;

    public /* synthetic */ C17630b(C17629a c17629a, boolean z4, Function1 function1, int i13, int i14) {
        this.f68372E = c17629a;
        this.f68375x = z4;
        this.f68373F = function1;
        this.f68376y = i13;
        this.f68377z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f68374w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17633e.m50203K((C17629a) this.f68372E, this.f68375x, (Function1) this.f68373F, this.f68376y, this.f68377z, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39888b.m127974f((List) this.f68372E, (C29007a) this.f68373F, this.f68375x, this.f68376y, this.f68377z, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C17630b(List list, C29007a c29007a, boolean z4, int i13, int i14) {
        this.f68372E = list;
        this.f68373F = c29007a;
        this.f68375x = z4;
        this.f68376y = i13;
        this.f68377z = i14;
    }
}
