.class final Lch0/w0$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/w0;->i(Landroid/content/Context;Lsl0/n0;Landroidx/compose/runtime/Composer;I)Lch0/v0;
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
    c = "com.whoop.ai.chat.view.AiChatWrapperScreenCoordinatorKt$rememberAiChatWrapperScreenCoordinator$mediaPickerLauncher$1$1$1$1"
    f = "AiChatWrapperScreenCoordinator.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Landroid/content/Context;

.field w:I

.field final synthetic x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic y:Lzg0/h;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Lzg0/h;Ljava/lang/String;Landroid/content/Context;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lzg0/h;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Lch0/w0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch0/w0$h;->x:Ljava/util/List;

    iput-object p2, p0, Lch0/w0$h;->y:Lzg0/h;

    iput-object p3, p0, Lch0/w0$h;->z:Ljava/lang/String;

    iput-object p4, p0, Lch0/w0$h;->E:Landroid/content/Context;

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

    new-instance v0, Lch0/w0$h;

    iget-object v1, p0, Lch0/w0$h;->x:Ljava/util/List;

    iget-object v2, p0, Lch0/w0$h;->y:Lzg0/h;

    iget-object v3, p0, Lch0/w0$h;->z:Ljava/lang/String;

    iget-object v4, p0, Lch0/w0$h;->E:Landroid/content/Context;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lch0/w0$h;-><init>(Ljava/util/List;Lzg0/h;Ljava/lang/String;Landroid/content/Context;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/w0$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/w0$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/w0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/w0$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lch0/w0$h;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lch0/w0$h;->x:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lch0/w0$h;->E:Landroid/content/Context;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    invoke-static {v0, v2}, Lch0/w0;->h(Landroid/content/Context;Landroid/net/Uri;)J

    move-result-wide v2

    new-instance v4, Ljava/lang/Long;

    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lch0/w0$h;->y:Lzg0/h;

    new-instance v0, Lzg0/g$w;

    iget-object v2, p0, Lch0/w0$h;->x:Ljava/util/List;

    iget-object v3, p0, Lch0/w0$h;->z:Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1}, Lzg0/g$w;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lzg0/h;->v(Lzg0/g;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
