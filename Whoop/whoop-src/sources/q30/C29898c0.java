package q30;

import org.json.JSONObject;
import p127ev.C13668i;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q30.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29898c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C13668i f122152E;

    /* JADX INFO: renamed from: F */
    public int f122153F;

    /* JADX INFO: renamed from: w */
    public C13668i f122154w;

    /* JADX INFO: renamed from: x */
    public JSONObject f122155x;

    /* JADX INFO: renamed from: y */
    public String f122156y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f122157z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29898c0(C13668i c13668i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f122152E = c13668i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f122157z = obj;
        this.f122153F |= Integer.MIN_VALUE;
        return this.f122152E.m38533d(null, this);
    }
}
