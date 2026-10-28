.class final Lps1/b$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lps1/b;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Lns1/a;",
        "<anonymous>",
        "(Lbc3/c0;)Lns1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labfileupload.processor.TestUploadPdfProcessor$processPdfForPreview$2"
    f = "TestUploadPdfProcessor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lps1/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lps1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lps1/b;",
            "Lq83/d<",
            "-",
            "Lps1/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lps1/b$b;->x:Ljava/lang/String;

    iput-object p2, p0, Lps1/b$b;->y:Lps1/b;

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

    new-instance p1, Lps1/b$b;

    iget-object v0, p0, Lps1/b$b;->x:Ljava/lang/String;

    iget-object v1, p0, Lps1/b$b;->y:Lps1/b;

    invoke-direct {p1, v0, v1, p2}, Lps1/b$b;-><init>(Ljava/lang/String;Lps1/b;Lq83/d;)V

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
            "Lns1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lps1/b$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lps1/b$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lps1/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lps1/b$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const-string v0, "Failed to open PDF file descriptor for preview: "

    const-string v1, "PDF file not found for preview processing: "

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lps1/b$b;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lps1/b$b;->x:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v0, p0, Lps1/b$b;->y:Lps1/b;

    invoke-static {v0}, Lps1/b;->a(Lps1/b;)Ltr2/n;

    move-result-object v0

    iget-object v3, p0, Lps1/b$b;->x:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lns1/a;

    invoke-direct {v0, p1, v2}, Lns1/a;-><init>(Landroid/graphics/Bitmap;I)V

    return-object v0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_3

    :catch_2
    move-exception v0

    goto/16 :goto_4

    :cond_0
    const/high16 v1, 0x10000000

    invoke-static {v3, v1}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lps1/b$b;->y:Lps1/b;

    invoke-static {v1}, Lps1/b;->a(Lps1/b;)Ltr2/n;

    move-result-object v1

    iget-object v3, p0, Lps1/b$b;->x:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lns1/a;

    invoke-direct {v0, p1, v2}, Lns1/a;-><init>(Landroid/graphics/Bitmap;I)V

    return-object v0

    :cond_1
    new-instance v0, Landroid/graphics/pdf/PdfRenderer;

    invoke-direct {v0, v1}, Landroid/graphics/pdf/PdfRenderer;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-virtual {v0}, Landroid/graphics/pdf/PdfRenderer;->getPageCount()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_2

    :try_start_1
    invoke-virtual {v0, v4}, Landroid/graphics/pdf/PdfRenderer;->openPage(I)Landroid/graphics/pdf/PdfRenderer$Page;

    move-result-object v5

    const-string v6, "openPage(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/graphics/pdf/PdfRenderer$Page;->getWidth()I

    move-result v6

    int-to-float v6, v6

    const/high16 v7, 0x43c80000    # 400.0f

    div-float v6, v7, v6

    invoke-virtual {v5}, Landroid/graphics/pdf/PdfRenderer$Page;->getHeight()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    invoke-virtual {v5}, Landroid/graphics/pdf/PdfRenderer$Page;->getWidth()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v7, v6

    float-to-int v7, v7

    invoke-virtual {v5}, Landroid/graphics/pdf/PdfRenderer$Page;->getHeight()I

    move-result v8

    int-to-float v8, v8

    mul-float/2addr v8, v6

    float-to-int v6, v8

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v6, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v5, v6, p1, p1, v7}, Landroid/graphics/pdf/PdfRenderer$Page;->render(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Matrix;I)V

    invoke-virtual {v5}, Landroid/graphics/pdf/PdfRenderer$Page;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception v5

    :try_start_2
    iget-object v6, p0, Lps1/b$b;->y:Lps1/b;

    invoke-static {v6}, Lps1/b;->a(Lps1/b;)Ltr2/n;

    move-result-object v6

    iget-object v7, p0, Lps1/b$b;->x:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Failed to render PDF page "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " for TestUpload preview, trying next: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v2, [Lqr2/a$a;

    invoke-interface {v6, v7, v5, v8}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v6, p1

    :goto_1
    invoke-virtual {v0}, Landroid/graphics/pdf/PdfRenderer;->close()V

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V

    new-instance v0, Lns1/a;

    invoke-direct {v0, v6, v3}, Lns1/a;-><init>(Landroid/graphics/Bitmap;I)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :goto_2
    iget-object v1, p0, Lps1/b$b;->y:Lps1/b;

    invoke-static {v1}, Lps1/b;->a(Lps1/b;)Ltr2/n;

    move-result-object v1

    iget-object v3, p0, Lps1/b$b;->x:Ljava/lang/String;

    const-string v4, "Failed to process TestUpload PDF: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {v1, v3, v0, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v0, Lns1/a;

    invoke-direct {v0, p1, v2}, Lns1/a;-><init>(Landroid/graphics/Bitmap;I)V

    goto :goto_5

    :goto_3
    iget-object v1, p0, Lps1/b$b;->y:Lps1/b;

    invoke-static {v1}, Lps1/b;->a(Lps1/b;)Ltr2/n;

    move-result-object v1

    iget-object v3, p0, Lps1/b$b;->x:Ljava/lang/String;

    const-string v4, "I/O error processing PDF file: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {v1, v3, v0, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v0, Lns1/a;

    invoke-direct {v0, p1, v2}, Lns1/a;-><init>(Landroid/graphics/Bitmap;I)V

    goto :goto_5

    :goto_4
    iget-object v1, p0, Lps1/b$b;->y:Lps1/b;

    invoke-static {v1}, Lps1/b;->a(Lps1/b;)Ltr2/n;

    move-result-object v1

    iget-object v3, p0, Lps1/b$b;->x:Ljava/lang/String;

    const-string v4, "Permission denied accessing PDF file: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {v1, v3, v0, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v0, Lns1/a;

    invoke-direct {v0, p1, v2}, Lns1/a;-><init>(Landroid/graphics/Bitmap;I)V

    :goto_5
    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
