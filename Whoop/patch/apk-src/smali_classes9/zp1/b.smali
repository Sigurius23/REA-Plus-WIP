.class public final synthetic Lzp1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzp1/c;


# direct methods
.method public synthetic constructor <init>(Lzp1/c;I)V
    .locals 0

    iput p2, p0, Lzp1/b;->w:I

    iput-object p1, p0, Lzp1/b;->x:Lzp1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzp1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzp1/b;->x:Lzp1/c;

    check-cast p1, Llb1/z0;

    invoke-static {v0, p1}, Lzp1/c;->b(Lzp1/c;Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzp1/b;->x:Lzp1/c;

    check-cast p1, Ljb1/b;

    invoke-static {v0, p1}, Lzp1/c;->a(Lzp1/c;Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
