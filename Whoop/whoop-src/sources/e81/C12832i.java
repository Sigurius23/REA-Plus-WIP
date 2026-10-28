package e81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import l72.AbstractC23396c;

/* JADX INFO: renamed from: e81.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12832i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f43991E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f43992F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43993w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f43994x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f43995y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f43996z;

    public /* synthetic */ C12832i(String str, List list, Modifier modifier, int i13, int i14) {
        this.f43994x = str;
        this.f43995y = list;
        this.f43996z = modifier;
        this.f43991E = i13;
        this.f43992F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43993w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                String str = this.f43994x;
                return AbstractC12836k.m36003e0(this.f43995y, str, this.f43996z, this.f43991E, this.f43992F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC23396c.m67735v(this.f43994x, this.f43995y, this.f43996z, this.f43991E, this.f43992F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C12832i(List list, String str, Modifier modifier, int i13, int i14) {
        this.f43995y = list;
        this.f43994x = str;
        this.f43996z = modifier;
        this.f43991E = i13;
        this.f43992F = i14;
    }
}
