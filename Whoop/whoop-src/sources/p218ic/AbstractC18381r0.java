package p218ic;

import java.util.Set;
import java.util.UUID;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.r0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18381r0 {

    /* JADX INFO: renamed from: a */
    public final UUID f71547a;

    /* JADX INFO: renamed from: b */
    public final C30207q f71548b;

    /* JADX INFO: renamed from: c */
    public final Set f71549c;

    public AbstractC18381r0(UUID id4, C30207q workSpec, Set tags) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(workSpec, "workSpec");
        AbstractC22676k.m65750j(tags, "tags");
        this.f71547a = id4;
        this.f71548b = workSpec;
        this.f71549c = tags;
    }
}
