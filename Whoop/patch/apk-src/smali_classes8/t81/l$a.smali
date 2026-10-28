.class final Lt81/l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt81/l;->o(ZLt81/r;FIJLc93/n;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.design.atomic.organism.zoomable.ZoomableGraphKt$ExternalZoomChangeListener$1$1"
    f = "ZoomableGraph.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:J

.field final synthetic G:Lc93/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/n;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Z

.field final synthetic y:Lt81/r;

.field final synthetic z:F


# direct methods
.method public constructor <init>(ZLt81/r;FIJLc93/n;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lt81/r;",
            "FIJ",
            "Lc93/n;",
            "Lq83/d<",
            "-",
            "Lt81/l$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lt81/l$a;->x:Z

    iput-object p2, p0, Lt81/l$a;->y:Lt81/r;

    iput p3, p0, Lt81/l$a;->z:F

    iput p4, p0, Lt81/l$a;->E:I

    iput-wide p5, p0, Lt81/l$a;->F:J

    iput-object p7, p0, Lt81/l$a;->G:Lc93/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lc93/n;Lu81/d;Lu81/b;ZZ)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt81/l$a;->h(Lc93/n;Lu81/d;Lu81/b;ZZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lc93/n;Lu81/d;Lu81/b;ZZ)Ll83/a0;
    .locals 0

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-interface {p0, p1, p2, p3, p4}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
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

    new-instance v0, Lt81/l$a;

    iget-boolean v1, p0, Lt81/l$a;->x:Z

    iget-object v2, p0, Lt81/l$a;->y:Lt81/r;

    iget v3, p0, Lt81/l$a;->z:F

    iget v4, p0, Lt81/l$a;->E:I

    iget-wide v5, p0, Lt81/l$a;->F:J

    iget-object v7, p0, Lt81/l$a;->G:Lc93/n;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lt81/l$a;-><init>(ZLt81/r;FIJLc93/n;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lt81/l$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt81/l$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt81/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt81/l$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lt81/l$a;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lt81/l$a;->x:Z

    if-eqz p1, :cond_0

    iget-object v0, p0, Lt81/l$a;->y:Lt81/r;

    iget v1, p0, Lt81/l$a;->z:F

    iget v2, p0, Lt81/l$a;->E:I

    iget-wide v3, p0, Lt81/l$a;->F:J

    iget-object p1, p0, Lt81/l$a;->G:Lc93/n;

    new-instance v5, Lt81/k;

    invoke-direct {v5, p1}, Lt81/k;-><init>(Lc93/n;)V

    invoke-static/range {v0 .. v5}, Lu81/a;->a(Lt81/r;FIJLc93/n;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
