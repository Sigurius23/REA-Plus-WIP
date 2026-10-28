.class public final Lre/n;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/n;->b:Lre/n;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "MFA_SETUP"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MfaSetup"

    return-object v0
.end method
