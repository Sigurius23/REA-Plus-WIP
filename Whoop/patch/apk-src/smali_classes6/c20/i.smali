.class public final Lc20/i;
.super Lc20/e;
.source "SourceFile"


# instance fields
.field public final a:Lc20/n;

.field public final b:Lc20/c;

.field public final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lc20/n;Lc20/c;Landroid/content/Context;)V
    .locals 1

    const-string v0, "webIntentAuthenticator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noOpIntentAuthenticator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc20/i;->a:Lc20/n;

    iput-object p2, p0, Lc20/i;->b:Lc20/c;

    iput-object p3, p0, Lc20/i;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 6

    check-cast p2, Ly00/c8;

    invoke-interface {p2}, Ly00/c8;->m()Ly00/b8;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ly00/q7;

    invoke-interface {v0}, Ly00/q7;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "context"

    iget-object v1, p0, Lc20/i;->c:Landroid/content/Context;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyy/j;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    invoke-static {v2}, Ls93/k;->c(Ljava/lang/Object;)V

    sget-object v3, Lqy/e;->b:Lqy/d;

    invoke-direct {v1, v3, v2}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v2, Lb10/b;

    new-instance v3, Lal0/f;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lal0/f;-><init>(Landroid/content/Context;I)V

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v2, v0, v4, v3}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    sget-object v0, Lb20/e;->y:Lb20/e;

    invoke-interface {p2}, Ly00/c8;->O()Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, v3, Lcom/stripe/android/model/StripeIntent$NextActionType;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    const-string v4, "next_action_type"

    invoke-static {v4, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x2

    and-int/lit8 v4, v4, 0x4

    sget-object v5, Lm83/z;->w:Lm83/z;

    if-eqz v4, :cond_1

    move-object v3, v5

    :cond_1
    invoke-static {v5, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lyy/c;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lyy/j;->a(Lyy/b;)V

    iget-object v0, p0, Lc20/i;->b:Lc20/c;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc20/e;->c(Ls40/a;Ljava/lang/Object;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_2
    iget-object v0, p0, Lc20/i;->a:Lc20/n;

    invoke-virtual {v0, p1, p2, p3, p4}, Lc20/e;->c(Ls40/a;Ljava/lang/Object;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
