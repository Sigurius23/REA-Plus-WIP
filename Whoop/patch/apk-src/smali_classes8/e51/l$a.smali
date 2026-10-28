.class final Le51/l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le51/l;->i(Landroidx/compose/ui/Modifier;Le51/n;Ll0/k1;Ln0/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le51/l$a$b;
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
    c = "com.whoop.design.atomic.organism.anchorselector.AnchorSelectorKt$AnchorSelector$2$1"
    f = "AnchorSelector.kt"
    l = {
        0x60
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

.field final synthetic x:Le51/n;

.field final synthetic y:Ln0/u;

.field final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le51/n;Ln0/u;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le51/n;",
            "Ln0/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Le51/l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Le51/l$a;->x:Le51/n;

    iput-object p2, p0, Le51/l$a;->y:Ln0/u;

    iput-object p3, p0, Le51/l$a;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Le51/l$a;->E:Lp1/c1;

    iput-object p5, p0, Le51/l$a;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Le51/n;Ln0/u;)I
    .locals 0

    invoke-static {p0, p1}, Le51/l$a;->h(Le51/n;Ln0/u;)I

    move-result p0

    return p0
.end method

.method private static final h(Le51/n;Ln0/u;)I
    .locals 1

    invoke-virtual {p0}, Le51/n;->e()Le51/m;

    move-result-object p0

    sget-object v0, Le51/l$a$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Le51/l;->B(Ln0/u;)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    iget-object p0, p1, Ln0/u;->e:Ll2/a;

    iget-object p0, p0, Ll2/a;->b:Ljava/lang/Object;

    check-cast p0, Lp1/h1;

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

    new-instance v0, Le51/l$a;

    iget-object v1, p0, Le51/l$a;->x:Le51/n;

    iget-object v2, p0, Le51/l$a;->y:Ln0/u;

    iget-object v3, p0, Le51/l$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Le51/l$a;->E:Lp1/c1;

    iget-object v5, p0, Le51/l$a;->F:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Le51/l$a;-><init>(Le51/n;Ln0/u;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Le51/l$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le51/l$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Le51/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Le51/l$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Le51/l$a;->w:I

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

    iget-object p1, p0, Le51/l$a;->x:Le51/n;

    iget-object v1, p0, Le51/l$a;->y:Ln0/u;

    new-instance v3, Le51/k;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v1, v4}, Le51/k;-><init>(Le51/n;Ljava/lang/Object;I)V

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v1, Le51/l$a$a;

    iget-object v3, p0, Le51/l$a;->x:Le51/n;

    iget-object v4, p0, Le51/l$a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Le51/l$a;->E:Lp1/c1;

    iget-object v6, p0, Le51/l$a;->F:Lp1/c1;

    invoke-direct {v1, v3, v4, v5, v6}, Le51/l$a$a;-><init>(Le51/n;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    iput v2, p0, Le51/l$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
