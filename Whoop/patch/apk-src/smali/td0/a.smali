.class public final Ltd0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ltd0/a;",
        "",
        "Ljb1/a;",
        "designItemReducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lpd0/b;",
        "domainResult",
        "Lrd0/c;",
        "a",
        "(Lpd0/b;)Lrd0/c;",
        "Ljb1/a;",
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


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Ltd0/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltd0/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-static {p1, p3, p1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ltd0/a;-><init>(Ljb1/a;)V

    return-void
.end method


# virtual methods
.method public final a(Lpd0/b;)Lrd0/c;
    .locals 11

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpd0/b$b;

    if-eqz v0, :cond_0

    new-instance v1, Lrd0/c;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lrd0/c;-><init>(ZZLsd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lpd0/b$a;

    if-eqz v0, :cond_1

    new-instance v1, Lrd0/c;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lrd0/c;-><init>(ZZLsd0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lpd0/b$c;

    if-eqz v0, :cond_3

    check-cast p1, Lpd0/b$c;

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getAnalyticsName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getAnalyticsActionName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getAnalyticsCategory()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getItems()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Ltd0/a;->a:Ljb1/a;

    invoke-virtual {v1, v0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getCtaText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lpd0/b$c;->a()Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    new-instance v1, Lsd0/a;

    invoke-direct/range {v1 .. v10}, Lsd0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    new-instance p1, Lrd0/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, v1}, Lrd0/c;-><init>(ZZLsd0/a;)V

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
