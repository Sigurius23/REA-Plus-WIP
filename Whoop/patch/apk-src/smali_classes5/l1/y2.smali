.class public final Ll1/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/a1;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lj0/i;

.field public final synthetic z:Ll1/e4;


# direct methods
.method public synthetic constructor <init>(ZLj0/i;Ll1/e4;Li2/a1;I)V
    .locals 0

    iput p5, p0, Ll1/y2;->w:I

    iput-boolean p1, p0, Ll1/y2;->x:Z

    iput-object p2, p0, Ll1/y2;->y:Lj0/i;

    iput-object p3, p0, Ll1/y2;->z:Ll1/e4;

    iput-object p4, p0, Ll1/y2;->E:Li2/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ll1/y2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v1, Ll1/h4;->a:Ll1/h4;

    iget-object v5, p0, Ll1/y2;->E:Li2/a1;

    const v7, 0x6d80c00

    iget-boolean v2, p0, Ll1/y2;->x:Z

    iget-object v3, p0, Ll1/y2;->y:Lj0/i;

    iget-object v4, p0, Ll1/y2;->z:Ll1/e4;

    invoke-virtual/range {v1 .. v7}, Ll1/h4;->a(ZLj0/i;Ll1/e4;Li2/a1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p2, v2

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v1, Ll1/t2;->a:Ll1/t2;

    const/high16 v11, 0x6000000

    const/16 v12, 0xc8

    iget-boolean v2, p0, Ll1/y2;->x:Z

    const/4 v3, 0x0

    iget-object v4, p0, Ll1/y2;->y:Lj0/i;

    const/4 v5, 0x0

    iget-object v6, p0, Ll1/y2;->z:Ll1/e4;

    iget-object v7, p0, Ll1/y2;->E:Li2/a1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v1 .. v12}, Ll1/t2;->a(ZZLj0/i;Landroidx/compose/ui/Modifier;Ll1/e4;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
