.class final Lc51/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc51/c;->g(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/v;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaAgeTextKt$AmoebaAgeText$5$1"
    f = "AmoebaAgeText.kt"
    l = {
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lc51/s;

.field final synthetic y:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc51/s;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc51/s;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lc51/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc51/c$a;->x:Lc51/s;

    iput-object p2, p0, Lc51/c$a;->y:Lp1/c1;

    iput-object p3, p0, Lc51/c$a;->z:Lp1/c1;

    iput-object p4, p0, Lc51/c$a;->E:Lp1/c1;

    iput-object p5, p0, Lc51/c$a;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc51/c$a;

    iget-object v1, p0, Lc51/c$a;->x:Lc51/s;

    iget-object v2, p0, Lc51/c$a;->y:Lp1/c1;

    iget-object v3, p0, Lc51/c$a;->z:Lp1/c1;

    iget-object v4, p0, Lc51/c$a;->E:Lp1/c1;

    iget-object v5, p0, Lc51/c$a;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lc51/c$a;-><init>(Lc51/s;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lc51/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc51/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc51/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lc51/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lc51/c$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lc51/c$a;->x:Lc51/s;

    invoke-virtual {p1}, Lc51/s;->p()Lc51/r;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lc51/r;->d()Lc51/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    sget-object v1, Lc51/p;->PULSE_YEARS_DIFFERENCE:Lc51/p;

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Lc51/c$a;->x:Lc51/s;

    invoke-virtual {p1}, Lc51/s;->p()Lc51/r;

    move-result-object p1

    invoke-virtual {p1}, Lc51/r;->a()J

    move-result-wide v3

    iput v2, p0, Lc51/c$a;->w:I

    invoke-static {v3, v4, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, p0, Lc51/c$a;->y:Lp1/c1;

    iget-object v0, p0, Lc51/c$a;->x:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    invoke-virtual {v0}, Lc51/o;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc51/c;->E(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lc51/c$a;->z:Lp1/c1;

    iget-object v0, p0, Lc51/c$a;->x:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    invoke-virtual {v0}, Lc51/o;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc51/c;->F(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lc51/c$a;->E:Lp1/c1;

    iget-object v0, p0, Lc51/c$a;->x:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    invoke-virtual {v0}, Lc51/o;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc51/c;->G(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lc51/c$a;->F:Lp1/c1;

    iget-object v0, p0, Lc51/c$a;->x:Lc51/s;

    invoke-virtual {v0}, Lc51/s;->o()Lc51/o;

    move-result-object v0

    invoke-virtual {v0}, Lc51/o;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lc51/c;->H(Lp1/c1;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
