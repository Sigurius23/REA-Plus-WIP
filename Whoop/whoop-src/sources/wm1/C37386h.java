package wm1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: wm1.h */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C37386h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f159922E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f159923F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f159924w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f159925x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37381c f159926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37380b f159927z;

    public /* synthetic */ C37386h(Modifier modifier, C37381c c37381c, C37380b c37380b, int i13, int i14, int i15) {
        this.f159924w = i15;
        this.f159925x = modifier;
        this.f159926y = c37381c;
        this.f159927z = c37380b;
        this.f159922E = i13;
        this.f159923F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f159924w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f159925x;
                return AbstractC37389k.m119734w(this.f159926y, this.f159927z, modifier, this.f159922E, this.f159923F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC37389k.m119695C(this.f159925x, this.f159926y, this.f159927z, this.f159922E, this.f159923F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC37389k.m119737z(this.f159925x, this.f159926y, this.f159927z, this.f159922E, this.f159923F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C37386h(C37381c c37381c, C37380b c37380b, Modifier modifier, int i13, int i14) {
        this.f159924w = 0;
        this.f159926y = c37381c;
        this.f159927z = c37380b;
        this.f159925x = modifier;
        this.f159922E = i13;
        this.f159923F = i14;
    }
}
