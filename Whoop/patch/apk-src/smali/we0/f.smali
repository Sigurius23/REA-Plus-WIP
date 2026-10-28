.class public final Lwe0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe0/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lwe0/a;",
        "Lwe0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J*\u0010\u001d\u001a\u00020\u00032\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ#\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lwe0/f;",
        "Lod1/g;",
        "Lwe0/a;",
        "Lwe0/b;",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "api",
        "Lcom/whoop/labfileupload/domain/LabFileUploadApi;",
        "labFileUploadApi",
        "Lps1/a;",
        "testUploadFileProcessor",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;)V",
        "Lj/a;",
        "result",
        "",
        "Lns1/b;",
        "k",
        "(Lj/a;Lq83/d;)Ljava/lang/Object;",
        "Landroid/net/Uri;",
        "uris",
        "l",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "j",
        "(Lq83/d;)Ljava/lang/Object;",
        "processedFiles",
        "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;",
        "uploadMetadata",
        "m",
        "(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;",
        "b",
        "Lcom/whoop/labfileupload/domain/LabFileUploadApi;",
        "c",
        "Lps1/a;",
        "d",
        "Ltr2/n;",
        "advanced-labs_release"
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
.field private final a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

.field private final b:Lcom/whoop/labfileupload/domain/LabFileUploadApi;

.field private final c:Lps1/a;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labFileUploadApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testUploadFileProcessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwe0/f;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    .line 3
    iput-object p2, p0, Lwe0/f;->b:Lcom/whoop/labfileupload/domain/LabFileUploadApi;

    .line 4
    iput-object p3, p0, Lwe0/f;->c:Lps1/a;

    .line 5
    iput-object p4, p0, Lwe0/f;->d:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "TestUploadInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p4

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lwe0/f;-><init>(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/labfileupload/domain/LabFileUploadApi;Lps1/a;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lwe0/f;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lwe0/f;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lwe0/f;)Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;
    .locals 0

    iget-object p0, p0, Lwe0/f;->a:Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;

    return-object p0
.end method

.method public static final synthetic e(Lwe0/f;)Lcom/whoop/labfileupload/domain/LabFileUploadApi;
    .locals 0

    iget-object p0, p0, Lwe0/f;->b:Lcom/whoop/labfileupload/domain/LabFileUploadApi;

    return-object p0
.end method

