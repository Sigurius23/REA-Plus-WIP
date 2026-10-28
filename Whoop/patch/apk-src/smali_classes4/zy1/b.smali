.class public final Lzy1/b;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000b*\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lzy1/b;",
        "Landroidx/lifecycle/w1;",
        "Lxy1/b;",
        "interactor",
        "Lzy1/c;",
        "mfaInputViewStateReducer",
        "Lbc3/c0;",
        "coroutineScope",
        "stateInScope",
        "<init>",
        "(Lxy1/b;Lzy1/c;Lbc3/c0;Lbc3/c0;)V",
        "Lec3/l;",
        "Lwy1/a;",
        "Lxy1/a;",
        "n",
        "(Lec3/l;Lxy1/b;)Lec3/l;",
        "event",
        "Ll83/a0;",
        "o",
        "(Lwy1/a;)V",
        "w",
        "Lzy1/c;",
        "x",
        "Lbc3/c0;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "viewEvents",
        "Lec3/t1;",
        "Lwy1/b;",
        "z",
        "Lec3/t1;",
        "l",
        "()Lec3/t1;",
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
.field private final w:Lzy1/c;

.field private final x:Lbc3/c0;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxy1/b;Lzy1/c;Lbc3/c0;Lbc3/c0;)V
    .locals 1

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mfaInputViewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateInScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lzy1/b;->w:Lzy1/c;

    .line 3
    iput-object p3, p0, Lzy1/b;->x:Lbc3/c0;

    const/4 p2, 0x0

    const/4 p3, 0x7

    const/4 v0, 0x0

    .line 4
    invoke-static {v0, v0, p2, p3}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lzy1/b;->y:Lec3/o1;

    .line 5
    invoke-direct {p0, p2, p1}, Lzy1/b;->n(Lec3/l;Lxy1/b;)Lec3/l;

    move-result-object p1

    .line 6
    new-instance p2, Lzy1/b$b;

    invoke-direct {p2, p1, p0}, Lzy1/b$b;-><init>(Lec3/l;Lzy1/b;)V

    .line 7
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 p3, 0x1

    invoke-static {p2, p4, p1, p3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lzy1/b;->z:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lxy1/b;Lzy1/c;Lbc3/c0;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 8
    new-instance p3, Lor2/m;

    const/4 p6, 0x1

    const/4 v0, 0x0

    invoke-direct {p3, v0, p6, v0}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, p3

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lzy1/b;-><init>(Lxy1/b;Lzy1/c;Lbc3/c0;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic g(Lzy1/b;)Lzy1/c;
    .locals 0

    iget-object p0, p0, Lzy1/b;->w:Lzy1/c;

    return-object p0
.end method

.method public static final synthetic j(Lzy1/b;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lzy1/b;->y:Lec3/o1;

    return-object p0
.end method

.method private final n(Lec3/l;Lxy1/b;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lxy1/b;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lxy1/b;->f(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final l()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lzy1/b;->z:Lec3/t1;

    return-object v0
.end method

.method public final o(Lwy1/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzy1/b;->x:Lbc3/c0;

    new-instance v1, Lzy1/b$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzy1/b$a;-><init>(Lzy1/b;Lwy1/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
