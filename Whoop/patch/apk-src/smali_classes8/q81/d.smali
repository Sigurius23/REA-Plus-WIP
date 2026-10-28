.class public final synthetic Lq81/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq81/i;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lq81/i;II)V
    .locals 0

    iput p3, p0, Lq81/d;->w:I

    iput-object p1, p0, Lq81/d;->x:Lq81/i;

    iput p2, p0, Lq81/d;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lq81/d;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq81/d;->x:Lq81/i;

    iget v1, p0, Lq81/d;->y:I

    invoke-static {v0, v1, p1, p2}, Lq81/g;->i(Lq81/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lq81/d;->x:Lq81/i;

    iget v1, p0, Lq81/d;->y:I

    invoke-static {v0, v1, p1, p2}, Lq81/g;->f(Lq81/i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
