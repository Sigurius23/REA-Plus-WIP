.class public final Llz/i;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lec3/w1;

.field public final F:Lec3/q1;

.field public final G:Lec3/h2;

.field public final w:Lqy/d;

.field public final x:Lxl/a;

.field public final y:Lbc3/z;

.field public final z:Lkz/d;


# direct methods
.method public constructor <init>(Lqy/d;Landroidx/lifecycle/k1;Lxl/a;Lbc3/z;Ljava/lang/String;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Llz/i;->w:Lqy/d;

    iput-object p3, p0, Llz/i;->x:Lxl/a;

    iput-object p4, p0, Llz/i;->y:Lbc3/z;

    const-string p1, "FinancialConnectionsSheetActivityArgs"

    invoke-virtual {p2, p1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkz/d;

    if-eqz p1, :cond_0

    iput-object p1, p0, Llz/i;->z:Lkz/d;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p2, p2, p3, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Llz/i;->E:Lec3/w1;

    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Llz/i;->F:Lec3/q1;

    invoke-static {p3}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Llz/i;->G:Lec3/h2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Llz/a;

    invoke-direct {p2, p0, p5, p3}, Llz/a;-><init>(Llz/i;Ljava/lang/String;Lq83/d;)V

    const/4 p5, 0x2

    invoke-static {p1, p4, p3, p2, p5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing arguments"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final g(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Llz/i;->w:Lqy/d;

    invoke-virtual {v0, p1, p2}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v0, Lh20/i0;

    const/16 v1, 0x16

    const/4 v2, 0x0

    invoke-direct {v0, p0, p2, v2, v1}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p2, 0x3

    invoke-static {p1, v2, v2, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
