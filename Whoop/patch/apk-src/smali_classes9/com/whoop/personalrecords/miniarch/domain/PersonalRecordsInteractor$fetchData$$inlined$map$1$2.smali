.class public final Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic $parsedPath$inlined:La12/a;

.field final synthetic $this_unsafeFlow:Lec3/m;

.field final synthetic this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;La12/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    iput-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    iput-object p3, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;->$parsedPath$inlined:La12/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;

    iget v1, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;->$this_unsafeFlow:Lec3/m;

    check-cast p1, Lu02/g;

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    iget-object v4, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2;->$parsedPath$inlined:La12/a;

    invoke-virtual {v4}, La12/a;->c()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, p1, v4, v5}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->access$handleApiResult(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Lu02/g;Ljava/lang/String;Z)Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    move-result-object p1

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->I$0:I

    iput v3, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$fetchData$$inlined$map$1$2$1;->label:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
