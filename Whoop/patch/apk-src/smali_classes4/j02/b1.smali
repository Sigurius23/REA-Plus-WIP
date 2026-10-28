.class public final Lj02/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lj02/b1;",
        "",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lbc3/c0;)V",
        "Lec3/t1;",
        "",
        "b",
        "()Lec3/t1;",
        "event",
        "Ll83/a0;",
        "c",
        "(Z)V",
        "a",
        "Lbc3/c0;",
        "Lec3/o1;",
        "Lec3/o1;",
        "coordinatorFlow",
        "navigation_release"
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
.field private final a:Lbc3/c0;

.field private final b:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj02/b1;->a:Lbc3/c0;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 2
    invoke-static {v1, v1, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lj02/b1;->b:Lec3/o1;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    .line 3
    new-instance p1, Lor2/m;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p3, p2}, Lor2/m;-><init>(Lq83/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-direct {p0, p1}, Lj02/b1;-><init>(Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic a(Lj02/b1;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lj02/b1;->b:Lec3/o1;

    return-object p0
.end method


# virtual methods
.method public final b()Lec3/t1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lj02/b1;->b:Lec3/o1;

    new-instance v1, Lj02/b1$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lj02/b1$a;-><init>(Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v1, v0}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    invoke-static {v2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lj02/b1;->a:Lbc3/c0;

    sget-object v2, Lec3/z1;->a:Lec3/b2;

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object v0

    return-object v0
.end method

.method public final c(Z)V
    .locals 3

    iget-object v0, p0, Lj02/b1;->a:Lbc3/c0;

    new-instance v1, Lj02/b1$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lj02/b1$b;-><init>(Lj02/b1;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
