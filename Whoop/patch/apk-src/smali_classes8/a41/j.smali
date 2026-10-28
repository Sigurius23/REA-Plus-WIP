.class public final synthetic La41/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ZLc93/a;II)V
    .locals 0

    iput p4, p0, La41/j;->w:I

    iput-boolean p1, p0, La41/j;->x:Z

    iput-object p2, p0, La41/j;->y:Lc93/a;

    iput p3, p0, La41/j;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La41/j;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, La41/j;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, La41/j;->x:Z

    iget-object v1, p0, La41/j;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Lse/h;->b(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, La41/j;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, La41/j;->x:Z

    iget-object v1, p0, La41/j;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Lse/h;->j(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, La41/j;->y:Lc93/a;

    iget-boolean v1, p0, La41/j;->x:Z

    iget v2, p0, La41/j;->z:I

    invoke-static {v0, v1, p1, v2, p2}, Lpq2/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, La41/j;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, La41/j;->x:Z

    iget-object v1, p0, La41/j;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Lse/g;->i(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, La41/j;->y:Lc93/a;

    iget-boolean v1, p0, La41/j;->x:Z

    iget v2, p0, La41/j;->z:I

    invoke-static {v0, v1, p1, v2, p2}, Li31/h;->b(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, La41/j;->y:Lc93/a;

    iget-boolean v1, p0, La41/j;->x:Z

    iget v2, p0, La41/j;->z:I

    invoke-static {v0, v1, p1, v2, p2}, Lh31/s;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, La41/j;->y:Lc93/a;

    iget-boolean v1, p0, La41/j;->x:Z

    iget v2, p0, La41/j;->z:I

    invoke-static {v0, v1, p1, v2, p2}, Lcp0/k;->d(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    iget p2, p0, La41/j;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, La41/j;->x:Z

    iget-object v1, p0, La41/j;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Lse/b;->a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, La41/j;->y:Lc93/a;

    iget-boolean v1, p0, La41/j;->x:Z

    iget v2, p0, La41/j;->z:I

    invoke-static {v0, v1, p1, v2, p2}, La41/l;->d(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
