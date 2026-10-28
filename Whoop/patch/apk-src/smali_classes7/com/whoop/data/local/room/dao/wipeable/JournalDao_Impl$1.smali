.class Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl$1;->this$0:Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bind(Ltb/c;Lcom/whoop/data/local/room/entity/JournalAnsweredDto;)V
    .locals 4

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->getCycleId()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    .line 3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalShown()Z

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    .line 4
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 5
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;->isJournalAnswered()Z

    move-result p2

    const/4 v0, 0x3

    int-to-long v1, p2

    .line 6
    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/whoop/data/local/room/entity/JournalAnsweredDto;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/JournalDao_Impl$1;->bind(Ltb/c;Lcom/whoop/data/local/room/entity/JournalAnsweredDto;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `table_journal_answers` (`cycle_id`,`is_journal_shown`,`is_journal_answered`) VALUES (?,?,?)"

    return-object v0
.end method
