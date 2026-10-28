.class final Lrm1/m$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrm1/m$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lrm1/k;

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lrm1/k;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrm1/k;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lrm1/m$b$a;->w:Lrm1/k;

    iput-object p2, p0, Lrm1/m$b$a;->x:Lp1/c1;

    iput-object p3, p0, Lrm1/m$b$a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ltl1/b;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltl1/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lrm1/m$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lrm1/m$b$a$a;

    iget v1, v0, Lrm1/m$b$a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrm1/m$b$a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrm1/m$b$a$a;

    invoke-direct {v0, p0, p2}, Lrm1/m$b$a$a;-><init>(Lrm1/m$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lrm1/m$b$a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrm1/m$b$a$a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x3

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v6, :cond_1

    iget-object p1, v0, Lrm1/m$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ltl1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lrm1/m$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ltl1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lrm1/m$b$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ltl1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, p1, Ltl1/b$c;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lrm1/m$b$a;->x:Lp1/c1;

    invoke-static {p1}, Lrm1/m;->K(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_8

    iput-object v5, v0, Lrm1/m$b$a$a;->w:Ljava/lang/Object;

    iput v4, v0, Lrm1/m$b$a$a;->z:I

    const-wide/16 p1, 0x3e8

    invoke-static {p1, p2, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iget-object p1, p0, Lrm1/m$b$a;->y:Lp1/c1;

    sget-object p2, Lrm1/c;->WELCOMECOLLAPSE:Lrm1/c;

    invoke-static {p1, p2}, Lrm1/m;->M(Lp1/c1;Lrm1/c;)V

    iget-object p1, p0, Lrm1/m$b$a;->w:Lrm1/k;

    invoke-virtual {p1}, Lrm1/k;->b()J

    move-result-wide p1

    int-to-long v7, v6

    div-long/2addr p1, v7

    iput-object v5, v0, Lrm1/m$b$a$a;->w:Ljava/lang/Object;

    iput v3, v0, Lrm1/m$b$a$a;->z:I

    invoke-static {p1, p2, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p1, p0, Lrm1/m$b$a;->y:Lp1/c1;

    sget-object p2, Lrm1/c;->FULLGAUGE:Lrm1/c;

    invoke-static {p1, p2}, Lrm1/m;->M(Lp1/c1;Lrm1/c;)V

    iget-object p1, p0, Lrm1/m$b$a;->w:Lrm1/k;

    invoke-virtual {p1}, Lrm1/k;->b()J

    move-result-wide p1

    int-to-long v2, v6

    div-long/2addr p1, v2

    iput-object v5, v0, Lrm1/m$b$a$a;->w:Ljava/lang/Object;

    iput v6, v0, Lrm1/m$b$a$a;->z:I

    invoke-static {p1, p2, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    iget-object p1, p0, Lrm1/m$b$a;->y:Lp1/c1;

    sget-object p2, Lrm1/c;->COMPLETE:Lrm1/c;

    invoke-static {p1, p2}, Lrm1/m;->M(Lp1/c1;Lrm1/c;)V

    iget-object p1, p0, Lrm1/m$b$a;->x:Lp1/c1;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lrm1/m;->L(Lp1/c1;Z)V

    sget-object p1, Ltl1/c;->e:Ltl1/c$a;

    sget-object p2, Ltl1/b$d;->a:Ltl1/b$d;

    invoke-virtual {p1, p2}, Ltl1/c$a;->b(Ltl1/b;)V

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltl1/b;

    invoke-virtual {p0, p1, p2}, Lrm1/m$b$a;->b(Ltl1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
