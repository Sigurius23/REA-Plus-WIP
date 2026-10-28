.class public final Lqx/p0;
.super Lcom/squareup/moshi/JsonAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lqx/p0;->a:I

    invoke-direct {p0}, Lcom/squareup/moshi/JsonAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lqx/p0;->a:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, -0x8000

    const/16 v1, 0x7fff

    const-string v2, "a short"

    invoke-static {p1, v2, v0, v1}, Lqx/s0;->a(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;II)I

    move-result p1

    int-to-short p1, p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextInt()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextDouble()D

    move-result-wide v0

    double-to-float v0, v0

    iget-boolean v1, p1, Lcom/squareup/moshi/JsonReader;->E:Z

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/squareup/moshi/JsonDataException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "JSON forbids NaN and infinities: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_2

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v1, Lcom/squareup/moshi/JsonDataException;

    const-string v2, "\""

    const/16 v3, 0x22

    invoke-static {v3, v2, v0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->b()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Expected a char but was "

    const-string v3, " at path "

    invoke-static {v2, v0, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/squareup/moshi/JsonDataException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_5
    const/16 v0, -0x80

    const/16 v1, 0xff

    const-string v2, "a byte"

    invoke-static {p1, v2, v0, v1}, Lqx/s0;->a(Lcom/squareup/moshi/JsonReader;Ljava/lang/String;II)I

    move-result p1

    int-to-byte p1, p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->h()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p1}, Lcom/squareup/moshi/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toJson(Lqx/c0;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lqx/p0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/Short;

    invoke-virtual {p2}, Ljava/lang/Short;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lqx/c0;->p0(J)Lqx/c0;

    return-void

    :pswitch_0
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lqx/c0;->p0(J)Lqx/c0;

    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lqx/c0;->p0(J)Lqx/c0;

    return-void

    :pswitch_2
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p2}, Lqx/c0;->x0(Ljava/lang/Float;)Lqx/c0;

    return-void

    :pswitch_3
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lqx/c0;->o0(D)Lqx/c0;

    return-void

    :pswitch_4
    check-cast p2, Ljava/lang/Character;

    invoke-virtual {p2}, Ljava/lang/Character;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqx/c0;->F0(Ljava/lang/String;)Lqx/c0;

    return-void

    :pswitch_5
    check-cast p2, Ljava/lang/Byte;

    invoke-virtual {p2}, Ljava/lang/Byte;->intValue()I

    move-result p2

    and-int/lit16 p2, p2, 0xff

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lqx/c0;->p0(J)Lqx/c0;

    return-void

    :pswitch_6
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lqx/c0;->M0(Z)Lqx/c0;

    return-void

    :pswitch_7
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lqx/c0;->F0(Ljava/lang/String;)Lqx/c0;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lqx/p0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "JsonAdapter(Short)"

    return-object v0

    :pswitch_0
    const-string v0, "JsonAdapter(Long)"

    return-object v0

    :pswitch_1
    const-string v0, "JsonAdapter(Integer)"

    return-object v0

    :pswitch_2
    const-string v0, "JsonAdapter(Float)"

    return-object v0

    :pswitch_3
    const-string v0, "JsonAdapter(Double)"

    return-object v0

    :pswitch_4
    const-string v0, "JsonAdapter(Character)"

    return-object v0

    :pswitch_5
    const-string v0, "JsonAdapter(Byte)"

    return-object v0

    :pswitch_6
    const-string v0, "JsonAdapter(Boolean)"

    return-object v0

    :pswitch_7
    const-string v0, "JsonAdapter(String)"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
