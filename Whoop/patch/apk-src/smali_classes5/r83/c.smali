.class public final Lr83/c;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:Lq83/d;


# direct methods
.method public constructor <init>(Lq83/d;Lq83/j;Lc93/m;Lq83/d;)V
    .locals 0

    iput-object p3, p0, Lr83/c;->x:Lc93/m;

    iput-object p4, p0, Lr83/c;->y:Lq83/d;

    invoke-direct {p0, p2, p1}, Ls83/c;-><init>(Lq83/j;Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lr83/c;->w:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lr83/c;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lr83/c;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p1, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"

    iget-object v0, p0, Lr83/c;->x:Lc93/m;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    iget-object p1, p0, Lr83/c;->y:Lq83/d;

    invoke-interface {v0, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
