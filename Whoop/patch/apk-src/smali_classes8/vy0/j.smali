.class public final synthetic Lvy0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lvy0/j;->w:I

    iput-object p1, p0, Lvy0/j;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvy0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvy0/j;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lvy0/p;->O(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lvy0/j;->x:Ljava/lang/String;

    check-cast p1, Li3/z;

    invoke-static {v0, p1}, Lvy0/p;->C(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
