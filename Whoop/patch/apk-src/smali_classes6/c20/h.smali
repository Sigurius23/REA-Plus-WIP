.class public final Lc20/h;
.super Lc20/e;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/Map;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll83/k;

    const-class v1, Ly00/a8;

    const-string v2, "com.stripe:stripe-wechatpay:22.6.1"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lc20/h;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "paymentRelayStarterFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc20/h;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ly00/c8;

    invoke-interface {p2}, Ly00/c8;->m()Ly00/b8;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    sget p4, Lcom/stripe/android/core/exception/StripeException;->E:I

    new-instance p4, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lc20/h;->b:Ljava/util/Map;

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " type is not supported, add "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " in build.gradle to support it"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p4, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p4}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p3

    goto :goto_0

    :cond_0
    sget p3, Lcom/stripe/android/core/exception/StripeException;->E:I

    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string p4, "stripeIntent.nextActionData is null"

    invoke-direct {p3, p4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object p3

    :goto_0
    iget-object p4, p0, Lc20/h;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lux/e0;

    new-instance p4, Lux/a0;

    sget-object v0, Ly00/d8;->a:Ljava/util/Set;

    sget-object v0, Lux/s0;->l:Ljava/util/List;

    invoke-static {p2}, Ls4/g;->i(Ly00/c8;)I

    move-result p2

    invoke-direct {p4, p3, p2}, Lux/a0;-><init>(Lcom/stripe/android/core/exception/StripeException;I)V

    invoke-interface {p1, p4}, Ls40/b;->b(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
