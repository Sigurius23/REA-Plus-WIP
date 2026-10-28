.class public final synthetic Lxq2/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxq2/g1;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lxq2/g1;II)V
    .locals 0

    iput p3, p0, Lxq2/z0;->w:I

    iput-object p1, p0, Lxq2/z0;->x:Lxq2/g1;

    iput p2, p0, Lxq2/z0;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lxq2/z0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/z0;->x:Lxq2/g1;

    iget v1, p0, Lxq2/z0;->y:I

    invoke-static {v0, v1, p1, p2}, Lxq2/c1;->a(Lxq2/g1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/z0;->x:Lxq2/g1;

    iget v1, p0, Lxq2/z0;->y:I

    invoke-static {v0, v1, p1, p2}, Lxq2/c1;->q(Lxq2/g1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
