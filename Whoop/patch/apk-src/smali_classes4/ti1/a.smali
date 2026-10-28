.class public final Lti1/a;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lti1/a;",
        "Landroidx/lifecycle/w1;",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lbc3/c0;)V",
        "w",
        "Lbc3/c0;",
        "Lti1/b;",
        "x",
        "Lti1/b;",
        "initialState",
        "Lec3/o1;",
        "",
        "y",
        "Lec3/o1;",
        "viewEvents",
        "Lec3/f2;",
        "z",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "kennel_release"
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

.field private final x:Lti1/b;

.field private final y:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final z:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lti1/a;-><init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lbc3/c0;)V
    .locals 5

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Landroidx/lifecycle/w1;-><init>(Lbc3/c0;)V

    .line 3
    iput-object p1, p0, Lti1/a;->w:Lbc3/c0;

    .line 4
    sget-object v0, Lti1/b;->c:Lti1/b$a;

    invoke-virtual {v0}, Lti1/b$a;->a()Lti1/b;

    move-result-object v0

    iput-object v0, p0, Lti1/a;->x:Lti1/b;

    const/4 v1, 0x0

    const/4 v2, 0x7

    const/4 v3, 0x0

    .line 5
    invoke-static {v3, v3, v1, v2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, p0, Lti1/a;->y:Lec3/o1;

    .line 6
    new-instance v2, Lti1/a$a;

    invoke-direct {v2, v1}, Lti1/a$a;-><init>(Lec3/l;)V

    const-wide/16 v3, 0x1388

    const/4 v1, 0x2

    .line 7
    invoke-static {v1, v3, v4}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v1

    invoke-static {v2, p1, v1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lti1/a;->z:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 8
    new-instance p1, Lor2/m;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lti1/a;-><init>(Lbc3/c0;)V

    return-void
.end method
