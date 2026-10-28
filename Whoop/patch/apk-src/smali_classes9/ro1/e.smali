.class public final synthetic Lro1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lro1/i;


# direct methods
.method public synthetic constructor <init>(Lro1/i;I)V
    .locals 0

    iput p2, p0, Lro1/e;->w:I

    iput-object p1, p0, Lro1/e;->x:Lro1/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lro1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lro1/e;->x:Lro1/i;

    check-cast p1, Lro1/g;

    invoke-static {v0, p1}, Lro1/f;->h(Lro1/i;Lro1/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lro1/e;->x:Lro1/i;

    invoke-static {v0, p1}, Lro1/f;->k(Lro1/i;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
