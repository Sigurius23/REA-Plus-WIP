.class public final Lfl0/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lfl0/b;


# direct methods
.method public constructor <init>(Lec3/m;Lfl0/b;)V
    .locals 0

    iput-object p1, p0, Lfl0/b$b$a;->w:Lec3/m;

    iput-object p2, p0, Lfl0/b$b$a;->x:Lfl0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lfl0/b$b$a$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lfl0/b$b$a$a;

    iget v3, v2, Lfl0/b$b$a$a;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lfl0/b$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lfl0/b$b$a$a;

    invoke-direct {v2, v0, v1}, Lfl0/b$b$a$a;-><init>(Lfl0/b$b$a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lfl0/b$b$a$a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lfl0/b$b$a$a;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lfl0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lfl0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lfl0/b$b$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lfl0/b$b$a$a;->K:I

    iget-object v6, v2, Lfl0/b$b$a$a;->J:Ljava/lang/Object;

    check-cast v6, Lpm0/a;

    iget-object v6, v2, Lfl0/b$b$a$a;->I:Ljava/lang/Object;

    check-cast v6, Lq83/d;

    iget-object v6, v2, Lfl0/b$b$a$a;->H:Ljava/lang/Object;

    check-cast v6, Lec3/m;

    iget-object v8, v2, Lfl0/b$b$a$a;->G:Ljava/lang/Object;

    check-cast v8, Lec3/m;

    iget-object v8, v2, Lfl0/b$b$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lfl0/b$b$a$a;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lfl0/b$b$a;->w:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lpm0/a;

    instance-of v8, v4, Lpm0/a$a$a;

    const/4 v9, 0x0

    if-eqz v8, :cond_5

    new-instance v8, Lfl0/b$c;

    iget-object v10, v0, Lfl0/b$b$a;->x:Lfl0/b;

    invoke-direct {v8, v4, v10, v7}, Lfl0/b$c;-><init>(Lpm0/a;Lfl0/b;Lq83/d;)V

    iput-object v7, v2, Lfl0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v1, v2, Lfl0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lfl0/b$b$a$a;->K:I

    iput v9, v2, Lfl0/b$b$a$a;->L:I

    iput v6, v2, Lfl0/b$b$a$a;->x:I

    const-wide/16 v10, 0x3e8

    invoke-static {v10, v11, v8, v2}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object v6, v1

    move-object v1, v4

    move v4, v9

    :goto_1
    move-object v10, v1

    move v9, v4

    move-object v1, v6

    goto :goto_4

    :cond_5
    instance-of v6, v4, Lpm0/a$e;

    if-nez v6, :cond_9

    instance-of v6, v4, Lpm0/a$a$b;

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    instance-of v6, v4, Lpm0/a$c;

    if-nez v6, :cond_8

    instance-of v4, v4, Lpm0/a$d;

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_8
    :goto_2
    new-instance v10, Lfl0/c;

    iget-object v4, v0, Lfl0/b$b$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v12, Lfl0/j;->ERROR:Lfl0/j;

    const/16 v17, 0x3c

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_9
    :goto_3
    new-instance v11, Lfl0/c;

    iget-object v4, v0, Lfl0/b$b$a;->x:Lfl0/b;

    invoke-static {v4}, Lfl0/b;->o(Lfl0/b;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/whoop/bot/models/conversation/AiChatConversation;

    sget-object v13, Lfl0/j;->SUCCESS:Lfl0/j;

    const/16 v18, 0x3c

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v19}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v11

    :goto_4
    iput-object v7, v2, Lfl0/b$b$a$a;->y:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->G:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->H:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->I:Ljava/lang/Object;

    iput-object v7, v2, Lfl0/b$b$a$a;->J:Ljava/lang/Object;

    iput v9, v2, Lfl0/b$b$a$a;->K:I

    iput v5, v2, Lfl0/b$b$a$a;->x:I

    invoke-interface {v1, v10, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_a

    :goto_5
    return-object v3

    :cond_a
    :goto_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
