.class public final Lbd3/c;
.super Lzc3/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbd3/t;

.field public final synthetic c:Ljava/lang/String;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbd3/t;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lbd3/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbd3/c;->b:Lbd3/t;

    iput-object p2, p0, Lbd3/c;->c:Ljava/lang/String;

    .line 3
    iget-object p1, p1, Lbd3/t;->a:Lad3/c;

    .line 4
    iget-object p1, p1, Lad3/c;->b:Lcd3/f;

    .line 5
    iput-object p1, p0, Lbd3/c;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbd3/t;Ljava/lang/String;Lyc3/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lbd3/c;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lbd3/c;->b:Lbd3/t;

    iput-object p2, p0, Lbd3/c;->c:Ljava/lang/String;

    iput-object p3, p0, Lbd3/c;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lad3/s;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lad3/s;-><init>(Ljava/lang/Object;ZLyc3/g;)V

    iget-object p1, p0, Lbd3/c;->b:Lbd3/t;

    iget-object v1, p0, Lbd3/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public encodeByte(B)V
    .locals 1

    iget v0, p0, Lbd3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lzc3/a;->encodeByte(B)V

    return-void

    :pswitch_0
    invoke-static {p1}, Ll83/r;->a(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/c;->b(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeInt(I)V
    .locals 1

    iget v0, p0, Lbd3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lzc3/a;->encodeInt(I)V

    return-void

    :pswitch_0
    invoke-static {p1}, Ljava/lang/Integer;->toUnsignedString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/c;->b(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeLong(J)V
    .locals 1

    iget v0, p0, Lbd3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lzc3/a;->encodeLong(J)V

    return-void

    :pswitch_0
    invoke-static {p1, p2}, Ljava/lang/Long;->toUnsignedString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/c;->b(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeShort(S)V
    .locals 1

    iget v0, p0, Lbd3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lzc3/a;->encodeShort(S)V

    return-void

    :pswitch_0
    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/c;->b(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public encodeString(Ljava/lang/String;)V
    .locals 3

    iget v0, p0, Lbd3/c;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lzc3/a;->encodeString(Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lad3/s;

    iget-object v1, p0, Lbd3/c;->d:Ljava/lang/Object;

    check-cast v1, Lyc3/g;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1}, Lad3/s;-><init>(Ljava/lang/Object;ZLyc3/g;)V

    iget-object p1, p0, Lbd3/c;->b:Lbd3/t;

    iget-object v1, p0, Lbd3/c;->c:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget v0, p0, Lbd3/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbd3/c;->d:Ljava/lang/Object;

    check-cast v0, Lcd3/f;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbd3/c;->b:Lbd3/t;

    iget-object v0, v0, Lbd3/t;->a:Lad3/c;

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
