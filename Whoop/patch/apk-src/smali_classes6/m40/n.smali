.class public final Lm40/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lb2/h;

.field public final synthetic F:Ly2/k;

.field public final synthetic G:Li2/y;

.field public final synthetic w:Lkotlin/jvm/functions/Function3;

.field public final synthetic x:Ll0/v;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;Ll0/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;Li2/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm40/n;->w:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, Lm40/n;->x:Ll0/v;

    iput-object p3, p0, Lm40/n;->y:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lm40/n;->z:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lm40/n;->E:Lb2/h;

    iput-object p6, p0, Lm40/n;->F:Ly2/k;

    iput-object p7, p0, Lm40/n;->G:Li2/y;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    check-cast p1, Lc0/o;

    check-cast p2, Lm40/y;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const/4 p4, 0x0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "$this$AnimatedContent"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm40/x;->a:Lm40/x;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    iget-object v1, p0, Lm40/n;->x:Ll0/v;

    if-eqz p1, :cond_0

    check-cast p3, Lp1/q;

    const p1, -0x70cc9b21

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lm40/n;->w:Lkotlin/jvm/functions/Function3;

    invoke-interface {p1, v1, p3, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, p4}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    sget-object p1, Lm40/x;->b:Lm40/x;

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    check-cast p3, Lp1/q;

    const p1, -0x70cc95df

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lm40/n;->y:Lkotlin/jvm/functions/Function3;

    invoke-interface {p1, v1, p3, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3, p4}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_1
    instance-of p1, p2, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    if-eqz p1, :cond_2

    move-object v7, p3

    check-cast v7, Lp1/q;

    const p1, 0x573ab73e

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lm40/n;->z:Landroidx/compose/ui/Modifier;

    const-string p3, "StripeImageFromUrl"

    invoke-static {p1, p3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    check-cast p2, Lcom/stripe/android/uicore/image/StripeImageState$Success;

    invoke-virtual {p2}, Lcom/stripe/android/uicore/image/StripeImageState$Success;->a()Ln2/a;

    move-result-object v0

    const/4 v8, 0x0

    const/16 v9, 0x20

    const/4 v1, 0x0

    iget-object v3, p0, Lm40/n;->E:Lb2/h;

    iget-object v4, p0, Lm40/n;->F:Ly2/k;

    const/4 v5, 0x0

    iget-object v6, p0, Lm40/n;->G:Li2/y;

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, p4}, Lp1/q;->q(Z)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    const p1, -0x70cc9df0

    check-cast p3, Lp1/q;

    invoke-static {p1, p3, p4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p1

    throw p1
.end method
