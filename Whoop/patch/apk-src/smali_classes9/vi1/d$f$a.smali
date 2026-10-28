.class public final Lvi1/d$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi1/d$f;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lvi1/d;


# direct methods
.method public constructor <init>(Lec3/m;Lvi1/d;)V
    .locals 0

    iput-object p1, p0, Lvi1/d$f$a;->w:Lec3/m;

    iput-object p2, p0, Lvi1/d$f$a;->x:Lvi1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lvi1/d$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvi1/d$f$a$a;

    iget v1, v0, Lvi1/d$f$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvi1/d$f$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvi1/d$f$a$a;

    invoke-direct {v0, p0, p2}, Lvi1/d$f$a$a;-><init>(Lvi1/d$f$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lvi1/d$f$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvi1/d$f$a$a;->x:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lvi1/d$f$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lvi1/d$f$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lvi1/d$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lvi1/d$f$a$a;->K:I

    iget-object v2, v0, Lvi1/d$f$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lpm0/a;

    iget-object v2, v0, Lvi1/d$f$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lvi1/d$f$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Lvi1/d$f$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v3, v0, Lvi1/d$f$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lvi1/d$f$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lvi1/d$f$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of p2, p1, Lpm0/a$e;

    const/4 v6, 0x0

    if-eqz p2, :cond_4

    sget-object p1, Lvi1/c$a;->a:Lvi1/c$a;

    goto :goto_3

    :cond_4
    instance-of p2, p1, Lpm0/a$a;

    if-eqz p2, :cond_5

    new-instance p2, Lvi1/c$c;

    iget-object v3, p0, Lvi1/d$f$a;->x:Lvi1/d;

    check-cast p1, Lpm0/a$a;

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    invoke-static {v3, p1}, Lvi1/d;->j(Lvi1/d;Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p1

    invoke-direct {p2, p1, v6, v4, v5}, Lvi1/c$c;-><init>(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_5
    instance-of p2, p1, Lpm0/a$d;

    if-eqz p2, :cond_6

    new-instance p2, Lvi1/c$c;

    iget-object v3, p0, Lvi1/d$f$a;->x:Lvi1/d;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    invoke-static {v3, p1}, Lvi1/d;->j(Lvi1/d;Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p1

    invoke-static {v3, p1}, Lvi1/d;->i(Lvi1/d;Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;)Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;

    move-result-object p1

    invoke-direct {p2, p1, v6, v4, v5}, Lvi1/c$c;-><init>(Lcom/whoop/health/monitor/medical/domain/model/HeartHealthBffModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_6
    instance-of p1, p1, Lpm0/a$c;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lvi1/d$f$a;->x:Lvi1/d;

    iput-object v5, v0, Lvi1/d$f$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lvi1/d$f$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Lvi1/d$f$a$a;->K:I

    iput v6, v0, Lvi1/d$f$a$a;->L:I

    iput v3, v0, Lvi1/d$f$a$a;->x:I

    invoke-static {p1, v0}, Lvi1/d;->e(Lvi1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_4

    :cond_7
    move p1, v6

    :goto_1
    move v6, p1

    :goto_2
    move-object p1, p2

    :goto_3
    iput-object v5, v0, Lvi1/d$f$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->H:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->I:Ljava/lang/Object;

    iput-object v5, v0, Lvi1/d$f$a$a;->J:Ljava/lang/Object;

    iput v6, v0, Lvi1/d$f$a$a;->K:I

    iput v4, v0, Lvi1/d$f$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
