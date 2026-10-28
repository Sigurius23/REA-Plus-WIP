.class public Lcom/whoop/service/network/model/cycles/PostSleepDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;
    }
.end annotation


# instance fields
.field during:Lcom/whoop/service/network/model/cycles/Period;

.field isNap:Z

.field timezoneOffset:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto;->during:Lcom/whoop/service/network/model/cycles/Period;

    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto;->timezoneOffset:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/whoop/service/network/model/cycles/PostSleepDto;->isNap:Z

    return-void
.end method

.method public static builder()Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;
    .locals 1

    new-instance v0, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;

    invoke-direct {v0}, Lcom/whoop/service/network/model/cycles/PostSleepDto$PostSleepDtoBuilder;-><init>()V

    return-object v0
.end method
