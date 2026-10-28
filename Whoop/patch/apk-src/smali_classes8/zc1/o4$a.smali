.class final Lzc1/o4$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc1/o4;->e(Landroidx/compose/runtime/Composer;I)V
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
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.showcase.gallery.item.LiveHeartRateMonitorGalleryKt$LiveHeartRateMonitorGallery$1$1"
    f = "LiveHeartRateMonitorGallery.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lp1/z0;

.field final synthetic y:Lz1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/p;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(Lp1/z0;Lz1/p;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/z0;",
            "Lz1/p;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lzc1/o4$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzc1/o4$a;->x:Lp1/z0;

    iput-object p2, p0, Lzc1/o4$a;->y:Lz1/p;

    iput-object p3, p0, Lzc1/o4$a;->z:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lzc1/o4$a;

    iget-object v0, p0, Lzc1/o4$a;->x:Lp1/z0;

    iget-object v1, p0, Lzc1/o4$a;->y:Lz1/p;

    iget-object v2, p0, Lzc1/o4$a;->z:Lp1/z0;

    invoke-direct {p1, v0, v1, v2, p2}, Lzc1/o4$a;-><init>(Lp1/z0;Lz1/p;Lp1/z0;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lzc1/o4$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzc1/o4$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzc1/o4$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzc1/o4$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lzc1/o4$a;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzc1/o4$a;->x:Lp1/z0;

    check-cast p1, Lp1/g1;

    invoke-virtual {p1}, Lp1/g1;->x()F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    iget-object v0, p0, Lzc1/o4$a;->y:Lz1/p;

    invoke-virtual {v0}, Lz1/p;->size()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lzc1/o4$a;->z:Lp1/z0;

    check-cast v1, Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    iget-object v0, p0, Lzc1/o4$a;->y:Lz1/p;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz1/p;->remove(I)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lzc1/o4$a;->y:Lz1/p;

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Lz1/p;->add(Ljava/lang/Object;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
