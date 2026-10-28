.class public final Lc03/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc03/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lc03/b;",
        "",
        "Lor2/g;",
        "buildConfigProvider",
        "<init>",
        "(Lor2/g;)V",
        "La03/d$c;",
        "result",
        "",
        "statusUrl",
        "Lc41/m0;",
        "a",
        "(La03/d$c;Ljava/lang/String;)Lc41/m0;",
        "La03/d;",
        "Lc03/c;",
        "b",
        "(La03/d;)Lc03/c;",
        "Lor2/g;",
        "whoop-status_release"
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
.field public static final b:Lc03/b$a;

.field public static final c:I


# instance fields
.field private final a:Lor2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc03/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc03/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lc03/b;->b:Lc03/b$a;

    const/16 v0, 0x8

    sput v0, Lc03/b;->c:I

    return-void
.end method

.method public constructor <init>(Lor2/g;)V
    .locals 1

    const-string v0, "buildConfigProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc03/b;->a:Lor2/g;

    return-void
.end method

.method private final a(La03/d$c;Ljava/lang/String;)Lc41/m0;
    .locals 11

    invoke-virtual {p1}, La03/d$c;->a()Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;

    move-result-object p1

    new-instance v0, Lc41/m0;

    invoke-virtual {p1}, Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lyz2/a;->b:I

    invoke-direct {v1, v4, v3, v2, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;->getSubtitle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v2, p1

    goto :goto_2

    :cond_3
    :goto_1
    new-instance p1, Lcom/whoop/design/util/TextResource$b;

    sget v4, Lyz2/a;->a:I

    invoke-direct {p1, v4, v3, v2, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :goto_2
    sget-object v3, Lc41/n0$c;->d:Lc41/n0$c;

    sget-object v4, Lkd1/l;->MAINTENANCE:Lkd1/l;

    new-instance v5, Lcom/whoop/navigation/e;

    sget-object v6, Lcom/whoop/navigation/AppScreen$y2;->w:Lcom/whoop/navigation/AppScreen$y2;

    new-instance v7, Lcom/whoop/navigation/InAppBrowserScreenModel;

    invoke-direct {v7, p2}, Lcom/whoop/navigation/InAppBrowserScreenModel;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x60

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lc41/m0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/n0;Lkd1/l;Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final b(La03/d;)Lc03/c;
    .locals 6

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La03/d$a;->a:La03/d$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, La03/d$b;->a:La03/d$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, La03/d$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc03/b;->a:Lor2/g;

    invoke-virtual {v0}, Lor2/g;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "qaDev"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "https://status.dev.whoop.com"

    goto :goto_0

    :cond_1
    const-string v0, "https://status.whoop.com"

    :goto_0
    new-instance v1, Lc03/c;

    check-cast p1, La03/d$c;

    invoke-virtual {p1}, La03/d$c;->a()Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;->getActiveMaintenance()Z

    move-result v2

    invoke-direct {p0, p1, v0}, Lc03/b;->a(La03/d$c;Ljava/lang/String;)Lc41/m0;

    move-result-object p1

    invoke-direct {v1, v2, p1, v0}, Lc03/c;-><init>(ZLc41/m0;Ljava/lang/String;)V

    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    new-instance v0, Lc03/c;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lc03/c;-><init>(ZLc41/m0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
