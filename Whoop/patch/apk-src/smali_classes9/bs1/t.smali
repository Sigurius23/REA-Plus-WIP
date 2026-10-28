.class public final synthetic Lbs1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg2/i;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lg2/i;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lbs1/t;->w:I

    iput-object p1, p0, Lbs1/t;->x:Lg2/i;

    iput-object p2, p0, Lbs1/t;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbs1/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lbs1/t;->x:Lg2/i;

    iget-object v1, p0, Lbs1/t;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Luw0/l;->l(Lg2/i;Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbs1/t;->x:Lg2/i;

    iget-object v1, p0, Lbs1/t;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lbs1/d0;->b(Lg2/i;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbs1/t;->x:Lg2/i;

    iget-object v1, p0, Lbs1/t;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lbs1/c0;->u0(Lg2/i;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
