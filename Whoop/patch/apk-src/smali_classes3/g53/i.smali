.class public final Lg53/i;
.super Lg53/k;
.source "SourceFile"


# static fields
.field public static final a:Lg53/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg53/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg53/i;->a:Lg53/i;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected.Stopped"

    return-object v0
.end method
