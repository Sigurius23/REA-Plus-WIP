.class public final Lay/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lay/z;
.implements Ld20/m;


# instance fields
.field public final a:Ls40/a;


# direct methods
.method public constructor <init>(Ls40/a;I)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    const-string p2, "host"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lay/x;->a:Ls40/a;

    return-void

    :pswitch_0
    const-string p2, "host"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lay/x;->a:Ls40/a;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lay/p;)V
    .locals 3

    sget v0, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;->y:I

    iget-object v0, p1, Lay/p;->a:Ljava/lang/String;

    iget-object v1, p1, Lay/p;->c:Ly00/c8;

    iget-object p1, p1, Lay/p;->b:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    new-instance v2, Lay/t;

    invoke-direct {v2, v0, p1, v1}, Lay/t;-><init>(Ljava/lang/String;Ljava/util/List;Ly00/c8;)V

    new-instance p1, Ll83/k;

    const-string v0, "intent_confirmation_challenge_args"

    invoke-direct {p1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    sget-object v0, Lux/s0;->l:Ljava/util/List;

    invoke-static {v1}, Ls4/g;->i(Ly00/c8;)I

    move-result v0

    iget-object v1, p0, Lay/x;->a:Ls40/a;

    const-class v2, Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivity;

    invoke-virtual {v1, v2, p1, v0}, Ls40/a;->a(Ljava/lang/Class;Landroid/os/Bundle;I)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Ld20/l;

    new-instance v0, Ll83/k;

    const-string v1, "extra_args"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    sget-object v1, Lux/s0;->l:Ljava/util/List;

    iget-object p1, p1, Ld20/l;->y:Ly00/c8;

    invoke-static {p1}, Ls4/g;->i(Ly00/c8;)I

    move-result p1

    iget-object v1, p0, Lay/x;->a:Ls40/a;

    const-class v2, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;

    invoke-virtual {v1, v2, v0, p1}, Ls40/a;->a(Ljava/lang/Class;Landroid/os/Bundle;I)V

    return-void
.end method
