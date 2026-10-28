.class public final synthetic Lk71/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(JJIZII)V
    .locals 0

    iput p8, p0, Lk71/h;->w:I

    iput-wide p1, p0, Lk71/h;->x:J

    iput-wide p3, p0, Lk71/h;->y:J

    iput p5, p0, Lk71/h;->z:I

    iput-boolean p6, p0, Lk71/h;->E:Z

    iput p7, p0, Lk71/h;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lk71/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-wide v1, p0, Lk71/h;->x:J

    iget-wide v3, p0, Lk71/h;->y:J

    iget v5, p0, Lk71/h;->z:I

    iget-boolean v6, p0, Lk71/h;->E:Z

    iget v7, p0, Lk71/h;->F:I

    invoke-static/range {v1 .. v9}, Lw11/b;->k(JJIZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v0, p0, Lk71/h;->x:J

    iget-wide v2, p0, Lk71/h;->y:J

    iget v4, p0, Lk71/h;->z:I

    iget-boolean v5, p0, Lk71/h;->E:Z

    iget v6, p0, Lk71/h;->F:I

    invoke-static/range {v0 .. v8}, Lk71/j;->i(JJIZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
