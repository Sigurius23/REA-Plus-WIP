.class final Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1"
    f = "LanguageRepository.kt"
    l = {
        0xf4,
        0xf6,
        0xf7
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $newLanguage:Ljava/lang/String;

.field final synthetic $oldLanguage:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/LanguageRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/LanguageRepository;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->$newLanguage:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->$oldLanguage:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->$newLanguage:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->$oldLanguage:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/LanguageRepository;->access$getPrefsDataStore$p(Lcom/whoop/data/repositories/LanguageRepository;)La6/g;

    move-result-object p1

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->label:I

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast p1, Lf6/f;

    invoke-static {}, Lcom/whoop/data/repositories/LanguageRepositoryKt;->getKEY_USER_LANGUAGE_OVERRIDE()Lf6/d;

    move-result-object v1

    invoke-virtual {p1, v1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/LanguageRepository;->access$getLogger$p(Lcom/whoop/data/repositories/LanguageRepository;)Ltr2/n;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v4, "refreshForLanguageChange"

    invoke-interface {p1, v4, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/LanguageRepository;->access$getLanguageRefresher$p(Lcom/whoop/data/repositories/LanguageRepository;)Ll83/h;

    move-result-object p1

    invoke-interface {p1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;

    iput v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->label:I

    invoke-virtual {p1, p0}, Lcom/whoop/data/repositories/CachedDataLanguageRefresher;->refreshForLanguageChange(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/LanguageRepository;->access$getPrefsDataStore$p(Lcom/whoop/data/repositories/LanguageRepository;)La6/g;

    move-result-object p1

    new-instance v1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->$newLanguage:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->$oldLanguage:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->label:I

    invoke-static {p1, v1, p0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
