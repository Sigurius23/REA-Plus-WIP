.class public final Lcd/k;
.super Lcd/n;
.source "SourceFile"


# static fields
.field public static final b:Lcd/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcd/k;->b:Lcd/k;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ServerError"

    return-object v0
.end method
