.class public final synthetic Lst1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrt1/h$b;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lrt1/h$b;II)V
    .locals 0

    iput p3, p0, Lst1/a;->w:I

    iput-object p1, p0, Lst1/a;->x:Lrt1/h$b;

    iput p2, p0, Lst1/a;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lst1/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lst1/a;->x:Lrt1/h$b;

    iget v1, p0, Lst1/a;->y:I

    invoke-static {v0, v1, p1, p2}, Lst1/o;->a(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lst1/a;->x:Lrt1/h$b;

    iget v1, p0, Lst1/a;->y:I

    invoke-static {v0, v1, p1, p2}, Lst1/i;->a(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lst1/a;->x:Lrt1/h$b;

    iget v1, p0, Lst1/a;->y:I

    invoke-static {v0, v1, p1, p2}, Lst1/c;->a(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
