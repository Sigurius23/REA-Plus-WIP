.class public final Lhq1/c$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhq1/c$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lhq1/c;


# direct methods
.method public constructor <init>(Lec3/m;Lhq1/c;)V
    .locals 0

    iput-object p1, p0, Lhq1/c$b$a;->w:Lec3/m;

    iput-object p2, p0, Lhq1/c$b$a;->x:Lhq1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lhq1/c$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhq1/c$b$a$a;

    iget v1, v0, Lhq1/c$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhq1/c$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhq1/c$b$a$a;

    invoke-direct {v0, p0, p2}, Lhq1/c$b$a$a;-><init>(Lhq1/c$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lhq1/c$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhq1/c$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lhq1/c$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lhq1/c$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lhq1/c$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lhq1/c$b$a;->w:Lec3/m;

    check-cast p1, Ll83/k;

    iget-object v2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lpm0/a;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Lhq1/f;

    instance-of v4, v2, Lpm0/a$e;

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    sget-object p1, Lhq1/b$b;->a:Lhq1/b$b;

    goto/16 :goto_1

    :cond_3
    instance-of v4, v2, Lpm0/a$a$a;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lhq1/c$b$a;->x:Lhq1/c;

    check-cast v2, Lpm0/a$a$a;

    invoke-virtual {v2}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    invoke-static {v4, v2, p1}, Lhq1/c;->g(Lhq1/c;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lhq1/f;)Lhq1/b$c;

    move-result-object p1

    iget-object v2, p0, Lhq1/c$b$a;->x:Lhq1/c;

    invoke-static {v2, p1}, Lhq1/c;->h(Lhq1/c;Lhq1/b$c;)V

    goto :goto_1

    :cond_4
    instance-of v4, v2, Lpm0/a$a$b;

    if-eqz v4, :cond_5

    iget-object v4, p0, Lhq1/c$b$a;->x:Lhq1/c;

    check-cast v2, Lpm0/a$a$b;

    invoke-virtual {v2}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    invoke-static {v4, v2, p1}, Lhq1/c;->g(Lhq1/c;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lhq1/f;)Lhq1/b$c;

    move-result-object p1

    goto :goto_1

    :cond_5
    instance-of v4, v2, Lpm0/a$d;

    const-string v6, "Fetching behavior details failed "

    if-eqz v4, :cond_6

    iget-object v4, p0, Lhq1/c$b$a;->x:Lhq1/c;

    invoke-static {v4}, Lhq1/c;->f(Lhq1/c;)Ltr2/n;

    move-result-object v4

    check-cast v2, Lpm0/a$d;

    invoke-virtual {v2}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {v4, v6, v7}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v4, p0, Lhq1/c$b$a;->x:Lhq1/c;

    invoke-virtual {v2}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;

    invoke-static {v4, v2, p1}, Lhq1/c;->g(Lhq1/c;Lcom/whoop/impacts/details/domain/requests/BehaviorDetailsResponse;Lhq1/f;)Lhq1/b$c;

    move-result-object p1

    goto :goto_1

    :cond_6
    instance-of v4, v2, Lpm0/a$c;

    if-eqz v4, :cond_8

    iget-object v4, p0, Lhq1/c$b$a;->x:Lhq1/c;

    invoke-static {v4}, Lhq1/c;->f(Lhq1/c;)Ltr2/n;

    move-result-object v4

    check-cast v2, Lpm0/a$c;

    invoke-virtual {v2}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v4, v7, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v4, Lhq1/b$a;

    invoke-virtual {v2}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, p1}, Lhq1/b$a;-><init>(Ljava/lang/String;Lhq1/f;)V

    move-object p1, v4

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Lhq1/c$b$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lhq1/c$b$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lhq1/c$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lhq1/c$b$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Lhq1/c$b$a$a;->H:I

    iput v3, v0, Lhq1/c$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

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
.end method
