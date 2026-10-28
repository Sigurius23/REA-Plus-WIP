.class public final synthetic Lih0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lih0/m;->w:I

    iput-object p2, p0, Lih0/m;->x:Ljava/lang/Object;

    iput-object p3, p0, Lih0/m;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lih0/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/m;->x:Ljava/lang/Object;

    check-cast v0, Lah0/i$a;

    iget-object v1, p0, Lih0/m;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lih0/e0;->s(Lah0/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lih0/m;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lih0/m;->y:Ljava/lang/Object;

    check-cast v1, Ly3/c;

    invoke-static {v0, v1}, Lih0/n$a;->f(Lp1/t2;Ly3/c;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
