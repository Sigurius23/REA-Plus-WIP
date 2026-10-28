.class final Lfn2/i$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn2/i;->a()Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Lfn2/j;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ui.orientationutil.SystemTiltEntryRotationMonitor$orientationTransitions$1"
    f = "TiltEntryRotationMonitor.kt"
    l = {
        0x32
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfn2/i;


# direct methods
.method public constructor <init>(Lfn2/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn2/i;",
            "Lq83/d<",
            "-",
            "Lfn2/i$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfn2/i$a;->z:Lfn2/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lfn2/i$a$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lfn2/i$a;->h(Lfn2/i$a$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lfn2/i$a$a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroid/view/OrientationEventListener;->disable()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lfn2/i$a;

    iget-object v1, p0, Lfn2/i$a;->z:Lfn2/i;

    invoke-direct {v0, v1, p2}, Lfn2/i$a;-><init>(Lfn2/i;Lq83/d;)V

    iput-object p1, v0, Lfn2/i$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lfn2/i$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfn2/i$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfn2/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfn2/i$a;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lfn2/i$a;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lfn2/i$a;->x:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lfn2/i$a;->w:Ljava/lang/Object;

    check-cast v0, Lfn2/i$a$a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lfn2/i$a;->z:Lfn2/i;

    new-instance v2, Lfn2/k;

    iget-object v5, p0, Lfn2/i$a;->z:Lfn2/i;

    invoke-static {v5}, Lfn2/i;->d(Lfn2/i;)Lfn2/g;

    move-result-object v5

    invoke-direct {v2, v5}, Lfn2/k;-><init>(Lfn2/g;)V

    invoke-static {p1, v2}, Lfn2/i;->g(Lfn2/i;Lfn2/k;)V

    iget-object p1, p0, Lfn2/i$a;->z:Lfn2/i;

    invoke-static {p1}, Lfn2/i;->c(Lfn2/i;)Landroid/content/Context;

    move-result-object p1

    new-instance v2, Lfn2/i$a$a;

    iget-object v5, p0, Lfn2/i$a;->z:Lfn2/i;

    invoke-direct {v2, v5, v0, p1}, Lfn2/i$a$a;-><init>(Lfn2/i;Ldc3/u;Landroid/content/Context;)V

    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    move-result p1

    const/4 v5, 0x0

    if-nez p1, :cond_2

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, v5}, Ldc3/t;->r(Ljava/lang/Throwable;)Z

    return-object v3

    :cond_2
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->enable()V

    new-instance p1, Lfn2/h;

    invoke-direct {p1, v2}, Lfn2/h;-><init>(Lfn2/i$a$a;)V

    iput-object v5, p0, Lfn2/i$a;->y:Ljava/lang/Object;

    iput-object v5, p0, Lfn2/i$a;->w:Ljava/lang/Object;

    iput v4, p0, Lfn2/i$a;->x:I

    invoke-static {v0, p1, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object v3
.end method
