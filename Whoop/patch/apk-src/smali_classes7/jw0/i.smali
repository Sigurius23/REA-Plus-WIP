.class public abstract Ljw0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljw0/i$a;,
        Ljw0/i$b;,
        Ljw0/i$c;,
        Ljw0/i$d;,
        Ljw0/i$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0005\u0010\u000e\u0012\u0015\u000cB%\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u0014\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ljw0/i;",
        "",
        "",
        "vow",
        "Lmw0/f;",
        "mainStat",
        "centerStat",
        "<init>",
        "(Ljava/lang/String;Lmw0/f;Lmw0/f;)V",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;",
        "selectedTooltip",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;)Lcom/whoop/design/util/TextResource;",
        "a",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "b",
        "Lmw0/f;",
        "()Lmw0/f;",
        "e",
        "Ljw0/i$a;",
        "Ljw0/i$b;",
        "Ljw0/i$c;",
        "Ljw0/i$d;",
        "Ljw0/i$e;",
        "core-details_release"
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
.field public static final d:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lmw0/f;

.field private final c:Lmw0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Ljw0/i;->d:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lmw0/f;Lmw0/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ljw0/i;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Ljw0/i;->b:Lmw0/f;

    .line 5
    iput-object p3, p0, Ljw0/i;->c:Lmw0/f;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lmw0/f;Lmw0/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ljw0/i;-><init>(Ljava/lang/String;Lmw0/f;Lmw0/f;)V

    return-void
.end method


# virtual methods
.method public a()Lmw0/f;
    .locals 1

    iget-object v0, p0, Ljw0/i;->c:Lmw0/f;

    return-object v0
.end method

.method public abstract b()Lmw0/f;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public final d(Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;)Lcom/whoop/design/util/TextResource;
    .locals 3

    const-string v0, "selectedTooltip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljw0/i;->b()Lmw0/f;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmw0/f;->a()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "No tooltip present for stat "

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, Ljw0/i;->b()Lmw0/f;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lmw0/f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljw0/i;->b()Lmw0/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p0}, Ljw0/i;->a()Lmw0/f;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lmw0/f;->a()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v1

    :cond_3
    if-ne v1, p1, :cond_5

    invoke-virtual {p0}, Ljw0/i;->a()Lmw0/f;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lmw0/f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-eqz p1, :cond_4

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljw0/i;->a()Lmw0/f;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot get vow for tooltip "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " with present stats"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
