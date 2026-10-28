.class public final Lcd/h;
.super Lcd/n;
.source "SourceFile"


# static fields
.field public static final b:Lcd/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcd/h;->b:Lcd/h;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "InsufficientPermissions"

    return-object v0
.end method
