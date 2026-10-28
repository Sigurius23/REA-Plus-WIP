package p702ch0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import l83.InterfaceC23459e;
import p132f0.C13821r1;
import p291l0.InterfaceC23001u;
import p715kotlin.jvm.functions.Function1;
import tp0.AbstractC34060e;

/* JADX INFO: renamed from: ch0.p0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4644p0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f18878E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f18879F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f18880G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f18881H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f18882I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18883w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18884x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f18885y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18886z;

    public /* synthetic */ C4644p0(InterfaceC23001u interfaceC23001u, boolean z4, C13821r1 c13821r1, InterfaceC4339a interfaceC4339a, int i13, InterfaceC4339a interfaceC4339a2, int i14, int i15, int i16) {
        this.f18883w = i16;
        this.f18884x = interfaceC23001u;
        this.f18885y = z4;
        this.f18886z = c13821r1;
        this.f18878E = interfaceC4339a;
        this.f18879F = i13;
        this.f18880G = interfaceC4339a2;
        this.f18881H = i14;
        this.f18882I = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18883w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4646q0.m14598m((InterfaceC23001u) this.f18884x, this.f18885y, (C13821r1) this.f18886z, (InterfaceC4339a) this.f18878E, this.f18879F, (InterfaceC4339a) this.f18880G, this.f18881H, this.f18882I, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC4646q0.m14600o((InterfaceC23001u) this.f18884x, this.f18885y, (C13821r1) this.f18886z, (InterfaceC4339a) this.f18878E, this.f18879F, (InterfaceC4339a) this.f18880G, this.f18881H, this.f18882I, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC34060e.m107653o(this.f18885y, (Function1) this.f18884x, (TextResource) this.f18886z, this.f18879F, (List) this.f18878E, (Function1) this.f18880G, this.f18881H, this.f18882I, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C4644p0(boolean z4, Function1 function1, TextResource textResource, int i13, List list, Function1 function2, int i14, int i15) {
        this.f18883w = 2;
        this.f18885y = z4;
        this.f18884x = function1;
        this.f18886z = textResource;
        this.f18879F = i13;
        this.f18878E = list;
        this.f18880G = function2;
        this.f18881H = i14;
        this.f18882I = i15;
    }
}
