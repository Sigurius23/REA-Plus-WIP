.class public final Lre/m;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/m;->b:Lre/m;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "EMAIL_OTP"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmailOtp"

    return-object v0
.end method
