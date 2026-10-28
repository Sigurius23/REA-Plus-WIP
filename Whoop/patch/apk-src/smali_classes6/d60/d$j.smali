.class final Ld60/d$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld60/d;->n(Ld60/d$a;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.access.reconfirmlabs.domain.ReconfirmLabsInteractor$upload$response$1"
    f = "ReconfirmLabsInteractor.kt"
    l = {
        0xa8
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ld60/d;

.field final synthetic y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lud3/i0;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic z:Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;


# direct methods
.method public constructor <init>(Ld60/d;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld60/d;",
            "Ljava/util/List<",
            "Lud3/i0;",
            ">;",
            "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;",
            "Lq83/d<",
            "-",
            "Ld60/d$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ld60/d$j;->x:Ld60/d;

    iput-object p2, p0, Ld60/d$j;->y:Ljava/util/List;

    iput-object p3, p0, Ld60/d$j;->z:Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ld60/d$j;

    iget-object v1, p0, Ld60/d$j;->x:Ld60/d;

    iget-object v2, p0, Ld60/d$j;->y:Ljava/util/List;

    iget-object v3, p0, Ld60/d$j;->z:Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;

    invoke-direct {v0, v1, v2, v3, p1}, Ld60/d$j;-><init>(Ld60/d;Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ld60/d$j;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Ld60/d$j;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld60/d$j;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld60/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld60/d$j;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld60/d$j;->x:Ld60/d;

    invoke-static {p1}, Ld60/d;->e(Ld60/d;)Lcom/whoop/labfileupload/domain/LabFileUploadApi;

    move-result-object p1

    iget-object v1, p0, Ld60/d$j;->y:Ljava/util/List;

    iget-object v3, p0, Ld60/d$j;->z:Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;

    iput v2, p0, Ld60/d$j;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/labfileupload/domain/LabFileUploadApi;->uploadAccessFiles(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
