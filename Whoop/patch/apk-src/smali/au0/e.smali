.class public final synthetic Lau0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    iput p3, p0, Lau0/e;->w:I

    iput p1, p0, Lau0/e;->x:I

    iput p2, p0, Lau0/e;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lau0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lau0/e;->y:I

    check-cast p1, Ltb/a;

    iget v1, p0, Lau0/e;->x:I

    invoke-static {v1, v0, p1}, Lqu0/c;->d(IILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lau0/e;->y:I

    check-cast p1, Ltb/a;

    iget v1, p0, Lau0/e;->x:I

    invoke-static {v1, v0, p1}, Lhu0/c;->f(IILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lau0/e;->y:I

    check-cast p1, Ltb/a;

    iget v1, p0, Lau0/e;->x:I

    invoke-static {v1, v0, p1}, Lau0/f;->k(IILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
