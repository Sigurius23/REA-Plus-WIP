.class public final synthetic Lgh0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput p3, p0, Lgh0/c;->w:I

    iput-object p1, p0, Lgh0/c;->x:Ljava/lang/String;

    iput-object p4, p0, Lgh0/c;->y:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lgh0/c;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lgh0/c;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgh0/c;->x:Ljava/lang/String;

    iget-object v1, p0, Lgh0/c;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lgh0/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lp62/e;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgh0/c;->x:Ljava/lang/String;

    iget-object v1, p0, Lgh0/c;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lgh0/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lgh0/c;->x:Ljava/lang/String;

    iget-object v1, p0, Lgh0/c;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lgh0/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/s;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lgh0/c;->x:Ljava/lang/String;

    iget-object v1, p0, Lgh0/c;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lgh0/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lno0/s;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lgh0/c;->x:Ljava/lang/String;

    iget-object v1, p0, Lgh0/c;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lgh0/c;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lgh0/e;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
