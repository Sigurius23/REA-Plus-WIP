.class public final synthetic Lkx1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljb1/b;


# direct methods
.method public synthetic constructor <init>(Ljb1/b;I)V
    .locals 0

    iput p2, p0, Lkx1/a;->w:I

    iput-object p1, p0, Lkx1/a;->x:Ljb1/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lkx1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkx1/a;->x:Ljb1/b;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Lyi1/f;->e(Ljb1/b;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lkx1/a;->x:Ljb1/b;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Lkx1/c;->e(Ljb1/b;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
