.class public final Lvn2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvn2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u000eB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lvn2/c;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Lj02/i0;)V",
        "",
        "b",
        "(Ljava/lang/String;)Ljava/lang/String;",
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
.field public static final b:Lvn2/c$a;

.field public static final c:I


# instance fields
.field private final a:Lj02/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvn2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvn2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvn2/c;->b:Lvn2/c$a;

    sget v0, Lj02/i0;->a:I

    sput v0, Lvn2/c;->c:I

    return-void
.end method

.method public constructor <init>(Lj02/i0;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvn2/c;->a:Lj02/i0;

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
    invoke-direct {p0, p1}, Lvn2/c;-><init>(Lj02/i0;)V

    return-void
.end method

.method public static synthetic a(Lvn2/c;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, Lvn2/c;->c(Lvn2/c;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "encode(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final c(Lvn2/c;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 12

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$i5;

    if-eqz v0, :cond_1

    check-cast p1, Lj02/m0$i5;

    invoke-virtual {p1}, Lj02/m0$i5;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$i5;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj02/m0$i5;->c()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Luo1/b;

    const/16 v2, 0xa

    invoke-direct {v7, p0, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    const/16 v8, 0x1e

    const-string v4, ","

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lj02/m0$i5;->j()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lj02/m0$i5;->b()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lj02/m0$i5;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0, v5}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lj02/m0$i5;->f()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v6}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lj02/m0$i5;->e()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v7}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lj02/m0$i5;->i()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lvn2/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v8, p0, Lvn2/c;->a:Lj02/i0;

    const-string v9, "&packSku="

    const-string v10, "&childItemSkus="

    const-string v11, "android-app://com.whoop/UniversalBuyNow?sku="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&wywSku="

    const-string v9, "&bandSku="

    invoke-static {v0, v2, v1, v3, v9}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "&claspSku="

    const-string v2, "&hookSku="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "&fastLinkSku="

    const-string v2, "&storeDomain="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    new-instance v2, Leb/x0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v8, v5

    move v9, v5

    move v10, v5

    move v11, v5

    invoke-direct/range {v2 .. v11}, Leb/x0;-><init>(ZZIZZIIII)V

    new-instance v0, Lj02/j0$c;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
