.class public final Lg53/j;
.super Lg53/k;
.source "SourceFile"


# static fields
.field public static final a:Lg53/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg53/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg53/j;->a:Lg53/j;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected.InactiveWS"

    return-object v0
.end method
