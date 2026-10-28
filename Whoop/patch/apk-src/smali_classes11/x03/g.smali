.class public final Lx03/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic w:Lkotlin/jvm/internal/d0;

.field public final synthetic x:Lh0/k2;

.field public final synthetic y:Lkotlin/jvm/internal/d0;

.field public final synthetic z:Lx03/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/internal/d0;Lx03/i;ZI)V
    .locals 0

    iput-object p1, p0, Lx03/g;->w:Lkotlin/jvm/internal/d0;

    iput-object p2, p0, Lx03/g;->x:Lh0/k2;

    iput-object p3, p0, Lx03/g;->y:Lkotlin/jvm/internal/d0;

    iput-object p4, p0, Lx03/g;->z:Lx03/i;

    iput-boolean p5, p0, Lx03/g;->E:Z

    iput p6, p0, Lx03/g;->F:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    check-cast p1, Ld0/k;

    const-string v0, "$this$animateDecay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ld0/k;->i:Lp1/k1;

    iget-object v1, p1, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    iget-object v3, p0, Lx03/g;->w:Lkotlin/jvm/internal/d0;

    iget v4, v3, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v2, v4

    iget-object v4, p0, Lx03/g;->x:Lh0/k2;

    invoke-interface {v4, v2}, Lh0/k2;->a(F)F

    move-result v4

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iput v1, v3, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {p1}, Ld0/k;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v3, p0, Lx03/g;->y:Lkotlin/jvm/internal/d0;

    iput v1, v3, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    invoke-virtual {p1}, Ld0/k;->a()V

    :cond_0
    iget-object v1, p0, Lx03/g;->z:Lx03/i;

    iget-object v2, v1, Lx03/i;->a:Lx03/b;

    invoke-virtual {v2}, Lx03/b;->e()Lx03/c;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Ld0/k;->a()V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iget v4, p0, Lx03/g;->F:I

    if-eqz v3, :cond_3

    iget-boolean v3, p0, Lx03/g;->E:Z

    if-eqz v3, :cond_3

    invoke-virtual {p1}, Ld0/k;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    const/4 v5, 0x0

    cmpl-float v3, v3, v5

    if-lez v3, :cond_2

    invoke-virtual {v2}, Lx03/c;->a()I

    move-result v3

    add-int/lit8 v6, v4, -0x1

    if-ne v3, v6, :cond_2

    invoke-virtual {p1}, Ld0/k;->a()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ld0/k;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    cmpg-float v3, v3, v5

    if-gez v3, :cond_3

    invoke-virtual {v2}, Lx03/c;->a()I

    move-result v3

    if-ne v3, v4, :cond_3

    invoke-virtual {p1}, Ld0/k;->a()V

    :cond_3
    :goto_0
    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v5, Lv20/g;

    const/4 v11, 0x0

    const/16 v12, 0xa

    const/4 v6, 0x1

    iget-object v7, p0, Lx03/g;->x:Lh0/k2;

    const-class v8, Lh0/k2;

    const-string v9, "scrollBy"

    const-string v10, "scrollBy(F)F"

    invoke-direct/range {v5 .. v12}, Lv20/g;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-static {v1, p1, v2, v4, v5}, Lx03/i;->b(Lx03/i;Ld0/k;Lx03/c;ILkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ld0/k;->a()V

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
