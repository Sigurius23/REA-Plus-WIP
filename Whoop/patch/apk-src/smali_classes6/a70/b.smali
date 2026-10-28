.class public final La70/b;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lb70/e;",
        "La70/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR \u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00020!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "La70/b;",
        "Lld1/c;",
        "Lb70/e;",
        "La70/a;",
        "Lbc3/c0;",
        "coroutineScope",
        "Ly60/c;",
        "dayZeroSplashInteractor",
        "La70/c;",
        "dayZeroSplashViewStateReducer",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;)V",
        "Ly60/a;",
        "r",
        "(La70/a;)Ly60/a;",
        "event",
        "Ll83/a0;",
        "q",
        "(La70/a;)V",
        "x",
        "Lbc3/c0;",
        "y",
        "Ly60/c;",
        "z",
        "La70/c;",
        "E",
        "Lfi0/a;",
        "Lec3/o1;",
        "F",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "G",
        "Lec3/t1;",
        "p",
        "()Lec3/t1;",
        "viewState",
        "activation_release"
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
.field private final E:Lfi0/a;

.field private final F:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final G:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final x:Lbc3/c0;

.field private final y:Ly60/c;

.field private final z:La70/c;


# direct methods
.method public constructor <init>(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayZeroSplashInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayZeroSplashViewStateReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p1, p0, La70/b;->x:Lbc3/c0;

    .line 3
    iput-object p2, p0, La70/b;->y:Ly60/c;

    .line 4
    iput-object p3, p0, La70/b;->z:La70/c;

    .line 5
    iput-object p4, p0, La70/b;->E:Lfi0/a;

    const/4 p3, 0x7

    const/4 p4, 0x0

    const/4 v0, 0x0

    .line 6
    invoke-static {p4, p4, v0, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p3

    iput-object p3, p0, La70/b;->F:Lec3/o1;

    .line 7
    new-instance p4, La70/b$d;

    invoke-direct {p4, p0, v0}, La70/b$d;-><init>(La70/b;Lq83/d;)V

    .line 8
    new-instance v0, Lec3/j1;

    const/4 v1, 0x0

    invoke-direct {v0, p3, p4, v1}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    .line 9
    new-instance p3, La70/b$b;

    invoke-direct {p3, v0, p0}, La70/b$b;-><init>(Lec3/l;La70/b;)V

    .line 10
    invoke-virtual {p2, p3}, Ly60/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p2

    .line 11
    new-instance p3, La70/b$c;

    invoke-direct {p3, p2, p0}, La70/b$c;-><init>(Lec3/l;La70/b;)V

    .line 12
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    const/4 p4, 0x1

    invoke-static {p3, p1, p2, p4}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, La70/b;->G:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p6, 0x1

    and-int/2addr p5, p6

    if-eqz p5, :cond_0

    .line 13
    new-instance p1, Lor2/m;

    const/4 p5, 0x0

    invoke-direct {p1, p5, p6, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, La70/b;-><init>(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;)V

    return-void
.end method

.method public static final synthetic j(La70/b;)Lfi0/a;
    .locals 0

    iget-object p0, p0, La70/b;->E:Lfi0/a;

    return-object p0
.end method

.method public static final synthetic l(La70/b;)La70/c;
    .locals 0

    iget-object p0, p0, La70/b;->z:La70/c;

    return-object p0
.end method

.method public static final synthetic n(La70/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, La70/b;->F:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic o(La70/b;La70/a;)Ly60/a;
    .locals 0

    invoke-direct {p0, p1}, La70/b;->r(La70/a;)Ly60/a;

    move-result-object p0

    return-object p0
.end method

.method private final r(La70/a;)Ly60/a;
    .locals 1

    sget-object v0, La70/a$a;->a:La70/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ly60/a$a;->a:Ly60/a$a;

    return-object p1

    :cond_0
    instance-of p1, p1, La70/a$b;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La70/a;

    invoke-virtual {p0, p1}, La70/b;->q(La70/a;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, La70/b;->p()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public p()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, La70/b;->G:Lec3/t1;

    return-object v0
.end method

.method public q(La70/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La70/b;->x:Lbc3/c0;

    new-instance v1, La70/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, La70/b$a;-><init>(La70/b;La70/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
