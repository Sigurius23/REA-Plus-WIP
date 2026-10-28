.class final Lz32/c$e$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz32/c$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1$1$1"
    f = "PregnancySettingsInteractor.kt"
    l = {
        0x46,
        0x47,
        0x4a,
        0x4b,
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lz32/c;

.field final synthetic F:Z

.field final synthetic G:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lz32/c;ZLec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz32/c;",
            "Z",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lz32/c$e$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz32/c$e$a$a;->E:Lz32/c;

    iput-boolean p2, p0, Lz32/c$e$a$a;->F:Z

    iput-object p3, p0, Lz32/c$e$a$a;->G:Lec3/m;

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

    new-instance v0, Lz32/c$e$a$a;

    iget-object v1, p0, Lz32/c$e$a$a;->E:Lz32/c;

    iget-boolean v2, p0, Lz32/c$e$a$a;->F:Z

    iget-object v3, p0, Lz32/c$e$a$a;->G:Lec3/m;

    invoke-direct {v0, v1, v2, v3, p1}, Lz32/c$e$a$a;-><init>(Lz32/c;ZLec3/m;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lz32/c$e$a$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lz32/c$e$a$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz32/c$e$a$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lz32/c$e$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lz32/c$e$a$a;->z:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lz32/c$e$a$a;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;

    :goto_0
    iget-object v0, p0, Lz32/c$e$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-object v0, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-object v1, p0, Lz32/c$e$a$a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-object v2, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz32/c$e$a$a;->E:Lz32/c;

    invoke-static {p1}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object p1

    iput v6, p0, Lz32/c$e$a$a;->z:I

    invoke-interface {p1, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->getPregnancySettingsBff(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    check-cast p1, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    iget-object v1, p0, Lz32/c$e$a$a;->E:Lz32/c;

    invoke-static {v1}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object v1

    iput-object p1, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    iput v5, p0, Lz32/c$e$a$a;->z:I

    invoke-interface {v1, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->getPregnancyEducation(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    goto :goto_4

    :cond_7
    move-object v8, v1

    move-object v1, p1

    move-object p1, v8

    :goto_2
    check-cast p1, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-boolean v5, p0, Lz32/c$e$a$a;->F:Z

    if-eqz v5, :cond_9

    iget-object v2, p0, Lz32/c$e$a$a;->E:Lz32/c;

    invoke-static {v2}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object v2

    iput-object v1, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    iput-object p1, p0, Lz32/c$e$a$a;->x:Ljava/lang/Object;

    iput v4, p0, Lz32/c$e$a$a;->z:I

    invoke-interface {v2, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->onboardingDueDateSaved(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_8

    goto :goto_4

    :cond_8
    move-object v8, v1

    move-object v1, p1

    move-object p1, v2

    move-object v2, v8

    :goto_3
    check-cast p1, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;

    iget-object v4, p0, Lz32/c$e$a$a;->G:Lec3/m;

    new-instance v5, Lz32/b$d;

    invoke-direct {v5, p1, v2, v1}, Lz32/b$d;-><init>(Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)V

    iput-object v7, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lz32/c$e$a$a;->x:Ljava/lang/Object;

    iput-object v7, p0, Lz32/c$e$a$a;->y:Ljava/lang/Object;

    iput v3, p0, Lz32/c$e$a$a;->z:I

    invoke-interface {v4, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_4

    :cond_9
    iget-object v3, p0, Lz32/c$e$a$a;->G:Lec3/m;

    new-instance v4, Lz32/b$e;

    invoke-direct {v4, v1, p1}, Lz32/b$e;-><init>(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)V

    iput-object v7, p0, Lz32/c$e$a$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Lz32/c$e$a$a;->x:Ljava/lang/Object;

    iput v2, p0, Lz32/c$e$a$a;->z:I

    invoke-interface {v3, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_4
    return-object v0

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
