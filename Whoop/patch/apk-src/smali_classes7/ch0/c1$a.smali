.class final Lch0/c1$a;
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
    c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$1$1"
    f = "AiChatWrapperScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Z

.field final synthetic y:Ldp0/g;

.field final synthetic z:Lzg0/i;


# direct methods
.method public constructor <init>(ZLdp0/g;Lzg0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ldp0/g;",
            "Lzg0/i;",
            "Lq83/d<",
            "-",
            "Lch0/c1$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch0/c1$a;->x:Z

    iput-object p2, p0, Lch0/c1$a;->y:Ldp0/g;

    iput-object p3, p0, Lch0/c1$a;->z:Lzg0/i;

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

    new-instance p1, Lch0/c1$a;

    iget-boolean v0, p0, Lch0/c1$a;->x:Z

    iget-object v1, p0, Lch0/c1$a;->y:Ldp0/g;

    iget-object v2, p0, Lch0/c1$a;->z:Lzg0/i;

    invoke-direct {p1, v0, v1, v2, p2}, Lch0/c1$a;-><init>(ZLdp0/g;Lzg0/i;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/c1$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/c1$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/c1$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/c1$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lch0/c1$a;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lch0/c1$a;->x:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lch0/c1$a;->y:Ldp0/g;

    iget-object v0, p0, Lch0/c1$a;->z:Lzg0/i;

    invoke-virtual {v0}, Lzg0/i;->f()Lzg0/f;

    move-result-object v0

    invoke-virtual {v0}, Lzg0/f;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ldp0/g;->r(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lch0/c1$a;->y:Ldp0/g;

    invoke-interface {p1}, Ldp0/g;->d()V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
