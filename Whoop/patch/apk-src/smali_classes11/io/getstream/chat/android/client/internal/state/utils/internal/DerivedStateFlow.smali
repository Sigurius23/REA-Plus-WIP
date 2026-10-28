.class public final Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/f2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/f2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0000\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00028\u00000\tH\u0097@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000eR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000fR\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;",
        "T",
        "Lec3/f2;",
        "Lkotlin/Function0;",
        "getValue",
        "Lec3/l;",
        "flow",
        "<init>",
        "(Lc93/a;Lec3/l;)V",
        "Lec3/m;",
        "collector",
        "",
        "collect",
        "(Lec3/m;Lq83/d;)Ljava/lang/Object;",
        "Lc93/a;",
        "Lec3/l;",
        "",
        "getReplayCache",
        "()Ljava/util/List;",
        "replayCache",
        "()Ljava/lang/Object;",
        "value",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final flow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final getValue:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc93/a;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "getValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->getValue:Lc93/a;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->flow:Lec3/l;

    return-void
.end method

.method public static final synthetic access$getFlow$p(Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;)Lec3/l;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->flow:Lec3/l;

    return-object p0
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;-><init>(Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p1, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;-><init>(Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;Lec3/m;Lq83/d;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$1;->label:I

    invoke-static {p2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->getValue:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->getValue:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
