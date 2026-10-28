.class public final Lsv/f;
.super Lsv/d;
.source "SourceFile"


# instance fields
.field public final F:Lrv/t;


# direct methods
.method public constructor <init>(Lo52/q;)V
    .locals 1

    const-string v0, "indicatorPositionChangedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsv/a;->a:Lgv/j;

    invoke-direct {p0, v0}, Lsv/d;-><init>(Landroid/animation/TypeEvaluator;)V

    iput-object p1, p0, Lsv/f;->F:Lrv/t;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;F)V
    .locals 0

    check-cast p1, Lcom/mapbox/geojson/Point;

    const-string p2, "value"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lsv/d;->y:Lrv/p;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lrv/p;->T(Lcom/mapbox/geojson/Point;)V

    :cond_0
    iget-object p2, p0, Lsv/f;->F:Lrv/t;

    invoke-interface {p2, p1}, Lrv/t;->a(Lcom/mapbox/geojson/Point;)V

    return-void
.end method
