.class public final synthetic Lb1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb1/c;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lb1/c;Lc93/a;II)V
    .locals 0

    iput p4, p0, Lb1/a;->w:I

    iput-object p1, p0, Lb1/a;->x:Lb1/c;

    iput-object p2, p0, Lb1/a;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb1/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch v0, :pswitch_data_0

    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb1/a;->x:Lb1/c;

    iget-object v1, p0, Lb1/a;->y:Lc93/a;

    invoke-virtual {v0, v1, p1, p2}, Lb1/c;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 p2, 0x7

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lb1/a;->x:Lb1/c;

    iget-object v1, p0, Lb1/a;->y:Lc93/a;

    invoke-virtual {v0, v1, p1, p2}, Lb1/c;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
