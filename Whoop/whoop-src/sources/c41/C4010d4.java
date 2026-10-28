package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.Map;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32069a;

/* JADX INFO: renamed from: c41.d4 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4010d4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16298E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f16299F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f16300G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f16301H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16302w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16303x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f16304y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16305z;

    public /* synthetic */ C4010d4(Modifier modifier, TextResource textResource, TextResource textResource2, int i13, int i14, int i15, int i16) {
        this.f16303x = modifier;
        this.f16300G = textResource;
        this.f16301H = textResource2;
        this.f16304y = i13;
        this.f16305z = i14;
        this.f16298E = i15;
        this.f16299F = i16;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16302w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4017e4.m12207g(this.f16303x, (TextResource) this.f16300G, (TextResource) this.f16301H, this.f16304y, this.f16305z, this.f16298E, this.f16299F, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                AbstractC32069a.m99663a((String) this.f16300G, this.f16303x, this.f16304y, this.f16305z, (Map) this.f16301H, (Composer) obj, AbstractC28683x.m87244L(this.f16298E | 1), this.f16299F);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C4010d4(String str, Modifier modifier, int i13, int i14, Map map, int i15, int i16) {
        this.f16300G = str;
        this.f16303x = modifier;
        this.f16304y = i13;
        this.f16305z = i14;
        this.f16301H = map;
        this.f16298E = i15;
        this.f16299F = i16;
    }
}
