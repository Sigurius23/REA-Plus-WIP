.class public final synthetic Lza2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lza2/j;


# direct methods
.method public synthetic constructor <init>(Lza2/j;I)V
    .locals 0

    iput p2, p0, Lza2/i;->w:I

    iput-object p1, p0, Lza2/i;->x:Lza2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lza2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lza2/i;->x:Lza2/j;

    check-cast p1, Lza2/a;

    invoke-static {v0, p1}, Lza2/j;->z(Lza2/j;Lza2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lza2/i;->x:Lza2/j;

    check-cast p1, Leb2/b;

    invoke-static {v0, p1}, Lza2/j;->C(Lza2/j;Leb2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
