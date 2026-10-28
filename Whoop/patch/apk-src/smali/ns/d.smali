.class public final Lns/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lns/d;

.field public static final c:Lns/d;

.field public static final d:Lns/d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lns/d;

    const-string v1, "COMPRESSED"

    invoke-direct {v0, v1}, Lns/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/d;->b:Lns/d;

    new-instance v0, Lns/d;

    const-string v1, "UNCOMPRESSED"

    invoke-direct {v0, v1}, Lns/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/d;->c:Lns/d;

    new-instance v0, Lns/d;

    const-string v1, "LEGACY_UNCOMPRESSED"

    invoke-direct {v0, v1}, Lns/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/d;->d:Lns/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns/d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lns/d;->a:Ljava/lang/String;

    return-object v0
.end method
