.class final Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->onCreate(Landroid/os/Bundle;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.realtime.presentation.RealTimeRecordActivity$onCreate$2"
    f = "RealTimeRecordActivity.kt"
    l = {
        0xea
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/realtime/presentation/RealTimeRecordActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->y:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->y:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-direct {p1, v0, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;-><init>(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->y:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->N(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Lod1/c;

    move-result-object v1

    invoke-virtual {v1}, Lod1/c;->d()Lec3/l;

    move-result-object v1

    iput-object p1, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->x:I

    invoke-static {v1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->Y(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$f;->y:Lcom/whoop/realtime/presentation/RealTimeRecordActivity;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->O(Lcom/whoop/realtime/presentation/RealTimeRecordActivity;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to load cycle metadata from unified endpoint"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
