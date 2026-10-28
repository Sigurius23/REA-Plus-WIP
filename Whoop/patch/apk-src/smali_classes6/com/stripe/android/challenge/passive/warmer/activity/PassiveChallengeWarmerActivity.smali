.class public final Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;",
        "Lm/m;",
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


# static fields
.field public static final synthetic y:I


# instance fields
.field public final w:Ll8/d;

.field public final x:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    sget-object v0, Lfy/g;->E:Ll8/d;

    iput-object v0, p0, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->w:Ll8/d;

    new-instance v0, Ld1/i;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Lfy/g;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lfy/b;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lfy/b;-><init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;I)V

    new-instance v4, Lfy/b;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lfy/b;-><init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;->x:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v0, Lfy/a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lfy/a;-><init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;Lq83/d;I)V

    const/4 v1, 0x3

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v0, Lfy/a;

    const/4 v3, 0x1

    invoke-direct {v0, p0, v2, v3}, Lfy/a;-><init>(Lcom/stripe/android/challenge/passive/warmer/activity/PassiveChallengeWarmerActivity;Lq83/d;I)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
