.class public final Lat/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lat/u;

.field public static final c:Lat/u;

.field public static final d:Lat/u;

.field public static final e:Lat/u;

.field public static final f:Lat/u;

.field public static final g:Lat/u;


# instance fields
.field public final a:Lat/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lat/u;

    new-instance v1, Lkr/e;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    sput-object v0, Lat/u;->b:Lat/u;

    new-instance v0, Lat/u;

    new-instance v1, Lkr/e;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    sput-object v0, Lat/u;->c:Lat/u;

    new-instance v0, Lat/u;

    new-instance v1, Lkr/e;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    sput-object v0, Lat/u;->d:Lat/u;

    new-instance v0, Lat/u;

    new-instance v1, Lu00/e;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lu00/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    sput-object v0, Lat/u;->e:Lat/u;

    new-instance v0, Lat/u;

    new-instance v1, Lu00/e;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lu00/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    new-instance v0, Lat/u;

    new-instance v1, Lu00/e;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lu00/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    sput-object v0, Lat/u;->f:Lat/u;

    new-instance v0, Lat/u;

    new-instance v1, Lkr/e;

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    invoke-direct {v0, v1}, Lat/u;-><init>(Lat/v;)V

    sput-object v0, Lat/u;->g:Lat/u;

    return-void
.end method

.method public constructor <init>(Lat/v;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lks/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lat/t;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lat/t;-><init>(Lat/v;I)V

    iput-object v0, p0, Lat/u;->a:Lat/t;

    return-void

    :cond_0
    const-string v0, "java.vendor"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "The Android Project"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lat/t;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lat/t;-><init>(Lat/v;I)V

    iput-object v0, p0, Lat/u;->a:Lat/t;

    return-void

    :cond_1
    new-instance v0, Lat/t;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lat/t;-><init>(Lat/v;I)V

    iput-object v0, p0, Lat/u;->a:Lat/t;

    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    const-string v0, "RSA"

    iget-object v1, p0, Lat/u;->a:Lat/t;

    invoke-virtual {v1, v0}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
