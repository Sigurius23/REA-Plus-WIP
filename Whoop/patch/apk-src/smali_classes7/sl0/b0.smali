.class public final synthetic Lsl0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Li2/t;Landroidx/compose/ui/Modifier;ZLv41/g;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lsl0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/b0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/b0;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Lsl0/b0;->x:Z

    iput-object p4, p0, Lsl0/b0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lsl0/b0;->F:Ljava/lang/Object;

    iput-object p6, p0, Lsl0/b0;->G:Ljava/lang/Object;

    iput-object p7, p0, Lsl0/b0;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Li2/t;ZLv41/g;Lc93/a;Lc93/a;Lny0/q;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lsl0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/b0;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lsl0/b0;->x:Z

    iput-object p3, p0, Lsl0/b0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lsl0/b0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lsl0/b0;->F:Ljava/lang/Object;

    iput-object p6, p0, Lsl0/b0;->G:Ljava/lang/Object;

    iput-object p7, p0, Lsl0/b0;->H:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lnl0/f;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lsl0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsl0/b0;->x:Z

    iput-object p2, p0, Lsl0/b0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/b0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lsl0/b0;->E:Ljava/lang/Object;

    iput-object p5, p0, Lsl0/b0;->F:Ljava/lang/Object;

    iput-object p6, p0, Lsl0/b0;->G:Ljava/lang/Object;

    iput-object p7, p0, Lsl0/b0;->H:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lsl0/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/b0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li2/t;

    iget-object v0, p0, Lsl0/b0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lv41/g;

    iget-object v0, p0, Lsl0/b0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lsl0/b0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Lsl0/b0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lny0/q;

    iget-object v0, p0, Lsl0/b0;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    move-object v8, p1

    check-cast v8, Ll0/y;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v2, p0, Lsl0/b0;->x:Z

    invoke-static/range {v1 .. v10}, Lv41/e;->d(Li2/t;ZLv41/g;Lc93/a;Lc93/a;Lny0/q;Lkotlin/jvm/functions/Function3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/b0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li2/t;

    iget-object v0, p0, Lsl0/b0;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lsl0/b0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv41/g;

    iget-object v0, p0, Lsl0/b0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lc93/a;

    iget-object v0, p0, Lsl0/b0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    iget-object v0, p0, Lsl0/b0;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function3;

    move-object v8, p1

    check-cast v8, Ll0/y;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v3, p0, Lsl0/b0;->x:Z

    invoke-static/range {v1 .. v10}, Lv41/d;->g(Li2/t;Landroidx/compose/ui/Modifier;ZLv41/g;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/b0;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lsl0/b0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iget-object v0, p0, Lsl0/b0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    iget-object v0, p0, Lsl0/b0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lg1/y3;

    iget-object v0, p0, Lsl0/b0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lsl0/b0;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lnl0/f;

    move-object v8, p1

    check-cast v8, Ll0/y;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v1, p0, Lsl0/b0;->x:Z

    invoke-static/range {v1 .. v10}, Lsl0/e0;->a(ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Lnl0/f;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
