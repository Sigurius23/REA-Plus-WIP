.class final Lb42/a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb42/a;->e(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lc42/r;",
        "previousViewState",
        "Lz32/b;",
        "currentDomainState",
        "<anonymous>",
        "(Lc42/r;Lz32/b;)Lc42/r;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.pregnancy.reducer.PregnancySettingsViewStateReducer$reduce$1"
    f = "PregnancySettingsViewStateReducer.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lb42/a;


# direct methods
.method public constructor <init>(Lb42/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb42/a;",
            "Lq83/d<",
            "-",
            "Lb42/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lb42/a$a;->z:Lb42/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lc42/r;Lz32/b;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc42/r;",
            "Lz32/b;",
            "Lq83/d<",
            "-",
            "Lc42/r;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lb42/a$a;

    iget-object v1, p0, Lb42/a$a;->z:Lb42/a;

    invoke-direct {v0, v1, p3}, Lb42/a$a;-><init>(Lb42/a;Lq83/d;)V

    iput-object p1, v0, Lb42/a$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lb42/a$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lb42/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc42/r;

    check-cast p2, Lz32/b;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lb42/a$a;->f(Lc42/r;Lz32/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lb42/a$a;->x:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lc42/r;

    iget-object v1, v0, Lb42/a$a;->y:Ljava/lang/Object;

    check-cast v1, Lz32/b;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lb42/a$a;->w:I

    if-nez v3, :cond_8

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lz32/b$f;->a:Lz32/b$f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v4, Lc42/r;

    const/16 v14, 0x1fd

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v15}, Lc42/r;-><init>(ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_0
    instance-of v3, v1, Lz32/b$e;

    if-eqz v3, :cond_1

    iget-object v2, v0, Lb42/a$a;->z:Lb42/a;

    check-cast v1, Lz32/b$e;

    invoke-virtual {v1}, Lz32/b$e;->b()Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    move-result-object v3

    invoke-virtual {v1}, Lz32/b$e;->a()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lb42/a;->b(Lb42/a;Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_1
    instance-of v3, v1, Lz32/b$b;

    if-eqz v3, :cond_2

    iget-object v2, v0, Lb42/a$a;->z:Lb42/a;

    check-cast v1, Lz32/b$b;

    invoke-virtual {v1}, Lz32/b$b;->b()Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    move-result-object v3

    invoke-virtual {v1}, Lz32/b$b;->a()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lb42/a;->b(Lb42/a;Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_2
    sget-object v3, Lz32/b$c;->a:Lz32/b$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v12, 0x1f9

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lc42/r;->b(Lc42/r;ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILjava/lang/Object;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_3
    instance-of v3, v1, Lz32/b$a;

    if-eqz v3, :cond_4

    iget-object v3, v0, Lb42/a$a;->z:Lb42/a;

    check-cast v1, Lz32/b$a;

    invoke-virtual {v1}, Lz32/b$a;->a()Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;

    move-result-object v1

    invoke-static {v3, v1}, Lb42/a;->a(Lb42/a;Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)Lc42/r;

    move-result-object v4

    invoke-virtual {v2}, Lc42/r;->h()Lc42/q;

    move-result-object v10

    const/16 v14, 0x1df

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v4 .. v15}, Lc42/r;->b(Lc42/r;ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILjava/lang/Object;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v3, v1, Lz32/b$d;

    if-eqz v3, :cond_5

    iget-object v2, v0, Lb42/a$a;->z:Lb42/a;

    check-cast v1, Lz32/b$d;

    invoke-virtual {v1}, Lz32/b$d;->c()Lcom/whoop/pregnancy/api/PregnancySettingsDto;

    move-result-object v3

    invoke-virtual {v1}, Lz32/b$d;->b()Lcom/whoop/educationModels/FeatureEducationDto;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lb42/a;->b(Lb42/a;Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)Lc42/r;

    move-result-object v5

    invoke-virtual {v1}, Lz32/b$d;->a()Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;

    move-result-object v1

    new-instance v6, Lc42/e;

    invoke-virtual {v1}, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;->getButton()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {v6 .. v11}, Lc42/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const/16 v15, 0x17f

    const/16 v16, 0x0

    move-object v13, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, Lc42/r;->b(Lc42/r;ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILjava/lang/Object;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_5
    sget-object v3, Lz32/b$h;->a:Lz32/b$h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v12, 0x1f6

    const/4 v13, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lc42/r;->b(Lc42/r;ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILjava/lang/Object;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v1, Lz32/b$g;

    if-eqz v3, :cond_7

    check-cast v1, Lz32/b$g;

    invoke-virtual {v1}, Lz32/b$g;->a()Ljava/lang/String;

    move-result-object v7

    const/16 v12, 0x1e6

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lc42/r;->b(Lc42/r;ZZZZLjava/lang/String;Lc42/q;Lc42/h;Lc42/e;Lc42/g;ILjava/lang/Object;)Lc42/r;

    move-result-object v1

    return-object v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
