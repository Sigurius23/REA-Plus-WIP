.class public final Lss2/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lss2/e$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lss2/e;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Lss2/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lss2/e$b$a;->w:Lec3/m;

    iput-object p2, p0, Lss2/e$b$a;->x:Lss2/e;

    iput-object p3, p0, Lss2/e$b$a;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lss2/e$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lss2/e$b$a$a;

    iget v1, v0, Lss2/e$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lss2/e$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lss2/e$b$a$a;

    invoke-direct {v0, p0, p2}, Lss2/e$b$a$a;-><init>(Lss2/e$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lss2/e$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lss2/e$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lss2/e$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lss2/e$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lss2/e$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lss2/e$b$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    sget-object p1, Lss2/c$b;->a:Lss2/c$b;

    goto/16 :goto_2

    :cond_3
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lss2/e$b$a;->x:Lss2/e;

    iget-object v5, p0, Lss2/e$b$a;->y:Ljava/lang/String;

    invoke-static {v2, v5}, Lss2/e;->f(Lss2/e;Ljava/lang/String;)V

    iget-object v2, p0, Lss2/e$b$a;->x:Lss2/e;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;

    invoke-static {v2, p1}, Lss2/e;->c(Lss2/e;Lcom/whoop/weeklyplan/api/ChallengeLandingResponse;)Lss2/c$c;

    move-result-object p1

    goto :goto_2

    :cond_4
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_5

    sget-object p1, Lss2/c$b;->a:Lss2/c$b;

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lpm0/a$c;

    const-string v5, "Fetching challenge landing failed "

    if-eqz v2, :cond_6

    iget-object v2, p0, Lss2/e$b$a;->x:Lss2/e;

    invoke-static {v2}, Lss2/e;->e(Lss2/e;)Ltr2/n;

    move-result-object v2

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {v2, v5, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lss2/c$a;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lss2/c$a;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object p1, v2

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lpm0/a$d;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lss2/e$b$a;->x:Lss2/e;

    invoke-static {v2}, Lss2/e;->e(Lss2/e;)Ltr2/n;

    move-result-object v2

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {v2, v5, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lss2/c$a;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lss2/c$a;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lss2/e$b$a;->x:Lss2/e;

    invoke-static {p1}, Lss2/e;->e(Lss2/e;)Ltr2/n;

    move-result-object p1

    new-array v2, v4, [Lqr2/a$a;

    const-string v5, "Fetching challenge landing failed with unknown error"

    invoke-interface {p1, v5, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lss2/c$a;

    invoke-direct {p1, v5}, Lss2/c$a;-><init>(Ljava/lang/String;)V

    :goto_2
    const/4 v2, 0x0

    iput-object v2, v0, Lss2/e$b$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lss2/e$b$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lss2/e$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lss2/e$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lss2/e$b$a$a;->H:I

    iput v3, v0, Lss2/e$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
