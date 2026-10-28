.class public final Lg40/t3;
.super Lg40/w3;
.source "SourceFile"


# static fields
.field public static final b:Lg40/t3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg40/t3;

    new-instance v1, Lg40/f1;

    const v2, 0x7f140fce

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lg40/f1;-><init>(ILjava/util/List;)V

    invoke-direct {v0, v1}, Lg40/w3;-><init>(Lg40/h1;)V

    sput-object v0, Lg40/t3;->b:Lg40/t3;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b(ZZ)Z
    .locals 0

    return p2
.end method
