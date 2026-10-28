package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import io.getstream.chat.android.models.SyncStatus;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19232a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73867w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ReactionDao_Impl f73868x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ SyncStatus f73869y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f73870z;

    public /* synthetic */ C19232a(ReactionDao_Impl reactionDao_Impl, SyncStatus syncStatus, int i13, int i14) {
        this.f73867w = i14;
        this.f73868x = reactionDao_Impl;
        this.f73869y = syncStatus;
        this.f73870z = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73867w) {
            case 0:
                return ReactionDao_Impl.m54759j(this.f73868x, this.f73869y, this.f73870z, (InterfaceC33687a) obj);
            default:
                return ReactionDao_Impl.m54753d(this.f73868x, this.f73869y, this.f73870z, (InterfaceC33687a) obj);
        }
    }
}
