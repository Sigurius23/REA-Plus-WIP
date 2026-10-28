.class public final Lm40/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lp1/c1;

.field public w:I

.field public final synthetic x:Lm40/w;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lm40/w;Ljava/lang/String;IILp1/c1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lm40/m;->x:Lm40/w;

    iput-object p2, p0, Lm40/m;->y:Ljava/lang/String;

    iput p3, p0, Lm40/m;->z:I

    iput p4, p0, Lm40/m;->E:I

    iput-object p5, p0, Lm40/m;->F:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lm40/m;

    iget v4, p0, Lm40/m;->E:I

    iget-object v5, p0, Lm40/m;->F:Lp1/c1;

    iget-object v1, p0, Lm40/m;->x:Lm40/w;

    iget-object v2, p0, Lm40/m;->y:Ljava/lang/String;

    iget v3, p0, Lm40/m;->z:I

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lm40/m;-><init>(Lm40/w;Ljava/lang/String;IILp1/c1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lm40/m;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lm40/m;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lm40/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lm40/m;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lm40/m;->w:I

    iget-object p1, p0, Lm40/m;->x:Lm40/w;

    iget-object v1, p0, Lm40/m;->y:Ljava/lang/String;

    iget v2, p0, Lm40/m;->z:I

    iget v3, p0, Lm40/m;->E:I

    invoke-virtual {p1, v1, v2, v3, p0}, Lm40/w;->g(Ljava/lang/String;IILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    instance-of v0, p1, Ll83/m;

    iget-object v1, p0, Lm40/m;->F:Lp1/c1;

    if-nez v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    new-instance v2, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    new-instance v3, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    new-instance v4, Li2/g;

    invoke-direct {v4, v0}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V

    invoke-direct {v3, v4}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Li2/g;)V

    invoke-direct {v2, v3}, Lcom/stripe/android/uicore/image/StripeImageState$Success;-><init>(Ln2/a;)V

    invoke-interface {v1, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object p1, Lm40/x;->a:Lm40/x;

    invoke-interface {v1, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
