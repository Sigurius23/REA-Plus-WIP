.class final Lug0/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug0/b;->Q(Lec3/m;Ltg0/b;Ltg0/a$a;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic E:Ltg0/b;

.field final synthetic F:Lcom/whoop/ai/chat/models/AIConversation;

.field final synthetic G:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic w:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field final synthetic x:Ltg0/a$a;

.field final synthetic y:Lug0/b;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Ltg0/a$a;Lug0/b;Ljava/lang/String;Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lec3/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Ltg0/a$a;",
            "Lug0/b;",
            "Ljava/lang/String;",
            "Ltg0/b;",
            "Lcom/whoop/ai/chat/models/AIConversation;",
            "Lec3/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lug0/b$h;->w:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lug0/b$h;->x:Ltg0/a$a;

    iput-object p3, p0, Lug0/b$h;->y:Lug0/b;

    iput-object p4, p0, Lug0/b$h;->z:Ljava/lang/String;

    iput-object p5, p0, Lug0/b$h;->E:Ltg0/b;

    iput-object p6, p0, Lug0/b$h;->F:Lcom/whoop/ai/chat/models/AIConversation;

    iput-object p7, p0, Lug0/b$h;->G:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvg0/k;Lq83/d;)Ljava/lang/Object;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/k;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lug0/b$h;->w:Lkotlin/jvm/internal/g0;

    instance-of v3, v1, Lvg0/k$c;

    if-eqz v3, :cond_1

    iget-object v1, v0, Lug0/b$h;->x:Ltg0/a$a;

    invoke-virtual {v1}, Ltg0/a$a;->b()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, v0, Lug0/b$h;->y:Lug0/b;

    invoke-static {v1}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v1

    new-instance v4, Lrg0/a$c;

    iget-object v5, v0, Lug0/b$h;->z:Ljava/lang/String;

    iget-object v6, v0, Lug0/b$h;->x:Ltg0/a$a;

    invoke-virtual {v6}, Ltg0/a$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6, v3}, Lrg0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v4}, Lrg0/b;->a(Lrg0/a;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lug0/b$h;->y:Lug0/b;

    invoke-static {v1}, Lug0/b;->i(Lug0/b;)Lrg0/b;

    move-result-object v1

    new-instance v4, Lrg0/a$i0;

    iget-object v5, v0, Lug0/b$h;->z:Ljava/lang/String;

    iget-object v6, v0, Lug0/b$h;->x:Ltg0/a$a;

    invoke-virtual {v6}, Ltg0/a$a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6, v3}, Lrg0/a$i0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v4}, Lrg0/b;->a(Lrg0/a;)V

    :goto_0
    iget-object v7, v0, Lug0/b$h;->E:Ltg0/b;

    iget-object v8, v0, Lug0/b$h;->F:Lcom/whoop/ai/chat/models/AIConversation;

    const v24, 0xfff6

    const/16 v25, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v7 .. v25}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto :goto_1

    :cond_1
    instance-of v3, v1, Lvg0/k$a;

    if-eqz v3, :cond_2

    iget-object v4, v0, Lug0/b$h;->E:Ltg0/b;

    sget-object v6, Lfl0/j;->ERROR:Lfl0/j;

    check-cast v1, Lvg0/k$a;

    invoke-virtual {v1}, Lvg0/k$a;->a()Ljava/lang/String;

    move-result-object v8

    const v21, 0xfff5

    const/16 v22, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v4 .. v22}, Ltg0/b;->b(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Lfl0/j;Lnl0/m;Ljava/lang/String;Ljava/util/List;Lhl0/d;Ltg0/h;ZZLtg0/e;Lc91/b;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ltg0/b;

    move-result-object v1

    goto :goto_1

    :cond_2
    sget-object v3, Lvg0/k$b;->a:Lvg0/k$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lug0/b$h;->E:Ltg0/b;

    :goto_1
    iput-object v1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v1, v0, Lug0/b$h;->G:Lec3/m;

    iget-object v2, v0, Lug0/b$h;->w:Lkotlin/jvm/internal/g0;

    iget-object v2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v3, p2

    invoke-interface {v1, v2, v3}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_3

    return-object v1

    :cond_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvg0/k;

    invoke-virtual {p0, p1, p2}, Lug0/b$h;->b(Lvg0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
