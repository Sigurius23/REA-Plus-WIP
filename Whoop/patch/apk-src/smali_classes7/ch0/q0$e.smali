.class final Lch0/q0$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/q0;->s(Lzg0/i;ZLkotlin/jvm/functions/Function1;Lf0/r1;ZZZLandroidx/compose/runtime/Composer;II)Lch0/o0;
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
    c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$4$1"
    f = "AiChatScrollBehavior.kt"
    l = {
        0x1d6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lch0/o0;

.field w:I

.field final synthetic x:Z

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lzg0/i;


# direct methods
.method public constructor <init>(ZLjava/lang/String;Lzg0/i;Lch0/o0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Lzg0/i;",
            "Lch0/o0;",
            "Lq83/d<",
            "-",
            "Lch0/q0$e;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch0/q0$e;->x:Z

    iput-object p2, p0, Lch0/q0$e;->y:Ljava/lang/String;

    iput-object p3, p0, Lch0/q0$e;->z:Lzg0/i;

    iput-object p4, p0, Lch0/q0$e;->E:Lch0/o0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lch0/q0$e;

    iget-boolean v1, p0, Lch0/q0$e;->x:Z

    iget-object v2, p0, Lch0/q0$e;->y:Ljava/lang/String;

    iget-object v3, p0, Lch0/q0$e;->z:Lzg0/i;

    iget-object v4, p0, Lch0/q0$e;->E:Lch0/o0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lch0/q0$e;-><init>(ZLjava/lang/String;Lzg0/i;Lch0/o0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/q0$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/q0$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/q0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/q0$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lch0/q0$e;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lch0/q0$e;->x:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lch0/q0$e;->y:Ljava/lang/String;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lch0/q0$e;->z:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lch0/q0$e;->E:Lch0/o0;

    iput v3, p0, Lch0/q0$e;->w:I

    invoke-virtual {p1, p0}, Lch0/o0;->F(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    return-object v2
.end method
