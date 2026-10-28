.class public final Lre/q;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/q;->b:Lre/q;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "PASSWORD_SRP"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PasswordSrp"

    return-object v0
.end method
