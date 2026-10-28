.class public final Lws2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ8\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010#\u001a\u0004\u0008\u001f\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lws2/d;",
        "",
        "Lws2/h;",
        "state",
        "Lws2/g;",
        "progressResult",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;",
        "response",
        "Lsw0/g;",
        "currentBottomSheet",
        "<init>",
        "(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)V",
        "a",
        "(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)Lws2/d;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lws2/h;",
        "f",
        "()Lws2/h;",
        "b",
        "Lws2/g;",
        "d",
        "()Lws2/g;",
        "c",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;",
        "e",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;",
        "Lsw0/g;",
        "()Lsw0/g;",
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
.field private final a:Lws2/h;

.field private final b:Lws2/g;

.field private final c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

.field private final d:Lsw0/g;


# direct methods
.method public constructor <init>(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentBottomSheet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lws2/d;->a:Lws2/h;

    .line 3
    iput-object p2, p0, Lws2/d;->b:Lws2/g;

    .line 4
    iput-object p3, p0, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    .line 5
    iput-object p4, p0, Lws2/d;->d:Lsw0/g;

    return-void
.end method

.method public synthetic constructor <init>(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 6
    sget-object v0, Lws2/h$c;->a:Lws2/h$c;

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_1

    .line 7
    new-instance v2, Lws2/g;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lws2/g;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_2

    .line 8
    new-instance v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    .line 9
    new-instance v3, Ljava/util/UUID;

    const-wide/16 v4, 0x1

    invoke-direct {v3, v4, v5, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    .line 10
    sget-object v4, Lm83/y;->w:Lm83/y;

    .line 11
    invoke-direct {v1, v3, v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;-><init>(Ljava/util/UUID;Ljava/util/List;)V

    goto :goto_2

    :cond_2
    move-object/from16 v1, p3

    :goto_2
    and-int/lit8 v3, p5, 0x8

    if-eqz v3, :cond_3

    .line 12
    new-instance v4, Lsw0/g;

    const/16 v17, 0xfff

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v18}, Lsw0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    move-object/from16 v3, p0

    goto :goto_4

    :cond_3
    move-object/from16 v4, p4

    goto :goto_3

    .line 13
    :goto_4
    invoke-direct {v3, v0, v2, v1, v4}, Lws2/d;-><init>(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)V

    return-void
.end method

.method public static synthetic b(Lws2/d;Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;ILjava/lang/Object;)Lws2/d;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lws2/d;->a:Lws2/h;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lws2/d;->b:Lws2/g;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lws2/d;->d:Lsw0/g;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lws2/d;->a(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)Lws2/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)Lws2/d;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentBottomSheet"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lws2/d;

    invoke-direct {v0, p1, p2, p3, p4}, Lws2/d;-><init>(Lws2/h;Lws2/g;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;Lsw0/g;)V

    return-object v0
.end method

.method public final c()Lsw0/g;
    .locals 1

    iget-object v0, p0, Lws2/d;->d:Lsw0/g;

    return-object v0
.end method

.method public final d()Lws2/g;
    .locals 1

    iget-object v0, p0, Lws2/d;->b:Lws2/g;

    return-object v0
.end method

.method public final e()Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;
    .locals 1

    iget-object v0, p0, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lws2/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lws2/d;

    iget-object v1, p0, Lws2/d;->a:Lws2/h;

    iget-object v3, p1, Lws2/d;->a:Lws2/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lws2/d;->b:Lws2/g;

    iget-object v3, p1, Lws2/d;->b:Lws2/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    iget-object v3, p1, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lws2/d;->d:Lsw0/g;

    iget-object p1, p1, Lws2/d;->d:Lsw0/g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lws2/h;
    .locals 1

    iget-object v0, p0, Lws2/d;->a:Lws2/h;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lws2/d;->a:Lws2/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lws2/d;->b:Lws2/g;

    invoke-virtual {v1}, Lws2/g;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lws2/d;->d:Lsw0/g;

    invoke-virtual {v1}, Lsw0/g;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lws2/d;->a:Lws2/h;

    iget-object v1, p0, Lws2/d;->b:Lws2/g;

    iget-object v2, p0, Lws2/d;->c:Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;

    iget-object v3, p0, Lws2/d;->d:Lsw0/g;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CustomizePlanDomainResult(state="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", progressResult="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentBottomSheet="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
