.class public final Lre/y;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/y;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/y;->b:Lre/y;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "WEB_AUTHN"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WebAuthn"

    return-object v0
.end method
