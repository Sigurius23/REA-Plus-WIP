package f61;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g61.C15529b;
import i61.InterfaceC18153b;

/* JADX INFO: renamed from: f61.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14141c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f50912E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50913w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14147i f50914x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15529b f50915y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC18153b f50916z;

    public /* synthetic */ C14141c(C14147i c14147i, C15529b c15529b, InterfaceC18153b interfaceC18153b, int i13, int i14) {
        this.f50913w = i14;
        this.f50914x = c14147i;
        this.f50915y = c15529b;
        this.f50916z = interfaceC18153b;
        this.f50912E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50913w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C14147i.m40274T(this.f50914x, this.f50915y, this.f50916z, this.f50912E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C14147i.m40259C(this.f50914x, this.f50915y, this.f50916z, this.f50912E, (Composer) obj, iIntValue2);
        }
    }
}
