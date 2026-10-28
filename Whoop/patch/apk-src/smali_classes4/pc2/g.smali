.class public final Lpc2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpc2/g;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lpc2/b;",
        "result",
        "Lpc2/f;",
        "a",
        "(Lpc2/b;)Lpc2/f;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "settings_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc2/g;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lpc2/b;)Lpc2/f;
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpc2/g;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "maverick-regulatory-labels-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    instance-of v1, p1, Lpc2/b$a;

    if-eqz v1, :cond_6

    new-instance v1, Lpc2/f;

    check-cast p1, Lpc2/b$a;

    invoke-virtual {p1}, Lpc2/b$a;->a()Lst0/v;

    move-result-object v2

    invoke-virtual {v2}, Lst0/v;->isGen4()Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Lea2/s;->w0:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lpc2/b$a;->a()Lst0/v;

    move-result-object v2

    invoke-virtual {v2}, Lst0/v;->isMaverick()Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    sget v2, Lea2/s;->y0:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lpc2/b$a;->a()Lst0/v;

    move-result-object v2

    invoke-virtual {v2}, Lst0/v;->isGoose()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    sget v2, Lea2/s;->x0:I

    goto :goto_0

    :cond_2
    sget v2, Lea2/s;->v0:I

    :goto_0
    invoke-virtual {p1}, Lpc2/b$a;->a()Lst0/v;

    move-result-object v3

    invoke-virtual {v3}, Lst0/v;->isGen4()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {}, Lpc2/h;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lpc2/b$a;->a()Lst0/v;

    move-result-object v3

    invoke-virtual {v3}, Lst0/v;->isMaverick()Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v0, :cond_4

    invoke-static {}, Lpc2/h;->c()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lpc2/b$a;->a()Lst0/v;

    move-result-object p1

    invoke-virtual {p1}, Lst0/v;->isGoose()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz v0, :cond_5

    invoke-static {}, Lpc2/h;->b()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_5
    invoke-static {}, Lpc2/h;->a()Ljava/util/List;

    move-result-object p1

    :goto_1
    invoke-direct {v1, v2, p1}, Lpc2/f;-><init>(ILjava/util/List;)V

    return-object v1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
