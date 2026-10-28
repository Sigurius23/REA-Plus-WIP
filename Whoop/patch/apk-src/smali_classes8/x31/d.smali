.class public final synthetic Lx31/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;II)V
    .locals 0

    iput p3, p0, Lx31/d;->w:I

    iput p2, p0, Lx31/d;->x:I

    iput-object p1, p0, Lx31/d;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lx31/d;->w:I

    check-cast p1, Ljava/util/List;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lx31/d;->x:I

    iget-object v1, p0, Lx31/d;->y:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lx31/f;->c(ILp1/c1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lx31/d;->x:I

    iget-object v1, p0, Lx31/d;->y:Lp1/c1;

    invoke-static {v0, v1, p1, p2, p3}, Lx31/f;->m(ILp1/c1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
