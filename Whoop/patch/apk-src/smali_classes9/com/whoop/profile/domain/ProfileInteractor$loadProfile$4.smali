.class final Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/ProfileInteractor;->loadProfile()Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;",
        "",
        "exception",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.ProfileInteractor$loadProfile$4"
    f = "ProfileInteractor.kt"
    l = {
        0xe6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/ProfileInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/ProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-direct {v0, v1, p3}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v2, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {v4}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ltr2/n;

    move-result-object v4

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    const-string v7, "Caught exception during data processing"

    invoke-interface {v4, v7, v2, v6}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v2, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;

    new-instance v6, Lcom/whoop/profile/domain/ProfileDomainState;

    sget-object v7, Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$RequestFailed;

    const/16 v16, 0x1fe

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v6 .. v17}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v6}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;-><init>(Lcom/whoop/profile/domain/ProfileDomainState;)V

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$4;->label:I

    invoke-interface {v1, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_2

    return-object v3

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
