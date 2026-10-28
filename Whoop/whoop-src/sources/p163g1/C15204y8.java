package p163g1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i40.C18080n;
import i40.EnumC18075i;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.y8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15204y8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37816b f57082E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f57083F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Enum f57084G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function3 f57085H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f57087x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f57088y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f57089z;

    public /* synthetic */ C15204y8(Object obj, Enum r10, long j7, long j13, Function3 function3, boolean z4, C37816b c37816b, int i13, int i14) {
        this.f57086w = i14;
        this.f57083F = obj;
        this.f57084G = r10;
        this.f57087x = j7;
        this.f57088y = j13;
        this.f57085H = function3;
        this.f57089z = z4;
        this.f57082E = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57086w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1769473);
                ((C14956a9) this.f57083F).m43081a((EnumC15016g3) this.f57084G, this.f57087x, this.f57088y, (C15032h8) this.f57085H, this.f57089z, this.f57082E, (Composer) obj, iM87244L);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(1769473);
                ((C18080n) this.f57083F).m51918a((EnumC18075i) this.f57084G, this.f57087x, this.f57088y, (C15032h8) this.f57085H, this.f57089z, this.f57082E, (Composer) obj, iM87244L2);
                break;
        }
        return C23454a0.f92919a;
    }
}
