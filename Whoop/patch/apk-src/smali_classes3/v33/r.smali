.class public final Lv33/r;
.super Lv33/w;
.source "SourceFile"


# static fields
.field public static final a:Lv33/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv33/r;

    invoke-direct {v0}, Lio/getstream/android/video/generated/models/VideoEvent;-><init>()V

    sput-object v0, Lv33/r;->a:Lv33/r;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lv33/r;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x20fdf7ae

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ParticipantMigrationCompleteEvent"

    return-object v0
.end method
