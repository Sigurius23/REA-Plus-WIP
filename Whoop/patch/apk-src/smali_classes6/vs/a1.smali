.class public final Lvs/a1;
.super Lcom/google/crypto/tink/shaded/protobuf/v;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/p0;


# instance fields
.field public final synthetic y:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lvs/a1;->y:I

    .line 2
    invoke-static {}, Lvs/i4;->z()Lvs/i4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvs/a1;->y:I

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/v;-><init>(Lcom/google/crypto/tink/shaded/protobuf/x;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/crypto/tink/shaded/protobuf/x;
    .locals 1

    iget v0, p0, Lvs/a1;->y:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/v;->w:Lcom/google/crypto/tink/shaded/protobuf/x;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvs/a1;->y:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->d()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->d()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->d()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->d()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/v;->d()Lcom/google/crypto/tink/shaded/protobuf/v;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
