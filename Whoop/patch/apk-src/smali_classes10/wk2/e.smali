.class public abstract Lwk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lwk2/c;",
        "a",
        "Lwk2/c;",
        "c",
        "()Lwk2/c;",
        "SystemElapsedTimeSource",
        "track-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lwk2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwk2/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lwk2/e;->a:Lwk2/c;

    return-void
.end method

.method public static synthetic a()J
    .locals 2

    invoke-static {}, Lwk2/e;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final b()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final c()Lwk2/c;
    .locals 1

    sget-object v0, Lwk2/e;->a:Lwk2/c;

    return-object v0
.end method
