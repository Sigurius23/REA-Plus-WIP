.class public final Lsv/b;
.super Lsv/d;
.source "SourceFile"


# instance fields
.field public final F:Lrv/l;

.field public G:I

.field public H:I


# direct methods
.method public constructor <init>(Lrv/l;)V
    .locals 1

    const-string v0, "accuracyRadiusChangedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsv/a;->b:Lgv/j;

    invoke-direct {p0, v0}, Lsv/d;-><init>(Landroid/animation/TypeEvaluator;)V

    iput-object p1, p0, Lsv/b;->F:Lrv/l;

    const p1, -0xffff01

    iput p1, p0, Lsv/b;->G:I

    iput p1, p0, Lsv/b;->H:I

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;F)V
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    iget-boolean v0, p0, Lsv/d;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    double-to-float p1, p1

    cmpg-float p2, v1, p1

    if-gez p2, :cond_0

    move v1, p1

    :cond_0
    iget-object p1, p0, Lsv/d;->y:Lrv/p;

    if-eqz p1, :cond_1

    invoke-interface {p1, v1}, Lrv/p;->d0(F)V

    :cond_1
    iget-object p1, p0, Lsv/d;->y:Lrv/p;

    if-eqz p1, :cond_2

    iget p2, p0, Lsv/b;->G:I

    iget v0, p0, Lsv/b;->H:I

    invoke-interface {p1, p2, v0}, Lrv/p;->E(II)V

    :cond_2
    iget-object p1, p0, Lsv/b;->F:Lrv/l;

    invoke-virtual {p1}, Lrv/l;->a()V

    return-void

    :cond_3
    iget-object p1, p0, Lsv/d;->y:Lrv/p;

    if-eqz p1, :cond_4

    invoke-interface {p1, v1}, Lrv/p;->d0(F)V

    :cond_4
    return-void
.end method
