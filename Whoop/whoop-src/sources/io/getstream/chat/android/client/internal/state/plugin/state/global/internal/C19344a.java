package io.getstream.chat.android.client.internal.state.plugin.state.global.internal;

import io.getstream.chat.android.models.Location;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.global.internal.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19344a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73914w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MutableGlobalState f73915x;

    public /* synthetic */ C19344a(MutableGlobalState mutableGlobalState, int i13) {
        this.f73914w = i13;
        this.f73915x = mutableGlobalState;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f73914w) {
            case 0:
                return MutableGlobalState.m54861a(this.f73915x, (List) obj);
            default:
                return Boolean.valueOf(MutableGlobalState.nonExpiredPredicate$lambda$16(this.f73915x, (Location) obj));
        }
    }
}
