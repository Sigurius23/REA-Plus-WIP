.class public final synthetic Lbm2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbm2/h0;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lbm2/h0;II)V
    .locals 0

    iput p3, p0, Lbm2/g;->w:I

    iput-object p1, p0, Lbm2/g;->x:Lbm2/h0;

    iput p2, p0, Lbm2/g;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbm2/g;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/g;->x:Lbm2/h0;

    iget v1, p0, Lbm2/g;->y:I

    invoke-static {v0, v1, p1, p2}, Lbm2/i;->a(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm2/g;->x:Lbm2/h0;

    iget v1, p0, Lbm2/g;->y:I

    invoke-static {v0, v1, p1, p2}, Lbm2/i;->b(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbm2/g;->x:Lbm2/h0;

    iget v1, p0, Lbm2/g;->y:I

    invoke-static {v0, v1, p1, p2}, Lbm2/i;->c(Lbm2/h0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
