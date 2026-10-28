.class public final Lr32/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lr32/b;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;",
        "Lq32/d;",
        "b",
        "(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;)Lq32/d;",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;",
        "c",
        "(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;)Lq32/d;",
        "domainResult",
        "a",
        "Ljb1/a;",
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
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lr32/b;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr32/b;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lr32/c;->c()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lr32/b;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final b(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;)Lq32/d;
    .locals 8

    instance-of v0, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$Loading;

    if-eqz v0, :cond_0

    new-instance v1, Lq32/d;

    new-instance v2, Lq32/d$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->a()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lq32/d$a;-><init>(Le31/c;Lq32/a;Lq32/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lq32/d;-><init>(Lq32/d$a;Lq32/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$NetworkError;

    if-eqz v0, :cond_1

    new-instance v1, Lq32/d;

    new-instance v2, Lq32/d$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->b()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lq32/d$a;-><init>(Le31/c;Lq32/a;Lq32/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v6}, Lq32/d;-><init>(Lq32/d$a;Lq32/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;

    if-eqz v0, :cond_2

    new-instance v1, Lq32/d;

    new-instance v2, Lq32/d$a;

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->c()Le31/c;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lq32/d$a;-><init>(Le31/c;Lq32/a;Lq32/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lq32/a$c;

    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;

    invoke-virtual {p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lq32/a$c;-><init>(Ljava/lang/String;)V

    new-instance v5, Lq32/a$c;

    invoke-virtual {p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$RequestFailed;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v5, p1}, Lq32/a$c;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x1

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Lq32/d$a;->b(Lq32/d$a;Le31/c;Lq32/a;Lq32/a;ILjava/lang/Object;)Lq32/d$a;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lq32/d;-><init>(Lq32/d$a;Lq32/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of p1, p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$Success;

    if-eqz p1, :cond_3

    new-instance v0, Lq32/d;

    new-instance v1, Lq32/d$a;

    sget-object p1, Le31/d;->a:Le31/d;

    invoke-virtual {p1}, Le31/d;->d()Le31/c;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lq32/d$a;-><init>(Le31/c;Lq32/a;Lq32/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lq32/d;-><init>(Lq32/d$a;Lq32/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final c(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;)Lq32/d;
    .locals 16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getResponse()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getTiles()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;

    new-instance v3, Ls32/a;

    new-instance v4, Lq32/b$a;

    invoke-virtual {v2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;->getExerciseId()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    if-nez v5, :cond_0

    move-object v5, v6

    :cond_0
    invoke-direct {v4, v5}, Lq32/b$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;->getName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v5, v6

    :cond_1
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;->getVolumeInputValue()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    move-object v7, v6

    :cond_2
    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;->getVolumeInputUnit()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    move-object v8, v6

    :cond_3
    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Lkd1/o$c;

    invoke-virtual {v2}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsExerciseDto;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    move-object v10, v6

    goto :goto_1

    :cond_4
    move-object v10, v2

    :goto_1
    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    invoke-direct/range {v3 .. v8}, Ls32/a;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    :goto_2
    move-object v3, v1

    goto :goto_3

    :cond_6
    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_2

    :goto_3
    new-instance v0, Lq32/d;

    new-instance v2, Lq32/d$b;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getResponse()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getShowMore()Z

    move-result v1

    :goto_4
    move v4, v1

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    goto :goto_4

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getResponse()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v1

    const/4 v9, 0x0

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getNextExerciseOffset()Ljava/lang/Integer;

    move-result-object v1

    move-object v5, v1

    goto :goto_6

    :cond_8
    move-object v5, v9

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getResponse()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getNextEndDate()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_7

    :cond_9
    move-object v6, v9

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getResponse()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getNextStartDate()Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_8

    :cond_a
    move-object v7, v9

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->isLoadingMore()Z

    move-result v8

    invoke-direct/range {v2 .. v8}, Lq32/d$b;-><init>(Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getResponse()Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;->getAnalyticsAction()Ljava/lang/String;

    move-result-object v9

    :cond_b
    move-object v7, v9

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object v4, v0

    move-object v6, v2

    invoke-direct/range {v4 .. v9}, Lq32/d;-><init>(Lq32/d$a;Lq32/d$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method


# virtual methods
.method public final a(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;)Lq32/d;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getCurrentDialogType()Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;->getCurrentDialogType()Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;

    move-result-object p1

    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;

    invoke-direct {p0, p1}, Lr32/b;->b(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType$MiniArchModal;)Lq32/d;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lr32/b;->c(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;)Lq32/d;

    move-result-object p1

    return-object p1
.end method
