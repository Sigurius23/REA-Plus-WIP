.class public final synthetic Liq2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lad3/c;

.field public final synthetic y:Lcd3/d;


# direct methods
.method public synthetic constructor <init>(Lad3/c;Lcd3/d;I)V
    .locals 0

    iput p3, p0, Liq2/a;->w:I

    iput-object p1, p0, Liq2/a;->x:Lad3/c;

    iput-object p2, p0, Liq2/a;->y:Lcd3/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Liq2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liq2/a;->y:Lcd3/d;

    check-cast p1, Lad3/g;

    iget-object v1, p0, Liq2/a;->x:Lad3/c;

    invoke-static {v1, v0, p1}, Lmu2/f;->R(Lad3/c;Lcd3/d;Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liq2/a;->y:Lcd3/d;

    check-cast p1, Lad3/g;

    iget-object v1, p0, Liq2/a;->x:Lad3/c;

    invoke-static {v1, v0, p1}, Liq2/b;->a(Lad3/c;Lcd3/d;Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
