.class final Lzq0/f$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzq0/f;->w(Landroidx/compose/ui/Modifier;Lzq0/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.communityeverydaystats.view.CommunitySnapshotContainerKt$CommunitySnapshotContainer$requestSnapBack$1$1$1"
    f = "CommunitySnapshotContainer.kt"
    l = {
        0xcc
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field x:F

.field y:I

.field final synthetic z:Lzq0/p;


# direct methods
.method public constructor <init>(Lzq0/p;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzq0/p;",
            "Lq83/d<",
            "-",
            "Lzq0/f$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzq0/f$e;->z:Lzq0/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(ILzq0/p;Ld0/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzq0/f$e;->h(ILzq0/p;Ld0/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(ILzq0/p;Ld0/e;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, Lzq0/p;->h()I

    move-result v0

    if-ne p0, v0, :cond_0

    invoke-virtual {p2}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-virtual {p1, p0}, Lzq0/p;->u(F)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lzq0/f$e;

    iget-object v0, p0, Lzq0/f$e;->z:Lzq0/p;

    invoke-direct {p1, v0, p2}, Lzq0/f$e;-><init>(Lzq0/p;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lzq0/f$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzq0/f$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzq0/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzq0/f$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzq0/f$e;->y:I

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

    iget-object p1, p0, Lzq0/f$e;->z:Lzq0/p;

    invoke-virtual {p1}, Lzq0/p;->h()I

    move-result p1

    iget-object v1, p0, Lzq0/f$e;->z:Lzq0/p;

    invoke-virtual {v1}, Lzq0/p;->g()F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v4, v1, v3

    if-lez v4, :cond_2

    invoke-static {v1}, Ld0/f;->a(F)Ld0/e;

    move-result-object v5

    new-instance v6, Ljava/lang/Float;

    invoke-direct {v6, v3}, Ljava/lang/Float;-><init>(F)V

    const/4 v4, 0x7

    const/4 v7, 0x0

    invoke-static {v3, v3, v4, v7}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v7

    iget-object v3, p0, Lzq0/f$e;->z:Lzq0/p;

    new-instance v8, Lzq0/k;

    invoke-direct {v8, p1, v3}, Lzq0/k;-><init>(ILzq0/p;)V

    iput p1, p0, Lzq0/f$e;->w:I

    iput v1, p0, Lzq0/f$e;->x:F

    iput v2, p0, Lzq0/f$e;->y:I

    const/4 v10, 0x4

    move-object v9, p0

    invoke-static/range {v5 .. v10}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
