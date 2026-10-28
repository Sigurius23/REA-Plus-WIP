.class public final synthetic Lyk2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIILandroidx/compose/ui/Modifier;)V
    .locals 0

    iput p3, p0, Lyk2/b;->w:I

    iput-object p4, p0, Lyk2/b;->x:Landroidx/compose/ui/Modifier;

    iput p1, p0, Lyk2/b;->y:I

    iput p2, p0, Lyk2/b;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lyk2/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyk2/b;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lyk2/b;->y:I

    iget v2, p0, Lyk2/b;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lz51/i;->c(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lyk2/b;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lyk2/b;->y:I

    iget v2, p0, Lyk2/b;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lyn2/d;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lyk2/b;->x:Landroidx/compose/ui/Modifier;

    iget v1, p0, Lyk2/b;->y:I

    iget v2, p0, Lyk2/b;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lyk2/c;->a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
