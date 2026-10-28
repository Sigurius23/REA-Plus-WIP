.class public final Lg1/h8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lj0/i;

.field public final synthetic w:I

.field public final synthetic x:Lg1/e8;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lg1/e8;ZZLj0/i;I)V
    .locals 0

    .line 1
    iput p5, p0, Lg1/h8;->w:I

    iput-object p1, p0, Lg1/h8;->x:Lg1/e8;

    iput-boolean p2, p0, Lg1/h8;->y:Z

    iput-boolean p3, p0, Lg1/h8;->z:Z

    iput-object p4, p0, Lg1/h8;->E:Lj0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZZLj0/i;Lg1/e8;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lg1/h8;->w:I

    sget-object v0, Lg1/i8;->a:Lg1/i8;

    sget-object v0, Lg1/i8;->a:Lg1/i8;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/h8;->y:Z

    iput-boolean p2, p0, Lg1/h8;->z:Z

    iput-object p3, p0, Lg1/h8;->E:Lj0/i;

    iput-object p4, p0, Lg1/h8;->x:Lg1/e8;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lg1/h8;->w:I

    iget-object v1, p0, Lg1/h8;->E:Lj0/i;

    iget-boolean v2, p0, Lg1/h8;->z:Z

    iget-boolean v3, p0, Lg1/h8;->y:Z

    iget-object v4, p0, Lg1/h8;->x:Lg1/e8;

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li40/i;

    move-object/from16 v0, p2

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    const-string v6, "it"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lp1/q;

    const v6, 0x4734190a

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    sget-object v6, Li40/i;->x:Li40/i;

    if-ne p1, v6, :cond_0

    move v2, v5

    :cond_0
    check-cast v4, Lg1/y1;

    invoke-virtual {v4, v3, v2, v1, v0}, Lg1/y1;->c(ZZLj0/i;Lp1/q;)Lp1/c1;

    move-result-object p1

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/x;

    iget-wide v1, p1, Li2/x;->a:J

    invoke-static {v0, v5, v1, v2}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lg1/g3;

    move-object/from16 v0, p2

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    check-cast v0, Lp1/q;

    const v6, 0x54d35da5

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg1/g3;->x:Lg1/g3;

    if-ne p1, v6, :cond_1

    move v2, v5

    :cond_1
    check-cast v4, Lg1/y1;

    invoke-virtual {v4, v3, v2, v1, v0}, Lg1/y1;->c(ZZLj0/i;Lp1/q;)Lp1/c1;

    move-result-object p1

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/x;

    iget-wide v1, p1, Li2/x;->a:J

    invoke-static {v0, v5, v1, v2}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/Modifier;

    move-object/from16 p1, p2

    check-cast p1, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p3

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-object v12, p1

    check-cast v12, Lp1/q;

    const p1, 0x5361fd9d

    invoke-virtual {v12, p1}, Lp1/q;->e0(I)V

    sget v10, Lg1/i8;->e:F

    sget v11, Lg1/i8;->d:F

    const/4 v13, 0x0

    iget-boolean v6, p0, Lg1/h8;->y:Z

    iget-boolean v7, p0, Lg1/h8;->z:Z

    iget-object v8, p0, Lg1/h8;->E:Lj0/i;

    iget-object v9, p0, Lg1/h8;->x:Lg1/e8;

    invoke-static/range {v6 .. v13}, Luf/c0;->y(ZZLj0/i;Lg1/e8;FFLandroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p1

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf0/t;

    sget v0, Lg1/u8;->a:F

    iget v0, p1, Lf0/t;->a:F

    new-instance v1, Ld0/w1;

    const/4 v2, 0x2

    invoke-direct {v1, v0, p1, v2}, Ld0/w1;-><init>(FLjava/lang/Object;I)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
