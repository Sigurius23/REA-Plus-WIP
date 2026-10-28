.class public final Lre/l;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/l;->b:Lre/l;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "DEVICE_SRP_AUTH"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DeviceSrpAuth"

    return-object v0
.end method
