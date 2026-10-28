.class public final Lv12/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lv12/d;",
        "",
        "Ljb1/a;",
        "reducer",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ljb1/a;Ltr2/n;)V",
        "Lt12/b;",
        "domainState",
        "Lv12/c;",
        "a",
        "(Lt12/b;)Lv12/c;",
        "Ljb1/a;",
        "b",
        "Ltr2/n;",
        "onboarding-personalization_release"
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
.field private final a:Ljb1/a;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Ljb1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lv12/d;->a:Ljb1/a;

    .line 3
    iput-object p2, p0, Lv12/d;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Lw12/d;->i()Ljb1/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "DayZeroHeaderWidgets"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lv12/d;-><init>(Ljb1/a;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Lt12/b;)Lv12/c;
    .locals 4

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lv12/d;->a:Ljb1/a;

    invoke-virtual {p1}, Lt12/b;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1}, Lt12/b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lv12/d;->b:Ltr2/n;

    invoke-virtual {p1}, Lt12/b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr p1, v2

    const-string v2, "Dropped "

    const-string v3, " header widget(s) this client cannot render"

    invoke-static {p1, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "DayZeroHeaderWidgets"

    invoke-interface {v1, v3, p1, v2}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    new-instance p1, Lv12/c;

    invoke-direct {p1, v0}, Lv12/c;-><init>(Ljava/util/List;)V

    return-object p1
.end method
