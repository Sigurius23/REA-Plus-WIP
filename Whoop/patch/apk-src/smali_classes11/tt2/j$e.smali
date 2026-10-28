.class public final Ltt2/j$e;
.super Ltt2/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltt2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001a\u001a\u0004\u0008\u0014\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ltt2/j$e;",
        "Ltt2/j;",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;",
        "result",
        "",
        "date",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "aiContextMetadata",
        "<init>",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V",
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
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;",
        "c",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;",
        "b",
        "Ljava/lang/String;",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
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
.field private final a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltt2/j;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ltt2/j$e;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    iput-object p2, p0, Ltt2/j$e;->b:Ljava/lang/String;

    iput-object p3, p0, Ltt2/j$e;->c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;
    .locals 1

    iget-object v0, p0, Ltt2/j$e;->c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltt2/j$e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;
    .locals 1

    iget-object v0, p0, Ltt2/j$e;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltt2/j$e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltt2/j$e;

    iget-object v1, p0, Ltt2/j$e;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    iget-object v3, p1, Ltt2/j$e;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ltt2/j$e;->b:Ljava/lang/String;

    iget-object v3, p1, Ltt2/j$e;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ltt2/j$e;->c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    iget-object p1, p1, Ltt2/j$e;->c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ltt2/j$e;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltt2/j$e;->b:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltt2/j$e;->c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ltt2/j$e;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    iget-object v1, p0, Ltt2/j$e;->b:Ljava/lang/String;

    iget-object v2, p0, Ltt2/j$e;->c:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Updating(result="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", date="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", aiContextMetadata="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
