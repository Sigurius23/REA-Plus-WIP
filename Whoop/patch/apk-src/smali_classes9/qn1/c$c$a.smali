.class public final Lqn1/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqn1/c$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lvn1/a;

.field final synthetic z:Lqn1/c;


# direct methods
.method public constructor <init>(Lec3/m;Ljava/lang/String;Lvn1/a;Lqn1/c;)V
    .locals 0

    iput-object p1, p0, Lqn1/c$c$a;->w:Lec3/m;

    iput-object p2, p0, Lqn1/c$c$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lqn1/c$c$a;->y:Lvn1/a;

    iput-object p4, p0, Lqn1/c$c$a;->z:Lqn1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lqn1/c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqn1/c$c$a$a;

    iget v1, v0, Lqn1/c$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqn1/c$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqn1/c$c$a$a;

    invoke-direct {v0, p0, p2}, Lqn1/c$c$a$a;-><init>(Lqn1/c$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lqn1/c$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqn1/c$c$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lqn1/c$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lqn1/c$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lqn1/c$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lqn1/c$c$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$a$b;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    new-instance p1, Lqn1/d$i;

    iget-object v2, p0, Lqn1/c$c$a;->x:Ljava/lang/String;

    iget-object v5, p0, Lqn1/c$c$a;->y:Lvn1/a;

    invoke-direct {p1, v2, v5}, Lqn1/d$i;-><init>(Ljava/lang/String;Lvn1/a;)V

    goto :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    new-instance v5, Lqn1/d$k;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-virtual {p1}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->getCount()I

    move-result p1

    if-eqz p1, :cond_4

    move v7, v3

    goto :goto_1

    :cond_4
    move v7, v4

    :goto_1
    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lqn1/d$k;-><init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v5

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lqn1/c$c$a;->z:Lqn1/c;

    invoke-static {v2}, Lqn1/c;->c(Lqn1/c;)Lnn1/a;

    move-result-object v2

    iget-object v5, p0, Lqn1/c$c$a;->x:Ljava/lang/String;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-virtual {p1}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->getNotificationCards()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, v5, p1}, Lnn1/a;->g(Ljava/lang/String;Ljava/util/List;)Lnn1/a$b;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v2, Lqn1/d$b;

    invoke-virtual {p1}, Lnn1/a$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lnn1/a$b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lnn1/a$b;->d()I

    move-result p1

    invoke-direct {v2, v5, v6, p1}, Lqn1/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    move-object p1, v2

    goto :goto_2

    :cond_6
    sget-object p1, Lqn1/d$f;->a:Lqn1/d$f;

    goto :goto_2

    :cond_7
    sget-object p1, Lqn1/d$f;->a:Lqn1/d$f;

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lqn1/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lqn1/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lqn1/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lqn1/c$c$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lqn1/c$c$a$a;->H:I

    iput v3, v0, Lqn1/c$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
