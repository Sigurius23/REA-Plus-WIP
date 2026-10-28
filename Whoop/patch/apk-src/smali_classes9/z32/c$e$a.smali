.class final Lz32/c$e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz32/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lu02/a;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lu02/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.pregnancy.interactor.PregnancySettingsInteractor$updateDueDate$1$1"
    f = "PregnancySettingsInteractor.kt"
    l = {
        0x43,
        0x45,
        0x4f
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

.field w:I

.field final synthetic x:Lz32/c;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lz32/c;Ljava/lang/String;ZLec3/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz32/c;",
            "Ljava/lang/String;",
            "Z",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Lz32/c$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz32/c$e$a;->x:Lz32/c;

    iput-object p2, p0, Lz32/c$e$a;->y:Ljava/lang/String;

    iput-boolean p3, p0, Lz32/c$e$a;->z:Z

    iput-object p4, p0, Lz32/c$e$a;->E:Lec3/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lz32/c$e$a;

    iget-object v1, p0, Lz32/c$e$a;->x:Lz32/c;

    iget-object v2, p0, Lz32/c$e$a;->y:Ljava/lang/String;

    iget-boolean v3, p0, Lz32/c$e$a;->z:Z

    iget-object v4, p0, Lz32/c$e$a;->E:Lec3/m;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lz32/c$e$a;-><init>(Lz32/c;Ljava/lang/String;ZLec3/m;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lz32/c$e$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lu02/a<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lz32/c$e$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lz32/c$e$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lz32/c$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lz32/c$e$a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lz32/c$e$a;->x:Lz32/c;

    invoke-static {p1}, Lz32/c;->a(Lz32/c;)Lcom/whoop/pregnancy/api/PregnancyCoachingApi;

    move-result-object p1

    new-instance v1, Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;

    iget-object v6, p0, Lz32/c$e$a;->y:Ljava/lang/String;

    invoke-direct {v1, v6}, Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;-><init>(Ljava/lang/String;)V

    iput v5, p0, Lz32/c$e$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/pregnancy/api/PregnancyCoachingApi;->updateDueDate(Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    move-object v10, p0

    goto :goto_2

    :cond_4
    :goto_0
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lz32/c$e$a;->x:Lz32/c;

    invoke-static {p1}, Lz32/c;->b(Lz32/c;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lz32/c$e$a$a;

    iget-object p1, p0, Lz32/c$e$a;->x:Lz32/c;

    iget-boolean v1, p0, Lz32/c$e$a;->z:Z

    iget-object v7, p0, Lz32/c$e$a;->E:Lec3/m;

    invoke-direct {v9, p1, v1, v7, v2}, Lz32/c$e$a$a;-><init>(Lz32/c;ZLec3/m;Lq83/d;)V

    iput v4, p0, Lz32/c$e$a;->w:I

    const/4 v7, 0x0

    const-string v8, "updateDueDate - refresh data"

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p1, Lu02/a;

    new-instance v1, Lz32/c$e$a$b;

    iget-object v4, v10, Lz32/c$e$a;->E:Lec3/m;

    invoke-direct {v1, v4, v2}, Lz32/c$e$a$b;-><init>(Lec3/m;Lq83/d;)V

    iput v3, v10, Lz32/c$e$a;->w:I

    invoke-static {p1, v1, p0}, Lu02/b;->f(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    return-object p1
.end method
