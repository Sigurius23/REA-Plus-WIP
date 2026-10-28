.class public final Ltt2/e$c;
.super Ltt2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltt2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0013\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ltt2/e$c;",
        "Ltt2/e;",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
        "result",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "aiContextMetadata",
        "<init>",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V",
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
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
        "b",
        "()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
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
.field private final a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

.field private final b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltt2/e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ltt2/e$c;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    iput-object p2, p0, Ltt2/e$c;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;
    .locals 1

    iget-object v0, p0, Ltt2/e$c;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    return-object v0
.end method

.method public final b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;
    .locals 1

    iget-object v0, p0, Ltt2/e$c;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltt2/e$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ltt2/e$c;

    iget-object v1, p0, Ltt2/e$c;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    iget-object v3, p1, Ltt2/e$c;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ltt2/e$c;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    iget-object p1, p1, Ltt2/e$c;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ltt2/e$c;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ltt2/e$c;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Ltt2/e$c;->a:Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    iget-object v1, p0, Ltt2/e$c;->b:Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Success(result="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiContextMetadata="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
