.class public final Lzy1/g;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n*\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lzy1/g;",
        "Landroidx/lifecycle/w1;",
        "Lxy1/e;",
        "interactor",
        "Lzy1/h;",
        "viewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lxy1/e;Lzy1/h;Lbc3/c0;)V",
        "Lec3/l;",
        "Laz1/i;",
        "Lxy1/d;",
        "l",
        "(Lec3/l;Lxy1/e;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "n",
        "(Laz1/i;)V",
        "w",
        "Lzy1/h;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "events",
        "Laz1/j;",
        "z",
        "Lec3/l;",
        "getViewState",
        "()Lec3/l;",
        "viewState",
        "mfa_release"
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
.field private final w:Lzy1/h;

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
.method public constructor <init>(Lxy1/e;Lzy1/h;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lzy1/g;->w:Lzy1/h;

    .line 3
    iput-object p3, p0, Lzy1/g;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 p3, 0x7

    const/4 v0, 0x0

    .line 4
    invoke-static {v0, v0, p2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lzy1/g;->y:Lec3/o1;

    .line 5
    invoke-direct {p0, p2, p1}, Lzy1/g;->l(Lec3/l;Lxy1/e;)Lec3/l;

    move-result-object p1

    .line 6
    new-instance p2, Lzy1/g$b;

    invoke-direct {p2, p1, p0}, Lzy1/g$b;-><init>(Lec3/l;Lzy1/g;)V

    .line 7
    iput-object p2, p0, Lzy1/g;->z:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Lxy1/e;Lzy1/h;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lzy1/g;-><init>(Lxy1/e;Lzy1/h;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lzy1/g;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lzy1/g;->y:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic j(Lzy1/g;)Lzy1/h;
    .locals 0

    iget-object p0, p0, Lzy1/g;->w:Lzy1/h;

    return-object p0
.end method

.method private final l(Lec3/l;Lxy1/e;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lxy1/e;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lxy1/e;->b(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lzy1/g;->z:Lec3/l;

    return-object v0
.end method

.method public final n(Laz1/i;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzy1/g;->x:Lbc3/c0;

    new-instance v1, Lzy1/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzy1/g$a;-><init>(Lzy1/g;Laz1/i;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
