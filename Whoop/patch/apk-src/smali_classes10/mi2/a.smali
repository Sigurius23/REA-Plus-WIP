.class public final synthetic Lmi2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lji2/l;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lji2/l;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p4, p0, Lmi2/a;->w:I

    iput-object p1, p0, Lmi2/a;->x:Lji2/l;

    iput-object p2, p0, Lmi2/a;->y:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lmi2/a;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lmi2/a;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmi2/a;->x:Lji2/l;

    iget-object v1, p0, Lmi2/a;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lmi2/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lmi2/l;->b(Lji2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmi2/a;->x:Lji2/l;

    iget-object v1, p0, Lmi2/a;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lmi2/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lmi2/l;->c(Lji2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmi2/a;->x:Lji2/l;

    iget-object v1, p0, Lmi2/a;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lmi2/a;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lmi2/c;->l(Lji2/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
