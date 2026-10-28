.class public final Lr7/i;
.super Lr7/j;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "KILOJOULES"

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    const-wide v0, 0x406de02efd793d03L    # 239.0057361

    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    const-string v0, "kJ"

    return-object v0
.end method
