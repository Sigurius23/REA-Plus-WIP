.class public final synthetic Ln22/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lc93/m;II)V
    .locals 0

    iput p3, p0, Ln22/a;->w:I

    iput-object p1, p0, Ln22/a;->x:Lc93/m;

    iput p2, p0, Ln22/a;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ln22/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln22/a;->x:Lc93/m;

    iget v1, p0, Ln22/a;->y:I

    invoke-static {v0, v1, p1, p2}, Lzc1/k2;->b(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ln22/a;->x:Lc93/m;

    iget v1, p0, Ln22/a;->y:I

    invoke-static {v0, v1, p1, p2}, Lvt2/f;->j(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ln22/a;->x:Lc93/m;

    iget v1, p0, Ln22/a;->y:I

    invoke-static {v0, v1, p1, p2}, Ln22/b;->b(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
