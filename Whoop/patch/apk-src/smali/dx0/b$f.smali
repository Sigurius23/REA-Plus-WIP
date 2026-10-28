.class final Ldx0/b$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx0/b;->p(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V
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
    c = "com.whoop.dataSyncService.DataSyncServiceManager$sendSyncEvent$1"
    f = "DataSyncServiceManager.kt"
    l = {
        0x56
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field final synthetic z:Ldx0/b;


# direct methods
.method public constructor <init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Ldx0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
            "Ldx0/b;",
            "Lq83/d<",
            "-",
            "Ldx0/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldx0/b$f;->y:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iput-object p2, p0, Ldx0/b$f;->z:Ldx0/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Ldx0/b$f;

    iget-object v0, p0, Ldx0/b$f;->y:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iget-object v1, p0, Ldx0/b$f;->z:Ldx0/b;

    invoke-direct {p1, v0, v1, p2}, Ldx0/b$f;-><init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Ldx0/b;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ldx0/b$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldx0/b$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldx0/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldx0/b$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldx0/b$f;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Ldx0/b$f;->w:Ljava/lang/Object;

    check-cast v1, Ldt0/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Ldt0/b;

    new-instance v4, Ldt0/c;

    iget-object v5, v0, Ldx0/b$f;->y:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    iget-object v6, v0, Ldx0/b$f;->z:Ldx0/b;

    invoke-static {v6}, Ldx0/b;->a(Ldx0/b;)Ljava/time/Clock;

    move-result-object v6

    invoke-virtual {v6}, Ljava/time/Clock;->millis()J

    move-result-wide v6

    const/16 v15, 0x3c

    const/16 v16, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    invoke-direct/range {v4 .. v16}, Ldt0/c;-><init>(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v4}, Ldt0/b;-><init>(Ldt0/c;)V

    iget-object v4, v0, Ldx0/b$f;->z:Ldx0/b;

    invoke-static {v4}, Ldx0/b;->b(Ldx0/b;)Lec3/o1;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v0, Ldx0/b$f;->w:Ljava/lang/Object;

    iput v3, v0, Ldx0/b$f;->x:I

    invoke-interface {v4, v2, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
