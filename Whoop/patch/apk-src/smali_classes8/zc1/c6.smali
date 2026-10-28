.class public final synthetic Lzc1/c6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/g1;

.field public final synthetic y:Lp1/g1;


# direct methods
.method public synthetic constructor <init>(Lp1/g1;Lp1/g1;I)V
    .locals 0

    iput p3, p0, Lzc1/c6;->w:I

    iput-object p1, p0, Lzc1/c6;->x:Lp1/g1;

    iput-object p2, p0, Lzc1/c6;->y:Lp1/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzc1/c6;->w:I

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzc1/c6;->x:Lp1/g1;

    iget-object v1, p0, Lzc1/c6;->y:Lp1/g1;

    invoke-static {v0, v1, p1}, Lzc1/d6;->b(Lp1/g1;Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzc1/c6;->x:Lp1/g1;

    iget-object v1, p0, Lzc1/c6;->y:Lp1/g1;

    invoke-static {v0, v1, p1}, Lzc1/d6;->d(Lp1/g1;Lp1/g1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
