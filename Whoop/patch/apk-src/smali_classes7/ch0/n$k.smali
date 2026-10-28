.class final Lch0/n$k;
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
    c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$LocallyPositionedList$2$1"
    f = "AiChatDrawerListScreen.kt"
    l = {
        0x119
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lf0/r1;

.field final synthetic y:Lz1/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/s;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf0/r1;Lz1/s;Lp1/t2;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/r1;",
            "Lz1/s;",
            "Lp1/t2;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lch0/n$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch0/n$k;->x:Lf0/r1;

    iput-object p2, p0, Lch0/n$k;->y:Lz1/s;

    iput-object p3, p0, Lch0/n$k;->z:Lp1/t2;

    iput-object p4, p0, Lch0/n$k;->E:Lp1/c1;

    iput-object p5, p0, Lch0/n$k;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lf0/r1;)I
    .locals 0

    invoke-static {p0}, Lch0/n$k;->h(Lf0/r1;)I

    move-result p0

    return p0
.end method

.method private static final h(Lf0/r1;)I
    .locals 0

    iget-object p0, p0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
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

    new-instance v0, Lch0/n$k;

    iget-object v1, p0, Lch0/n$k;->x:Lf0/r1;

    iget-object v2, p0, Lch0/n$k;->y:Lz1/s;

    iget-object v3, p0, Lch0/n$k;->z:Lp1/t2;

    iget-object v4, p0, Lch0/n$k;->E:Lp1/c1;

    iget-object v5, p0, Lch0/n$k;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lch0/n$k;-><init>(Lf0/r1;Lz1/s;Lp1/t2;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/n$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/n$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/n$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/n$k;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lch0/n$k;->w:I

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

    iget-object p1, p0, Lch0/n$k;->x:Lf0/r1;

    new-instance v1, Lch0/p;

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3}, Lch0/p;-><init>(Lf0/r1;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lch0/n$k$a;

    iget-object v3, p0, Lch0/n$k;->y:Lz1/s;

    iget-object v4, p0, Lch0/n$k;->z:Lp1/t2;

    iget-object v5, p0, Lch0/n$k;->E:Lp1/c1;

    iget-object v6, p0, Lch0/n$k;->F:Lp1/c1;

    invoke-direct {v1, v3, v4, v5, v6}, Lch0/n$k$a;-><init>(Lz1/s;Lp1/t2;Lp1/c1;Lp1/c1;)V

    iput v2, p0, Lch0/n$k;->w:I

    invoke-virtual {p1, v1, p0}, Lec3/s1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
