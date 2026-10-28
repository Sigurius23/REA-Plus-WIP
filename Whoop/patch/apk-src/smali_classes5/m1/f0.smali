.class public final synthetic Lm1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(JLl3/v0;Lc93/m;II)V
    .locals 0

    iput p6, p0, Lm1/f0;->w:I

    iput-wide p1, p0, Lm1/f0;->x:J

    iput-object p3, p0, Lm1/f0;->y:Ll3/v0;

    iput-object p4, p0, Lm1/f0;->z:Lc93/m;

    iput p5, p0, Lm1/f0;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lm1/f0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lm1/f0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-wide v1, p0, Lm1/f0;->x:J

    iget-object v3, p0, Lm1/f0;->y:Ll3/v0;

    iget-object v4, p0, Lm1/f0;->z:Lc93/m;

    invoke-static/range {v1 .. v6}, Lm1/l0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lm1/f0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-wide v0, p0, Lm1/f0;->x:J

    iget-object v2, p0, Lm1/f0;->y:Ll3/v0;

    iget-object v3, p0, Lm1/f0;->z:Lc93/m;

    invoke-static/range {v0 .. v5}, Lm1/e0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
