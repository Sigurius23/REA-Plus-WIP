.class public final Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u000cJ\u0010\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001a\u001a\u0004\u0008\u001c\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u000fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001f\u001a\u0004\u0008 \u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;",
        "",
        "",
        "title",
        "subtitle",
        "",
        "referralsCount",
        "Lkd1/o;",
        "referralsImg",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "()Lkd1/o;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "I",
        "getReferralsCount",
        "Lkd1/o;",
        "getReferralsImg",
        "profile_release"
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
.field public static final $stable:I


# instance fields
.field private final referralsCount:I

.field private final referralsImg:Lkd1/o;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lkd1/o;->a:I

    sput v0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referralsImg"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    iput-object p4, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;Ljava/lang/String;Ljava/lang/String;ILkd1/o;ILjava/lang/Object;)Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->copy(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    return v0
.end method

.method public final component4()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referralsImg"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;

    iget-object v1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    iget v3, p1, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    iget-object p1, p1, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getReferralsCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    return v0
.end method

.method public final getReferralsImg()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->subtitle:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsCount:I

    iget-object v3, p0, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;->referralsImg:Lkd1/o;

    const-string v4, ", subtitle="

    const-string v5, ", referralsCount="

    const-string v6, "ReferralsTileHeaderViewState(title="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", referralsImg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
