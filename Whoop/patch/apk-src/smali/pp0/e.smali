.class public final Lpp0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpp0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0014B\u001d\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\r\u001a\u00020\u000c2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpp0/e;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(La6/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "",
        "Lcom/whoop/common/network/model/GarmentItemDto;",
        "garmentsList",
        "Lsp0/j;",
        "b",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "strapLocationId",
        "Ll83/a0;",
        "c",
        "(ILq83/d;)Ljava/lang/Object;",
        "a",
        "La6/g;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "add-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lpp0/e$a;

.field public static final d:I

.field private static final e:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpp0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpp0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpp0/e;->c:Lpp0/e$a;

    const/16 v0, 0x8

    sput v0, Lpp0/e;->d:I

    const-string v0, "strapLocationOnBodyId"

    invoke-static {v0}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lpp0/e;->e:Lf6/d;

    return-void
.end method

.method public constructor <init>(La6/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp0/e;->a:La6/g;

    iput-object p2, p0, Lpp0/e;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static final synthetic a()Lf6/d;
    .locals 1

    sget-object v0, Lpp0/e;->e:Lf6/d;

    return-object v0
.end method


# virtual methods
.method public final b(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/common/network/model/GarmentItemDto;",
            ">;",
            "Lq83/d<",
            "-",
            "Lsp0/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lpp0/e$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lpp0/e$b;

    iget v1, v0, Lpp0/e$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpp0/e$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpp0/e$b;

    invoke-direct {v0, p0, p2}, Lpp0/e$b;-><init>(Lpp0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lpp0/e$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpp0/e$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lpp0/e$b;->w:Ljava/lang/Object;

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

    iget-object p2, p0, Lpp0/e;->a:La6/g;

    invoke-interface {p2}, La6/g;->getData()Lec3/l;

    move-result-object p2

    iput-object p1, v0, Lpp0/e$b;->w:Ljava/lang/Object;

    iput v3, v0, Lpp0/e$b;->z:I

    invoke-static {p2, v0}, Lec3/v;->C(Lec3/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lf6/f;

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    sget-object v1, Lpp0/e;->e:Lf6/d;

    invoke-virtual {p2, v1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_2

    :cond_4
    move p2, v0

    :goto_2
    iget-object v1, p0, Lpp0/e;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "add-activity-remember-strap-location"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/whoop/common/network/model/GarmentItemDto;

    invoke-virtual {v4}, Lcom/whoop/common/network/model/GarmentItemDto;->getId()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, p2, :cond_5

    goto :goto_4

    :cond_7
    move-object v1, v3

    :goto_4
    check-cast v1, Lcom/whoop/common/network/model/GarmentItemDto;

    new-instance p1, Lsp0/j;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/whoop/common/network/model/GarmentItemDto;->getId()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/common/network/model/GarmentItemDto;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lsp0/j;-><init>(ILcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_9
    invoke-direct {p1, v0, v3, v2, v3}, Lsp0/j;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_a
    new-instance p1, Lsp0/j;

    invoke-direct {p1, v0, v3, v2, v3}, Lsp0/j;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final c(ILq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lpp0/e;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "add-activity-remember-strap-location"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpp0/e;->a:La6/g;

    new-instance v2, Lpp0/e$c;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Lpp0/e$c;-><init>(ILq83/d;)V

    invoke-static {v0, v2, p2}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1
.end method
