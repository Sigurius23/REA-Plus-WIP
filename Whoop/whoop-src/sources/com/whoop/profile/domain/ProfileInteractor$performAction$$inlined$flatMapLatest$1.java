package com.whoop.profile.domain;

import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.domain.ProfileInteractor$performAction$$inlined$flatMapLatest$1", m100430f = "ProfileInteractor.kt", m100431l = {192, 189}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class ProfileInteractor$performAction$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ProfileInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileInteractor$performAction$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d, ProfileInteractor profileInteractor) {
        super(3, interfaceC30057d);
        this.this$0 = profileInteractor;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ProfileInteractor$performAction$$inlined$flatMapLatest$1 profileInteractor$performAction$$inlined$flatMapLatest$1 = new ProfileInteractor$performAction$$inlined$flatMapLatest$1(interfaceC30057d, this.this$0);
        profileInteractor$performAction$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        profileInteractor$performAction$$inlined$flatMapLatest$1.L$1 = abstractC30694b;
        return profileInteractor$performAction$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r8.m119657b("CommunityFollowerRefreshScope", r7) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (ec3.AbstractC13091v.m36613w(r1, r8, r7) == r0) goto L36;
     */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.profile.domain.ProfileInteractor$performAction$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p715kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (AbstractC30694b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
