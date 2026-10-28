package io.getstream.chat.android.client.internal.state.utils.internal;

import com.whoop.membership.management.MembershipManagementFragment;
import com.whoop.membership.management.navigation.AbstractC9127b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.utils.internal.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19381d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73928w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73929x;

    public /* synthetic */ C19381d(Object obj, int i13) {
        this.f73928w = i13;
        this.f73929x = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l83.h] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73928w) {
            case 0:
                return this.f73929x;
            case 1:
                ((Integer) obj).intValue();
                return this.f73929x;
            default:
                return MembershipManagementFragment.m22769R(this.f73929x, (AbstractC9127b) obj);
        }
    }
}
