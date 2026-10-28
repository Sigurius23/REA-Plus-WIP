.class public final Lc20/c;
.super Lc20/e;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "paymentRelayStarterFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc20/c;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final d(Ls40/a;Ljava/lang/Object;Lyy/f;Lc20/d;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ly00/c8;

    iget-object p3, p3, Lyy/f;->x:Ljava/lang/String;

    const-string p4, "stripeIntent"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p4, p2, Ly00/l3;

    if-eqz p4, :cond_0

    new-instance p4, Lux/b0;

    check-cast p2, Ly00/l3;

    invoke-direct {p4, p2, p3}, Lux/b0;-><init>(Ly00/l3;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of p4, p2, Ly00/g6;

    if-eqz p4, :cond_1

    new-instance p4, Lux/c0;

    check-cast p2, Ly00/g6;

    invoke-direct {p4, p3, p2}, Lux/c0;-><init>(Ljava/lang/String;Ly00/g6;)V

    :goto_0
    iget-object p2, p0, Lc20/c;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lux/e0;

    invoke-interface {p1, p4}, Ls40/b;->b(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
