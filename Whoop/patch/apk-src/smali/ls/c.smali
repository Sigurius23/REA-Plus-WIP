.class public final Lls/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lls/c;

.field public static final c:Lls/c;

.field public static final d:Lls/c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lls/c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lls/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lls/c;->b:Lls/c;

    new-instance v0, Lls/c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lls/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lls/c;->c:Lls/c;

    new-instance v0, Lls/c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lls/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lls/c;->d:Lls/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lls/c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lls/c;->a:Ljava/lang/String;

    return-object v0
.end method
