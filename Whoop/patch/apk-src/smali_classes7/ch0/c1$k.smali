.class final Lch0/c1$k;
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
    c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$6$1"
    f = "AiChatWrapperScreen.kt"
    l = {
        0xa6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Z

.field final synthetic y:Ljava/lang/Long;

.field final synthetic z:Lch0/v0;


# direct methods
.method public constructor <init>(ZLjava/lang/Long;Lch0/v0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/Long;",
            "Lch0/v0;",
            "Lq83/d<",
            "-",
            "Lch0/c1$k;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch0/c1$k;->x:Z

    iput-object p2, p0, Lch0/c1$k;->y:Ljava/lang/Long;

    iput-object p3, p0, Lch0/c1$k;->z:Lch0/v0;

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

    new-instance p1, Lch0/c1$k;

    iget-boolean v0, p0, Lch0/c1$k;->x:Z

    iget-object v1, p0, Lch0/c1$k;->y:Ljava/lang/Long;

    iget-object v2, p0, Lch0/c1$k;->z:Lch0/v0;

    invoke-direct {p1, v0, v1, v2, p2}, Lch0/c1$k;-><init>(ZLjava/lang/Long;Lch0/v0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/c1$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/c1$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/c1$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/c1$k;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lch0/c1$k;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lch0/c1$k;->x:Z

    if-eqz p1, :cond_2

    iget-object v1, p0, Lch0/c1$k;->y:Ljava/lang/Long;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lch0/c1$k;->z:Lch0/v0;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput v2, p0, Lch0/c1$k;->w:I

    invoke-virtual {p1, v3, v4, p0}, Lch0/v0;->m(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_2
    if-nez p1, :cond_3

    iget-object p1, p0, Lch0/c1$k;->z:Lch0/v0;

    invoke-virtual {p1}, Lch0/v0;->l()V

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
