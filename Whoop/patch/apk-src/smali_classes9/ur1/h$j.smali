.class public final Lur1/h$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/h;->v(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$newQuestionsInteractor$$inlined$flatMapLatest$1"
    f = "JournalDomainCombiner.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lur1/h;


# direct methods
.method public constructor <init>(Lq83/d;Lur1/h;)V
    .locals 0

    iput-object p2, p0, Lur1/h$j;->z:Lur1/h;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/data/interactor/JournalNewQuestionState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lur1/h$j;

    iget-object v1, p0, Lur1/h$j;->z:Lur1/h;

    invoke-direct {v0, p3, v1}, Lur1/h$j;-><init>(Lq83/d;Lur1/h;)V

    iput-object p1, v0, Lur1/h$j;->x:Ljava/lang/Object;

    iput-object p2, v0, Lur1/h$j;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lur1/h$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lur1/h$j;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lur1/h$j;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lur1/h$j;->x:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lur1/h$j;->x:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lur1/h$j;->y:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/data/interactor/JournalNewQuestionState;

    instance-of v4, v4, Lcom/whoop/data/interactor/JournalNewQuestionState$NewQuestionsPresent;

    if-eqz v4, :cond_3

    new-instance v5, Lur1/l$d;

    iget-object v4, v0, Lur1/h$j;->z:Lur1/h;

    invoke-static {v4}, Lur1/h;->g(Lur1/h;)Ljava/lang/String;

    move-result-object v6

    iget-object v4, v0, Lur1/h$j;->z:Lur1/h;

    invoke-static {v4}, Lur1/h;->d(Lur1/h;)J

    move-result-wide v7

    const/16 v15, 0xfc

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v16}, Lur1/l$d;-><init>(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ZZLyr1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, La6/u;

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object v5, v0, Lur1/h$j;->z:Lur1/h;

    invoke-static {v5}, Lur1/h;->f(Lur1/h;)Lur1/m;

    move-result-object v5

    invoke-static {v4, v5}, Lod1/h;->a(Lec3/l;Lod1/g;)Lec3/l;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v0, Lur1/h$j;->x:Ljava/lang/Object;

    iput-object v5, v0, Lur1/h$j;->y:Ljava/lang/Object;

    iput v3, v0, Lur1/h$j;->w:I

    invoke-static {v2, v4, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
