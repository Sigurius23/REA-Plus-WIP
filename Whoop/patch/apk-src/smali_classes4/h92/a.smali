.class public final Lh92/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh92/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB-\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lh92/a;",
        "",
        "",
        "whoopScheme",
        "appLinkScheme",
        "appLinkHost",
        "mxmSpecificDeepLinkHost",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/whoop/domain/model/WhoopUri;",
        "",
        "c",
        "(Lcom/whoop/domain/model/WhoopUri;)Z",
        "b",
        "uri",
        "a",
        "(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;",
        "Ljava/lang/String;",
        "d",
        "e",
        "feature_release"
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
.field public static final e:Lh92/a$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh92/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh92/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh92/a;->e:Lh92/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "whoopScheme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appLinkScheme"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appLinkHost"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mxmSpecificDeepLinkHost"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh92/a;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lh92/a;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lh92/a;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lh92/a;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    const-string p1, "whoop"

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    const-string p2, "https"

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 8
    const-string p4, "mxm"

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lh92/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final b(Lcom/whoop/domain/model/WhoopUri;)Z
    .locals 3

    invoke-interface {p1}, Lcom/whoop/domain/model/WhoopUri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh92/a;->b:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/whoop/domain/model/WhoopUri;->getHost()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh92/a;->c:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final c(Lcom/whoop/domain/model/WhoopUri;)Z
    .locals 3

    invoke-interface {p1}, Lcom/whoop/domain/model/WhoopUri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lh92/a;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/whoop/domain/model/WhoopUri;->getHost()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lh92/a;->d:Ljava/lang/String;

    invoke-static {p1, v0, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/WhoopUri;)Lcom/whoop/domain/model/WhoopUri;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-direct {p0, p1}, Lh92/a;->b(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0, p1}, Lh92/a;->c(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    return-object p1

    :cond_2
    return-object v0
.end method
