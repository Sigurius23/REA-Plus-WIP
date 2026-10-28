.class public final Lbm1/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbm1/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbm1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ<\u0010\n\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008\u001e\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lbm1/c$d;",
        "Lbm1/c;",
        "Lcom/whoop/home/domain/models/StreakMetadata;",
        "currentStreakData",
        "previousStreakData",
        "",
        "hasAnimationFinishedForThisValue",
        "isInTestVariantStreaksAnimation",
        "<init>",
        "(Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZ)V",
        "a",
        "(Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZ)Lbm1/c$d;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/home/domain/models/StreakMetadata;",
        "c",
        "()Lcom/whoop/home/domain/models/StreakMetadata;",
        "b",
        "e",
        "Z",
        "d",
        "()Z",
        "f",
        "home_release"
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
.field private final a:Lcom/whoop/home/domain/models/StreakMetadata;

.field private final b:Lcom/whoop/home/domain/models/StreakMetadata;

.field private final c:Z

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lbm1/c$d;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    iput-object p2, p0, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    iput-boolean p3, p0, Lbm1/c$d;->c:Z

    iput-boolean p4, p0, Lbm1/c$d;->d:Z

    return-void
.end method

.method public static synthetic b(Lbm1/c$d;Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZILjava/lang/Object;)Lbm1/c$d;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lbm1/c$d;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lbm1/c$d;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lbm1/c$d;->a(Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZ)Lbm1/c$d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZ)Lbm1/c$d;
    .locals 1

    new-instance v0, Lbm1/c$d;

    invoke-direct {v0, p1, p2, p3, p4}, Lbm1/c$d;-><init>(Lcom/whoop/home/domain/models/StreakMetadata;Lcom/whoop/home/domain/models/StreakMetadata;ZZ)V

    return-object v0
.end method

.method public final c()Lcom/whoop/home/domain/models/StreakMetadata;
    .locals 1

    iget-object v0, p0, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lbm1/c$d;->c:Z

    return v0
.end method

.method public final e()Lcom/whoop/home/domain/models/StreakMetadata;
    .locals 1

    iget-object v0, p0, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbm1/c$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbm1/c$d;

    iget-object v1, p0, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    iget-object v3, p1, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    iget-object v3, p1, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lbm1/c$d;->c:Z

    iget-boolean v3, p1, Lbm1/c$d;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lbm1/c$d;->d:Z

    iget-boolean p1, p1, Lbm1/c$d;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lbm1/c$d;->d:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/home/domain/models/StreakMetadata;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/home/domain/models/StreakMetadata;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lbm1/c$d;->c:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lbm1/c$d;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lbm1/c$d;->a:Lcom/whoop/home/domain/models/StreakMetadata;

    iget-object v1, p0, Lbm1/c$d;->b:Lcom/whoop/home/domain/models/StreakMetadata;

    iget-boolean v2, p0, Lbm1/c$d;->c:Z

    iget-boolean v3, p0, Lbm1/c$d;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Result(currentStreakData="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", previousStreakData="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hasAnimationFinishedForThisValue="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isInTestVariantStreaksAnimation="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
