.class public final Lkw1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/k0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lkw1/e;",
        "Lj02/k0;",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Lj02/i0;)V",
        "",
        "promoCode",
        "",
        "isOnTrial",
        "isReactivationUpsell",
        "Lj02/j0;",
        "a",
        "(Ljava/lang/String;ZZ)Lj02/j0;",
        "Lj02/m0;",
        "navigationScreen",
        "provideNavigationData",
        "(Lj02/m0;)Lj02/j0;",
        "Lj02/i0;",
        "membership_release"
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

    sput v0, Lkw1/e;->b:I

    return-void
.end method

.method public constructor <init>(Lj02/i0;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkw1/e;->a:Lj02/i0;

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
    invoke-direct {p0, p1}, Lkw1/e;-><init>(Lj02/i0;)V

    return-void
.end method

.method private final a(Ljava/lang/String;ZZ)Lj02/j0;
    .locals 6

    const-string v0, "&isOnTrial="

    const-string v1, "&isReactivationUpsell="

    const-string v2, "android-app://com.whoop/extensions?promoCode="

    invoke-static {v2, p1, v0, v1, p2}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lkw1/e;->a:Lj02/i0;

    invoke-virtual {p2, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    new-instance v0, Lj02/j0$c;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 2

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$z3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v1, v0}, Lkw1/e;->a(Ljava/lang/String;ZZ)Lj02/j0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lj02/m0$f1;

    if-eqz v0, :cond_1

    check-cast p1, Lj02/m0$f1;

    invoke-virtual {p1}, Lj02/m0$f1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$f1;->c()Z

    move-result p1

    invoke-direct {p0, v0, p1, v1}, Lkw1/e;->a(Ljava/lang/String;ZZ)Lj02/j0;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
