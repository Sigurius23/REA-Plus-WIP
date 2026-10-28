.class public final Lmy1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmy1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lmy1/b$a;",
        "",
        "<init>",
        "()V",
        "",
        "trimLevel",
        "Lmy1/b;",
        "a",
        "(I)Lmy1/b;",
        "level",
        "",
        "b",
        "(I)Ljava/lang/String;",
        "metrics_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmy1/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lmy1/b;
    .locals 11

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    move-result-wide v5

    sub-long/2addr v3, v5

    new-instance v5, Lmy1/b;

    const-wide/16 v6, 0x0

    cmp-long v0, v1, v6

    if-lez v0, :cond_0

    long-to-double v3, v3

    long-to-double v0, v1

    div-double/2addr v3, v0

    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double/2addr v3, v0

    :goto_0
    move-wide v6, v3

    goto :goto_1

    :cond_0
    const-wide/16 v3, 0x0

    goto :goto_0

    :goto_1
    invoke-static {}, Ljava/lang/Thread;->activeCount()I

    move-result v8

    invoke-virtual {p0, p1}, Lmy1/b$a;->b(I)Ljava/lang/String;

    move-result-object v10

    move v9, p1

    invoke-direct/range {v5 .. v10}, Lmy1/b;-><init>(DIILjava/lang/String;)V

    return-object v5
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    const-string p1, "BACKGROUND"

    return-object p1

    :cond_0
    const/16 v0, 0x14

    if-lt p1, v0, :cond_1

    const-string p1, "UI_HIDDEN"

    return-object p1

    :cond_1
    const-string p1, "OTHER"

    return-object p1
.end method
