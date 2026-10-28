.class final Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/ProfileInteractor;->profileStateFlow(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/profile/domain/ProfileDomainState;",
        "state",
        "showSettingsButton",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.ProfileInteractor$profileStateFlow$1"
    f = "ProfileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/profile/domain/ProfileDomainState;ZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/ProfileDomainState;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileDomainState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;

    invoke-direct {v0, p3}, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->L$0:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->Z$0:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/profile/domain/ProfileDomainState;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->invoke(Lcom/whoop/profile/domain/ProfileDomainState;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/domain/ProfileDomainState;

    iget-boolean v10, p0, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->Z$0:Z

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$profileStateFlow$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/16 v11, 0xff

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v12}, Lcom/whoop/profile/domain/ProfileDomainState;->copy$default(Lcom/whoop/profile/domain/ProfileDomainState;Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILjava/lang/Object;)Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
