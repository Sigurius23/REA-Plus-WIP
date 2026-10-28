.class public final Lvn2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn2/b$a;,
        Lvn2/b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010!R\u0018\u0010\u0014\u001a\u00020\u0013*\u00020\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lvn2/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lrr2/c;",
        "crashReporter",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lj02/o0;Leb/a0;Lrr2/c;Ltr2/n;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "",
        "description",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;)V",
        "Lj02/x0;",
        "autoTrigger",
        "Lj02/m0$k5;",
        "d",
        "(Lcom/whoop/navigation/e;Lj02/x0;)Lj02/m0$k5;",
        "Lwn2/e$d;",
        "event",
        "",
        "c",
        "(Lwn2/e$d;)Z",
        "a",
        "Lj02/o0;",
        "Leb/a0;",
        "Lrr2/c;",
        "Ltr2/n;",
        "Lwn2/c;",
        "(Lwn2/c;)Lj02/x0;",
        "e",
        "universal-checkout_release"
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
.field private static final e:Lvn2/b$a;

.field public static final f:I


# instance fields
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Lrr2/c;

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvn2/b;->e:Lvn2/b$a;

    const/16 v0, 0x8

    sput v0, Lvn2/b;->f:I

    return-void
.end method

.method public constructor <init>(Lj02/o0;Leb/a0;Lrr2/c;Ltr2/n;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvn2/b;->a:Lj02/o0;

    .line 3
    iput-object p2, p0, Lvn2/b;->b:Leb/a0;

    .line 4
    iput-object p3, p0, Lvn2/b;->c:Lrr2/c;

    .line 5
    iput-object p4, p0, Lvn2/b;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/o0;Leb/a0;Lrr2/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "BuyNowNavigationRouter"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lvn2/b;-><init>(Lj02/o0;Leb/a0;Lrr2/c;Ltr2/n;)V

    return-void
.end method

.method private final a(Lwn2/c;)Lj02/x0;
    .locals 1

    sget-object v0, Lvn2/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lj02/x0;->PAYMENT_METHOD:Lj02/x0;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Lj02/x0;->SHIPPING_ADDRESS:Lj02/x0;

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lvn2/b;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lvn2/b;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    move-result-object v0

    instance-of v0, v0, Lj02/p0$h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvn2/b;->d:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unresolved destination for Buy Now "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {v0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method

.method private final d(Lcom/whoop/navigation/e;Lj02/x0;)Lj02/m0$k5;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$h1;->w:Lcom/whoop/navigation/AppScreen$h1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getPayload()Lcom/whoop/navigation/CheckoutWithCartPayload;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/navigation/CheckoutWithCartPayload;->getCartId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getPath()Ljava/lang/String;

    move-result-object v3

    sget-object v2, Lad3/c;->d:Lad3/b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/navigation/CheckoutWithCartPayload;->Companion:Lcom/whoop/navigation/CheckoutWithCartPayload$a;

    invoke-virtual {v4}, Lcom/whoop/navigation/CheckoutWithCartPayload$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v2, v4, v0}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getSource()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getMethod()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    move-object v1, p1

    :cond_5
    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    move-object v6, v1

    goto :goto_4

    :cond_7
    :goto_3
    const-string v1, "GET"

    goto :goto_2

    :goto_4
    new-instance v2, Lj02/m0$k5;

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lj02/m0$k5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;)V

    return-object v2

    :cond_8
    :goto_5
    return-object v1
.end method


# virtual methods
.method public final c(Lwn2/e$d;)Z
    .locals 5

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwn2/e$a;->a:Lwn2/e$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvn2/b;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return v1

    :cond_0
    instance-of v0, p1, Lwn2/e$j;

    if-eqz v0, :cond_1

    check-cast p1, Lwn2/e$j;

    invoke-virtual {p1}, Lwn2/e$j;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    const-string v0, "view full checkout"

    invoke-direct {p0, p1, v0}, Lvn2/b;->b(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return v1

    :cond_1
    instance-of v0, p1, Lwn2/e$e;

    if-eqz v0, :cond_2

    check-cast p1, Lwn2/e$e;

    invoke-virtual {p1}, Lwn2/e$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    const-string v0, "direct checkout"

    invoke-direct {p0, p1, v0}, Lvn2/b;->b(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return v1

    :cond_2
    instance-of v0, p1, Lwn2/e$h;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lvn2/b;->b:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    new-instance v0, Lj02/m0$l5;

    check-cast p1, Lwn2/e$h;

    invoke-virtual {p1}, Lwn2/e$h;->a()Ljava/lang/String;

    move-result-object v3

    const-string v4, "buy_now"

    invoke-direct {v0, v3, v4}, Lj02/m0$l5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lvn2/b;->a:Lj02/o0;

    invoke-interface {v3, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    move-result-object v0

    instance-of v0, v0, Lj02/p0$h;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvn2/b;->d:Ltr2/n;

    invoke-virtual {p1}, Lwn2/e$h;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Unresolved receipt for Buy Now order (cartId="

    const-string v4, ")"

    invoke-static {v3, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_3
    instance-of v0, p1, Lwn2/e$c;

    if-eqz v0, :cond_7

    check-cast p1, Lwn2/e$c;

    invoke-virtual {p1}, Lwn2/e$c;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {p1}, Lwn2/e$c;->b()Lwn2/c;

    move-result-object v3

    invoke-direct {p0, v3}, Lvn2/b;->a(Lwn2/c;)Lj02/x0;

    move-result-object v3

    invoke-direct {p0, v0, v3}, Lvn2/b;->d(Lcom/whoop/navigation/e;Lj02/x0;)Lj02/m0$k5;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v3, p0, Lvn2/b;->b:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->z()Z

    iget-object v3, p0, Lvn2/b;->a:Lj02/o0;

    invoke-interface {v3, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    move-result-object v0

    instance-of v0, v0, Lj02/p0$h;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvn2/b;->d:Ltr2/n;

    invoke-virtual {p1}, Lwn2/e$c;->b()Lwn2/c;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unresolved checkout for Buy Now "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " row"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    return v1

    :cond_5
    new-instance v0, Lcom/whoop/universalcheckout/features/buynow/navigation/UnusableCheckoutDestinationException;

    invoke-virtual {p1}, Lwn2/e$c;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/universalcheckout/features/buynow/navigation/UnusableCheckoutDestinationException;-><init>(Lcom/whoop/navigation/AppScreen;)V

    iget-object v1, p0, Lvn2/b;->d:Ltr2/n;

    invoke-virtual {p1}, Lwn2/e$c;->b()Lwn2/c;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Buy Now "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " row has an unusable checkout_destination"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lvn2/b;->c:Lrr2/c;

    if-eqz p1, :cond_6

    invoke-interface {p1, v0}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    :cond_6
    return v2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
