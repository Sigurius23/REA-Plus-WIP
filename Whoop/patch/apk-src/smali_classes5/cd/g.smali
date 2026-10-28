.class public final Lcd/g;
.super Lcd/n;
.source "SourceFile"


# static fields
.field public static final b:Lcd/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcd/g;->b:Lcd/g;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "AuthcodeExpired"

    return-object v0
.end method
