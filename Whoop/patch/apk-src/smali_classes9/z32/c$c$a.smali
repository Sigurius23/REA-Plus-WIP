.class final Lz32/c$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz32/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$turnOffPregnancyCoaching$1$1"
    f = "PregnancySettingsInteractor.kt"
    l = {
        0x2d,
        0x2e,
        0x2f,
        0x31
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lz32/c;


# direct methods
.method public constructor <init>(Lz32/c;Lec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz32/c;",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lz32/c$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz32/c$c$a;->z:Lz32/c;

    iput-object p2, p0, Lz32/c$c$a;->E:Lec3/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lz32/c$c$a;

    iget-object v1, p0, Lz32/c$c$a;->z:Lz32/c;

    iget-object v2, p0, Lz32/c$c$a;->E:Lec3/m;

    invoke-direct {v0, v1, v2, p1}, Lz32/c$c$a;-><init>(Lz32/c;Lec3/m;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lz32/c$c$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lz32/c$c$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz32/c$c$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lz32/c$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lz32/c$c$a;->y:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lz32/c$c$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-object v0, p0, Lz32/c$c$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lz32/c$c$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz32/c$c$a;->z:Lz32/c;

    invoke-static {p1}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object p1

    iput v5, p0, Lz32/c$c$a;->y:I

    invoke-interface {p1, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->togglePregnancyCoachingOff(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_0
    iget-object p1, p0, Lz32/c$c$a;->z:Lz32/c;

    invoke-static {p1}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object p1

    iput v4, p0, Lz32/c$c$a;->y:I

    invoke-interface {p1, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->getPregnancySettingsBff(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    move-object v1, p1

    check-cast v1, Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    iget-object p1, p0, Lz32/c$c$a;->z:Lz32/c;

    invoke-static {p1}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object p1

    iput-object v1, p0, Lz32/c$c$a;->w:Ljava/lang/Object;

    iput v3, p0, Lz32/c$c$a;->y:I

    invoke-interface {p1, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->getPregnancyEducation(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast p1, Lcom/whoop/educationModels/FeatureEducationDto;

    iget-object v3, p0, Lz32/c$c$a;->E:Lec3/m;

    new-instance v4, Lz32/b$b;

    invoke-direct {v4, v1, p1}, Lz32/b$b;-><init>(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lz32/c$c$a;->w:Ljava/lang/Object;

    iput-object p1, p0, Lz32/c$c$a;->x:Ljava/lang/Object;

    iput v2, p0, Lz32/c$c$a;->y:I

    invoke-interface {v3, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_3
    return-object v0

    :cond_8
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
