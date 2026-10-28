.class public final Lre/x;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/x;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/x;->b:Lre/x;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "SOFTWARE_TOKEN_MFA"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SoftwareTokenMfa"

    return-object v0
.end method
