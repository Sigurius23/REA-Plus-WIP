.class final Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$this$flow:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$2;->$$this$flow:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$2;->$$this$flow:Lec3/m;

    invoke-interface {v0, p1, p2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$2;->emit(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
