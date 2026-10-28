.class public final Lfh0/g;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lfh0/e;",
        "Lfh0/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lfh0/g;",
        "Lld1/c;",
        "Lfh0/e;",
        "Lfh0/f;",
        "Lfh0/a;",
        "interactor",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lfh0/a;Lor2/m;)V",
        "event",
        "Ll83/a0;",
        "n",
        "(Lfh0/f;)V",
        "x",
        "Lor2/m;",
        "Lec3/o1;",
        "y",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/t1;",
        "z",
        "Lec3/t1;",
        "l",
        "()Lec3/t1;",
        "viewState",
        "bot_release"
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
.field private final x:Lor2/m;

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
.method public constructor <init>(Lfh0/a;Lor2/m;)V
    .locals 4

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p2}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lfh0/g;->x:Lor2/m;

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 3
    invoke-static {v2, v3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lfh0/g;->y:Lec3/o1;

    .line 4
    invoke-static {v0, p1}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object p1

    .line 5
    sget-object v0, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, p2, v0, v3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Lfh0/g;->z:Lec3/t1;

    return-void
.end method

.method public synthetic constructor <init>(Lfh0/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 6
    new-instance p2, Lor2/m;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lfh0/g;-><init>(Lfh0/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lfh0/g;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lfh0/g;->y:Lec3/o1;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lfh0/f;

    invoke-virtual {p0, p1}, Lfh0/g;->n(Lfh0/f;)V

    return-void
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    invoke-virtual {p0}, Lfh0/g;->l()Lec3/t1;

    move-result-object v0

    return-object v0
.end method

.method public l()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lfh0/g;->z:Lec3/t1;

    return-object v0
.end method

.method public n(Lfh0/f;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfh0/g;->x:Lor2/m;

    new-instance v1, Lfh0/g$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lfh0/g$a;-><init>(Lfh0/g;Lfh0/f;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
