.class public final Lcz1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ:\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0015\u001a\u0004\u0008\u001d\u0010\u0017\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcz1/c;",
        "",
        "",
        "isLoading",
        "isError",
        "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "data",
        "hasAnimationFinishedForThisValue",
        "<init>",
        "(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)V",
        "a",
        "(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)Lcz1/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "f",
        "()Z",
        "b",
        "e",
        "c",
        "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "()Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;",
        "d",
        "milestone-pill-arch-mini_release"
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
.field public static final e:I


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/models/colortheme/ColorThemeModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/celebration/DynamicLottieModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lcz1/c;->e:I

    return-void
.end method

.method public constructor <init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcz1/c;->a:Z

    .line 3
    iput-boolean p2, p0, Lcz1/c;->b:Z

    .line 4
    iput-object p3, p0, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    .line 5
    iput-boolean p4, p0, Lcz1/c;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x1

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcz1/c;-><init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)V

    return-void
.end method

.method public static synthetic b(Lcz1/c;ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;ZILjava/lang/Object;)Lcz1/c;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcz1/c;->a:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcz1/c;->b:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcz1/c;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcz1/c;->a(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)Lcz1/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)Lcz1/c;
    .locals 1

    new-instance v0, Lcz1/c;

    invoke-direct {v0, p1, p2, p3, p4}, Lcz1/c;-><init>(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)V

    return-object v0
.end method

.method public final c()Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;
    .locals 1

    iget-object v0, p0, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcz1/c;->d:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcz1/c;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcz1/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcz1/c;

    iget-boolean v1, p0, Lcz1/c;->a:Z

    iget-boolean v3, p1, Lcz1/c;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcz1/c;->b:Z

    iget-boolean v3, p1, Lcz1/c;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    iget-object v3, p1, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcz1/c;->d:Z

    iget-boolean p1, p1, Lcz1/c;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcz1/c;->a:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcz1/c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcz1/c;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcz1/c;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lcz1/c;->a:Z

    iget-boolean v1, p0, Lcz1/c;->b:Z

    iget-object v2, p0, Lcz1/c;->c:Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;

    iget-boolean v3, p0, Lcz1/c;->d:Z

    const-string v4, ", isError="

    const-string v5, ", data="

    const-string v6, "MilestonePillDomainState(isLoading="

    invoke-static {v6, v4, v5, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasAnimationFinishedForThisValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
