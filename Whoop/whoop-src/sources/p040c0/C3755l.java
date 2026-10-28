package p040c0;

import c93.InterfaceC4351m;
import p077d0.AbstractC11348f;
import p636y3.C39180l;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3755l extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C3755l f15346x;

    /* JADX INFO: renamed from: y */
    public static final C3755l f15347y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15348w;

    static {
        int i13 = 2;
        f15346x = new C3755l(i13, 0);
        f15347y = new C3755l(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3755l(int i13, int i14) {
        super(i13);
        this.f15348w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15348w) {
            case 0:
                long j7 = ((C39180l) obj).f168422a;
                long j13 = ((C39180l) obj2).f168422a;
                long j14 = 1;
                return AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39180l((j14 & 4294967295L) | (j14 << 32)));
            default:
                EnumC3771q0 enumC3771q0 = (EnumC3771q0) obj2;
                return Boolean.valueOf(((EnumC3771q0) obj) == enumC3771q0 && enumC3771q0 == EnumC3771q0.f15394y);
        }
    }
}
