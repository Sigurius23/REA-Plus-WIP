package io.sentry.android.replay;

import c93.InterfaceC4339a;
import io.sentry.util.C20588j;
import p530up.AbstractC35148d;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.C39412p;

/* JADX INFO: renamed from: io.sentry.android.replay.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20179a extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C20179a f75805x;

    /* JADX INFO: renamed from: y */
    public static final C20179a f75806y;

    /* JADX INFO: renamed from: z */
    public static final C20179a f75807z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75808w;

    static {
        int i13 = 0;
        f75805x = new C20179a(i13, 0);
        f75806y = new C20179a(i13, 1);
        f75807z = new C20179a(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20179a(int i13, int i14) {
        super(i13);
        this.f75808w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f75808w) {
            case 0:
                return new C39412p("_[a-z]");
            case 1:
                return new C20588j();
            default:
                return AbstractC35148d.m111152C();
        }
    }
}
