.class public final Lux/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/String;

.field public static final d:Z


# instance fields
.field public final a:Lb10/z0;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lqy/a;->c:Lqy/a;

    invoke-virtual {v0}, Lqy/a;->a()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lux/j0;->c:Ljava/lang/String;

    const/4 v0, 0x1

    sput-boolean v0, Lux/j0;->d:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "getApplicationContext(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lb10/z0;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lar0/a;

    const/16 v3, 0xb

    invoke-direct {v7, v1, v3}, Lar0/a;-><init>(Ljava/lang/String;I)V

    sget-object v8, Lb10/c1;->a:Lb10/b1;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lb10/b1;->b:Lb10/d;

    const/4 v13, 0x0

    const v15, 0xdfe0

    sget-object v9, Lqy/e;->b:Lqy/d;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v14, Lm83/a0;->w:Lm83/a0;

    invoke-direct/range {v5 .. v15}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lqy/d;Lq83/j;Ljava/util/Set;Lyy/j;Lb10/b;Ljava/util/Set;I)V

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    const-string v11, "Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys"

    if-nez v6, :cond_5

    const-string v12, "sk_"

    const/4 v13, 0x0

    invoke-static {v1, v12, v13}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    const-string v14, "Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys"

    if-nez v6, :cond_4

    const-string v15, "rk_"

    invoke-static {v1, v15, v13}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    const-string v7, "Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys"

    if-nez v6, :cond_3

    move-object v8, v5

    new-instance v5, Lux/s0;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v7

    new-instance v7, Lar0/a;

    invoke-direct {v7, v1, v3}, Lar0/a;-><init>(Ljava/lang/String;I)V

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    invoke-direct/range {v5 .. v10}, Lux/s0;-><init>(Landroid/content/Context;Lc93/a;Lb10/z0;Lq83/j;I)V

    move-object v5, v8

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lkc3/d;->w:Lkc3/d;

    const-string v4, "workContext"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v5, v0, Lux/j0;->a:Lb10/z0;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v1, v12, v13}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v1, v15, v13}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_0

    iput-object v1, v0, Lux/j0;->b:Ljava/lang/String;

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object v2, v7

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static a(Lux/j0;Ly00/m;)Ly00/g8;
    .locals 3

    new-instance v0, Ls40/c0;

    const/4 v1, 0x0

    const/16 v2, 0x10

    invoke-direct {v0, p0, p1, v1, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object p0, Lq83/k;->w:Lq83/k;

    invoke-static {p0, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly00/g8;

    return-object p0
.end method

.method public static b(Lux/j0;Ly00/d5;)Ly00/o4;
    .locals 3

    new-instance v0, Ls40/c0;

    const/4 v1, 0x0

    const/16 v2, 0x11

    invoke-direct {v0, p0, p1, v1, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object p0, Lq83/k;->w:Lq83/k;

    invoke-static {p0, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly00/o4;

    return-object p0
.end method


# virtual methods
.method public final c(Ly00/m;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lux/i0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lux/i0;

    iget v1, v0, Lux/i0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lux/i0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lux/i0;

    invoke-direct {v0, p0, p2}, Lux/i0;-><init>(Lux/j0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lux/i0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lux/i0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lyy/f;

    iget-object v2, p0, Lux/j0;->b:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {p2, v2, v4, v4}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput v3, v0, Lux/i0;->y:I

    iget-object v2, p0, Lux/j0;->a:Lb10/z0;

    invoke-virtual {v2, p1, p2, v0}, Lb10/z0;->s(Ly00/m;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_4

    return-object p1

    :cond_4
    sget p1, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p1

    throw p1
.end method
