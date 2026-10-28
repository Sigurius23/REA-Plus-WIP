.class public final Lh32/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh32/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh32/c$a;,
        Lh32/c$b;,
        Lh32/c$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 %2\u00020\u0001:\u0003\u0016\u0019\u0015B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\t2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u000fJ\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0018\u0010 \u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0018\u0010$\u001a\u00060!R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lh32/c;",
        "Lh32/a;",
        "Lcom/whoop/payments/domain/PaymentsApi;",
        "api",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "Lkotlin/Function1;",
        "",
        "Lux/j0;",
        "stripeFactory",
        "<init>",
        "(Lcom/whoop/payments/domain/PaymentsApi;Landroid/content/Context;Ltr2/n;Lkotlin/jvm/functions/Function1;)V",
        "i",
        "(Lq83/d;)Ljava/lang/Object;",
        "country",
        "k",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "j",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "b",
        "a",
        "Lcom/whoop/payments/domain/PaymentsApi;",
        "Landroid/content/Context;",
        "c",
        "Ltr2/n;",
        "d",
        "Lkotlin/jvm/functions/Function1;",
        "Lh32/c$a;",
        "e",
        "Lh32/c$a;",
        "authenticatedStripe",
        "Lh32/c$c;",
        "f",
        "Lh32/c$c;",
        "onboardingStripe",
        "g",
        "payments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final g:Lh32/c$b;

.field public static final h:I


# instance fields
.field private final a:Lcom/whoop/payments/domain/PaymentsApi;

.field private final b:Landroid/content/Context;

.field private final c:Ltr2/n;

.field private final d:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final e:Lh32/c$a;

.field private final f:Lh32/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh32/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh32/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh32/c;->g:Lh32/c$b;

    const/16 v0, 0x8

    sput v0, Lh32/c;->h:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/payments/domain/PaymentsApi;Landroid/content/Context;Ltr2/n;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/payments/domain/PaymentsApi;",
            "Landroid/content/Context;",
            "Ltr2/n;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh32/c;->a:Lcom/whoop/payments/domain/PaymentsApi;

    .line 3
    iput-object p2, p0, Lh32/c;->b:Landroid/content/Context;

    .line 4
    iput-object p3, p0, Lh32/c;->c:Ltr2/n;

    .line 5
    iput-object p4, p0, Lh32/c;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance p1, Lh32/c$a;

    new-instance p2, Lh32/c$d;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lh32/c$d;-><init>(Lh32/c;Lq83/d;)V

    invoke-direct {p1, p0, p2}, Lh32/c$a;-><init>(Lh32/c;Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lh32/c;->e:Lh32/c$a;

    .line 7
    new-instance p1, Lh32/c$c;

    invoke-direct {p1, p0}, Lh32/c$c;-><init>(Lh32/c;)V

    iput-object p1, p0, Lh32/c;->f:Lh32/c$c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/payments/domain/PaymentsApi;Landroid/content/Context;Ltr2/n;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 8
    new-instance p4, Lh32/b;

    const/4 p5, 0x0

    invoke-direct {p4, p2, p5}, Lh32/b;-><init>(Landroid/content/Context;I)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lh32/c;-><init>(Lcom/whoop/payments/domain/PaymentsApi;Landroid/content/Context;Ltr2/n;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;Ljava/lang/String;)Lux/j0;
    .locals 0

    invoke-static {p0, p1}, Lh32/c;->d(Landroid/content/Context;Ljava/lang/String;)Lux/j0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroid/content/Context;Ljava/lang/String;)Lux/j0;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/j0;

    invoke-direct {v0, p0, p1}, Lux/j0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final synthetic e(Lh32/c;)Lcom/whoop/payments/domain/PaymentsApi;
    .locals 0

    iget-object p0, p0, Lh32/c;->a:Lcom/whoop/payments/domain/PaymentsApi;

    return-object p0
.end method

.method public static final synthetic f(Lh32/c;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lh32/c;->d:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic g(Lh32/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lh32/c;->i(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lh32/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lh32/c;->k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lh32/c$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh32/c$e;

    iget v1, v0, Lh32/c$e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh32/c$e;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lh32/c$e;

    invoke-direct {v0, p0, p1}, Lh32/c$e;-><init>(Lh32/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lh32/c$e;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lh32/c$e;->y:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lh32/c;->c:Ltr2/n;

    new-instance v5, Lh32/c$f;

    invoke-direct {v5, p0, v9}, Lh32/c$f;-><init>(Lh32/c;Lq83/d;)V

    iput p1, v6, Lh32/c$e;->y:I

    const/4 v3, 0x0

    const-string v4, "Failed to resolve Stripe key"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4

    return-object v9

    :cond_4
    return-object p1

    :cond_5
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_6

    return-object v9

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "US"

    :cond_2
    return-object p1
.end method

.method private final k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lh32/c$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh32/c$g;

    iget v1, v0, Lh32/c$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh32/c$g;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lh32/c$g;

    invoke-direct {v0, p0, p2}, Lh32/c$g;-><init>(Lh32/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lh32/c$g;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lh32/c$g;->z:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lh32/c$g;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lh32/c;->c:Ltr2/n;

    new-instance v5, Lh32/c$h;

    invoke-direct {v5, p0, p1, v9}, Lh32/c$h;-><init>(Lh32/c;Ljava/lang/String;Lq83/d;)V

    iput-object v9, v6, Lh32/c$g;->w:Ljava/lang/Object;

    iput p2, v6, Lh32/c$g;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to resolve onboarding Stripe key"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_5

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_4

    return-object v9

    :cond_4
    return-object p1

    :cond_5
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_6

    return-object v9

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lux/j0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lh32/c;->f:Lh32/c$c;

    invoke-direct {p0, p1}, Lh32/c;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lh32/c$c;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lux/j0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lh32/c;->e:Lh32/c$a;

    invoke-virtual {v0, p1}, Lh32/c$a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
