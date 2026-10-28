.class public final Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityContract;",
        "Lk/b;",
        "Lay/p;",
        "Lay/s;",
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

    check-cast p2, Lay/p;

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->y:I

    new-instance v0, Lay/t;

    iget-object v1, p2, Lay/p;->a:Ljava/lang/String;

    iget-object v2, p2, Lay/p;->b:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iget-object p2, p2, Lay/p;->c:Ly00/c8;

    invoke-direct {v0, v1, v2, p2}, Lay/t;-><init>(Ljava/lang/String;Ljava/util/List;Ly00/c8;)V

    new-instance p2, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    invoke-direct {p2, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p1, Ll83/k;

    const-string v1, "intent_confirmation_challenge_args"

    invoke-direct {p1, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtras(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract.extra_result"

    const-class v0, Lay/s;

    invoke-static {p1, v0, p2}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lay/s;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lay/q;

    new-instance p2, Ljava/lang/Throwable;

    const-string v0, "No result"

    invoke-direct {p2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lay/q;-><init>(Ljava/lang/Throwable;)V

    :cond_1
    return-object p1
.end method
