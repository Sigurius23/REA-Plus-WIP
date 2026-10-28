.class public final synthetic Lb30/e5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb30/q0;


# direct methods
.method public synthetic constructor <init>(Lb30/q0;I)V
    .locals 0

    iput p2, p0, Lb30/e5;->w:I

    iput-object p1, p0, Lb30/e5;->x:Lb30/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb30/e5;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh20/l;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/r5;

    invoke-direct {v0, p1}, Lb30/r5;-><init>(Lh20/l;)V

    iget-object p1, p0, Lb30/e5;->x:Lb30/q0;

    invoke-virtual {p1, v0}, Lb30/q0;->b(Lse/b;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lq20/y;

    new-instance v0, Lb30/s5;

    invoke-direct {v0, p1}, Lb30/s5;-><init>(Lq20/y;)V

    iget-object p1, p0, Lb30/e5;->x:Lb30/q0;

    invoke-virtual {p1, v0}, Lb30/q0;->b(Lse/b;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
