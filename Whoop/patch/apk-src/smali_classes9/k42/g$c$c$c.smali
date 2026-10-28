.class final Lk42/g$c$c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk42/g$c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/whoop/privacyconsent/api/DataSharingResponse;",
        "dataSharingResponse",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/privacyconsent/api/DataSharingResponse;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.privacyconsent.interactor.PrivacyConsentInteractor$getSettingsAndDataSharing$1$3$3"
    f = "PrivacyConsentInteractor.kt"
    l = {
        0x69
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic z:Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;",
            "Lq83/d<",
            "-",
            "Lk42/g$c$c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lk42/g$c$c$c;->y:Lec3/m;

    iput-object p2, p0, Lk42/g$c$c$c;->z:Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lk42/g$c$c$c;

    iget-object v1, p0, Lk42/g$c$c$c;->y:Lec3/m;

    iget-object v2, p0, Lk42/g$c$c$c;->z:Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;

    invoke-direct {v0, v1, v2, p2}, Lk42/g$c$c$c;-><init>(Lec3/m;Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;Lq83/d;)V

    iput-object p1, v0, Lk42/g$c$c$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lcom/whoop/privacyconsent/api/DataSharingResponse;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/privacyconsent/api/DataSharingResponse;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lk42/g$c$c$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lk42/g$c$c$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lk42/g$c$c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/privacyconsent/api/DataSharingResponse;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lk42/g$c$c$c;->f(Lcom/whoop/privacyconsent/api/DataSharingResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lk42/g$c$c$c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/privacyconsent/api/DataSharingResponse;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lk42/g$c$c$c;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lk42/g$c$c$c;->y:Lec3/m;

    new-instance v2, Lk42/g$a$e;

    iget-object v4, p0, Lk42/g$c$c$c;->z:Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;

    invoke-direct {v2, v4, v0}, Lk42/g$a$e;-><init>(Lcom/whoop/privacyconsent/api/PrivacyConsentSettingsResponse;Lcom/whoop/privacyconsent/api/DataSharingResponse;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lk42/g$c$c$c;->x:Ljava/lang/Object;

    iput v3, p0, Lk42/g$c$c$c;->w:I

    invoke-interface {p1, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
