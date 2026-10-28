.class public final Lnv2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lnv2/d;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;",
        "",
        "path",
        "Lnv2/c;",
        "b",
        "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;Ljava/lang/String;)Lnv2/c;",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;",
        "c",
        "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;)Lnv2/c;",
        "domainState",
        "a",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;Ljava/lang/String;)Lnv2/c;
    .locals 8

    instance-of v0, p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$Loading;

    if-eqz v0, :cond_0

    new-instance v1, Lnv2/c;

    new-instance v2, Lnv2/c$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lnv2/c$a;-><init>(Le31/c;Lnv2/a;Lnv2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lnv2/c;-><init>(Lnv2/c$a;Lnv2/c$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$NetworkError;

    if-eqz v0, :cond_1

    new-instance v1, Lnv2/c;

    new-instance v2, Lnv2/c$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->b()Le31/c;

    move-result-object v3

    new-instance v4, Lnv2/a$b;

    invoke-direct {v4, p2}, Lnv2/a$b;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lnv2/c$a;-><init>(Le31/c;Lnv2/a;Lnv2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lnv2/c;-><init>(Lnv2/c$a;Lnv2/c$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of p1, p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$RequestFailed;

    if-eqz p1, :cond_2

    new-instance v0, Lnv2/c;

    new-instance v1, Lnv2/c$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->c()Le31/c;

    move-result-object p1

    new-instance v2, Lnv2/a$b;

    invoke-direct {v2, p2}, Lnv2/a$b;-><init>(Ljava/lang/String;)V

    new-instance v3, Lnv2/a$b;

    invoke-direct {v3, p2}, Lnv2/a$b;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, p1, v2, v3}, Lnv2/c$a;-><init>(Le31/c;Lnv2/a;Lnv2/a;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lnv2/c;-><init>(Lnv2/c$a;Lnv2/c$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;)Lnv2/c;
    .locals 9

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getResponse()Ljava/util/List;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_2

    new-instance v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$RequestFailed;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getPath()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v2, v1

    :cond_0
    invoke-direct {v0, v2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$RequestFailed;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getPath()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-direct {p0, v0, v1}, Lnv2/d;->b(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;Ljava/lang/String;)Lnv2/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Lnv2/c;

    new-instance v2, Lnv2/c$b;

    new-instance v3, Lov2/a;

    invoke-static {}, Lnv2/e;->a()Ljb1/a;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getResponse()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getNextStartDate()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->isLoadingMore()Z

    move-result v5

    if-nez v5, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->isLoadingMore()Z

    move-result v6

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getNextStartDate()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getPath()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5

    move-object v8, v1

    :cond_5
    invoke-direct/range {v3 .. v8}, Lov2/a;-><init>(Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lnv2/c$b;-><init>(Lov2/a;)V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getAnalyticsActionFromApi()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v5}, Lnv2/c;-><init>(Lnv2/c$a;Lnv2/c$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;)Lnv2/c;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getCurrentDialogType()Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getCurrentDialogType()Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getPath()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {p0, v0, p1}, Lnv2/d;->b(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$FullScreenModal;Ljava/lang/String;)Lnv2/c;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lnv2/d;->c(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;)Lnv2/c;

    move-result-object p1

    return-object p1
.end method
