.class public final Llive/hms/video/utils/RunningAverage;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/RunningAverage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\u0003R\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Llive/hms/video/utils/RunningAverage;",
        "",
        "<init>",
        "()V",
        "",
        "item",
        "Ll83/a0;",
        "add",
        "(J)V",
        "",
        "getAvg",
        "()D",
        "reset",
        "total",
        "J",
        "count",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/utils/RunningAverage$Companion;

.field public static final TAG:Ljava/lang/String; = "RunningAverage"


# instance fields
.field private count:J

.field private total:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/utils/RunningAverage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/utils/RunningAverage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/utils/RunningAverage;->Companion:Llive/hms/video/utils/RunningAverage$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final add(J)V
    .locals 4

    iget-wide v0, p0, Llive/hms/video/utils/RunningAverage;->count:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Llive/hms/video/utils/RunningAverage;->count:J

    iget-wide v0, p0, Llive/hms/video/utils/RunningAverage;->total:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Llive/hms/video/utils/RunningAverage;->total:J

    return-void
.end method

.method public final getAvg()D
    .locals 4

    iget-wide v0, p0, Llive/hms/video/utils/RunningAverage;->count:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-wide v2, p0, Llive/hms/video/utils/RunningAverage;->total:J

    long-to-double v2, v2

    long-to-double v0, v0

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public final reset()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/utils/RunningAverage;->total:J

    iput-wide v0, p0, Llive/hms/video/utils/RunningAverage;->count:J

    return-void
.end method
