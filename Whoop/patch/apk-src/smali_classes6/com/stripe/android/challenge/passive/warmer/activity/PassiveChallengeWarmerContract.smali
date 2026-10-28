.class public final Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerContract;",
        "Lk/b;",
        "Lfy/e;",
        "Lfy/d;",
        "<init>",
        "()V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 3

    check-cast p2, Lfy/e;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->y:I

    new-instance v0, Lfy/c;

    iget-object v1, p2, Lfy/e;->a:Ly00/c3;

    iget-object v2, p2, Lfy/e;->b:Ljava/lang/String;

    iget-object p2, p2, Lfy/e;->c:Ljava/util/Set;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, v1, v2, p2}, Lfy/c;-><init>(Ly00/c3;Ljava/lang/String;Ljava/util/List;)V

    new-instance p2, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;

    invoke-direct {p2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "passive_challenge_warmer_args"

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    sget-object p1, Lfy/d;->w:Lfy/d;

    return-object p1
.end method
