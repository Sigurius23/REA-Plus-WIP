.class public final Lh20/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/lifecycle/k1;

.field public final b:Lec3/r1;

.field public final c:Ln53/e;

.field public final d:Lec3/r1;

.field public final e:Ln53/e;

.field public final f:Ln53/e;

.field public final g:Ln53/e;


# direct methods
.method public constructor <init>(Ln53/e;Landroidx/lifecycle/k1;Lec3/f2;)V
    .locals 4

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh20/f;->a:Landroidx/lifecycle/k1;

    const/4 v0, 0x0

    const-string v1, "customer_info"

    invoke-virtual {p2, v0, v1}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, Lh20/f;->b:Lec3/r1;

    new-instance v2, Lh00/l0;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lh00/l0;-><init>(I)V

    invoke-static {v1, v2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object v2

    iput-object v2, p0, Lh20/f;->c:Ln53/e;

    invoke-interface {p3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p3

    instance-of v3, p3, Lq20/w;

    if-eqz v3, :cond_0

    check-cast p3, Lq20/w;

    goto :goto_0

    :cond_0
    move-object p3, v0

    :goto_0
    if-eqz p3, :cond_1

    iget-object v0, p3, Lq20/w;->x:Ly00/o4;

    :cond_1
    const-string p3, "saved_selection"

    invoke-virtual {p2, v0, p3}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lh20/f;->d:Lec3/r1;

    new-instance p2, Lg1/w8;

    const/16 p3, 0xd

    invoke-direct {p2, p3}, Lg1/w8;-><init>(I)V

    invoke-static {v1, p1, p2}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lh20/f;->e:Ln53/e;

    new-instance p2, Lg1/w8;

    const/16 p3, 0xe

    invoke-direct {p2, p3}, Lg1/w8;-><init>(I)V

    invoke-static {v2, p1, p2}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p2

    iput-object p2, p0, Lh20/f;->f:Ln53/e;

    new-instance p2, Lh00/l0;

    const/4 p3, 0x4

    invoke-direct {p2, p3}, Lh00/l0;-><init>(I)V

    invoke-static {p1, p2}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lh20/f;->g:Ln53/e;

    return-void
.end method


# virtual methods
.method public final a(La30/a;)V
    .locals 6

    const-string v0, "customer_info"

    iget-object v1, p0, Lh20/f;->a:Landroidx/lifecycle/k1;

    invoke-virtual {v1, p1, v0}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh20/f;->d:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly00/o4;

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p1, La30/a;->w:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ly00/o4;

    iget-object v4, v4, Ly00/o4;->w:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v5, v0, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v2, v3

    :cond_2
    check-cast v2, Ly00/o4;

    :cond_3
    const-string p1, "saved_selection"

    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
