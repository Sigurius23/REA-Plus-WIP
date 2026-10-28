.class final Lug0/b$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->R(Lec3/m;Ltg0/a$b;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Ltg0/a$b;

.field final synthetic y:Lug0/b;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ltg0/a$b;Lug0/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ltg0/a$b;",
            "Lug0/b;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$j;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$j;->x:Ltg0/a$b;

    iput-object p3, p0, Lug0/b$j;->y:Lug0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/n;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/n;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$j;->w:Lkotlin/jvm/internal/g0;

    sget-object v3, Lvg0/n$b;->a:Lvg0/n$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v6, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v7, Lnl0/m;->SCREEN_LOADING:Lnl0/m;

    iget-object v1, v0, Lug0/b$j;->x:Ltg0/a$b;

    invoke-virtual {v1}, Ltg0/a$b;->j()Z

    move-result v18

    new-instance v4, Ltg0/b;

    const v21, 0xdfb0

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v4 .. v22}, Ltg0/b;-><init>(Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_0

    :cond_0
    instance-of v3, v1, Lvg0/n$c;

    if-eqz v3, :cond_1

    new-instance v4, Ltg0/b;

    check-cast v1, Lvg0/n$c;

    invoke-virtual {v1}, Lvg0/n$c;->a()Lcom/whoop/ai/chat/models/AIConversation;

    move-result-object v5

    sget-object v6, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v7, Lnl0/m;->NONE:Lnl0/m;

    iget-object v1, v0, Lug0/b$j;->x:Ltg0/a$b;

    invoke-virtual {v1}, Ltg0/a$b;->f()Z

    move-result v16

    iget-object v1, v0, Lug0/b$j;->x:Ltg0/a$b;

    invoke-virtual {v1}, Ltg0/a$b;->j()Z

    move-result v18

    const v21, 0xd7b8

    const/16 v22, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v4 .. v22}, Ltg0/b;-><init>(Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    instance-of v3, v1, Lvg0/n$a;

    if-eqz v3, :cond_2

    iget-object v3, v0, Lug0/b$j;->y:Lug0/b;

    invoke-static {v3}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v3

    new-instance v4, Lrg0/a$i;

    const-string v5, ""

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, Lrg0/a$i;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v3, v4}, Lrg0/b;->a(Lrg0/a;)V

    iget-object v3, v0, Lug0/b$j;->y:Lug0/b;

    invoke-static {v3}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v3

    new-instance v4, Lrg0/a$x;

    check-cast v1, Lvg0/n$a;

    invoke-virtual {v1}, Lvg0/n$a;->a()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0x30

    const/4 v12, 0x0

    const-string v5, ""

    const-string v6, "user"

    const-string v7, "conversation_start"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lrg0/a$x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v4}, Lrg0/b;->a(Lrg0/a;)V

    new-instance v5, Ltg0/b;

    sget-object v7, Lfl0/j;->SUCCESS:Lfl0/j;

    sget-object v8, Lnl0/m;->SCREEN_ERROR:Lnl0/m;

    invoke-virtual {v1}, Lvg0/n$a;->a()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ltg0/h;

    iget-object v3, v0, Lug0/b$j;->x:Ltg0/a$b;

    new-instance v4, Lfl0/l;

    const-string v6, "conversation_start"

    invoke-virtual {v1}, Lvg0/n$a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v10, "user"

    invoke-direct {v4, v10, v6, v1}, Lfl0/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v12, v3, v4}, Ltg0/h;-><init>(Ltg0/a;Lfl0/l;)V

    const v22, 0xffb0

    const/16 v23, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v5 .. v23}, Ltg0/b;-><init>(Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v5

    :goto_0
    iput-object v4, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/n;

    invoke-virtual {p0, p1, p2}, Lug0/b$j;->b(Lvg0/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
