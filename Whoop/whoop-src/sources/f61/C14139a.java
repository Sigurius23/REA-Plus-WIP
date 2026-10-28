package f61;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import fm1.C14600d;
import fm1.C14602f;
import g61.C15529b;
import i61.InterfaceC18153b;
import p710im1.AbstractC18658b;
import p710im1.C18665d0;

/* JADX INFO: renamed from: f61.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14139a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f50898E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f50899F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f50900G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f50901H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50902w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f50903x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f50904y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f50905z;

    public /* synthetic */ C14139a(C14147i c14147i, C15529b c15529b, InterfaceC18153b interfaceC18153b, boolean z4, boolean z13, int i13, int i14) {
        this.f50899F = c14147i;
        this.f50900G = c15529b;
        this.f50901H = interfaceC18153b;
        this.f50903x = z4;
        this.f50904y = z13;
        this.f50905z = i13;
        this.f50898E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50902w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C14147i.m40277W((C14147i) this.f50899F, (C15529b) this.f50900G, (InterfaceC18153b) this.f50901H, this.f50903x, this.f50904y, this.f50905z, this.f50898E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18658b.m54123h((C14602f) this.f50899F, this.f50903x, (C18665d0) this.f50900G, (C14600d) this.f50901H, this.f50904y, this.f50905z, this.f50898E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C14139a(C14602f c14602f, boolean z4, C18665d0 c18665d0, C14600d c14600d, boolean z13, int i13, int i14) {
        this.f50899F = c14602f;
        this.f50903x = z4;
        this.f50900G = c18665d0;
        this.f50901H = c14600d;
        this.f50904y = z13;
        this.f50905z = i13;
        this.f50898E = i14;
    }
}
