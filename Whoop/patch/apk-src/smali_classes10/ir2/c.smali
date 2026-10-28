.class public final synthetic Lir2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lir2/b;

.field public final synthetic y:Z

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lir2/b;ZII)V
    .locals 0

    iput p4, p0, Lir2/c;->w:I

    iput-object p1, p0, Lir2/c;->x:Lir2/b;

    iput-boolean p2, p0, Lir2/c;->y:Z

    iput p3, p0, Lir2/c;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lir2/c;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lir2/c;->x:Lir2/b;

    iget-boolean v1, p0, Lir2/c;->y:Z

    iget v2, p0, Lir2/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lir2/f;->b(Lir2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lir2/c;->x:Lir2/b;

    iget-boolean v1, p0, Lir2/c;->y:Z

    iget v2, p0, Lir2/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lir2/d;->b(Lir2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
