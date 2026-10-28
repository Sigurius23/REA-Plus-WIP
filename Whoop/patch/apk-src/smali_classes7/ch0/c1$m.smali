.class final Lch0/c1$m;
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
    c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$8$1"
    f = "AiChatWrapperScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lch0/v0;

.field final synthetic F:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic G:Lbc3/c0;

.field final synthetic H:Lg1/y3;

.field final synthetic I:Lg1/y3;

.field w:I

.field final synthetic x:Lc93/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/o;"
        }
    .end annotation
.end field

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lzg0/i;


# direct methods
.method public constructor <init>(Lc93/o;Ljava/lang/String;Lzg0/i;Lch0/v0;Lc93/a;Lbc3/c0;Lg1/y3;Lg1/y3;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/o;",
            "Ljava/lang/String;",
            "Lzg0/i;",
            "Lch0/v0;",
            "Lc93/a;",
            "Lbc3/c0;",
            "Lg1/y3;",
            "Lg1/y3;",
            "Lq83/d<",
            "-",
            "Lch0/c1$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch0/c1$m;->x:Lc93/o;

    iput-object p2, p0, Lch0/c1$m;->y:Ljava/lang/String;

    iput-object p3, p0, Lch0/c1$m;->z:Lzg0/i;

    iput-object p4, p0, Lch0/c1$m;->E:Lch0/v0;

    iput-object p5, p0, Lch0/c1$m;->F:Lc93/a;

    iput-object p6, p0, Lch0/c1$m;->G:Lbc3/c0;

    iput-object p7, p0, Lch0/c1$m;->H:Lg1/y3;

    iput-object p8, p0, Lch0/c1$m;->I:Lg1/y3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lzg0/i;Lch0/v0;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lch0/c1$m;->j(Lzg0/i;Lch0/v0;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lbc3/c0;Lch0/v0;Lg1/y3;Lg1/y3;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lch0/c1$m;->k(Lbc3/c0;Lch0/v0;Lg1/y3;Lg1/y3;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lch0/v0;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lch0/c1$m;->l(Lch0/v0;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lzg0/i;Lch0/v0;Lc93/a;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lzg0/i;->f()Lzg0/f;

    move-result-object p0

    invoke-virtual {p0}, Lzg0/f;->a()Lnl0/g;

    move-result-object p0

    invoke-virtual {p0}, Lnl0/g;->b()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p0, Lyg0/b$a;

    invoke-direct {p0, v0}, Lyg0/b$a;-><init>(Lcom/whoop/navigation/e;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lyg0/b$c;

    invoke-virtual {p0}, Lnl0/g;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lyg0/b$c;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    invoke-virtual {p1, p0, p2}, Lch0/v0;->v(Lyg0/b;Lc93/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lbc3/c0;Lch0/v0;Lg1/y3;Lg1/y3;)Ll83/a0;
    .locals 2

    new-instance v0, Lch0/c1$m$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lch0/c1$m$a;-><init>(Lch0/v0;Lg1/y3;Lg1/y3;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lch0/v0;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lch0/v0;->p(Lc93/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Lch0/c1$m;

    iget-object v1, p0, Lch0/c1$m;->x:Lc93/o;

    iget-object v2, p0, Lch0/c1$m;->y:Ljava/lang/String;

    iget-object v3, p0, Lch0/c1$m;->z:Lzg0/i;

    iget-object v4, p0, Lch0/c1$m;->E:Lch0/v0;

    iget-object v5, p0, Lch0/c1$m;->F:Lc93/a;

    iget-object v6, p0, Lch0/c1$m;->G:Lbc3/c0;

    iget-object v7, p0, Lch0/c1$m;->H:Lg1/y3;

    iget-object v8, p0, Lch0/c1$m;->I:Lg1/y3;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lch0/c1$m;-><init>(Lc93/o;Ljava/lang/String;Lzg0/i;Lch0/v0;Lc93/a;Lbc3/c0;Lg1/y3;Lg1/y3;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/c1$m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/c1$m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/c1$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/c1$m;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lch0/c1$m;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lch0/c1$m;->x:Lc93/o;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lch0/c1$m;->z:Lzg0/i;

    iget-object v0, p0, Lch0/c1$m;->E:Lch0/v0;

    iget-object v2, p0, Lch0/c1$m;->F:Lc93/a;

    move-object v3, v2

    new-instance v2, Lch0/d1;

    invoke-direct {v2, p1, v0, v3}, Lch0/d1;-><init>(Lzg0/i;Lch0/v0;Lc93/a;)V

    iget-object v4, p0, Lch0/c1$m;->G:Lbc3/c0;

    iget-object v5, p0, Lch0/c1$m;->H:Lg1/y3;

    iget-object v6, p0, Lch0/c1$m;->I:Lg1/y3;

    move-object v7, v3

    new-instance v3, Lch0/e1;

    invoke-direct {v3, v4, v0, v5, v6}, Lch0/e1;-><init>(Lbc3/c0;Lch0/v0;Lg1/y3;Lg1/y3;)V

    new-instance v4, Lch0/m;

    invoke-direct {v4, v0, v7}, Lch0/m;-><init>(Lch0/v0;Lc93/a;)V

    iget-object v5, p0, Lch0/c1$m;->y:Ljava/lang/String;

    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object p1

    invoke-virtual {p1}, Lzg0/f;->a()Lnl0/g;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/g;->c()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
