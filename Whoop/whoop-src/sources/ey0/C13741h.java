package ey0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import cy0.C11184c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ey0.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C13741h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f49006E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f49007F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49008w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11184c f49009x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f49010y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f49011z;

    public /* synthetic */ C13741h(C11184c c11184c, String str, Function1 function1, int i13, int i14, int i15) {
        this.f49008w = i15;
        this.f49009x = c11184c;
        this.f49010y = str;
        this.f49011z = function1;
        this.f49006E = i13;
        this.f49007F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49008w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13742i.m39056D(this.f49009x, this.f49010y, this.f49011z, this.f49006E, this.f49007F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13742i.m39080v(this.f49009x, this.f49010y, this.f49011z, this.f49006E, this.f49007F, (Composer) obj, iIntValue2);
        }
    }
}
