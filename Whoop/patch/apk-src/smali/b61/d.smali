.class public final synthetic Lb61/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p7, p0, Lb61/d;->w:I

    iput-object p1, p0, Lb61/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lb61/d;->z:Ljava/lang/Object;

    iput-object p3, p0, Lb61/d;->E:Ljava/lang/Object;

    iput-object p4, p0, Lb61/d;->F:Ljava/lang/Object;

    iput-object p5, p0, Lb61/d;->G:Ljava/lang/Object;

    iput p6, p0, Lb61/d;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lb61/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb61/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ld0/z1;

    iget-object v0, p0, Lb61/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ld0/v1;

    iget-object v0, p0, Lb61/d;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ld0/c0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p1, p0, Lb61/d;->x:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-object v3, p0, Lb61/d;->E:Ljava/lang/Object;

    iget-object v4, p0, Lb61/d;->F:Ljava/lang/Object;

    invoke-static/range {v1 .. v7}, Ld0/d2;->a(Ld0/z1;Ld0/v1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb61/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lb61/d;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lb61/d;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb2/h;

    iget-object v0, p0, Lb61/d;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb61/l;

    iget-object v0, p0, Lb61/d;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v6, p0, Lb61/d;->x:I

    invoke-static/range {v1 .. v8}, Lb61/k;->n(Ljava/util/List;Ljava/util/List;Lb2/h;Lb61/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
