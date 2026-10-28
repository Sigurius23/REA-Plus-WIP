.class public final Ld20/i;
.super Lc20/e;
.source "SourceFile"


# instance fields
.field public final a:Lux/t;

.field public final b:Z

.field public final c:Lc93/a;

.field public final d:Ljava/util/Set;

.field public e:Lj/d;

.field public final f:Lck1/c;


# direct methods
.method public constructor <init>(Lux/t;ZLc93/a;Ljava/util/Set;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publishableKeyProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld20/i;->a:Lux/t;

    iput-boolean p2, p0, Ld20/i;->b:Z

    iput-object p3, p0, Ld20/i;->c:Lc93/a;

    iput-object p4, p0, Ld20/i;->d:Ljava/util/Set;

    new-instance p1, Lck1/c;

    const/16 p2, 0x10

    invoke-direct {p1, p0, p2}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ld20/i;->f:Lck1/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ld20/i;->e:Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ld20/i;->e:Lj/d;

    return-void
.end method

.method public final b(Lj/c;Lj/b;)V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract;-><init>()V

    invoke-interface {p1, v0, p2}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    iput-object p1, p0, Ld20/i;->e:Lj/d;

    return-void
.end method

.method public final d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 10

    move-object v3, p2

    check-cast v3, Ly00/c8;

    iget-object p2, p0, Ld20/i;->f:Lck1/c;

    invoke-virtual {p2, p1}, Lck1/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld20/m;

    new-instance v0, Ld20/l;

    new-instance v1, Lq30/q0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p4

    const-string v2, "randomUUID(...)"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p4}, Lq30/q0;-><init>(Ljava/util/UUID;)V

    iget-object p4, p0, Ld20/i;->a:Lux/t;

    iget-object v2, p4, Lux/t;->a:Lux/r;

    invoke-interface {v3}, Ly00/c8;->m()Ly00/b8;

    move-result-object p4

    const-string v4, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p4

    check-cast v4, Ly00/v7;

    iget-object v7, p1, Ls40/a;->b:Ljava/lang/Integer;

    iget-object p1, p0, Ld20/i;->c:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Ljava/lang/String;

    iget-object v9, p0, Ld20/i;->d:Ljava/util/Set;

    iget-boolean v6, p0, Ld20/i;->b:Z

    move-object v5, p3

    invoke-direct/range {v0 .. v9}, Ld20/l;-><init>(Lq30/q0;Lux/r;Ly00/c8;Ly00/v7;Lyy/f;ZLjava/lang/Integer;Ljava/lang/String;Ljava/util/Set;)V

    invoke-interface {p2, v0}, Ls40/b;->b(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
