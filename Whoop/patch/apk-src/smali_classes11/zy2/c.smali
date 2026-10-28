.class public final synthetic Lzy2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lzy2/c;->w:I

    iput-object p1, p0, Lzy2/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lzy2/c;->z:Ljava/lang/Object;

    iput p3, p0, Lzy2/c;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lzy2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzy2/c;->y:Ljava/lang/Object;

    check-cast v0, Lc51/s;

    iget-object v1, p0, Lzy2/c;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/Modifier;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lzy2/c;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lc51/k;->e(Lc51/s;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzy2/c;->y:Ljava/lang/Object;

    check-cast v0, Lzy2/f$b;

    iget-object v1, p0, Lzy2/c;->z:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lzy2/c;->x:I

    invoke-static {v0, v1, v2, p1, p2}, Lzy2/d;->e(Lzy2/f$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
