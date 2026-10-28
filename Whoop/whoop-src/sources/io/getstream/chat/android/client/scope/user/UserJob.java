package io.getstream.chat.android.client.scope.user;

import bc3.InterfaceC3027k1;
import bc3.InterfaceC3045p;
import bc3.InterfaceC3052r;
import bc3.InterfaceC3056s0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.concurrent.CancellationException;
import l83.InterfaceC23457c;
import lc3.InterfaceC23833c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import xb3.InterfaceC38174i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/user/UserJob;", "Lbc3/u;", "", "Lio/getstream/chat/android/models/UserId;", "userId", "Ll83/a0;", "cancelChildren", "(Ljava/lang/String;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface UserJob extends InterfaceC3061u {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(UserJob userJob, R r10, InterfaceC4351m operation) {
            AbstractC22676k.m65750j(operation, "operation");
            return (R) AbstractC12889b.m36236B(userJob, r10, operation);
        }

        public static <E extends InterfaceC30061h> E get(UserJob userJob, InterfaceC30062i key) {
            AbstractC22676k.m65750j(key, "key");
            return (E) AbstractC12889b.m36238D(userJob, key);
        }

        public static InterfaceC30063j minusKey(UserJob userJob, InterfaceC30062i key) {
            AbstractC22676k.m65750j(key, "key");
            return AbstractC12889b.m36251Q(userJob, key);
        }

        @InterfaceC23457c
        public static InterfaceC3027k1 plus(UserJob userJob, InterfaceC3027k1 other) {
            AbstractC22676k.m65750j(other, "other");
            return other;
        }

        public static InterfaceC30063j plus(UserJob userJob, InterfaceC30063j context) {
            AbstractC22676k.m65750j(context, "context");
            return AbstractC12889b.m36254T(userJob, context);
        }
    }

    static /* synthetic */ void cancelChildren$default(UserJob userJob, String str, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelChildren");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        userJob.cancelChildren(str);
    }

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ InterfaceC3045p attachChild(InterfaceC3052r interfaceC3052r);

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    /* synthetic */ void cancel();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ void cancel(CancellationException cancellationException);

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    /* synthetic */ boolean cancel(Throwable th3);

    void cancelChildren(String userId);

    @Override // bc3.InterfaceC3061u
    /* synthetic */ boolean complete();

    @Override // bc3.InterfaceC3061u
    /* synthetic */ boolean completeExceptionally(Throwable th3);

    @Override // q83.InterfaceC30063j
    /* synthetic */ Object fold(Object obj, InterfaceC4351m interfaceC4351m);

    @Override // q83.InterfaceC30063j
    /* synthetic */ InterfaceC30061h get(InterfaceC30062i interfaceC30062i);

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ CancellationException getCancellationException();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ InterfaceC38174i getChildren();

    @Override // q83.InterfaceC30061h
    /* synthetic */ InterfaceC30062i getKey();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ InterfaceC23833c getOnJoin();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ InterfaceC3027k1 getParent();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ InterfaceC3056s0 invokeOnCompletion(Function1 function1);

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 function1);

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ boolean isActive();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ boolean isCancelled();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ boolean isCompleted();

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ Object join(InterfaceC30057d interfaceC30057d);

    @Override // q83.InterfaceC30063j
    /* synthetic */ InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i);

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    /* synthetic */ InterfaceC3027k1 plus(InterfaceC3027k1 interfaceC3027k1);

    @Override // q83.InterfaceC30063j
    /* synthetic */ InterfaceC30063j plus(InterfaceC30063j interfaceC30063j);

    @Override // bc3.InterfaceC3027k1
    /* synthetic */ boolean start();
}
