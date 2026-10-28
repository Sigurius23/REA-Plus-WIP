.class public Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/service/network/model/cycles/PostSleepDto;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PostSleepDtoBuilder"
.end annotation


# instance fields
.field private during:Lcom/whoop/service/network/model/cycles/Period;

.field private isNap:Z

.field private timezoneOffset:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/whoop/service/network/model/cycles/PostSleepDto;
    .locals 4

    new-instance v0, Lcom/whoop/service/network/model/cycles/PostSleepDto;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;->during:Lcom/whoop/service/network/model/cycles/Period;

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;->timezoneOffset:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;->isNap:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/service/network/model/cycles/PostSleepDto;-><init>(Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public during(Lcom/whoop/service/network/model/cycles/Period;)Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;->during:Lcom/whoop/service/network/model/cycles/Period;

    return-object p0
.end method

.method public isNap(Z)Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;->isNap:Z

    return-object p0
.end method

.method public timezoneOffset(Ljava/lang/String;)Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;
    .locals 0

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;->timezoneOffset:Ljava/lang/String;

    return-object p0
.end method
