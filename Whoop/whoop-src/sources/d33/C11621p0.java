package d33;

import java.io.Serializable;
import s83.AbstractC32269c;
import stream.video.sfu.models.AndroidThermalState;

/* JADX INFO: renamed from: d33.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11621p0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Object f37516E;

    /* JADX INFO: renamed from: F */
    public AndroidThermalState f37517F;

    /* JADX INFO: renamed from: G */
    public boolean f37518G;

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f37519H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C11602h1 f37520I;

    /* JADX INFO: renamed from: J */
    public int f37521J;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37522w;

    /* JADX INFO: renamed from: x */
    public Object f37523x;

    /* JADX INFO: renamed from: y */
    public Serializable f37524y;

    /* JADX INFO: renamed from: z */
    public Serializable f37525z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11621p0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37520I = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37519H = obj;
        this.f37521J |= Integer.MIN_VALUE;
        return this.f37520I.m31024A(null, null, null, this);
    }
}
