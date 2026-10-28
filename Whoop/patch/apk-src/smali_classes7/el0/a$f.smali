.class final Lel0/a$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lel0/a;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000c"
    }
    d2 = {
        "Lfl0/c;",
        "conversationResult",
        "Lhl0/c;",
        "feedbackResult",
        "Lil0/c;",
        "historyResult",
        "",
        "overlayResult",
        "Lgl0/d;",
        "hubResult",
        "Lbl0/a;",
        "<anonymous>",
        "(Lfl0/c;Lhl0/c;Lil0/c;ZLgl0/d;)Lbl0/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.combiner.AiConversationDomainCombiner$interact$1"
    f = "AiConversationDomainCombiner.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Z

.field synthetic F:Ljava/lang/Object;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lel0/a$f;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lfl0/c;Lhl0/c;Lil0/c;ZLgl0/d;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/c;",
            "Lhl0/c;",
            "Lil0/c;",
            "Z",
            "Lgl0/d;",
            "Lq83/d<",
            "-",
            "Lbl0/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lel0/a$f;

    invoke-direct {v0, p6}, Lel0/a$f;-><init>(Lq83/d;)V

    iput-object p1, v0, Lel0/a$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lel0/a$f;->y:Ljava/lang/Object;

    iput-object p3, v0, Lel0/a$f;->z:Ljava/lang/Object;

    iput-boolean p4, v0, Lel0/a$f;->E:Z

    iput-object p5, v0, Lel0/a$f;->F:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lel0/a$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v1, p1

    check-cast v1, Lfl0/c;

    move-object v2, p2

    check-cast v2, Lhl0/c;

    move-object v3, p3

    check-cast v3, Lil0/c;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move-object v5, p5

    check-cast v5, Lgl0/d;

    move-object v6, p6

    check-cast v6, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lel0/a$f;->f(Lfl0/c;Lhl0/c;Lil0/c;ZLgl0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lel0/a$f;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lfl0/c;

    iget-object v0, p0, Lel0/a$f;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lhl0/c;

    iget-object v0, p0, Lel0/a$f;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lil0/c;

    iget-boolean v6, p0, Lel0/a$f;->E:Z

    iget-object v0, p0, Lel0/a$f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lgl0/d;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lel0/a$f;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lbl0/a;

    invoke-direct/range {v1 .. v6}, Lbl0/a;-><init>(Lfl0/c;Lhl0/c;Lil0/c;Lgl0/d;Z)V

    return-object v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
