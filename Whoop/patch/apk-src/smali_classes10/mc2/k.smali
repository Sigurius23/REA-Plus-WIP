.class public final synthetic Lmc2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIIJLjava/lang/String;)V
    .locals 0

    iput p3, p0, Lmc2/k;->w:I

    iput-object p6, p0, Lmc2/k;->x:Ljava/lang/String;

    iput-wide p4, p0, Lmc2/k;->y:J

    iput p1, p0, Lmc2/k;->z:I

    iput p2, p0, Lmc2/k;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lmc2/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lmc2/k;->x:Ljava/lang/String;

    iget-wide v2, p0, Lmc2/k;->y:J

    iget v4, p0, Lmc2/k;->z:I

    iget v5, p0, Lmc2/k;->E:I

    invoke-static/range {v1 .. v7}, Lzc1/i6;->e(Ljava/lang/String;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lmc2/k;->x:Ljava/lang/String;

    iget-wide v1, p0, Lmc2/k;->y:J

    iget v3, p0, Lmc2/k;->z:I

    iget v4, p0, Lmc2/k;->E:I

    invoke-static/range {v0 .. v6}, Lzc1/i6;->n(Ljava/lang/String;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lmc2/k;->x:Ljava/lang/String;

    iget-wide v1, p0, Lmc2/k;->y:J

    iget v3, p0, Lmc2/k;->z:I

    iget v4, p0, Lmc2/k;->E:I

    invoke-static/range {v0 .. v6}, Lmc2/l;->c(Ljava/lang/String;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
