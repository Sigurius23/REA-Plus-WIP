.class public final Lsu0/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu0/b;->e()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.connectivityNotifications.deadbattery.DeadBatteryNotificationMonitorImpl$handleBatteryReadings$$inlined$flatMapLatest$1"
    f = "DeadBatteryNotificationMonitorImpl.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lsu0/b;


# direct methods
.method public constructor <init>(Lq83/d;Lsu0/b;)V
    .locals 0

    iput-object p2, p0, Lsu0/b$c;->z:Lsu0/b;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljk0/d;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lsu0/b$c;

    iget-object v1, p0, Lsu0/b$c;->z:Lsu0/b;

    invoke-direct {v0, p3, v1}, Lsu0/b$c;-><init>(Lq83/d;Lsu0/b;)V

    iput-object p1, v0, Lsu0/b$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lsu0/b$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lsu0/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lsu0/b$c;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsu0/b$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lsu0/b$c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsu0/b$c;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lsu0/b$c;->y:Ljava/lang/Object;

    check-cast v1, Ljk0/d;

    invoke-interface {v1}, Ljk0/d;->b()Lkk0/a;

    move-result-object v3

    invoke-virtual {v3}, Lkk0/a;->e()Lec3/l;

    move-result-object v3

    invoke-interface {v1}, Ljk0/d;->n()Lkk0/b;

    move-result-object v4

    invoke-virtual {v4}, Lkk0/b;->e()Lec3/l;

    move-result-object v4

    invoke-interface {v1}, Ljk0/d;->w0()Lst0/v;

    move-result-object v1

    iget-object v5, p0, Lsu0/b$c;->z:Lsu0/b;

    invoke-virtual {v5, v1}, Lsu0/b;->d(Lst0/v;)I

    move-result v1

    iget-object v5, p0, Lsu0/b$c;->z:Lsu0/b;

    invoke-static {v5}, Lsu0/b;->b(Lsu0/b;)Ljs0/c;

    move-result-object v5

    sget-object v6, Lcom/whoop/data/repositories/DeadBatteryReadingTimer;->INSTANCE:Lcom/whoop/data/repositories/DeadBatteryReadingTimer;

    invoke-virtual {v5}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object v5

    invoke-virtual {v6}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v9, Ljava/lang/Integer;

    invoke-virtual {v8, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_3

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    goto/16 :goto_0

    :cond_2
    move-object v5, v11

    goto/16 :goto_0

    :cond_3
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    goto :goto_0

    :cond_4
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    goto :goto_0

    :cond_5
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v5

    goto :goto_0

    :cond_6
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v8, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    goto :goto_0

    :cond_7
    const-class v10, Ljava/lang/String;

    invoke-virtual {v8, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-virtual {v5, v7}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    :cond_8
    move-object v5, v6

    :goto_0
    if-nez v5, :cond_9

    goto :goto_1

    :cond_9
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_b

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    new-instance v6, Lsu0/b$d;

    iget-object v7, p0, Lsu0/b$c;->z:Lsu0/b;

    invoke-direct {v6, v7, v1, v5, v11}, Lsu0/b$d;-><init>(Lsu0/b;IILq83/d;)V

    new-instance v1, Lec3/l1;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v4, v6, v5}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    iput-object v11, p0, Lsu0/b$c;->x:Ljava/lang/Object;

    iput-object v11, p0, Lsu0/b$c;->y:Ljava/lang/Object;

    iput v2, p0, Lsu0/b$c;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
