.class public final synthetic Lfv/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# instance fields
.field public final synthetic a:D

.field public final synthetic b:D

.field public final synthetic c:Z

.field public final synthetic d:D

.field public final synthetic e:D

.field public final synthetic f:D


# direct methods
.method public synthetic constructor <init>(Lfv/n;DDZDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lfv/l;->a:D

    iput-wide p4, p0, Lfv/l;->b:D

    iput-boolean p6, p0, Lfv/l;->c:Z

    iput-wide p7, p0, Lfv/l;->d:D

    iput-wide p9, p0, Lfv/l;->e:D

    iput-wide p11, p0, Lfv/l;->f:D

    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p2, Ljava/lang/Double;

    check-cast p3, Ljava/lang/Double;

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    float-to-double p1, p1

    iget-wide v0, p0, Lfv/l;->a:D

    mul-double/2addr p1, v0

    const/4 p3, 0x1

    int-to-double v0, p3

    iget-boolean v2, p0, Lfv/l;->c:Z

    const-wide v3, 0x3ff6b851eb851eb8L    # 1.42

    if-eqz v2, :cond_2

    iget-wide v5, p0, Lfv/l;->d:D

    iget-wide v7, p0, Lfv/l;->e:D

    cmpg-double v2, v5, v7

    if-gez v2, :cond_1

    const/4 p3, -0x1

    :cond_1
    int-to-double v5, p3

    mul-double/2addr v5, v3

    mul-double/2addr v5, p1

    invoke-static {v5, v6}, Ljava/lang/Math;->exp(D)D

    move-result-wide p1

    goto :goto_0

    :cond_2
    iget-wide v5, p0, Lfv/l;->f:D

    invoke-static {v5, v6}, Ljava/lang/Math;->cosh(D)D

    move-result-wide v7

    mul-double/2addr v3, p1

    add-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->cosh(D)D

    move-result-wide p1

    div-double p1, v7, p1

    :goto_0
    div-double/2addr v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide p1

    sget-wide v0, Le93/a;->a:D

    div-double/2addr p1, v0

    iget-wide v0, p0, Lfv/l;->b:D

    add-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
