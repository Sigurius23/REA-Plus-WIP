.class final Lch0/n$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/n;->D(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZLandroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$LocallyPositionedList$1$1"
    f = "AiChatDrawerListScreen.kt"
    l = {
        0x109
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lzg0/i;

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic I:Lf0/r1;

.field final synthetic J:Lz1/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/s;"
        }
    .end annotation
.end field

.field final synthetic K:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lzg0/i;Lp1/c1;Lp1/c1;Lf0/r1;Lz1/s;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzg0/i;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lf0/r1;",
            "Lz1/s;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lch0/n$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch0/n$j;->F:Lzg0/i;

    iput-object p2, p0, Lch0/n$j;->G:Lp1/c1;

    iput-object p3, p0, Lch0/n$j;->H:Lp1/c1;

    iput-object p4, p0, Lch0/n$j;->I:Lf0/r1;

    iput-object p5, p0, Lch0/n$j;->J:Lz1/s;

    iput-object p6, p0, Lch0/n$j;->K:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/c1;)F
    .locals 0

    invoke-static {p0}, Lch0/n$j;->h(Lp1/c1;)F

    move-result p0

    return p0
.end method

.method private static final h(Lp1/c1;)F
    .locals 0

    invoke-static {p0}, Lch0/n;->h0(Lp1/c1;)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lch0/n$j;

    iget-object v1, p0, Lch0/n$j;->F:Lzg0/i;

    iget-object v2, p0, Lch0/n$j;->G:Lp1/c1;

    iget-object v3, p0, Lch0/n$j;->H:Lp1/c1;

    iget-object v4, p0, Lch0/n$j;->I:Lf0/r1;

    iget-object v5, p0, Lch0/n$j;->J:Lz1/s;

    iget-object v6, p0, Lch0/n$j;->K:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lch0/n$j;-><init>(Lzg0/i;Lp1/c1;Lp1/c1;Lf0/r1;Lz1/s;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/n$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/n$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/n$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/n$j;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lch0/n$j;->E:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lch0/n$j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lch0/n$j;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lch0/n$j;->F:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->f()Lzg0/f;

    move-result-object p1

    invoke-virtual {p1}, Lzg0/f;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lch0/n$j;->F:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->w()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Lch0/n$j;->G:Lp1/c1;

    invoke-static {p1, v1}, Lch0/n;->e0(Lp1/c1;Z)V

    return-object v2

    :cond_3
    iget-object p1, p0, Lch0/n$j;->F:Lzg0/i;

    invoke-virtual {p1}, Lzg0/i;->q()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    iget-object p1, p0, Lch0/n$j;->H:Lp1/c1;

    invoke-static {p1}, Lch0/n;->f0(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    move p1, v3

    goto :goto_0

    :cond_4
    move p1, v1

    :goto_0
    iget-object v4, p0, Lch0/n$j;->G:Lp1/c1;

    invoke-static {v4}, Lch0/n;->a0(Lp1/c1;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    return-object v2

    :cond_6
    :goto_2
    if-eqz v8, :cond_8

    iget-object v4, p0, Lch0/n$j;->I:Lf0/r1;

    iget-object v5, p0, Lch0/n$j;->F:Lzg0/i;

    iget-object v6, p0, Lch0/n$j;->J:Lz1/s;

    iget-object v7, p0, Lch0/n$j;->K:Lp1/c1;

    invoke-virtual {v5}, Lzg0/i;->f()Lzg0/f;

    move-result-object v5

    invoke-virtual {v5}, Lzg0/f;->e()Ljava/util/List;

    move-result-object v5

    move-object v9, v7

    new-instance v7, Lch0/o;

    const/4 v10, 0x0

    invoke-direct {v7, v9, v10}, Lch0/o;-><init>(Ljava/lang/Object;I)V

    iput-object v8, p0, Lch0/n$j;->w:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, p0, Lch0/n$j;->x:Ljava/lang/Object;

    iput p1, p0, Lch0/n$j;->y:I

    iput v1, p0, Lch0/n$j;->z:I

    iput v3, p0, Lch0/n$j;->E:I

    move-object v9, p0

    invoke-static/range {v4 .. v9}, Lch0/t0;->c(Lf0/r1;Ljava/util/List;Ljava/util/Map;Lc93/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v0, v8

    :goto_3
    move-object v8, v0

    goto :goto_4

    :cond_8
    move-object v9, p0

    :goto_4
    iget-object p1, v9, Lch0/n$j;->H:Lp1/c1;

    invoke-static {p1, v8}, Lch0/n;->g0(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, v9, Lch0/n$j;->G:Lp1/c1;

    invoke-static {p1, v3}, Lch0/n;->e0(Lp1/c1;Z)V

    return-object v2
.end method
