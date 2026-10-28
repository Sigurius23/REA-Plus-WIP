.class final Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lf6/a;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.repositories.LanguageRepository$setAppLocaleList$1$1$1$1"
    f = "LanguageRepository.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $newLanguage:Ljava/lang/String;

.field final synthetic $oldLanguage:Ljava/lang/String;

.field synthetic L$0:Ljava/lang/Object;

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
            "Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->$newLanguage:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->$oldLanguage:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->$newLanguage:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->$oldLanguage:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lf6/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->label:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lcom/whoop/data/repositories/LanguageRepositoryKt;->getKEY_SHOW_LANGUAGE_MODAL()Lf6/d;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->$newLanguage:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/whoop/data/repositories/LanguageRepository;->access$isNotEnglish(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1$1;->$oldLanguage:Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lf6/a;->g(Lf6/d;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
