package p027b3;

import androidx.compose.p018ui.platform.AndroidComposeView;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b3.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C2470z extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f9621w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AndroidComposeView f9622x;

    /* JADX INFO: renamed from: y */
    public int f9623y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470z(AndroidComposeView androidComposeView, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9622x = androidComposeView;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f9621w = obj;
        this.f9623y |= Integer.MIN_VALUE;
        this.f9622x.m3581N(null, this);
        return EnumC31071a.f128113w;
    }
}
