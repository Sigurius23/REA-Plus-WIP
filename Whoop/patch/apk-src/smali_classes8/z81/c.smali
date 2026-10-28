.class public final synthetic Lz81/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Li2/t0;

.field public final synthetic F:F

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:Ly81/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIII)V
    .locals 0

    iput p8, p0, Lz81/c;->w:I

    iput-object p1, p0, Lz81/c;->x:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lz81/c;->y:F

    iput-object p3, p0, Lz81/c;->z:Ly81/e;

    iput-object p4, p0, Lz81/c;->E:Li2/t0;

    iput p5, p0, Lz81/c;->F:F

    iput p6, p0, Lz81/c;->G:I

    iput p7, p0, Lz81/c;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lz81/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lz81/c;->x:Landroidx/compose/ui/Modifier;

    iget v2, p0, Lz81/c;->y:F

    iget-object v3, p0, Lz81/c;->z:Ly81/e;

    iget-object v4, p0, Lz81/c;->E:Li2/t0;

    iget v5, p0, Lz81/c;->F:F

    iget v6, p0, Lz81/c;->G:I

    iget v7, p0, Lz81/c;->H:I

    invoke-static/range {v1 .. v9}, Lz81/d;->c(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lz81/c;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lz81/c;->y:F

    iget-object v2, p0, Lz81/c;->z:Ly81/e;

    iget-object v3, p0, Lz81/c;->E:Li2/t0;

    iget v4, p0, Lz81/c;->F:F

    iget v5, p0, Lz81/c;->G:I

    iget v6, p0, Lz81/c;->H:I

    invoke-static/range {v0 .. v8}, Lz81/d;->d(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lz81/c;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lz81/c;->y:F

    iget-object v2, p0, Lz81/c;->z:Ly81/e;

    iget-object v3, p0, Lz81/c;->E:Li2/t0;

    iget v4, p0, Lz81/c;->F:F

    iget v5, p0, Lz81/c;->G:I

    iget v6, p0, Lz81/c;->H:I

    invoke-static/range {v0 .. v8}, Lz81/d;->a(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lz81/c;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lz81/c;->y:F

    iget-object v2, p0, Lz81/c;->z:Ly81/e;

    iget-object v3, p0, Lz81/c;->E:Li2/t0;

    iget v4, p0, Lz81/c;->F:F

    iget v5, p0, Lz81/c;->G:I

    iget v6, p0, Lz81/c;->H:I

    invoke-static/range {v0 .. v8}, Lz81/d;->f(Landroidx/compose/ui/Modifier;FLy81/e;Li2/t0;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

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
