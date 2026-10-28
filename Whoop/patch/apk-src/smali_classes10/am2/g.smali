.class public final synthetic Lam2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;II)V
    .locals 0

    iput p4, p0, Lam2/g;->w:I

    iput-object p1, p0, Lam2/g;->x:Lc93/a;

    iput-object p2, p0, Lam2/g;->y:Lc93/a;

    iput p3, p0, Lam2/g;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lam2/g;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lsg2/v;->d(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lqs0/b;->d(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lql2/a;->h(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lps0/a;->a(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/u;->j(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/u;->e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/s;->h(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/f;->c(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/e;->a(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm22/e;->c(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Llq2/s;->e(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lk80/o;->a(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lih2/b;->r(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lih2/b;->d(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Leo0/g;->g(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Leo0/a;->a(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lam2/g;->x:Lc93/a;

    iget-object v1, p0, Lam2/g;->y:Lc93/a;

    iget v2, p0, Lam2/g;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lam2/k;->o(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
