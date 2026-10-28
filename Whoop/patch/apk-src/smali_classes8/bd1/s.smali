.class public final synthetic Lbd1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lbd1/s;->w:I

    iput p1, p0, Lbd1/s;->x:F

    iput-object p2, p0, Lbd1/s;->z:Ljava/lang/Object;

    iput p3, p0, Lbd1/s;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm91/u;FII)V
    .locals 0

    .line 2
    iput p4, p0, Lbd1/s;->w:I

    iput-object p1, p0, Lbd1/s;->z:Ljava/lang/Object;

    iput p2, p0, Lbd1/s;->x:F

    iput p3, p0, Lbd1/s;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbd1/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbd1/s;->z:Ljava/lang/Object;

    check-cast v0, Ly11/f;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbd1/s;->x:F

    iget v2, p0, Lbd1/s;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ly11/c;->g(Ly11/f;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbd1/s;->z:Ljava/lang/Object;

    check-cast v0, Ly01/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbd1/s;->x:F

    iget v2, p0, Lbd1/s;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ly01/b;->e(Ly01/c;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbd1/s;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbd1/s;->x:F

    iget v2, p0, Lbd1/s;->y:I

    invoke-static {v1, v0, v2, p1, p2}, Lsg2/p;->g(FLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbd1/s;->z:Ljava/lang/Object;

    check-cast v0, Li01/h;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbd1/s;->x:F

    iget v2, p0, Lbd1/s;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Li01/f;->a(Li01/h;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbd1/s;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v1, p0, Lbd1/s;->x:F

    iget v2, p0, Lbd1/s;->y:I

    invoke-static {v1, v0, v2, p1, p2}, Lbd1/t;->a(FLjava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
