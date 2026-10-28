.class public final Lpj/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lpj/f;

.field public final b:I

.field public final c:Lpj/f;


# direct methods
.method public constructor <init>(Lpj/f;ILpj/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj/p;->a:Lpj/f;

    iput p2, p0, Lpj/p;->b:I

    iput-object p3, p0, Lpj/p;->c:Lpj/f;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lpj/p;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lpj/p;

    iget-object v0, p0, Lpj/p;->a:Lpj/f;

    iget-object v1, p1, Lpj/p;->a:Lpj/f;

    invoke-virtual {v0, v1}, Lpj/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, Lpj/p;->b:I

    iget v1, p1, Lpj/p;->b:I

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lpj/p;->c:Lpj/f;

    iget-object p1, p1, Lpj/p;->c:Lpj/f;

    invoke-virtual {v0, p1}, Lpj/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lpj/p;->a:Lpj/f;

    invoke-virtual {v0}, Lpj/f;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lpj/p;->b:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lpj/p;->c:Lpj/f;

    invoke-virtual {v1}, Lpj/f;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PinNudgePosition(pos="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lpj/p;->a:Lpj/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", placement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lpj/p;->b:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "null"

    goto :goto_0

    :pswitch_0
    const-string v1, "LEFT_END"

    goto :goto_0

    :pswitch_1
    const-string v1, "LEFT_START"

    goto :goto_0

    :pswitch_2
    const-string v1, "BOTTOM_END"

    goto :goto_0

    :pswitch_3
    const-string v1, "BOTTOM_START"

    goto :goto_0

    :pswitch_4
    const-string v1, "RIGHT_END"

    goto :goto_0

    :pswitch_5
    const-string v1, "RIGHT_START"

    goto :goto_0

    :pswitch_6
    const-string v1, "TOP_END"

    goto :goto_0

    :pswitch_7
    const-string v1, "TOP_START"

    goto :goto_0

    :pswitch_8
    const-string v1, "LEFT"

    goto :goto_0

    :pswitch_9
    const-string v1, "BOTTOM"

    goto :goto_0

    :pswitch_a
    const-string v1, "RIGHT"

    goto :goto_0

    :pswitch_b
    const-string v1, "TOP"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", arrow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lpj/p;->c:Lpj/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
