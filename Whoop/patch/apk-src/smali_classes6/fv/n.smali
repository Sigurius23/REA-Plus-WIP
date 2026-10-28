.class public final Lfv/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lh8/a;

.field public static final e:Ljava/util/HashMap;


# instance fields
.field public final a:Lcom/mapbox/maps/MapboxMap;

.field public final b:Lcom/mapbox/maps/MapboxMap;

.field public final c:Lcom/mapbox/maps/MapboxMap;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    new-instance v1, Landroid/view/animation/PathInterpolator;

    const/4 v2, 0x0

    const/high16 v3, 0x3e800000    # 0.25f

    invoke-direct {v1, v2, v2, v3, v0}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    new-instance v0, Lh8/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh8/a;-><init>(I)V

    sput-object v0, Lfv/n;->d:Lh8/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lfv/j;->E:Lfv/j;

    sget-object v2, Lfv/m;->x:Lfv/m;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lfv/j;->y:Lfv/j;

    sget-object v2, Lfv/m;->y:Lfv/m;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lfv/j;->F:Lfv/j;

    sget-object v2, Lfv/m;->z:Lfv/m;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lfv/j;->z:Lfv/j;

    sget-object v2, Lfv/m;->E:Lfv/m;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lfv/j;->w:Lfv/j;

    sget-object v2, Lfv/m;->F:Lfv/m;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lfv/j;->x:Lfv/j;

    sget-object v2, Lfv/m;->G:Lfv/m;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sput-object v0, Lfv/n;->e:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lev/i;)V
    .locals 1

    const-string v0, "mapDelegateProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lev/i;->d:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lfv/n;->a:Lcom/mapbox/maps/MapboxMap;

    iget-object v0, p1, Lev/i;->c:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxMap;

    iput-object v0, p0, Lfv/n;->b:Lcom/mapbox/maps/MapboxMap;

    iget-object p1, p1, Lev/i;->b:Ljava/lang/Object;

    check-cast p1, Lcom/mapbox/maps/MapboxMap;

    iput-object p1, p0, Lfv/n;->c:Lcom/mapbox/maps/MapboxMap;

    return-void
.end method

.method public static final a(IDDD)D
    .locals 7

    mul-double v0, p1, p1

    mul-double v2, p3, p3

    sub-double/2addr v0, v2

    const/4 v2, 0x1

    if-nez p0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    int-to-double v3, v3

    const-wide v5, 0x4000219652bd3c36L    # 2.0164

    mul-double/2addr v3, v5

    mul-double/2addr v3, v5

    mul-double/2addr v3, p5

    mul-double/2addr v3, p5

    add-double/2addr v3, v0

    const/4 v0, 0x2

    int-to-double v0, v0

    if-nez p0, :cond_1

    move-wide p1, p3

    :cond_1
    mul-double/2addr v0, p1

    mul-double/2addr v0, v5

    mul-double/2addr v0, p5

    div-double/2addr v3, v0

    mul-double p0, v3, v3

    int-to-double p2, v2

    add-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    sub-double/2addr p0, v3

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    return-wide p0
.end method
