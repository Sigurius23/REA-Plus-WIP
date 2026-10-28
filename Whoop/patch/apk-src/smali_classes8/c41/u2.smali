.class public final synthetic Lc41/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc41/w2;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lc41/w2;II)V
    .locals 0

    iput p3, p0, Lc41/u2;->w:I

    iput-object p1, p0, Lc41/u2;->x:Lc41/w2;

    iput p2, p0, Lc41/u2;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc41/u2;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/u2;->x:Lc41/w2;

    iget v1, p0, Lc41/u2;->y:I

    invoke-static {v0, v1, p1, p2}, Lc41/v2;->c(Lc41/w2;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/u2;->x:Lc41/w2;

    iget v1, p0, Lc41/u2;->y:I

    invoke-static {v0, v1, p1, p2}, Lc41/v2;->f(Lc41/w2;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc41/u2;->x:Lc41/w2;

    iget v1, p0, Lc41/u2;->y:I

    invoke-static {v0, v1, p1, p2}, Lc41/v2;->a(Lc41/w2;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc41/u2;->x:Lc41/w2;

    iget v1, p0, Lc41/u2;->y:I

    invoke-static {v0, v1, p1, p2}, Lc41/v2;->h(Lc41/w2;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
