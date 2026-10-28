.class public final synthetic Lzc1/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;IZ)V
    .locals 0

    iput p3, p0, Lzc1/m0;->w:I

    iput-object p2, p0, Lzc1/m0;->x:Ljava/lang/String;

    iput-boolean p4, p0, Lzc1/m0;->y:Z

    iput p1, p0, Lzc1/m0;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lzc1/m0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzc1/m0;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lzc1/m0;->y:Z

    iget v2, p0, Lzc1/m0;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/t3;->b(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzc1/m0;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lzc1/m0;->y:Z

    iget v2, p0, Lzc1/m0;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/o0;->n(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lzc1/m0;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lzc1/m0;->y:Z

    iget v2, p0, Lzc1/m0;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/o0;->c(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lzc1/m0;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lzc1/m0;->y:Z

    iget v2, p0, Lzc1/m0;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/o0;->e(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lzc1/m0;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lzc1/m0;->y:Z

    iget v2, p0, Lzc1/m0;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lzc1/o0;->b(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
