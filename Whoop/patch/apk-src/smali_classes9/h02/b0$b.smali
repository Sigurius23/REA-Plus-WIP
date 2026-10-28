.class final Lh02/b0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh02/b0;->k(Landroidx/compose/ui/Modifier;Lh02/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.nativestore.pdp.view.ProductImageGalleryItemKt$ProductImageGallery$2$1"
    f = "ProductImageGalleryItem.kt"
    l = {
        0x7d,
        0x7f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Ln0/u;

.field final synthetic G:Lq0/y;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ln0/u;Lq0/y;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "Lq0/y;",
            "Lq83/d<",
            "-",
            "Lh02/b0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lh02/b0$b;->F:Ln0/u;

    iput-object p2, p0, Lh02/b0$b;->G:Lq0/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lh02/b0$b;

    iget-object v0, p0, Lh02/b0$b;->F:Ln0/u;

    iget-object v1, p0, Lh02/b0$b;->G:Lq0/y;

    invoke-direct {p1, v0, v1, p2}, Lh02/b0$b;-><init>(Ln0/u;Lq0/y;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lh02/b0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh02/b0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh02/b0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lh02/b0$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh02/b0$b;->E:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lh02/b0$b;->x:Ljava/lang/Object;

    check-cast v0, Ln0/g;

    iget-object v0, p0, Lh02/b0$b;->w:Ljava/lang/Object;

    check-cast v0, Ln0/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh02/b0$b;->F:Ln0/u;

    invoke-virtual {p1}, Ln0/u;->h()Ln0/n;

    move-result-object p1

    iget v1, p1, Ln0/n;->m:I

    iget v4, p1, Ln0/n;->l:I

    sub-int/2addr v1, v4

    iget-object p1, p1, Ln0/n;->k:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v4, p0, Lh02/b0$b;->G:Lq0/y;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ln0/g;

    check-cast v7, Ln0/o;

    iget v7, v7, Ln0/o;->a:I

    invoke-virtual {v4}, Lq0/y;->q()I

    move-result v8

    if-ne v7, v8, :cond_3

    goto :goto_1

    :cond_4
    move-object v5, v6

    :goto_1
    check-cast v5, Ln0/g;

    if-eqz v5, :cond_5

    check-cast v5, Ln0/o;

    iget p1, v5, Ln0/o;->o:I

    iget v4, v5, Ln0/o;->p:I

    div-int/2addr v4, v3

    add-int/2addr v4, p1

    div-int/lit8 p1, v1, 0x2

    sub-int/2addr v4, p1

    iget-object p1, p0, Lh02/b0$b;->F:Ln0/u;

    int-to-float v3, v4

    iput-object v6, p0, Lh02/b0$b;->w:Ljava/lang/Object;

    iput-object v6, p0, Lh02/b0$b;->x:Ljava/lang/Object;

    iput v1, p0, Lh02/b0$b;->y:I

    iput v4, p0, Lh02/b0$b;->z:I

    iput v2, p0, Lh02/b0$b;->E:I

    invoke-static {p1, v3, p0}, Lh0/q3;->d(Lh0/x2;FLs83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lh02/b0$b;->F:Ln0/u;

    iget-object v2, p0, Lh02/b0$b;->G:Lq0/y;

    invoke-virtual {v2}, Lq0/y;->q()I

    move-result v2

    iput-object v6, p0, Lh02/b0$b;->w:Ljava/lang/Object;

    iput-object v6, p0, Lh02/b0$b;->x:Ljava/lang/Object;

    iput v1, p0, Lh02/b0$b;->y:I

    iput v3, p0, Lh02/b0$b;->E:I

    const/4 v1, 0x0

    invoke-virtual {p1, v2, v1, p0}, Ln0/u;->f(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
