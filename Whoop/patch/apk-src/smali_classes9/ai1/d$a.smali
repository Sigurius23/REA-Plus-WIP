.class Lai1/d$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai1/d;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Lai1/d;


# direct methods
.method public constructor <init>(Lai1/d;)V
    .locals 0

    iput-object p1, p0, Lai1/d$a;->a:Lai1/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lbi1/a;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p2}, Lbi1/a;->e()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lbi1/a;->f()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x3

    invoke-virtual {p2}, Lbi1/a;->c()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x4

    invoke-virtual {p2}, Lbi1/a;->d()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x5

    invoke-virtual {p2}, Lbi1/a;->a()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x6

    invoke-virtual {p2}, Lbi1/a;->b()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x7

    invoke-virtual {p2}, Lbi1/a;->g()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lbi1/a;

    invoke-virtual {p0, p1, p2}, Lai1/d$a;->a(Ltb/c;Lbi1/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `foreground_gps_route_points` (`sessionStartTimeMs`,`timestamp`,`latitude`,`longitude`,`altitude`,`horizontal_accuracy_meters`,`vertical_accuracy_meters`) VALUES (?,?,?,?,?,?,?)"

    return-object v0
.end method
