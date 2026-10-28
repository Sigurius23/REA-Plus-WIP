.class final Ldx0/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx0/d;->a(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldx0/d$a$b;
    }
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
    c = "com.whoop.dataSyncService.ProcessNowApiImpl$triggerSync$1"
    f = "ProcessNowApiImpl.kt"
    l = {
        0x25,
        0x34
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field w:J

.field x:J

.field y:I

.field final synthetic z:Ldx0/d;


# direct methods
.method public constructor <init>(Ldx0/d;Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldx0/d;",
            "Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;",
            "Lq83/d<",
            "-",
            "Ldx0/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    iput-object p2, p0, Ldx0/d$a;->E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

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

    new-instance p1, Ldx0/d$a;

    iget-object v0, p0, Ldx0/d$a;->z:Ldx0/d;

    iget-object v1, p0, Ldx0/d$a;->E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-direct {p1, v0, v1, p2}, Ldx0/d$a;-><init>(Ldx0/d;Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Ldx0/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldx0/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldx0/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldx0/d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ldx0/d$a;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v6, p0, Ldx0/d$a;->w:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->b(Ldx0/d;)Ljava/time/Clock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v6

    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->d(Ldx0/d;)La6/g;

    move-result-object p1

    new-instance v1, Ldx0/d$a$a;

    iget-object v8, p0, Ldx0/d$a;->E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-direct {v1, v6, v7, v8, v5}, Ldx0/d$a$a;-><init>(JLcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;Lq83/d;)V

    iput-wide v6, p0, Ldx0/d$a;->w:J

    iput v4, p0, Ldx0/d$a;->y:I

    invoke-static {p1, v1, p0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto/16 :goto_3

    :cond_3
    :goto_0
    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->f(Ldx0/d;)Ltr2/n;

    move-result-object p1

    iget-object v1, p0, Ldx0/d$a;->E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "ProcessNowApi stored trigger - source: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp: "

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v8, v2, [Lqr2/a$a;

    invoke-interface {p1, v1, v8}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->c(Ldx0/d;)Ljs0/c;

    move-result-object p1

    sget-object v1, Ldx0/c;->a:Ldx0/c;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v1}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v10, Ljava/lang/Long;

    invoke-virtual {v9, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_1

    :cond_4
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    goto :goto_1

    :cond_5
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    goto :goto_1

    :cond_6
    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    goto :goto_1

    :cond_7
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_a

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_1

    :cond_8
    const-class v5, Ljava/lang/String;

    invoke-virtual {v9, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p1, v8}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    :cond_9
    move-object v5, v1

    :cond_a
    :goto_1
    if-nez v5, :cond_b

    goto :goto_2

    :cond_b
    move-object v1, v5

    :goto_2
    if-eqz v1, :cond_e

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    iput-wide v6, p0, Ldx0/d$a;->w:J

    iput-wide v8, p0, Ldx0/d$a;->x:J

    iput v3, p0, Ldx0/d$a;->y:I

    invoke-static {v8, v9, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_3
    return-object v0

    :cond_c
    :goto_4
    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->f(Ldx0/d;)Ltr2/n;

    move-result-object p1

    iget-object v0, p0, Ldx0/d$a;->E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ProcessNowApi triggerSync called with source: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Ldx0/d$a;->E:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    sget-object v0, Ldx0/d$a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-ne p1, v4, :cond_d

    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->e(Ldx0/d;)Ldt0/d;

    move-result-object p1

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->SLEEP_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-interface {p1, v0}, Ldt0/d;->c(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V

    goto :goto_5

    :cond_d
    iget-object p1, p0, Ldx0/d$a;->z:Ldx0/d;

    invoke-static {p1}, Ldx0/d;->e(Ldx0/d;)Ldt0/d;

    move-result-object p1

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->ACTIVITY_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-interface {p1, v0}, Ldt0/d;->c(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_e
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Long"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
