.class public final Lza2/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lza2/u;",
        "",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lbc3/c0;)V",
        "Lec3/l;",
        "Lza2/t;",
        "b",
        "()Lec3/l;",
        "event",
        "Ll83/a0;",
        "c",
        "(Lza2/t;)V",
        "a",
        "Lbc3/c0;",
        "Lec3/o1;",
        "Lec3/o1;",
        "coordinatorFlow",
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

    .line 2
    iput-object p1, p0, Lza2/u;->a:Lbc3/c0;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 3
    invoke-static {v1, v1, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lza2/u;->b:Lec3/o1;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    .line 5
    sget-object p1, Lkc3/d;->w:Lkc3/d;

    .line 6
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lza2/u;-><init>(Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic a(Lza2/u;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lza2/u;->b:Lec3/o1;

    return-object p0
.end method


# virtual methods
.method public final b()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lza2/u;->b:Lec3/o1;

    invoke-static {v0}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lza2/t;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza2/u;->a:Lbc3/c0;

    new-instance v1, Lza2/u$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lza2/u$a;-><init>(Lza2/u;Lza2/t;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
