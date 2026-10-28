.class public final Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


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
        "Ljava/lang/Object;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$this$launch$inlined:Lbc3/c0;

.field final synthetic $locales$inlined:Lb5/g;

.field final synthetic $newLanguage$inlined:Ljava/lang/String;

.field final synthetic $oldLanguage$inlined:Ljava/lang/String;

.field final synthetic this$0:Lcom/whoop/data/repositories/LanguageRepository;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/LanguageRepository;Lb5/g;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iput-object p2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$locales$inlined:Lb5/g;

    iput-object p3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$newLanguage$inlined:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$oldLanguage$inlined:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$$this$launch$inlined:Lbc3/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/a0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/LanguageRepository;->access$getLogger$p(Lcom/whoop/data/repositories/LanguageRepository;)Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$locales$inlined:Lb5/g;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$newLanguage$inlined:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$oldLanguage$inlined:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "setting appSpecificLocalList to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " first="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " oldLanguage="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {v0}, Lcom/whoop/data/repositories/LanguageRepository;->access$getSystemResources$p(Lcom/whoop/data/repositories/LanguageRepository;)Lor2/r1;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$locales$inlined:Lb5/g;

    invoke-interface {v0, v1}, Lor2/r1;->d(Lb5/g;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$newLanguage$inlined:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$oldLanguage$inlined:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$$this$launch$inlined:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;

    iget-object v2, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->this$0:Lcom/whoop/data/repositories/LanguageRepository;

    iget-object v3, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$newLanguage$inlined:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$invokeSuspend$$inlined$withStarted$1;->$oldLanguage$inlined:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/whoop/data/repositories/LanguageRepository$setAppLocaleList$1$1$1;-><init>(Lcom/whoop/data/repositories/LanguageRepository;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, v5, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
