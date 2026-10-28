.class public final synthetic Lbb2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(ZII)V
    .locals 0

    iput p3, p0, Lbb2/e;->w:I

    iput-boolean p1, p0, Lbb2/e;->x:Z

    iput p2, p0, Lbb2/e;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbb2/e;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Lzq0/f;->j(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Lzq0/f;->p(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Luz1/n;->b(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Lrs2/a;->i(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Llf0/b0;->f(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Liw0/x;->P(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-boolean v0, p0, Lbb2/e;->x:Z

    iget v1, p0, Lbb2/e;->y:I

    invoke-static {v0, v1, p1, p2}, Lbb2/f;->b(ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
