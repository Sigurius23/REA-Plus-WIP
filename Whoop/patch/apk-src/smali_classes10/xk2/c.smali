.class public final Lxk2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxk2/c;",
        "",
        "<init>",
        "()V",
        "",
        "activityInternalName",
        "",
        "userWeightKg",
        "",
        "activityDurationSeconds",
        "a",
        "(Ljava/lang/String;DJ)D",
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


# static fields
.field public static final a:Lxk2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxk2/c;

    invoke-direct {v0}, Lxk2/c;-><init>()V

    sput-object v0, Lxk2/c;->a:Lxk2/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;DJ)D
    .locals 4

    const-string v0, "activityInternalName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    cmpg-double v0, p2, v0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lxk2/d;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxk2/e;

    if-nez p1, :cond_1

    :goto_0
    const-wide/16 p1, 0x0

    return-wide p1

    :cond_1
    invoke-virtual {p1}, Lxk2/e;->b()D

    move-result-wide v0

    mul-double/2addr v0, p2

    invoke-virtual {p1}, Lxk2/e;->c()D

    move-result-wide v2

    add-double/2addr v2, v0

    long-to-double p4, p4

    invoke-virtual {p1}, Lxk2/e;->a()D

    move-result-wide v0

    div-double/2addr p4, v0

    invoke-static {p4, p5}, Le93/b;->Y(D)J

    move-result-wide p4

    const-wide/16 v0, 0x1

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    long-to-double p4, p4

    mul-double/2addr p4, v2

    const-wide v0, 0x40af400000000000L    # 4000.0

    mul-double/2addr p2, v0

    div-double/2addr p4, p2

    const-wide p2, 0x3fd999999999999aL    # 0.4

    mul-double/2addr p4, p2

    invoke-virtual {p1}, Lxk2/e;->d()D

    move-result-wide p1

    invoke-static {p1, p2, p4, p5}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    return-wide p1
.end method
