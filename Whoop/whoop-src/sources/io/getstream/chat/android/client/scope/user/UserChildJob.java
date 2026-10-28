package io.getstream.chat.android.client.scope.user;

import bc3.InterfaceC2992b2;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3045p;
import bc3.InterfaceC3052r;
import bc3.InterfaceC3056s0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23457c;
import lc3.InterfaceC23833c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;
import xb3.InterfaceC38174i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0017\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\u001a\u0010\u0017\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0097\u0001¢\u0006\u0004\b\u0017\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0001H\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fH\u0096A¢\u0006\u0004\b \u0010!J*\u0010&\u001a\u00020%2\u0018\u0010$\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\f0\"j\u0002`#H\u0096\u0001¢\u0006\u0004\b&\u0010'J:\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0018\u0010$\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\f0\"j\u0002`#H\u0097\u0001¢\u0006\u0004\b&\u0010*J\u0018\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0097\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010-\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0096\u0003¢\u0006\u0004\b-\u00101J*\u00106\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00103*\u0002022\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0096\u0003¢\u0006\u0004\b6\u00107J>\u0010=\u001a\u00028\u0000\"\n\b\u0000\u00109*\u0004\u0018\u0001082\u0006\u0010:\u001a\u00028\u00002\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00028\u00000;H\u0096\u0001¢\u0006\u0004\b=\u0010>J\u001c\u0010?\u001a\u00020/2\n\u00105\u001a\u0006\u0012\u0002\b\u000304H\u0096\u0001¢\u0006\u0004\b?\u0010@R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0016\u0010F\u001a\u0004\u0018\u00010+8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010\u0015R\u0014\u0010H\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010\u0015R\u0014\u0010I\u001a\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010\u0015R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020+0J8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0018\u00105\u001a\u0006\u0012\u0002\b\u0003048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006T"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/user/UserChildJob;", "Lbc3/r;", "", "Lio/getstream/chat/android/models/UserId;", "userId", "delegate", "<init>", "(Ljava/lang/String;Lbc3/r;)V", "toString", "()Ljava/lang/String;", "Lbc3/b2;", "parentJob", "Ll83/a0;", "parentCancelled", "(Lbc3/b2;)V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "()V", "", "(Ljava/lang/Throwable;)Z", "child", "Lbc3/p;", "attachChild", "(Lbc3/r;)Lbc3/p;", "join", "(Lq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lbc3/s0;", "invokeOnCompletion", "(Lkotlin/jvm/functions/Function1;)Lbc3/s0;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;", "Lbc3/k1;", "other", "plus", "(Lbc3/k1;)Lbc3/k1;", "Lq83/j;", "context", "(Lq83/j;)Lq83/j;", "Lq83/h;", "E", "Lq83/i;", "key", "get", "(Lq83/i;)Lq83/h;", "", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;", "minusKey", "(Lq83/i;)Lq83/j;", "Ljava/lang/String;", "getUserId", "Lbc3/r;", "getParent", "()Lbc3/k1;", "parent", "isActive", "isCompleted", "isCancelled", "Lxb3/i;", "getChildren", "()Lxb3/i;", MapboxMap.QFE_CHILDREN, "Llc3/c;", "getOnJoin", "()Llc3/c;", "onJoin", "getKey", "()Lq83/i;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class UserChildJob implements InterfaceC3052r {
    private final InterfaceC3052r delegate;
    private final String userId;

    public UserChildJob(String str, InterfaceC3052r delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.userId = str;
        this.delegate = delegate;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r child) {
        AbstractC22676k.m65750j(child, "child");
        return this.delegate.attachChild(child);
    }

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    public final /* synthetic */ void cancel() {
        this.delegate.cancel();
    }

    @Override // q83.InterfaceC30063j
    public final <R> R fold(R initial, InterfaceC4351m operation) {
        AbstractC22676k.m65750j(operation, "operation");
        return (R) this.delegate.fold(initial, operation);
    }

    @Override // q83.InterfaceC30063j
    public final <E extends InterfaceC30061h> E get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return (E) this.delegate.get(key);
    }

    @Override // bc3.InterfaceC3027k1
    public final CancellationException getCancellationException() {
        return this.delegate.getCancellationException();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC38174i getChildren() {
        return this.delegate.getChildren();
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return this.delegate.getKey();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC23833c getOnJoin() {
        return this.delegate.getOnJoin();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3027k1 getParent() {
        return this.delegate.getParent();
    }

    public final String getUserId() {
        return this.userId;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(Function1 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        return this.delegate.invokeOnCompletion(handler);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isActive() {
        return this.delegate.isActive();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCompleted() {
        return this.delegate.isCompleted();
    }

    @Override // bc3.InterfaceC3027k1
    public final Object join(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.delegate.join(interfaceC30057d);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return this.delegate.minusKey(key);
    }

    @Override // bc3.InterfaceC3052r
    public final void parentCancelled(InterfaceC2992b2 parentJob) {
        AbstractC22676k.m65750j(parentJob, "parentJob");
        this.delegate.parentCancelled(parentJob);
    }

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    public final InterfaceC3027k1 plus(InterfaceC3027k1 other) {
        AbstractC22676k.m65750j(other, "other");
        return this.delegate.plus(other);
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean start() {
        return this.delegate.start();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("UserChildJob(userId='", this.userId, "')");
    }

    @Override // bc3.InterfaceC3027k1
    public final void cancel(CancellationException cause) {
        this.delegate.cancel(cause);
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, Function1 handler) {
        AbstractC22676k.m65750j(handler, "handler");
        return this.delegate.invokeOnCompletion(onCancelling, invokeImmediately, handler);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        return this.delegate.plus(context);
    }

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    public final /* synthetic */ boolean cancel(Throwable cause) {
        return this.delegate.cancel(cause);
    }
}
