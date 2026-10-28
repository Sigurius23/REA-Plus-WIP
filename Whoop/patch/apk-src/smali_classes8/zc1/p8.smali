.class public final synthetic Lzc1/p8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILjava/lang/String;Z)V
    .locals 0

    iput p3, p0, Lzc1/p8;->w:I

    iput-object p4, p0, Lzc1/p8;->x:Ljava/lang/String;

    iput-boolean p5, p0, Lzc1/p8;->y:Z

    iput p1, p0, Lzc1/p8;->z:I

    iput p2, p0, Lzc1/p8;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lzc1/p8;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lzc1/p8;->x:Ljava/lang/String;

    iget-boolean v2, p0, Lzc1/p8;->y:Z

    iget v3, p0, Lzc1/p8;->z:I

    iget v4, p0, Lzc1/p8;->E:I

    invoke-static/range {v1 .. v6}, Lzc1/q8;->i(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lzc1/p8;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lzc1/p8;->y:Z

    iget v2, p0, Lzc1/p8;->z:I

    iget v3, p0, Lzc1/p8;->E:I

    invoke-static/range {v0 .. v5}, Lzc1/q8;->k(Ljava/lang/String;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
