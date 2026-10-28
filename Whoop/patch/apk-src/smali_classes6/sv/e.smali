.class public final Lsv/e;
.super Lsv/d;
.source "SourceFile"


# instance fields
.field public final F:Lrv/k;

.field public G:Z


# direct methods
.method public constructor <init>(Lrv/k;)V
    .locals 1

    const-string v0, "indicatorBearingChangedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsv/a;->b:Lgv/j;

    invoke-direct {p0, v0}, Lsv/d;-><init>(Landroid/animation/TypeEvaluator;)V

    iput-object p1, p0, Lsv/e;->F:Lrv/k;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lsv/e;->G:Z

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;F)V
    .locals 1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    iget-boolean v0, p0, Lsv/e;->G:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsv/d;->y:Lrv/p;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lrv/p;->n(D)V

    :cond_0
    iget-object p1, p0, Lsv/e;->F:Lrv/k;

    invoke-virtual {p1}, Lrv/k;->a()V

    :cond_1
    return-void
.end method
