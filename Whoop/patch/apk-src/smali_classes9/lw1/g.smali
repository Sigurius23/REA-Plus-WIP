.class public final synthetic Llw1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/ArrayList;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;II)V
    .locals 0

    iput p3, p0, Llw1/g;->w:I

    iput-object p1, p0, Llw1/g;->x:Ljava/util/ArrayList;

    iput p2, p0, Llw1/g;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llw1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Llw1/g;->y:I

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Llw1/g;->x:Ljava/util/ArrayList;

    invoke-static {v1, v0, p1}, Llw1/h$a;->g(Ljava/util/ArrayList;ILy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Llw1/g;->y:I

    check-cast p1, Ly2/i1;

    iget-object v1, p0, Llw1/g;->x:Ljava/util/ArrayList;

    invoke-static {v1, v0, p1}, Llw1/h$a;->f(Ljava/util/ArrayList;ILy2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
