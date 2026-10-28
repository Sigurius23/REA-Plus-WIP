.class public Lcom/whoop/service/network/model/cycles/PostWorkoutDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    }
.end annotation


# instance fields
.field during:Lcom/whoop/service/network/model/cycles/Period;

.field gpsEnabled:Z

.field public source:Ljava/lang/String;

.field sportId:I

.field timezoneOffset:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;->during:Lcom/whoop/service/network/model/cycles/Period;

    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;->timezoneOffset:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;->sportId:I

    iput-object p4, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;->source:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto;->gpsEnabled:Z

    return-void
.end method

.method public static builder()Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;
    .locals 1

    new-instance v0, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;

    invoke-direct {v0}, Lcom/whoop/service/network/model/cycles/PostWorkoutDto$PostWorkoutDtoBuilder;-><init>()V

    return-object v0
.end method
