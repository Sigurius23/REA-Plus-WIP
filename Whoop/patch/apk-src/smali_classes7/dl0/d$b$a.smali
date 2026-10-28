.class public final Ldl0/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldl0/d$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Ldl0/d;

.field final synthetic y:La12/a;


# direct methods
.method public constructor <init>(Lec3/m;Ldl0/d;La12/a;)V
    .locals 0

    iput-object p1, p0, Ldl0/d$b$a;->w:Lec3/m;

    iput-object p2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    iput-object p3, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Ldl0/d$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldl0/d$b$a$a;

    iget v1, v0, Ldl0/d$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldl0/d$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldl0/d$b$a$a;

    invoke-direct {v0, p0, p2}, Ldl0/d$b$a$a;-><init>(Ldl0/d$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldl0/d$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldl0/d$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldl0/d$b$a$a;->H:Ljava/lang/Object;

    check-cast p1, Ldl0/c;

    iget-object p1, v0, Ldl0/d$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ldl0/d$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Ldl0/d$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ldl0/d$b$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    move-object p1, v5

    goto/16 :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/whoop/design/models/items/UnknownDesignModel;

    if-eqz v2, :cond_4

    iget-object p1, p0, Ldl0/d$b$a;->x:Ldl0/d;

    iget-object v2, p0, Ldl0/d$b$a;->y:La12/a;

    sget-object v6, Ldl0/e$b;->UNSUPPORTED:Ldl0/e$b;

    invoke-static {p1, v2, v6}, Ldl0/d;->g(Ldl0/d;La12/a;Ldl0/e$b;)V

    iget-object p1, p0, Ldl0/d$b$a;->x:Ldl0/d;

    iget-object v2, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-static {p1, v2}, Ldl0/d;->h(Ldl0/d;La12/a;)Ldl0/c;

    move-result-object p1

    goto/16 :goto_2

    :cond_4
    iget-object v2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    invoke-static {v2}, Ldl0/d;->e(Ldl0/d;)Liy1/c;

    move-result-object v2

    sget-object v6, Ldl0/e;->a:Ldl0/e;

    iget-object v7, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-virtual {v7}, La12/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ldl0/e;->g(Ljava/lang/String;)Ljy1/a;

    move-result-object v6

    invoke-interface {v2, v6}, Liy1/c;->b(Ljy1/a;)V

    new-instance v2, Ldl0/c;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {v2, v5, p1, v3, v5}, Ldl0/c;-><init>(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object p1, v2

    goto/16 :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_7

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/whoop/design/models/items/UnknownDesignModel;

    if-eqz v2, :cond_6

    iget-object p1, p0, Ldl0/d$b$a;->x:Ldl0/d;

    iget-object v2, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-static {p1, v2}, Ldl0/d;->h(Ldl0/d;La12/a;)Ldl0/c;

    move-result-object p1

    goto/16 :goto_2

    :cond_6
    new-instance v2, Ldl0/c;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {v2, v5, p1, v3, v5}, Ldl0/c;-><init>(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_7
    instance-of v2, p1, Lpm0/a$c;

    const/4 v6, 0x2

    const-string v7, ". "

    const-string v8, "CMAW"

    if-eqz v2, :cond_9

    iget-object v2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    iget-object v9, p0, Ldl0/d$b$a;->y:La12/a;

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v10

    invoke-static {v2, v10}, Ldl0/d;->f(Ldl0/d;I)Ldl0/e$b;

    move-result-object v10

    invoke-static {v2, v9, v10}, Ldl0/d;->g(Ldl0/d;La12/a;Ldl0/e$b;)V

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    invoke-static {v2}, Ldl0/d;->d(Ldl0/d;)Ltr2/n;

    move-result-object v2

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v9

    iget-object v10, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-virtual {v10}, La12/a;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v11, "Fetch failed with HTTP "

    const-string v12, ". Path: "

    invoke-static {v9, v11, v12, v10, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v2, v8, p1, v7}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ldl0/c;

    new-instance v2, Ldl0/a$d;

    iget-object v7, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-virtual {v7}, La12/a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7}, Ldl0/a$d;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v2, v5, v6, v5}, Ldl0/c;-><init>(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_8
    iget-object v2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    invoke-static {v2}, Ldl0/d;->d(Ldl0/d;)Ltr2/n;

    move-result-object v2

    iget-object v9, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-virtual {v9}, La12/a;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v10, "Fetch failed with network error (no data). Path: "

    invoke-static {v10, v9, v7, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v2, v8, p1, v7}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ldl0/c;

    sget-object v2, Ldl0/a$c;->a:Ldl0/a$c;

    invoke-direct {p1, v2, v5, v6, v5}, Ldl0/c;-><init>(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_9
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_b

    iget-object v2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    iget-object v9, p0, Ldl0/d$b$a;->y:La12/a;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->b()I

    move-result v10

    invoke-static {v2, v10}, Ldl0/d;->f(Ldl0/d;I)Ldl0/e$b;

    move-result-object v10

    invoke-static {v2, v9, v10}, Ldl0/d;->g(Ldl0/d;La12/a;Ldl0/e$b;)V

    iget-object v2, p0, Ldl0/d$b$a;->x:Ldl0/d;

    invoke-static {v2}, Ldl0/d;->d(Ldl0/d;)Ltr2/n;

    move-result-object v2

    iget-object v9, p0, Ldl0/d$b$a;->y:La12/a;

    invoke-virtual {v9}, La12/a;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    const-string v10, "Fetch failed with network error (stale data returned). Path: "

    invoke-static {v10, v9, v7, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v2, v8, p1, v7}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ldl0/c;

    sget-object v2, Ldl0/a$c;->a:Ldl0/a$c;

    invoke-direct {p1, v2, v5, v6, v5}, Ldl0/c;-><init>(Ldl0/a;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    if-eqz p1, :cond_a

    iput-object v5, v0, Ldl0/d$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Ldl0/d$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Ldl0/d$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Ldl0/d$b$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Ldl0/d$b$a$a;->H:Ljava/lang/Object;

    iput v4, v0, Ldl0/d$b$a$a;->I:I

    iput v3, v0, Ldl0/d$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
