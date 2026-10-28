.class public final Lt12/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt12/c$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lt12/c;

.field final synthetic y:La12/a;


# direct methods
.method public constructor <init>(Lec3/m;Lt12/c;La12/a;)V
    .locals 0

    iput-object p1, p0, Lt12/c$c$a;->w:Lec3/m;

    iput-object p2, p0, Lt12/c$c$a;->x:Lt12/c;

    iput-object p3, p0, Lt12/c$c$a;->y:La12/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lt12/c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt12/c$c$a$a;

    iget v1, v0, Lt12/c$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt12/c$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt12/c$c$a$a;

    invoke-direct {v0, p0, p2}, Lt12/c$c$a$a;-><init>(Lt12/c$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lt12/c$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt12/c$c$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lt12/c$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lt12/c$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lt12/c$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lt12/c$c$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    :goto_1
    move-object p1, v5

    goto/16 :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lt12/c$c$a;->x:Lt12/c;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v2, p1}, Lt12/c;->e(Lt12/c;Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;

    move-result-object p1

    goto/16 :goto_2

    :cond_4
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lt12/c$c$a;->x:Lt12/c;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v2, p1}, Lt12/c;->e(Lt12/c;Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$d;

    const-string v6, ". "

    const-string v7, "DayZeroHeaderWidgets"

    if-eqz v2, :cond_6

    iget-object v2, p0, Lt12/c$c$a;->x:Lt12/c;

    invoke-static {v2}, Lt12/c;->d(Lt12/c;)Ltr2/n;

    move-result-object v2

    iget-object v8, p0, Lt12/c$c$a;->y:La12/a;

    invoke-virtual {v8}, La12/a;->c()Ljava/lang/String;

    move-result-object v8

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Header fetch failed, serving stale. Path: "

    invoke-static {v10, v8, v6, v9}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v8, v4, [Lqr2/a$a;

    invoke-interface {v2, v7, v6, v8}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v2, p0, Lt12/c$c$a;->x:Lt12/c;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v2, p1}, Lt12/c;->e(Lt12/c;Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;

    move-result-object p1

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lpm0/a$c;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lt12/c$c$a;->x:Lt12/c;

    invoke-static {v2}, Lt12/c;->d(Lt12/c;)Ltr2/n;

    move-result-object v2

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v8

    iget-object v9, p0, Lt12/c$c$a;->y:La12/a;

    invoke-virtual {v9}, La12/a;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v10, "Header fetch failed with HTTP "

    const-string v11, ". Path: "

    invoke-static {v8, v10, v11, v9, v6}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {v2, v7, p1, v6}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_1

    :goto_2
    iput-object v5, v0, Lt12/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Lt12/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lt12/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lt12/c$c$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lt12/c$c$a$a;->H:I

    iput v3, v0, Lt12/c$c$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
