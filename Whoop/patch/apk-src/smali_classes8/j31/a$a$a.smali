.class final Lj31/a$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj31/a$a;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu2/v;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lu2/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.reordable.DetectReorderKt$detectReorderAfterLongPress$1$1"
    f = "DetectReorder.kt"
    l = {
        0x31,
        0x34
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lj31/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj31/m<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj31/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj31/m<",
            "*>;",
            "Lq83/d<",
            "-",
            "Lj31/a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj31/a$a$a;->z:Lj31/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lj31/a$a$a;

    iget-object v1, p0, Lj31/a$a$a;->z:Lj31/m;

    invoke-direct {v0, v1, p2}, Lj31/a$a$a;-><init>(Lj31/m;Lq83/d;)V

    iput-object p1, v0, Lj31/a$a$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj31/a$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj31/a$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lj31/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu2/v;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lj31/a$a$a;->f(Lu2/v;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lj31/a$a$a;->y:Ljava/lang/Object;

    check-cast v0, Lu2/v;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lj31/a$a$a;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lj31/a$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lu2/r;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lj31/a$a$a$a;

    invoke-direct {p1, v3}, Lj31/a$a$a$a;-><init>(Lq83/d;)V

    iput-object v0, p0, Lj31/a$a$a;->y:Ljava/lang/Object;

    iput v5, p0, Lj31/a$a$a;->x:I

    move-object v2, v0

    check-cast v2, Lu2/h0;

    invoke-virtual {v2, p1, p0}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lu2/r;

    iput-object v3, p0, Lj31/a$a$a;->y:Ljava/lang/Object;

    iput-object p1, p0, Lj31/a$a$a;->w:Ljava/lang/Object;

    iput v4, p0, Lj31/a$a$a;->x:I

    invoke-static {v0, p1, p0}, Lj31/c;->b(Lu2/v;Lu2/r;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_2
    check-cast p1, Lu2/r;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lj31/a$a$a;->z:Lj31/m;

    invoke-virtual {p1}, Lj31/m;->C()Ldc3/l;

    move-result-object p1

    new-instance v1, Lj31/p;

    iget-wide v2, v0, Lu2/r;->a:J

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lj31/p;-><init>(JLh2/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
