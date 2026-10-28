.class public final Lb03/f;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lc03/c;",
        "Lb03/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR \u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001c\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lb03/f;",
        "Lld1/c;",
        "Lc03/c;",
        "Lb03/e;",
        "La03/c;",
        "interactor",
        "Lc03/b;",
        "reducer",
        "Lbc3/c0;",
        "closeableCoroutineScope",
        "<init>",
        "(La03/c;Lc03/b;Lbc3/c0;)V",
        "event",
        "La03/a;",
        "o",
        "(Lb03/e;)La03/a;",
        "Ll83/a0;",
        "n",
        "(Lb03/e;)V",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/l;",
        "La03/d;",
        "z",
        "Lec3/l;",
        "domainState",
        "E",
        "getViewState",
        "()Lec3/l;",
        "viewState",
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
.field public static final F:I = 0x8


# instance fields
.field private final E:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
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
.method public constructor <init>(La03/c;Lc03/b;Lbc3/c0;)V
    .locals 3

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeableCoroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p3, p0, Lb03/f;->x:Lbc3/c0;

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    .line 3
    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lb03/f;->y:Lec3/o1;

    .line 4
    new-instance v1, Lb03/f$b;

    invoke-direct {v1, v0, p0}, Lb03/f$b;-><init>(Lec3/l;Lb03/f;)V

    .line 5
    invoke-static {v1, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lb03/f;->z:Lec3/l;

    .line 6
    new-instance v0, Lb03/f$c;

    invoke-direct {v0, p1, p2}, Lb03/f$c;-><init>(Lec3/l;Lc03/b;)V

    .line 7
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    .line 8
    invoke-static {v0, p3, p1, v2}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    .line 9
    iput-object p1, p0, Lb03/f;->E:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(La03/c;Lc03/b;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 10
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lb03/f;-><init>(La03/c;Lc03/b;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic j(Lb03/f;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lb03/f;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lb03/f;Lb03/e;)La03/a;
    .locals 0

    invoke-direct {p0, p1}, Lb03/f;->o(Lb03/e;)La03/a;

    move-result-object p0

    return-object p0
.end method

.method private final o(Lb03/e;)La03/a;
    .locals 1

    instance-of v0, p1, Lb03/e$b;

    if-eqz v0, :cond_0

    new-instance v0, La03/a$b;

    check-cast p1, Lb03/e$b;

    invoke-virtual {p1}, Lb03/e$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La03/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lb03/e$a;

    if-eqz v0, :cond_1

    new-instance v0, La03/a$a;

    check-cast p1, Lb03/e$a;

    invoke-virtual {p1}, Lb03/e$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, La03/a$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lb03/e;

    invoke-virtual {p0, p1}, Lb03/f;->n(Lb03/e;)V

    return-void
.end method

.method public getViewState()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lb03/f;->E:Lec3/l;

    return-object v0
.end method

.method public n(Lb03/e;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb03/f;->x:Lbc3/c0;

    new-instance v1, Lb03/f$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lb03/f$a;-><init>(Lb03/f;Lb03/e;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
