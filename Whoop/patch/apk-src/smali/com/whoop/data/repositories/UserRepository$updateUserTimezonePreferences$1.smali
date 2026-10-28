.class final Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/repositories/UserRepository;->updateUserTimezonePreferences(ZLjava/lang/Long;)V
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
    c = "com.whoop.data.repositories.UserRepository$updateUserTimezonePreferences$1"
    f = "UserRepository.kt"
    l = {
        0x57,
        0x61
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $timestamp:Ljava/lang/Long;

.field final synthetic $using24HourTime:Z

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/repositories/UserRepository;


# direct methods
.method public constructor <init>(ZLcom/whoop/data/repositories/UserRepository;Ljava/lang/Long;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/whoop/data/repositories/UserRepository;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$using24HourTime:Z

    iput-object p2, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    iput-object p3, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$timestamp:Ljava/lang/Long;

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

    new-instance p1, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;

    iget-boolean v0, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$using24HourTime:Z

    iget-object v1, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    iget-object v2, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$timestamp:Ljava/lang/Long;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;-><init>(ZLcom/whoop/data/repositories/UserRepository;Ljava/lang/Long;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v3

    sget-object v3, Li92/o;->e:Li92/o$a;

    iget-boolean v4, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$using24HourTime:Z

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v5

    const-string v1, "getDefault(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/UserRepository;->access$getUsersPreferenceApi$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/service/network/UsersPreferenceApi;

    move-result-object v6

    iget-object v1, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    invoke-static {v1}, Lcom/whoop/data/repositories/UserRepository;->access$getLogger$p(Lcom/whoop/data/repositories/UserRepository;)Ltr2/n;

    move-result-object v7

    iget-object v8, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$timestamp:Ljava/lang/Long;

    iput p1, p0, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->label:I

    move-object v9, p0

    invoke-virtual/range {v3 .. v9}, Li92/o$a;->a(ZLorg/joda/time/DateTimeZone;Lcom/whoop/service/network/UsersPreferenceApi;Ltr2/n;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_4

    iget-object p1, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/UserRepository;->access$getTimezoneUpdateUploader$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/service/timezone/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/service/timezone/a;->c()Lda2/a;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->L$0:Ljava/lang/Object;

    iput v2, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->label:I

    invoke-virtual {p1, p0}, Lda2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_4
    instance-of v0, p1, Lu02/a$b$b;

    if-eqz v0, :cond_5

    iget-object p1, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$timestamp:Ljava/lang/Long;

    if-eqz p1, :cond_6

    iget-object p1, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/UserRepository;->access$getFeatureFlagChecker$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v0, "android-foreground-gps-collection"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->this$0:Lcom/whoop/data/repositories/UserRepository;

    invoke-static {p1}, Lcom/whoop/data/repositories/UserRepository;->access$getTimezoneUpdateUploader$p(Lcom/whoop/data/repositories/UserRepository;)Lcom/whoop/service/timezone/a;

    move-result-object p1

    iget-object v0, v9, Lcom/whoop/data/repositories/UserRepository$updateUserTimezonePreferences$1;->$timestamp:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/whoop/service/timezone/a;->e(J)V

    goto :goto_2

    :cond_5
    instance-of p1, p1, Lu02/a$b$a;

    if-eqz p1, :cond_7

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
