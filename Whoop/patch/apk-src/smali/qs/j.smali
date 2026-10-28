.class public final Lqs/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lqs/j;

.field public static final c:Lqs/j;

.field public static final d:Lqs/j;

.field public static final e:Lqs/j;

.field public static final f:Lqs/j;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqs/j;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lqs/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqs/j;->b:Lqs/j;

    new-instance v0, Lqs/j;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lqs/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqs/j;->c:Lqs/j;

    new-instance v0, Lqs/j;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lqs/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqs/j;->d:Lqs/j;

    new-instance v0, Lqs/j;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lqs/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqs/j;->e:Lqs/j;

    new-instance v0, Lqs/j;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lqs/j;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqs/j;->f:Lqs/j;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqs/j;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqs/j;->a:Ljava/lang/String;

    return-object v0
.end method
