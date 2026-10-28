.class public Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/network/model/cycles/PostWorkoutDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PostWorkoutDtoBuilder"
.end annotation


# instance fields
.field private during:Lcom/whoop/service/network/model/cycles/Period;

.field private gpsEnabled:Z

.field private source:Ljava/lang/String;

.field private sportId:I

.field private timezoneOffset:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/whoop/service/network/model/cycles/PostWorkoutDto;
    .locals 6

    new-instance v0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->during:Lcom/whoop/service/network/model/cycles/Period;

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->timezoneOffset:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->sportId:I

    iget-object v4, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->source:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->gpsEnabled:Z

    invoke-direct/range {v0 .. v5}, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;-><init>(Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ILjava/lang/String;Z)V

    return-object v0
.end method

.method public during(Lcom/whoop/service/network/model/cycles/Period;)Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->during:Lcom/whoop/service/network/model/cycles/Period;

    return-object p0
.end method

.method public gpsEnabled(Z)Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->gpsEnabled:Z

    return-object p0
.end method

.method public source(Ljava/lang/String;)Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->source:Ljava/lang/String;

    return-object p0
.end method

.method public sportId(I)Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    .locals 0

    iput p1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->sportId:I

    return-object p0
.end method

.method public timezoneOffset(Ljava/lang/String;)Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->timezoneOffset:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PostWorkoutDto.PostWorkoutDtoBuilder(during="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timezoneOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->timezoneOffset:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sportId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->sportId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->source:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->sportId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", gpsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;->gpsEnabled:Z

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
