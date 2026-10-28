.class public final Lcg/s;
.super Lcg/t;
.source "SourceFile"


# static fields
.field public static final d:Lcg/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcg/s;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcg/t;-><init>(I)V

    sput-object v0, Lcg/s;->d:Lcg/s;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "QueryParameters"

    return-object v0
.end method
