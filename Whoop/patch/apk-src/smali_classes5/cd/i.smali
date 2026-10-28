.class public final Lcd/i;
.super Lcd/n;
.source "SourceFile"


# static fields
.field public static final b:Lcd/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcd/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcd/i;->b:Lcd/i;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "InvalidRequest"

    return-object v0
.end method
