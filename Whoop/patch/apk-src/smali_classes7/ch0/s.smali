.class public final synthetic Lch0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lzg0/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lzg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    iput p6, p0, Lch0/s;->w:I

    iput-object p1, p0, Lch0/s;->x:Lzg0/c;

    iput-object p2, p0, Lch0/s;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lch0/s;->z:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lch0/s;->E:I

    iput p5, p0, Lch0/s;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lch0/s;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lch0/s;->x:Lzg0/c;

    iget-object v2, p0, Lch0/s;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lch0/s;->z:Landroidx/compose/ui/Modifier;

    iget v4, p0, Lch0/s;->E:I

    iget v5, p0, Lch0/s;->F:I

    invoke-static/range {v1 .. v7}, Lch0/u;->j(Lzg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lch0/s;->x:Lzg0/c;

    iget-object v1, p0, Lch0/s;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lch0/s;->z:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lch0/s;->E:I

    iget v4, p0, Lch0/s;->F:I

    invoke-static/range {v0 .. v6}, Lch0/u;->g(Lzg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
