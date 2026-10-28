.class public final synthetic Lm92/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm92/j;


# direct methods
.method public synthetic constructor <init>(Lm92/j;I)V
    .locals 0

    iput p2, p0, Lm92/i;->w:I

    iput-object p1, p0, Lm92/i;->x:Lm92/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lm92/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm92/i;->x:Lm92/j;

    check-cast p1, Lod1/u$a;

    invoke-static {v0, p1}, Lm92/j;->i(Lm92/j;Lod1/u$a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm92/i;->x:Lm92/j;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lm92/j;->b(Lm92/j;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
