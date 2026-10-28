.class public final Lre/d;
.super Lre/f;
.source "SourceFile"


# static fields
.field public static final a:Lre/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/d;->a:Lre/d;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "REFRESH_TOKEN_AUTH"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "RefreshTokenAuth"

    return-object v0
.end method
