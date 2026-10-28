.class final Lv41/d0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv41/d0;->q(Ll0/l;ILjava/lang/String;Lbh/e;Lbc3/c0;IILmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;Landroid/content/Context;ZZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.PdfViewerKt$PdfContent$1$1$2$1$1$job$1"
    f = "PdfViewer.kt"
    l = {
        0x135
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:I

.field H:I

.field I:Z

.field J:I

.field private synthetic K:Ljava/lang/Object;

.field final synthetic L:Lmc3/a;

.field final synthetic M:Landroid/graphics/pdf/PdfRenderer;

.field final synthetic N:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic O:I

.field final synthetic P:Z

.field final synthetic Q:I

.field final synthetic R:I

.field final synthetic S:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;IZIILp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmc3/a;",
            "Landroid/graphics/pdf/PdfRenderer;",
            "Lkotlin/jvm/functions/Function1;",
            "IZII",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lv41/d0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lv41/d0$a;->L:Lmc3/a;

    iput-object p2, p0, Lv41/d0$a;->M:Landroid/graphics/pdf/PdfRenderer;

    iput-object p3, p0, Lv41/d0$a;->N:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lv41/d0$a;->O:I

    iput-boolean p5, p0, Lv41/d0$a;->P:Z

    iput p6, p0, Lv41/d0$a;->Q:I

    iput p7, p0, Lv41/d0$a;->R:I

    iput-object p8, p0, Lv41/d0$a;->S:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Lv41/d0$a;

    iget-object v1, p0, Lv41/d0$a;->L:Lmc3/a;

    iget-object v2, p0, Lv41/d0$a;->M:Landroid/graphics/pdf/PdfRenderer;

    iget-object v3, p0, Lv41/d0$a;->N:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lv41/d0$a;->O:I

    iget-boolean v5, p0, Lv41/d0$a;->P:Z

    iget v6, p0, Lv41/d0$a;->Q:I

    iget v7, p0, Lv41/d0$a;->R:I

    iget-object v8, p0, Lv41/d0$a;->S:Lp1/c1;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lv41/d0$a;-><init>(Lmc3/a;Landroid/graphics/pdf/PdfRenderer;Lkotlin/jvm/functions/Function1;IZIILp1/c1;Lq83/d;)V

    iput-object p1, v0, Lv41/d0$a;->K:Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lv41/d0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lv41/d0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lv41/d0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lv41/d0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lv41/d0$a;->K:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lv41/d0$a;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget v0, p0, Lv41/d0$a;->G:I

    iget v1, p0, Lv41/d0$a;->F:I

    iget-boolean v2, p0, Lv41/d0$a;->I:Z

    iget v4, p0, Lv41/d0$a;->E:I

    iget-object v5, p0, Lv41/d0$a;->z:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    iget-object v6, p0, Lv41/d0$a;->y:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lv41/d0$a;->x:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/pdf/PdfRenderer;

    iget-object v8, p0, Lv41/d0$a;->w:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v8, p0, Lv41/d0$a;->L:Lmc3/a;

    iget-object v7, p0, Lv41/d0$a;->M:Landroid/graphics/pdf/PdfRenderer;

    iget-object v6, p0, Lv41/d0$a;->N:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lv41/d0$a;->O:I

    iget-boolean v2, p0, Lv41/d0$a;->P:Z

    iget p1, p0, Lv41/d0$a;->Q:I

    iget v5, p0, Lv41/d0$a;->R:I

    iget-object v9, p0, Lv41/d0$a;->S:Lp1/c1;

    iput-object v0, p0, Lv41/d0$a;->K:Ljava/lang/Object;

    iput-object v8, p0, Lv41/d0$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lv41/d0$a;->x:Ljava/lang/Object;

    iput-object v6, p0, Lv41/d0$a;->y:Ljava/lang/Object;

    iput-object v9, p0, Lv41/d0$a;->z:Ljava/lang/Object;

    iput v4, p0, Lv41/d0$a;->E:I

    iput-boolean v2, p0, Lv41/d0$a;->I:Z

    iput p1, p0, Lv41/d0$a;->F:I

    iput v5, p0, Lv41/d0$a;->G:I

    const/4 v0, 0x0

    iput v0, p0, Lv41/d0$a;->H:I

    iput v3, p0, Lv41/d0$a;->J:I

    invoke-interface {v8, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_2

    return-object v1

    :cond_2
    move v1, p1

    move v0, v5

    move-object v5, v9

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    const/4 v9, 0x0

    if-eqz v7, :cond_6

    :try_start_0
    invoke-virtual {v7, v4}, Landroid/graphics/pdf/PdfRenderer;->openPage(I)Landroid/graphics/pdf/PdfRenderer$Page;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_5

    :try_start_1
    invoke-virtual {v4}, Landroid/graphics/pdf/PdfRenderer$Page;->getWidth()I

    move-result v0

    if-lez v0, :cond_3

    int-to-float v0, v1

    invoke-virtual {v4}, Landroid/graphics/pdf/PdfRenderer$Page;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-virtual {v4}, Landroid/graphics/pdf/PdfRenderer$Page;->getWidth()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v0, v2

    float-to-int v0, v0

    if-ge v0, v3, :cond_4

    move v0, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_3
    move v0, v1

    :cond_4
    :goto_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v0, v9, v9, v3}, Landroid/graphics/pdf/PdfRenderer$Page;->render(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Matrix;I)V

    invoke-static {v5, v0}, Lv41/d0;->R(Lp1/c1;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v4, v9}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_6

    :catch_0
    move-exception v0

    goto :goto_5

    :goto_3
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-static {v4, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1

    :cond_6
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v5, v0}, Lv41/d0;->R(Lp1/c1;Landroid/graphics/Bitmap;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    invoke-interface {v8, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_5
    :try_start_5
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-interface {v8, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :goto_6
    invoke-interface {v8, v9}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
