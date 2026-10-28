.class public final synthetic Lsz/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;I)V
    .locals 0

    iput p2, p0, Lsz/p;->w:I

    iput-object p1, p0, Lsz/p;->x:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lsz/p;->w:I

    iget-object v1, p0, Lsz/p;->x:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->z:I

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb20/f;

    new-instance v2, Lyy/j;

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lkc3/d;->w:Lkc3/d;

    invoke-static {v3}, Ls93/k;->c(Ljava/lang/Object;)V

    sget-object v4, Lqy/e;->b:Lqy/d;

    invoke-direct {v2, v4, v3}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v3, Lb10/b;

    new-instance v4, Lal0/f;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v3, v0, v5, v4}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    invoke-direct {v1, v2, v3}, Lb20/f;-><init>(Lyy/j;Lyy/c;)V

    return-object v1

    :pswitch_0
    new-instance v0, Ln20/t;

    iget-object v1, v1, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;->y:Lsz/t;

    if-eqz v1, :cond_0

    invoke-direct {v0, v1}, Ln20/t;-><init>(Lsz/t;)V

    return-object v0

    :cond_0
    const-string v0, "args"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
