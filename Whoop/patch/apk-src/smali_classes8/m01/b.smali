.class public final synthetic Lm01/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Li51/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Li51/c;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p4, p0, Lm01/b;->w:I

    iput-object p1, p0, Lm01/b;->x:Li51/c;

    iput-object p2, p0, Lm01/b;->y:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lm01/b;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lm01/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm01/b;->x:Li51/c;

    iget-object v1, p0, Lm01/b;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lm01/b;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm01/d;->k(Li51/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm01/b;->x:Li51/c;

    iget-object v1, p0, Lm01/b;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lm01/b;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lm01/d;->l(Li51/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
