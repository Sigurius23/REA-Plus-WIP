.class public final Laf0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u0017*\u00020\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Laf0/a;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lwe0/c;",
        "Lze0/c;",
        "e",
        "(Lwe0/c;)Lze0/c;",
        "Lwe0/e;",
        "g",
        "(Lwe0/e;)Lze0/c;",
        "Lwe0/d;",
        "f",
        "(Lwe0/d;)Lze0/c;",
        "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;",
        "Lze0/c$d;",
        "d",
        "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;",
        "Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;",
        "Lze0/a;",
        "eventOverride",
        "Lze0/c$b;",
        "c",
        "(Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;)Lze0/c$b;",
        "Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;",
        "Lze0/c$a;",
        "b",
        "(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lze0/c$a;",
        "Lwe0/b;",
        "domainResult",
        "a",
        "(Lwe0/b;)Lze0/c;",
        "Lzr2/a;",
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
.field private final a:Lzr2/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laf0/a;->a:Lzr2/a;

    return-void
.end method

.method private final b(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lze0/c$a;
    .locals 5

    new-instance v0, Lze0/c$a;

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;->getButton()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;

    move-result-object p1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    const/4 v4, 0x1

    invoke-static {p0, p1, v3, v4, v3}, Laf0/a;->h(Laf0/a;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;ILjava/lang/Object;)Lze0/c$b;

    move-result-object v3

    :cond_0
    invoke-direct {v0, v1, v2, v3}, Lze0/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lze0/c$b;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;)Lze0/c$b;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;->getTextDisplay()Ljava/lang/String;

    move-result-object v0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Lze0/a$e;

    invoke-direct {p2, p1}, Lze0/a$e;-><init>(Lcom/whoop/navigation/e;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    move-object p2, p1

    :cond_1
    :goto_0
    new-instance p1, Lze0/c$b;

    invoke-direct {p1, v0, p2}, Lze0/c$b;-><init>(Ljava/lang/String;Lze0/a;)V

    return-object p1
.end method

.method private final d(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;
    .locals 3

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;->getTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    instance-of v2, p1, Lhy0/h1;

    if-eqz v2, :cond_1

    move-object v1, p1

    check-cast v1, Lhy0/h1;

    :cond_1
    new-instance p1, Lze0/c$d;

    invoke-direct {p1, v0, v1}, Lze0/c$d;-><init>(Ljava/lang/String;Lhy0/h1;)V

    return-object p1
.end method

.method private final e(Lwe0/c;)Lze0/c;
    .locals 4

    invoke-virtual {p1}, Lwe0/c;->a()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;->getTestInputScreen()Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;

    move-result-object v0

    new-instance v1, Lze0/c$e$a;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v2

    invoke-direct {p0, v2}, Laf0/a;->d(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;

    move-result-object v2

    invoke-virtual {p1}, Lwe0/c;->a()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;->getUploadBottomSheet()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Laf0/a;->b(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lze0/c$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v3, p0, Laf0/a;->a:Lzr2/a;

    invoke-static {v0, v3}, Lmf0/f;->b(Lcom/whoop/advancedlabs/domain/models/TestInputScreenResponse;Lzr2/a;)Lmf0/g;

    move-result-object v0

    invoke-direct {v1, v2, p1, v0}, Lze0/c$e$a;-><init>(Lze0/c$d;Lze0/c$a;Lmf0/g;)V

    return-object v1
.end method

.method private final f(Lwe0/d;)Lze0/c;
    .locals 10

    invoke-virtual {p1}, Lwe0/d;->b()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;->getTestPreviewScreen()Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;

    move-result-object v0

    new-instance v1, Lze0/c$e$b;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v2

    invoke-direct {p0, v2}, Laf0/a;->d(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;

    move-result-object v2

    invoke-virtual {p1}, Lwe0/d;->b()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;->getUploadBottomSheet()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-direct {p0, v3}, Laf0/a;->b(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lze0/c$a;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;->getCoachFooter()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;->getReuploadButton()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;

    move-result-object v5

    sget-object v6, Lze0/a$c;->a:Lze0/a$c;

    invoke-direct {p0, v5, v6}, Laf0/a;->c(Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;)Lze0/c$b;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestPreviewScreen;->getSaveButton()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;

    move-result-object v0

    sget-object v6, Lze0/a$i;->a:Lze0/a$i;

    invoke-direct {p0, v0, v6}, Laf0/a;->c(Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;)Lze0/c$b;

    move-result-object v6

    invoke-virtual {p1}, Lwe0/d;->a()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Lwe0/d;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p1}, Lwe0/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Laf0/b;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Lze0/c$e$b;-><init>(Lze0/c$d;Lze0/c$a;Ljava/lang/String;Lze0/c$b;Lze0/c$b;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v1
.end method

.method private final g(Lwe0/e;)Lze0/c;
    .locals 8

    invoke-virtual {p1}, Lwe0/e;->a()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;->getTestUploadScreen()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;->getNavigationBar()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;

    move-result-object v1

    invoke-direct {p0, v1}, Laf0/a;->d(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;)Lze0/c$d;

    move-result-object v3

    invoke-virtual {p1}, Lwe0/e;->a()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadResponse;->getUploadBottomSheet()Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Laf0/a;->b(Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadBottomSheet;)Lze0/c$a;

    move-result-object p1

    move-object v4, p1

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;->getSections()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;

    invoke-static {}, Lmd0/c;->z0()Ljb1/a;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    const-string v6, "null cannot be cast to non-null type com.whoop.advancedlabs.view.AdvancedLabsSectionState"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lkf0/k;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;->getFileSelectButton()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;

    move-result-object p1

    const/4 v2, 0x1

    invoke-static {p0, p1, v1, v2, v1}, Laf0/a;->h(Laf0/a;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;ILjava/lang/Object;)Lze0/c$b;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/testupload/domain/models/TestUploadScreen;->getImageSelectButton()Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;

    move-result-object p1

    invoke-static {p0, p1, v1, v2, v1}, Laf0/a;->h(Laf0/a;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;ILjava/lang/Object;)Lze0/c$b;

    move-result-object v7

    new-instance v2, Lze0/c$e$c;

    invoke-direct/range {v2 .. v7}, Lze0/c$e$c;-><init>(Lze0/c$d;Lze0/c$a;Ljava/util/List;Lze0/c$b;Lze0/c$b;)V

    return-object v2
.end method

.method public static synthetic h(Laf0/a;Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;ILjava/lang/Object;)Lze0/c$b;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Laf0/a;->c(Lcom/whoop/advancedlabs/testupload/domain/models/ButtonModel;Lze0/a;)Lze0/c$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lwe0/b;)Lze0/c;
    .locals 14

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwe0/b$b;

    if-eqz v0, :cond_0

    new-instance v1, Lze0/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lze0/c$c;-><init>(Lsz0/q0;Lze0/a;Lze0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lwe0/b$a;

    if-eqz v0, :cond_1

    new-instance p1, Lze0/c$c;

    new-instance v0, Lsz0/p0$b;

    sget v1, Lma0/d;->e:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lma0/d;->d:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v1, Lma0/d;->o:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v1, Lgy0/f;->K:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    move-object v2, v0

    new-instance v0, Lsz0/q0;

    const/16 v11, 0x349

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lze0/a$g;->a:Lze0/a$g;

    sget-object v2, Lze0/a$a;->a:Lze0/a$a;

    invoke-direct {p1, v0, v1, v2}, Lze0/c$c;-><init>(Lsz0/q0;Lze0/a;Lze0/a;)V

    return-object p1

    :cond_1
    instance-of v0, p1, Lwe0/c;

    if-eqz v0, :cond_2

    check-cast p1, Lwe0/c;

    invoke-direct {p0, p1}, Laf0/a;->e(Lwe0/c;)Lze0/c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lwe0/e;

    if-eqz v0, :cond_3

    check-cast p1, Lwe0/e;

    invoke-direct {p0, p1}, Laf0/a;->g(Lwe0/e;)Lze0/c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Lwe0/d;

    if-eqz v0, :cond_4

    check-cast p1, Lwe0/d;

    invoke-direct {p0, p1}, Laf0/a;->f(Lwe0/d;)Lze0/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lwe0/b$c;

    if-eqz v0, :cond_6

    new-instance v1, Lsz0/q0;

    new-instance v2, Lsz0/p0$h;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lma0/d;->p:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/16 v12, 0x3f9

    const/4 v13, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lwe0/b$c;

    invoke-virtual {p1}, Lwe0/b$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lze0/a$e;

    invoke-direct {v0, p1}, Lze0/a$e;-><init>(Lcom/whoop/navigation/e;)V

    :goto_0
    move-object v3, v0

    move-object v2, v1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    new-instance v1, Lze0/c$c;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lze0/c$c;-><init>(Lsz0/q0;Lze0/a;Lze0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_6
    sget-object v0, Lwe0/b$d;->a:Lwe0/b$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance v0, Lze0/c$c;

    new-instance v1, Lsz0/q0;

    new-instance v3, Lsz0/p0$d;

    sget p1, Lma0/d;->u:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    invoke-direct {v3, p1}, Lsz0/p0$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    sget p1, Lma0/d;->q:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/16 v12, 0x3f9

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lze0/c$c;-><init>(Lsz0/q0;Lze0/a;Lze0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
