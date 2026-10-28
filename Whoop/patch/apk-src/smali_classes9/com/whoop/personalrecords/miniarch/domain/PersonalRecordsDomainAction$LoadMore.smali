.class public final Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;
.super Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LoadMore"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;",
        "startDate",
        "",
        "endDate",
        "nextExerciseOffset",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V",
        "getStartDate",
        "()Ljava/lang/String;",
        "getEndDate",
        "getNextExerciseOffset",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "personal-records-mini-arch_release"
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
.field private final endDate:Ljava/lang/String;

.field private final nextExerciseOffset:Ljava/lang/Integer;

.field private final startDate:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;
    .locals 1

    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEndDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    return-object v0
.end method

.method public final getNextExerciseOffset()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStartDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->startDate:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->endDate:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainAction$LoadMore;->nextExerciseOffset:Ljava/lang/Integer;

    const-string v3, ", endDate="

    const-string v4, ", nextExerciseOffset="

    const-string v5, "LoadMore(startDate="

    invoke-static {v5, v0, v3, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Ld13/a;->k(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
