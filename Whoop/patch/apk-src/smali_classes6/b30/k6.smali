.class public final synthetic Lb30/k6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 1
    iput p6, p0, Lb30/k6;->w:I

    iput-object p1, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb30/k6;->x:Ljava/lang/String;

    iput-object p3, p0, Lb30/k6;->y:Ljava/lang/String;

    iput p4, p0, Lb30/k6;->E:I

    iput p5, p0, Lb30/k6;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 2
    iput p6, p0, Lb30/k6;->w:I

    iput-object p1, p0, Lb30/k6;->x:Ljava/lang/String;

    iput-object p2, p0, Lb30/k6;->y:Ljava/lang/String;

    iput-object p3, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lb30/k6;->E:I

    iput p5, p0, Lb30/k6;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/k6;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v3, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v4, p0, Lb30/k6;->E:I

    iget v5, p0, Lb30/k6;->F:I

    invoke-static/range {v1 .. v7}, Lzv2/h;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v2, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v3, p0, Lb30/k6;->E:I

    iget v4, p0, Lb30/k6;->F:I

    invoke-static/range {v0 .. v6}, Lyb0/k;->w(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/k6;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v0, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v2, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v4, p0, Lb30/k6;->E:I

    invoke-static/range {v0 .. v5}, Lse/a;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v2, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v3, p0, Lb30/k6;->E:I

    iget v4, p0, Lb30/k6;->F:I

    invoke-static/range {v0 .. v6}, Llf0/f2;->f(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v2, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v3, p0, Lb30/k6;->E:I

    iget v4, p0, Lb30/k6;->F:I

    invoke-static/range {v0 .. v6}, Lkm1/b;->h(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v2, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v3, p0, Lb30/k6;->E:I

    iget v4, p0, Lb30/k6;->F:I

    invoke-static/range {v0 .. v6}, Lcw2/d;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lb30/k6;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v4

    iget-object v0, p0, Lb30/k6;->z:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb30/k6;->x:Ljava/lang/String;

    iget-object v2, p0, Lb30/k6;->y:Ljava/lang/String;

    iget v5, p0, Lb30/k6;->F:I

    invoke-static/range {v0 .. v5}, Luf/c0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
