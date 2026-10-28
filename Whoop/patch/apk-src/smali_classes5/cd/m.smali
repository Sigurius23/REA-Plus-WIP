.class public final Lcd/m;
.super Lcd/n;
.source "SourceFile"


# static fields
.field public static final b:Lcd/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcd/m;->b:Lcd/m;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "UserCredentialsChanged"

    return-object v0
.end method
