.class public final synthetic Lg1/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;JIII)V
    .locals 0

    iput p8, p0, Lg1/e3;->w:I

    iput-object p1, p0, Lg1/e3;->G:Ljava/lang/Object;

    iput-object p2, p0, Lg1/e3;->x:Ljava/lang/String;

    iput-object p3, p0, Lg1/e3;->y:Landroidx/compose/ui/Modifier;

    iput-wide p4, p0, Lg1/e3;->z:J

    iput p6, p0, Lg1/e3;->E:I

    iput p7, p0, Lg1/e3;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lg1/e3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/e3;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lo2/e;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/e3;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v2, p0, Lg1/e3;->x:Ljava/lang/String;

    iget-object v3, p0, Lg1/e3;->y:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lg1/e3;->z:J

    iget v8, p0, Lg1/e3;->F:I

    invoke-static/range {v1 .. v8}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/e3;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln2/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/e3;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v2, p0, Lg1/e3;->x:Ljava/lang/String;

    iget-object v3, p0, Lg1/e3;->y:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lg1/e3;->z:J

    iget v8, p0, Lg1/e3;->F:I

    invoke-static/range {v1 .. v8}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
