.class public final Lre/w;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/w;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/w;->b:Lre/w;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "SMS_OTP"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SmsOtp"

    return-object v0
.end method
