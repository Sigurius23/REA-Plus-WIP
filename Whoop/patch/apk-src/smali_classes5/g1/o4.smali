.class public final synthetic Lg1/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JJII)V
    .locals 0

    iput p7, p0, Lg1/o4;->w:I

    iput-object p1, p0, Lg1/o4;->E:Ljava/lang/Object;

    iput-wide p2, p0, Lg1/o4;->x:J

    iput-wide p4, p0, Lg1/o4;->y:J

    iput p6, p0, Lg1/o4;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lg1/o4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/o4;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhr2/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v2, p0, Lg1/o4;->x:J

    iget-wide v4, p0, Lg1/o4;->y:J

    iget v6, p0, Lg1/o4;->z:I

    invoke-static/range {v1 .. v8}, Lhr2/f;->b(Lhr2/a;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/o4;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/o4;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-wide v2, p0, Lg1/o4;->x:J

    iget-wide v4, p0, Lg1/o4;->y:J

    invoke-static/range {v1 .. v7}, Lg1/v4;->c(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
