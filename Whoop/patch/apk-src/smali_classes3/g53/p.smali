.class public final Lg53/p;
.super Lg53/x;
.source "SourceFile"


# static fields
.field public static final a:Lg53/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg53/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg53/p;->a:Lg53/p;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NetworkAvailable"

    return-object v0
.end method
