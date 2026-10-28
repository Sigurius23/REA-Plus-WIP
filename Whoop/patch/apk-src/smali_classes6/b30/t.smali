.class public final synthetic Lb30/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/m0;


# direct methods
.method public synthetic constructor <init>(Lb30/m0;I)V
    .locals 0

    iput p2, p0, Lb30/t;->w:I

    iput-object p1, p0, Lb30/t;->x:Lb30/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lb30/n;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/d1;

    invoke-direct {v0, p1}, Lb30/d1;-><init>(Lb30/n;)V

    iget-object p1, p0, Lb30/t;->x:Lb30/m0;

    invoke-virtual {p1, v0}, Lb30/m0;->b(Lb30/h1;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/f1;

    invoke-direct {v0, p1}, Lb30/f1;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lb30/t;->x:Lb30/m0;

    invoke-virtual {p1, v0}, Lb30/m0;->b(Lb30/h1;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lb30/q;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/e1;

    invoke-direct {v0, p1}, Lb30/e1;-><init>(Lb30/q;)V

    iget-object p1, p0, Lb30/t;->x:Lb30/m0;

    invoke-virtual {p1, v0}, Lb30/m0;->b(Lb30/h1;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
