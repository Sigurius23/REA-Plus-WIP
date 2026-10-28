.class public abstract Luu2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0002*\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcu2/b;",
        "entryPointType",
        "",
        "analyticsEntryPoint",
        "e",
        "(Lcu2/b;Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;",
        "d",
        "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;",
        "c",
        "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Ljava/lang/String;",
        "openSource",
        "requestedExerciseId",
        "Luu2/m;",
        "a",
        "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;)Luu2/m;",
        "context",
        "",
        "",
        "b",
        "(Luu2/m;)Ljava/util/Map;",
        "Lfi0/a;",
        "Ll83/a0;",
        "f",
        "(Lfi0/a;Luu2/m;)V",
        "g",
        "weightlifting_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;)Luu2/m;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "openSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestedExerciseId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Luu2/n;->d(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getExerciseId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v2

    goto :goto_2

    :cond_2
    :goto_1
    move-object v4, p2

    :goto_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getVolumeInputFormat()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    move-object p2, v1

    :goto_3
    const-string v2, ""

    if-nez p2, :cond_4

    move-object p2, v2

    :cond_4
    invoke-static {p0}, Luu2/n;->c(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string p1, "Workout Builder"

    :cond_5
    move-object v6, p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_6

    move-object v7, v2

    goto :goto_4

    :cond_6
    move-object v7, p2

    :goto_4
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;->getEquipmentBody()Ljava/lang/String;

    move-result-object v1

    :cond_7
    if-nez v1, :cond_8

    move-object v8, v2

    goto :goto_5

    :cond_8
    move-object v8, v1

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getEmptyStateCard()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    if-eqz p0, :cond_9

    const/4 p0, 0x1

    :goto_6
    move v9, p0

    goto :goto_7

    :cond_9
    const/4 p0, 0x0

    goto :goto_6

    :goto_7
    new-instance v3, Luu2/m;

    invoke-direct/range {v3 .. v9}, Luu2/m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v3
.end method

.method public static final b(Luu2/m;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luu2/m;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Luu2/m;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "exercise_name"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Luu2/m;->f()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "source"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Luu2/m;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v4, "exercise_type"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Luu2/m;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "equipment"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Luu2/m;->a()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-instance v0, Ll83/k;

    const-string v5, "empty_data"

    invoke-direct {v0, v5, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3, v4, v0}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getHeader()Lcom/whoop/design/models/items/CollapsableHeaderModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CollapsableHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, ""

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getHeader()Lcom/whoop/design/models/items/CollapsableHeaderModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CollapsableHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    return-object v0

    :cond_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static final d(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getContent()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;

    return-object p0
.end method

.method public static final e(Lcu2/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "entryPointType"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lcu2/b;->INTERNAL:Lcu2/b;

    if-ne p0, p1, :cond_2

    const-string p0, "Workout Builder"

    return-object p0

    :cond_2
    const-string p0, "external"

    return-object p0
.end method

.method public static final f(Lfi0/a;Luu2/m;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Luu2/m;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Workout Builder"

    invoke-static {p1}, Luu2/n;->b(Luu2/m;)Ljava/util/Map;

    move-result-object v6

    const-string v2, "Exercise Details"

    const-string v3, "Open"

    move-object v1, p0

    invoke-interface/range {v1 .. v6}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static final g(Lfi0/a;Luu2/m;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Luu2/n;->b(Luu2/m;)Ljava/util/Map;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "source"

    const-string v2, "exercise_details"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v8

    const-string v4, "Exercise Details"

    const-string v5, "Open WCE"

    const-string v6, ""

    const-string v7, "Workout Builder"

    move-object v3, p0

    invoke-interface/range {v3 .. v8}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
