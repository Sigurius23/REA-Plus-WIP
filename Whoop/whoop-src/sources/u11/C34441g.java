package u11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import s93.AbstractC32306h;

/* JADX INFO: renamed from: u11.g */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34441g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144715w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f144716x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f144717y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f144718z;

    public /* synthetic */ C34441g(String str, String str2, InterfaceC4339a interfaceC4339a) {
        this.f144716x = str;
        this.f144717y = str2;
        this.f144718z = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f144715w) {
            case 0:
                return AbstractC34443i.m108859i0(this.f144716x, this.f144717y, this.f144718z, composer, num.intValue());
            default:
                num.getClass();
                AbstractC32306h.m100553a(this.f144716x, this.f144717y, this.f144718z, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C34441g(String str, String str2, InterfaceC4339a interfaceC4339a, int i13) {
        this.f144716x = str;
        this.f144717y = str2;
        this.f144718z = interfaceC4339a;
    }
}
