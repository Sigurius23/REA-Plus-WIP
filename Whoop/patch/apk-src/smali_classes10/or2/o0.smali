.class public final Lor2/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\u0003R\u0016\u0010\u000c\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lor2/o0;",
        "",
        "<init>",
        "()V",
        "Lp92/h$a;",
        "nextGpsLocation",
        "a",
        "(Lp92/h$a;)Lp92/h$a;",
        "Ll83/a0;",
        "b",
        "",
        "F",
        "variance",
        "metersPerDegreeOfLongitude",
        "c",
        "Lp92/h$a;",
        "state",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:Lp92/h$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lor2/o0;->a:F

    const v0, 0x47d92d77

    iput v0, p0, Lor2/o0;->b:F

    return-void
.end method


# virtual methods
.method public final a(Lp92/h$a;)Lp92/h$a;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "nextGpsLocation"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    const/high16 v3, 0x40400000    # 3.0f

    cmpg-float v4, v2, v3

    if-gez v4, :cond_0

    move v2, v3

    :cond_0
    iget v3, v0, Lor2/o0;->a:F

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    const v4, 0x47d92d77

    const/4 v5, 0x0

    const-string v6, "state"

    if-gez v3, :cond_1

    iput-object v1, v0, Lor2/o0;->c:Lp92/h$a;

    mul-float/2addr v2, v2

    iput v2, v0, Lor2/o0;->a:F

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    const-wide v7, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v1, v7

    const/16 v3, 0xb4

    int-to-double v7, v3

    div-double/2addr v1, v7

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v1, v4

    iput v1, v0, Lor2/o0;->b:F

    goto/16 :goto_1

    :cond_1
    invoke-virtual {v1}, Lp92/h$a;->d()J

    move-result-wide v7

    iget-object v3, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lp92/h$a;->d()J

    move-result-wide v9

    sub-long/2addr v7, v9

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v9

    iget-object v3, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v11

    sub-double/2addr v9, v11

    iget v3, v0, Lor2/o0;->b:F

    float-to-double v11, v3

    mul-double/2addr v9, v11

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v13

    iget-object v3, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v15

    sub-double/2addr v13, v15

    float-to-double v3, v4

    mul-double/2addr v13, v3

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    add-double/2addr v3, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v3

    long-to-float v9, v7

    const/high16 v10, 0x447a0000    # 1000.0f

    div-float/2addr v9, v10

    float-to-double v9, v9

    div-double/2addr v3, v9

    const-wide/16 v9, 0x0

    cmp-long v9, v7, v9

    if-lez v9, :cond_3

    iget v9, v0, Lor2/o0;->a:F

    long-to-double v7, v7

    mul-double/2addr v7, v3

    mul-double/2addr v7, v3

    const/16 v3, 0x3e8

    int-to-double v3, v3

    div-double/2addr v7, v3

    double-to-float v3, v7

    add-float/2addr v9, v3

    iput v9, v0, Lor2/o0;->a:F

    iget-object v10, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v10, :cond_2

    invoke-virtual {v1}, Lp92/h$a;->d()J

    move-result-wide v12

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/4 v11, 0x0

    invoke-static/range {v10 .. v15}, Lp92/h$a;->b(Lp92/h$a;Landroid/location/Location;JILjava/lang/Object;)Lp92/h$a;

    move-result-object v3

    iput-object v3, v0, Lor2/o0;->c:Lp92/h$a;

    goto :goto_0

    :cond_2
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_3
    :goto_0
    iget v3, v0, Lor2/o0;->a:F

    mul-float/2addr v2, v2

    add-float/2addr v2, v3

    div-float v2, v3, v2

    const/4 v4, 0x1

    int-to-float v4, v4

    sub-float/2addr v4, v2

    mul-float/2addr v4, v3

    iput v4, v0, Lor2/o0;->a:F

    iget-object v3, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v3

    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    float-to-double v7, v2

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v9

    iget-object v2, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v11

    sub-double/2addr v9, v11

    mul-double/2addr v9, v7

    add-double/2addr v9, v3

    iget-object v2, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v11

    iget-object v1, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v13

    sub-double/2addr v11, v13

    mul-double/2addr v11, v7

    add-double/2addr v11, v2

    iget-object v1, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1, v9, v10}, Landroid/location/Location;->setLatitude(D)V

    iget-object v1, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object v1

    invoke-virtual {v1, v11, v12}, Landroid/location/Location;->setLongitude(D)V

    :goto_1
    iget-object v13, v0, Lor2/o0;->c:Lp92/h$a;

    if-eqz v13, :cond_4

    const/16 v17, 0x3

    const/16 v18, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    invoke-static/range {v13 .. v18}, Lp92/h$a;->b(Lp92/h$a;Landroid/location/Location;JILjava/lang/Object;)Lp92/h$a;

    move-result-object v1

    return-object v1

    :cond_4
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_6
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_7
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_8
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_9
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_a
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_b
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_c
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_d
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5
.end method

.method public final b()V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lor2/o0;->a:F

    return-void
.end method
