.class public final Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "",
        "showProgressIndicator",
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


# static fields
.field public static final synthetic y:I


# instance fields
.field public final w:Ll8/d;

.field public final x:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, Lb0/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/b;-><init>(I)V

    new-instance v1, Lat2/b1;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lat2/b1;-><init>(I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lay/b0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v4, v1}, Lb0/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lb0/b;->c()Ll8/d;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->w:Ll8/d;

    new-instance v0, Lay/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lay/k;-><init>(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lay/o;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lay/o;-><init>(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;I)V

    new-instance v4, Lay/o;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lay/o;-><init>(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->x:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "intent_confirmation_challenge_args"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v1, La20/b;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {p1, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance p1, Lay/n;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lay/n;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lx1/b;

    const v2, -0x695de141

    invoke-direct {v1, p1, v0, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v1}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
