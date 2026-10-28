.class public final Lg53/s;
.super Lg53/x;
.source "SourceFile"


# static fields
.field public static final a:Lg53/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg53/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg53/s;->a:Lg53/s;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "RequiredDisconnection"

    return-object v0
.end method
