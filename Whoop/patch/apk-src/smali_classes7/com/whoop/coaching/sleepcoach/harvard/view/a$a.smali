.class public final Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/coaching/sleepcoach/harvard/view/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "screenWidth",
        "Llp0/l;",
        "tonightsSleep",
        "optimalSleepWindow",
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "a",
        "(ILlp0/l;Llp0/l;)Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "sleep-coach_release"
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
    invoke-direct {p0}, Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILlp0/l;Llp0/l;)Lcom/whoop/coaching/sleepcoach/harvard/view/a;
    .locals 4

    const-string v0, "tonightsSleep"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optimalSleepWindow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Llp0/l;->b()Lorg/joda/time/Duration;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/base/BaseDuration;->getMillis()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x3ff547ae147ae148L    # 1.33

    mul-double/2addr v0, v2

    int-to-double v2, p1

    div-double/2addr v2, v0

    double-to-int p1, v0

    invoke-static {p1, p2}, Llp0/i;->a(ILlp0/l;)Lorg/joda/time/Instant;

    move-result-object p2

    new-instance p3, Lcom/whoop/coaching/sleepcoach/harvard/view/a;

    invoke-direct {p3, v2, v3, p1, p2}, Lcom/whoop/coaching/sleepcoach/harvard/view/a;-><init>(DILorg/joda/time/Instant;)V

    return-object p3
.end method
