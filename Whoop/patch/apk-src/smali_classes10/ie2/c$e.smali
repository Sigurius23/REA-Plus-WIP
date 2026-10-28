.class final Lie2/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie2/c;->g(Lie2/b;ZZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;"
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
    c = "com.whoop.shepherd.feature.togglesettings.domain.ShepherdToggleSettingsInteractor$updateShepherdSettings$2"
    f = "ShepherdToggleSettingsInteractor.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lie2/c;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Z

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZZLie2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lie2/c;",
            "Lq83/d<",
            "-",
            "Lie2/c$e;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lie2/c$e;->y:Z

    iput-boolean p2, p0, Lie2/c$e;->z:Z

    iput-object p3, p0, Lie2/c$e;->E:Lie2/c;

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

    new-instance v0, Lie2/c$e;

    iget-boolean v1, p0, Lie2/c$e;->y:Z

    iget-boolean v2, p0, Lie2/c$e;->z:Z

    iget-object v3, p0, Lie2/c$e;->E:Lie2/c;

    invoke-direct {v0, v1, v2, v3, p1}, Lie2/c$e;-><init>(ZZLie2/c;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lie2/c$e;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lie2/c$e;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lie2/c$e;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lie2/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lie2/c$e;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lie2/c$e;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;

    iget-boolean v1, p0, Lie2/c$e;->y:Z

    iget-boolean v3, p0, Lie2/c$e;->z:Z

    invoke-direct {p1, v1, v3}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;-><init>(ZZ)V

    iget-object v1, p0, Lie2/c$e;->E:Lie2/c;

    invoke-static {v1}, Lie2/c;->c(Lie2/c;)Lcom/whoop/shepherd/domain/ShepherdApi;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lie2/c$e;->w:Ljava/lang/Object;

    iput v2, p0, Lie2/c$e;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/shepherd/domain/ShepherdApi;->updateShepherdToggleSettings(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
