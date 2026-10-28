.class public final Lbp1/a;
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
        "Lbp1/a;",
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
        "hormonal-insights_release"
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

    sput v0, Lbp1/a;->b:I

    return-void
.end method

.method public constructor <init>(Lj02/i0;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbp1/a;->a:Lj02/i0;

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
    invoke-direct {p0, p1}, Lbp1/a;-><init>(Lj02/i0;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 7

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$a2;

    if-eqz v0, :cond_2

    check-cast p1, Lj02/m0$a2;

    invoke-virtual {p1}, Lj02/m0$a2;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lj02/m0$a2;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android-app://com.whoop/hormonalInsightsOnboarding?feature="

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "android-app://com.whoop/hormonalInsightsOnboarding"

    :goto_1
    iget-object v0, p0, Lbp1/a;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    new-instance v1, Lj02/j0$c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p1, Lj02/m0$b2;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lbp1/a;->a:Lj02/i0;

    const-string v0, "android-app://com.whoop/hormonalSettingsFragment"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    new-instance v1, Lj02/j0$c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of v0, p1, Lj02/m0$v0;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lbp1/a;->a:Lj02/i0;

    const-string v0, "android-app://com.whoop/mciCycles"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    new-instance v1, Lj02/j0$c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_4
    instance-of v0, p1, Lj02/m0$b5;

    if-eqz v0, :cond_5

    check-cast p1, Lj02/m0$b5;

    invoke-virtual {p1}, Lj02/m0$b5;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "featureType"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lj02/m0$b5;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v2, "pregnancyId"

    invoke-direct {v0, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v0}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v0, "symptomPatterns"

    invoke-static {v0, p1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbp1/a;->a:Lj02/i0;

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    new-instance v1, Lj02/j0$c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
