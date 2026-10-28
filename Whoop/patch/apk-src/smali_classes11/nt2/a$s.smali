.class public final Lnt2/a$s;
.super Lnt2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnt2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lnt2/a$s;",
        "Lnt2/a;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "targetGoalType",
        "",
        "value",
        "<init>",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "b",
        "D",
        "()D",
        "weekly-plan_release"
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
.field private final a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

.field private final b:D


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V
    .locals 1

    const-string v0, "targetGoalType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnt2/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lnt2/a$s;->a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iput-wide p2, p0, Lnt2/a$s;->b:D

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
    .locals 1

    iget-object v0, p0, Lnt2/a$s;->a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-object v0
.end method

.method public final b()D
    .locals 2

    iget-wide v0, p0, Lnt2/a$s;->b:D

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnt2/a$s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnt2/a$s;

    iget-object v1, p0, Lnt2/a$s;->a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v3, p1, Lnt2/a$s;->a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lnt2/a$s;->b:D

    iget-wide v5, p1, Lnt2/a$s;->b:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lnt2/a$s;->a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lnt2/a$s;->b:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lnt2/a$s;->a:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-wide v1, p0, Lnt2/a$s;->b:D

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "UpdateSliderValue(targetGoalType="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", value="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
