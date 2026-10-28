.class public final synthetic Lx30/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lv30/e;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ZLv30/e;II)V
    .locals 0

    iput p4, p0, Lx30/k1;->w:I

    iput-boolean p1, p0, Lx30/k1;->x:Z

    iput-object p2, p0, Lx30/k1;->y:Lv30/e;

    iput p3, p0, Lx30/k1;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lx30/k1;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget p2, p0, Lx30/k1;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Lx30/k1;->x:Z

    iget-object v1, p0, Lx30/k1;->y:Lv30/e;

    invoke-static {v0, v1, p1, p2}, Ls2/h;->c(ZLv30/e;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Lx30/k1;->z:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Lx30/k1;->x:Z

    iget-object v1, p0, Lx30/k1;->y:Lv30/e;

    invoke-static {v0, v1, p1, p2}, Ls2/h;->c(ZLv30/e;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
