.class public final Lea2/f0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea2/f0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 &2\u00020\u0001:\u0001\'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\u001fR\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006("
    }
    d2 = {
        "Lea2/f0;",
        "Landroidx/lifecycle/w1;",
        "Lcom/whoop/data/repositories/UserStrapsRepository;",
        "userStrapsRepository",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lea2/d0;",
        "tileVisibilityChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/UserStrapsRepository;Lci2/b;Lea2/d0;)V",
        "Lgc2/a;",
        "tile",
        "",
        "j",
        "(Lgc2/a;)Z",
        "",
        "name",
        "Lj02/o0;",
        "navigator",
        "Ll83/a0;",
        "l",
        "(Ljava/lang/String;Lj02/o0;)V",
        "w",
        "Lcom/whoop/data/repositories/UserStrapsRepository;",
        "x",
        "Lci2/b;",
        "y",
        "Lea2/d0;",
        "z",
        "Z",
        "isMaverickOrGoose",
        "()Z",
        "E",
        "isStrapDisconnected",
        "Ljk0/d;",
        "g",
        "()Ljk0/d;",
        "whoopStrap",
        "F",
        "a",
        "settings_release"
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
.field public static final F:Lea2/f0$a;

.field public static final G:I


# instance fields
.field private final E:Z

.field private final w:Lcom/whoop/data/repositories/UserStrapsRepository;

.field private final x:Lci2/b;

.field private final y:Lea2/d0;

.field private final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lea2/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lea2/f0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lea2/f0;->F:Lea2/f0$a;

    const/16 v0, 0x8

    sput v0, Lea2/f0;->G:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/UserStrapsRepository;Lci2/b;Lea2/d0;)V
    .locals 1

    const-string v0, "userStrapsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tileVisibilityChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lea2/f0;->w:Lcom/whoop/data/repositories/UserStrapsRepository;

    iput-object p2, p0, Lea2/f0;->x:Lci2/b;

    iput-object p3, p0, Lea2/f0;->y:Lea2/d0;

    invoke-direct {p0}, Lea2/f0;->g()Ljk0/d;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljk0/d;->w0()Lst0/v;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lst0/v;->isMaverickOrGoose()Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput-boolean p1, p0, Lea2/f0;->z:Z

    invoke-direct {p0}, Lea2/f0;->g()Ljk0/d;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    iput-boolean p2, p0, Lea2/f0;->E:Z

    return-void
.end method

.method private final g()Ljk0/d;
    .locals 1

    iget-object v0, p0, Lea2/f0;->x:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    return-object v0
.end method


# virtual methods
.method public final j(Lgc2/a;)Z
    .locals 1

    const-string v0, "tile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lea2/f0;->y:Lea2/d0;

    invoke-virtual {v0, p1}, Lea2/d0;->a(Lgc2/a;)Z

    move-result p1

    return p1
.end method

.method public final l(Ljava/lang/String;Lj02/o0;)V
    .locals 9

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj02/m0$f3;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const-string v3, ""

    const-string v4, "Tutorial"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method
