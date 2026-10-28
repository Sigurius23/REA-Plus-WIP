package w12;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.navigation.models.ChatHeaderMetadata;
import z41.AbstractC40075j;
import z41.C40072g;

/* JADX INFO: renamed from: w12.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36702e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f157165E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f157166F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f157167G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157168w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f157169x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f157170y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f157171z;

    public /* synthetic */ C36702e(Modifier modifier, C40072g c40072g, int i13, float f13, int i14, int i15) {
        this.f157169x = modifier;
        this.f157167G = c40072g;
        this.f157170y = i13;
        this.f157171z = f13;
        this.f157165E = i14;
        this.f157166F = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157168w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC36705h.m117840m((ChatHeaderMetadata) this.f157167G, this.f157169x, this.f157170y, this.f157171z, this.f157165E, this.f157166F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40075j.m128454g(this.f157169x, (C40072g) this.f157167G, this.f157170y, null, this.f157171z, this.f157165E, this.f157166F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C36702e(ChatHeaderMetadata chatHeaderMetadata, Modifier modifier, int i13, float f13, int i14, int i15) {
        this.f157167G = chatHeaderMetadata;
        this.f157169x = modifier;
        this.f157170y = i13;
        this.f157171z = f13;
        this.f157165E = i14;
        this.f157166F = i15;
    }
}
