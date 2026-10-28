.class public final Lnu1/d$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu1/d$g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lnu1/d;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Lnu1/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnu1/d$g$a;->w:Lec3/m;

    iput-object p2, p0, Lnu1/d$g$a;->x:Lnu1/d;

    iput-object p3, p0, Lnu1/d$g$a;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lnu1/d$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu1/d$g$a$a;

    iget v1, v0, Lnu1/d$g$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu1/d$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu1/d$g$a$a;

    invoke-direct {v0, p0, p2}, Lnu1/d$g$a$a;-><init>(Lnu1/d$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lnu1/d$g$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lnu1/d$g$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnu1/d$g$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lnu1/d$g$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lnu1/d$g$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lnu1/d$g$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    if-eqz v2, :cond_3

    new-instance v4, Lnu1/c;

    sget-object v5, Lnu1/a$b;->a:Lnu1/a$b;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lnu1/c;-><init>(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_3
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_4

    new-instance v4, Lnu1/c;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lnu1/c;-><init>(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    new-instance v4, Lnu1/c;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    const/16 v9, 0xd

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lnu1/c;-><init>(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lpm0/a$b;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lnu1/d$g$a;->x:Lnu1/d;

    invoke-static {v2}, Lnu1/d;->c(Lnu1/d;)Llu1/a;

    move-result-object v2

    new-instance v4, Lqu1/c$f;

    move-object v5, p1

    check-cast v5, Lpm0/a$b;

    invoke-virtual {v5}, Lpm0/a$b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Lqu1/c$f;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Llu1/a;->b(Lqu1/c$a;)V

    instance-of v2, v5, Lpm0/a$d;

    if-eqz v2, :cond_6

    new-instance v6, Lnu1/c;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;

    const/16 v11, 0xd

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lnu1/c;-><init>(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v6

    goto :goto_1

    :cond_6
    instance-of p1, v5, Lpm0/a$c;

    if-eqz p1, :cond_8

    new-instance v4, Lnu1/c;

    new-instance v5, Lnu1/a$c;

    iget-object p1, p0, Lnu1/d$g$a;->y:Ljava/lang/String;

    invoke-direct {v5, p1}, Lnu1/a$c;-><init>(Ljava/lang/String;)V

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lnu1/c;-><init>(Lnu1/a;Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lnu1/g;Lnu1/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Lnu1/d$g$a$a;->y:Ljava/lang/Object;

    iput-object p1, v0, Lnu1/d$g$a$a;->E:Ljava/lang/Object;

    iput-object p1, v0, Lnu1/d$g$a$a;->F:Ljava/lang/Object;

    iput-object p1, v0, Lnu1/d$g$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lnu1/d$g$a$a;->H:I

    iput v3, v0, Lnu1/d$g$a$a;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
