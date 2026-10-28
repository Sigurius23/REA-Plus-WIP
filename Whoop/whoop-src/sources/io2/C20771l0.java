package io2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32611g1;

/* JADX INFO: renamed from: io2.l0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20771l0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f77991E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f77992F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77993w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f77994x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f77995y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f77996z;

    public /* synthetic */ C20771l0(List list, String str, int i13, Function1 function1, int i14) {
        this.f77994x = list;
        this.f77995y = str;
        this.f77996z = i13;
        this.f77991E = function1;
        this.f77992F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f77993w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                String str = this.f77995y;
                List list = this.f77994x;
                int i13 = this.f77996z;
                return AbstractC20773m0.m57226r(list, str, this.f77991E, i13, this.f77992F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                String str2 = this.f77995y;
                return AbstractC32611g1.m101739I(this.f77994x, str2, this.f77996z, this.f77991E, this.f77992F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C20771l0(List list, String str, Function1 function1, int i13, int i14) {
        this.f77994x = list;
        this.f77995y = str;
        this.f77991E = function1;
        this.f77996z = i13;
        this.f77992F = i14;
    }
}
