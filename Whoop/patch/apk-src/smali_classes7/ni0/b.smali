.class public final synthetic Lni0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lad3/c;


# direct methods
.method public synthetic constructor <init>(Lad3/c;I)V
    .locals 0

    iput p2, p0, Lni0/b;->w:I

    iput-object p1, p0, Lni0/b;->x:Lad3/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lni0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lni0/b;->x:Lad3/c;

    invoke-static {v0}, Lzm0/d;->e(Lad3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lni0/b;->x:Lad3/c;

    invoke-static {v0}, Lni0/c;->k(Lad3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lni0/b;->x:Lad3/c;

    invoke-static {v0}, Lni0/c;->e(Lad3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lni0/b;->x:Lad3/c;

    invoke-static {v0}, Lni0/c;->D(Lad3/c;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
