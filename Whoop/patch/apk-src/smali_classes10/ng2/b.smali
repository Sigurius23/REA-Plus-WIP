.class public final Lng2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lng2/b;",
        "",
        "Lfv1/c;",
        "locationManager",
        "Lgi1/b;",
        "gpsPermissionHelper",
        "<init>",
        "(Lfv1/c;Lgi1/b;)V",
        "Lw41/w;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "",
        "isGpsTrackingEnabledFlow",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lfv1/c;",
        "Lgi1/b;",
        "start-activity_release"
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
.field private final a:Lfv1/c;

.field private final b:Lgi1/b;


# direct methods
.method public constructor <init>(Lfv1/c;Lgi1/b;)V
    .locals 1

    const-string v0, "locationManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gpsPermissionHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng2/b;->a:Lfv1/c;

    iput-object p2, p0, Lng2/b;->b:Lgi1/b;

    return-void
.end method

.method public static final synthetic a(Lng2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lng2/b;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lw41/w;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lng2/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lng2/b$a;

    iget v1, v0, Lng2/b$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lng2/b$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lng2/b$a;

    invoke-direct {v0, p0, p1}, Lng2/b$a;-><init>(Lng2/b;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lng2/b$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lng2/b$a;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lng2/b;->b:Lgi1/b;

    invoke-virtual {p1}, Lgi1/b;->b()Z

    move-result p1

    if-nez p1, :cond_3

    return-object v3

    :cond_3
    iget-object p1, p0, Lng2/b;->a:Lfv1/c;

    iput v4, v0, Lng2/b$a;->y:I

    invoke-interface {p1, v0}, Lfv1/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p1, Lfv1/b;

    if-eqz p1, :cond_5

    new-instance v0, Lw41/w;

    invoke-virtual {p1}, Lfv1/b;->c()D

    move-result-wide v1

    invoke-virtual {p1}, Lfv1/b;->d()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lw41/w;-><init>(DD)V

    return-object v0

    :cond_5
    return-object v3
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "isGpsTrackingEnabledFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lng2/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lng2/b$b;-><init>(Lq83/d;Lng2/b;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
