.class public final synthetic Lc41/u1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll0/u;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ll0/u;II)V
    .locals 0

    iput p3, p0, Lc41/u1;->w:I

    iput-object p1, p0, Lc41/u1;->x:Ll0/u;

    iput p2, p0, Lc41/u1;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lc41/u1;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/u1;->x:Ll0/u;

    iget v1, p0, Lc41/u1;->y:I

    invoke-static {v0, v1, p1, p2}, Lqe0/c;->a(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/u1;->x:Ll0/u;

    iget v1, p0, Lc41/u1;->y:I

    invoke-static {v0, v1, p1, p2}, Lc41/v1;->b(Ll0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
