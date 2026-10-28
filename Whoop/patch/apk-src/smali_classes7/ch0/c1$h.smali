.class final Lch0/c1$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/c1;->p(Lsl0/n0;Lc93/a;Lc93/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function3;ZZZLjava/lang/Long;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLch0/v0;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch0/c1$h$a;
    }
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
    c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$2$1"
    f = "AiChatWrapperScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lch0/v0;

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lzg0/i;

.field final synthetic z:Lcom/whoop/navigation/ChatEntrypointExperience;


# direct methods
.method public constructor <init>(ZLzg0/i;Lcom/whoop/navigation/ChatEntrypointExperience;Lch0/v0;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lzg0/i;",
            "Lcom/whoop/navigation/ChatEntrypointExperience;",
            "Lch0/v0;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lch0/c1$h;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch0/c1$h;->x:Z

    iput-object p2, p0, Lch0/c1$h;->y:Lzg0/i;

    iput-object p3, p0, Lch0/c1$h;->z:Lcom/whoop/navigation/ChatEntrypointExperience;

    iput-object p4, p0, Lch0/c1$h;->E:Lch0/v0;

    iput-object p5, p0, Lch0/c1$h;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lch0/c1$h;

    iget-boolean v1, p0, Lch0/c1$h;->x:Z

    iget-object v2, p0, Lch0/c1$h;->y:Lzg0/i;

    iget-object v3, p0, Lch0/c1$h;->z:Lcom/whoop/navigation/ChatEntrypointExperience;

    iget-object v4, p0, Lch0/c1$h;->E:Lch0/v0;

    iget-object v5, p0, Lch0/c1$h;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lch0/c1$h;-><init>(ZLzg0/i;Lcom/whoop/navigation/ChatEntrypointExperience;Lch0/v0;Lp1/c1;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lch0/c1$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/c1$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/c1$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/c1$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lch0/c1$h;->w:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lch0/c1$h;->x:Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lch0/c1$h;->F:Lp1/c1;

    invoke-static {p1}, Lch0/c1;->J(Lp1/c1;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lch0/c1$h;->y:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object p1

    invoke-virtual {p1}, Lzg0/f;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object p1, p0, Lch0/c1$h;->z:Lcom/whoop/navigation/ChatEntrypointExperience;

    if-nez p1, :cond_2

    const/4 p1, -0x1

    goto :goto_0

    :cond_2
    sget-object v1, Lch0/c1$h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    iget-object p1, p0, Lch0/c1$h;->E:Lch0/v0;

    invoke-virtual {p1}, Lch0/v0;->d()Lsl0/r1;

    move-result-object p1

    invoke-interface {p1}, Lsl0/r1;->a()V

    goto :goto_1

    :pswitch_2
    iget-object p1, p0, Lch0/c1$h;->E:Lch0/v0;

    invoke-virtual {p1}, Lch0/v0;->e()Lsl0/n2;

    move-result-object p1

    sget-object v1, Lsl0/q2$b;->a:Lsl0/q2$b;

    invoke-interface {p1, v1}, Lsl0/n2;->a(Lsl0/q2;)V

    goto :goto_1

    :pswitch_3
    iget-object p1, p0, Lch0/c1$h;->E:Lch0/v0;

    invoke-virtual {p1}, Lch0/v0;->e()Lsl0/n2;

    move-result-object p1

    sget-object v1, Lsl0/q2$a;->a:Lsl0/q2$a;

    invoke-interface {p1, v1}, Lsl0/n2;->a(Lsl0/q2;)V

    goto :goto_1

    :pswitch_4
    iget-object p1, p0, Lch0/c1$h;->E:Lch0/v0;

    invoke-virtual {p1}, Lch0/v0;->e()Lsl0/n2;

    move-result-object p1

    sget-object v1, Lsl0/q2$c;->a:Lsl0/q2$c;

    invoke-interface {p1, v1}, Lsl0/n2;->a(Lsl0/q2;)V

    :goto_1
    iget-object p1, p0, Lch0/c1$h;->F:Lp1/c1;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lch0/c1;->K(Lp1/c1;Z)V

    :cond_3
    :goto_2
    :pswitch_5
    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method
