.class public final synthetic Lk71/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ZIII)V
    .locals 0

    iput p4, p0, Lk71/k;->w:I

    iput-boolean p1, p0, Lk71/k;->x:Z

    iput p2, p0, Lk71/k;->y:I

    iput p3, p0, Lk71/k;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lk71/k;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lk71/k;->x:Z

    iget v1, p0, Lk71/k;->y:I

    iget v2, p0, Lk71/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Ll31/a;->a(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v0, p0, Lk71/k;->x:Z

    iget v1, p0, Lk71/k;->y:I

    iget v2, p0, Lk71/k;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lk71/l;->e(ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
