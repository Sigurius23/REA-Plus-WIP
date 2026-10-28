.class public final synthetic Lt10/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZLc93/a;II)V
    .locals 0

    iput p4, p0, Lt10/k;->w:I

    iput-boolean p1, p0, Lt10/k;->x:Z

    iput-object p2, p0, Lt10/k;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lt10/k;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Lt10/k;->x:Z

    iget-object v1, p0, Lt10/k;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Ls2/d;->f(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Lt10/k;->x:Z

    iget-object v1, p0, Lt10/k;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Ls2/d;->a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_1
    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-boolean v0, p0, Lt10/k;->x:Z

    iget-object v1, p0, Lt10/k;->y:Lc93/a;

    invoke-static {v0, v1, p1, p2}, Lt10/o;->c(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
