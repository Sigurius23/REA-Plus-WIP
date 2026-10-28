.class final Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt;->combineStates(Lec3/f2;Lec3/f2;Lec3/f2;Lkotlin/jvm/functions/Function3;)Lec3/f2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0004\n\u0002\u0008\u0008\u0010\u0000\u001a\u0002H\u0001\"\u0004\u0008\u0000\u0010\u0001\"\u0004\u0008\u0001\u0010\u0002\"\u0004\u0008\u0002\u0010\u0003\"\u0004\u0008\u0003\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u00032\u0006\u0010\u0007\u001a\u0002H\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "R",
        "T1",
        "T2",
        "T3",
        "a",
        "b",
        "c"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt$combineStates$4"
    f = "DerivedStateFlow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $transform:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->$transform:Lkotlin/jvm/functions/Function3;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT1;TT2;TT3;",
            "Lq83/d<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->$transform:Lkotlin/jvm/functions/Function3;

    invoke-direct {v0, v1, p4}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;-><init>(Lkotlin/jvm/functions/Function3;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->L$2:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->L$0:Ljava/lang/Object;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->L$1:Ljava/lang/Object;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->L$2:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->label:I

    if-nez v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/utils/internal/DerivedStateFlowKt$combineStates$4;->$transform:Lkotlin/jvm/functions/Function3;

    invoke-interface {p1, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
