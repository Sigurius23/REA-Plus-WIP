.class public final synthetic Lb30/j6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/y0;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lb30/y0;II)V
    .locals 0

    iput p3, p0, Lb30/j6;->w:I

    iput-object p1, p0, Lb30/j6;->x:Lb30/y0;

    iput p2, p0, Lb30/j6;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/j6;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    iget p2, p0, Lb30/j6;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/j6;->x:Lb30/y0;

    invoke-static {v0, p1, p2}, Luf/c0;->v(Lb30/y0;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Lb30/j6;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/j6;->x:Lb30/y0;

    invoke-static {v0, p1, p2}, Luf/c0;->x(Lb30/y0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_1
    iget p2, p0, Lb30/j6;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb30/j6;->x:Lb30/y0;

    invoke-static {v0, p1, p2}, Luf/c0;->i(Lb30/y0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
