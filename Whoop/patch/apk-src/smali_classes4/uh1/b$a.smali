.class Luh1/b$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luh1/b;-><init>(Landroidx/room/z0;)V
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
.field final synthetic a:Luh1/b;


# direct methods
.method public constructor <init>(Luh1/b;)V
    .locals 0

    iput-object p1, p0, Luh1/b$a;->a:Luh1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lvh1/a;)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p2}, Lvh1/a;->h()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    invoke-virtual {p2}, Lvh1/a;->c()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x3

    invoke-virtual {p2}, Lvh1/a;->d()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x4

    invoke-virtual {p2}, Lvh1/a;->a()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x5

    invoke-virtual {p2}, Lvh1/a;->b()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    const/4 v0, 0x6

    invoke-virtual {p2}, Lvh1/a;->j()D

    move-result-wide v1

    invoke-interface {p1, v1, v2, v0}, Ltb/c;->t(DI)V

    invoke-virtual {p2}, Lvh1/a;->g()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lvh1/a;->g()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v2, v3, v1}, Ltb/c;->t(DI)V

    :goto_0
    invoke-virtual {p2}, Lvh1/a;->f()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lvh1/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lvh1/a;->e()Ljava/lang/Double;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lvh1/a;->e()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-interface {p1, v2, v3, v1}, Ltb/c;->t(DI)V

    :goto_2
    invoke-virtual {p2}, Lvh1/a;->i()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_3
    invoke-virtual {p2}, Lvh1/a;->i()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lvh1/a;

    invoke-virtual {p0, p1, p2}, Luh1/b$a;->a(Ltb/c;Lvh1/a;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `gps_locations` (`timestamp`,`latitude`,`longitude`,`altitude`,`horizontal_accuracy_meters`,`vertical_accuracy_meters`,`speed_value`,`speed_unit`,`speed_accuracy`,`trigger`) VALUES (?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
