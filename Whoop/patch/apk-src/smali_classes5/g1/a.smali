.class public final synthetic Lg1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Lx1/b;


# direct methods
.method public synthetic constructor <init>(FFLx1/b;II)V
    .locals 0

    iput p5, p0, Lg1/a;->w:I

    iput p1, p0, Lg1/a;->x:F

    iput p2, p0, Lg1/a;->y:F

    iput-object p3, p0, Lg1/a;->z:Lx1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg1/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/16 p2, 0x1b7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lg1/a;->x:F

    iget v1, p0, Lg1/a;->y:F

    iget-object v2, p0, Lg1/a;->z:Lx1/b;

    invoke-static {v0, v1, v2, p1, p2}, Ll1/a;->a(FFLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/16 p2, 0x1b7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget v0, p0, Lg1/a;->x:F

    iget v1, p0, Lg1/a;->y:F

    iget-object v2, p0, Lg1/a;->z:Lx1/b;

    invoke-static {v0, v1, v2, p1, p2}, Lg1/k;->c(FFLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
