.class final Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/LanguageRepository;->setAppLocaleList(Ljava/util/List;Ljava/lang/String;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1"
    f = "LanguageRepository.kt"
    l = {
        0x19b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $locales:Lb5/g;

.field final synthetic $newLanguage:Ljava/lang/String;

.field final synthetic $oldLanguage:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/LanguageRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/LanguageRepository;Lb5/g;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/LanguageRepository;",
            "Lb5/g;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$locales:Lb5/g;

    iput-object p3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$newLanguage:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$oldLanguage:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$locales:Lb5/g;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$newLanguage:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$oldLanguage:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lb5/g;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$0:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->label:I

    const/4 v7, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v7, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lbc3/w1;

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$3:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/w;

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$2:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/x;

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$1:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/x;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/LanguageRepository;->access$getProcessLifecycleOwner$p(Lcom/whoop/data/repositories/LanguageRepository;)Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v8

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$locales:Lb5/g;

    iget-object v4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$newLanguage:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->$oldLanguage:Ljava/lang/String;

    sget-object v9, Landroidx/lifecycle/w;->z:Landroidx/lifecycle/w;

    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    sget-object p1, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {p1}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v11

    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-virtual {v11, p1}, Lbc3/z;->isDispatchNeeded(Lq83/j;)Z

    move-result v10

    const/4 p1, 0x0

    const/4 v12, 0x0

    if-nez v10, :cond_3

    invoke-virtual {v8}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v1

    sget-object v13, Landroidx/lifecycle/w;->w:Landroidx/lifecycle/w;

    if-eq v1, v13, :cond_2

    invoke-virtual {v8}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {v2}, Lcom/whoop/data/repositories/LanguageRepository;->access$getLogger$p(Lcom/whoop/data/repositories/LanguageRepository;)Ltr2/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "setting appSpecificLocalList to "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " first="

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " oldLanguage="

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v0, v1, p1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {v2}, Lcom/whoop/data/repositories/LanguageRepository;->access$getSystemResources$p(Lcom/whoop/data/repositories/LanguageRepository;)Lor2/r1;

    move-result-object p1

    invoke-interface {p1, v3}, Lor2/r1;->d(Lb5/g;)V

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;

    invoke-direct {p1, v2, v4, v5, v12}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v6, v12, v12, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_2
    new-instance p1, Landroidx/lifecycle/LifecycleDestroyedException;

    invoke-direct {p1}, Landroidx/lifecycle/LifecycleDestroyedException;-><init>()V

    throw p1

    :cond_3
    new-instance v1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Lb5/g;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V

    iput-object v12, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$0:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$1:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$2:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$3:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->L$4:Ljava/lang/Object;

    iput p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->I$0:I

    iput p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->I$1:I

    iput-boolean v10, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->Z$0:Z

    iput v7, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->label:I

    move-object v13, p0

    move-object v12, v1

    invoke-static/range {v8 .. v13}, Landroidx/lifecycle/o1;->p(Landroidx/lifecycle/x;Landroidx/lifecycle/w;ZLbc3/w1;Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
