package x83;

import java.io.File;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x83.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C38087d extends AbstractC38090g {

    /* JADX INFO: renamed from: b */
    public boolean f163130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38087d(File rootFile) {
        super(rootFile);
        AbstractC22676k.m65750j(rootFile, "rootFile");
    }

    @Override // x83.AbstractC38090g
    /* JADX INFO: renamed from: a */
    public final File mo122036a() {
        if (this.f163130b) {
            return null;
        }
        this.f163130b = true;
        return this.f163136a;
    }
}
