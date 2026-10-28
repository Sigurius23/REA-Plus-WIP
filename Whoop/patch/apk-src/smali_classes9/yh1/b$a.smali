.class public final Lyh1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyh1/b$a;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "",
        "unit",
        "accuracy",
        "Lyh1/b;",
        "a",
        "(DLjava/lang/String;D)Lyh1/b;",
        "gps-tracking_release"
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
    invoke-direct {p0}, Lyh1/b$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lyh1/b$a;DLjava/lang/String;DILjava/lang/Object;)Lyh1/b;
    .locals 6

    and-int/lit8 p6, p6, 0x2

    if-eqz p6, :cond_0

    const-string p3, "m/s"

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lyh1/b$a;->a(DLjava/lang/String;D)Lyh1/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(DLjava/lang/String;D)Lyh1/b;
    .locals 7

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    invoke-static {p4, p5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    new-instance v1, Lyh1/b;

    move-wide v2, p1

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lyh1/b;-><init>(DLjava/lang/String;D)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
