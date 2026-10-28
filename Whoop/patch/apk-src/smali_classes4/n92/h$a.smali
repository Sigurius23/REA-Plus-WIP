.class public final Ln92/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln92/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ln92/h$a;",
        "",
        "<init>",
        "()V",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "whoopUriParser",
        "",
        "uri",
        "a",
        "(Lj92/t;Lcom/whoop/domain/model/WhoopUriParser;Ljava/lang/String;)Ljava/lang/String;",
        "app_prodStandardRelease"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ln92/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj92/t;Lcom/whoop/domain/model/WhoopUriParser;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "topPrivateDomainHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopUriParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_0

    const-string p1, "unparseable"

    return-object p1

    :cond_0
    sget-object v0, Ln92/b;->q:Ln92/b$a;

    invoke-virtual {v0, p3}, Ln92/b$a;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p3, p2}, Ln92/b$a;->g(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lcom/iterable/iterableapi/v;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/iterable/iterableapi/v;-><init>(I)V

    invoke-virtual {v2, v1, p3}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-nez v1, :cond_2

    const-string p1, "malformed"

    return-object p1

    :cond_2
    invoke-static {p1, v1}, Lj92/u;->b(Lj92/t;Lud3/e0;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0, p3, p2}, Ln92/b$a;->g(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUriParser;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string p1, "nonwhoop"

    return-object p1
.end method
