.class public final Lhn1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lhn1/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Lbn1/a;",
        "analyticHelper",
        "<init>",
        "(Lj02/o0;Lbn1/a;)V",
        "Lhn1/a;",
        "navAction",
        "Ll83/a0;",
        "a",
        "(Lhn1/a;)V",
        "Lj02/o0;",
        "getNavigator",
        "()Lj02/o0;",
        "b",
        "Lbn1/a;",
        "getAnalyticHelper",
        "()Lbn1/a;",
        "home-customization_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lj02/o0;

.field private final b:Lbn1/a;


# direct methods
.method public constructor <init>(Lj02/o0;Lbn1/a;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn1/c;->a:Lj02/o0;

    iput-object p2, p0, Lhn1/c;->b:Lbn1/a;

    return-void
.end method


# virtual methods
.method public final a(Lhn1/a;)V
    .locals 2

    const-string v0, "navAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lhn1/a$a;->a:Lhn1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lhn1/c;->b:Lbn1/a;

    if-eqz p1, :cond_0

    sget-object v0, Ldn1/g;->HTTP:Ldn1/g;

    invoke-virtual {p1, v0}, Lbn1/a;->a(Ldn1/g;)V

    :cond_0
    iget-object p1, p0, Lhn1/c;->a:Lj02/o0;

    new-instance v0, Lj02/m0$g1;

    const-string v1, "https://status.whoop.com/"

    invoke-direct {v0, v1}, Lj02/m0$g1;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
