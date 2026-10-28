package io.ktor.utils.p228io;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.ktor.utils.io.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C20030w extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C20030w f75140x;

    /* JADX INFO: renamed from: y */
    public static final C20030w f75141y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75142w;

    static {
        int i13 = 1;
        f75140x = new C20030w(i13, 0);
        f75141y = new C20030w(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20030w(int i13, int i14) {
        super(i13);
        this.f75142w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75142w) {
            case 0:
                Throwable it = (Throwable) obj;
                AbstractC22676k.m65750j(it, "it");
                break;
            default:
                Throwable it3 = (Throwable) obj;
                AbstractC22676k.m65750j(it3, "it");
                break;
        }
        return null;
    }
}
