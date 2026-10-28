package ub2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.settings.journalv2.AbstractC10114e;
import com.whoop.settings.journalv2.InterfaceC10117h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ub2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C34746e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146396w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC10117h.e f146397x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f146398y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f146399z;

    public /* synthetic */ C34746e(InterfaceC10117h.e eVar, Function1 function1, int i13, int i14) {
        this.f146396w = i14;
        this.f146397x = eVar;
        this.f146398y = function1;
        this.f146399z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f146396w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC10114e.m25463m(this.f146397x, this.f146398y, this.f146399z, composer, iIntValue);
            default:
                return AbstractC10114e.m25466p(this.f146397x, this.f146398y, this.f146399z, composer, iIntValue);
        }
    }
}
