package f61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import ly0.AbstractC24801e;
import p291l0.InterfaceC22997s1;
import p91.C29007a;

/* JADX INFO: renamed from: f61.f */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14144f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f50929E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f50930F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f50931G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50932w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f50933x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f50934y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f50935z;

    public /* synthetic */ C14144f(TextResource textResource, C2886a c2886a, TextResource textResource2, boolean z4, Modifier modifier, int i13) {
        this.f50935z = textResource;
        this.f50929E = c2886a;
        this.f50930F = textResource2;
        this.f50933x = z4;
        this.f50931G = modifier;
        this.f50934y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50932w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C14147i.m40290e0((C14147i) this.f50935z, (InterfaceC22997s1) this.f50929E, (List) this.f50930F, (C29007a) this.f50931G, this.f50933x, this.f50934y, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC24801e.m72694n((TextResource) this.f50935z, (C2886a) this.f50929E, (TextResource) this.f50930F, this.f50933x, (Modifier) this.f50931G, this.f50934y, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C14144f(C14147i c14147i, InterfaceC22997s1 interfaceC22997s1, List list, C29007a c29007a, boolean z4, int i13) {
        this.f50935z = c14147i;
        this.f50929E = interfaceC22997s1;
        this.f50930F = list;
        this.f50931G = c29007a;
        this.f50933x = z4;
        this.f50934y = i13;
    }
}
