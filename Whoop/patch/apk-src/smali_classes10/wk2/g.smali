.class public final Lwk2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lwk2/g;",
        "",
        "Lor2/o0;",
        "kalmanFilter",
        "<init>",
        "(Lor2/o0;)V",
        "Lwk2/f;",
        "previous",
        "Lfv1/b;",
        "location",
        "a",
        "(Lwk2/f;Lfv1/b;)Lwk2/f;",
        "Ll83/a0;",
        "b",
        "()V",
        "Lor2/o0;",
        "track-activity_release"
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
.field private final a:Lor2/o0;


# direct methods
.method public constructor <init>(Lor2/o0;)V
    .locals 1

    const-string v0, "kalmanFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwk2/g;->a:Lor2/o0;

    return-void
.end method

.method public synthetic constructor <init>(Lor2/o0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    new-instance p1, Lor2/o0;

    invoke-direct {p1}, Lor2/o0;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, Lwk2/g;-><init>(Lor2/o0;)V

    return-void
.end method


# virtual methods
.method public final a(Lwk2/f;Lfv1/b;)Lwk2/f;
    .locals 9

    const-string v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwk2/g;->a:Lor2/o0;

    new-instance v1, Lp92/h$a;

    invoke-static {p2}, Lwk2/h;->a(Lfv1/b;)Landroid/location/Location;

    move-result-object v2

    invoke-virtual {p2}, Lfv1/b;->e()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lp92/h$a;-><init>(Landroid/location/Location;J)V

    invoke-virtual {v0, v1}, Lor2/o0;->a(Lp92/h$a;)Lp92/h$a;

    move-result-object p2

    invoke-virtual {p2}, Lp92/h$a;->c()Landroid/location/Location;

    move-result-object p2

    new-instance v2, Lw41/w;

    invoke-virtual {p2}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p2}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v2, v0, v1, v3, v4}, Lw41/w;-><init>(DD)V

    invoke-virtual {p1}, Lwk2/f;->e()Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lwk2/f;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v2, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v5, Landroid/location/Location;

    invoke-direct {v5, p2}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lwk2/f;->b(Lwk2/f;Ljava/util/List;Lw41/w;DLandroid/location/Location;ILjava/lang/Object;)Lwk2/f;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    invoke-virtual {p1, p2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lwk2/f;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v2, v1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0}, Lwk2/f;->c()D

    move-result-wide v3

    float-to-double v5, p1

    add-double/2addr v3, v5

    new-instance v5, Landroid/location/Location;

    invoke-direct {v5, p2}, Landroid/location/Location;-><init>(Landroid/location/Location;)V

    invoke-virtual/range {v0 .. v5}, Lwk2/f;->a(Ljava/util/List;Lw41/w;DLandroid/location/Location;)Lwk2/f;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lwk2/f;->b(Lwk2/f;Ljava/util/List;Lw41/w;DLandroid/location/Location;ILjava/lang/Object;)Lwk2/f;

    move-result-object p1

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lwk2/g;->a:Lor2/o0;

    invoke-virtual {v0}, Lor2/o0;->b()V

    return-void
.end method
