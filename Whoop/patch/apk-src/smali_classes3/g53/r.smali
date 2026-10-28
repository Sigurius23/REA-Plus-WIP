.class public final Lg53/r;
.super Lg53/x;
.source "SourceFile"


# static fields
.field public static final a:Lg53/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg53/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg53/r;->a:Lg53/r;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NetworkNotAvailable"

    return-object v0
.end method
