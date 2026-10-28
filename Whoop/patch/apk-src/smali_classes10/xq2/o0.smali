.class public final synthetic Lxq2/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lxq2/r0;


# direct methods
.method public synthetic constructor <init>(Lxq2/r0;I)V
    .locals 0

    iput p2, p0, Lxq2/o0;->w:I

    iput-object p1, p0, Lxq2/o0;->x:Lxq2/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxq2/o0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/o0;->x:Lxq2/r0;

    invoke-static {v0, p1, p2}, Lxq2/q0;->b(Lxq2/r0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/o0;->x:Lxq2/r0;

    invoke-static {v0, p1, p2}, Lxq2/q0;->e(Lxq2/r0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
