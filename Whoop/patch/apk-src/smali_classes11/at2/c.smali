.class public final synthetic Lat2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;Lc93/a;III)V
    .locals 0

    iput p6, p0, Lat2/c;->w:I

    iput-object p1, p0, Lat2/c;->x:Lc93/a;

    iput-object p2, p0, Lat2/c;->y:Lc93/a;

    iput-object p3, p0, Lat2/c;->z:Lc93/a;

    iput p4, p0, Lat2/c;->E:I

    iput p5, p0, Lat2/c;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lat2/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lat2/c;->x:Lc93/a;

    iget-object v2, p0, Lat2/c;->y:Lc93/a;

    iget-object v3, p0, Lat2/c;->z:Lc93/a;

    iget v4, p0, Lat2/c;->E:I

    iget v5, p0, Lat2/c;->F:I

    invoke-static/range {v1 .. v7}, Lm22/u;->k(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lat2/c;->x:Lc93/a;

    iget-object v1, p0, Lat2/c;->y:Lc93/a;

    iget-object v2, p0, Lat2/c;->z:Lc93/a;

    iget v3, p0, Lat2/c;->E:I

    iget v4, p0, Lat2/c;->F:I

    invoke-static/range {v0 .. v6}, Lm22/s;->d(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lat2/c;->x:Lc93/a;

    iget-object v1, p0, Lat2/c;->y:Lc93/a;

    iget-object v2, p0, Lat2/c;->z:Lc93/a;

    iget v3, p0, Lat2/c;->E:I

    iget v4, p0, Lat2/c;->F:I

    invoke-static/range {v0 .. v6}, Lm22/e;->d(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lat2/c;->x:Lc93/a;

    iget-object v1, p0, Lat2/c;->y:Lc93/a;

    iget-object v2, p0, Lat2/c;->z:Lc93/a;

    iget v3, p0, Lat2/c;->E:I

    iget v4, p0, Lat2/c;->F:I

    invoke-static/range {v0 .. v6}, Lat2/d;->b(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
