.class final Lt92/b$l;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt92/b;->o2(Lt92/b;Lxj0/b;JZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lzj0/h;",
        "<anonymous>",
        "(Lbc3/c0;)Lzj0/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt$sendCommandToStrapSuspend$2"
    f = "WhoopStrapGatt.kt"
    l = {
        0x275
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lxj0/b;

.field final synthetic F:Z

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic z:Lt92/b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lt92/b;Lxj0/b;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lt92/b;",
            "Lxj0/b;",
            "Z",
            "Lq83/d<",
            "-",
            "Lt92/b$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt92/b$l;->y:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lt92/b$l;->z:Lt92/b;

    iput-object p3, p0, Lt92/b$l;->E:Lxj0/b;

    iput-boolean p4, p0, Lt92/b$l;->F:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lt92/b$l;

    iget-object v1, p0, Lt92/b$l;->y:Lkotlin/jvm/internal/g0;

    iget-object v2, p0, Lt92/b$l;->z:Lt92/b;

    iget-object v3, p0, Lt92/b$l;->E:Lxj0/b;

    iget-boolean v4, p0, Lt92/b$l;->F:Z

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lt92/b$l;-><init>(Lkotlin/jvm/internal/g0;Lt92/b;Lxj0/b;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lzj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lt92/b$l;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt92/b$l;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt92/b$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt92/b$l;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt92/b$l;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lt92/b$l;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lt92/b$l;->y:Lkotlin/jvm/internal/g0;

    iget-object v1, p0, Lt92/b$l;->z:Lt92/b;

    iget-object v3, p0, Lt92/b$l;->E:Lxj0/b;

    iget-boolean v4, p0, Lt92/b$l;->F:Z

    iput-object p1, p0, Lt92/b$l;->w:Ljava/lang/Object;

    iput v2, p0, Lt92/b$l;->x:I

    invoke-static {v1, v3, v4, p0}, Lt92/b;->w1(Lt92/b;Llt0/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p1, p0, Lt92/b$l;->y:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p1
.end method
