.class public final Lqn1/c$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqn1/c$f;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lqn1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lqn1/c;)V
    .locals 0

    iput-object p1, p0, Lqn1/c$f$a;->w:Lec3/m;

    iput-object p2, p0, Lqn1/c$f$a;->x:Lqn1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lqn1/c$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqn1/c$f$a$a;

    iget v1, v0, Lqn1/c$f$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqn1/c$f$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqn1/c$f$a$a;

    invoke-direct {v0, p0, p2}, Lqn1/c$f$a$a;-><init>(Lqn1/c$f$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lqn1/c$f$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqn1/c$f$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lqn1/c$f$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lqn1/c$f$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lqn1/c$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lqn1/c$f$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$a$a;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p0, Lqn1/c$f$a;->x:Lqn1/c;

    invoke-static {v2}, Lqn1/c;->c(Lqn1/c;)Lnn1/a;

    move-result-object v2

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    invoke-virtual {v5}, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;->getNotificationCards()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Lnn1/a;->m(I)V

    new-instance v6, Lqn1/d$k;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqn1/d$k;-><init>(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    instance-of v2, p1, Lpm0/a$a$b;

    if-nez v2, :cond_7

    instance-of v2, p1, Lpm0/a$e;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lpm0/a$c;

    if-nez v2, :cond_6

    instance-of p1, p1, Lpm0/a$d;

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    new-instance v6, Lqn1/d$c;

    invoke-direct {v6, v4, v3, v4}, Lqn1/d$c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_6
    :goto_1
    iget-object p1, p0, Lqn1/c$f$a;->x:Lqn1/c;

    invoke-static {p1}, Lqn1/c;->c(Lqn1/c;)Lnn1/a;

    move-result-object p1

    invoke-virtual {p1}, Lnn1/a;->n()V

    new-instance v6, Lqn1/d$c;

    invoke-direct {v6, v4, v3, v4}, Lqn1/d$c;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_7
    :goto_2
    sget-object v6, Lqn1/d$e;->a:Lqn1/d$e;

    :goto_3
    iput-object v4, v0, Lqn1/c$f$a$a;->y:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$f$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$f$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$f$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lqn1/c$f$a$a;->H:I

    iput v3, v0, Lqn1/c$f$a$a;->x:I

    invoke-interface {p2, v6, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
