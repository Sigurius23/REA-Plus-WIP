.class public final Lj02/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj02/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lj02/g0;",
        "",
        "<init>",
        "()V",
        "",
        "raw",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lj02/g0$a;",
        "d",
        "(Ljava/lang/String;)Lj02/g0$a;",
        "",
        "b",
        "(Lj02/g0$a;)Z",
        "e",
        "(Lj02/g0$a;)Ljava/lang/String;",
        "Lcom/whoop/domain/model/WhoopUri;",
        "whoopUri",
        "c",
        "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;",
        "navigation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-direct {p0, p1}, Lj02/g0;->d(Ljava/lang/String;)Lj02/g0$a;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lj02/g0;->b(Lj02/g0$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-direct {p0, p1}, Lj02/g0;->e(Lj02/g0$a;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method

.method private final b(Lj02/g0$a;)Z
    .locals 4

    invoke-virtual {p1}, Lj02/g0$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lj02/g0$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "ViewSettings"

    const/4 v3, 0x1

    invoke-static {v0, v1, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj02/g0$a;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "Integrations"

    invoke-static {p1, v0, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    return v3

    :cond_0
    return v2
.end method

.method private final d(Ljava/lang/String;)Lj02/g0$a;
    .locals 8

    const-string v0, "://"

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, v1, v2}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, 0x3

    const/4 v3, 0x4

    const/16 v4, 0x2f

    invoke-static {p1, v4, v0, v1, v3}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    if-gez v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "substring(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x3f

    invoke-static {v3, v6}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    new-array v7, v6, [C

    aput-char v4, v7, v1

    invoke-static {v3, v7}, Lyb3/r;->P0(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lj02/g0$a;

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "%7C"

    const-string v1, "|"

    invoke-static {v3, v0, v1, v6}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-direct {v4, p1, v0}, Lj02/g0$a;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v4
.end method

.method private final e(Lj02/g0$a;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p1}, Lj02/g0$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/g0$a;->a()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "US"

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v2, p1, v1, v3}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "/integrations?integrationId="

    invoke-static {v0, v1, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;
    .locals 1

    const-string v0, "whoopUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lj02/g0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1, v0}, Lcom/whoop/domain/model/WhoopUriParser;->parse(Ljava/lang/String;)Lcom/whoop/domain/model/WhoopUri;

    move-result-object p1

    return-object p1
.end method
