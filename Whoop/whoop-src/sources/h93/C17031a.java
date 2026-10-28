package h93;

import g93.AbstractC15609a;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h93.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C17031a extends AbstractC15609a {
    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: c */
    public final double mo43931c(double d3) {
        return ThreadLocalRandom.current().nextDouble(d3);
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: h */
    public final int mo43933h(int i13, int i14) {
        return ThreadLocalRandom.current().nextInt(i13, i14);
    }

    @Override // g93.AbstractC15609a
    /* JADX INFO: renamed from: i */
    public final Random mo43930i() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC22676k.m65749i(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
