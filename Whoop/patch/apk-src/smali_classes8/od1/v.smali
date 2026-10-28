.class public final Lod1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/repositories/ActiveSessionChecker;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lod1/v;",
        "Lcom/whoop/data/repositories/ActiveSessionChecker;",
        "Lz92/a;",
        "userInfoAccessor",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "<init>",
        "(Lz92/a;Lod1/j;)V",
        "",
        "hasSession",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lz92/a;",
        "b",
        "Lod1/j;",
        "core_release"
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
.field private final a:Lz92/a;

.field private final b:Lod1/j;


# direct methods
.method public constructor <init>(Lz92/a;Lod1/j;)V
    .locals 1

    const-string v0, "userInfoAccessor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/v;->a:Lz92/a;

    iput-object p2, p0, Lod1/v;->b:Lod1/j;

    return-void
.end method


# virtual methods
.method public hasSession(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lod1/v$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lod1/v$a;

    iget v1, v0, Lod1/v$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lod1/v$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lod1/v$a;

    invoke-direct {v0, p0, p1}, Lod1/v$a;-><init>(Lod1/v;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lod1/v$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lod1/v$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lod1/v;->a:Lz92/a;

    invoke-interface {p1}, Lz92/a;->getUser()Lec3/l;

    move-result-object p1

    iput v3, v0, Lod1/v$a;->y:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-nez p1, :cond_5

    iget-object p1, p0, Lod1/v;->b:Lod1/j;

    invoke-virtual {p1}, Lod1/j;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :cond_5
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
