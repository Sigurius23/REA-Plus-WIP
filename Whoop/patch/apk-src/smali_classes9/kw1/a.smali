.class public final synthetic Lkw1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lc93/m;II)V
    .locals 0

    iput p3, p0, Lkw1/a;->w:I

    iput-object p1, p0, Lkw1/a;->x:Lc93/m;

    iput p2, p0, Lkw1/a;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lkw1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lkw1/a;->y:I

    check-cast p1, Ly3/l;

    iget-object v1, p0, Lkw1/a;->x:Lc93/m;

    invoke-static {v1, v0, p1}, Lx31/f;->d(Lc93/m;ILy3/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkw1/a;->x:Lc93/m;

    iget v1, p0, Lkw1/a;->y:I

    invoke-static {v0, v1, p1}, Lrs2/a;->b(Lc93/m;ILjava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Lkw1/a;->y:I

    check-cast p1, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    iget-object v1, p0, Lkw1/a;->x:Lc93/m;

    invoke-static {v1, v0, p1}, Lkw1/d;->i(Lc93/m;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
