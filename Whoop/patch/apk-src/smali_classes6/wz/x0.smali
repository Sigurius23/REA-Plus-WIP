.class public final Lwz/x0;
.super Lwz/e1;
.source "SourceFile"


# static fields
.field public static final d:Lwz/x0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwz/x0;

    const-string v1, "oauthConsent"

    invoke-direct {v0, v1}, Lwz/e1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwz/x0;->d:Lwz/x0;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lwz/x0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, 0x6429a28a

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "OAuthConsent"

    return-object v0
.end method
