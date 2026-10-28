.class public final Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/JournalDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfJournalAnsweredDto:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->__insertAdapterOfJournalAnsweredDto:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->lambda$getJournalAnswerLiveData$2(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->lambda$getJournalAnswer$1(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->lambda$saveJournalAnsweredDto$0(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic lambda$getJournalAnswer$1(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    .locals 6

    const-string v0, "SELECT * from table_journal_answers WHERE cycle_id == (?)"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Ltb/c;->p(IJ)V

    const-string p0, "cycle_id"

    invoke-static {p2, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "is_journal_shown"

    invoke-static {p2, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string v1, "is_journal_answered"

    invoke-static {p2, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2, p0}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-interface {p2, p1}, Ltb/c;->getLong(I)J

    move-result-wide p0

    long-to-int p0, p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    invoke-interface {p2, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v1, v4

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, p1

    :goto_1
    new-instance p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    invoke-direct {p1, v2, v3, p0, v0}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;-><init>(JZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_3
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$getJournalAnswerLiveData$2(JLtb/a;)Lcom/whoop/data/local/room/entity/JournalAnsweredDto;
    .locals 6

    const-string v0, "SELECT * from table_journal_answers WHERE cycle_id == (?)"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Ltb/c;->p(IJ)V

    const-string p0, "cycle_id"

    invoke-static {p2, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "is_journal_shown"

    invoke-static {p2, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string v1, "is_journal_answered"

    invoke-static {p2, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2}, Ltb/c;->e1()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2, p0}, Ltb/c;->getLong(I)J

    move-result-wide v2

    invoke-interface {p2, p1}, Ltb/c;->getLong(I)J

    move-result-wide p0

    long-to-int p0, p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    move p0, v0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    invoke-interface {p2, v1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v1, v4

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, p1

    :goto_1
    new-instance p1, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    invoke-direct {p1, v2, v3, p0, v0}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;-><init>(JZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :goto_3
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic lambda$saveJournalAnsweredDto$0(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->__insertAdapterOfJournalAnsweredDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public getJournalAnswer(JLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lai1/b;

    const/4 v2, 0x5

    invoke-direct {v1, p1, p2, v2}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getJournalAnswerLiveData(J)Landroidx/lifecycle/p0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->__db:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    const-string v1, "table_journal_answers"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lai1/b;

    const/4 v3, 0x6

    invoke-direct {v2, p1, p2, v3}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/v;->b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;

    move-result-object p1

    return-object p1
.end method

.method public saveJournalAnsweredDto(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x16

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
