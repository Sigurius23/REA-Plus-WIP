package n10;

import b20.EnumC2323c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C26116a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f103467E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC26118b f103468F;

    /* JADX INFO: renamed from: G */
    public int f103469G;

    /* JADX INFO: renamed from: w */
    public AbstractC26118b f103470w;

    /* JADX INFO: renamed from: x */
    public EnumC2323c f103471x;

    /* JADX INFO: renamed from: y */
    public String f103472y;

    /* JADX INFO: renamed from: z */
    public String f103473z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26116a(AbstractC26118b abstractC26118b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103468F = abstractC26118b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103467E = obj;
        this.f103469G |= Integer.MIN_VALUE;
        return this.f103468F.m77679a(null, null, null, null, null, this);
    }
}
