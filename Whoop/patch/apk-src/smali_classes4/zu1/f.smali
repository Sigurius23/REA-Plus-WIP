.class public final Lzu1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001dR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lzu1/f;",
        "",
        "Lu92/c;",
        "ltoDismissStore",
        "Lcom/whoop/service/network/HomeComponentDismissApi;",
        "homeComponentDismissApi",
        "Lz92/a;",
        "userInfoAccessor",
        "Lbc3/c0;",
        "applicationScope",
        "Lbc3/z;",
        "ioDispatcher",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lu92/c;Lcom/whoop/service/network/HomeComponentDismissApi;Lz92/a;Lbc3/c0;Lbc3/z;Ltr2/n;)V",
        "",
        "offerId",
        "Ll83/a0;",
        "e",
        "(Ljava/lang/String;)V",
        "a",
        "Lu92/c;",
        "b",
        "Lcom/whoop/service/network/HomeComponentDismissApi;",
        "c",
        "Lz92/a;",
        "d",
        "Lbc3/c0;",
        "Lbc3/z;",
        "f",
        "Ltr2/n;",
        "limited-time-offer_release"
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
.field private final a:Lu92/c;

.field private final b:Lcom/whoop/service/network/HomeComponentDismissApi;

.field private final c:Lz92/a;

.field private final d:Lbc3/c0;

.field private final e:Lbc3/z;

.field private final f:Ltr2/n;


# direct methods
.method public constructor <init>(Lu92/c;Lcom/whoop/service/network/HomeComponentDismissApi;Lz92/a;Lbc3/c0;Lbc3/z;Ltr2/n;)V
    .locals 1

    const-string v0, "ltoDismissStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homeComponentDismissApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzu1/f;->a:Lu92/c;

    .line 3
    iput-object p2, p0, Lzu1/f;->b:Lcom/whoop/service/network/HomeComponentDismissApi;

    .line 4
    iput-object p3, p0, Lzu1/f;->c:Lz92/a;

    .line 5
    iput-object p4, p0, Lzu1/f;->d:Lbc3/c0;

    .line 6
    iput-object p5, p0, Lzu1/f;->e:Lbc3/z;

    .line 7
    iput-object p6, p0, Lzu1/f;->f:Ltr2/n;

    return-void
.end method

.method public constructor <init>(Lu92/c;Lcom/whoop/service/network/HomeComponentDismissApi;Lz92/a;Lbc3/c0;Lbc3/z;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    .line 8
    sget-object p5, Lbc3/q0;->a:Lkc3/e;

    .line 9
    sget-object p5, Lkc3/d;->w:Lkc3/d;

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 10
    sget-object p5, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "LtoDismissHandler"

    invoke-virtual {p5, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    .line 11
    invoke-direct/range {v0 .. v6}, Lzu1/f;-><init>(Lu92/c;Lcom/whoop/service/network/HomeComponentDismissApi;Lz92/a;Lbc3/c0;Lbc3/z;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lzu1/f;)Lcom/whoop/service/network/HomeComponentDismissApi;
    .locals 0

    iget-object p0, p0, Lzu1/f;->b:Lcom/whoop/service/network/HomeComponentDismissApi;

    return-object p0
.end method

.method public static final synthetic b(Lzu1/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lzu1/f;->f:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lzu1/f;)Lu92/c;
    .locals 0

    iget-object p0, p0, Lzu1/f;->a:Lu92/c;

    return-object p0
.end method

.method public static final synthetic d(Lzu1/f;)Lz92/a;
    .locals 0

    iget-object p0, p0, Lzu1/f;->c:Lz92/a;

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/String;)V
    .locals 4

    const-string v0, "offerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lzu1/f;->d:Lbc3/c0;

    iget-object v1, p0, Lzu1/f;->e:Lbc3/z;

    new-instance v2, Lzu1/f$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lzu1/f$a;-><init>(Lzu1/f;Ljava/lang/String;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
