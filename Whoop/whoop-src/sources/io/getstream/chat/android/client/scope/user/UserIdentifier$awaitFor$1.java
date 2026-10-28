package io.getstream.chat.android.client.scope.user;

import l83.C23468n;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.scope.user.UserIdentifier", m100430f = "UserIdentifier.kt", m100431l = {57}, m100432m = "awaitFor-0E7RQCE")
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UserIdentifier$awaitFor$1 extends AbstractC32269c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserIdentifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserIdentifier$awaitFor$1(UserIdentifier userIdentifier, InterfaceC30057d<? super UserIdentifier$awaitFor$1> interfaceC30057d) {
        super(interfaceC30057d);
        this.this$0 = userIdentifier;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM134221awaitFor0E7RQCE = this.this$0.m134221awaitFor0E7RQCE(null, 0L, this);
        return objM134221awaitFor0E7RQCE == EnumC31071a.f128113w ? objM134221awaitFor0E7RQCE : new C23468n(objM134221awaitFor0E7RQCE);
    }
}
