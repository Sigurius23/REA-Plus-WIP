.class public final Ljn1/c;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Ljn1/c;",
        "Landroidx/lifecycle/w1;",
        "Len1/d;",
        "interactor",
        "Lkn1/a;",
        "reducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Len1/d;Lkn1/a;Lbc3/c0;)V",
        "Lec3/l;",
        "Len1/b;",
        "Len1/c;",
        "l",
        "(Lec3/l;Len1/d;)Lec3/l;",
        "Ljn1/b;",
        "viewEvent",
        "o",
        "(Ljn1/b;)Len1/b;",
        "Ll83/a0;",
        "n",
        "(Ljn1/b;)V",
        "w",
        "Lbc3/c0;",
        "Lec3/o1;",
        "x",
        "Lec3/o1;",
        "eventFlow",
        "y",
        "Lec3/l;",
        "domainState",
        "Ljn1/d;",
        "z",
        "getViewState",
        "()Lec3/l;",
        "viewState",
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
.field private final w:Lbc3/c0;

.field private final x:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final y:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final z:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Len1/d;Lkn1/a;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Ljn1/c;->w:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Ljn1/c;->x:Lec3/o1;

    .line 4
    new-instance v1, Ljn1/c$b;

    invoke-direct {v1, v0, p0}, Ljn1/c$b;-><init>(Lec3/l;Ljn1/c;)V

    .line 5
    invoke-direct {p0, v1, p1}, Ljn1/c;->l(Lec3/l;Len1/d;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Ljn1/c;->y:Lec3/l;

    .line 6
    new-instance v0, Ljn1/c$c;

    invoke-direct {v0, p1, p2}, Ljn1/c$c;-><init>(Lec3/l;Lkn1/a;)V

    .line 7
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 p2, 0x1

    invoke-static {v0, p3, p1, p2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Ljn1/c;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Len1/d;Lkn1/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 8
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ljn1/c;-><init>(Len1/d;Lkn1/a;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Ljn1/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ljn1/c;->x:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Ljn1/c;Ljn1/b;)Len1/b;
    .locals 0

    invoke-direct {p0, p1}, Ljn1/c;->o(Ljn1/b;)Len1/b;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lec3/l;Len1/d;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Len1/d;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Len1/d;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final o(Ljn1/b;)Len1/b;
    .locals 2

    instance-of v0, p1, Ljn1/b$b;

    if-eqz v0, :cond_0

    new-instance v0, Len1/b$b;

    check-cast p1, Ljn1/b$b;

    invoke-virtual {p1}, Ljn1/b$b;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Len1/b$b;-><init>(Z)V

    return-object v0

    :cond_0
    instance-of v0, p1, Ljn1/b$e;

    if-eqz v0, :cond_1

    new-instance v0, Len1/b$g;

    check-cast p1, Ljn1/b$e;

    invoke-virtual {p1}, Ljn1/b$e;->a()I

    move-result v1

    invoke-virtual {p1}, Ljn1/b$e;->b()I

    move-result p1

    invoke-direct {v0, v1, p1}, Len1/b$g;-><init>(II)V

    return-object v0

    :cond_1
    instance-of v0, p1, Ljn1/b$a;

    if-eqz v0, :cond_2

    new-instance v0, Len1/b$a;

    check-cast p1, Ljn1/b$a;

    invoke-virtual {p1}, Ljn1/b$a;->a()I

    move-result p1

    invoke-direct {v0, p1}, Len1/b$a;-><init>(I)V

    return-object v0

    :cond_2
    instance-of v0, p1, Ljn1/b$d;

    if-eqz v0, :cond_3

    new-instance v0, Len1/b$f;

    check-cast p1, Ljn1/b$d;

    invoke-virtual {p1}, Ljn1/b$d;->a()I

    move-result p1

    invoke-direct {v0, p1}, Len1/b$f;-><init>(I)V

    return-object v0

    :cond_3
    instance-of v0, p1, Ljn1/b$f;

    if-eqz v0, :cond_4

    new-instance v0, Len1/b$d;

    check-cast p1, Ljn1/b$f;

    invoke-virtual {p1}, Ljn1/b$f;->a()I

    move-result v1

    invoke-virtual {p1}, Ljn1/b$f;->b()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Len1/b$d;-><init>(IZ)V

    return-object v0

    :cond_4
    sget-object v0, Ljn1/b$c;->a:Ljn1/b$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Len1/b$c;->a:Len1/b$c;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Ljn1/c;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Ljn1/b;)V
    .locals 3

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljn1/c;->w:Lbc3/c0;

    new-instance v1, Ljn1/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ljn1/c$a;-><init>(Ljn1/c;Ljn1/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
