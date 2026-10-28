.class public final Lyv0/c;
.super Lld1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lld1/c<",
        "Lyv0/d;",
        "Lyv0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u000c*\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lyv0/c;",
        "Lld1/c;",
        "Lyv0/d;",
        "Lyv0/b;",
        "Lcom/whoop/core/details/activitytargets/domain/c;",
        "interactor",
        "Lzv0/a;",
        "reducer",
        "Lor2/m;",
        "coroutineScope",
        "<init>",
        "(Lcom/whoop/core/details/activitytargets/domain/c;Lzv0/a;Lor2/m;)V",
        "Lcom/whoop/core/details/activitytargets/domain/a$a;",
        "p",
        "(Lyv0/b;)Lcom/whoop/core/details/activitytargets/domain/a$a;",
        "event",
        "Ll83/a0;",
        "o",
        "(Lyv0/b;)V",
        "x",
        "Lzv0/a;",
        "y",
        "Lor2/m;",
        "Lec3/o1;",
        "z",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/f2;",
        "E",
        "Lec3/f2;",
        "getViewState",
        "()Lec3/f2;",
        "viewState",
        "core-details_release"
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
.field private final E:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final x:Lzv0/a;

.field private final y:Lor2/m;

.field private final z:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/core/details/activitytargets/domain/c;Lzv0/a;Lor2/m;)V
    .locals 2

    const-string v0, "interactor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p3}, Lld1/c;-><init>(Lbc3/c0;)V

    .line 2
    iput-object p2, p0, Lyv0/c;->x:Lzv0/a;

    .line 3
    iput-object p3, p0, Lyv0/c;->y:Lor2/m;

    const/4 p2, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 4
    invoke-static {v1, v1, p2, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p2

    iput-object p2, p0, Lyv0/c;->z:Lec3/o1;

    .line 5
    new-instance v0, Lyv0/c$b;

    invoke-direct {v0, p2, p0}, Lyv0/c$b;-><init>(Lec3/l;Lyv0/c;)V

    .line 6
    invoke-virtual {p1, v0}, Lcom/whoop/core/details/activitytargets/domain/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    .line 7
    new-instance p2, Lyv0/c$c;

    invoke-direct {p2, p1, p0}, Lyv0/c$c;-><init>(Lec3/l;Lyv0/c;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    .line 9
    sget-object v0, Lyv0/d$c;->a:Lyv0/d$c;

    .line 10
    invoke-static {p2, p3, p1, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lyv0/c;->E:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/core/details/activitytargets/domain/c;Lzv0/a;Lor2/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    new-instance p3, Lor2/m;

    const/4 p4, 0x1

    const/4 p5, 0x0

    invoke-direct {p3, p5, p4, p5}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lyv0/c;-><init>(Lcom/whoop/core/details/activitytargets/domain/c;Lzv0/a;Lor2/m;)V

    return-void
.end method

.method public static final synthetic j(Lyv0/c;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lyv0/c;->z:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic l(Lyv0/c;)Lzv0/a;
    .locals 0

    iget-object p0, p0, Lyv0/c;->x:Lzv0/a;

    return-object p0
.end method

.method public static final synthetic n(Lyv0/c;Lyv0/b;)Lcom/whoop/core/details/activitytargets/domain/a$a;
    .locals 0

    invoke-direct {p0, p1}, Lyv0/c;->p(Lyv0/b;)Lcom/whoop/core/details/activitytargets/domain/a$a;

    move-result-object p0

    return-object p0
.end method

.method private final p(Lyv0/b;)Lcom/whoop/core/details/activitytargets/domain/a$a;
    .locals 1

    instance-of v0, p1, Lyv0/b$a;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/core/details/activitytargets/domain/a$a;

    check-cast p1, Lyv0/b$a;

    invoke-virtual {p1}, Lyv0/b$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/core/details/activitytargets/domain/a$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lyv0/b;

    invoke-virtual {p0, p1}, Lyv0/c;->o(Lyv0/b;)V

    return-void
.end method

.method public getViewState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lyv0/c;->E:Lec3/f2;

    return-object v0
.end method

.method public bridge synthetic getViewState()Lec3/l;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyv0/c;->getViewState()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public o(Lyv0/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyv0/c;->y:Lor2/m;

    new-instance v1, Lyv0/c$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lyv0/c$a;-><init>(Lyv0/c;Lyv0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
