.class public final Llx0/d$d$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llx0/d$d$a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Ldt0/c;


# direct methods
.method public constructor <init>(Lec3/m;Ldt0/c;)V
    .locals 0

    iput-object p1, p0, Llx0/d$d$a$a$a;->w:Lec3/m;

    iput-object p2, p0, Llx0/d$d$a$a$a;->x:Ldt0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Llx0/d$d$a$a$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Llx0/d$d$a$a$a$a;

    iget v3, v2, Llx0/d$d$a$a$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llx0/d$d$a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Llx0/d$d$a$a$a$a;

    invoke-direct {v2, v0, v1}, Llx0/d$d$a$a$a$a;-><init>(Llx0/d$d$a$a$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Llx0/d$d$a$a$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llx0/d$d$a$a$a$a;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Llx0/d$d$a$a$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Llx0/d$d$a$a$a$a;->E:Ljava/lang/Object;

    check-cast v2, Llx0/d$d$a$a$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Llx0/d$d$a$a$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lp82/c;

    instance-of v6, v4, Lp82/c$a;

    if-eqz v6, :cond_3

    new-instance v6, Llx0/a$a;

    check-cast v4, Lp82/c$a;

    invoke-virtual {v4}, Lp82/c$a;->b()Lcom/whoop/domain/model/MetricsProcessedTime;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/domain/model/MetricsProcessedTime;->getMillis()J

    move-result-wide v17

    invoke-virtual {v4}, Lp82/c$a;->a()Lyh2/b;

    move-result-object v4

    invoke-virtual {v4}, Lyh2/b;->f()J

    move-result-wide v14

    iget-object v8, v0, Llx0/d$d$a$a$a;->x:Ldt0/c;

    const/16 v19, 0x17

    const/16 v20, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/16 v16, 0x0

    invoke-static/range {v8 .. v20}, Ldt0/c;->b(Ldt0/c;Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;JJJIJILjava/lang/Object;)Ldt0/c;

    move-result-object v4

    invoke-direct {v6, v4}, Llx0/a$a;-><init>(Ldt0/c;)V

    goto :goto_1

    :cond_3
    instance-of v6, v4, Lp82/c$b;

    if-eqz v6, :cond_4

    new-instance v6, Llx0/a$b;

    iget-object v4, v0, Llx0/d$d$a$a$a;->x:Ldt0/c;

    invoke-direct {v6, v4}, Llx0/a$b;-><init>(Ldt0/c;)V

    goto :goto_1

    :cond_4
    sget-object v6, Lp82/c$c;->a:Lp82/c$c;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v6, Llx0/a$c;->a:Llx0/a$c;

    :goto_1
    const/4 v4, 0x0

    iput-object v4, v2, Llx0/d$d$a$a$a$a;->y:Ljava/lang/Object;

    iput-object v4, v2, Llx0/d$d$a$a$a$a;->E:Ljava/lang/Object;

    iput-object v4, v2, Llx0/d$d$a$a$a$a;->F:Ljava/lang/Object;

    iput-object v4, v2, Llx0/d$d$a$a$a$a;->G:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Llx0/d$d$a$a$a$a;->H:I

    iput v5, v2, Llx0/d$d$a$a$a$a;->x:I

    invoke-interface {v1, v6, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
