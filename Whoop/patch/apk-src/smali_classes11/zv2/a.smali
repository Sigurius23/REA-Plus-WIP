.class final Lzv2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ \u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzv2/a;",
        "Lt2/a;",
        "<init>",
        "()V",
        "Lh2/b;",
        "consumed",
        "available",
        "",
        "source",
        "J",
        "(JJI)J",
        "Ly3/q;",
        "V",
        "(JJLq83/d;)Ljava/lang/Object;",
        "weightlifting_release"
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
.field public static final w:Lzv2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzv2/a;

    invoke-direct {v0}, Lzv2/a;-><init>()V

    sput-object v0, Lzv2/a;->w:Lzv2/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public J(JJI)J
    .locals 0

    return-wide p3
.end method

.method public V(JJLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ly3/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ly3/q;

    invoke-direct {p1, p3, p4}, Ly3/q;-><init>(J)V

    return-object p1
.end method

.method public bridge l0(JI)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public p0(JLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ly3/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ly3/q;

    const-wide/16 p2, 0x0

    invoke-direct {p1, p2, p3}, Ly3/q;-><init>(J)V

    return-object p1
.end method
