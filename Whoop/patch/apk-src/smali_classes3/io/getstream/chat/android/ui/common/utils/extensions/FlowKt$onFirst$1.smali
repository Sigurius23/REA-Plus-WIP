.class final Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt;->onFirst(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;
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
        "\u0000\n\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"
    }
    d2 = {
        "T",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.utils.extensions.FlowKt$onFirst$1"
    f = "Flow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $onFirst:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $wasFirstEmission:Lkotlin/jvm/internal/b0;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/b0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->$wasFirstEmission:Lkotlin/jvm/internal/b0;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->$onFirst:Lkotlin/jvm/functions/Function1;

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

    new-instance v0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->$wasFirstEmission:Lkotlin/jvm/internal/b0;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->$onFirst:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;-><init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->L$0:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->$wasFirstEmission:Lkotlin/jvm/internal/b0;

    iget-boolean v1, p1, Lkotlin/jvm/internal/b0;->w:Z

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p1, Lkotlin/jvm/internal/b0;->w:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt$onFirst$1;->$onFirst:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
