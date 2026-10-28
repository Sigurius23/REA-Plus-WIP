.class final Lw41/k$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw41/k;->n(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.design.atomic.organism.activitymap.ActivityMapKt$DefaultActivityMap$5$2$1$1"
    f = "ActivityMap.kt"
    l = {
        0xa5
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Leu/g;

.field final synthetic F:I

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

.field final synthetic I:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Lw41/z$a;

.field final synthetic y:Z

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lw41/z$a;ZZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw41/z$a;",
            "ZZ",
            "Leu/g;",
            "I",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lw41/k$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw41/k$c;->x:Lw41/z$a;

    iput-boolean p2, p0, Lw41/k$c;->y:Z

    iput-boolean p3, p0, Lw41/k$c;->z:Z

    iput-object p4, p0, Lw41/k$c;->E:Leu/g;

    iput p5, p0, Lw41/k$c;->F:I

    iput-object p6, p0, Lw41/k$c;->G:Lp1/c1;

    iput-object p7, p0, Lw41/k$c;->H:Lp1/c1;

    iput-object p8, p0, Lw41/k$c;->I:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k$c;->k(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k$c;->l(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k$c;->j(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->L(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw41/k;->H(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Lw41/k;->I(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    :cond_0
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

    new-instance v0, Lw41/k$c;

    iget-object v1, p0, Lw41/k$c;->x:Lw41/z$a;

    iget-boolean v2, p0, Lw41/k$c;->y:Z

    iget-boolean v3, p0, Lw41/k$c;->z:Z

    iget-object v4, p0, Lw41/k$c;->E:Leu/g;

    iget v5, p0, Lw41/k$c;->F:I

    iget-object v6, p0, Lw41/k$c;->G:Lp1/c1;

    iget-object v7, p0, Lw41/k$c;->H:Lp1/c1;

    iget-object v8, p0, Lw41/k$c;->I:Lp1/c1;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lw41/k$c;-><init>(Lw41/z$a;ZZLeu/g;ILp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lw41/k$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lw41/k$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lw41/k$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lw41/k$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lw41/k$c;->w:I

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

    iget-object v1, p0, Lw41/k$c;->x:Lw41/z$a;

    move p1, v2

    iget-boolean v2, p0, Lw41/k$c;->y:Z

    iget-boolean v3, p0, Lw41/k$c;->z:Z

    iget-object v4, p0, Lw41/k$c;->E:Leu/g;

    iget v5, p0, Lw41/k$c;->F:I

    iget-object v6, p0, Lw41/k$c;->G:Lp1/c1;

    move-object v7, v6

    new-instance v6, Lw41/l;

    const/4 v8, 0x0

    invoke-direct {v6, v7, v8}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    iget-object v7, p0, Lw41/k$c;->H:Lp1/c1;

    move-object v8, v7

    new-instance v7, Lw41/l;

    const/4 v9, 0x1

    invoke-direct {v7, v8, v9}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    iget-object v8, p0, Lw41/k$c;->I:Lp1/c1;

    move-object v9, v8

    new-instance v8, Lw41/l;

    const/4 v10, 0x2

    invoke-direct {v8, v9, v10}, Lw41/l;-><init>(Ljava/lang/Object;I)V

    iput p1, p0, Lw41/k$c;->w:I

    move-object v9, p0

    invoke-static/range {v1 .. v9}, Lx41/c;->g(Lw41/z$a;ZZLeu/g;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
