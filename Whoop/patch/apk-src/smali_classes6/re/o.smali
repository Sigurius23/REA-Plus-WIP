.class public final Lre/o;
.super Lre/z;
.source "SourceFile"


# static fields
.field public static final b:Lre/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lre/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lre/o;->b:Lre/o;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "NEW_PASSWORD_REQUIRED"

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NewPasswordRequired"

    return-object v0
.end method