.method public static final synthetic f(Lwe0/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lwe0/f;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic g(Lwe0/f;Lj/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe0/f;->k(Lj/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lwe0/f;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe0/f;->l(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lwe0/f;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwe0/f;->m(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final j(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lwe0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwe0/f$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwe0/f$b;

    iget v1, v0, Lwe0/f$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe0/f$b;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwe0/f$b;

    invoke-direct {v0, p0, p1}, Lwe0/f$b;-><init>(Lwe0/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lwe0/f$b;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwe0/f$b;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lwe0/f;->d:Ltr2/n;

    new-instance v5, Lwe0/f$c;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lwe0/f$c;-><init>(Lwe0/f;Lq83/d;)V

    iput p1, v6, Lwe0/f$b;->y:I

    const-string v4, "Failed to fetch test upload data"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    new-instance v0, Lwe0/c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    invoke-direct {v0, p1}, Lwe0/c;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lwe0/b$a;->a:Lwe0/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final k(Lj/a;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/a;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lns1/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwe0/f$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe0/f$g;

    iget v1, v0, Lwe0/f$g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe0/f$g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe0/f$g;

    invoke-direct {v0, p0, p2}, Lwe0/f$g;-><init>(Lwe0/f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwe0/f$g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe0/f$g;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lwe0/f$g;->w:Ljava/lang/Object;

    check-cast p1, Lj/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwe0/f;->c:Lps1/a;

    iput-object v3, v0, Lwe0/f$g;->w:Ljava/lang/Object;

    iput v4, v0, Lwe0/f$g;->z:I

    invoke-virtual {p2, p1, v0}, Lps1/a;->d(Lj/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lwe0/f;->d:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "File processing returned empty list - all files were skipped or failed"

    invoke-interface {p1, v0, p2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_4
    return-object p2
.end method

.method private final l(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lns1/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lwe0/f$h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe0/f$h;

    iget v1, v0, Lwe0/f$h;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe0/f$h;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe0/f$h;

    invoke-direct {v0, p0, p2}, Lwe0/f$h;-><init>(Lwe0/f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lwe0/f$h;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe0/f$h;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lwe0/f$h;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwe0/f;->c:Lps1/a;

    iput-object v3, v0, Lwe0/f$h;->w:Ljava/lang/Object;

    iput v4, v0, Lwe0/f$h;->z:I

    invoke-virtual {p2, p1, v0}, Lps1/a;->e(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lwe0/f;->d:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Image processing returned empty list - all images were skipped or failed"

    invoke-interface {p1, v0, p2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_4
    return-object p2
.end method

.method private final m(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lns1/b;",
            ">;",
            "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;",
            "Lq83/d<",
            "-",
            "Lwe0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lwe0/f$i;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lwe0/f$i;

    iget v1, v0, Lwe0/f$i;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe0/f$i;->G:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwe0/f$i;

    invoke-direct {v0, p0, p3}, Lwe0/f$i;-><init>(Lwe0/f;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v6, Lwe0/f$i;->E:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwe0/f$i;->G:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lwe0/f$i;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v6, Lwe0/f$i;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v6, Lwe0/f$i;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;

    iget-object p1, v6, Lwe0/f$i;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p1, :cond_3

    iget-object p1, p0, Lwe0/f;->d:Ltr2/n;

    const-string p2, "Cannot upload files - no processed files available"

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lwe0/b$a;->a:Lwe0/b$a;

    return-object p1

    :cond_3
    if-nez p2, :cond_4

    iget-object p1, p0, Lwe0/f;->d:Ltr2/n;

    const-string p2, "Cannot upload files - no upload metadata available"

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lwe0/b$a;->a:Lwe0/b$a;

    return-object p1

    :cond_4
    :try_start_1
    check-cast p1, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lns1/b;

    invoke-virtual {v1}, Lns1/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lwe0/f;->c:Lps1/a;

    invoke-virtual {p1, p3}, Lps1/a;->f(Ljava/util/List;)Lps1/a$b;

    move-result-object p1

    instance-of p3, p1, Lps1/a$b$b;

    if-eqz p3, :cond_a

    check-cast p1, Lps1/a$b$b;

    invoke-virtual {p1}, Lps1/a$b$b;->a()Ljava/util/List;

    move-result-object p1

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p3, v2

    iget-object v2, p0, Lwe0/f;->d:Ltr2/n;

    const-string v4, "Failed to upload files"

    new-instance v5, Lwe0/f$j;

    invoke-direct {v5, p0, p1, p2, v10}, Lwe0/f$j;-><init>(Lwe0/f;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)V

    iput-object v10, v6, Lwe0/f$i;->w:Ljava/lang/Object;

    iput-object v10, v6, Lwe0/f$i;->x:Ljava/lang/Object;

    iput-object v10, v6, Lwe0/f$i;->y:Ljava/lang/Object;

    iput-object v10, v6, Lwe0/f$i;->z:Ljava/lang/Object;

    iput p3, v6, Lwe0/f$i;->G:I

    const/4 v3, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v0, :cond_6

    return-object v0

    :cond_6
    :goto_3
    check-cast p3, Lu02/a;

    instance-of p1, p3, Lu02/a$c;

    if-eqz p1, :cond_8

    new-instance p1, Lwe0/b$c;

    check-cast p3, Lu02/a$c;

    invoke-virtual {p3}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpg3/v0;

    iget-object p2, p2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/labfileupload/domain/models/ExternalDataUploadResponse;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/whoop/labfileupload/domain/models/ExternalDataUploadResponse;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v10

    :cond_7
    invoke-direct {p1, v10}, Lwe0/b$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_8
    instance-of p1, p3, Lu02/a$b;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lwe0/f;->d:Ltr2/n;

    check-cast p3, Lu02/a$b;

    invoke-virtual {p3}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "File upload failed: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lwe0/b$a;->a:Lwe0/b$a;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    instance-of p2, p1, Lps1/a$b$a;

    if-eqz p2, :cond_b

    iget-object p2, p0, Lwe0/f;->d:Ltr2/n;

    check-cast p1, Lps1/a$b$a;

    invoke-virtual {p1}, Lps1/a$b$a;->a()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to prepare files for upload: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p3, v9, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lwe0/b$a;->a:Lwe0/b$a;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_4
    iget-object p2, p0, Lwe0/f;->d:Ltr2/n;

    const-string p3, "File upload exception"

    new-array v0, v9, [Lqr2/a$a;

    invoke-interface {p2, p3, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lwe0/b$a;->a:Lwe0/b$a;

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwe0/f$e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lwe0/f$e;-><init>(Lec3/l;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance v2, Lwe0/f$a;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lwe0/f$a;-><init>(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lwe0/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lwe0/f$f;

    invoke-direct {v0, p0, v1}, Lwe0/f$f;-><init>(Lwe0/f;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v1, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v0, Lwe0/f$d;

    invoke-direct {v0, p1}, Lwe0/f$d;-><init>(Lec3/l;)V

    return-object v0
.end method
