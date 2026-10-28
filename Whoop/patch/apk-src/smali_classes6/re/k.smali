.class public final Lre/k;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/k;->b:Lre/k;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "DEVICE_PASSWORD_VERIFIER"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DevicePasswordVerifier"

    return-object v0
.end method
