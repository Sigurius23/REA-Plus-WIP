.class public final Ld63/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly53/d;


# static fields
.field public static final a:Ld63/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld63/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld63/a;->a:Ld63/a;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WebSocketCapability"

    return-object v0
.end method
