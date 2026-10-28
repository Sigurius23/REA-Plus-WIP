.class final Lrm1/h$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrm1/h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

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
.method public constructor <init>(Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lrm1/h$a$a;->w:Lp1/c1;

    iput-object p2, p0, Lrm1/h$a$a;->x:Lp1/c1;

    iput-object p3, p0, Lrm1/h$a$a;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ltl1/b;Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p2, Lrm1/h$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lrm1/h$a$a$a;

    iget v1, v0, Lrm1/h$a$a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrm1/h$a$a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrm1/h$a$a$a;

    invoke-direct {v0, p0, p2}, Lrm1/h$a$a$a;-><init>(Lrm1/h$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lrm1/h$a$a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrm1/h$a$a$a;->z:I

    const/4 v3, 0x0

    const-wide/16 v4, 0x3e8

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v6, :cond_1

    iget-object p1, v0, Lrm1/h$a$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ltl1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lrm1/h$a$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ltl1/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, p1, Ltl1/b$b;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lrm1/h$a$a;->w:Lp1/c1;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lrm1/h;->V(Lp1/c1;Z)V

    iput-object v3, v0, Lrm1/h$a$a$a;->w:Ljava/lang/Object;

    iput v7, v0, Lrm1/h$a$a$a;->z:I

    invoke-static {v4, v5, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lrm1/h$a$a;->x:Lp1/c1;

    invoke-static {p1, v7}, Lrm1/h;->R(Lp1/c1;Z)V

    iput-object v3, v0, Lrm1/h$a$a$a;->w:Ljava/lang/Object;

    iput v6, v0, Lrm1/h$a$a$a;->z:I

    invoke-static {v4, v5, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    iget-object p1, p0, Lrm1/h$a$a;->y:Lp1/c1;

    invoke-static {p1, v7}, Lrm1/h;->S(Lp1/c1;Z)V

    sget-object p1, Ltl1/c;->e:Ltl1/c$a;

    sget-object p2, Ltl1/b$a;->a:Ltl1/b$a;

    invoke-virtual {p1, p2}, Ltl1/c$a;->b(Ltl1/b;)V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltl1/b;

    invoke-virtual {p0, p1, p2}, Lrm1/h$a$a;->b(Ltl1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
