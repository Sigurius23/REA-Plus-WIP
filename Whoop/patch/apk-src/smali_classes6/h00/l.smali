.class public final synthetic Lh00/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq00/o;


# direct methods
.method public synthetic constructor <init>(Lq00/o;II)V
    .locals 0

    iput p3, p0, Lh00/l;->w:I

    packed-switch p3, :pswitch_data_0

    sget-object p2, Lh20/n1;->w:Lh20/n1;

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/l;->x:Lq00/o;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lh00/l;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x1

    iget-object v3, p0, Lh00/l;->x:Lq00/o;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v3, p1, p2}, Lh00/o;->f(Lq00/o;Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_0
    sget-object v0, Lh20/n1;->w:Lh20/n1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {v3, p1, p2}, Lh00/o;->e(Lq00/o;Landroidx/compose/runtime/Composer;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
