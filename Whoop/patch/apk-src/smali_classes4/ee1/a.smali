.class public final Lee1/a;
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
        "Lee1/a;",
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
        "add-activity_release"
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

    sput v0, Lee1/a;->b:I

    return-void
.end method

.method public constructor <init>(Lj02/i0;)V
    .locals 1

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lee1/a;->a:Lj02/i0;

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
    invoke-direct {p0, p1}, Lee1/a;-><init>(Lj02/i0;)V

    return-void
.end method


# virtual methods
.method public provideNavigationData(Lj02/m0;)Lj02/j0;
    .locals 3

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/m0$b1;

    if-eqz v0, :cond_2

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    check-cast p1, Lj02/m0$b1;

    invoke-virtual {p1}, Lj02/m0$b1;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "date"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_0
    invoke-virtual {p1}, Lj02/m0$b1;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "title"

    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    const-string v0, "editActivitiesDrawer"

    invoke-static {v0, p1}, Lor2/z;->b(Ljava/lang/String;Ljava/util/Map;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lee1/a;->a:Lj02/i0;

    const-string v1, "toString(...)"

    invoke-static {p1, v1, v0}, Lr80/c;->f(Landroid/net/Uri;Ljava/lang/String;Lj02/i0;)Leb/k0;

    move-result-object p1

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    invoke-static {v0}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v0

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    new-instance v1, Lj02/j0$c;

    sget-object v2, Lj02/p0$d;->a:Lj02/p0$d;

    invoke-direct {v1, p1, v0, v2}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-object v1

    :cond_2
    sget-object p1, Lj02/j0$d;->a:Lj02/j0$d;

    return-object p1
.end method
