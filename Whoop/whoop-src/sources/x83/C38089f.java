package x83;

import java.io.File;
import java.util.ArrayDeque;
import m83.AbstractC25236b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x83.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C38089f extends AbstractC25236b {

    /* JADX INFO: renamed from: y */
    public final ArrayDeque f163134y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38091h f163135z;

    public C38089f(C38091h c38091h) {
        this.f163135z = c38091h;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f163134y = arrayDeque;
        File file = (File) c38091h.f163138b;
        if (file.isDirectory()) {
            arrayDeque.push(m122037b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C38087d(file));
        } else {
            this.f99114w = 2;
        }
    }

    @Override // m83.AbstractC25236b
    /* JADX INFO: renamed from: a */
    public final void mo73981a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f163134y;
            AbstractC38090g abstractC38090g = (AbstractC38090g) arrayDeque.peek();
            if (abstractC38090g == null) {
                file = null;
                break;
            }
            File fileMo122036a = abstractC38090g.mo122036a();
            if (fileMo122036a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo122036a.equals(abstractC38090g.f163136a) || !fileMo122036a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    file = fileMo122036a;
                    break;
                }
                arrayDeque.push(m122037b(fileMo122036a));
            }
        }
        if (file == null) {
            this.f99114w = 2;
        } else {
            this.f99115x = file;
            this.f99114w = 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC38085b m122037b(File rootDir) {
        int iOrdinal = ((EnumC38092i) this.f163135z.f163139c).ordinal();
        if (iOrdinal == 0) {
            AbstractC22676k.m65750j(rootDir, "rootDir");
            return new C38088e(rootDir);
        }
        if (iOrdinal == 1) {
            return new C38086c(this, rootDir);
        }
        throw new NoWhenBranchMatchedException();
    }
}
