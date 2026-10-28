package p392p3;

import java.util.List;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C28760b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f116498E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C28762c f116499F;

    /* JADX INFO: renamed from: G */
    public int f116500G;

    /* JADX INFO: renamed from: w */
    public List f116501w;

    /* JADX INFO: renamed from: x */
    public C28786x f116502x;

    /* JADX INFO: renamed from: y */
    public int f116503y;

    /* JADX INFO: renamed from: z */
    public int f116504z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28760b(C28762c c28762c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116499F = c28762c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116498E = obj;
        this.f116500G |= Integer.MIN_VALUE;
        return this.f116499F.m87526a(this);
    }
}
