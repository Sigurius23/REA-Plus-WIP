.class public final Ljg/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/m;
.implements Lhg/e;
.implements Lhg/f;
.implements Lhg/n;


# instance fields
.field public final w:Le73/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-wide/high16 v2, 0x7ff8000000000000L    # Double.NaN

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x7fc00000    # Float.NaN

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le73/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le73/b;-><init>(Z)V

    iput-object v0, p0, Ljg/f;->w:Le73/b;

    return-void
.end method


# virtual methods
.method public final a(Lhg/i;Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljg/f;->w:Le73/b;

    invoke-static {p1}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le73/b;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljg/f;->b(Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljg/f;->w:Le73/b;

    invoke-virtual {v0, p1}, Le73/b;->r(Ljava/lang/String;)V

    return-void
.end method

.method public final e(Lhg/j;)Lhg/n;
    .locals 0

    iget-object p1, p0, Ljg/f;->w:Le73/b;

    invoke-virtual {p1}, Le73/b;->f()V

    return-object p0
.end method

.method public final j(Lhg/k;)V
    .locals 1

    iget-object v0, p1, Lhg/k;->b:Lkotlin/jvm/internal/i;

    iget-object p1, p1, Lhg/k;->a:Ljava/lang/Object;

    invoke-interface {v0, p0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final l(Lhg/i;Lhg/k;)V
    .locals 1

    iget-object v0, p0, Ljg/f;->w:Le73/b;

    invoke-static {p1}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le73/b;->q(Ljava/lang/String;)V

    iget-object p1, p2, Lhg/k;->b:Lkotlin/jvm/internal/i;

    iget-object p2, p2, Lhg/k;->a:Ljava/lang/Object;

    invoke-interface {p1, p0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Ljg/f;->w:Le73/b;

    invoke-virtual {v0}, Le73/b;->k()V

    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljg/f;->w:Le73/b;

    invoke-virtual {v0, p1}, Le73/b;->q(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Ljg/f;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "null"

    invoke-virtual {v0, p1}, Le73/b;->j(Ljava/lang/String;)V

    return-void
.end method

.method public final r(Lhg/i;Z)V
    .locals 1

    invoke-static {p1}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ljg/f;->w:Le73/b;

    invoke-virtual {v0, p1}, Le73/b;->q(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le73/b;->j(Ljava/lang/String;)V

    return-void
.end method
