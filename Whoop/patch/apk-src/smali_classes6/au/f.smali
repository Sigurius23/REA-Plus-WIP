.class public final Lau/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lau/e;


# direct methods
.method public constructor <init>(Lau/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lau/f;->a:Lau/e;

    return-void
.end method

.method public static a()Lro/i;
    .locals 2

    new-instance v0, Lro/i;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lro/i;-><init>(I)V

    const/4 v1, 0x0

    iput-object v1, v0, Lro/i;->x:Ljava/lang/Object;

    return-object v0
.end method
