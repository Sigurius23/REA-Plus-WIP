.class public final Lcg/q;
.super Lcg/t;
.source "SourceFile"


# static fields
.field public static final d:Lcg/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcg/q;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcg/t;-><init>(I)V

    sput-object v0, Lcg/q;->d:Lcg/q;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Fragment"

    return-object v0
.end method
