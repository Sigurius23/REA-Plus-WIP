.class public final Llive/hms/video/transport/RetryScheduler$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/transport/RetryScheduler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/RetryScheduler$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/transport/RetryScheduler$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "getDelayForCategory",
        "",
        "category",
        "Llive/hms/video/transport/models/TransportFailureCategory;",
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
    invoke-direct {p0}, Llive/hms/video/transport/RetryScheduler$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDelayForCategory(Llive/hms/video/transport/models/TransportFailureCategory;)J
    .locals 5

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x3e8

    sget-object v1, Lg93/d;->x:Lg93/a;

    invoke-virtual {v1, v0}, Lg93/a;->g(I)I

    move-result v0

    sget-object v1, Llive/hms/video/transport/RetryScheduler$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-wide/16 v1, 0x7d0

    int-to-long v3, v0

    add-long/2addr v3, v1

    return-wide v3

    :cond_1
    const-wide/16 v0, 0x3e8

    return-wide v0
.end method
