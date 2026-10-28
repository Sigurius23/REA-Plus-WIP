.class public final Lt30/g;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Landroidx/lifecycle/u0;

.field public final F:Landroidx/lifecycle/u0;

.field public final G:Landroidx/lifecycle/u0;

.field public final H:Landroidx/lifecycle/u0;

.field public final I:Landroidx/lifecycle/u0;

.field public final J:Landroidx/lifecycle/u0;

.field public final K:Landroidx/lifecycle/u0;

.field public final L:Lt30/f;

.field public final M:Lt30/f;

.field public final N:Lt30/f;

.field public final O:Lt30/f;

.field public P:Z

.field public Q:Z

.field public final R:Lbc3/k1;

.field public final w:Lq30/k;

.field public final x:Lq30/g0;

.field public final y:Ls30/d;

.field public final z:Lq30/w0;


# direct methods
.method public constructor <init>(Lq30/k;Lq30/g0;Ln30/d;)V
    .locals 2

    sget-object v0, Ls30/c;->a:Ls30/c;

    const-string v1, "challengeActionHandler"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "transactionTimer"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "errorReporter"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lt30/g;->w:Lq30/k;

    iput-object p2, p0, Lt30/g;->x:Lq30/g0;

    iput-object v0, p0, Lt30/g;->y:Ls30/d;

    new-instance p1, Lq30/w0;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    iget-object p2, p2, Ln8/a;->w:Lq83/j;

    invoke-direct {p1, p3, p2}, Lq30/w0;-><init>(Ln30/d;Lq83/j;)V

    iput-object p1, p0, Lt30/g;->z:Lq30/w0;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lt30/g;->E:Landroidx/lifecycle/u0;

    iput-object p1, p0, Lt30/g;->F:Landroidx/lifecycle/u0;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lt30/g;->G:Landroidx/lifecycle/u0;

    iput-object p1, p0, Lt30/g;->H:Landroidx/lifecycle/u0;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lt30/g;->I:Landroidx/lifecycle/u0;

    iput-object p1, p0, Lt30/g;->J:Landroidx/lifecycle/u0;

    new-instance p1, Landroidx/lifecycle/u0;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lt30/g;->K:Landroidx/lifecycle/u0;

    new-instance p1, Lt30/f;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lt30/g;->L:Lt30/f;

    iput-object p1, p0, Lt30/g;->M:Lt30/f;

    new-instance p1, Lt30/f;

    invoke-direct {p1}, Landroidx/lifecycle/p0;-><init>()V

    iput-object p1, p0, Lt30/g;->N:Lt30/f;

    iput-object p1, p0, Lt30/g;->O:Lt30/f;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lsz/q;

    const/4 p3, 0x5

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0, p3}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p3, 0x3

    invoke-static {p1, v0, v0, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lt30/g;->R:Lbc3/k1;

    return-void
.end method


# virtual methods
.method public final g(Lq30/h;)V
    .locals 4

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Ln43/a;

    const/16 v2, 0x19

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
