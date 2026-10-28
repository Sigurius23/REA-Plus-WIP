.class public Llm2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llm2/b;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Llm2/c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llm2/c$a;

    invoke-direct {v0}, Llm2/c$a;-><init>()V

    sput-object v0, Llm2/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llm2/c;->w:Z

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Llm2/c;->k()Lcom/whoop/service/network/model/cycles/Activity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Activity;->getNameKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Llm2/c;

    if-eqz v0, :cond_1

    check-cast p1, Llm2/c;

    iget-boolean p1, p1, Llm2/c;->w:Z

    iget-boolean v0, p0, Llm2/c;->w:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/f;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lxg3/g<",
            "Lod1/k;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Llm2/c;->w:Z

    invoke-virtual {p1, v0, p2, p3}, Lod1/f;->j(ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Llm2/c;->w:Z

    if-eqz v0, :cond_0

    sget v0, Luv0/c;->a:I

    goto :goto_0

    :cond_0
    sget v0, Luv0/c;->b:I

    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Llm2/c;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public i(Landroid/widget/TextView;)V
    .locals 1

    iget-boolean v0, p0, Llm2/c;->w:Z

    if-eqz v0, :cond_0

    sget v0, Luv0/c;->a:I

    goto :goto_0

    :cond_0
    sget v0, Luv0/c;->b:I

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public k()Lcom/whoop/service/network/model/cycles/Activity;
    .locals 2

    new-instance v0, Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-virtual {p0}, Llm2/c;->s()Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/whoop/service/network/model/cycles/SleepActivity;-><init>(Z)V

    return-object v0
.end method

.method public s()Z
    .locals 1

    iget-boolean v0, p0, Llm2/c;->w:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AddableSleep{isNap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llm2/c;->w:Z

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-boolean p2, p0, Llm2/c;->w:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
