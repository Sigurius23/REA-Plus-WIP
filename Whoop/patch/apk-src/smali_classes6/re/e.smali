.class public final Lre/e;
.super Lre/f;
.source "SourceFile"


# static fields
.field public static final a:Lre/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/e;->a:Lre/e;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "USER_PASSWORD_AUTH"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "UserPasswordAuth"

    return-object v0
.end method
