.class public final synthetic Lau1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    const/4 p2, 0x7

    iput p2, p0, Lau1/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lau1/f;->y:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IIB)V
    .locals 0

    .line 2
    iput p3, p0, Lau1/f;->w:I

    iput-object p1, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lau1/f;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lau1/f;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, p2, p1, v1}, Lu0/b;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, v1, p1, p2}, Lqt2/s;->g(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, v1, p1, p2}, Lpj2/t;->m(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, v1, p1, p2}, Lhy0/n;->g(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, v1, p1, p2}, Lc51/k;->l(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, v1, p1, p2}, Lc41/c2;->b(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p2, p0, Lau1/f;->y:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1, p2}, Lup/d;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lau1/f;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lau1/f;->y:I

    invoke-static {v0, v1, p1, p2}, Lau1/g;->a(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
