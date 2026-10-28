.class public final Ln20/u;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# instance fields
.field public volatile E:Lq20/y;

.field public final F:Lec3/h2;

.field public final G:Lec3/r1;

.field public final H:Lec3/r1;

.field public final I:Lvv1/c;

.field public final x:Landroidx/lifecycle/k1;

.field public final y:Ln20/b;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/k1;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 11

    invoke-direct {p0, p1}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    iput-object p2, p0, Ln20/u;->x:Landroidx/lifecycle/k1;

    new-instance v0, Ln20/b;

    new-instance v1, Lg73/d;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lg73/d;-><init>(I)V

    new-instance v2, Lu00/e;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lu00/e;-><init>(I)V

    new-instance v3, Lt9/c0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lt9/p;

    const/4 v5, 0x7

    invoke-direct {v4, v5}, Lt9/p;-><init>(I)V

    new-instance v5, Lg73/d;

    const/16 v6, 0x12

    invoke-direct {v5, v6}, Lg73/d;-><init>(I)V

    new-instance v6, Lng3/o;

    const/16 v7, 0xb

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Lng3/o;-><init>(IZ)V

    move-object v10, p0

    move-object v8, p1

    move-object v9, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v10}, Ln20/b;-><init>(Lg73/d;Lu00/e;Lt9/c0;Lt9/p;Lg73/d;Lng3/o;Ljava/lang/Integer;Landroid/app/Application;Ljava/lang/String;Ln20/u;)V

    iput-object v0, v10, Ln20/u;->y:Ln20/b;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p3

    iput-object p3, v10, Ln20/u;->F:Lec3/h2;

    invoke-static {p3}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p3

    iput-object p3, v10, Ln20/u;->G:Lec3/r1;

    const-string p3, "state"

    invoke-virtual {p2, p1, p3}, Landroidx/lifecycle/k1;->c(Ljava/lang/Object;Ljava/lang/String;)Lec3/r1;

    move-result-object p3

    iput-object p3, v10, Ln20/u;->H:Lec3/r1;

    invoke-static {p0, p2}, Lrv/n;->c(Landroidx/lifecycle/w1;Landroidx/lifecycle/k1;)Lvv1/c;

    move-result-object p2

    iput-object p2, v10, Ln20/u;->I:Lvv1/c;

    iget-object p2, v0, Ln20/b;->c0:Lv03/h;

    invoke-interface {p2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk20/a;

    new-instance p3, Lk20/o;

    iget-object p4, p2, Lk20/a;->a:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    invoke-direct {p3, p4}, Lk20/o;-><init>(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V

    invoke-virtual {p2, p3, p1}, Lk20/a;->h(Lk20/t;Lv00/c0;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p2

    new-instance p3, Lkd/f;

    const/16 p4, 0xb

    invoke-direct {p3, p0, p1, p4}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p4, 0x3

    invoke-static {p2, p1, p1, p3, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final g()Ln20/h;
    .locals 2

    iget-object v0, p0, Ln20/u;->x:Landroidx/lifecycle/k1;

    const-string v1, "state"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln20/h;

    return-object v0
.end method
