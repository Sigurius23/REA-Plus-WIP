.class final Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ljava/lang/Void;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlow$collect$2"
    f = "DerivedStateFlow.kt"
    l = {
        0x2e,
        0x2e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $collector:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow<",
            "TT;>;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->this$0:Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->$collector:Lec3/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->this$0:Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->$collector:Lec3/m;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;-><init>(Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;Lec3/m;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->this$0:Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;->access$getFlow$p(Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow;)Lec3/l;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    iput-object v3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->L$0:Ljava/lang/Object;

    iput v5, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->label:I

    invoke-static {p1, v0, p0}, Lec3/v;->N(Lec3/l;Lbc3/c0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lec3/f2;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->$collector:Lec3/m;

    iput-object v3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->L$0:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlow$collect$2;->label:I

    invoke-interface {p1, v0, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method
