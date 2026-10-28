.class public abstract Ldu2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "educationName",
        "a",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "b",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;",
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
.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "educationName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "EXERCISE_PROGRESS_EDUCATION_1RM_ELIGIBLE"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "exercise_progress_1rm_eligible"

    return-object p0

    :cond_0
    const-string v0, "EXERCISE_PROGRESS_EDUCATION_1RM_INELIGIBLE"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "exercise_progress_1rm_ineligible"

    return-object p0

    :cond_1
    const-string p0, "exercise_progress"

    return-object p0
.end method

.method public static final b(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/navigation/FeatureEducationModel;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Lcom/whoop/navigation/FeatureEducationModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/FeatureEducationModel;->getFeatureEducationName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldu2/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/navigation/FeatureEducationModel;->copy$default(Lcom/whoop/navigation/FeatureEducationModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/FeatureEducationModel;

    move-result-object p0

    :cond_0
    return-object p0
.end method
