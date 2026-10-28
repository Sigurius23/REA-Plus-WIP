package io.getstream.chat.android.client.scope.user;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3045p;
import bc3.InterfaceC3052r;
import bc3.InterfaceC3056s0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00028\u00002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001a*\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u001f2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010)\u001a\u00020$2\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0014\u0010-\u001a\u00060+j\u0002`,H\u0097\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020$H\u0096\u0001¢\u0006\u0004\b/\u0010&J \u00101\u001a\u00020\u00102\u000e\u00100\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00101\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b1\u00103J\u001a\u00101\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010'H\u0097\u0001¢\u0006\u0004\b1\u0010*J\u0010\u00104\u001a\u00020\u0010H\u0096A¢\u0006\u0004\b4\u00105J*\u0010:\u001a\u0002092\u0018\u00108\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u001006j\u0002`7H\u0096\u0001¢\u0006\u0004\b:\u0010;J:\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020$2\u0018\u00108\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u001006j\u0002`7H\u0097\u0001¢\u0006\u0004\b:\u0010>J\u0018\u0010A\u001a\u00020?2\u0006\u0010@\u001a\u00020?H\u0097\u0003¢\u0006\u0004\bA\u0010BJ\u0018\u0010A\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\u001fH\u0096\u0003¢\u0006\u0004\bA\u0010DR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010?8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010&R\u0014\u0010Q\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010&R\u0014\u0010R\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010&R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020?0S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0018\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006]"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/user/UserJobImpl;", "Lbc3/u;", "Lio/getstream/chat/android/client/scope/user/UserJob;", "delegate", "Lkotlin/Function0;", "", "Lio/getstream/chat/android/models/UserId;", "getUserId", "<init>", "(Lbc3/u;Lc93/a;)V", "Lbc3/r;", "child", "Lbc3/p;", "attachChild", "(Lbc3/r;)Lbc3/p;", "userId", "Ll83/a0;", "cancelChildren", "(Ljava/lang/String;)V", "R", "initial", "Lkotlin/Function2;", "Lq83/h;", "operation", "fold", "(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;", "E", "Lq83/i;", "key", "get", "(Lq83/i;)Lq83/h;", "Lq83/j;", "minusKey", "(Lq83/i;)Lq83/j;", "toString", "()Ljava/lang/String;", "", "complete", "()Z", "", "exception", "completeExceptionally", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "start", "cause", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "()V", "join", "(Lq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lbc3/s0;", "invokeOnCompletion", "(Lkotlin/jvm/functions/Function1;)Lbc3/s0;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;", "Lbc3/k1;", "other", "plus", "(Lbc3/k1;)Lbc3/k1;", "context", "(Lq83/j;)Lq83/j;", "Lbc3/u;", "Lc93/a;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "getParent", "()Lbc3/k1;", "parent", "isActive", "isCompleted", "isCancelled", "Lxb3/i;", "getChildren", "()Lxb3/i;", MapboxMap.QFE_CHILDREN, "Llc3/c;", "getOnJoin", "()Llc3/c;", "onJoin", "getKey", "()Lq83/i;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class UserJobImpl implements InterfaceC3061u, UserJob {
    private final InterfaceC3061u delegate;
    private final InterfaceC4339a getUserId;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    public UserJobImpl(InterfaceC3061u delegate, InterfaceC4339a getUserId) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(getUserId, "getUserId");
        this.delegate = delegate;
        this.getUserId = getUserId;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:UserJob");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r child) {
        AbstractC22676k.m65750j(child, "child");
        return this.delegate.attachChild(new UserChildJob((String) this.getUserId.invoke(), child));
    }

    @Override // bc3.InterfaceC3027k1
    @InterfaceC23457c
    public final /* synthetic */ void cancel() {
        this.delegate.cancel();
    }

    @Override // io.getstream.chat.android.client.scope.user.UserJob
    public final void cancelChildren(String userId) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[cancelChildren] userId: '", userId, "'"), null);
        }
        for (InterfaceC3027k1 interfaceC3027k1 : this.delegate.getChildren()) {
            if (!(interfaceC3027k1 instanceof UserChildJob) || AbstractC22676k.m65745e(((UserChildJob) interfaceC3027k1).getUserId(), userId) || userId == null) {
                C2345k logger2 = getLogger();
                InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                    logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[cancelChildren] cancel child: " + interfaceC3027k1 + ")", null);
                }
                interfaceC3027k1.cancel((CancellationException) null);
            } else {
                C2345k logger3 = getLogger();
                InterfaceC2339e interfaceC2339eM7232c3 = logger3.m7232c();
                EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
                if (interfaceC2339eM7232c3.isLoggable(enumC2341g3, logger3.m7231b())) {
                    logger3.m7230a().log(enumC2341g3, logger3.m7231b(), "[cancelChildren] skip child: " + interfaceC3027k1 + ")", null);
                }
            }
        }
    }

    @Override // bc3.InterfaceC3061u
    public final boolean complete() {
        return this.delegate.complete();
    }

    @Override // bc3.InterfaceC3061u
    public final boolean completeExceptionally(Throwable exception) {
        AbstractC22676k.m65750j(exception, "exception");
        return this.delegate.completeExceptionally(exception);
    }

    @Override // q83.InterfaceC30063j
    public final <R> R fold(R initial, InterfaceC4351m operation) {
        AbstractC22676k.m65750j(operation, "operation");
        return (R) AbstractC12889b.m36236B(this, initial, operation);
    }

    @Override // q83.InterfaceC30063j
    public final <E extends InterfaceC30061h> E get(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        return (E) AbstractC12889b.m36238D(this, key);
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
        return AbstractC12889b.m36251Q(this, key);
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
        return AbstractC18489d0.m53369j(this.getUserId.invoke(), "UserJob(userId=", ")");
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
