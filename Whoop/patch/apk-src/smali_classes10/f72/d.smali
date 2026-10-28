.class public final Lf72/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf72/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lf72/d;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "<init>",
        "(Leb/a0;Lj02/o0;Lj02/i0;)V",
        "",
        "a",
        "()Ljava/lang/String;",
        "Lf72/b;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lf72/b;)V",
        "Leb/a0;",
        "Lj02/o0;",
        "c",
        "Lj02/i0;",
        "d",
        "sage_release"
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
.field public static final d:Lf72/d$a;

.field public static final e:I

.field private static final f:Ljava/lang/String;


# instance fields
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Lj02/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf72/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf72/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf72/d;->d:Lf72/d$a;

    const/16 v0, 0x8

    sput v0, Lf72/d;->e:I

    const-string v0, "Education Tile"

    sput-object v0, Lf72/d;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Leb/a0;Lj02/o0;Lj02/i0;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf72/d;->a:Leb/a0;

    .line 3
    iput-object p2, p0, Lf72/d;->b:Lj02/o0;

    .line 4
    iput-object p3, p0, Lf72/d;->c:Lj02/i0;

    return-void
.end method

.method public synthetic constructor <init>(Leb/a0;Lj02/o0;Lj02/i0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    new-instance p3, Lj02/i0;

    invoke-direct {p3}, Lj02/i0;-><init>()V

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lf72/d;-><init>(Leb/a0;Lj02/o0;Lj02/i0;)V

    return-void
.end method

.method private final a()Ljava/lang/String;
    .locals 1

    const-string v0, "android-app://com.whoop/onboardingStoriesFragmentRedesign/SAGE_ONBOARDING"

    return-object v0
.end method


# virtual methods
.method public final b(Lf72/b;)V
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf72/b$b;->a:Lf72/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lf72/d;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lf72/b$d;->a:Lf72/b$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lf72/d;->c:Lj02/i0;

    invoke-direct {p0}, Lf72/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lf72/d;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_1
    instance-of v0, p1, Lf72/b$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf72/d;->b:Lj02/o0;

    check-cast p1, Lf72/b$c;

    invoke-virtual {p1}, Lf72/b$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lf72/b$a;

    if-eqz v0, :cond_4

    check-cast p1, Lf72/b$a;

    invoke-virtual {p1}, Lf72/b$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "%26"

    const/4 v2, 0x0

    const-string v3, "&"

    invoke-static {v0, v3, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lf72/d;->b:Lj02/o0;

    new-instance v4, Lj02/m0$f3;

    invoke-virtual {p1}, Lf72/b$a;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, ""

    :cond_3
    move-object v6, p1

    sget-object v7, Lf72/d;->f:Ljava/lang/String;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
