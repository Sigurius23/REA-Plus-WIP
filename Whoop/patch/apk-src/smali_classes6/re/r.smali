.class public final Lre/r;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/r;->b:Lre/r;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "PASSWORD_VERIFIER"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PasswordVerifier"

    return-object v0
.end method
