.class public final synthetic Le41/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg1/n7;


# direct methods
.method public synthetic constructor <init>(Lg1/n7;I)V
    .locals 0

    iput p2, p0, Le41/b;->w:I

    iput-object p1, p0, Le41/b;->x:Lg1/n7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le41/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le41/b;->x:Lg1/n7;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Lw31/e;->f(Lg1/n7;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Le41/b;->x:Lg1/n7;

    check-cast p1, Ly3/c;

    invoke-static {v0, p1}, Le41/g;->b(Lg1/n7;Ly3/c;)Ly3/j;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
