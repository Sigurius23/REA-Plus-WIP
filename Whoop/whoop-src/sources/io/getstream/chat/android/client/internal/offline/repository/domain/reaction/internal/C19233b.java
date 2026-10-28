package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19233b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73871w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ReactionDao_Impl f73872x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ReactionEntity f73873y;

    public /* synthetic */ C19233b(ReactionDao_Impl reactionDao_Impl, ReactionEntity reactionEntity, int i13) {
        this.f73871w = i13;
        this.f73872x = reactionDao_Impl;
        this.f73873y = reactionEntity;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73871w) {
            case 0:
                ReactionDao_Impl.insert$lambda$0(this.f73872x, this.f73873y, (InterfaceC33687a) obj);
                break;
            default:
                ReactionDao_Impl.delete$lambda$1(this.f73872x, this.f73873y, (InterfaceC33687a) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
