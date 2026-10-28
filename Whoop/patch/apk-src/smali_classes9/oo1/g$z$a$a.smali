.class final Loo1/g$z$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g$z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic E:Lbc3/c0;

.field final synthetic w:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field

.field final synthetic x:Loo1/g;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Ldc3/u;Loo1/g;Ljava/lang/String;ZLbc3/c0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Loo1/g;",
            "Ljava/lang/String;",
            "Z",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$z$a$a;->w:Ldc3/u;

    iput-object p2, p0, Loo1/g$z$a$a;->x:Loo1/g;

    iput-object p3, p0, Loo1/g$z$a$a;->y:Ljava/lang/String;

    iput-boolean p4, p0, Loo1/g$z$a$a;->z:Z

    iput-object p5, p0, Loo1/g$z$a$a;->E:Lbc3/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lpm0/a;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Loo1/g$z$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Loo1/g$z$a$a$a;

    iget v1, v0, Loo1/g$z$a$a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loo1/g$z$a$a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Loo1/g$z$a$a$a;

    invoke-direct {v0, p0, p2}, Loo1/g$z$a$a$a;-><init>(Loo1/g$z$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Loo1/g$z$a$a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Loo1/g$z$a$a$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Loo1/g$z$a$a$a;->w:Ljava/lang/Object;

    check-cast p1, Lpm0/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Loo1/g$z$a$a;->w:Ldc3/u;

    iget-object v2, p0, Loo1/g$z$a$a;->x:Loo1/g;

    iget-object v4, p0, Loo1/g$z$a$a;->y:Ljava/lang/String;

    iget-boolean v5, p0, Loo1/g$z$a$a;->z:Z

    xor-int/2addr v5, v3

    invoke-static {v2, p1, v4, v5}, Loo1/g;->q(Loo1/g;Lpm0/a;Ljava/lang/String;Z)Loo1/g$d;

    move-result-object v2

    iput-object p1, v0, Loo1/g$z$a$a$a;->w:Ljava/lang/Object;

    iput v3, v0, Loo1/g$z$a$a$a;->z:I

    check-cast p2, Ldc3/t;

    iget-object p2, p2, Ldc3/t;->z:Ldc3/h;

    invoke-interface {p2, v2, v0}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p2, p1, Lpm0/a$a$a;

    if-nez p2, :cond_4

    instance-of p1, p1, Lpm0/a$b;

    if-eqz p1, :cond_5

    :cond_4
    iget-object p1, p0, Loo1/g$z$a$a;->E:Lbc3/c0;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpm0/a;

    invoke-virtual {p0, p1, p2}, Loo1/g$z$a$a;->b(Lpm0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
