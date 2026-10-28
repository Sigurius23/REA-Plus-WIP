package c11;

import c93.InterfaceC4339a;
import d11.C11469d;
import d11.C11474i;
import p715kotlin.jvm.functions.Function1;
import re1.AbstractC31323j;
import ud2.AbstractC34792a;
import zi1.C40691u;

/* JADX INFO: renamed from: c11.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3838e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15707w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f15708x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11474i f15709y;

    public /* synthetic */ C3838e(Function1 function1, C11474i c11474i) {
        this.f15707w = 3;
        this.f15709y = c11474i;
        this.f15708x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f15707w) {
            case 0:
                return AbstractC3841h.m11708N(this.f15708x, this.f15709y);
            case 1:
                return C11469d.m30772e(this.f15708x, this.f15709y);
            case 2:
                return C11469d.m30773f(this.f15708x, this.f15709y);
            case 3:
                return AbstractC31323j.m96334H(this.f15709y, this.f15708x);
            case 4:
                return AbstractC34792a.m109800f(this.f15708x, this.f15709y);
            default:
                return C40691u.m132133d(this.f15708x, this.f15709y);
        }
    }

    public /* synthetic */ C3838e(Function1 function1, C11474i c11474i, int i13) {
        this.f15707w = i13;
        this.f15708x = function1;
        this.f15709y = c11474i;
    }
}
