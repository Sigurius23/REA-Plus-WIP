.class public final Loo2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Loo2/b;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Lj02/i0;)V",
        "Lj02/m0;",
        "navigationScreen",
        "Lj02/j0;",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "a",
        "Lj02/i0;",
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
.field public static final b:I


# instance fields
.field private final a:Lj02/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lj02/i0;->a:I

    sput v0, Loo2/b;->b:I

    return-void
.end method

.method public constructor <init>(Lj02/i0;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Loo2/b;->a:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lj02/i0;

    invoke-direct {p1}, Lj02/i0;-><init>()V

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Loo2/b;-><init>(Lj02/i0;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 13

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$k5;

    const-string v1, "&source="

    const/4 v2, 0x1

    const-string v3, ""

    if-eqz v0, :cond_7

    check-cast p1, Lj02/m0$k5;

    invoke-virtual {p1}, Lj02/m0$k5;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$k5;->e()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    move-object v4, v3

    :cond_0
    invoke-virtual {p1}, Lj02/m0$k5;->f()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    move-object v5, v6

    :goto_0
    if-nez v5, :cond_3

    :cond_2
    move-object v5, v3

    :cond_3
    invoke-virtual {p1}, Lj02/m0$k5;->c()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v7, v3

    :cond_4
    invoke-virtual {p1}, Lj02/m0$k5;->b()Lj02/x0;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    :cond_5
    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    move-object v3, v6

    :goto_1
    iget-object p1, p0, Loo2/b;->a:Lj02/i0;

    const-string v6, "android-app://com.whoop/UniversalCheckout?path="

    const-string v8, "&payload="

    invoke-static {v6, v0, v8, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&method="

    const-string v4, "&cartId=&autoTrigger="

    invoke-static {v0, v5, v1, v7, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v4

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object p1

    iput-boolean v2, p1, Leb/w0;->a:Z

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v5

    new-instance v3, Lj02/j0$c;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_7
    instance-of v0, p1, Lj02/m0$l5;

    if-eqz v0, :cond_8

    check-cast p1, Lj02/m0$l5;

    invoke-virtual {p1}, Lj02/m0$l5;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$l5;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Loo2/b;->a:Lj02/i0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android-app://com.whoop/UniversalCheckout?source="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&receiptCartId="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v4

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object p1

    iput-boolean v2, p1, Leb/w0;->a:Z

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v5

    new-instance v3, Lj02/j0$c;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_8
    instance-of v0, p1, Lj02/m0$m5;

    if-eqz v0, :cond_9

    check-cast p1, Lj02/m0$m5;

    invoke-virtual {p1}, Lj02/m0$m5;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$m5;->c()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Loo2/b;->a:Lj02/i0;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/UniversalCheckout?path=shippingAddress&payload="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v5

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object p1

    iput-boolean v2, p1, Leb/w0;->a:Z

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v6

    new-instance v4, Lj02/j0$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_9
    instance-of v0, p1, Lj02/m0$n5;

    if-eqz v0, :cond_a

    check-cast p1, Lj02/m0$n5;

    invoke-virtual {p1}, Lj02/m0$n5;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$n5;->c()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Loo2/b;->a:Lj02/i0;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/UniversalCheckout?path=shippingMethod&payload="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v5

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object p1

    iput-boolean v2, p1, Leb/w0;->a:Z

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object v6

    new-instance v4, Lj02/j0$c;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_a
    instance-of v0, p1, Lj02/m0$j5;

    if-eqz v0, :cond_e

    check-cast p1, Lj02/m0$j5;

    invoke-virtual {p1}, Lj02/m0$j5;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_b

    move-object v0, v3

    :cond_b
    invoke-virtual {p1}, Lj02/m0$j5;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    move-object v1, v3

    :cond_c
    invoke-virtual {p1}, Lj02/m0$j5;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    goto :goto_2

    :cond_d
    move-object v3, p1

    :goto_2
    iget-object p1, p0, Loo2/b;->a:Lj02/i0;

    const-string v2, "&sku="

    const-string v4, "&addIntent="

    const-string v5, "android-app://com.whoop/UniversalCart?cartId="

    invoke-static {v5, v0, v2, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    new-instance v3, Leb/x0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v9, v6

    move v10, v6

    move v11, v6

    move v12, v6

    invoke-direct/range {v3 .. v12}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v1, Lj02/j0$c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_e
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
