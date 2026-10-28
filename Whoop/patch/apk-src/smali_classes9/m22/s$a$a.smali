.class final Lm22/s$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm22/s$a;->invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.pairing.ui.view.SingleDevicePairingScreenKt$Content$1$2$2$1$1$1"
    f = "SingleDevicePairingScreen.kt"
    l = {
        0x86
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/z0;

.field w:I

.field final synthetic x:Ld0/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e;"
        }
    .end annotation
.end field

.field final synthetic y:F

.field final synthetic z:Lp1/z0;


# direct methods
.method public constructor <init>(Ld0/e;FLp1/z0;Lp1/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/e;",
            "F",
            "Lp1/z0;",
            "Lp1/z0;",
            "Lq83/d<",
            "-",
            "Lm22/s$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm22/s$a$a;->x:Ld0/e;

    iput p2, p0, Lm22/s$a$a;->y:F

    iput-object p3, p0, Lm22/s$a$a;->z:Lp1/z0;

    iput-object p4, p0, Lm22/s$a$a;->E:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(FLp1/z0;Lp1/z0;Ld0/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm22/s$a$a;->h(FLp1/z0;Lp1/z0;Ld0/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(FLp1/z0;Lp1/z0;Ld0/e;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lm22/s;->D(Lp1/z0;)F

    move-result p1

    sub-float/2addr p1, p0

    invoke-virtual {p3}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    div-float/2addr p0, p1

    const/high16 p1, 0x42c80000    # 100.0f

    mul-float/2addr p0, p1

    invoke-static {p2, p0}, Lm22/s;->C(Lp1/z0;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

    new-instance v0, Lm22/s$a$a;

    iget-object v1, p0, Lm22/s$a$a;->x:Ld0/e;

    iget v2, p0, Lm22/s$a$a;->y:F

    iget-object v3, p0, Lm22/s$a$a;->z:Lp1/z0;

    iget-object v4, p0, Lm22/s$a$a;->E:Lp1/z0;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lm22/s$a$a;-><init>(Ld0/e;FLp1/z0;Lp1/z0;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lm22/s$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm22/s$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm22/s$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm22/s$a$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm22/s$a$a;->w:I

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

    iget-object v1, p0, Lm22/s$a$a;->x:Ld0/e;

    move p1, v2

    new-instance v2, Ljava/lang/Float;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/lang/Float;-><init>(F)V

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/16 v5, 0x1f4

    const/4 v6, 0x0

    invoke-static {v5, v3, v6, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    iget v4, p0, Lm22/s$a$a;->y:F

    iget-object v5, p0, Lm22/s$a$a;->z:Lp1/z0;

    iget-object v6, p0, Lm22/s$a$a;->E:Lp1/z0;

    move v7, v4

    new-instance v4, Lm22/r;

    invoke-direct {v4, v5, v6, v7}, Lm22/r;-><init>(Lp1/z0;Lp1/z0;F)V

    iput p1, p0, Lm22/s$a$a;->w:I

    const/4 v6, 0x4

    move-object v5, p0

    invoke-static/range {v1 .. v6}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
