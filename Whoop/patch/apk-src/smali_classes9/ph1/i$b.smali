.class final Lph1/i$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lph1/i;->I(Lnh1/c$d;Lkotlin/jvm/functions/Function1;Lf0/r1;ZLandroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.gifting.feature.gifting.view.GiftingScreenContentKt$GiftingScreenContent$3$1"
    f = "GiftingScreenContent.kt"
    l = {}
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

.field w:I

.field final synthetic x:Lbc3/c0;

.field final synthetic y:Lnh1/c$d;

.field final synthetic z:Lg1/y3;


# direct methods
.method public constructor <init>(Lbc3/c0;Lnh1/c$d;Lg1/y3;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lnh1/c$d;",
            "Lg1/y3;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lph1/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lph1/i$b;->x:Lbc3/c0;

    iput-object p2, p0, Lph1/i$b;->y:Lnh1/c$d;

    iput-object p3, p0, Lph1/i$b;->z:Lg1/y3;

    iput-object p4, p0, Lph1/i$b;->E:Lp1/c1;

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

    new-instance v0, Lph1/i$b;

    iget-object v1, p0, Lph1/i$b;->x:Lbc3/c0;

    iget-object v2, p0, Lph1/i$b;->y:Lnh1/c$d;

    iget-object v3, p0, Lph1/i$b;->z:Lg1/y3;

    iget-object v4, p0, Lph1/i$b;->E:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lph1/i$b;-><init>(Lbc3/c0;Lnh1/c$d;Lg1/y3;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lph1/i$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lph1/i$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lph1/i$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lph1/i$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lph1/i$b;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lph1/i$b;->x:Lbc3/c0;

    new-instance v0, Lph1/i$b$a;

    iget-object v1, p0, Lph1/i$b;->y:Lnh1/c$d;

    iget-object v2, p0, Lph1/i$b;->z:Lg1/y3;

    iget-object v3, p0, Lph1/i$b;->E:Lp1/c1;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lph1/i$b$a;-><init>(Lnh1/c$d;Lg1/y3;Lp1/c1;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v4, v4, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
