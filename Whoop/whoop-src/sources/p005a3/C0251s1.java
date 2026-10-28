package p005a3;

import p635y2.AbstractC39104j1;
import p635y2.EnumC39129s;
import p635y2.EnumC39132t;
import p635y2.InterfaceC39124q0;
import p636y3.C39169a;

/* JADX INFO: renamed from: a3.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0251s1 implements InterfaceC39124q0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f857w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39124q0 f858x;

    /* JADX INFO: renamed from: y */
    public final Enum f859y;

    /* JADX INFO: renamed from: z */
    public final Enum f860z;

    public /* synthetic */ C0251s1(InterfaceC39124q0 interfaceC39124q0, Enum r10, Enum r14, int i13) {
        this.f857w = i13;
        this.f858x = interfaceC39124q0;
        this.f859y = r10;
        this.f860z = r14;
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: C */
    public final int mo438C(int i13) {
        switch (this.f857w) {
            case 0:
                break;
        }
        return this.f858x.mo438C(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: O */
    public final int mo446O(int i13) {
        switch (this.f857w) {
            case 0:
                break;
        }
        return this.f858x.mo446O(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: Q */
    public final int mo447Q(int i13) {
        switch (this.f857w) {
            case 0:
                break;
        }
        return this.f858x.mo447Q(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: T */
    public final AbstractC39104j1 mo448T(long j7) {
        switch (this.f857w) {
            case 0:
                EnumC0257u1 enumC0257u1 = (EnumC0257u1) this.f859y;
                EnumC0260v1 enumC0260v1 = (EnumC0260v1) this.f860z;
                EnumC0260v1 enumC0260v2 = EnumC0260v1.f890w;
                InterfaceC39124q0 interfaceC39124q0 = this.f858x;
                if (enumC0260v1 == enumC0260v2) {
                    return new C0254t1(enumC0257u1 == EnumC0257u1.f879x ? interfaceC39124q0.mo447Q(C39169a.m124764h(j7)) : interfaceC39124q0.mo446O(C39169a.m124764h(j7)), C39169a.m124760d(j7) ? C39169a.m124764h(j7) : 32767, 0);
                }
                return new C0254t1(C39169a.m124761e(j7) ? C39169a.m124765i(j7) : 32767, enumC0257u1 == EnumC0257u1.f879x ? interfaceC39124q0.mo449b(C39169a.m124765i(j7)) : interfaceC39124q0.mo438C(C39169a.m124765i(j7)), 0);
            default:
                EnumC39129s enumC39129s = (EnumC39129s) this.f859y;
                EnumC39132t enumC39132t = (EnumC39132t) this.f860z;
                EnumC39132t enumC39132t2 = EnumC39132t.f168270w;
                InterfaceC39124q0 interfaceC39124q1 = this.f858x;
                if (enumC39132t == enumC39132t2) {
                    return new C0254t1(enumC39129s == EnumC39129s.f168268x ? interfaceC39124q1.mo447Q(C39169a.m124764h(j7)) : interfaceC39124q1.mo446O(C39169a.m124764h(j7)), C39169a.m124760d(j7) ? C39169a.m124764h(j7) : 32767, 1);
                }
                return new C0254t1(C39169a.m124761e(j7) ? C39169a.m124765i(j7) : 32767, enumC39129s == EnumC39129s.f168268x ? interfaceC39124q1.mo449b(C39169a.m124765i(j7)) : interfaceC39124q1.mo438C(C39169a.m124765i(j7)), 1);
        }
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: b */
    public final int mo449b(int i13) {
        switch (this.f857w) {
            case 0:
                break;
        }
        return this.f858x.mo449b(i13);
    }

    @Override // p635y2.InterfaceC39124q0
    /* JADX INFO: renamed from: p */
    public final Object mo454p() {
        switch (this.f857w) {
            case 0:
                break;
        }
        return this.f858x.mo454p();
    }
}
