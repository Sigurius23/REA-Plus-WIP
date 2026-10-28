.class public final Lg53/e;
.super Lg53/k;
.source "SourceFile"


# static fields
.field public static final a:Lg53/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg53/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg53/e;->a:Lg53/e;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Disconnected.ByRequest"

    return-object v0
.end method
