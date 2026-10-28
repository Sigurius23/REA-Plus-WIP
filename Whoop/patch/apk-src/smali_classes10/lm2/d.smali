.class public Llm2/d;
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
            "Llm2/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Lcom/whoop/service/network/model/Sport;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llm2/d$a;

    invoke-direct {v0}, Llm2/d$a;-><init>()V

    sput-object v0, Llm2/d;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/service/network/model/Sport;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Workout"

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Llm2/d;

    if-eqz v0, :cond_0

    check-cast p1, Llm2/d;

    iget-object p1, p1, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {p1, v0}, Lcom/whoop/service/network/model/Sport;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
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

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {p1, v0, p2, p3}, Lod1/f;->l(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-static {p1}, Lod1/s;->h(Lcom/whoop/service/network/model/Sport;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "other"

    return-object p1

    :cond_0
    iget-object p1, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {p1}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/Sport;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Landroid/widget/TextView;)V
    .locals 1

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public k()Lcom/whoop/service/network/model/Sport;
    .locals 1

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    return-object v0
.end method

.method public s(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/f;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Z)",
            "Lxg3/g<",
            "Lod1/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {p1, v0, p2, p3, p4}, Lod1/f;->n(Lcom/whoop/service/network/model/Sport;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AddableSport{sport="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object p2, p0, Llm2/d;->w:Lcom/whoop/service/network/model/Sport;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

.method public x(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lxg3/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod1/f;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;)",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2, p3, p4}, Lod1/f;->g(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method
