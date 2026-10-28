.class public final synthetic Lcp0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Lc93/a;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    iput v0, p0, Lcp0/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcp0/i;->y:Lc93/a;

    iput-object p2, p0, Lcp0/i;->x:Ljava/lang/String;

    iput p1, p0, Lcp0/i;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lc93/a;II)V
    .locals 0

    .line 2
    iput p4, p0, Lcp0/i;->w:I

    iput-object p1, p0, Lcp0/i;->x:Ljava/lang/String;

    iput-object p2, p0, Lcp0/i;->y:Lc93/a;

    iput p3, p0, Lcp0/i;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcp0/i;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ly31/d;->m(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lw01/g;->j(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lvy0/p;->j(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lv80/b;->k(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lv01/l;->h(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lu11/i;->d(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lte1/b;->a(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lnr0/f;->g(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ln31/b;->l(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lhh0/g;->a(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lhe1/a;->g(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lcp0/i;->y:Lc93/a;

    iget-object v1, p0, Lcp0/i;->x:Ljava/lang/String;

    iget v2, p0, Lcp0/i;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lcp0/k;->a(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
